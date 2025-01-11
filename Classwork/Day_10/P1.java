
class OpPairCount{

	public static void main(String[] args){
	
		char carr[] = new char[]{'a','a','g','b','d','g','a'};
		
		int countOfA = 0;
		int pairOfAgCount = 0;
		
		for(int i = 0; i < carr.length; i++){
			
			if(carr[i] == 'a')
				countOfA++;
			
			if(carr[i] == 'g')
				pairOfAgCount = pairOfAgCount + countOfA;
		}
		
		System.out.println(pairOfAgCount);
	
	}

}