import java.util.Scanner;

public class cde {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fres = 0;

        for(int i = 1;i<n;i++)
        {
            if(n%i==0)
            {
                fres = fres + i;
            }
        }
        if(fres == n)
            System.out.println("Perfect number");
        else
            System.out.println("Ain't perfect");
    }
    }
    
