interface Computer {
    public void code();
}
class Desktop implements Computer {
    public void code() {
        System.out.println("Coding on Desktop");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding on Laptop");
    }
}
class Developer{
    public void develop(Computer lap){
        lap.code();
    }
}
public class Interface{
    public static void main(String[] args){
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        Developer dev = new Developer();
        dev.develop(desk);
        dev.develop(lap);
    }
}