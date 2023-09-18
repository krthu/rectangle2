import java.util.HashMap;

public class Rectangle {
    private int x;
    private int y;
    private double width;
    private double height;

    public Rectangle(int x, int y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public Rectangle(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public double calculateArea(){
        return width*height;
    }

    public double calculatePerimeter(){
        return width * 2 + height * 2;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean checkCollision(Rectangle rectangle){
        if (this.x > rectangle.getRightMostX() || rectangle.x > this.getRightMostX()){
            return false;
        } else if (this.y < rectangle.getLowestY() || rectangle.y < this.getLowestY()) {
            return false;
        }
        return true;
    }

    public double getRightMostX(){
        return (x + width);
    }

    public double getLowestY(){
        return (y - height);
    }



    public String toString(){
        return " x: " + x + " y: " + y + " width: " + width + " height: " + height;
    }


}


