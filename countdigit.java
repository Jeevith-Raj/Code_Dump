public class countdigit {
    public static void main(String[] args) {
        int N = 22074;
        int m = N;
        int b =0;
        int flag =0;
        while(m!=0)
        {
            b = m%10;
            System.out.println("this is b"+b);
            if(b==0)
            {
                m = m/10;
            }

            if(N%b==0)
            {
                flag++;
            }
            m = m/10;

        }
        System.out.println(flag);
    }

}
