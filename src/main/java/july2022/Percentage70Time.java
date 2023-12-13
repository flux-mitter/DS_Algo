package july2022;

public class Percentage70Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "04:26";
		String[] time = s.split(":");
		int totaltime = (Integer.parseInt(time[0])*60)+Integer.parseInt(time[1]);
		double per70=totaltime*0.7;
		
		int min=  (int) (per70/60);
		int sec= (int) (per70%60);
		
		String output="";
		
		if(min>9 && sec >9)
		{
			output=min+":"+sec;
		}
		else if(min<10&& sec<10)
		{
			output="0"+min+":"+"0"+sec;
		}
		else if(min<10&& sec>9)
		{
			output="0"+min+":"+sec;
		}
		else if(min>10&& sec<10)
		{
			output=min+":"+"0"+sec;
		}
		

		
		System.out.println(output);
		

	}

}
