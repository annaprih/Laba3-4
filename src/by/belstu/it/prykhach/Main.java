package by.belstu.it.prykhach;

import by.belstu.it.prykhach.TourAgent.AnyaTour;
import by.belstu.it.prykhach.touristPackage.TouristPackage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static {
        new DOMConfigurator().doConfigure("Log4j/Log4j.xml", LogManager.getLoggerRepository());
    }
    static public final Logger log1 = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        try{
        AnyaTour anya =  AnyaTour.getAnya();
        TouristPackage cruise =  anya.cruisePackage();
        log1.info(cruise);
        TouristPackage rest =   anya.restPackage();
        log1.info(rest);
        TouristPackage therapy = anya.therapyPackage();
        log1.info(therapy);
        TouristPackage shopping = anya.shoppingPackage();
        log1.info(shopping);
        TouristPackage excursion = anya.excursionPackage();
        log1.info(excursion);


        TouristPackage tour = anya.chooseTour();
        TouristPackage tours = anya.chooseTour_1();

    }
    catch(Exception ex){
        log1.error(ex.getMessage());
    }
    finally {
    log1.info("Programm close");
    }
    }
}
