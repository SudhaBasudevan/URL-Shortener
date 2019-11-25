import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class UrlJDBC implements UrlDAO {

		
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Url url) {
		jdbcTemplate.update(Constants.INSERT_QUERY, url.getlongUrl(), url.getShortUrl(),url.getEmailId(),url.getDescription());
	}
	
	@Override
	public List<Url> getUrl(String shortUrl) {
		List<Url> urlList = jdbcTemplate.query(Constants.SELECT_FOR_GIVEN_URLS_QUERY, new Object[] { shortUrl },
				new UrlMapper());
		return urlList;
	}
	
}