package tarefalp2.ball;

public class Ball {
   private float x;
   private float y;
   private int radius;
   private float xDelta;
   private float yDelta;
   
   public Ball(float x, float y, int radius, float xDelta, float yDelta){
       this.setX(x);
       this.setY(y);
       this.setRadius(radius);
       this.setxDelta(xDelta);
       this.setyDelta(yDelta);
   }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    
    public void move(){
        this.setX(x += this.getxDelta());
        this.setY(y += this.getyDelta());
    }
    
    public void reflectHorizontal(){
        this.setxDelta(xDelta * -1);
    }
    
    public void reflectVertical(){
        this.setyDelta(yDelta * -1);
    }

    @Override
    public String toString() {
        return "Ball{" + "x=" + x + ", y=" + y + ", xDelta=" + xDelta + ", yDelta=" + yDelta + '}';
    }
   
   
}