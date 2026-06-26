class Student{
    private int rollno;
    private String name;
    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(String name,int rollno) {
        this.rollno = rollno;
        this.name = name;
    }
}      

class abc{
    public static void main(String [] args){
        System.out.println("HELLO WORLD");
        Student S1= new Student("Ram",122);
        System.out.println(S1.getName());                                                                                   
        System.out.println(S1.getRollno());
        S1.setName("Shyam");
        System.out.println(S1.getName());
    }
}