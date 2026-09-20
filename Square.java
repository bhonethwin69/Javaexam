public class Square extends Shape {
   int length = 0;
   int width = 0;

   public Square(String loc, int length, int width) {
      super(loc);
      this.length = length;
      this.width = width;
   }

   public int getLength() {
      return length;
   }

   public void setLength(int length) {
      this.length = length;
   }

   public int getWidth() {
      return width;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   @Override
   public void calculateArea() {
      double area = getLength() * getWidth();
      System.out.println("The Area of Square is: " + area);
   }
}
