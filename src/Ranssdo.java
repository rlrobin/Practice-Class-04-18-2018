import java.util.Random;
public class Ranssdo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int number=rand.nextInt(6);
		System.out.println(number);

		System.out.println("This is a random array");
		int []numbers= new int[5];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=rand.nextInt(6)+1;
			System.out.println(numbers[i]);
		}
	}

}
