package sort_types.sorts;

public abstract class Sort {

	public void printArray(int arr[], String type) {
    	
    	System.out.println( type );
    	
        int n = arr.length;
        
        if ( n <= 50 ) {
        	for (int i = 0; i < n; ++i) {
        		System.out.print(arr[i]+" ");
        	}
		}
        
        System.out.println("\n");
    }
	
	public abstract void sort(int arr[]);	
}
