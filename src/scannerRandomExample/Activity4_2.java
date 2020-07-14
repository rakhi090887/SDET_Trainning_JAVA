package scannerRandomExample;

import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\eclipse_SeleniumWorkspace_SDETTrainning\\OnlineStore\\hellowworld.txt");
		try {
			boolean fileCreated = file.createNewFile();
			if(fileCreated) {
				System.out.println("File is created Successfully.");
			}else {
				System.out.println(" File is already exists in the path.");
			}
			
			///File filen = FileUtils.get
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
