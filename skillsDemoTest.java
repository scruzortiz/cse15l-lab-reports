import static org.junit.Assert.*; //imports junit Assert

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

import org.junit.*; //imports junit 
public class skillsDemoTest { //creates class for testing 
    
    @Test
    public void testcountvowels(){
        Path fileName = Path.of("math.md");
        try{
            String content = Files.readString(fileName);
            assertEquals(List.of(2, 2, 2, 2, 2), skillsDemoPrep.getVowels(content));

        }catch(IOException e){
            
        }
    }
}