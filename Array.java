class Student {
    int rollno; 
    String name;
    int marks;
}
public class Array {
    public static void main (String[] args){
        int a[]= {1,3,4,4};
        int b[]= new int [4];               //1D array
        int nums [][]= new int [4][4];     //2D array 
        System.out.println("value of b : ");
        for (int i=0;i<a.length;i++){
            b[i]=a[i]*10;
            System.out.print(b[i]+ " ");
        }
        System.out.println(); 
        System.out.println("value of nums:");
        for (int i=0;i<nums.length;i++){   
            for (int j=0;j<nums.length;j++){
                nums [i][j]=a[i]+b[j];
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.println(); 
        System.out.println("value of c:");
        int c[][]= new int [3][];   //jagged array 
        c[0]= new int [4];
        c[1]= new int [3];
        c[2]= new int [5];
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c[i].length;j++){
                c[i][j]=(int) (Math.random()*10);  //random number generator
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        Student s1 = new Student();
        s1.rollno=1; 
        s1.name = "Ram"; 
        s1.marks=90; 
        
        Student s2 = new Student();
        s2.rollno=2; 
        s2.name = "Shyam"; 
        s2.marks=85; 
        
        Student s3 = new Student();
        s3.rollno=3; 
        s3.name = "Mohan"; 
        s3.marks=80; 

        Student students[] = new Student [3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println("Student details:");
        for (Student n : students){
            System.out.println (n.rollno + " : " + n.name + " : " + n.marks);
        }
    
    }
}
