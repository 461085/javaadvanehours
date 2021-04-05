package day06;

public class Question04 {

	public static void main(String[] args) {
		// Bir Array'e uzunlugundan fazla eleman eklemeye calisin ve 
		//karsilasicaginiz Exception'i handle edin
		int arr[] = {2, 15, 67, 2, 56};
        
        try {
            arr[5] = 23;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array'in uzunlugundan fazla eleman ekleyemezsiniz");
        }
	}

}
