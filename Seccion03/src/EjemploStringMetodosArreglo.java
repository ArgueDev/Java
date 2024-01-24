public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;

        for (int i = 0; i < largo; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("trabalengua.split('a') = " + trabalengua.split("a"));
        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;

        for(int j = 0; j < l; j++){
            System.out.println(arreglo2[j]);
        }
    }
}
