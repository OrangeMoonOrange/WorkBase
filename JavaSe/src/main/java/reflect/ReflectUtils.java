package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: xk
 * @Date: 2021/8/15 10:46 下午
 * @Desc:
 */
public class ReflectUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("reflect.Person");

        //全类名
        System.out.println(aClass.getName());
        // 获取public属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //获取本类的所有属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        //获取本类以及父类修饰的所有public修饰的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        //获取本类的所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        //获取所有public修饰的构造器，包括本类以及父类
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        //获取包信息
        System.out.println(aClass.getPackage());

        //以class形式返回父类信息 (可以得到父类的class对象)
        System.out.println(aClass.getSuperclass());

        //接口信息
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        //返回注解信息 todo


    }
}

interface IA{

}
class A {
    private String name;
    protected int age;
    String job;
    public double sal;

    public A() {

    }

    //metod
    public void m1() {

    }

    protected void m2() {

    }
    private void m3(){

    }
}

class Person extends A implements IA{
    private String name;
    protected int age;
    String job;
    public double sal;

    public Person() {
    }


    //metod
    public void m1() {

    }

    protected void m2() {

    }
    private void m3(){

    }
}
