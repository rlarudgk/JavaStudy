package Home;

import java.util.Scanner;

public class Worktodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      정수를 입력할 때 마다 더해져서 출력
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);

        }
        }
    }

