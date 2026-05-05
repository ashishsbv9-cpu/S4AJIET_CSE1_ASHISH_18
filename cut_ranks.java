import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        int n = sc.nextInt();
        int[] ranks = new int[n];
        System.out.println("Enter " + n + " ranks:");
        for (int i = 0; i < n; i++) {
            ranks[i] = sc.nextInt();
        }
        int cuts = 0;
        int prevRank = ranks[0];  
        for (int i = 1; i < n; i++) {
            if (ranks[i] < prevRank) {
                cuts++;         
                prevRank = ranks[i]; 
            } else {
                prevRank = ranks[i]; 
            }
        }
        System.out.println("Number of ranks cut in the list: " + cuts);
    }
}
