package Java;

public class Pen {
    private String color; // Private values can be acess within the class
    public boolean clickable; // You can access it anywhere just you need to import this 
    protected String brand = "Parker"; // Within the same package and the class inheriting it
    String penType; // Within the same package 



    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.color);
    }
}
