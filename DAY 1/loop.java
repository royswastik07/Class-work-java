import java.io.*;

class loop{
    public static void main(String[] args) {
		System.out.println("USING WHILE1");
		int a = 1;
			while(a<10)
			{
				System.out.print(a+",");
				a++;
			}
		System.out.println(" ");
		System.out.println("USING WHILE2");
		int b = 1;
			while(b<10)
			{
				System.out.println(b);
				b++;
			}
		System.out.println(" ");
		System.out.println("USING FOR1");
			for(int i=0;i<10;i++)
			{
				System.out.print(i+",");
			}
		System.out.println(" ");
		System.out.println("USING FOR2");
		for(int j=0;j<10;j++)
			{
				System.out.println(j);
			}
    }
}