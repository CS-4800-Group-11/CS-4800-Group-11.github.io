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

	@GetMapping("/anthony_n")
	public String anthonyNURL() {
		return "Anthony Nguyen's API";
	}

	@GetMapping("/allison_c")
	public String allisonURL() {
		return "Allison's API";
	}
}
