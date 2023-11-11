public class swap_kth_element {
    public static void main(String[] args) {
        int n = 8;
        int k = 3;
        int[] arr = {1,2,3,4,5,6,7,8};
        int temp = 0;
        temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
