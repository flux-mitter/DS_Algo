package july2022;

public class ProgramToreverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12345;
		int output = 0;
		
		while(n!=0)
		{ 
//			int mod = n%10;
//			
//			output=n*10+mod;
//			n=n/10;
			int remainder = n % 10;  
			output = output * 10 + remainder;  
			n = n/10;  
		}
		System.out.println(output);
		//SELECT country,count(country) from Customers group by country having count(country)>1
	}

}
