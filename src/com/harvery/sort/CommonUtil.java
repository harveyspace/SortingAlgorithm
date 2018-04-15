package com.harvery.sort;

import java.util.Random;

/**
 * 工具类
 * 
 * @author @author <a href="mailto:harveyer@163.com">harveyer</a>
 * @date 2018年4月11日
 */
public class CommonUtil {

	/**
	 * 初始化数组
	 * 
	 * @param size
	 * @return
	 */
	public static int[] initArray(int size) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(size);
        }
		return array;
	}
	
	/**
	 * 数组打印
	 * 
	 * @param list
	 */
	public static void printAll(int[] array) {
		for (int value : array) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}
