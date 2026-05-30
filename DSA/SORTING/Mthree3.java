import java.util.Scanner;

public class Mthree3 {

    public static int solution(int N, int[][] patients) {
        long totalWaitingTime = 0;
        long currentTime = 0;

        for (int i = 0; i < N; i++) {
            int arrivalTime = patients[i][0];
            int examinationTime = patients[i][1];

            if (arrivalTime > currentTime) {
                currentTime = arrivalTime;
            }

            currentTime += examinationTime;
            totalWaitingTime += (currentTime - arrivalTime);
        }

        return (int) (totalWaitingTime / N);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] patients = new int[N][2];
        for (int i = 0; i < N; i++) {
            patients[i][0] = scanner.nextInt();
            patients[i][1] = scanner.nextInt();
        }

        int averageWaitingTime = solution(N, patients);
        System.out.println(averageWaitingTime);
        scanner.close(); // Close the scanner to release resources
    }
}