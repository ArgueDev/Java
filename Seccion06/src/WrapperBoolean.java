public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objBoolean = " + objBoolean);

        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean == objBoolean));
    }
}
