package tk.sekol.spring.samples.data.jdbctemplate;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kolesnikov
 */
public class DaoSupporttJdbcTemplateSample extends NamedParameterJdbcDaoSupport {

    public List<String> test() {
        Map<String, Object> params = new HashMap<>();
        params.put("id", 1);
        return getNamedParameterJdbcTemplate().queryForList(QUERY, params, String.class);
    }

    private static final String QUERY = "select name from test where id = :id";
}
