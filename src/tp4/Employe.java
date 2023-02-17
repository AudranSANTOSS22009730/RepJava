package tp4;

public class Employe {
private String name;
private String firstname;
private String lastname;
private int salary;
private int id;
private int AnnualSalary;
private int raiseSalary;

public Employe(int id, int sal, String fn, String ln) {
	this.salary= sal;
	this.firstname=fn;
	this.id=id;
	this.lastname=ln;
	this.name=ln+fn;
}
public int getSalary(){
	return salary;
}     

public int getID(){
	return id;
}

public String getFirstName(){
	return firstname;
}

public String getLastName(){
	return lastname;
}

public String getName(){
	return name;
}

public double getAnnualSalary(){
	return salary*12;
}
public void SetSalary(int salary) {
	this.salary=salary;
}
public int raiseSalary( int percent) {
	return this.raiseSalary= (salary * percent)/100;
}


}
