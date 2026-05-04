class Main {
    public static void main(String[] args) {
        int n=20,k=2,j=3,m=12,p=12;
        if (n<=0||k<=0||j<=0||m<0||p<0) {
            System.out.println("INVALID INPUT");
            return;
        }
        int mb=m/k;
        if (m%k!=0)mb++;
        int mp=p/j;
        if (p%j!=0)mp++;
         int monkeysDown=mb+mp;
        int monkeysLeft =n-monkeysDown;
        if (monkeysLeft<0)monkeysLeft=0;
        System.out.println("Number of Monkeys left on the tree:" + monkeysLeft);
    }
}
