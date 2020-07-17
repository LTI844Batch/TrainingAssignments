public class HappyStringNotSoHappy {
	public static void main(String args[]){
		HappyStringNotSoHappy lh=new HappyStringNotSoHappy();
			lh.longestDiverseString(1,1,7);
	}
	public String longestDiverseString(int a, int b, int c) {
	        
	     StringBuilder builder = new StringBuilder();
            int largestString = a + b + c;
            int currentA = 0, currentB = 0, currentC = 0;

            for (int i = 0; i < largestString; i++)
            {
                if ((a >= b && a >= c && currentA !=2) || (a> 0 && (currentB ==2 || currentC ==2)))
                {
                    builder.append("a");
                    currentA++;
                    currentB = 0;
                    currentC = 0;
                    a--;
//	                    System.out.println(currentA + " "+currentB+" "+currentC);
                }
                else if ((b >= a && b >= c && currentB != 2) || (b > 0 && (currentA == 2 || currentC == 2)))
                {
                    builder.append("b");
                    currentB++;
                    currentA = 0;
                    currentC = 0;
                    b--;
//	                    System.out.println(currentA + " "+currentB+" "+currentC);
                }
                else if ((c >= b && c >= a && currentC != 2) || (c > 0 && (currentB == 2 || currentA == 2)))
                {
                    builder.append("c");
                    currentC++;
                    currentA = 0;
                    currentB = 0;
                    c--;
//	                    System.out.println(currentA + " "+currentB+" "+currentC);
                }

            }
            System.out.println("Longest happy string is "+ builder.toString() );
            return builder.toString();
	}

}
