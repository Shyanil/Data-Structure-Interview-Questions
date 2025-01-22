public class Ninja_Training {
    public static int taskPerform(int day , int [][] task){
        int [][] dp = new int[day][task[0].length + 1];
        dp[0][0] = Math.max(task[0][1] , task[0][2]);
        dp[0][1] = Math.max(task[0][0] , task[0][2]);
        dp[0][2] = Math.max(task[0][0] , task[0][1]);
        dp[0][3] = Math.max(task[0][0] , Math.max(task[0][1] , task[0][2]));
        for (int day_i = 1; day_i < day; day_i++) {
            for (int last_task = 0; last_task <= task[0].length; last_task++) {
                dp[day_i][last_task] = 0;
                for (int evey_task_i = 0; evey_task_i < task[0].length; evey_task_i++) {
                    if(evey_task_i != last_task){
                        int merit_point = task[day_i][evey_task_i] + dp[day_i - 1][evey_task_i];
                        dp[day_i][last_task] = Math.max(dp[day_i] [last_task] , merit_point);
                    }
                }
            }
        }
        return dp[day - 1][3];
    }
    public static void main(String[] args) {
        // Define the points for each activity on each day
        int[][] task = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};

        int day = task.length; // Get the number of days
        int[][] task1 = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}
        };
        int days1 = task1.length;
         // Call for first test case
        System.out.println(taskPerform(days1, task1)); // Expected output: 11
        System.out.println(taskPerform(day, task)); // Calculate and print the maximum points
    }
}
