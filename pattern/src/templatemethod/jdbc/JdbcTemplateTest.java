package templatemethod.jdbc;

public class JdbcTemplateTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        memberDao.selectAll();
    }

}
