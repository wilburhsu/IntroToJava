package Chapter7;

/**
 * Created by Wilbur Hsu on 2016/10/19.
 * SelectionSort
 */
public class Code7_8 {
    public static  void selectionSort(double[] list){
        //i每次增加1后，从0到i的元素都已经排好序
        for(int i=0; i<list.length; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            //从i+1开始，将数组剩下的元素遍历一遍，找出最小的值
            for(int j=i+1; j<list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //将遍历中找到的最小值与当前最小值交换
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }


    public static void main(String[] args) {
        double[] list = {1,9,4.5,6.6,5.7,-4.5};
        Code7_8.selectionSort(list);
    }
}
