package interest;
import java.util.*;
class Interest
{
	public double SimpleInterest(double princpal_amount,int rate,int time)
	{
		return (double)(princpal_amount*time*rate)/100f;
	}
	public double CompoundInterest(double princpal_amount,int rate,int time)
	{
		return (double)princpal_amount*(Math.pow((1+rate/100f),time));
	}
}
public class ClientApplication {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount");
		Interest obj=new Interest();
		double princpal_amount=sc.nextDouble();
		System.out.println("enter the rate");
		int rate=sc.nextInt();
		System.out.println("enter the time");
		int time=sc.nextInt();
		System.out.println(obj.SimpleInterest(princpal_amount,rate,time));
		System.out.println(obj.CompoundInterest(princpal_amount,rate,time));		
	}

}

