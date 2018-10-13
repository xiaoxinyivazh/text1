/*选择排序的方法*/
package com.qianfeng.learn;

import org.omg.Messaging.SyncScopeHelper;

public class text8 {

	public static void main(String[] args) {
		int array[] = { 35, 46, 28, 95, 78, 66 };
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] <array[min]) {
					min = j;
				}
			}

			if (min != i) {
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
        for(int num1:array){
        	System.out.print(num1+"  ");
        }
	}
}
