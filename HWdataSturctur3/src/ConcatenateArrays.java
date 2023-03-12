import java.util.Arrays;

public class ConcatenateArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
