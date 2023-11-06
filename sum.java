import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Starting Value");
        int start = in.nextInt();
        System.out.println("Ending Value");
        int end = in.nextInt();

        for(int i = start;i<=end;i++)
        {
            amstrong(i);
        }
    }
    private static void amstrong(int num) {
        int res = num;
        int sum =0;
        int count = count(num);
        while (num!=0){
            int digit = num%10;
            sum =  sum + mul(count,digit);
            num = num/10;
        }
        if(sum == res)
            System.out.println(res);
    }
    static int mul(int pow,int base)
    {
        int q = 1;
        for(int i = 1;i<=pow;i++)
        {
            q = q * base;
        }
        return q;
    }
    static int count(int num)
    {
        int flag =0;
        while(num!=0)
        {
            flag++;
            num = num/10;
        }
        return flag;
    }
}
