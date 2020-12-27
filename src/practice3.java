import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class practice3 {

    public static void main(String[] args){

        ArrayDeque<String> aq = new ArrayDeque<>();

        aq.offer("1");
        aq.offer("2");
        aq.offer("3");

        System.out.println(aq);
        System.out.println(aq.peekLast());
        System.out.println(aq.pollLast());
        System.out.println(aq);

        aq.offerFirst("0");
        System.out.println(aq);
    }
}
