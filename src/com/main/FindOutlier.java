
import java.util.Arrays;


public class FindOutlier {

    public static void main(String[] args) {
        int[] array = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        System.out.println(find(array));
        int[] array1 = {2, 6, 8, -10, 3};
        System.out.println(find(array1));
    }

    public static int find(int[] integers) {
        int[] newArray = Arrays.stream(integers).map(i -> Math.abs(i % 2)).toArray();
        if (Arrays.stream(newArray).sum() > 1) {
            return integers[Arrays.binarySearch(newArray, 0)];
        } else {
            return integers[Arrays.binarySearch(newArray, 1)];
        }
    }
}
