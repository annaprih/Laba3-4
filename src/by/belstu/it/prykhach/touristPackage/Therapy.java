package by.belstu.it.prykhach.touristPackage;

import java.util.ArrayList;

import static by.belstu.it.prykhach.Main.log1;

/**
 * Created by Anna on 11.02.2017.
 */
public class Therapy extends TouristPackage {
    public Therapy() {
        log1.info("Создание объекта терапия");
        transports = new ArrayList<Transport>();
        nameTourPack = "Therapy";
        typeOfFood = "AI";
        hotelName = "Xperience";
        country = "Egypt";
        transports.add(Transport.Ship);
        numberOfDays = 12;
    }
    @Override
    public String toString() {
        String str = nameTourPack + "  " + typeOfFood + " " + hotelName + " " + country + " " + numberOfDays;
        for(Transport i : transports)
        {
            str = str + " " + i;
        }
        return  str;
    }
}
