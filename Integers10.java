public class Integers10 {
    public static void main(String[] args) {
        int[] tenMult = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for (int num : tenMult) System.out.print(num + " ");
        System.out.println();

        for (int i = tenMult.length - 1; i >= 0; i--) System.out.print(tenMult[i] + " ");
        System.out.println();

        for (int num : tenMult) sum += num;

        System.out.println(sum);
        System.out.println(sum/tenMult.length);


    }
}
