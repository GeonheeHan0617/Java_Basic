package pretest0421_5;

public class Data {

	private String company;
	private String customer;
	private String phonenumber;
	private String charge;
	
	Data(){
		
	}

	public Data(String company, String customer, String phonenumber, String charge) {
		super();
		this.company = company;
		this.customer = customer;
		this.phonenumber = phonenumber;
		this.charge = charge;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}
	
	
	
}
