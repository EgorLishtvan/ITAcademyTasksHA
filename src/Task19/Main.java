package Task19;

public class Main {
    public static void main(String[] args) {
        PrintLastInd printLastInd = new PrintLastInd();
        printLastInd.printLastIndex();
    }
}

class PrintLastInd {
    public void printLastIndex() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 50};
        System.out.println(arr[arr.length - 1]);
    }
}