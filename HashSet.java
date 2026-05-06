import java.util.HashSet;
 
public class main {
    public static void main(String[] args ){
        HashSet<Integer> ai= new HashSet<>();
        ai.add(2);
        ai.add(20);
        ai.add(10);
        System.out.println("the contains is: "+ai);
        System.out.println("the size of the list is :"+ai.size());
        System.out.println(ai.contains("10"));
        ai.remove(2);
        System.out.println("after removing the index 2: "+ai);       
        ai.clear();
        System.out.println("after clearing :"+ai);
    }
}
