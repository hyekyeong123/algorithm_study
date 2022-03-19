package baekjoon.onearr;

import java.util.Arrays;
import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}
// https://st-lab.tistory.com/43 <- 원래 반복문 두번 사용해서 해결했었는데 그냥 Arrays.sort 사용하면 되었었다...허무
