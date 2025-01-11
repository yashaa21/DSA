
class PairOfAlphabets{

	public static void main(String[] args){
	
		char ch[] = new char[]{'b' , 'a' , 'a' , 'g' , 'd' , 'c' , 'a' , 'g'};
		int count = 0;
		int iterations = 0;
		
		for(int i = 0; i < ch.length - 1; i++){
			
			if(ch[i] == 'a'){
			
				for(int j = i + 1; j < ch.length; j++){
				
					if(ch[i] == 'a' && ch[j] == 'g'){

						count++;
					}
					iterations++;
				
				}
			}
		}
		
		System.out.println(count);
		System.out.println("No. of Iterations : " + iterations);
	
	}

}