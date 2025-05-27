import java.lang.reflect.Method;
public class ReflectionExample {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            if (method.getName().equals("greet")) {
                method.invoke(obj, "Reflection");
            }
        }
    }
}
