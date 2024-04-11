package Cognifyz_Tasks.src;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++)
        // for inverted half pyramid change i from n to 1 and i--
        {
            for (int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
