import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static double fact(double i){
        if(i<=1){
            return 1;
        }
        else{
            return i*fact(i-1);
        }
    }

    public static void main(String[] args) {
        //System.out.println("Hello,world!"); // пункт 1

//        double mul,mid; //пункт 2
//        double[] numbers = new double[3];
//        Scanner scan = new Scanner(System.in);
//        numbers[0]= scan.nextDouble();
//        numbers[1]= scan.nextDouble();
//        numbers[2]= scan.nextDouble();
//        mul = numbers[0] * numbers[1] * numbers[2];
//        mid = (numbers[0] + numbers[1] + numbers[2])/3;
//        for (int i = 0; i < 3; i++) {
//            for (int j = i+1; j < 3; j++) {
//                if(numbers[i]>numbers[j]){
//                    double r = numbers[i];
//                    numbers[i]=numbers[j];
//                    numbers[j]=r;
//                }
//            }
//        }
//
//        System.out.println(mul);
//        System.out.println(mid);
//        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " ");

//       double mul, mid; //пункт 3
//        int[] numbers = new int[3];
//        Scanner scan = new Scanner(System.in);
//        numbers[0] = scan.nextInt();
//        numbers[1] = scan.nextInt();
//        numbers[2] = scan.nextInt();
//        mul = numbers[0] * numbers[1] * numbers[2];
//        mid = (numbers[0] + numbers[1] + numbers[2]) / 3.;
//        for (int i = 0; i < 3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                if (numbers[i] > numbers[j]) {
//                    int r = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = r;
//                }
//            }
//        }
//
//        System.out.println(mul);
//        System.out.println(mid);
//        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " ");
//

//        double disc; // пункт 4
//
//        double[] numbers = new double[3];
//        Scanner scan = new Scanner(System.in);
//        numbers[0]= scan.nextDouble();
//        numbers[1]= scan.nextDouble();
//        numbers[2]= scan.nextDouble();
//
//        if (numbers[0] != 0) {
//            disc=(numbers[1] * numbers[1]) - 4 * numbers[0] * numbers[2];
//            if(disc<0){
//                System.out.println("No roots");
//            }
//            else if (disc>0){
//                double rootOne,rootTwo;
//                rootOne = ((-1)*numbers[1] + sqrt(disc))/(2*numbers[0]);
//                rootTwo = ((-1)*numbers[1] - sqrt(disc))/(2*numbers[0]);
//                System.out.println("Roots: " + rootOne + " " + rootTwo);
//            }
//            else{
//                double root;
//                root = ((-1)*numbers[1])/(2*numbers[0]);
//                System.out.println("Roots: " + root);
//            }
//        }
//        else if (numbers[1] != 0){
//            double root;
//            root = ((-1)*numbers[2])/numbers[1];
//            System.out.println("Roots: " + root);
//        }
//        else if (numbers[2] != 0){
//            System.out.println("No roots");
//        }
//        else{
//            System.out.println("Any");
//        }

//        double step, a, b,firstPoint,lastPoint; // пункт 5
//        Scanner scan = new Scanner(System.in);
//
//        a = scan.nextDouble();
//        b = scan.nextDouble();
//        step = scan.nextDouble();
//        if(step>0) {
//            firstPoint = min(a,b);
//            lastPoint = max(a,b);
//
//            for (double i = firstPoint; i < lastPoint; i+=step) {
//                System.out.println(i+": \t"+Math.sin(i));
//            }
//        } else if (step<0) {
//            firstPoint = max(a,b);
//            lastPoint = min(a,b);
//
//            for (double i = firstPoint; i > lastPoint; i+=step) {
//                System.out.println(i+": \t"+Math.sin(i));
//            }
//        }
//        else{
//            System.out.println("It is wrong data. Try to use other step ");
//        }

        /*
        00*x + 01*y = 02
        10*x + 11*y = 12
        */
        // пункт 6
//        Scanner scan = new Scanner(System.in);
//        double x,y;
//        double[][] linealEquation = new double[2][3];
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                linealEquation[i][j]=scan.nextDouble();
//            }
//        }
//
//        double r=linealEquation[0][0]*linealEquation[1][1] - linealEquation[1][0]*linealEquation[0][1];
//        if (r!=0){
//            x=(linealEquation[0][2]*linealEquation[1][1] - linealEquation[0][1]*linealEquation[1][2])/r;
//            y=(linealEquation[1][2]*linealEquation[0][0] - linealEquation[1][0]*linealEquation[0][2])/r;
//            System.out.println("x = "+x+" y = "+y);
//        }
//        else{
//            if((linealEquation[0][0]==0 && linealEquation[0][1]==0 && linealEquation[0][2]!=0) || (linealEquation[1][0]==0 && linealEquation[1][1]==0 && linealEquation[1][2]!=0)){
//                System.out.println("No ans");
//            }
//            else if((linealEquation[0][2]*linealEquation[1][1] - linealEquation[0][1]*linealEquation[1][2])==0 && (linealEquation[1][2]*linealEquation[0][0] - linealEquation[1][0]*linealEquation[0][2])==0){
//                System.out.println("Any");
//            }
//            else{
//                System.out.println("No ans");
//            }
//        }


        //пункт 7

        double e = 0.0, x, taylorPart, accuracy, i=0;
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        accuracy=scan.nextDouble();
        taylorPart = 1;
        while(taylorPart>=accuracy || taylorPart<=(-1)*accuracy){
            i++;
            e+=taylorPart;
            taylorPart = Math.pow(x,i)/fact(i);
            System.out.println(taylorPart);
        }
        System.out.println("Answer: " + e);

        //пункты 8-14

/*        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Massiv a = new Massiv();
        int[] mass = new int[n];
        a.enterMassiv(mass);
        a.printMassiv(mass);
        System.out.println("Sum of elements: " + a.sumMassiv(mass));
        System.out.println("Even numbers: " + a.numOfEvenNum(mass));

        int one,two;
        one = scan.nextInt();
        two = scan.nextInt();
        System.out.println("Numbers in interval: " + a.numInInterval(one,two,mass));
        System.out.println("Are all elements positive? " + a.areElementsPositive(mass));
        a.returnMassiv(mass);
        a.printMassiv(mass);*/

        //пункт 15
        /*int num1=1,num2=2,num3=3;

        Point3D a = new Point3D();
        Point3D b = new Point3D(num1,num2,num3);
        Point3D c = new Point3D();
        Point3D d = a;

        if(a==c){
            System.out.println("a & c: They are equel");
        }
        else{
            System.out.println("a & c: They are not equel");
        }

        if(a==d){
            System.out.println("a & d: They are equel");
        }
        else{
            System.out.println("a & d: They are not equel");
        }
        a.printPoint();
        b.printPoint();
        c.printPoint();
        d.printPoint();*/

        // пункт 16
        /*Point3D one = new Point3D(1,2,3);
        Point3D two = new Point3D(2,4,5);

        Vector3D a = new Vector3D();
        Vector3D b = new Vector3D(1,2,2);
        Vector3D c = new Vector3D(one,two);
        Vector3D d = new Vector3D(1,2,2);

        System.out.println("Lengths: " + a.length() + "," + b.length() + "," + c.length() + "," + d.length());
        if(b.equal(c)){
            System.out.println("b & c: They are equel");
        }
        else{
            System.out.println("b & c: They are not equel");
        }

        if(b.equal(d)){
            System.out.println("b & d: They are equel");
        }
        else{
            System.out.println("b & d: They are not equel");
        }*/

        //пункт 17
        /*Vector3DProcessor a = new Vector3DProcessor();
        Vector3D one;
        Vector3D two = new Vector3D(1,2,2);
        Vector3D tri = new Vector3D(1,2,2);

        one=a.sum(two,tri);
        System.out.println("("+one.getX()+","+one.getY()+","+one.getZ()+")");
        one=a.minus(one,tri);
        System.out.println("("+one.getX()+","+one.getY()+","+one.getZ()+")");
        System.out.println("Dot product two and tri: " + a.dotProduct(two,tri));
        one = new Vector3D(5,6,4);
        one=a.vectorProduct(one,tri);
        System.out.println("("+one.getX()+","+one.getY()+","+one.getZ()+")");
        System.out.println("Are two and tri collinear : " + a.collinearity(two,tri));
        System.out.println("Are one and tri collinear : " + a.collinearity(one,tri));*/

        //пункт 18
        /*Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Vector3DArray a = new Vector3DArray(size);

        System.out.println(a.length());
        Vector3D one = new Vector3D(1,2,2);
        int i = scan.nextInt();
        a.changeI(i,one);
        a.printVectorArray();

        System.out.println(a.maxVectorLength());

        System.out.println(a.iOfVector(one));

        a.vectorSum().printVector();

        double []d=new double[size];
        for (int j = 0; j < size; j++) {
            d[j]=scan.nextDouble();
        }
        a.linKomb(d).printVector();

        Point3D h=new Point3D(5,6,7);
        a.P(h).printPoint();*/

        /*Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Vector3DArray a = new Vector3DArray(size);
        for (int i = 0; i < size; i++) {
            double x=scan.nextDouble();
            double y=scan.nextDouble();
            double z=scan.nextDouble();
            Vector3D one = new Vector3D(x,y,z);
            a.changeI(i,one);
        }

        System.out.println(a.maxVectorLength());

        double x=scan.nextDouble();
        double y=scan.nextDouble();
        double z=scan.nextDouble();
        Vector3D one = new Vector3D(x,y,z);
        System.out.println(a.iOfVector(one));

        a.vectorSum().printVector();

        System.out.println(a.length());
        Vector3D two = new Vector3D(1,2,2);
        int i = scan.nextInt();
        a.changeI(i,two);
        a.printVectorArray();

        double []d=new double[size];
        for (int j = 0; j < size; j++) {
            d[j]=scan.nextDouble();
        }
        a.linKomb(d).printVector();

        Point3D h=new Point3D(5,6,7);
        Point3D[] k;
        k=a.P(h);
        for (Point3D point:k) {
            point.printPoint();
        }*/
    }
}