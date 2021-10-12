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
public class PersonTest3 {
	public static void main(String[] args) {
	    Person1 p1= new Person1();
        p1.setPerson('M',"MARTIN",23,"martin@gmail.com");
		p1.printPerson();
		
		Person1 p2= new Person1();
        p2.setPerson('F',"JULIA",32,"julia@gmail.com");
		p2.printPerson();
		
		Person1 p3= new Person1();
        p3.setPerson('M',"JACK",25,"jack@gmail.com");
		p3.printPerson();
		
		Person1 p4= new Person1();
        p4.setPerson('F',"RITA",36,"rita@gmail.com");
		p4.printPerson();
	}

}
