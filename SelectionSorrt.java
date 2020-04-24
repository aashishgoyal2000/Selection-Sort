class SelectionSorrt {

	public static void sort(Comparable[] arr){
		for (int i = 0; i < arr.length; i++) { 
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min].compareTo(arr[j]) > 0) {
					min = j;
				}
			}
			exch(arr, min, i);
		}
	}

	public static void exch(Comparable[] arr, int a,int b){
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	

}