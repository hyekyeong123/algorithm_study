package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// fast plus

public class _15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); // 반복 횟수

        StringTokenizer st; // 이걸 안해주면 런타임 에러..

        for (int i = 0; i<t; i++){

            // 테스트 케이스에서 주어지는 두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer 을 생성과 동시에 문자를 입력받는다.
            st = new StringTokenizer(br.readLine(), " ");

            // StringTokenizer - 특정 문자에 따라 문자열을 나누고 싶을때
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");
        }
        br.close();
        bw.flush();   //남아있는 데이터를 모두 출력시킴(즉 비우기기)
        bw.close();   //스트림을 닫음
    }
}

// https://st-lab.tistory.com/30