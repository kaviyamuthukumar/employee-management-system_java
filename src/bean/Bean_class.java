package bean;

public class Bean_class 
{
private int Id;
private String Fname;
private String Lname;
private String Gender;
private int Age;
private String Phno;
private String Email;
private String Designation;
private double Salary;
 
public int getId() {
	return Id;
}

public void setId(int Id) {
	this.Id = Id;
}

public String getFname() {
	return Fname;
}

public void setFname(String Fname) {
	this.Fname = Fname;
}

public String getLname() {
	return Lname;
}

public void setLname(String Lname) {
	this.Lname = Lname;
}


public String getGender() {
	return Gender;
}
public void setGender(String Gender) {
	this.Gender=Gender;
}

public int getAge() {
	return Age;
}
public void setAge(int Age) {
	this.Age=Age;
}

public String getEmail() {
	return Email;
}
public void setEmail(String Email) {
	this.Email=Email;
}

public String getPhno() {
	return Phno;
}
public void setPhno(String Phno) {
	this.Phno=Phno;
}

public String getDesignation() {
	return Designation;
}
public void setDesignation(String Designation) {
	this.Designation=Designation;
}

public double getSalary() {
	return Salary;
}
public void setSalary(double Salary) {
	this.Salary=Salary;
}
public Bean_class()
{
	super();
}

}
