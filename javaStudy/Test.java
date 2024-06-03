public class Test {
    public static void main(String[] args) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int arr[] = { 10, 0, 11, 23, 32, 20, 44, 128, 77, 12, 11, 81 };

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i])
                max1 = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max1)
                if (max2 < arr[i])
                    max2 = arr[i];
        }

        System.err.println(max1);
        System.err.println(max2);
    }
}