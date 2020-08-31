package pretest0422;

public class Data {

	//	시도명(state)	시군구명(cityname)	납부필증사용대상(supc)	납부필증유형(Payment)	관리부서명(md)	관리부서전화번호(mdnumber)	데이터기준일자(dbday)	
	// 제공기관코드(picode)	제공기관명(piname )
	
	private String state;
	private String cityname ; 
	private String supc ;
	private String payment; 
	private String md;
	private String mdnumber;
	private String dbday;
	private String picode;
	private String piname;
	
	Data(){
		
	}
	
	public Data(String state, String cityname, String supc, String payment, String md, String mdnumber, String dbday,
			String picode, String piname) {
		super();
		this.state = state;
		this.cityname = cityname;
		this.supc = supc;
		this.payment = payment;
		this.md = md;
		this.mdnumber = mdnumber;
		this.dbday = dbday;
		this.picode = picode;
		this.piname = piname;
		
	}
		public String toString() {
			return  state+""+ cityname+""+ supc+""+payment+""+md+""+mdnumber+""+dbday+""+
										picode+""+ piname;
			
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getSupc() {
		return supc;
	}

	public void setSupc(String supc) {
		this.supc = supc;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getMd() {
		return md;
	}

	public void setMd(String md) {
		this.md = md;
	}

	public String getMdnumber() {
		return mdnumber;
	}

	public void setMdnumber(String mdnumber) {
		this.mdnumber = mdnumber;
	}

	public String getDbday() {
		return dbday;
	}

	public void setDbday(String dbday) {
		this.dbday = dbday;
	}

	public String getPicode() {
		return picode;
	}

	public void setPicode(String picode) {
		this.picode = picode;
	}

	public String getPiname() {
		return piname;
	}

	public void setPiname(String piname) {
		this.piname = piname;
	}
	
	
	
	
	

	

	
	
	
	
}
