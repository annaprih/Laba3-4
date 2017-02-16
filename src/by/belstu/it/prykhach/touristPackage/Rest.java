package by.belstu.it.prykhach.touristPackage;

import java.util.ArrayList;

import static by.belstu.it.prykhach.Main.log1;

/**
 * Created by Anna on 11.02.2017.
 */
public class Rest extends TouristPackage {
    public Rest() {
        log1.info("Создание объекта отдых");
        transports = new ArrayList<Transport>();
        nameTourPack = "Rest";
        typeOfFood = "AI";
        hotelName = "Hrisantema";
        country = "Bulgari";
        transports.add(Transport.Bus);
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
