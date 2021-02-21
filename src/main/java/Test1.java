import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        //Type 1 of comparing two array lists.
        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("A", "Z", "X", "B", "C", "D", "F"));
        ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "J", "K","F"));
        ArrayList<String> al3 = new ArrayList<String>(Arrays.asList("A", "B","J", "K", "C", "D", "E", "F"));
        Collections.sort(al1);
        Collections.sort(al2);
        Collections.sort(al3);
        System.out.println(al1.equals(al2)); //output - false
        System.out.println(al2.equals(al3)); //output - true

        //Compare two arraylists, find out the additional elements
        ArrayList<String> al4 = new ArrayList<String>(Arrays.asList("A", "Z", "X", "B", "C", "D", "F"));
        ArrayList<String> al5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "J", "K","F"));
        al5.removeAll(al4);
        System.out.println(al5); // output - [E, J, K]

        //To retain the common elements.
        al1.retainAll(al2);
        System.out.println(al1); //output - [A, B, C, D, F]
    }
}
