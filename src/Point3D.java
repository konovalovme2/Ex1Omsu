import java.util.Objects;

public class Point3D {
    private double x;
    private double y;
    private double z;

    Point3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    Point3D(double a, double b, double c){
        this.x=a;
        this.y=b;
        this.z=c;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }

    public void setX(double a){this.x = a;}
    public void setY(double a){
        this.y = a;
    }
    public void setZ(double a){
        this.z = a;
    }

    /*@Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D point3D)) return false;
        return Double.compare(getX(), point3D.getX()) == 0 && Double.compare(getY(), point3D.getY()) == 0 && Double.compare(getZ(), point3D.getZ()) == 0;
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }*/

    public void printPoint(){
        System.out.println("("+x+","+y+","+z+")");
    }
}

