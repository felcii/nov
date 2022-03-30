package D_config.property;

import java.io.IOException;

public class file_Reader_Manager {
	
	private file_Reader_Manager() {
		
	}

	public static file_Reader_Manager get_instance_FRM() {
		
		file_Reader_Manager FRM = new file_Reader_Manager();
		
		return FRM;
	}
	
	
	public config_Reader get_instance_CR() throws IOException {
		
		config_Reader reader = new config_Reader();
		
		return reader;
	}
	
}
