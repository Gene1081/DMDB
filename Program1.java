public class Program {
  /**
   * @param args
   */
  public static void main (String[] args) {
    Point point = new Point(100);
    System.out.print(point);
  }
}

class Point {
  private int x = 0;
  private int y = 0;

  public Point(int x,int y) {
    this.x = x;
    this.y = y;
  }

  public Point(int x) {
    this(x,x);
  }

  public String toString() {
    return "(x:" + this.x +",y:"+ this.y +")";
  }
}
