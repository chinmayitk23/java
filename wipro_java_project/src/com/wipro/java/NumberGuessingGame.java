package com.wipro.java;

import java.sql.*;
import java.util.*;

public class NumberGuessingGame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/game";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Chinmayi@23";
    
    public static void initializeDB() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); 
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS players ("
                       + "id INT AUTO_INCREMENT PRIMARY KEY,"
                       + "name VARCHAR(255) UNIQUE,"
                       + "best_score INT)";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static int getBestScore(String name) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); 
             PreparedStatement stmt = conn.prepareStatement("SELECT best_score FROM players WHERE name = ?")) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("best_score");
            } else {
                try (PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO players (name, best_score) VALUES (?, 1000)")) {
                    insertStmt.setString(1, name);
                    insertStmt.executeUpdate();
                }
                return 1000;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 1000;
        }
    }
    
    public static void updateBestScore(String name, int score) {
        int bestScore = getBestScore(name);
        if (score < bestScore) {
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); 
                 PreparedStatement stmt = conn.prepareStatement("UPDATE players SET best_score = ? WHERE name = ?")) {
                stmt.setInt(1, score);
                stmt.setString(2, name);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Guess a number between 1 and 100");
        int guess = -1;
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
            }
        }
        
        updateBestScore(name, attempts);
        System.out.println("Your best score: " + getBestScore(name));
    }
    
    public static void main(String[] args) {
        initializeDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            playGame();
            System.out.print("Do you want to play again? (yes/no): ");
            if (!scanner.next().trim().equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }
}
