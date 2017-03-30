package course.Exception.Number;

public class NumberException {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// try block
	
		// man logic
		try{

		int number=123;
		String s="a,b,c";
		System.out.println(s);
		int total=Integer.parseInt(s);	
		}
		// catch block
		// handles Number format Exception
		catch(Exception e){
			System.out.println("cannot cast characters into integer type variable ");
		}
		}
}
