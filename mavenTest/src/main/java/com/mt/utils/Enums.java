package com.mt.utils;

public class Enums {
	
	public static enum SeasonEnum{
		SPRING(1),SUMMER(2),FALL(3),WINTER(4);
		private int type;
		private SeasonEnum(int type) {
			this.type = type;
		}
		
		public int getType() {
			return type;
		}
	}

}
