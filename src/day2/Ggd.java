package day2;

public class Ggd {
    public static void main(String[] args) {

        System.out.println("구구단 시작");

        for (int i = 1 ; i <=9 ; i++) {
            System.out.println(i + "단");

            for (int k = 1 ; k <=9 ; k++) {

                System.out.println( i + "*"+ k + "=" + i*k );
            }

            System.out.println("=========");
        }

    }
}
