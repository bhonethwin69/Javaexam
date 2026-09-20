import java.util.Scanner;

public class ShowResult {
   public static void main(String[] args) {
      Square sq = new Square("Square", 4, 4);
      System.out.println("I am in " + sq.loc + " Class");
      System.out.println("The length of Square is: " + sq.getLength());
      System.out.println("The width of Square is: " + sq.getWidth());
      sq.calculateArea();
      System.out.println("***********************End of Square***********************");

      Triangle tri = new Triangle("Triangle", 3, 5);
      System.out.println("I am in " + tri.loc + " Class");
      System.out.println("The base of Triangle is: " + tri.getBase());
      System.out.println("The height of Triangle is: " + tri.getHeight());
      tri.calculateArea();
      System.out.println("***********************End of Triangle***********************");

      Circle c = new Circle("Circle", 3);
      System.out.println("I am in " + c.loc + " Class");
      System.out.println("The height of Circle is: " + c.getRadius());
      c.calculateArea();
      System.out.println("***********************End of Circle***********************");
   }
}
