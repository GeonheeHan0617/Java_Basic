package lambda.expression;

public class Person {

	public void greeting (Say01 say) {
		say.talking();
		
	}
	public void greeting (Say02 say ) {
		say.talking();
		
	}
	public void greeting (Say03 say ) {
		say.talking("봉주우르 !!");
		
	}
	public String  greeting (Say04 say ) {
		String result = say.talking("Hi", 3);
		
		return result;
	
		
	}
	
}
