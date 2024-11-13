package learnjava.testObj;

public class SinhVienImpl implements SinhVien {
	private String name;
	private int age;
	
	public SinhVienImpl() {
		this.name = "";
		this.age = -1;
	}
	
	public SinhVienImpl( String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void introduce() {
		System.out.println("Name: "+ this.name + "\n" + "Age: "+ this.age);
		System.out.println("*************");
	}
}
