class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 3, 4, 99, 0 };
		int j = 0;
		while (j < arr.length - 1) {
			int temp = arr[j];
			int temp_index = 0;
			for (int i = j; i < arr.length; i++) {
				if (temp > arr[i]) {
					temp = arr[i];
					temp_index = i;
				}
			}
			arr[temp_index] = arr[j];
			arr[j] = temp;
			j++;

		}

		for (int a : arr)
			System.out.print(a + " ");
	}
}
