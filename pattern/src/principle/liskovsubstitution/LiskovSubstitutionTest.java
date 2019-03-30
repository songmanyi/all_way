package principle.liskovsubstitution;

public class LiskovSubstitutionTest {

    /*
    里氏替换：子类可以扩展父类的功能，但不能改变父类原有的功能。
     */

    public static void main(String[] args) {

        IBook novelBook = new NovelBook("聊斋志异", 59);
        System.out.println(String.format("%s:%s", novelBook.getName(), novelBook.getPrice()));

        OffNovelBook offNovelBook = new OffNovelBook("聊斋志异", 59);
        System.out.println(String.format("%s:%s:%s", offNovelBook.getName(),
                offNovelBook.getPrice(), offNovelBook.getOffPrice()));


    }

}
