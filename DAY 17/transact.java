import ttransaction.*;
import java.io.*;
import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class transact{
    public static void main(String[] args){
        transaction tran = new transaction();
        Scanner scan = new Scanner(System.in);
        char choi='n';
        int Sales=0;
        int salesno=0;
        do{
            System.out.println("\n1. Purchase\n2. View Total Number of Sales\n3. View Total Sales Amount");
            System.out.println("Enter your choice:");
            int choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:

                String item,qty,price,str;
                char ch;
                int total=0;
                LocalTime dte = LocalTime.now();
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH.mm.ss");
                String filename=dte.format(formatter);
                filename="files.txt";
                System.out.println(filename);
                try{
                    FileWriter writer=new FileWriter(filename,true);
                    do{
                        System.out.println("\nEnter the item:");
                        item=scan.nextLine();
                        System.out.println("\nEnter the quantity:");
                        qty=scan.nextLine();
                        System.out.println("\nEnter the unit price:");
                        price=scan.nextLine();
                        int tot=Integer.parseInt(qty)*Integer.parseInt(price);
                        total=total+tot;
                        Sales=Sales+total;
                        salesno++;
                        str=item+","+qty+","+price+","+String.valueOf(tot);
                        writer.write(str+"\n");
                        System.out.println("Do you want to purchase more?(y/n):");
                        ch=scan.nextLine().charAt(0);
                    }while(ch=='y');
                    writer.write(String.valueOf(total)+"\n");
                    System.out.println("Total price:"+total);


                    System.out.println("\nWelcome to the Payment Portal");
                    System.out.println("\n Select the method of Payment\n1. Cash\n2. Card");
                    int pay=Integer.parseInt(scan.nextLine());
                    switch(pay){
                        case 1:
                            // System.out.println("Enter the amount:");
                            // int amt=Integer.parseInt(scan.nextLine());
                            System.out.println("Enter the cash received:");
                            int rec=Integer.parseInt(scan.nextLine());
                            tran.cash_trnsctn(total,rec);
                            try{
                                // FileWriter writer=new FileWriter("cash.txt",true);
                                writer.write(tran.cash_trnsctn(total,rec)+"\n");
                                writer.close();
                            }
                            catch(Exception e){
                                System.out.println("Error");
                            }
                            
                            break;

                        case 2:
                            System.out.println("Enter the customer name:");
                            String name=scan.nextLine();
                            System.out.println("Enter the card number:");
                            String crdno=scan.nextLine();
                            System.out.println("Enter the amount:");
                            int amnt=Integer.parseInt(scan.nextLine());
                            tran.card_trnsctn(amnt,crdno,name);
                            try{
                                writer.write(tran.card_trnsctn(amnt,crdno,name)+"\n");
                                writer.close();
                            }
                            catch(Exception e){
                                System.out.println("Error");
                            }

                    }
                }
            
            catch(Exception e){
                System.out.println("Totally error");
            }
            break;


            case 2:
                System.out.println("Total number of sales:"+salesno);
                break;

            case 3:
                System.out.println("Total Sales:"+Sales);
                break;
            }
        System.out.println("Do you want to continue?(y/n)");
        choi=scan.nextLine().charAt(0);
        }while(choi=='y');
    }
}