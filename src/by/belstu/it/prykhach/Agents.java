package by.belstu.it.prykhach;

import by.belstu.it.prykhach.touristPackage.*;

import java.util.ArrayList;

/**
 * Created by Anna on 23.02.2017.
 */
public class Agents {

    public ArrayList<TouristPackage> arrayList;
    public Agents()
    {
        arrayList = new ArrayList<TouristPackage>();

        arrayList.add(new Cruise());
        arrayList.add(new Cruise());
        arrayList.add(new Excursion());
        arrayList.add(new Rest());
        arrayList.add(new Shopping());
        arrayList.add(new Therapy());
        arrayList.add(new Shopping());
        arrayList.add(new Therapy());
        arrayList.add(new Rest());
    }


}
