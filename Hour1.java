package janani;
import java.util.Scanner;
public class Hour1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int hour,hour1,mintue,mintue1;
Scanner ja=new Scanner(System.in);
hour=ja.nextInt();
hour1=ja.nextInt();
mintue=ja.nextInt();
mintue1=ja.nextInt();
System.out.println(Math.abs(hour-hour1)+" ");
System.out.println(Math.abs(mintue-mintue1)+" ");
	}

}
