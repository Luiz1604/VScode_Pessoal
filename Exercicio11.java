public class Exercicio11 {
    public static void main(String[] args) {

        int var1 = 4, var2 = 6, var3 = 2;
        int var4;

        // a)
        var4 = ++var1 * var2--;
        System.out.println("a)");
        System.out.println("var4 = " + var4);
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println();

        // b)
        var4 = --var2 * --var1;
        System.out.println("b)");
        System.out.println("var4 = " + var4);
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println();

        // c)
        var4 = 2 * var1++ - --var3;
        System.out.println("c)");
        System.out.println("var4 = " + var4);
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println();

        // d)
        var4 = --var1 * --var1;
        System.out.println("d)");
        System.out.println("var4 = " + var4);
        System.out.println("var1 = " + var1);
    }
}
