package snackmachine;

public class Toast extends Food {
	public final static double k = 3323.43;

	@Override
	public int make(int count) {

		if (count <= 0)
			return 0;

		return count;
	}

	@Override
	public double getCalories(double weight) {
		if (weight<=0) {return 0;} else
		return k * weight;
	}
}