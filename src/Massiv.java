import java.util.Scanner;

public class Massiv {
    public void printMassiv(int[] mass){
        for (int i: mass) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public void enterMassiv(int[] mass){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            mass[i]= scan.nextInt();
        }
    }

    public int sumMassiv(int[] mass){
        int sum=0;
        for (int i: mass) {
            sum+=i;
        }
        return sum;
    }

    public int numOfEvenNum(int[] mass){
        int ch=0;
        for (int i: mass) {
            if(i%2==0){
                ch++;
            }
        }
        return ch;
    }

    public int numInInterval(int a, int b, int[] mass){
        int ch=0;
        for (int i: mass) {
            if(i<=b && i>=a){
                ch++;
            }
        }
        return ch;
    }

    public boolean areElementsPositive(int[] mass){
        for (int i: mass) {
            if(i<=0){
                return false;
            }
        }
        return true;
    }

    public void returnMassiv(int[] mass){
        for (int i = 0; i < mass.length/2; i++) {
            int k = mass[i];
            mass[i] = mass[mass.length-1-i];
            mass[mass.length-1-i] = k;
        }
    }
}
