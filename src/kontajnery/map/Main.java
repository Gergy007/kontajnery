package kontajnery.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        //v kontajneroch v jave moze byt len OBJEKT!!!
        List<Integer> cisla = new ArrayList<>();
        for (int i = 0; i < 10; ++i)
        {
            cisla.add(i);
        }
        for (Integer i : cisla)
        {
            System.out.print(i + " ");
        }
        cisla.forEach(i -> System.out.print(i + " "));
        cisla.removeIf(x -> x % 2 == 0);
        cisla.forEach(i -> System.out.print(i+" "));
        System.out.println(cisla.contains(2)); //zisti a vypise ci je 2 v liste
        System.out.println(cisla.size());
        cisla.replaceAll(x -> x+2);
        cisla.forEach(i -> System.out.print(i+" "));
        cisla.sort((x,y)->(x-y));
        cisla.forEach(i -> System.out.print(i+" "));
        Object [] pokus = cisla.toArray();
        System.out.println("");
        for(int i=0;i< pokus.length;++i)
        {
            System.out.println(pokus[i]);
        }
    }
}
