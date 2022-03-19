package baekjoon.onearr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// *****
// 배열을 c의 갯수만큼 생성

public class _4344_X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;

        int t = scanner.nextInt(); // 테스트 케이스의 개수

        for(int i = 0 ; i < t ; i++) {

            int N = scanner.nextInt();	//학생 수(가장 처음)
            arr = new int[N];

            double sum = 0;	// 성적 누적 합 변수

            // 성적 입력부분
            for(int j = 0 ; j < N ; j++) {
                int val = scanner.nextInt();	// 성적 입력
                arr[j] = val;
                sum += val;	// 성적 누적 합
            }

            double mean = (sum / N) ;
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/N)*100);


        }
        scanner.close();
    }
}
// https://st-lab.tistory.com/51