class Bubblesort{
	public static void BS(int[] arr){
		int n=arr.length;
		boolean swapped;
	
		for(int i=0;i<n-1;i++){
			swapped=false;
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped){
				break;
			}
		}
	}
	public static void main(String args[]){
		int[] n={34,82,64,24,4};
		for(int num:n){
			System.out.println(num+" ");
		}
		BS(n);
		System.out.println("after");
		for(int num:n){
			System.out.println(num+" ");
		}
	}
	
}