package baekjoon;

import java.util.Scanner;

// 알람 시계
// 난이도 : ***(정답 확인)
public class _2525 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); // 시간
        int m = scanner.nextInt(); // 분

        int plus_m = scanner.nextInt(); // 추가 분

        // 17: 40 + 180
        h += plus_m / 60;
        m += plus_m % 60;

        if(m >= 60) {
            h++;
            m = m%60;
        }

        if(h >= 24){
            h = h%24;
        }

        System.out.print(h+" ");
        System.out.print(m);
    }
}
