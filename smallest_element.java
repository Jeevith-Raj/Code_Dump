public class smallest_element {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,4,8,1,9};
        int small = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<small)
                small = arr[i];
        }

        System.out.println(small);

    }
}
