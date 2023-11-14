public class Vector3DArray {
    private Vector3D[] arr;

    Vector3DArray(int s) {
        this.arr = new Vector3D[s];
        for (int i = 0; i < s; i++) {
            this.arr[i] = new Vector3D();
        }
    }

    public int length() {
        return arr.length;
    }

    public void changeI(int i, Vector3D a) {
        this.arr[i].setX(a.getX());
        this.arr[i].setY(a.getY());
        this.arr[i].setZ(a.getZ());
    }

    public double maxVectorLength() {
        double max = 0;
        for (Vector3D i : arr) {
            if (i.length() > max) {
                max = i.length();
            }
        }
        return max;
    }

    public int iOfVector(Vector3D a) {
        for (int i = 0; i < length(); i++) {
            if(a.equal(arr[i])){
              return i;
            }
        }
        return -1;
    }

    public Vector3D vectorSum(){
        Vector3D sum = new Vector3D();
        Vector3DProcessor a = new Vector3DProcessor();
        for (Vector3D i:arr) {
            sum = a.sum(sum,i);
        }
        return sum;
    }

    public Vector3D linKomb(double[] b){
        Vector3D sum = new Vector3D();
        if(arr.length!=b.length){
            return sum;
        }
        Vector3DProcessor a = new Vector3DProcessor();
        for (int i = 0; i < length(); i++) {
            sum = a.sum(sum,a.mult(arr[i],b[i]));
        }
        return sum;
    }

    public Point3D[] P(Point3D a) {
        Point3D[] mas = new Point3D[arr.length + 1];
        mas[0]=a;
        for (int i = 1; i < mas.length; i++) {
            mas[i] = new Point3D();
        }
        for (int i = 1 ; i < arr.length + 1; i++) {
            mas[i].setX(arr[i-1].getX()+mas[i-1].getX());
            mas[i].setY(arr[i-1].getY()+mas[i-1].getY());
            mas[i].setZ(arr[i-1].getZ()+mas[i-1].getZ());
        }
        return mas;
    }

    public void printVectorArray(){
        for(Vector3D i:arr) {
            i.printVector();
            System.out.print(" ");
        }
    }
}
