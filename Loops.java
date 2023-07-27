public class Loops {
    public static void main(String[] args) {
        var x = 1;
        while (x <= 100) {
            x++;

            if (x % 2 == 1) {
                System.out.print("-" + x);
            }
        }
    }
}
