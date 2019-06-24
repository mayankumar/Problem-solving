/*97 86 94 47 74 3 50 39 11 34 66 2 67 67 64 93 54 4 69 32 26 68 20 9 1 3 16 32 17 9 32 13 46 77 59 19 80 60 57 42 94 74 43 12 40 58 4 45 62 73 28 39 92 100 47 92 2 62 24 18 22 55 82 67 83 40 38 14 52 94 55 45 68 49 56 59 7 11 56 20 35 83 58 27 82 56 70 35 69 93 4 90 99 37
*/
import java.util.*;
class Testcase
{
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		for(int i=0;i<94;i++)
			a.add(in.nextInt());
		System.out.println(a.get(46));
	}
}