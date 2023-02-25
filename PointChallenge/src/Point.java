// Calculate the distance from point a to point b

public class Point {
  private int x;
  private int y;


  public Point() {
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance() {
    return Math.sqrt(Math.pow(getX(), 2) + (Math.pow(getY(), 2)));
  }

  public double distance(int x, int y) {
    return Math.sqrt(Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2));
  }

  public double distance(Point point) {
    return distance(point.getX(), point.getY());
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }


}
