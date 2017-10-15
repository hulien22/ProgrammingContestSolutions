import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		for (int i =0;i<N;i++){
			String line = input.readLine();
			line = line.replaceAll("'", "e ");
			
			boolean removeS = false;
			if(line.substring(line.indexOf(":")-2,line.indexOf(":")).equals("er") && line.substring(line.indexOf(":")+2,line.indexOf(":")+4).equals("Tu")){
				removeS = true;
			}
			else if(line.substring(line.indexOf(":")-2,line.indexOf(":")).equals("er") && line.substring(line.indexOf(":")+2,line.indexOf(":")+4).equals("Te")){
				removeS = true;
			}
			//line = line.substring(line.substring(line.indexOf(":")+1).indexOf(" ")+1);
			line = line.substring(line.indexOf(":")+2);
			line = line.substring(line.indexOf(" ")+1);
			String[] words = line.split(" ");
			//System.out.println(Arrays.toString(words));
			if (removeS==true && words[words.length-1].substring(words[words.length-1].length()-2,words[words.length-1].length()-1).equals("s"))
				line = words[words.length-1].substring(0, words[words.length-1].length()-2);
			else
				line = words[words.length-1].substring(0, words[words.length-1].length()-1);
			line = line.substring(0,line.length()-1)+line.substring(line.length()-1).toUpperCase();
			if (Arrays.asList(words).contains("le")){
				line += "-le";
			}
			 if (Arrays.asList(words).contains("la")){
				line += "-la";
			}
			 if (Arrays.asList(words).contains("les")){
				line += "-les";
			}
			
			if (Arrays.asList(words).contains("me")){
				line += "-moi";
			}
			 if (Arrays.asList(words).contains("te")){
				line += "-toi";
			}
			 if (Arrays.asList(words).contains("nous")){
				line += "-nous";
			}
			 if (Arrays.asList(words).contains("vous")){
				line += "-vous";
			}
			 if (Arrays.asList(words).contains("lui")){
				line += "-lui";
			}
			 if (Arrays.asList(words).contains("leur")){
				line += "-leur";
			}
			if (Arrays.asList(words).contains("y")){
				line += "-y";
			}
			if (Arrays.asList(words).contains("en")){
				line += "-en";
			}
			line += " !";
			line = line.replaceAll("a-e", "'e");
			line = line.replaceAll("e-e", "'e");
			line = line.replaceAll("oi-e", "'e");
			line = line.replaceAll("a-y", "'y");
			line = line.replaceAll("e-y", "'y");
			line = line.replaceAll("oi-y", "'y");
			line = line.toLowerCase();
			line = line.replaceFirst(line.substring(0,1), line.substring(0,1).toUpperCase());
			System.out.println(line);
		}
	}

}