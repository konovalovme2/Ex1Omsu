public class Vector3D {
    private double x;
    private double y;
    private double z;

    Vector3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    Vector3D(double a, double b, double c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    Vector3D(Point3D a, Point3D b){
        this.x=b.getX() - a.getX();
        this.y=b.getY() - a.getY();
        this.z=b.getZ() - a.getZ();
    }

    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public boolean equal(Vector3D a){
        return this.x==a.x && this.y==a.y && this.z==a.z;
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

    public void setX(double a){
        this.x = a;
    }
    public void setY(double a){
        this.y = a;
    }
    public void setZ(double a){
        this.z = a;
    }

    public void printVector(){
        System.out.println("("+x+","+y+","+z+")");
    }
}
