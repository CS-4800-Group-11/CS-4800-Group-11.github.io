package teamnosleep.ebtrescue.EBT.Rescue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	// Assignment 3 Step 3
	@GetMapping("/anthony_t")
	public String getURL() {
		return "Anthony's API";
	}

	@GetMapping("/ashley_k")
	public String ashleyURL() {
		return "Ashley's API";
	}

	//A4 Method example
	Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
	log(doc.title());
	Elements newsHeadlines = doc.select("#mp-itn b a");
	for (Element headline : newsHeadlines) {
  		log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
	}
}
