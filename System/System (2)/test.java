import stroperation.conc;
import stroperation.com;
import java.util.*;
class test{
    public static void main(String args[]){
    conc c = new conc();
    com cm = new com();

    Scanner sc = new Scanner(System.in);

    System.out.println("ENter the Stirng:=");
    String s1 = sc.nextLine();
    
    System.out.println("ENter the Stirng2:=");
    String s2 = sc.nextLine();
    c.concate(s1, s2);
    cm.compare(s1, s2);
    }
    
}