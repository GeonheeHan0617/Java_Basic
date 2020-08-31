package eq;

public class Equals11 {


	    String name;
	    
	    Equals11(String name){			//생성자
	        this.name = name;
	    }
	    public boolean equals(Object obj) {
	    	Equals11 _obj = (Equals11)obj;
	        return name == _obj.name;
	    }
	}

