package day2;

import java.util.Scanner;

public class Www {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1. 이름: ");
        String name = sc.nextLine();

        System.out.print("2. 주민번호 앞 6자리: ");
        String num = sc.nextLine();

        System.out.print("3. 전화번호: " );
        String tel = sc.nextLine();

        System.out.println("1. 이름: " + name);
        System.out.println("2. 주민번호 앞 6자리: " + num);
        System.out.println("3. 전화번호: " + tel);

        sc.close();

    }
}
