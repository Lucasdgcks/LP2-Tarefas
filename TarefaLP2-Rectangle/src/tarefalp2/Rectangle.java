package tarefalp2;

public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        this.setLength(1.0f);
        this.setWidth(1.0f);
    }
    
    public Rectangle(float l, float w){
        this.setLength(l);
        this.setWidth(w);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    public double getArea(){
        double area;
        area = this.getLength()* this.getWidth();
        return area;
    }
    
    public double getPerimeter(){
        double perimeter;
        perimeter = this.getLength()+ this.getWidth();
        return perimeter;
    }
    
    public void dados(){
        System.out.println("Length: " + this.getLength());
        System.out.println("Width: " + this.getWidth());
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
}

