

public class People {
	private String name;
	private String surname;
	private int age;
	
	public static void main(String[] args) {
       
    }
	
	
	public String getName() {
		return name;
	}
	
	public void setId(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public People(String name, String surname, Integer age) {
		super();
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
}
