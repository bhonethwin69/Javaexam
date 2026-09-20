public abstract class Shape {
   public String loc;

   public Shape(String loc) {
      super();
      this.loc = loc;
   }

   public abstract void calculateArea();
}
