package DSA;

import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args){
        int [] nums ={12,34,56,76,87,97,45,26,74,64};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element you want to search in the Array nums:");
        int SearchedElement=sc.nextInt();
        int location;
        int found=0;
        findMax(nums);

        for (int i=0; i<nums.length;i++){
            if (SearchedElement== nums[i]){
                location=i;
                found=1;
                System.out.println("Searched Element "+ SearchedElement+" found at index :"+location);
                break;
            }

        }
        if(found==0){
            System.out.println("Element not found.");
        }
        
        sc.close();
        findMax(nums);
        findMin(nums);
        
    }
    static void findMax(int []arr){
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

    System.out.println("The Max Element is : "+ max);
    }
    static void findMin(int []arr){
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("The Max Element is : "+ min);

    }
}