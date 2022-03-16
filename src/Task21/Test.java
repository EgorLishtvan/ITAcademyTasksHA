package Task21;

public class Test {
    public void complete() {
        int[] mas = new int[10];
        int maxNumber = -16;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) - 0;
            System.out.println(mas[i]);
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];
                maxIndex = i;

            }
        }
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
