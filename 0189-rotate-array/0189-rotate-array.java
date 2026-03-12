class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;

        k=k%n;

       rotateby(arr,0,n-1);
       rotateby(arr,0,k-1);
       rotateby(arr,k,n-1);

       
    }


    public static void rotateby(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;


            start++;
            end--;
        }
    }
}