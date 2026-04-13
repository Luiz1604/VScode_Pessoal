public class Metodos
{
    public static void main(String[] args)
    {
          String s = "  JavaTeste  ";

        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.substring(2, 6));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.equals("JavaTeste"));
        System.out.println(s.equalsIgnoreCase("  javateste  "));
        System.out.println(s.contains("Java"));
        System.out.println(s.replace("a", "o"));
        System.out.println(s.trim());
        System.out.println(s.indexOf("a"));
        System.out.println(s.split("a")[0]);
        System.out.println(s.startsWith("  Ja"));
        System.out.println(s.endsWith("e  "));
    }
}
