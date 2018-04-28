package com.mt.service.taskexecutor;

public class AsynMainTest {

    public static void main(String[] args) {  
        new Thread(new Runnable() {  
            public void run() {  
                System.out.println("模拟订阅");  
            }  
        }).start();  
          
        new Thread(new Runnable() {  
            public void run() {  
                while(true) {  
                    try {  
                        Thread.sleep(3000);  
                        System.out.println("每隔3s do something。。。========");  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
            }  
        }).start();  
          
//      new Thread(new Runnable() {  
//          @Override  
//          public void run() {  
                while(true) {  
                    try {  
                        Thread.sleep(6000);  
                        System.out.println("每隔6s do otherthing。。。");  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
//          }  
//      }).start();  
    }  

}
