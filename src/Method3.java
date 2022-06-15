import java.util.Scanner;
public class Method3{
    public static void main(String[] args){
        double a,b,c,d;

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number:");
        a = input.nextDouble();

        System.out.print("Input Second number:");
        b = input.nextDouble();

        System.out.print("Input Third number:");
        c = input.nextDouble();

        System.out.print("Input Fourth number:");
        d = input.nextDouble();
        double sum =add(a,b,c,d);
        System.out.println(sum);

        double sub =subtract(b,c);
        System.out.println(sub);

        double mul =multiply(a,b,d);
        System.out.println(mul);

        double div =divide(b,d);
        System.out.println(div);
    }
    public static double add(double a,double b,double c,double d){
        double result= a+b+c+d;
        return result;
    }
    public static double subtract(double b,double c){
        double result= b-c;
        return result;
    }
    public static double multiply(double a,double b,double d){
        double result= a*b*d;
        return result;
    }
    public static double divide(double b,double d){
        double result= b/d;
        return result;
    }

}


