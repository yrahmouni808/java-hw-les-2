public class IfElse {
    IfElse(){
    }

    public static void main(String[] args) {

    }
    //opdracht 1:
    public static void evenOrOdd(int a){
        if(a % 2 == 0){
            System.out.println(a + " is even.");
        }else{
            System.out.println(a + " is odd.");
        }
    }
    //opdracht 2:
    public static void grader(int a){
        char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
        if((a<5) || (a > 10)){
            a = 5;
        }
        System.out.println("You got "+ a + ".\nSo, your grade is: " + grade[10 - a]);
    }
    //opdracht 3:
    public static int max(int a, int b){
        return Math.max(a, b);
    }
    //Opdracht 4 hadden we al gedaan buiten de bonus. Kijk in Main
    //opdracht 5:
    public static String leeftijdsClassificatie(int age){
        if((age<0)||(age>140)){
            return "Alien";
        }
        if(age < 12){
            return "Kind";
        }
        if(age < 19){
            return "Puber";
        }
        if(age < 60){
            return "Volwassene";
        }else{
            return "Senior";
        }
    }
    //opdracht 6:
    public static int textLengthChecker(String str){
        return str.length();
    }
    //opdracht 7:
    public static boolean schrikkelJaarChecker(int jaar){
        return (jaar % 4 == 0)&&((jaar % 100 != 0)||(jaar % 400 == 0));
    }
    //opdracht 8:
    public static int max3(int a, int b, int c){
        int max1 = Math.max(a, b);
        return Math.max(max1, c);
    }
    //opdracht 9:
    public static String driehoek(int a, int b, int c){
        if(a - b - c == -c){
            return "Gelijkzijdig";
        } else if ((a == b)||(a == c)||(b == c)) {
            return "Gelijkbenig";
        }else{
            return "Ongelijk";
        }
    }
    //opdracht 10:
    public static double calculator(int a, int b, char op){
        return switch (op) {
            case '+' -> (double) a + b;
            case '-' -> (double) a - b;
            case '*' -> (double) a * b;
            case '/' -> (double) a / b;
            default -> -1.0;
        };
    }

}
