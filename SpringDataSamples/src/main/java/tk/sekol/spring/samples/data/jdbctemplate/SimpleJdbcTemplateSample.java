package tk.sekol.spring.samples.data.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author kolesnikov
 */
public class SimpleJdbcTemplateSample {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> test() {
        return jdbcTemplate.queryForList(QUERY, String.class, 1);
    }

    private static final String QUERY = "select name from test where id = ?";
}
