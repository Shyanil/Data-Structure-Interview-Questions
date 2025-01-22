public class Ninja_Training {
    public static int taskPerform(int day , int [][] task){
      int [] prev =  new int[task[0].length +1];
        for (int last_task_zero_index = 0; last_task_zero_index <= task[0].length; last_task_zero_index++) {
            int maxi = Integer.MIN_VALUE;
            for (int every_task_i = 0; every_task_i < task[0].length; every_task_i++) {
                if(last_task_zero_index != every_task_i) {
                    maxi = Math.max(maxi , task[0][every_task_i]);
                }
            }
            prev[last_task_zero_index]=maxi;
        }

        for (int day_i = 1; day_i < day; day_i++) {
            int [] temp = new int[task[0].length + 1];
            for (int last_task_i = 0; last_task_i <= task[0].length; last_task_i++) {
                temp[last_task_i] = 0;
                for (int evey_task_i = 0; evey_task_i < task[0].length; evey_task_i++) {
                    if(last_task_i != evey_task_i){
                        temp[last_task_i] = Math.max(temp[last_task_i] , task[day_i][evey_task_i] + prev[evey_task_i]);
                    }
                }
            }
            prev = temp;
        }
        return prev[task[0].length];
    }
    public static void main(String[] args) {
        // Define the points for each activity on each day
        int[][] task = {
                {10, 40, 70},    // Day 0
                {20, 50, 80},    // Day 1
                {30, 60, 90}     // Day 2
        };

        int day = task.length; // Get the number of days
        System.out.println(taskPerform(day, task)); // Calculate and print the maximum points
    }
}