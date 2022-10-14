public class Integers2 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) array[i] = (int) Math.pow(2, i + 1);

        for (int num : array) System.out.print(num + " ");
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i] + " ");
        System.out.println();


    }
}
