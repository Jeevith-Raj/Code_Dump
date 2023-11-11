import java.awt.*;
import java.util.Scanner;



public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your fav color?");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for(int i =1;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                max = arr[i+1];
                arr[i] = max;
                arr[i+1] = arr[i];
            }
        }

        for(int i =0 ;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
