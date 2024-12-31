package PraticePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class RadingProperties {
	public static void main(String[] args) throws IOException {
		//location of the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\confif.properties");
		//loding properties file
		Properties propertiesobj= new Properties();
		propertiesobj.load(file);
		
		// read data from the file
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String password = propertiesobj.getProperty("password");
		String ordrerid = propertiesobj.getProperty("orderid");
		String cutmid = propertiesobj.getProperty("customerid");
		
		
		System.out.println(url+" "+email+" "+password+" "+ordrerid+" "+cutmid);
		//reading all the keys from properties file
		//Set<String> keys = propertiesobj.stringPropertyNames();
		//System.out.println(keys);
		Set<Object> keys = propertiesobj.keySet();
		System.out.println(keys);
		
		//reading all the values from properties file
		
		 Collection<Object> values = propertiesobj.values();
		 System.out.println(values);
	}

}
