import java.util.Arrays;

public class Ninja_Training {
    public static int taskPerformHelper(int day, int lastTask, int[][] task , int [][]dp) {
        if(dp[day][lastTask] != -1) return dp[day][lastTask];
        if(day == 0){
            int baseMaxi = Integer.MIN_VALUE;
            for (int i = 0; i < task[0].length; i++) {
                if(i != lastTask){
                    int meritTask = task[0][i];
                    baseMaxi = Math.max(baseMaxi , meritTask);
                }
            }
            return dp[day][lastTask] = baseMaxi;
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < task[0].length; i++) {
            if(i != lastTask){
                int meritTask = task[day][i] + taskPerformHelper(day - 1 , i , task , dp);
                maxi = Math.max(maxi , meritTask);
            }
        }
        return dp[day][lastTask] = maxi;
    }

    public static int taskPerform(int day , int [][] task){
        int[][] dp = new  int[day][4];
        int lastTask = 3;
        for (int[] row : dp){
            Arrays.fill(row , -1);
        }
        return taskPerformHelper(day -1 , lastTask , task ,dp);
    }

    public static void main(String[] args) {
        // Define the points for each activity on each day
        int[][] task = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};

        int n = task.length; // Get the number of days
        System.out.println(taskPerform(n, task)); // Calculate and print the maximum points
    }
}
