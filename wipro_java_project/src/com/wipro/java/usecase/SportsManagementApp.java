package com.wipro.java.usecase;

import java.util.*;
import java.util.stream.Collectors;

// Abstract Class (Abstraction)
abstract class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Abstract Method for Displaying Details
    public abstract void displayDetails();
}

// Player Class (Inheritance, Polymorphism)
class Player extends Person {
    private String sport;
    private int ranking;

    // Constructor
    public Player(String name, int age, String sport, int ranking) {
        super(name, age);
        this.sport = sport;
        this.ranking = ranking;
    }

    // Overridden method (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("Player: " + getName() + ", Age: " + getAge() + ", Sport: " + sport + ", Ranking: " + ranking);
    }

    public String getSport() { return sport; }
    public int getRanking() { return ranking; }
}

// Coach Class (Inheritance, Polymorphism)
class Coach extends Person {
    private String specialization;

    // Constructor
    public Coach(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Overridden method (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("Coach: " + getName() + ", Age: " + getAge() + ", Specialization: " + specialization);
    }

    public String getSpecialization() { return specialization; }
}

// SportsManagement Class (Uses Collections & Java 8 Features)
class SportsManagement {
    private List<Player> players;
    private List<Coach> coaches;
    private Map<String, List<Player>> sportsPlayersMap;

    // Constructor
    public SportsManagement() {
        players = new ArrayList<>();
        coaches = new ArrayList<>();
        sportsPlayersMap = new HashMap<>();
    }

    // Add Player
    public void addPlayer(Player player) {
        players.add(player);
        sportsPlayersMap.putIfAbsent(player.getSport(), new ArrayList<>());
        sportsPlayersMap.get(player.getSport()).add(player);
    }

    // Add Coach
    public void addCoach(Coach coach) {
        coaches.add(coach);
    }

    // Display All Players
    public void displayAllPlayers() {
        System.out.println("\nAll Players:");
        players.forEach(Player::displayDetails);
    }

    // Display Players by Sport (Java 8 Streams)
    public void displayPlayersBySport(String sport) {
        System.out.println("\nPlayers in " + sport + ":");
        sportsPlayersMap.getOrDefault(sport, Collections.emptyList())
            .forEach(Player::displayDetails);
    }

    // Display Coaches
    public void displayAllCoaches() {
        System.out.println("\nAll Coaches:");
        coaches.forEach(Coach::displayDetails);
    }

    // Find Top Ranked Players (Java 8 Streams)
    public void displayTopPlayers(int topN) {
        System.out.println("\nTop " + topN + " Players:");
        players.stream()
            .sorted(Comparator.comparingInt(Player::getRanking)) // Sort by ranking (ascending)
            .limit(topN)
            .forEach(Player::displayDetails);
    }

    // Find Coach by Specialization (Java 8 Optional)
    public void findCoachBySpecialization(String specialization) {
        Optional<Coach> coach = coaches.stream()
            .filter(c -> c.getSpecialization().equalsIgnoreCase(specialization))
            .findFirst();

        coach.ifPresentOrElse(
            Coach::displayDetails,
            () -> System.out.println("No coach found for specialization: " + specialization)
        );
    }
}

// Main Class
public class SportsManagementApp {
    public static void main(String[] args) {
        SportsManagement sm = new SportsManagement();

        // Adding Players
        sm.addPlayer(new Player("Roger Federer", 40, "Tennis", 1));
        sm.addPlayer(new Player("Cristiano Ronaldo", 38, "Football", 2));
        sm.addPlayer(new Player("Virat Kohli", 35, "Cricket", 3));
        sm.addPlayer(new Player("Usain Bolt", 36, "Athletics", 4));

        // Adding Coaches
        sm.addCoach(new Coach("Alex Ferguson", 78, "Football"));
        sm.addCoach(new Coach("Ravi Shastri", 60, "Cricket"));
        sm.addCoach(new Coach("Patrick Mouratoglou", 52, "Tennis"));

        // Display Players & Coaches
        sm.displayAllPlayers();
        sm.displayAllCoaches();

        // Display Players by Sport
        sm.displayPlayersBySport("Football");
        sm.displayPlayersBySport("Tennis");

        // Display Top Ranked Players
        sm.displayTopPlayers(3);

        // Find a Coach by Specialization
        sm.findCoachBySpecialization("Tennis");
        sm.findCoachBySpecialization("Basketball");
    }
}

