package LottaryGame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class WrittingFiles {

	public static void writingPlayerInfo(String path, ArrayList<PlayerInfo> list) throws IOException{
		FileWriter fileWriter= new FileWriter(path);
		BufferedWriter writer= new BufferedWriter(fileWriter);
		
		for (int i = 0; i < list.size(); i++) {
			writer.write(list.get(i).toString());
			writer.newLine();
		}
		
		System.out.println("The saving of winners is succesful! ");
		writer.close();
	}
	
	public static void writingWinningNumbers(String path,int[] winningNumbers) throws IOException{
		FileWriter fileWriter= new FileWriter(path, true);
		BufferedWriter writer= new BufferedWriter(fileWriter);
		
		for (int i = 0; i < winningNumbers.length; i++) {
			writer.write(winningNumbers[i]+"");
			writer.newLine();
		}
		
		System.out.println("The saving of winning number is successful!");
		writer.close();
	}
	
	
	public static  void writingTheWinners(String path,HashMap<Long, Integer>result ) throws IOException{
		FileWriter fileWriter= new FileWriter(path, true);
		BufferedWriter writer= new BufferedWriter(fileWriter);
		
		for (Long key : result.keySet()) {
			writer.write("" + key + " : " + result.get(key) + " numbers ");
			writer.newLine();
		}
		System.out.println("The winners are saved successful!");
		writer.close();
	}
	
	
	
	
	
}
