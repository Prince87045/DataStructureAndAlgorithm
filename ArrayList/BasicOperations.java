package ArrayList;
import java.util.ArrayList;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);
        System.out.println(list);

        //Print reverse of ArrayList
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
