class Person{
	int age;
	char gender;
	String name;
	String email;
	void printPerson()
	{
		System.out.println("gender is  :"+gender);
		System.out.println("name is  :"+ name);
		System.out.println("age is  :"+ age);
		System.out.println("Email is  :"+ email);
		System.out.println("-------------------------");
	}
}
class Tiger{
	void jump() {
		System.out.println("Tiger is jumping");
	}
}

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Tiger t1= new Tiger();
		    t1.jump();
            Person p1= new Person();
            p1.gender='M';
    		p1.name="MARTIN";
    		p1.age=23;
    		p1.email="martin@gmail.com";
    		p1.printPerson();
    		
    		Person p2= new Person();
            p2.gender='F';
    		p2.name="JULIA";
    		p2.age=32;
    		p2.email="julia@gmail.com";
    		p2.printPerson();
    		
    		Person p3= new Person();
            p3.gender='M';
    		p3.name="JACK";
    		p3.age=25;
    		p3.email="jack@gmail.com";
    		p3.printPerson();
    		
    		Person p4= new Person();
            p4.gender='F';
    		p4.name="RITA";
    		p4.age=36;
    		p4.email="rita@gmail.com";
    		p4.printPerson();
    		 		
	}

}
