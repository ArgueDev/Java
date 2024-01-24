public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);
        
        double d  = 98765.43e-3;
        float f = 1.2345e2F;
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        datoLogico = f > d;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = 3 - 2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
