package algorithm.boj;

import java.io.*;

public class Buffered {
    public static void main(String[] args) throws IOException {
        // 사용자한테 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 내용을 저장해서 출력해주는 도구
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 내용 저장 br.readLine() 은 입력받는 도구 Scanner와 기능이 같은데 성능이 더 좋음
        bw.write(br.readLine());
        bw.write(br.readLine());
        bw.write(br.readLine());

        // 출력
        bw.flush();
    }
}
