import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[];
        arr = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the element to search");
        int s = in.nextInt();

        for(int i =0;i<5;i++)
        {
            if(s==arr[i])
                System.out.println(i);
        }
    /*
        for (int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }
    */


    }
}
