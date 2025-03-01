package Revision;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
public class prop {
	

	public static void main(String[] args) throws IOException {
		 FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\confif.properties");
            Properties p = new Properties();
              p.load(fs);
              
              String url = p.getProperty("appurl");
                           String email = p.getProperty("email");
                           String pwd = p.getProperty("paswword");
                                    String oid = p.getProperty("orderid");
                                    String cid = p.getProperty("customerid");
                                    
                             Set<Object> keySet = p.keySet(); 
                             System.out.println(keySet);
                             
                             Collection<Object> values = p.values();
                             System.out.println(values);
}
}