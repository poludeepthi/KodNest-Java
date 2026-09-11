
class StringCon {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb);
        String res = sb.toString();
        System.out.println(res);
        res.concat("pyhton");
        System.out.println(res);

    }
}
