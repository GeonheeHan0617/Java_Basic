package myproject;

public class User {
	
	
	private String ID;
    private String PW;
    private String Email;
    
    User(){
    	
    }
    
    public User(String ID, String PW, String Email) {
        this.ID = ID;
        this.PW = PW;
        this.Email = Email;
    }
 
    public String getID() {
        return ID;
    }
 
    public String getPW() {
        return PW;
    }
 
    public String getEmail() {
        return Email;
    }
 
    public void setID(String ID) {
        this.ID = ID;
    }
 
    public void setPW(String PW) {
        this.PW = PW;
    }
 
    public void setEmail(String Email) {
        this.Email = Email;
    }
 
    
   
}