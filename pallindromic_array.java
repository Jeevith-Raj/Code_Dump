import java.util.Scanner;
public class pallindromic_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {111,222,332};
        int flag =1;
        for(int i =0;i<arr.length;i++)
        {
            int n = pall(arr[i]);
            if(n!=flag)
            {
                flag =0;
            }

        }
        System.out.println(flag);


    }
    static int pall(int j)
    {
        int test =j;
        int n = 0;
        while(j!=0)
        {
            n = n*10;
            n = n+ j%10;
            j = j/10;
        }
        if(test == n)
        {
            return 1;
        }
        else
            return 0;

    }
}
