package com.harvery.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * <pre>
 * 	冒泡排序:时间复杂度O(N^2)
 *  当数据越接近正序时，冒泡排序性能越好
 * </pre>
 * 
 * @author @author <a href="mailto:harveyer@163.com">harvey</a>
 * @date 2018年4月11日
 */
public class BubbleSort {
	
	private static final Logger log = Logger.getLogger("BubbleSort");
	
	private int temp = 0;
	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public int[] bubbleSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = array.length - 1; j > i; j--) {
				if(array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			//System.out.format("第 %d 趟：\t", i);
			//CommonUtil.printAll(array);
		}
		return array;
	}
	
	/**
	 * 优化算法
	 * 
	 * @param list
	 * @return
	 */
	public int[] bubbleSortOptimization(int[] array) {
         int temp = 0;
         boolean bChange = false;
  
         for (int i = 0; i < array.length - 1; i++) {
             bChange = false;
             for (int j = array.length - 1; j > i; j--) {
                 if (array[j - 1] > array[j]) {
                     temp = array[j - 1];
                     array[j - 1] = array[j];
                     array[j] = temp;
                     bChange = true;
                 }
             }
  
             if (false == bChange)
                 break;
  
             //System.out.format("第 %d 趟：\t", i);
             CommonUtil.printAll(array);
         }
         return array;
     }
	
	public static void main(String args[]) {
		int[] array = CommonUtil.initArray(20);
		int[] arrayCopy = Arrays.copyOf(array, 20);
		log.info("排序前 \t:");
		CommonUtil.printAll(array);
		
		BubbleSort sort = new BubbleSort();
		array = sort.bubbleSort(array);
		//log.info("排序后 \t:");
		//CommonUtil.printAll(array);
		log.info("优化后");
		sort.bubbleSortOptimization(arrayCopy);
	}
}
