import java.util.Arrays;

public class Sort<T extends Comparable<T>> {
    public void bubbleSort(T[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swapped = true;
                    // swap temp and arr[i]
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            {
            if (!swapped)
                break;}
            }
    }
    void mergeSort(T[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        T[] left = Arrays.copyOfRange(arr, 0, mid);
        T[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);

    }

    private void merge(T[] arr, T[] left, T[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }



    public static void main(String[] args) throws Exception {
        Student[] arr = new Student[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student("Student " + i, (int) (Math.random() * 100));
        }

        Sort<Student> sort = new Sort<>();
        sort.bubbleSort(arr);
        System.out.println("Bubble Sort:" + Arrays.toString(arr));

        sort.mergeSort(arr);
        System.out.println("Merge Sort:" + Arrays.toString(arr));

    }
}