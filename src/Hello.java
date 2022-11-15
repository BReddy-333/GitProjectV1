

public class Hello {
	
			String name;
			int age;
			int no;
	public void baby(int age)
	{
		System.out.println("age:"+age);
	}
	public void baby(String name,int no)
	{
	System.out.println("name:" +name);
	System.out.println("no:" +no);
	}
	public static void main(String[] args) {
		Hello A= new Hello();
		A.baby(23);
		A.baby("bhargavi", 10);
	}
	

	}


