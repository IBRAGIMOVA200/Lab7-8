package laba;
        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.io.*;
public class testnewlab {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        String[] st = new String[5];
        states.add("Denmark");
        states.add("Spain");
        states.add(1,"Amserdam");
        states.add("Polland");
        System.out.println(states.get(1));
        for(int i = 0;i<states.size();i++)System.out.println(states.get(i));

        /////////////////////////////////////
        System.out.println("////////////////////////");
        Object[] countries = states.toArray();
        for(Object count : countries){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
////////////////////////////////////////////////////////
        for (String it: states) System.out.println(it);
        LinkedList<String> vaze = new LinkedList<String>();
        vaze.add("Lemon");
        vaze.addFirst("Tomato");
        vaze.addLast("Corn");
        vaze.add(1,"Celery");
        for(String it:vaze){
            System.out.println(it);
        }
        String tmp = vaze.getFirst();
        System.out.println("first elem of list "+tmp);
        vaze.remove("pumpkin");
        for(String it:vaze){
            System.out.println(it);
        }
        ///////////////////////////////////////////////
        System.out.println("////////////////////////");
    }
}