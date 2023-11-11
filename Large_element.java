public class Large_element {
    public static void main(String[] args) {
        int[] arr = {6,5,4,7,1,8,2};
        int large = 0;

        for(int i =0;i< arr.length;i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        System.out.println(large);


    }
}
