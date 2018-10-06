


public class Test3 {
	
	public String reverse(String s){
		if(s==null||s.length()==0){
			return s;
		}
		String result="";
		String[] words = s.trim().split(" ");
		for(int i=words.length-1;i>=0;i--){
			if(!"".equals(words[i])){
				result+=words[i].toLowerCase();
				if(i>0){
					result+=" ";
				}
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		    Test3 test = new Test3();
			String s="The    sky    is     blue";
			s=test.reverse(s);
			System.out.println(s);
			
	}

}
