package ex190806;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = sc.nextInt();
		boolean b= false;
		int num = 50000;
		while(money>0) {
			if(b) {
				System.out.println(num+"원 :"+money/num);
				money=money%num;
				num=num/2;
				b=false;
			}
			else {
				System.out.println(num+"원 :"+money/num);
				money=money%num;
				num=num/5;
				b=true;
			}
		}
	}
}
