package practiceJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EncoderDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "E:\\Java Programming\\Practice\\practiceJava\\" + args[0];

		String enc_dec = args[1];

		Scanner sc = new Scanner(System.in);

		if (enc_dec.equalsIgnoreCase("encode")) {

			String msg = sc.nextLine();

			EncodeDecode ecdc = new EncodeDecode(msg, enc_dec);
			try {
				FileWriter file = new FileWriter(filePath, true);
				file.write(ecdc.getEncode());
				System.out.println("Written");
				file.close();
			} catch (Exception e) {

			}

		} else {
			try {
				File file = new File(filePath);
				Scanner scan = new Scanner(file);
				String enc_msg = scan.nextLine();
				System.out.println(enc_msg);
				EncodeDecode ecdc = new EncodeDecode(enc_msg, enc_dec);
				System.out.println(ecdc.getDecode());

			} catch (Exception e) {

			}
		}

	}
}

	class EncodeDecode {
		private String msg;
		private String encoded_msg;
		private String decoded_msg;

		EncodeDecode() {
			this.msg = "x";
		}

		EncodeDecode(String msg) {
			this.msg = msg;
		}

		EncodeDecode(String msg, String encode_decode) {
			this.msg = msg;

			if (encode_decode.equalsIgnoreCase("encode")) {
				encode();
			} else {
				decode();
			}

		}

		private void encode() {

			char[] msgArr = this.msg.toCharArray();

			for (int i = 0; i < msgArr.length; i++) {
				int enc = String.valueOf(msgArr[i]).hashCode() + 3;
				msgArr[i] = (char) enc;
			}

			this.encoded_msg = String.valueOf(msgArr);
		}

		private void decode() {

			char[] msgArr = this.msg.toCharArray();

			for (int i = 0; i < msgArr.length; i++) {
				int dec = String.valueOf(msgArr[i]).hashCode() - 3;
				msgArr[i] = (char) dec;
			}

			this.decoded_msg = String.valueOf(msgArr);
		}

		String getEncode() {
			return this.encoded_msg;
		}

		String getDecode() {
			return this.decoded_msg;
		}

	}
