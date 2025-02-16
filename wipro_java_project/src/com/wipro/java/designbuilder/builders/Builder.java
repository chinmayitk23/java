package com.wipro.java.designbuilder.builders;
import com.wipro.java.designbuilder.cars.CarType;
import com.wipro.java.designbuilder.components.Engine;
import com.wipro.java.designbuilder.components.GPSNavigator;
import com.wipro.java.designbuilder.components.Transmission;
import com.wipro.java.designbuilder.components.TripComputer;


/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}