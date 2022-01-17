package copy_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CopyFile {
	public List<String> readFile(String filePath){
	    List<String> lines = new ArrayList<String>();
	    try {
	        File file = new File(filePath);

	        if (!file.exists()) {
	            throw new FileNotFoundException();
	        }

	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            lines.add(line);
	        }
	        br.close();
	    } catch (Exception e) {
	        System.err.println("Fie không tồn tại or nội dung có lỗi!");
	    }
	    return lines;
	}
	public static void writeFile(String filePath,List<String> lines){
	    try {
	        FileWriter writer = new FileWriter(filePath, true);
	        BufferedWriter bufferedWriter = new BufferedWriter(writer);
	       for(String line: lines) {
	    	   bufferedWriter.write(line);
	    	   bufferedWriter.newLine();
	       }
	        bufferedWriter.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		String path="Abstract Class & Interface\\copy_file\\";
		CopyFile cp=new CopyFile();
	    List lines=cp.readFile(path+"input.txt");
	    cp.writeFile(path+"output.txt", lines);
	}

}
