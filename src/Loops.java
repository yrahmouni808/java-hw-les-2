import java.util.ArrayList;

public class Loops {
    public Loops(){}

    public static void main(String[] args) {
        starTree(4);
    }
    public static int evenTill100(){
        int sum = 0;
        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void printTill1000(){
        int i = 1;
        while(i < 1000){
            System.out.println(i);
            i *= 2;
        }
    }
    public static boolean contains45(int[] arr){
        boolean b = false;
        for(int a : arr){
            if (a == 45) {
                b = true;
                break;
            }
        }

        return b;
    }
    public static int arrSum(int[] arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        return sum;
    }
    public static void printTillEmpty(String[] arr){
        for (String s : arr) {
            if (s.isBlank()) {
                break;
            }
            System.out.println(s);
        }
    }
    public static void printPrimesUntil100(){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        StringBuilder str = new StringBuilder("Hier zijn de priemgetallen tot 100:\n2\n");
        int i = 3;
        while(i < 100){

            int j = 0;
            boolean b = true;
            while(5*j*j<i){
                if(i % primes.get(j) == 0){
                    b = false;
                    break;
                }
                j++;
            }
            if(b){
                primes.add(i);
                str.append(i).append("\n");
            }
            i += 2;
        }
        System.out.println(str);
    }
    public static void printBiggerThan45(int[] arr){
        for(int a : arr){
            if (a > 45){
                System.out.println(a);
            }
        }
    }
    public static void print10to0(){
        int i = 10;
        while(i>=0){
            System.out.println(i);
            i--;
        }
    }
    public static void fibonacci(int n){

        if(n > 1){
            int a = 0;
            int b = 1;
            int i = 1;
            while(i <= n){
                System.out.println(i + ": " + a);
                int temp = b;
                b += a;
                a = temp;
                i++;
            }
        }
    }
    public static void starTree(int n){
        StringBuffer str = new StringBuffer();
        if(n > 0){
            int i = 1;
            while(i <= n){
                int j = 0;
                while(j < n * 2 + 1){
                    if((j < n- i)||(j > n+i)){
                        str.append("a");
                    }else{
                        str.append("*");
                    }
                    j++;
                }
                str.append("\n");
                i++;
            }
        }
        System.out.println(str);
    }
}
