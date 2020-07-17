import java.util.*;

public class BiValueSliceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,5,4,10,10,10,10};
		//works for some cases
		
		BiValueSliceArrayTest sol = new BiValueSliceArrayTest();
		int result = sol.numSteps(a);
		System.out.println(result);
	}
}

class BiValueSliceArrayTest {
    public int numSteps(int[] A) {
    	
    	int localSum = A[0];
    	int globalSum = A[0];	
    	int numCount = 1; 		//length of queue 
    	int eleCount = 1; 		//how many different elements are there
    	
    	HashSet<Integer> elements = new HashSet<Integer>(); // store diff ele
    	elements.add(A[0]);
    	Queue<Integer> q = new LinkedList<>(); // store all collected ele
    	q.add(A[0]);
    	
    	
    	for(int i = 1 ; i < A.length ; i++) {
//    		System.out.println("i = "+i+" peek " +q.peek()+
//    				" GS "+globalSum+ " NC and Queue "+ numCount + " "+ q.size() + 
//    				" EC and hashset "+ eleCount +" "+ elements.size() );
    		System.out.println(elements);


    		if(A[i] == A[i-1] ) // || elements.contains(A[i])) {
    		{
    			elements.add(A[i]);
    			q.add(A[i]);
    			localSum = localSum + A[i];
    			globalSum = globalSum > localSum ? globalSum : localSum;
    			
      		}
    		else {
    			if(eleCount < 2) {            
    				elements.add(A[i]);
    				eleCount++;
    				q.add(A[i]);
    				localSum = localSum + A[i];
    				
    			}
    			
    						//sum check should be made
    			else {						// if found a next bigger number for Sum 
    				int head = q.peek(); 	// find head of the queue
    				if(A[i] > q.peek()) {
//    					System.out.println(elements.remove(q.peek()));
    					while(head == q.peek()) {   // remove the smaller candidate
    						localSum = localSum - q.peek();
    						elements.remove(q.peek());
        					q.remove();        					
        				}
    					q.add(A[i]); // adding the new bigg element
    					localSum = localSum + A[i];
    				}
    				
       			}
    			globalSum = globalSum > localSum ? globalSum : localSum;
    		}
    		globalSum = globalSum > localSum ? globalSum : localSum;
    	}
    	return q.size();

    }
}
