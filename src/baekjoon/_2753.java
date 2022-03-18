package baekjoon;

import java.util.Scanner;

// 윤년 구하기

public class _2753 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        // 4의 배수이면서 (100의 배수가 아닐때 또는 400의 배수일 때)
        if(a % 4 == 0 && ((a % 100 != 0) || (a % 400 == 0))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
