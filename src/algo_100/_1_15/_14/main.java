package algo_100._1_15._14;

public class main {
    public static void main(String[] args) {

        int inputNum = 421314218;
        int arr[] = new int[10]; // 0에서 9까지 입력된 값을 카운트하기 위한 용도
        // [0, 3, 2, 1, 2, 0, 0, 0, 1, 0]

        while(inputNum > 0){
            int a = inputNum % 10;
            arr[a] = arr[a]+1;
            // arr[inputNum % 10]++; <- 한줄로 줄이기

            inputNum = inputNum / 10;
        }

        for(int k =0; k<arr.length; k++){
            System.out.println(k +" : "+arr[k]);
        }

    }
}
