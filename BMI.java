public class BMI
	public static void main(String [] args) {
		Sttring name = "Zach Weldon";
		double bmi, ht = 60, wt = 100;
		
		bmi= 703 * wt / ht * ht;
		System.out.println(name + " has a bmi of " + bmi);
		System.out.println("Height is " + ht + " inches");
		System.out.println("Weight is " + wt + " pounds");
		}
	}