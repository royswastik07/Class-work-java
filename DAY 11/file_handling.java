import java.io.File;
import java.io.IOException;
public class file_handling {

    public static void main(String [] args ){
        try{
            File myFileObj = new File("data.csv");
            if (myFileObj.createNewFile()){
                System.out.println("file created " + myFileObj.getName());
            }
            else{
                System.out.println("file already exist:");
            }
        }
        catch(IOException e ){
            System.out.println("an error");
            e.printStackTrace();
        }
        finally{
            System.out.println("love you");
        }
    }
}