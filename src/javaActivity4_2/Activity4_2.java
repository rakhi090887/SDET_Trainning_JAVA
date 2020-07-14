package javaActivity4_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File file = new File("C:\\Users\\RakhiMaheshwari\\Documents\\SDET_Trainning_Session\\rakhi1.txt");
			boolean fstatus = file.createNewFile();
			if(fstatus) {
				System.out.println(" File created successfully.");
			}else {
				System.out.println("file already exists in path");
			}
			
			
			File fileUtil = FileUtils.getFile("C:\\Users\\RakhiMaheshwari\\Documents\\SDET_Trainning_Session\\rakhi.txt");
			System.out.println("Data in String: "+FileUtils.readFileToString(fileUtil));
			
			//create new DIr
			File fileDir = new File("C:\\Users\\RakhiMaheshwari\\Documents\\SDET_Trainning_Session\\resources");
			FileUtils.copyFileToDirectory(fileUtil, fileDir);
			
			File fileUtils1 = FileUtils.getFile(fileDir, "rakhi.txt");
			System.out.println("Read the text: "+FileUtils.readFileToString(fileUtils1));
			
			
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
