package com.pojo;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class MyPojo {
	@JsonProperty("created_at")
	private String createdAt;
	private String id;
	@JsonProperty("id_str")
	private String idStr;
	private String text;
	private boolean truncated;
	private Entities entities;
	private String source;
	@JsonProperty("in_reply_to_status_id")
	private String inReplyToStatusId;
	@JsonProperty("in_reply_to_status_id_str")
	private String inReplyToStatusIdStr;
	@JsonProperty("in_reply_to_user_id")
	private String inReplyToUserId;
	@JsonProperty("in_reply_to_user_id_str")
	private String inReplyToUserIdStr;
	@JsonProperty("in_reply_to_screen_name")
	private String inReplyToScreenName;
	private User user;
	private String geo;
	private String coordinates;
	private String place;
	private String contributors;
	@JsonProperty("is_quote_status")
	private boolean isQuoteStatus;
	@JsonProperty("retweet_count")
	private int retweetCount;
	@JsonProperty("favorite_count")
	private int favoriteCount;
	private boolean favorited;
	private boolean retweeted;
	@JsonProperty("possibly_sensitive")
	private boolean possiblySensitive;
	private String lang;
	@JsonIgnore
	private List<String> urls;

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}

	public boolean getTruncated() {
		return truncated;
	}

	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	public Entities getEntities() {
		return entities;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setInReplyToStatusId(String inReplyToStatusId) {
		this.inReplyToStatusId = inReplyToStatusId;
	}

	public String getInReplyToStatusId() {
		return inReplyToStatusId;
	}

	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
		this.inReplyToStatusIdStr = inReplyToStatusIdStr;
	}

	public String getInReplyToStatusIdStr() {
		return inReplyToStatusIdStr;
	}

	public void setInReplyToUserId(String inReplyToUserId) {
		this.inReplyToUserId = inReplyToUserId;
	}

	public String getInReplyToUserId() {
		return inReplyToUserId;
	}

	public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
		this.inReplyToUserIdStr = inReplyToUserIdStr;
	}

	public String getInReplyToUserIdStr() {
		return inReplyToUserIdStr;
	}

	public void setInReplyToScreenName(String inReplyToScreenName) {
		this.inReplyToScreenName = inReplyToScreenName;
	}

	public String getInReplyToScreenName() {
		return inReplyToScreenName;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getGeo() {
		return geo;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void setContributors(String contributors) {
		this.contributors = contributors;
	}

	public String getContributors() {
		return contributors;
	}

	public void setIsQuoteStatus(boolean isQuoteStatus) {
		this.isQuoteStatus = isQuoteStatus;
	}

	public boolean getIsQuoteStatus() {
		return isQuoteStatus;
	}

	public void setRetweetCount(int retweetCount) {
		this.retweetCount = retweetCount;
	}

	public int getRetweetCount() {
		return retweetCount;
	}

	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public int getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public boolean getFavorited() {
		return favorited;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}

	public boolean getRetweeted() {
		return retweeted;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return lang;
	}

	@JsonIgnore
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	@JsonIgnore
	public List<String> getUrls() {
		return urls;
	}

	public boolean possiblySensitive() {
		return possiblySensitive;
	}

	public void possiblySensitive(boolean possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}
}