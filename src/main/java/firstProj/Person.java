package firstProj;

public class Person {

	/**
	 * @param firstName - First Name
	 * @param lastName - Last Name
	 * @param age	   - age of person	
	 */
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person: "+ firstName + ", " + lastName +", " + age;
	}
	
	public static void main(String[] args)
	{
		Person r = new Person("Romeo", "Mon", 15);
		System.out.println(r);
	}
	
	public Person makePerson(Person that) throws UnderAgeException{
		if (age < 18 || that.age < 18) {
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName, that.lastName, 0);
		return child;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	String firstName;
	String lastName;
	int age;
	
	
}
