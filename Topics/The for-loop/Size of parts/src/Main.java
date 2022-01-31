import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int large = 0;
        int small = 0;
        int perfect = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            if (b == -1) {
                large++;
            } else if (b == 0) {
                perfect++;
            } else {
                small++;
            }
        }
        System.out.println(perfect + " " + small + " " + large);
    }
}
