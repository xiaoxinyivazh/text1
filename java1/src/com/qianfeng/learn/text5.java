/*定义二维数组*/
package com.qianfeng.learn;

public class text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] array={{10,12,13,15},{12,14,16,17},{14,15,16,17}};
    for(int i=0;i<array.length;i++){
    	for(int j=0;j<array[i].length;j++){
    		System.out.print(array[i][j]+"  ");
    	}
    	System.out.println();
    }
	}

}
