package by.belstu.it.prykhach.touristPackage;

import java.util.ArrayList;

/**
 * Created by Anna on 11.02.2017.
 */
abstract public class TouristPackage {
    protected String nameTourPack;
    protected String typeOfFood;
    protected String hotelName;
    protected String country;

    protected ArrayList<Transport> transports; //коллекция

    protected int numberOfDays;
    public String getNameTourPack() {
        return nameTourPack;
    }

    public ArrayList<Transport> getTransports() {
        return transports;
    }

    public void setTransports(ArrayList<Transport> transports) {
        this.transports = transports;
    }

    public void setNameTourPack(String nameTourPack) {
        this.nameTourPack = nameTourPack;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
