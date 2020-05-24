package andy319.io.exploresourcecode.review2020;

/**
 * 描述：二分查找，首先得是有序数组
 * //可以变形为找左边第一个，最后一个之类的
 * 作者：AndyMa
 * 时间：  2020/5/16 21:18
 */
public class BinarySearch {

    public static void main(String args[]) {
        int array[] = {1, 3, 4, 6, 9, 9, 9, 9, 10, 25, 56};
        int point = search(array, 9);
        System.out.println(point);
        
    }

    private static int search(int a[], int value) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (a[mid] > value) {
                right = mid - 1;
            } else if (a[mid] < value) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
