package SeleniumFunctions;

public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="₹66,499";
		int price=Integer.parseInt(s.replace("₹", "").replace(",", ""));
		System.out.println(price);

	}

}
