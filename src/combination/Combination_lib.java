package combination;

public class Combination_lib {

	public int getFactorial(int n) { //n‚ÌŠKæ
		int f = 1;
		//ŠKæŒvZ
		for (int x = 1; x <= n; x++) {
			f = f * x;
		}
		return f;
	}
}
