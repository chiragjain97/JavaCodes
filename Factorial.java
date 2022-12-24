public class Factorial {

    public static void main(String args[]) {

        int x = 3;
        int n = 10;

        System.out.println("PowerLinear : "+powerLinear(x, n));
        System.out.println("Factorial : "+fact(n));
        System.out.println("PowerLogarithmic : "+powerLogarithmic(x, n));

    }

    public static int fact(int n){

        if(n==1)
            return 1;

        return fact(n-1)*n;
    }

    public static int powerLinear(int x, int n){

        if(n==0)
            return 1;

        int pxn1 = powerLinear(x, n-1);
        int pxn = pxn1 * x;

        return pxn;
    }

    public static int powerLogarithmic(int x, int n){

        if(n==0)
            return 1;

        int pxnd2 = powerLogarithmic(x, n/2);
        int pxn = pxnd2 * pxnd2;

        if((n&1) == 1)
            pxn *= x;

        return pxn;
    }
}
