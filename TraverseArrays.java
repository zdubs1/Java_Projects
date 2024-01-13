public class TraverseArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 5, 7, 9};

        // Traverse through the arrays and output each element's value and equality
        for (int i = 0; i < array1.length && i < array2.length; i++) {
            System.out.println("array1[" + i + "] = " + array1[i]);
            System.out.println("array2[" + i + "] = " + array2[i]);
            System.out.println("Equal: " + (array1[i] == array2[i]));
        }
    }
}
