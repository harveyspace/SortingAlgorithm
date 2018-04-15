package com.harvery.sort;

import java.util.Arrays;

/**
 * @author @author <a href="mailto:harveyer@163.com">harveyer</a>
 * @date 2018年4月15日
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int length = 100000;
		int[] array = CommonUtil.initArray(length);
		int[] arrayCopy = Arrays.copyOf(array, length);
		
		//冒泡排序
		long start = System.currentTimeMillis();
		BubbleSort sort = new BubbleSort();
		array = sort.bubbleSort(array);
		long end = System.currentTimeMillis();
		System.out.println(String.format("冒泡排序花费时间：%d 秒" ,(end - start) / 1000));
		
		//快速排序
		start = System.currentTimeMillis();
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(arrayCopy, 0, arrayCopy.length - 1);
		end = System.currentTimeMillis();
		System.out.println(String.format("快速排序花费时间：%d 秒" ,(end - start) / 1000));
	}

}
