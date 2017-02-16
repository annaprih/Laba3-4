package by.belstu.it.prykhach.TourAgent;

import by.belstu.it.prykhach.touristPackage.TouristPackage;

/**
 * Created by Anna on 11.02.2017.
 */
public interface ITourAgent {
    TouristPackage cruisePackage();
    TouristPackage excursionPackage();
    TouristPackage restPackage();
    TouristPackage shoppingPackage();
    TouristPackage therapyPackage();

}
