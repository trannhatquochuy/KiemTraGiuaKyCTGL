
public class Cau2 {
	//A) Dem so phan tu chan
	public static int demPhanTuChan(int [] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 ==0) {
				count++;
			}
		} 
		return count;
	}
	//B) Kiem tra gia tri tang dan
	public static boolean kiemTraTangDan(int [] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	// C) Dem so trong khoang
	public static int demSoTrongKhoang(int[] arr, int start, int end) {
		int count = 0;
		for (int num : arr) {
			if (num >= start && num <= end) {
				count++;
			}
		}
		return count;
	}
	//D) Tinh tong cac gia tri trong mang
	public static int tinhTong(int[] arr) {
		int total = 0;
		for (int num : arr) {
			total += num;
		}
		return total;
	}
	//E) Tinh Tong Cac Phan Tu Co Gia Tri Le
	public static int tinhTongLe(int[] arr) {
		int total = 0;
		for (int num : arr) {
			if(num % 2 != 0) {
				total += num;
			}
		}
		return total;
	}
	// F) Sap Xep Theo Gia Tri Noi Bot
	public static boolean sapXepTang(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for (int j=0; j<n-i-1; j++ ) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1]=temp;
				}
			}
		}
		return false;
	}
	//G)Tim Gia Tri Lon Nhat
	public static int timGiaTriLonNhat(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int [] arr = {8,7,3,2,4,6,12};
		// a. Đếm số phần tử chẵn trong mảng
        int countEven = demPhanTuChan(arr);
        System.out.println("Số phần tử chẵn trong mảng: " + countEven);

        // b. Kiểm tra mảng có được sắp xếp tăng dần hay không
        boolean isSorted = sapXepTang(arr);
        if (isSorted) {
            System.out.println("Mảng được sắp xếp tăng dần");
        } else {
            System.out.println("Mảng không được sắp xếp tăng dần");
        }

        // c. Đếm số phần tử có giá trị từ 4 đến 12 trong mảng
        int countInRange = demSoTrongKhoang(arr, 4, 12);
        System.out.println("Số phần tử trong khoảng từ 4 đến 12: " + countInRange);

        // d. Tính tổng các phần tử trong mảng
        int sum = tinhTong(arr);
        System.out.println("Tổng các phần tử trong mảng: " + sum);

        // e. Tính tổng các phần tử có giá trị lẻ trong mảng
        int sumOdd = tinhTongLe(arr);
        System.out.println("Tổng các phần tử lẻ trong mảng: " + sumOdd);

        // f. Sắp xếp mảng theo giải thuật nổi bọt
        sapXepTang(arr);
        System.out.println("Mang sau khi sap xep tang dan: " + arr.toString());

        // g. Tìm giá trị lớn nhất trong mảng
        int max = timGiaTriLonNhat(arr);
        System.out.println("Gia tri lon nhat trong mang: " + max);
    }

	}
	

