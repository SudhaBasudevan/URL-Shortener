public final class Constants {
	public static final String LONGURL = "longUrl";
	public static final String SHORTURL = "shortUrl";
	public static final String EMAILID = "emailId";
	public static final String DESCRIPTION = "description";
	
	public static final String INSERT_QUERY = "insert into Url (" + LONGURL
			+ "," + SHORTURL + "," + EMAILID + "," + DESCRIPTION ") values (?, ?, ?, ?)";
	
	public static final String SELECT_FOR_GIVEN_URLS_QUERY = "select * from Url where "
			+ SHORTURL + " =?";
	
}