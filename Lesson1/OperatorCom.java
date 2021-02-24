//Дано любое натуральное 4-х значное число.
//Верно ли, что все цифры числа различны?

public class OperatorCom {
    public static void main(String[] args) {
        int n = 1790;
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n % 100 / 10;
        int d = n % 10;
        boolean Numbers = a != b && a != c && a != d && b != c && b != d && c != d;
        System.out.println( Numbers );



    }
}
