package sort_types;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import sort_types.factory.SortEnum;
import sort_types.factory.SortFactory;
import sort_types.sorts.Sort;

public class SortTest {

	public static int[] randomArray( int totNum ) {
		
		int[] arr = new int[totNum];
		Random rand = new Random();
		
		for (int i = 0; i < totNum; i++) {
			arr[i] = rand.nextInt();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = SortTest.randomArray( 5_000 );
		
		Stream<SortEnum> stream = Arrays.stream( SortEnum.values() );
		
        stream.forEach( x -> { 
        	
        	final Sort sort = SortFactory.getSort( x );
    		
    		LocalDateTime begin = LocalDateTime.now();    		
    		sort.printArray( arr, String.join(" ", x.toString(), "Unordered") );
    		
    		sort.sort( arr );
    		
    		LocalDateTime end = LocalDateTime.now();
    		
    		long diff = ChronoUnit.MILLIS.between(begin, end);
    		
    		String msg = String.join(" ", x.toString(), "Ordered in", ""+ diff, "MILLIS");
    		
    		sort.printArray(arr, msg); 
        });
	}
}
