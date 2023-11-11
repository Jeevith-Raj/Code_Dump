import java.util.Scanner;

public class kth_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {9,1,8,2,7,3,6,4,5};
        int temp=0;
        System.out.println("Enter the k th element to find");
        int n = in.nextInt();
        for(int i =0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.println("The k th element is "+a[n]);

    }
}
