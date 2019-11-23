import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MAIN {
    public static void main(String[] args) {
        Class<Nazar> nazarClass = Nazar.class;
        System.out.println("package " + nazarClass.getPackage());
        System.out.println("Class name " + nazarClass.getSimpleName());
        System.out.println("full class name" + nazarClass.getName());
        System.out.println("Parents class " + nazarClass.getSuperclass());
        int mode = nazarClass.getModifiers();
        System.out.println("how many mods " + mode);
        System.out.println("private class" + Modifier.isPrivate(mode));

    }
}