import java.util.Random;

public class HoRandom extends Random{
	
	@Override
	public int nextInt(int bound) {
		int x = super.nextInt(bound);
		return (x % 2 == 0) ? nextInt(bound) : x;
	}
}
