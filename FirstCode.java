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

public class PersonTest6 {	
			public static void main(String[] args) {
				Person4 p1 = new Person4("MARTIN king",'M', 23,"m@gc");
				p1.printPerson();
				Person4 p2 = new Person4("JULIA",'F', 320,"julia@gmail.com");
				p2.printPerson();
				Person4 p3 = new Person4("JACK",'M', 25,"jack@gmail.com");
				p3.printPerson();
				Person4 p4 = new Person4("RITA",'M',27,"rita@gmail.com");
				//p4.setPerson("RITA",'M',27,"rita@gmail.com");
				p4.printPerson();	 
			}

}
