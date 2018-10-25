package isep.lab1.bean;

public class Person implements java.io.Serializable{
	private String firstName = null;
	private String lastName = null;	
	private String birthDay = null;
	private String sex = null;
	
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Person(){}
 
	public String getFirstName(){
	      return firstName;
	   }
	public String getLastName(){
	      return lastName;
	   }
	   
	public void setFirstName(String firstName){
	      this.firstName = firstName;
	   }
	public void setLastName(String lastName){
	      this.lastName = lastName;
	   }

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	
}