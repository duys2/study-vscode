import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
    System.out.println("정렬 전 배열: " + Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.println("정렬 후 배열: " + Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  public static void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= right) {
      if (arr[i] <= arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    while (j <= right) {
      temp[k++] = arr[j++];
    }
    for (int l = 0; l < temp.length; l++) {
      arr[left + l] = temp[l];
    }
  }
}