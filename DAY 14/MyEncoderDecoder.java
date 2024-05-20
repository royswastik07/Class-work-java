// Write a java program for encoding & decoding 
// a filename that has been passed as command line argument.
// javac myencoderdecoder.java
// java myencoderdecoder filename.txt encode
// java myencoderdecoder filename.txt decode
import java.util.Scanner;

class EncoderDecoder{

    private String msg;
    private String encd_char = "abcdefghijklmnopqrstuvwxyz";
    private String decd_char = "nprjwzgfaklyechsdxmtqbuvoi";

    EncoderDecoder(){

    }

    EncoderDecoder(String msg){

    }

    EncoderDecoder(String msg,String encode_decode){
        if(encode_decode.equals("encode")){
            this.msg=encode();
        }
        else{
            this.msg=decode();
        }

    }

    private String encode(){
        String temp =" ";
        for (int i = 0;i<this.msg.length;i++){}
        return temp;
    }

    private String decode(){

    }

    public String getMsg(){
        return this.msg;
    }
}

public class MyEncoderDecoder{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int choice;
        EncoderDecoder myObj = new EncoderDecoder();
    }
}