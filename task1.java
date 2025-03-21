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

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}