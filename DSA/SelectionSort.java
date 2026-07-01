package DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1};
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            int j;

            for(j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int c:arr){
            System.out.print(c+ " ");
        }
    }
    
}
