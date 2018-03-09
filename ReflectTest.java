import java.lang.reflect.*;
import java.util.HashMap;

public class ReflectTest
{

    protected static HashMap<String, Class<?>> classes;
    protected static HashMap<String, HashMap<String, Field>> fields;
    protected static HashMap<String, HashMap<String, Field>> methods;

    public static Class<?> getClass(String name)
    {
        try { return Class.forName(name); }
        catch (ClassNotFoundException e) {return null;}
    }

    public static Field getField(Class<?> cls, String name)
    {
        try { return cls.getDeclaredField(name); }
        catch (Exception e) { return null; }
    }

    public static Method getMethod(Class<?> cls, String name, Class<?> ... params)
    {
        try { return cls.getDeclaredMethod(name, params); }
        catch (Exception e) { return null; }
    }

}
