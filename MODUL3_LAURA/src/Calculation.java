public class Calculation implements Runnable{
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public void setSquare(double side)throws IllegalArgumentException{
        if (side < 1){
            throw new IllegalArgumentException("Side input must be one or more than one");
        }
        this.area = side*side;
    }
    public double getSquare(){
        return this.area;
    }

    public void setCircle(double radius)throws IllegalArgumentException{
        if (radius < 1) {
            throw new IllegalArgumentException("Radius input must be one or more than one");
        }
        this.area = radius*radius*phi;

    }
    public double getCircle(){
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t)throws IllegalArgumentException{
        if (a < 1){
            throw new IllegalArgumentException("Side input must be one or more than one");
        }
        if (b < 1){
            throw new IllegalArgumentException("Side input must be one or more than one");
        }
        if (t < 1){
            throw new IllegalArgumentException("Height input must be one or more than one");
        }
        this.area = ((a+b)*t) / 2;
    }
    public double getTrapezoid(){
        return this.area;
    }
    @Override
    public void run(){
        System.out.println("Program Will Start in");
        for (int i = 3){

        }
    }
}
