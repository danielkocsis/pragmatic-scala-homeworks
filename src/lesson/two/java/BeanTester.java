package lesson.two.java;

/**
 * Created by danielkocsis on 2017. 07. 17..
 */
public class BeanTester {

    public static void main(String[] args) {
        Bean bean = new Bean("Alma");

        System.out.println(bean);

        bean.property_$eq("korte");

        System.out.println(bean.property());

        AnnotatedBean annotatedBean = new AnnotatedBean("Alma");

        System.out.println(annotatedBean.getName());

        annotatedBean.setName("korte");

        System.out.println(annotatedBean.getName());
    }

}
