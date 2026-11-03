package labsheet08.question08;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class Question08Introspection {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(StudentBean.class);

        System.out.println("Properties:");
        for (PropertyDescriptor property : info.getPropertyDescriptors()) {
            System.out.println("  " + property.getName()
                + " -> " + property.getPropertyType().getSimpleName());
        }

        System.out.println("\nMethods:");
        for (Method method : StudentBean.class.getMethods()) {
            System.out.println("  " + method.getName() + "(" + method.getParameterCount() + " params)");
        }
    }
}
