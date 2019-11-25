import org.springframework.jdbc.core.RowMapper;

public class UrlMapper implements RowMapper {

	
	public Url mapRow(ResultSet rs, int rowNum) throws SQLException {
		Url url = new Url();
		url.setLongUrl(rs.getString("longUrl"));
		url.setShortUrl(rs.getString("shortUrl"));
		url.setEmailId(rs.getString("emailId"));
		url.setDescription(rs.getString("desciption"));
		return url;
	}
	
}