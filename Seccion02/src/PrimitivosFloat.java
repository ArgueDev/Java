public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 1;
        float realFloat2 = 2.12e3F;
        float realFloat3 = 1.5e4F;
        float realFloat4 = 1.5e-10F;

        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("realFloat4 = " + realFloat4);

        System.out.println("Tipo float corresponde a byte a: " + Float.BYTES);
        System.out.println("Tipo float corresponde a bites a: " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde a byte a: " + Double.BYTES);
        System.out.println("Tipo double corresponde a bites a: " + Double.SIZE);
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE);
        
        var varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);
    }
}
