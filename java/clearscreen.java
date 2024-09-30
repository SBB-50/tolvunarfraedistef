//imports
import java.util.*;
import java.lang.Thread;

    public class clearscreen  
    {  
    public static void main(String[] args);  
    try{{
    for (int j = 0; j < 5; j++){    
    int leftlimit = 97; // a
    int rightlimit = 122; // z
    int targetstringlength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetstringlength);
    for (int i = 0; i < targetstringlength; i++){
        int randomlimitedint = leftlimit + (int)
            (random.nextFloat() * (rightlimit - leftlimit + 1));
        buffer.append((char) randomlimitedint);
    }
    String generatedString = buffer.toString();
    System.out.println(generatedString);
    Thread.sleep(500);
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    }
    }  
    }
    catch (Exception e);{
        System.out.println(e);
        }
    }  
