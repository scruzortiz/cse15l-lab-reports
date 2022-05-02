import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class skillsDemoPrep {

    //counts the number of each vowels there are 
    public static ArrayList<String> getPicture(String words){
        ArrayList<String> finalList = new ArrayList<>();
        int currIndex = 0;
        while(currIndex < words.length()){
            if(words.indexOf("!", currIndex) != -1){
                int openBraket = words.indexOf("[", currIndex);
                int closeBraket = words.indexOf("]", openBraket);
                int openParen = words.indexOf("(", closeBraket);
                int closeParen = words.indexOf(")", openParen);

                finalList.add(words.substring(openParen + 1, closeParen));
                currIndex += 1;
            }
            else{
                currIndex += 1;
            }
        }

        return finalList;
    }
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getPicture(content);
	    System.out.println(links);
    }

}