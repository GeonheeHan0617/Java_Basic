package discount.oil.station;

public class Data {
		//상호,주소,상표,셀프여부 		tradename, address, trademark, self
	
	private String tradename;
	private String address;
	private String trademark;
	private String self;
	
	Data(){
		
	}

	public Data(String tradename, String address, String trademark, String self) {
		super();
		this.tradename = tradename;
		this.address = address;
		this.trademark = trademark;
		this.self = self;
	}

	public String getTradename() {
		return tradename;
	}

	public void setTradename(String tradename) {
		this.tradename = tradename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}
	
	
}
