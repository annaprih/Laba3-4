package by.belstu.it.prykhach.touristPackage;

import java.util.ArrayList;

import static by.belstu.it.prykhach.Main.log1;

/**
 * Created by Anna on 11.02.2017.
 */
public class Cruise extends TouristPackage {
    public Cruise() {
        log1.info("Создание объекта круиз");
        transports = new ArrayList<Transport>();
        nameTourPack = "Cruise";
        typeOfFood = "AI";
        hotelName = "GazalaGardens";
        country = "Egypt";
        transports.add(Transport.Rain);
        transports.add(Transport.Air);
        numberOfDays = 15;
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
