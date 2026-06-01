package Exercicio3;

public class main {

    public static void main(String[] args) {

        Integer num1 = 127;
        Integer num2 = 127;

        System.out.println("127 com == : " + (num1 == num2));

        Integer num3 = 200;
        Integer num4 = 200;

        System.out.println("200 com == : " + (num3 == num4));
        System.out.println("200 com equals(): " + num3.equals(num4));

    }
}
