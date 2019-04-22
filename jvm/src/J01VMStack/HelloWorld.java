package J01VMStack;

public class HelloWorld {

    public void test(int i) {
        if (i < 5) {
            i++;
            System.out.println("123");
            test(i);
        }
    }

    // 通过javap反编译输出，看看指令
    //  javap -c -v .\HelloWorld.class > p.txt
}
