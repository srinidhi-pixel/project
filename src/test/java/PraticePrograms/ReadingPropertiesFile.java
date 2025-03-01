package PraticePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
public static void main(String[] args) throws IOException {
	
      FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\confif.properties");
      
      Properties p = new Properties();
      p.load(fs);
      
      String url = p.getProperty("appurl");
      String email = p.getProperty("email");
      String pwd = p.getProperty("pwd");
      String cid = p.getProperty("cid");
      String oid = p.getProperty("oid");
      
      Set<Object> keySet = p.keySet();
      System.out.println(keySet);
      
      Collection<Object> values = p.values();
      System.out.println(values);
}
}
