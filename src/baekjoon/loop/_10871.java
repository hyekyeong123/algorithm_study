package baekjoon.loop;

import java.util.Scanner;

// X보다 작은 수

public class _10871 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int temp = scanner.nextInt();
            if(temp < x){
                System.out.print(temp+" "); // 공백 안 넣어주면 틀린다.
            }
        }
    }
}


