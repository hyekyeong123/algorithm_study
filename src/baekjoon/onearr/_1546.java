package baekjoon.onearr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        // 대체 왜 그런짓을 하는거야 세준아
        Scanner scanner = new Scanner(System.in);
        List arr = new ArrayList<Integer>();
        int n = scanner.nextInt();
        int max = 0;

        // 각 값을 배열에 저장
        for(int i = 0; i < n; i++){
            int temp = scanner.nextInt();
            arr.add(temp);
            if(max < temp){
                max = temp;
            }
        }
        double hop = 0;
        for (Object a : arr){
             hop += (int)a/(double)max*100;
        }
        System.out.println(hop / n);
    }
}
