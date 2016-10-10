package com.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

public class User {
	private String id;
	@JsonProperty("id_str")
	private String idStr;
	private String name;
	@JsonProperty("screen_name")
	private String screenName;
	private String location;
	private String description;
	private String url;
	private Entities entities;
	private boolean _protected;
	@JsonProperty("followers_count")
	private int followersCount;
	@JsonProperty("friends_count")
	private int friendsCount;
	@JsonProperty("listed_count")
	private int listedCount;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("favourites_count")
	private int favouritesCount;
	@JsonProperty("utc_offset")
	private int utcOffset;
	@JsonProperty("time_zone")
	private String timeZone;
	@JsonProperty("geo_enabled")
	private boolean geoEnabled;
	private boolean verified;
	@JsonProperty("statuses_count")
	private int statusesCount;
	private String lang;
	@JsonProperty("contributors_enabled")
	private boolean contributorsEnabled;
	@JsonProperty("is_translator")
	private boolean isTranslator;
	@JsonProperty("is_translation_enabled")
	private boolean isTranslationEnabled;
	@JsonProperty("profile_banner_url")
	private String profileBannerUrl;
	@JsonProperty("profile_background_color")
	private String profileBackgroundColor;
	@JsonProperty("profile_background_image_url")
	private String profileBackgroundImageUrl;
	@JsonProperty("profile_background_image_url_https")
	private String profileBackgroundImageUrlHttps;
	@JsonProperty("profile_background_tile")
	private boolean profileBackgroundTile;
	@JsonProperty("profile_image_url")
	private String profileImageUrl;
	@JsonProperty("profile_image_url_https")
	private String profileImageUrlHttps;
	@JsonProperty("profile_link_color")
	private String profileLinkColor;
	@JsonProperty("profile_sidebar_border_color")
	private String profileSidebarBorderColor;
	@JsonProperty("profile_sidebar_fill_color")
	private String profileSidebarFillColor;
	@JsonProperty("profile_text_color")
	private String profileTextColor;
	@JsonProperty("profile_use_background_image")
	private boolean profileUseBackgroundImage;
	@JsonProperty("has_extended_profile")
	private boolean hasExtendedProfile;
	@JsonProperty("default_profile")
	private boolean defaultProfile;
	@JsonProperty("default_profile_image")
	private boolean defaultProfileImage;
	private boolean following;
	@JsonProperty("follow_request_sent")
	private boolean followRequestSent;
	private boolean notifications;

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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	public Entities getEntities() {
		return entities;
	}

	public void setProtected(boolean _protected) {
		this._protected = _protected;
	}

	public boolean getProtected() {
		return _protected;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public void setListedCount(int listedCount) {
		this.listedCount = listedCount;
	}

	public int getListedCount() {
		return listedCount;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setFavouritesCount(int favouritesCount) {
		this.favouritesCount = favouritesCount;
	}

	public int getFavouritesCount() {
		return favouritesCount;
	}

	public void setUtcOffset(int utcOffset) {
		this.utcOffset = utcOffset;
	}

	public int getUtcOffset() {
		return utcOffset;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setGeoEnabled(boolean geoEnabled) {
		this.geoEnabled = geoEnabled;
	}

	public boolean getGeoEnabled() {
		return geoEnabled;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public boolean getVerified() {
		return verified;
	}

	public void setStatusesCount(int statusesCount) {
		this.statusesCount = statusesCount;
	}

	public int getStatusesCount() {
		return statusesCount;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return lang;
	}

	public void setContributorsEnabled(boolean contributorsEnabled) {
		this.contributorsEnabled = contributorsEnabled;
	}

	public boolean getContributorsEnabled() {
		return contributorsEnabled;
	}

	public void setIsTranslator(boolean isTranslator) {
		this.isTranslator = isTranslator;
	}

	public boolean getIsTranslator() {
		return isTranslator;
	}

	public void setIsTranslationEnabled(boolean isTranslationEnabled) {
		this.isTranslationEnabled = isTranslationEnabled;
	}

	public boolean getIsTranslationEnabled() {
		return isTranslationEnabled;
	}

	public void setProfileBannerUrl(String profileBannerUrl) {
		this.profileBannerUrl = profileBannerUrl;
	}

	public String getprofileBannerUrl() {
		return profileBannerUrl;
	}

	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}

	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}

	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}

	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}

	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	public void setProfileBackgroundTile(boolean profileBackgroundTile) {
		this.profileBackgroundTile = profileBackgroundTile;
	}

	public boolean getProfileBackgroundTile() {
		return profileBackgroundTile;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}

	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}

	public String getProfileLinkColor() {
		return profileLinkColor;
	}

	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}

	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}

	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}

	public String getProfileTextColor() {
		return profileTextColor;
	}

	public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}

	public boolean getProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}

	public void setHasExtendedProfile(boolean hasExtendedProfile) {
		this.hasExtendedProfile = hasExtendedProfile;
	}

	public boolean getHasExtendedProfile() {
		return hasExtendedProfile;
	}

	public void setDefaultProfile(boolean defaultProfile) {
		this.defaultProfile = defaultProfile;
	}

	public boolean getDefaultProfile() {
		return defaultProfile;
	}

	public void setDefaultProfileImage(boolean defaultProfileImage) {
		this.defaultProfileImage = defaultProfileImage;
	}

	public boolean getDefaultProfileImage() {
		return defaultProfileImage;
	}

	public void setFollowing(boolean following) {
		this.following = following;
	}

	public boolean getFollowing() {
		return following;
	}

	public void setFollowRequestSent(boolean followRequestSent) {
		this.followRequestSent = followRequestSent;
	}

	public boolean getFollowRequestSent() {
		return followRequestSent;
	}

	public void setNotifications(boolean notifications) {
		this.notifications = notifications;
	}

	public boolean getNotifications() {
		return notifications;
	}
}
