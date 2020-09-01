package learning_java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aK = {"a", "b", "c", "d"};
		int[] mK = {1, 2, 3, 4};
		int i;
		int x;
		for(i=0; i<aK.length; i++)
			for(x=0; x<mK.length; x++){
		System.out.println(aK[i]+mK[x]);
		}
	}
}

