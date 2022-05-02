import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class skillsDemoPrep {

    //counts the number of each vowels there are 
    public static int getVowels(String words){
        int count = 0; 

        
        int currIndex = 0;
        while(currIndex < words.length()){
            if(words.indexOf('a', currIndex) != -1){
                count += 1;
                currIndex += 1; 
            }
            else if(words.indexOf('e', currIndex) != -1){
                count += 1;
                currIndex += 1;
            }
            else if(words.indexOf('i', currIndex) != -1){
                count += 1;
                currIndex += 1;
            }
            else if(words.indexOf('o', currIndex) != -1){
                count += 1;
                currIndex += 1;
            }
            else if(words.indexOf('u', currIndex) != -1){
                count += 1;
                currIndex += 1;
            }

        }
        
        return count;

    }
    public static void main(String[] args) throws IOException{
        Path filename = Path.of(args[0]);
        String content = Files.readString(filename);
        int vowels = getVowels(content);
        System.out.println(vowels);
    
    }

}