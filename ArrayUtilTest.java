package lab19;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] arr = ArrayUtil.getUserArray(6);
		System.out.println("\nPrvi niz: ");
		ArrayUtil.printArray(arr);
		int[] arr2 = ArrayUtil.getArray(5, -1);
		System.out.println("\nDrugi niz: ");
		ArrayUtil.printArray(arr2);
		ArrayUtil.copyArray2(arr, arr2);
		System.out.println("\nDrugi niz: ");
		ArrayUtil.printArray(arr);
		arr2 = ArrayUtil.getArray(5, -1);
		ArrayUtil.moveToLeft(arr, arr2);
	}
