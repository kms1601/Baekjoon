import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
