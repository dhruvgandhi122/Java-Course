package DSA;

public class BubbleSort{
    public static void main(String[] args){
        int arr[]={4,2,5,3,7,1};
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Now printing the sorted array(Sorted using Bubble Sort:");
        for( int c:arr){
            System.out.print(c+" ");
        }
    }
    
}