package D_config.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class config_Reader {

	public static Properties p;
	
	public config_Reader() throws IOException {
		
		File f = new File(
    "C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\src\\main\\java\\SDP\\Config.Properties");
		
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	
	p.load(fis);
		
	}
	
	public String get_config_url() {
		
		String url = p.getProperty("url");
		return url;
		
	}
	
	
}
