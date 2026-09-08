
class Pgm1 {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "javA";
        if (s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not same");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("strings are same");
        } else {
            System.out.println("Strings are not same");
        }

    }
}
