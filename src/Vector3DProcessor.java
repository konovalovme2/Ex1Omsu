public class Vector3DProcessor {

    public Vector3D sum(Vector3D a, Vector3D b){
        Vector3D c = new Vector3D();
        c.setX(a.getX()+b.getX());
        c.setY(a.getY()+b.getY());
        c.setZ(a.getZ()+b.getZ());
        return c;
    }

    public Vector3D minus(Vector3D a, Vector3D b){
        Vector3D c = new Vector3D();
        c.setX(a.getX()-b.getX());
        c.setY(a.getY()-b.getY());
        c.setZ(a.getZ()-b.getZ());
        return c;
    }

    public double dotProduct(Vector3D a, Vector3D b){
        return a.getX()*b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ();
    }

    public Vector3D vectorProduct(Vector3D a, Vector3D b){
        Vector3D c = new Vector3D();
        c.setX(a.getY()*b.getZ()-a.getZ()*b.getY());
        c.setY(a.getZ()*b.getX()-a.getX()*b.getZ());
        c.setZ(a.getX()*b.getY()-a.getY()*b.getX());
        return c;
    }

    public boolean collinearity(Vector3D a, Vector3D b){
        return this.vectorProduct(a,b).length()==0;
    }

    public Vector3D mult(Vector3D a, double i){
        Vector3D c = new Vector3D();
        c.setX(a.getX()*i);
        c.setY(a.getY()*i);
        c.setZ(a.getZ()*i);
        return c;
    }
}
