import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);        

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Type the input separated by spaces and operations in new lines:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        List<Operation> operations = solution.readOperations(y);
        int[] performedOperations = solution.performOperations(x, operations);
        int maxValue = solution.findMax(performedOperations);

        System.out.println("max = " + maxValue);
        
        scanner.close();
    }

    private List<Operation> readOperations(int y){
        List<Operation> operations = new ArrayList<>();
        for (int i = 0; i < y; i++) {
            int iVal = scanner.nextInt();
            int jVal = scanner.nextInt();
            int kVal = scanner.nextInt();
            operations.add(new Operation(iVal, jVal, kVal));
        }
        return operations;
    }

    private int[] performOperations(int x, List<Operation> operations) {
        int[] list = new int[x];
        
        for (Operation operation : operations) {
            int val = (operation.getJ() - operation.getI()) + 1;
            for (int i = 0; i < val; i++) {
                list[(operation.getI() - 1) + i] += operation.getK();
            }
        }
        return list;
    }

    private int findMax(int[] list) {
        int max = 0;
        for (int value : list) {
            max = Math.max(max, value);
        }
        return max;
    }

    static class Operation {
        private int i, j, k;

        public Operation(int i, int j, int k) {
            this.i = i;
            this.j = j;
            this.k = k;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public int getK() {
            return k;
        }
    }
}
