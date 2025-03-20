import java.util.Random;

public class Main {
    public Main(){
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        int input1 = rand.nextInt(10) + 1;
        int input2 = rand.nextInt(10) + 1;
        String[] hi = {"Younes", "Henk", "Frank", "George", "Abdel"};
        System.out.println(hi[rand.nextInt(5)]);
        sum(input1, input2);
        String name;

    }
    public static void helloWorld(){
        System.out.println("Hello, world!");
    }
    public static void positiveOrNegative(int a){
        if(a<0){
            System.out.println("This number is negative!");
        }else{
            System.out.println("This number is positive!");
        }
    }
    public static void positiveOrZeroOrNegative(int a){
        if(a<0){
            System.out.println("This number is negative!");
        }else if(a == 0){
            System.out.println("This number is zero!");
        }else{
            System.out.println("This number is positive!");
        }
    }
    public static void bartender(String name){
        Random rand = new Random();
        int a  = rand.nextInt() + 10;
        switch (name){
            case "Younes":
                System.out.println("Oh, jij drinkt niet.\nHier is wat water!");
        }

    }
    public static void sum(int a, int b){
        StringBuilder str = new StringBuilder("A = ");
        str.append(a);
        str.append(", B = ");
        str.append(b);
        str.append(".\nSo: A + B = ");
        str.append(a + b);
        System.out.println(str);
    }
}