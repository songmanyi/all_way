package chapter02.c01safethread;

public class NoSafeNum implements INum {

    private int num = 0;

    public void add(String username) {
        try {
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
