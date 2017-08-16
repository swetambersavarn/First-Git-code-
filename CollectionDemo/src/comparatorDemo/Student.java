package comparatorDemo;

public class Student {

	private String name;
	private String address;
	private int age;
	private int roll;

		
	public Student(String name, String address, int age, int roll) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.roll = roll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}


	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + ", roll=" + roll + "]";
	}
}
