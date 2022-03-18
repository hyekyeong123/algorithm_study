package doit.chap01;

import java.util.Scanner;

// 세가지 정수값 중 최대값 구하기
public class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        /// a : 2 b : 3; c: 5

        int max = 0;

        max = a;
        if(b > max) max = b;
        if(c > max) max = c;
    }

    // 최소값도 동일한 방식으로 구하면 됨
}
