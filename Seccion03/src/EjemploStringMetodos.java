public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Christian";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Christian\") = " + nombre.equals("Christian"));
        System.out.println("nombre.equals(\"christian\") = " + nombre.equals("christian"));
        System.out.println("nombre.equalsIgnoreCase(\"christian\") = " + nombre.equalsIgnoreCase("christian"));
        System.out.println("nombre.compareTo(\"Christian\") = " + nombre.compareTo("Christian"));
        System.out.println("nombre.compareTo(\"Carlos\") = " + nombre.compareTo("Carlos"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.lenght()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));
        System.out.println("nombre.substring(0,5) = " + nombre.substring(0,5));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \"e\") = " + trabalengua.replace("a", "e"));
        System.out.println("trabalengua.indexOf(\"r\") = " + trabalengua.indexOf("r"));
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a"));
        System.out.println("trabalengua.contains(\"l\") = " + trabalengua.contains("l"));
        System.out.println("trabalengua.startsWith(\"n\") = " + trabalengua.startsWith("n"));
        System.out.println("trabalengua.endsWith(\"as\") = " + trabalengua.endsWith("as"));
        System.out.println("   trabalenguas  ");
        System.out.println("   trabalenguas  ".trim());
    }
}
