package baekjoon.onearr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// OX퀴즈
// *****

public class _8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr[] = new String[scanner.nextInt()]; // 문자열의 갯수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next(); // 문자열 입력받기
        }

        scanner.close();

        for (int i = 0; i < arr.length; i++) {

            int count = 0;	// 연속횟수
            int sum = 0;	// 누적 합산

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') { // O라는 문자가 나타나면 카운트 증가
                    count++;
                }
                else {
                    count = 0;
                }
                sum += count;
            }

            System.out.println(sum);
        }
    }
}
// https://st-lab.tistory.com/50
