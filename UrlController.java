
@RestController
public class UrlController {

	@Autowired
	UrlJDBC urlJDBC;
	
	@RequestMapping(value = "/shorten", method = RequestMethod.POST)
	public Url shortenUrl(@RequestBody Url url) {

		long id = new Date().getTime();
		String encodedId = UrlShortner.encode(id);
		urlJDBC.create(url.getLongUrl(), encodedId);
		return new Url(encodedId, url.getLongUrl());
	}

	@RequestMapping(value = "/expand/{shortUrl}", method = RequestMethod.GET)
	public RedirectView getActualUrl(@PathVariable String shortUrl) {
		
		List<Url> urlList = urlJDBC.getUrl(shortUrl);
		RedirectView redirectView = new RedirectView();
		if (urlList != null && urlList.size() > 0)
			redirectView.setUrl(urlList.get(0).getLongUrl());
    		return redirectView;
		
		
	}

}