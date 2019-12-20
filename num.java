import java.util.*;
public class num {

    public static void main(String args[]) {
        System.out.println("Введите число ");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        double num1 = in.nextDouble();
        double L = in.nextDouble();
       // double t;
        //num=Math.tan(t);
        num=Math.tan(3.0)-Math.tan(4.0);

        num=Math.sin(4.0)*Math.tan(3.0)+1;
        num1=num/Math.sqrt(2+3*Math.tan(num));
        L=num*num1;
        System.out.println(L);
        //double sin(double s);
        //double N(double N);
        //double n=(tan*3.0-tan*4.0);
        //N=Math.sqrt(sin*4+sin*3+7);
        //double L=(tan*3-tan*4)*((sin*4*tan*3+1)/2+3*N);
        //System.out.println(L);
    }

}
