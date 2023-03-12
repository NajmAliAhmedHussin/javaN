public class CloneIntegerArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2 = array1.clone();

        System.out.println("Elements of original array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nElements of cloned array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
