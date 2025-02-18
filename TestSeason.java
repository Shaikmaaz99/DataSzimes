package DataSzime;
import java.util.*;
public class TestSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi...Iam Your Data Szime \n I will be Handling Soo Many Datas For You \n Use Me As You Can");
		System.out.println("Hey I Came For You To make Your Life Make Tasty And Joyfull");
		int ch=0;
		do {
		System.out.println("Which Season Data You want");
		System.out.println("\n 1.Summer \n 2.Monsoon   \n 3.Winter");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Data You Have Choosen is Summer \n I will Provide You Data of Summer Season In India ");
		Summer summ=new Summer();
		summ.SummerDetails();
		break;
		case 2:System.out.println("Data You Have Choosen is Monsoon \n I will Provide You Data of Monsoon Season In India");
		Monsoon mon=new Monsoon();
		mon.MonsoonDetails();
		break;
		case 3:System.out.println("Data You Have Choosen is Winter \n I will Provide You Data of Winter Season In India");
		Winter win=new Winter();
		win.WinterDetails();
		break;
		}
		System.out.println("Do you want to continue Press \n 1.Yes \n 2.No");
		ch=sc.nextInt();
	}while(ch==1);
		System.out.println("Thank You For Using Data Szime \n We are Stepping Ahead For Your Requirement");
		System.out.println("Data Szime is Updating Many Things \n We will Reach Us To You Soo SOON!!!");
		System.out.println("Have A Data Day!!! ");
	}

}
