import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int Num1 = GetNum('0');
        int Num2 = GetNum('1');
        String opperation = getOpp();
        System.out.println(opperation);
        if (opperation.equals("/")) {
            int Num3 = Num1 / Num2;
            System.out.println("your answer is " + Num3);
        } else if (opperation.equals("*")) {
            int Num3 = Num1 * Num2;
            System.out.println("your answer is " + Num3);
        } else if (opperation.equals("-")) {
            int Num3 = Num1 - Num2;
            System.out.println("your answer is " + Num3);
        } else if (opperation.equals("+")) {
            int Num3 = Num1 + Num2;
            System.out.println("your answer is " + Num3);
        }
    }

    public static int GetNum(int go) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("what number?");
        int Num = numScanner.nextInt();
        if (go == '2') {
            numScanner.close();
        }
        return Num;
    }

    public static String getOpp() {
        System.out.println("what opperation? ");
        Scanner oppScanner = new Scanner(System.in);
        String opp = oppScanner.nextLine();
        oppScanner.close();
        return opp;
    }
}
