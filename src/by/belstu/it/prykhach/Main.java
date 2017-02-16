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
        log1.info(cruise.toString());
        TouristPackage rest =   anya.restPackage();
        log1.info(rest.toString());
        TouristPackage therapy = anya.therapyPackage();
        log1.info(therapy.toString());
        TouristPackage shopping = anya.shoppingPackage();
        log1.info(shopping.toString());
        TouristPackage excursion = anya.excursionPackage();
        log1.info(excursion.toString());


        TouristPackage tour = anya.chooseTour();
    }
    catch(Exception ex){
        log1.error(ex.getMessage());
    }
    finally {
    log1.info("Programm close");
    }
    }
}
