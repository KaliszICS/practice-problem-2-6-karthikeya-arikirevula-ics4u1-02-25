public class PracticeProblem {

	public static void main(String args[]) {

	}

		public static int[] bubbleSort(double[] num){
				int[] variable = new int[2];
				for(int i = 0; i < num.length; ++i){
						boolean sort = true;
						for(int j = 0; j < num.length-i-1; ++j){
								variable[1]++;
								if(num[j] > num[j+1]){
										double temp = num[j];
										num[j] = num[j+1];
										num[j+1] = temp;
										sort = false;
										variable[0] += 3;
								}
						}
						if(sort){
								break;
						}
				}
				return variable;
		}

		public static int[] selectionSort(double[] num){
				int[] variable = new int[2];
				for(int i = 0; i < num.length-1; ++i){
						int maxIndex = i;
						for(int j = i+1; j < num.length; ++j){
								variable[1]++;
								if(num[j] < num[maxIndex]){
										maxIndex = j;
										variable[0]++;
								}
						}
						double temp = num[i];
						num[i] = num[maxIndex];
						num[maxIndex] = temp;
						variable[0] += 3;
				}
				return variable;
		}

		static int[] insertionSort(double[] num){
				int[] variable = new int[2];
				for(int i = 1; i < num.length; ++i){
						double key = num[i];
						variable[0]++;
						int index = i-1;
						for(;index > -1 && key < num[index]; --index){
								variable[1]++;
								num[index+1] = num[index];
								variable[0]++;
						}
						num[index+1] = key;
						variable[0]++;
				}
				return variable;
		}
	public static String leastSwaps(double[] nums) {
		double[] num1 = nums.clone();
		double[] num2 = nums.clone();

		int bswaps = bubbleSort(nums)[0];
		int sSwaps = selectionSort(num1)[0];
		int iSwap = insertionSort(num2)[0];

		if(bswaps <= iSwap && bswaps <= sSwaps){
			return "Bubble";
	}else if(iSwap <= sSwaps){
			return "Insertion";
	}else{
			return "Selection";
	}

	}
	public static String leastIterations(double[] nums) {
		double[] num1 = nums.clone();
		double[] num2 = nums.clone();

		int bComps = bubbleSort(nums)[1];
		int sComps = selectionSort(num1)[1];
		int iComps = insertionSort(num2)[1];

		if(bComps <= iComps && bComps <= sComps){
			return "Bubble";
	}else if(iComps <= sComps){
			return "Insertion";
	}else{
			return "Selection";
	}
	}
}