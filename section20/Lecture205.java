package section20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My{
    public int a;
    int b;
    protected int c;
    private int d;

    My(String s1, String s2){}
    My(){}

    private void display(String s1, String e3){}
    public int show(){return 0;}
}
public class Lecture205 {
    public static void main(String[] args) {
        Class c = My.class;

        for (Field field : c.getFields())
            System.out.println(field);
        System.out.println("---------");
        for (Field field : c.getDeclaredFields())
            System.out.println(field);
        System.out.println("---------");
        for(Constructor constructor : c.getDeclaredConstructors()){
            System.out.println(constructor);
        }
        System.out.println("---------");
        for(Method method: c.getDeclaredMethods()){
            System.out.println(method);
            System.out.print("\t");
            for(Parameter parameter:method.getParameters()){
                System.out.print(parameter+" |||| ");
            }
            System.out.println();
        }

    }
}
