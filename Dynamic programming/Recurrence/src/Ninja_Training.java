public class Ninja_Training {

    public static int taskPerform(int day, int lastTask, int[][] task) {
        // Base case: On day 0, pick the maximum merit points excluding the last task
        if (day == 0) {
            int baseMaxi = Integer.MIN_VALUE;
            for (int i = 0; i < task[0].length; i++) {
                if (i != lastTask) {
                    baseMaxi = Math.max(baseMaxi, task[0][i]);
                }
            }
            return baseMaxi;
        }

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < task[0].length; i++) {
            if (i != lastTask) { // Ensure no repetition of the last task
                int meritPoint = task[day][i] + taskPerform(day - 1, i, task); // Recursive call
                maxi = Math.max(maxi, meritPoint);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] task1 = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}
        };
        int days1 = task1.length;
        int result1 = taskPerform(days1 - 1, -1, task1); // Call for first test case
        System.out.println(result1); // Expected output: 11

        // Example 2
        int[][] task2 = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        int days2 = task2.length;
        int result2 = taskPerform(days2 - 1, -1, task2); // Call for second test case
        System.out.println(result2); // Expected output: 210
    }
}
