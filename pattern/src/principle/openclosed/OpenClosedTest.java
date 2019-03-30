package principle.openclosed;

public class OpenClosedTest {

    /*
        开闭原则：对扩展开放，对修改关闭。通过抽象构建框架，用实现扩展细节。
     */

    public static void main(String[] args) {
        IBook novelBook = new NovelBook("三月的回忆", 59);
        System.out.println(String.format("%s:原价为%s", novelBook.getName(), novelBook.getPrice()));
        // 打折
        IBook offNovelBook = new OffNovelBook("三月的回忆", 59);
        System.out.println(String.format("%s:打折后%s", offNovelBook.getName(), offNovelBook.getPrice()));
    }

}
