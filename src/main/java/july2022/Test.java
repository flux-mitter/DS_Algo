package july2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
//		
//		String[] args1 = new String[] {"/bin/bash", "-c", "allure serve \\\"/Users/preetammitra/Desktop/Learn EveryDay/Automation Workspaces/All in 1 Workspace/testngUpdated/allure-results\\\"", "with", "args"};
//		System.out.println(args1);
//		Process proc = new ProcessBuilder(args1).start();
//		String[] cmd = {"allure serve \"/Users/preetammitra/Desktop/Learn EveryDay/Automation Workspaces/All in 1 Workspace/testngUpdated/allure-results\""};
//		System.out.println(cmd);
//		Process process = runtime.exec(cmd);
		 String command = "allure serve \"/Users/preetammitra/Desktop/Learn EveryDay/Automation Workspaces/All in 1 Workspace/testngUpdated/allure-results\"";

	        Process proc = Runtime.getRuntime().exec(command);

	        // Read the output

	        BufferedReader reader =  
	              new BufferedReader(new InputStreamReader(proc.getInputStream()));

	        String line = "";
	        while((line = reader.readLine()) != null) {
	            System.out.print(line + "\n");
	        }

	        proc.waitFor();   
		
	}

}
