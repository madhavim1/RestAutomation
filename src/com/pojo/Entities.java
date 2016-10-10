package com.pojo;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class Entities
{
	private List<String> hashtags;
	private List<String> symbols;
	@JsonProperty("user_mentions")
	private List<String> userMentions;
	private Urls[] urls;
	@JsonIgnore
	private Url[] url;
	private Description description;

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}
	
	public List<String> getHashtags() {
		return hashtags;
	}

	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}
	
	public List<String> getSymbols() {
		return symbols;
	}

	public void setUserMentions(List<String> userMentions) {
		this.userMentions = userMentions;
	}
	
	public List<String> getUserMentions() {
		return userMentions;
	}

	public void setUrls(Urls[] urls) {
		this.urls = urls;
	}
	
	public Urls[] getUrls() {
		return urls;
	}
	
	@JsonIgnore
	public void setUrl(Url[] url) {
		this.url = url;
	}
	
	@JsonIgnore
	public Url[] getUrl() {
		return url;
	}

	public void setDescription(Description description) {
		this.description = description;
	}
	
	public Description getDescription() {
		return description;
	}
}