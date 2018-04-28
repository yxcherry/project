package com.mt.service.sort;

public class BubbleSort {
	  private static int al[] = new int[10];
	  public BubbleSort() {
	    al[0]=2;
	    al[1]=3;
	    al[2]=23;
	    al[3]=45;
	    al[4]=1;
	    al[5]=67;
	    al[6]=23;
	    al[7]=80;
	    al[8]=35;
	    al[9]=72;
	  }
	  public static void main(String[] args) {
	    BubbleSort bs = new BubbleSort();
	    System.out.println("排序前：");
	    display(al);
	    
	    for(int i=0;i<al.length;i++) {
	    
	     for (int j = 0; j < al.length-i-1; j++) {
	       
	       if(al[j]>al[j+1]) {
	          swap(j,j+1);
	       }
	     }
	    }
	    System.out.println();
	    System.out.println("排序后：");
	    display(al);
	  }
	  private static void display(int[] al2) {
	    for (int i = 0; i < al2.length; i++) {
	     System.out.print(al2[i]+"  ");
	    }
	  }
	  private static void swap(int i, int j) {
	    int temp = al[i];
	    al[i]= al[j];
	    al[j] = temp;
	  }
	}

