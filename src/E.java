import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        int upper_len, down_len;
        int start, end;
        int flag;
//        String next = scanner();
//         = next.split(" ");
        length = scanner.nextInt();
        upper_len = scanner.nextInt();
        down_len = scanner.nextInt();
        int[] times = new int[length];
        for (int i = 0; i < upper_len + down_len; i++) {
            start = scanner.nextInt();
            end = scanner.nextInt();
            flag = scanner.nextInt();
            if (flag == 0) {
                for (int j = start; j < end + 1; j++) {
                    if (times[j] == 3) {
                        continue;
                    } else {
                        times[j] = 1;
                    }
                }
            } else {
                for (int j = start; j < end + 1; j++) {
                    times[j] = 3;
                }
            }
        }
        for (int i : times) {
            System.out.println(i);
        }
        System.out.println(Arrays.stream(times).sum());
    }
}
