package sort_types.factory;

import sort_types.sorts.BubbleSort;
import sort_types.sorts.HeapSort;
import sort_types.sorts.InsertionSort;
import sort_types.sorts.MergeSort;
import sort_types.sorts.QuickSort;
import sort_types.sorts.SelectionSort;
import sort_types.sorts.ShellSort;
import sort_types.sorts.Sort;

public class SortFactory {

	public static Sort getSort( SortEnum sortEnum ) {
		
		switch (sortEnum) {
		
		case SELECTION_SORT:
			return new SelectionSort();
			
		case QUICK_SORT:
			return new QuickSort();
			
		case MERGE_SORT:
			return new MergeSort();
			
		case BUBBLE_SORT:
			return new BubbleSort();
			
		case INSERTION_SORT:
			return new InsertionSort();
			
		case SHELL_SORT:
			return new ShellSort();
			
		case HEAP_SORT:
			return new HeapSort();
		}
		
		throw new UnsupportedOperationException("Unsupported sort: " + sortEnum);
	}	
}
