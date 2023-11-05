package lesson9;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class PGSingltonDataSource {
    private static DataSource dataSource;

    private PGSingltonDataSource() {}

    public static DataSource getInstance() {
        if (dataSource == null){
            PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
            pgDataSource.setServerName("localhost");
            pgDataSource.setDatabaseName("cohort29");
            pgDataSource.setUser("postgres");
            pgDataSource.setPassword("");
            dataSource = pgDataSource;
        }
        return dataSource;
    }

}
