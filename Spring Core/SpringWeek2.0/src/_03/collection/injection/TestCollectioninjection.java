package _03.collection.injection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectioninjection {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("03.collection.injection.xml");
		
		CollectioninjectionModel model=context.getBean("Collectioninjection",CollectioninjectionModel.class);
		System.out.println(model);
		
		Student student=context.getBean("student3",Student.class);
		System.out.println(student);
        context.close();
	}

}
