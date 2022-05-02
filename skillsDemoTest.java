import static org.junit.Assert.*; //imports junit Assert

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

import org.junit.*; //imports junit 
public class skillsDemoTest { //creates class for testing 
    
    @Test
    public void testgetitaly(){
        Path fileName = Path.of("words.md");
        try{
            String content = Files.readString(fileName);
            assertEquals(List.of("image.jpg"), skillsDemoPrep.getPicture(content));
        }catch(IOException e){

        }
    }
}