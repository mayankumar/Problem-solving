class total
{
	public static void main(String[] args) {
		int n=32;
		int total=0;
		for(int i=0;i<n;i++)
			total=total|(1<<i);

		System.out.println(total);
	}
}