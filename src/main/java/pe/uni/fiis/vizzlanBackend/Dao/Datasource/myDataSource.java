package pe.uni.fiis.vizzlanBackend.Dao.Datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class myDataSource {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}