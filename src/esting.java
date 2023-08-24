public class esting {
    public static void main(String[] args) {
        String name = "Ramesh";
        System.out.println(name.length());
        System.out.println(name.substring(1));
        System.out.println(name.substring(0,6));
        System.out.println(name.replace("r","a"));
        System.out.println(name.startsWith("Ram"));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("r",5));
        System.out.println(name.lastIndexOf("m",5));
        System.out.println(name.equals("Ramesh"));
        System.out.println(name.equalsIgnoreCase("ramesh"));
    }
}
