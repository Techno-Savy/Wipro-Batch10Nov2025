import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class userDAOImpl implements userDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveUser(user user) {
        String sql = "INSERT INTO users(name, email) VALUES(?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }
}