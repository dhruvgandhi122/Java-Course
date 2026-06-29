package DSA;

import java.util.Scanner;

public class BinarySearch {
    public static void main (String[]args){
        int nums[]={12,34,55,65,74,85,95,100,545,855};
        int n=nums.length;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        BinarySearching(nums,n,target);
        sc.close();
    }

    static void BinarySearching(int arr[],int n,int target){
        
        int beg=0;
        int end=n-1;
        int location=-1;
        while(beg<=end){
            int mid=(end+beg)/2;
            if (target>arr[mid]){
                beg=mid+1;
                
            }else if (target<arr[mid]){
                end=mid-1;
            }
            else if (target==arr[mid]){
                location = mid;
                System.out.println("Searched Element "+target+" found at index :"+location);
                break;
            }
        } 
        if (location==-1){
            System.out.println("Element Not Found.");
        }        
    }
    
}
