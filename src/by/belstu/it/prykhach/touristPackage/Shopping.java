package by.belstu.it.prykhach.touristPackage;

import java.util.ArrayList;

import static by.belstu.it.prykhach.Main.log1;

/**
 * Created by Anna on 11.02.2017.
 */
public class Shopping extends TouristPackage {
    public Shopping() {
        log1.info("Создание объекта шоппинг");
        transports = new ArrayList<Transport>();
        nameTourPack = "Shopping";
        typeOfFood = "BB";
        hotelName = "ResortShop";
        country = "Grice";
        transports.add(Transport.Rain);
        numberOfDays = 6;
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
