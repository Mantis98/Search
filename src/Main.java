import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Data person1 = new Data("Adnrew", "Scott", 98021304973L);
        Data person2 = new Data("Adam", "Driver", 94857436721L);
        Data person3 = new Data("Elisabeth", "Bach", 78473615843L);
        Data person4 = new Data("Daniel", "Watson", 74859400032L);
        Data person5 = new Data("Alexandra", "Bag", 12938473627L);

        LinkedList<String> namesLinkedList = new LinkedList<>();

        namesLinkedList.add("John");
        namesLinkedList.add("Bruce");
        namesLinkedList.add("Andrew");
        namesLinkedList.add("Sandie");

        String show = namesLinkedList.get(2);
        System.out.println(show);

        namesLinkedList.add(1, "Jennifer");


        ArrayList<String> namesArrayList = new ArrayList<>();

        namesArrayList.add("Caroline");
        namesArrayList.add("Matthew");
        namesArrayList.add("Daniel");
        namesArrayList.add("Elizabeth");

        String show2 = namesArrayList.get(0);
        System.out.println(show2);




    }

}
