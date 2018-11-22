package _04.collection.injection.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionInjectionAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04.collection.injection.annotation.xml");

		CollectionInjectionModelAnnotation model = context.getBean("collectionInjectionModelAnnotation1", CollectionInjectionModelAnnotation.class);

		System.out.println(model);
		
		context.close();
	}

}
