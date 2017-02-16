package by.belstu.it.prykhach.TourAgent;

import by.belstu.it.prykhach.touristPackage.*;

import java.util.Scanner;

import static by.belstu.it.prykhach.Main.log1;

/**
 * Created by Anna on 11.02.2017.
 */
public class  AnyaTour implements ITourAgent {
    protected String nameOfTourAgent;
    protected String location;
    protected InfoOfAgent info;

    public InfoOfAgent getInfo() {
        return info;
    }

    public void setInfo(InfoOfAgent info) {
        this.info = info;
    }

    public String getNameOfTourAgent() {
        return nameOfTourAgent;
    }

    public void setNameOfTourAgent(String nameOfTourAgent) {
        this.nameOfTourAgent = nameOfTourAgent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public TouristPackage cruisePackage() {
        return new Cruise();
    }

    @Override
    public TouristPackage excursionPackage() {
        return new Excursion();
    }

    @Override
    public TouristPackage restPackage() {
        return new Rest();
    }

    @Override
    public TouristPackage shoppingPackage() {
        return new Shopping();
    }

    @Override
    public TouristPackage therapyPackage() {
        return new Therapy();
    }
    static private AnyaTour anya = new AnyaTour();
    private AnyaTour() {
        this.info = new InfoOfAgent();
        nameOfTourAgent = "AnyaTour";
        location = "Gerasimenko 58";
    }

    public static AnyaTour getAnya() {
        return anya;
    }

    public class InfoOfAgent
    {
        String name;
        String telephon;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTelephon() {
            return telephon;
        }

        public void setTelephon(String telephon) {
            this.telephon = telephon;
        }

        public InfoOfAgent() {
            this.name = "Anya";
            this.telephon = "+375-25-788-79-40";
        }
    }
    public TouristPackage chooseTour () throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип транспорта");
        Transport trans = Transport.valueOf(scanner.next());
        System.out.println("Введите тип питания");
        String foodR = scanner.next();
        System.out.println("Введите кол-во дней");
        int days = scanner.nextInt();

        if ((trans == Transport.Air || trans == Transport.Rain)&&
                ( foodR.equals("AI")) &&(days == 15)){
            log1.info("Найдена путевка круиз");
            return new Cruise();
        }
        else if ((trans == Transport.Rain)&&
                ( foodR.equals("BB")) &&(days == 6)){
            log1.info("Найдена путевка шоппинг");
            return new Shopping();
        }
        else if ((trans == Transport.Ship)&&
                ( foodR.equals("AI")) &&(days == 12)){
            log1.info("Найдена путевка терапия");
            return new Therapy();
        }
        else if ((trans == Transport.Bus)&&
                (foodR.equals("AI")) &&(days == 12)){
            log1.info("Найдена путевка отдых");
            return new Rest();
        }
        else if ((trans == Transport.Air )&&
                (foodR.equals("HB")) &&(days == 10)){
            log1.info("Найдена путевка экскурсия");
            return new Excursion();
        }
        else throw new Exception("Путевок по заданным параметрам не найдено!");

    }
}
