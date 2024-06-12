class Palin_for{
	public static boolean isPalindrome(String s){
		int l=s.length();
		for(int i=0;i<l/2;i++){
			if(s.charAt(i)!=s.charAt(l-i-1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		String s="tommot";
		System.out.println(s+" "+isPalindrome(s));
	}
}