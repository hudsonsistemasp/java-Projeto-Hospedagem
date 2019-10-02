package entities;

public class Hospedagem {
	private Integer id;
	private String name;
	private Double salary;
	
	
	//Method Constructor
	public Hospedagem() {
	}
	
	public Hospedagem(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	
	//GETTERS and SETTERS
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Methods of Class
	public void increasySalary(Double percentage) {
		this.salary += (this.salary * percentage) / 100.0; 
	}
}
