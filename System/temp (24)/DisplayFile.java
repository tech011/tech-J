package slip24;
import java.io.*;
public class DisplayFile {
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("Ennter the File name please:=");
            return;

        }
        try{
     
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        
        }catch(Exception e){
            System.out.println("Not found");
        }
        

    }
    
}