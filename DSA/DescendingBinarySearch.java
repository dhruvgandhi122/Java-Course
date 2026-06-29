package DSA;

import java.util.Scanner;

public class DescendingBinarySearch {
    public static void main(String[] args) {
        int nums[]={1112,900,545,212,115,98,54,46,32,21};
        int n=nums.length;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        DescBinarySearching(nums,n,target);
        
        sc.close();
    }
    static void DescBinarySearching(int arr[],int n,int target){
        
        int beg=0;
        int end=n-1;
        int location=-1;
        while(beg<=end){
            int mid=(end+beg)/2;
            if (target>arr[mid]){
                end=mid-1;
                
            }else if (target<arr[mid]){
                beg=mid+1;
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
