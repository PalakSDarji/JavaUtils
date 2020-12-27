import java.util.*;

public class Practice1 {

    static Comparator<String> c = (s1, s2) -> {
      return s1.length() - s2.length();
    };

    public static void main(String[] args){

        LinkedList<String> ll = new LinkedList<>();
        Deque<String> dq = new ArrayDeque<>();
        PriorityQueue<String> pq = new PriorityQueue<>(c);

        ll.offer("a");
        ll.offer("b");
        ll.offer("c");


        dq.offerFirst("a");
        dq.offerFirst("b");
        dq.offerFirst("c");
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);

        System.out.println("-------------" + pq.size());

        pq.offer("palak");
        System.out.println(pq.size());

        pq.offer("darji");
        System.out.println(pq.size());

        pq.offer("f");
        System.out.println(pq.size());

        pq.offer("a");
        System.out.println(pq.size());

        System.out.println(pq);

        System.out.println();
        for(String s : pq){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
