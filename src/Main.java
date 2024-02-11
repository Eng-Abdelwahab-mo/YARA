import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("###################");
            System.out.println("      Yara");
            System.out.println("      v:1");
            System.out.println("###################");
            System.out.println("1- Write information");
            System.out.println("2- read information");
            System.out.println("3- some math opreations");
            System.out.println("choose opretion");
            int choices=scanner.nextInt();

            File file = new File("C://Users//YM//IdeaProjects//untitled2//src//yara.text");
            double age ;
            String name ;
            /*while (choices!=0){}*/
            switch (choices) {
                case 1:
                    System.out.println("Inter your name");
                    name = scanner.next();
                    System.out.println("Inter your age");
                    age = scanner.nextDouble();
                    System.out.println("your name is : " + name);
                    System.out.println("your age is : " + age);
                    FileWriter fw=new FileWriter(file);
                    PrintWriter pw=new PrintWriter(fw);
                    pw.println(name);
                    pw.println (age);
                    pw.close();
                    break;
                case 2:
                    Scanner s= new Scanner(file);
                    System.out.println(s.next());
                    System.out.println(s.next());
                    break;
                case 3:
                    System.out.println("1- +");
                    System.out.println("2- -");
                    System.out.println("3- *");
                    System.out.println("4- /");
                    choices=scanner.nextInt();
                    Scanner s1= new Scanner(file);
                    System.out.println("inter your number");
                    int num =scanner.nextInt();
                    String name1=s1.next();
                    Double age1= s1.nextDouble();
                    switch (choices){
                        case 1:
                            System.out.println(age1+num);
                            break;
                        case 2:
                            System.out.println(age1-num);
                            break;
                        case 3:
                            System.out.println(age1*num);
                            break;
                        case 4:
                            System.out.println(age1/num);
                            break;
                    }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}