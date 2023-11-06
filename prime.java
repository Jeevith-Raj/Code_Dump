import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = n;
        int fres=0;
        while(n!=0)
        {
            int m = n%10;
            fres = fres + fact(m);
            n = n/10;
        }

        if(fres==res)
            System.out.println("Strong number");
        else
            System.out.println("ain't strond");


    }
    static int fact(int n){
        int m = 1;
        while(n!=0)
        {
            m = m * n;
            n--;

        }return m;
    }
}
