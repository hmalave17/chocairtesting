package Choucairtest.models;

public class DataRegister {

	private String email;
	private String First_name;
	private String Last_name;
	private String Password;
	private String Days;
	private String Months;
	private String years;
	private String company;
	private String Addres1;
	private String Addres2;
	private String city; 
	private String state;
	private String post_code;
	private String other_information;
	private String home_phone;
	private String movil_phone; 

	public DataRegister() {

		this.email = "Choucair200@test.com";
		this.First_name = "Luis";
		this.Last_name = "Malave";
		this.Password = "12345";
		this.Days = "22";
		this.Months = "7";
		this.years = "2020";
		this.company = "ChooucairTestting";
		this.Addres1 = "Cr1 #1A-99";
		this.Addres2 = "Cr2 #1A-99";
		this.city = "Medellin"; 
		this.state = "2";
		this.post_code = "99501";
		this.other_information = "test Choucair";
		this.home_phone = "5001234";
		this.movil_phone = "5007894"; 
	}

	public String getMovil_phone() {
		return movil_phone;
	}

	public void setMovil_phone(String movil_phone) {
		this.movil_phone = movil_phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDays() {
		return Days;
	}

	public void setDays(String days) {
		Days = days;
	}

	public String getMonths() {
		return Months;
	}

	public void setMonths(String months) {
		Months = months;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddres1() {
		return Addres1;
	}

	public void setAddres1(String addres1) {
		Addres1 = addres1;
	}

	public String getAddres2() {
		return Addres2;
	}

	public void setAddres2(String addres2) {
		Addres2 = addres2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getOther_information() {
		return other_information;
	}

	public void setOther_information(String other_information) {
		this.other_information = other_information;
	}

	public String getHome_phone() {
		return home_phone;
	}

	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
