package principle.compositeaggregatereuse;

public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库";
    }
}
