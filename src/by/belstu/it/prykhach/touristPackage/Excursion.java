package by.belstu.it.prykhach.touristPackage;

import java.util.ArrayList;

import static by.belstu.it.prykhach.Main.log1;

/**
 * Created by Anna on 11.02.2017.
 */
public class Excursion extends TouristPackage {
    public Excursion() {
        log1.info("Создание объекта экскурсия");
        transports = new ArrayList<Transport>();
        nameTourPack = "Excursion";
        typeOfFood = "HB";
        hotelName = "SunShine_Resort";
        country = "Italy";
        transports.add(Transport.Air);
        numberOfDays = 10;
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
