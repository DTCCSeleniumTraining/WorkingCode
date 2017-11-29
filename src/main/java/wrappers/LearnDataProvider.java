package wrappers;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	
	@DataProvider(name="fetchdata")
	public static String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "TCS";
		data[0][1] = "Gopi";
		data[0][2] = "P";
		data[0][3] = "gopinath@testleaf.com";
		data[0][4] = "9597704568";
		
		data[1][0] = "HCL";
		data[1][1] = "Jai";
		data[1][2] = "P";
		data[1][3] = "Jai@testleaf.com";
		data[1][4] = "95977234";
		return data;
	}

}
