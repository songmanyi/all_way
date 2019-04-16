package chapter02.c07anthingsyn;

public class PublicVar {

    private String anything = new String();

    public void method() {
        System.out.println(Thread.currentThread().getName() + "-> 开始");
        // 需要同步的代码块
        synchronized (anything){
            System.out.println(Thread.currentThread().getName() + "-> 0");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-> 1");
        }
        System.out.println(Thread.currentThread().getName() + "-> 结束");
    }

}
