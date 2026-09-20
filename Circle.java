public class Circle extends Shape {
   public int radius;

   public Circle(String loc, int radius) {
      super(loc);
      this.radius = radius;
   }

   public int getRadius() {
      return radius;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   @Override
   public void calculateArea() {
      double area = Math.PI * radius * radius;
      System.out.println("The Area of Circle is: " + area);
   }
}
