import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static int[] EvenOdd(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = EvenOdd(array);

        System.out.println("Task 1:");

        for (int num : result) {
            System.out.print(num + " ");
        }



        int[] array2 = {3, 3, 3, 2, 2};
        int dominant = -1;

        for (int i = 0; i < array2.length; i++) {
            int count2 = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array2[i] == array2[j]) {
                    count2++;
                }
            }
            if (count2 > array2.length / 2) {
                dominant = array2[i];
                break;
            }
        }

        System.out.println("\nTask 2: \n" + dominant);
    }
}