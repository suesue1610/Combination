package combination;

public class Combination_lib {

	public int getFactorial(int n) { //n�̊K��
		int f = 1;
		//�K��v�Z
		for (int x = 1; x <= n; x++) {
			f = f * x;
		}
		return f;
	}
}
