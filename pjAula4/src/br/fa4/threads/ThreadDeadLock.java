package br.fa4.threads;

public class ThreadDeadLock {

    public static void main(String[] args) throws InterruptedException {
        Object objA = new Object();
        Object objB = new Object();
        Object objC = new Object();
    
        Thread t1 = new Thread(new SyncThread(objA, objB), "tA");
        Thread t2 = new Thread(new SyncThread(objB, objC), "tB");
        Thread t3 = new Thread(new SyncThread(objC, objA), "tC");
        
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();        
    }

}

class SyncThread implements Runnable{
    private Object obj1;
    private Object obj2;

    public SyncThread(Object o1, Object o2){
        this.obj1=o1;
        this.obj2=o2;
    }
    @Override
   /* public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " adquirir bloqueio " + obj1);
        synchronized (obj1) {
         System.out.println(name + " bloqueio adquirido em " + obj1);
         work();
         System.out.println(name + " adquirir bloqueio " + obj2);
         synchronized (obj2) {
            System.out.println(name + " bloqueio adquirido em " + obj2);
            work();
        }
         System.out.println(name + " liberou o bloqueio " + obj2);
        }
        System.out.println(name + " liberou o bloqueio " + obj1);
        System.out.println(name + " fim da execução.");
    }*/
    
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " adquirir bloqueio " + obj1);
        synchronized (obj1) {
            System.out.println(name + " bloqueio adquirido em " + obj1);
            work();
        }
        System.out.println(name + " liberou o bloqueio " + obj1);
        System.out.println(name + " adquirir bloqueio " + obj2);
        synchronized (obj2) {
            System.out.println(name + " bloqueio adquirido em " + obj2);
            work();
        }
        System.out.println(name + " liberou o bloqueio " + obj2);
        System.out.println(name + " fim da execução.");
    }
    
    private void work() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}