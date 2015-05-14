package snackmachine;

abstract class Food {

	int numberOfItems;

	public int make() {
		return 1;
	}

	public int make(int count) {
		return count;
	}

	public abstract double getCalories(double weight);

	


}