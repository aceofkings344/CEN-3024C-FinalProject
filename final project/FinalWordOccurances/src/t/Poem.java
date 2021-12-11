package t;

import java.io.*;
import java.util.*;

public class Poem {
	
	public static void getPoemWords (ArrayList words) throws Exception{
		
		String filePath = "I:\\fall 2021\\software development\\final project\\the file to use\\The Project Gutenberg eBook of The Raven, by Edgar Allan Poe.html";
		
		StringBuilder poemIn = new StringBuilder();
		try {
		    BufferedReader in = new BufferedReader(new FileReader(filePath));
		    String str;
		    while ((str = in.readLine()) != null) {
		        poemIn.append(str);
		    }
		    in.close();
		} catch (IOException e) {
		}
		String content = poemIn.toString();
		
		String noHtml = content.toString().replaceAll("\\<.*?>", "");
		
		String poem1 = noHtml.substring(1419, 8597);
		
		String poem2 = poem1.toString().replaceAll("[^\\x00-\\x7F]", " ");

		String poem3 = poem2.toString().replaceAll("\\p{Punct}", " ");
		
		String [] w = poem3.split("\\s+");
		
		Collections.addAll(words, w);
	}

}
