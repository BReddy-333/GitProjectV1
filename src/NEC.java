

public class NEC {
	
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
		NEC A= new NEC();
		A.baby(23);
		A.baby("bhargavi", 10);
	}
	

	}


