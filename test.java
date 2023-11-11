public class test {
    public static void main(String[] args) {
        int j = 123;
        int n = 0;
        while(j!=0)
        {
            n = n*10;
            n = n+ j%10;
            j = j/10;

        }

        System.out.println(n);
        
    }
}
