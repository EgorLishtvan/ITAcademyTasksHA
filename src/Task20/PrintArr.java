package Task20;

public class PrintArr {
    int arr[] = new int[10];

    public void print() {
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 7;
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}