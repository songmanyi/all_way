package principle.compositeaggregatereuse;

import java.util.Properties;

public class CompositeAggregateReuseTest {

    /*
    合成复用原则：尽量使用对象组合和聚合，而不是继承关系达到软件复用的目的。

    可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化，对其他类造成的影响最小。
     */

    public static void main(String[] args) {

        DBConnection mysqlConn = new MySQLConnection();
        DBConnection oracleConn = new OracleConnection();
        ProductDao dao = new ProductDao();
        dao.setDbConnection(mysqlConn);
        dao.addProduct();

        dao.setDbConnection(oracleConn);
        dao.addProduct();


    }

}
