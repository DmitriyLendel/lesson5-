package snackmachine;

public class Coffee extends Drink {
	public final static double kl = 3789.25;
	public final static double k0 = 100;

	@Override
	public int make(int count) {

		if (count <= 0)
			return 0;

		return count;
	}

	public double getCalories(double weight, int t) {
		// int t = 1;
		if (weight < 0) {
			return 0;
		} else {
			if (t <= 0) {
				return k0 * weight;
			} else {
				System.out.println(t + ' ' + weight);
				return (kl * (t / (t + 10))) * weight;
			}
		}

	}

	@Override
	public double getCalories(double weight) {
		// Auto-generated method stub
		return getCalories(weight, 18);

	}

}