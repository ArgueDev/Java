public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 76ms, 1000000 => 3068ms
//            c += a + b + "\n"; // 500 => 10ms, 1000 => 13ms, 10000 => 46ms, 1000000 => 1205ms
//            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 1ms, 1000000 => 8ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
//        System.out.println("sb = " + sb.toString());
    }
}
