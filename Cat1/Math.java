import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


class Math{
    
    public static void main(String[] args) {
        try{
            File file = new File("math.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String tempStr = fileReader.nextLine();
                String[] splitStr = tempStr.split(" ");

                Calculator calcy = new Calculator(Integer.parseInt(splitStr[0]),Integer.parseInt(splitStr[2]),splitStr[1].charAt(0));
                FileWriter fileWriter = new FileWriter("math res.txt", true);
                fileWriter.write(tempStr + calcy.getResult());
                fileWriter.close();
                
            }fileReader.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}