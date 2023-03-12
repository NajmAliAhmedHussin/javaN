import java.util.Arrays;
public class EquivlenceTest {

    public static void main(String[] args)
    {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 3 };

        // Comparing both the arrays
        if (Arrays.equals(arr1, arr2))
            System.out.println("Both Arrays are equal");
        else
            System.out.println("Both Arrays are not equal");
    }
}
