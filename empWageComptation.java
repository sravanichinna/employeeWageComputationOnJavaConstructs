import java.util.Random;
public class empWageComptation{
	public static void main(String args[])
	{
		System.out.println("welcome to employee wage Computation");
		Random random=new Random();
                int randomNum=random.nextInt(2);
                System.out.println("Random number: "+randomNum);
                int isPresent=1;
                if(randomNum==isPresent)
                {
                        System.out.println("employee is present");
                }
                else
                {
                        System.out.println("employee is absent");
                }
	}
}
