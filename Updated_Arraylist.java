import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
                list.add("Python");
        list.add("Java");
        list.add("Java");
        System.out.println("the array is :");
        System.out.println(list);
        System.out.println("The size of the Array is :"+list.size());
        list.remove(2);
        System.out.println("the Array after removeing the index number 2 is :");
        System.out.println(list);
       System.out.println("the index of the 0 in array is :"+list.get(0));
       list.addFirst("10");
       Collections.sort(list);
        System.out.println("the array after sorting in order :"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("the array after sorting in reverse order :"+list);
    }
}
