import java.util.HashMap;
 
public class main {
    public static void main(String[] args ){
        HashMap<Integer,String> m= new HashMap<>();
        m.put(101,"alice");
        m.put(102,"bob");
        System.out.println("the contains is: "+m);
        System.out.println("the size of the list is :"+m.size());
        System.out.println ("the 2nd value is:"+m.get(102));
        m.clear();
        System.out.println("after clearing :"+m);
    }
}
