package ejercicios5;

public final class Math3 implements Extremos{

	
	
	
	@Override
	public int min(int[] a) {
		int min = Integer.MAX_VALUE;
		if(a.length>0)
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) min=a[i];
		}
		return min;
	}

	@Override
	public int max(int[] a) {
		int max = Integer.MIN_VALUE;
		if(a.length>0)
			for (int i = 0; i < a.length; i++) {
				if(a[i]>max) max=a[i];
			}
		return max;
	}

	@Override
	public double min(double[] a) {
		double min = Double.MAX_VALUE;
		if(a.length>0)
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) min=a[i];
		}
		return min;
	}

	@Override
	public double max(double[] a) {
		double max = Double.MIN_VALUE;
		if(a.length>0)
			for (int i = 0; i < a.length; i++) {
				if(a[i]>max) max=a[i];
			}
		return max;
	}
	
}
