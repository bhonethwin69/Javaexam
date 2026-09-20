public class Triangle extends Shape {
   public int base;
   public int height;

   public Triangle(String loc, int base, int height) {
      super(loc);
      this.base = base;
      this.height = height;
   }

   public int getBase() {
      return base;
   }

   public void setBase(int base) {
      this.base = base;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   @Override
   public void calculateArea() {
      double area = 0.5 * getBase() * getHeight();
      System.out.println("The Area of Triangle is: " + area);
   }
}
