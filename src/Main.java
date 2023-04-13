public class Main {
    public static void main(String[] args) {
        //fibonaczi rekurancja
        double start = System.nanoTime();
        System.out.println("Fibonaczi Rekurencja");
        for(int i = 0; i<100;i++) {
            Fib.rekurencja(5);
        }
        double finish = System.nanoTime();
        double timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println("  ");
        //fibonaczi iteracyjnie
        start = System.nanoTime();
        System.out.println("Fibonaczi Iteracyjnie");
        for(int i = 0; i<100;i++) {
            Fib.iteracja(5);
        }
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println("  ");
        //silnia rekurencja
        start = System.nanoTime();
        System.out.println("Silnia Rekurencja");
        for(int i = 0; i<100;i++) {
            Silnia.rekurencja(5);
        }
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println("  ");
        //silnia iteracyjnie
        start = System.nanoTime();
        System.out.println("Silnia Iteracyjnie");
        for(int i = 0; i<100;i++) {
            Silnia.interacja(5);
        }
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println(timeElapsed);
    }

    public static class Fib{
        public static int rekurencja(int x){
            if(x<2) {
                return x;
            }
            return rekurencja(x-1)+rekurencja(x-2);
        }
        public static int iteracja(int x){
            if(x<2){
                return x;
            }
            int A = 0;
            int B = 1;
            int Suma = 0;
            for(int i = 2; i<=x ;i++){
                Suma = A + B;
                A = B;
                B = Suma;
            }
            return Suma;
        }
    }

    public static class Silnia {
        public static int rekurencja(int x){
            if(x<1){
                return 1;
            }
            return x*rekurencja(x-1);
        }
        public static int interacja(int x){
            int i = 1, s=1;
            while(i<=x){
                s=s*i;
                i++;
            }
            return s;
        }
    }
}