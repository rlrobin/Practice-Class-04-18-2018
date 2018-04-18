import java.util.Random;
public class Nesone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand=new Random();
int [] list=new int [50];
	for (int i=0; i<list.length; i++)
	{
		list[i]=rand.nextInt(30-20)+20;
		System.out.println(list[i]);
	}
	}

}
