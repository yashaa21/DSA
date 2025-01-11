import java.util.*;

class SortedStackDemo{
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	SortedStackDemo(Stack<Integer> s1,Stack<Integer> s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	Stack<Integer> merge(){
		
		

		int[] arr1 = new int[s1.size()];
		int[] arr2 = new int[s2.size()];
		
		
		
		for(int i = arr1.length - 1; i >= 0; i--){
			
			arr1[i] = this.s1.pop();
		}
		
		for(int i = arr2.length - 1; i >= 0; i--){
			
			arr2[i] = this.s2.pop();
		}
		
		
		int p1 = 0;
		int p2 = 0;
		Stack<Integer> sortedStack = new Stack<Integer>();
		
		while(p1 < arr1.length && p2 < arr2.length){
			
			if(arr1[p1] < arr2[p2]){
				sortedStack.push(arr1[p1]);
				p1++;
			}
			else{
				sortedStack.push(arr2[p2]);
				p2++;
			}
		}
		
		while(p1 < arr1.length){
			sortedStack.push(arr1[p1]);
			p1++;			
		}
		
		while(p2 < arr2.length){
			sortedStack.push(arr2[p2]);
			p2++;			
		}
		
		
		//System.out.println(sortedStack);
		return sortedStack;
		
	
	}

}

class Client{

	public static void main(String[] args){
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		s1.push(1);
		s1.push(3);
		s1.push(9);
		s1.push(10);
		s1.push(11);
		s1.push(12);
		
		s2.push(2);		
		s2.push(4);		
		s2.push(5);		
		s2.push(6);		
		s2.push(7);		
		
		SortedStackDemo ss = new SortedStackDemo(s1,s2);
		
		Stack<Integer> sortedStack = ss.merge();
		
		System.out.println(sortedStack);
	
	}

}

