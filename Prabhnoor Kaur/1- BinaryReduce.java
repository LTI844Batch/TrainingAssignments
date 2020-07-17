class BinaryReduceTest {
    public int numSteps(String s) {
    	int num = Integer.parseInt(s);
    	if(num == 1 ) {
        	return 0;
        }
    	
    	ArrayList<Integer> int_rep  = new ArrayList<Integer>();
    	
    	// make binary to int 
    	for (int i = 0 ; i < s.length() ; i ++) {
    		int_rep.add(num % 10);
    		num=num / 10;
    	}
//    	System.out.println(int_rep);
    	
    	num = 0; //reinitialize
    	Double num1 = 0.0;
    	for (int i = int_rep.size()-1 ; i > -1 ; i--) {
    		if(int_rep.get(i) == 1) {
    			num1 = num1 + Math.pow(2, i);
    		}
//    		System.out.println("num build "+ i +" "+ num1);
    	}
//    	System.out.println(Math.round(num1));
    	
    	int count  = 0 ;
    	if(num1 != 1) {
    	while(num1 != 1) {
	    	if(num1 % 2 == 0) {
	    		num1 = num1 / 2;
	    		}
	    	else {
	    		num1 = num1 + 1;
	    		}
	    	count++;			//counting steps
	    	}
    	}
    	else {
    		count = 1;
    	}
    	
    	return count;
    }
}
