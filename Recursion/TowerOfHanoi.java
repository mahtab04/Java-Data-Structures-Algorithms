package recursion_basics;

public class TowerOfHanoi {
	public static void towerOfHanoi(int disks, char source, char auxillary, char destination) {
		if (disks == 0)
			return;
		if (disks == 1) {
			System.out.println("Source" + " " + "Destination");
			System.out.println(source + "      " + destination);
		} else {
			towerOfHanoi(disks - 1, source, destination, auxillary);
			System.out.println("Source" + " " + "Destination");
			System.out.println(source + "      " + destination);
			towerOfHanoi(disks - 1, auxillary, source, destination);
		}

	}

	public static void main(String[] args) {
		int disks = 5;
		towerOfHanoi(disks, 'A', 'B', 'C');

	}

}
