import java.util.Scanner;
public class finobacci {
    
public static void main(String[] args) {

    Scanner inp=new Scanner(System.in);

    System.out.print("Finobacci serimiz kaç elemanlı olacak?");
    int n=inp.nextInt();

    int ilkEleman=0, ikinciEleman=1; int toplam = 0;

    for (int i = 0; i < n; i++) {
        System.out.print(ilkEleman+" ");
        toplam =ilkEleman+ikinciEleman;
        ilkEleman= ikinciEleman;
        ikinciEleman=toplam;
        //ikinciEleman =ilkEleman;
    
    }
    
}
}