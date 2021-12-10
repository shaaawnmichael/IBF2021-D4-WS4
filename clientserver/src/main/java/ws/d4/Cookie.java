package ws.d4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class Cookie {

  
        public String returnCookie() throws IOException{
            List<String> readread=new ArrayList<>();
            String ss;
            readread=Files.readAllLines(Paths.get("/Users/shawnwong/Java Docs/tan/tfip-d4/cookie/src/main/java/day4workshop/cookie_file.txt"));
            double rand = (Math.random()*readread.size());
            int x = (int) rand;
            ss=readread.get(x);
            return ss; 
          
        }

    
}
