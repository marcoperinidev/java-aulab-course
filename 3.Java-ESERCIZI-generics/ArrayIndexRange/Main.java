import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayRange<Integer> range = new ArrayRange<>(intArray);
        Integer[] subArray = range.getRange(2, 6);
        System.out.println("Subarray: " + Arrays.toString(subArray));
    }
}

