package cypercloud;

//import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountTheStringOccurence {

	public static void main(String[] args) throws IOException {
		
		
		
	File f =new File("C:\\Users\\RAMESH\\Desktop\\test123.txt");
		
	
		FileReader r =new FileReader(f);
		
		BufferedReader br = new BufferedReader(r);
		try {
		    
		    String line = br.readLine();
		    
             int count=0;
		    while (line != null) {
		    	 
		    	if(line.contains("hello")){
		    		System.out.println(+count);
		    	}
		    	 
		    	 
		       line = br.readLine();
		       count++;
		    }
		  
		} finally {
		    br.close();
		}
		
	
	
	}

}
