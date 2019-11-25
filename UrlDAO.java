public interface UrlDAO {

	public void create(String longUrl, String shortUrl);
	
	public List<Url> getUrl(String shortUrl);
	
}