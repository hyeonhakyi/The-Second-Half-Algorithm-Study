package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[100001];
        int start = 0;
        int end = 0;
        int answer = Integer.MIN_VALUE;
        while (end < n) {
            while(end < n && count[arr[end]] + 1 <= k){
                count[arr[end++]]++;
            }

            int len = end - start;
            answer = Math.max(answer, len);
            count[arr[start++]]--;
        }
        System.out.println(answer);
    }//main end
}//class end
