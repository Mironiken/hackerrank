import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringHandler solver = new StringHandler();

        int numberOfLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfLines; i++) {
            solver.handleString(sc.nextLine());
        }

        solver.getAnswer().stream().forEach(el -> System.out.println(el));

    }
}
