import java.util.ArrayList;
import java.util.List;

public class InsertionSortDemo {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(24);
        list.add(9);
        list.add(1);
        list.add(50);

        InsertionSortDemo insertionSortDemo = new InsertionSortDemo();
        insertionSortDemo.sort(list);
        System.out.println(list);
        //2,24,9,1,50
    }

    private void sort(List<Integer> list){

        if(list.size() <= 1) return;

        for(int i = 1; i<list.size();i++){

            int temp = list.get(i);

            for(int j = i-1; j>=0; j--){

                if(list.get(j) > temp){
                    //shift right.
                    list.set(j+1,list.get(j));
                }
                else{
                    //place it here. one step next.
                    list.set(j+1,temp);
                    break;
                }

                if(j==0){
                    list.set(0,temp);
                    break;
                }
            }
        }
    }
}
