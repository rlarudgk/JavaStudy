package Home;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력하세요.");
        int a = sc.nextInt() ;

        int b = a>10 ? 100 : 0 ;

        System.out.println(b);
    }
}
