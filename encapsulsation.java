class Human{
    private String name; 
    private int age;
    
    public Human(int age, String name){   //parameterized constructor
        this.age = age;
        this.name = name;
    }
    public void setName(String name){       //setter method
        this.name = name;
    }
    public String getName(){               //getter method
        return name;
    }
    public void setAge(int age){        // to get this constructor and getter and setter methods we have to 
        this.age = age;                //do right click and select source actions and then generate getter 
    }                                  // and setter methods and then select the variables for which we
                                       //  want to generate getter and setter methods

    public int getAge(){
        return age;
    }

}

public class encapsulsation {
    public static void main (String[] args){
        Human h1 = new Human(25, "Dinesh");
        System.out.println("Name: " + h1.getName());
        System.out.println("Age: " + h1.getAge());
        h1.setName("Virat");
        System.out.println("Updated Name: " + h1.getName());
        h1.setAge(30);
        System.out.println("Updated Age: " + h1.getAge());
    }
}
