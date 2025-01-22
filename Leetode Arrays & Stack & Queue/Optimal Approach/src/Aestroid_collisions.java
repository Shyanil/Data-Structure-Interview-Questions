import java.util.ArrayList;

public class Aestroid_collisions {
    public static int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            int num = asteroids[i];
            if (num > 0) {
                list.add(num);
            } else {
                while (!list.isEmpty() && list.getLast() > 0 && list.getLast() < Math.abs(num)) {
                    list.removeLast();
                }

                if (!list.isEmpty() && list.getLast() == Math.abs(num)) {
                    list.removeLast();
                } else if (list.isEmpty() || list.getLast() < 0) {
                    list.add(num);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }


    public static void main(String[] args) {


        // Test case 1
        int[] asteroids1 = {10, 2, -5};
        int[] result1 = asteroidCollision(asteroids1);
        System.out.print("Result 1: ");
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println(); // To move to the next line

        // Test case 2
        int[] asteroids2 = {5, 10, -5};
        int[] result2 = asteroidCollision(asteroids2);
        System.out.print("Result 2: ");
        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Test case 3
        int[] asteroids3 = {8, -8};
        int[] result3 = asteroidCollision(asteroids3);
        System.out.print("Result 3: ");
        for (int i : result3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

