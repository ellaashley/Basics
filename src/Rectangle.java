public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.length*this.width;
    }

    public double getDiagonal() {
        return Math.sqrt((this.length*this.length)+(this.width*this.width));
    }

    public boolean isSquare() {
        if(this.length == this.width){
            return true;
        }else{
            return false;
        }
    }
}
