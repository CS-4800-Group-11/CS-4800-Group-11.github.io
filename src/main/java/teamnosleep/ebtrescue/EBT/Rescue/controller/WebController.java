package teamnosleep.ebtrescue.EBT.Rescue.controller;

import java.io.*;
import java.net.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxmind.geoip2.WebServiceClient;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.Location;

import com.fasterxml.jackson.databind.JsonNode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
	
	// Assignment 4 Step 2
	@GetMapping("/location")
	public String geolocation() throws IOException, GeoIp2Exception {		
		URL whatismyip = new URL("http://checkip.amazonaws.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
		String publicIP = in.readLine();
		
		String geoLocation = "";
		try (WebServiceClient client = new WebServiceClient.Builder(606139, "cjsfbrqhPZj9omqT").host("geolite.info")
		        .build()) {
			
		    InetAddress ipAddress = InetAddress.getByName(publicIP);
		    CityResponse response = client.city(ipAddress);
		    Location location = response.getLocation();
		    geoLocation += (location.getLongitude() + ", " + location.getLatitude());
		}
		return geoLocation.equals("") ? "Could not get your location" : geoLocation;
	}

	//A4 Method example
	Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
	log(doc.title());
	Elements newsHeadlines = doc.select("#mp-itn b a");
	for (Element headline : newsHeadlines) {
  		log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
	}

	//Anthony H A4
	JsonNode jsonNode = objectMapper.readTree(new URL("https://cs-4800-group-11.github.io/text.json"));
	//List<People> listofPeople = objectMapper.readValue(new URL("https://cs-4800-group-11.github.io/text.json"), new TypeReference<List<People>>(){});
	System.out.println(jsonNode.get("records").get("Name");

	//A4

}
