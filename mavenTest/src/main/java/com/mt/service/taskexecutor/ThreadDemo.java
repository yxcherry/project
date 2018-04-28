package com.mt.service.taskexecutor;

public class ThreadDemo extends Thread{ 
    private String name;  
    public ThreadDemo(String name) {  
        super(name);  
       this.name=name;  
    }  
    public void run() {  
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");  
        for (int i = 0; i < 5; i++) {  
            System.out.println("子线程"+name + "运行 : " + i);  
            try {  
                sleep((int) Math.random() * 10);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }
            // sleep()和yield()的区别):sleep()使当前线程进入停滞状态，所以执行sleep()的线程在指定的时间内肯定不会被执行；
            //yield()只是使当前线程重新回到可执行状态，所以执行yield()的线程有可能在进入到可执行状态后马上又被执行。
            if(i==4) {
            	System.out.println("子线程"+name + "暂停 ");
            	Thread.yield();
            }
        }  
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");  
    } 
    
    public static void main(String[] args) {  
        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");  
        ThreadDemo mTh1=new ThreadDemo("A");  
        ThreadDemo mTh2=new ThreadDemo("B");  
        mTh1.start();  
        mTh2.start();  
        try {
			mTh1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        try {
        	mTh2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");  
  
    }  
    
}  
  

