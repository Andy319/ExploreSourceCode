package andy319.io.exploresourcecode.algrithm;

/**
 * 描述：快速排序
 * 作者：mady@akulaku.com
 * http://wiki.jikexueyuan.com/project/easy-learn-algorithm/fast-sort.html
 * 时间： 2019/2/26
 */
public class QuickSort {

    static int array[] = {100, 9, 3, 4, 5, 1, 2, 6, 7,90,56,4,33};

    public static void main(String args[]) {
        quickSort(0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }
    static void quickSort(int left,int right){
        int i,j,t,temp;
        if(left>right){
            return;
        }
        temp=array[left];
        i=left;
        j=right;
        while (i!=j){

            while (array[j]>=temp&&i<j){ //先从右边找到比基准值小的
                j--;
            }
            while (array[i]<=temp&&i<j){ //从左边找第一个比基准值大的
                i++;
                System.out.println("i="+i);
            }
            //将这两个值交换
            if(i<j){
                t=array[i];
                array[i]=array[j];
                array[j]=t;
            }

        }
        //然后将基准值归位
        array[left]=array[i];
        array[i]=temp;
        quickSort(left,i-1);
        quickSort(i+1,right);

    }


}
