//question2
/*
 A Zero Indexed Array A consisting of N integers is given. A pair of integers (P,Q) such that 0<=P<=Q
that, given an Array A consisting of N integers, returns the size of the largest bi-valued slice in A.
 */
import java.util.*;
public class BiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,4,5,0,12};
		int ans=solution(a);
		System.out.println(ans);
	}
	public static int solution(int[] A) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		int initial =0,i=0;
		int[] B = new int[2];
		B[0]=-1;B[1]=-1;
		for(;i<A.length;i++) {
			if(B[0]==-1) {
				B[0] = A[i];
			}else if(B[1]==-1) {
				B[1] = A[i];
			}else {
				if(B[0]!=A[i] && B[1]!=A[i]) {
					l.add(i-initial);
					initial = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		}
		l.add(i-initial);
		return Collections.max(l);
	}

}
