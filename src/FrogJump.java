

//find out how many jumps it takes the frog to get from point X to point Y
//based on its jump interval D
//it must at least cross or land on Y on the last jump
public class FrogJump {
	public static void main(String[] args)
	{
		System.out.println(solution(10,85,24));
		System.out.println(solution(10,85,30));
	}
	
	//x= starting point
	//y = end point
	//d = jump distance
	public static int solution(int X, int Y, int D)
	{
		//edge cases
		if (D == 0)
		{
			return -1;
		}
		else if (Y == X)
		{
			return 1;
		}
		
		else if (D > (Y-X))
		{
			return 1;
		}
		else if ((Y-X)%D == 0)
		{
			return (Y-X)/D;
			
		}
		else
		{
			//the logic here is that if there is any decimal point, we need to add another jump
			
			//cast to doubles, then divide
			
			return (int) Math.ceil(((double)Y-(double)X)/(double)D);
		}
	}
}
