import java.util.Map;

public class EjemploVariableEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
        
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
    }
}
