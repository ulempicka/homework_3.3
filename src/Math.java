public class Math {
    boolean isEven(int a){
        return a % 2 == 0;
    }

    boolean isOdd(int a){
        //return !(a % 2 == 0);
        return a % 2 != 0;
        //return a % 2 == 1;
    }

    double circleField(double r){
        final double pi = 3.14;
        return pi * (r * r);
    }

    int power(int a){
        return a * a;
    }

}
