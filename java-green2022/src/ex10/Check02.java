package ex10;

//배열 복사
public class Check02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int copyNum = array[i];
            for (int j = i; j <= i; j++) {
                array[j] = copyNum;
                System.out.println(array[j]);
            }
        }
    }
}
