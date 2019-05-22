package templatemethod.jdbc;

public class JdbcTemplateTest {

    public final static ThreadLocal<String> resource = new ThreadLocal<String>();
    public final static ThreadLocal<Member> member = new ThreadLocal<Member>();

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        memberDao.selectAll();

        member.set(null);
    }

}
