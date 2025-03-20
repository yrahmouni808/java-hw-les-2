import java.util.Random;

public class Main {
    public Main(){
    }
    public static void main(String[] args) {
        helloWorld();
        Random rand = new Random();
        int number = rand.nextInt(11) - 5;
        int num = rand.nextInt(3) - 1;
        positiveOrNegative(number);
        positiveOrZeroOrNegative(num);
        int input1 = rand.nextInt(10) + 1;
        int input2 = rand.nextInt(10) + 1;
        String[] names = {"Younes", "Henk", "Frank", "George", "Abdel"};
        String name = names[rand.nextInt(5)];
        bartender(name);
        sum(input1, input2);

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
        switch (name){
            case "Younes":
                System.out.println("Oh, you don't drink.\nHere's a cup of water!");
                break;
            case "Henk":
                System.out.println("Henk wants a Bacardi cola.");
                break;
            case "Frank":
                System.out.println("You don't get anything after the mess you made last time.\nGet out!");
                break;
            default:
                System.out.println(name + ", pour yourself something I rly dont care");
                break;
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