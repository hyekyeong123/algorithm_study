package baekjoon;

import java.util.Scanner;

// 구구 단

public class _2739 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
