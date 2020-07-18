package lesson16;
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SMS messages are really short";
		int k = 12;
		Aclass aobj = new Aclass();
		int response = aobj.solution(k,s);
		System.out.println("response from class is..."+response);

	}

}
class Aclass
{
	public int solution(int K,String S)
	{
		int count = 0;
		int n = S.length();
		while(n!=0)
		{
			int  i;
			for(i=0;i<K;i++)
			{
				n--;
			}
			if(S.charAt(i)==' ')
			{
				count++;
			}
			else
			{
				int j;
				for(j=i-1;j>=0;j--)
				{
					if(S.charAt(j)!=' ')
					{
						n++;
					}
					else
					{
						count++;
						break;
					}
				}
			}
			if(n<K)
			{
				count++;
				break;
			}
		}
		return count;
	}
}
