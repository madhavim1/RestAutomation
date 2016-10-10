package com.util;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.pojo.MyPojo;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class RestUtil {
	HttpUriRequest request;
	HttpResponse response;
	String URI = Configuration.URI;
	OAuthConsumer consumer;
	private MyPojo[] pojo;

	public MyPojo[] getMyPojo() {
		return pojo;
	}

	public void setMyPojo(MyPojo[] pojo) {
		this.pojo = pojo;
	}

	public void addAuthentication(HttpUriRequest request)
			throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
		consumer = new CommonsHttpOAuthConsumer(Configuration.CONSUMER_KEY, Configuration.CONSUMER_SECRET);
		consumer.setTokenWithSecret(Configuration.TOKEN, Configuration.TOKEN_SECRET);
		consumer.sign(request);
	}

	public void getRequest(String resourceUrn, String id) {
		try {
			HttpGet get = new HttpGet(URI + resourceUrn + "id=" + id);
			get.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
			addAuthentication(get);
			response = HttpClientBuilder.create().build().execute(get);
			if (response != null) {
				setMyPojo(ResourceUtil.retrieveResource(response, MyPojo[].class));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void postRequest(String resourceUrn, String param) {
		try {
			HttpPost post = new HttpPost(URI + resourceUrn + "status=" + param);
			post.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
			// System.out.println("Post URI" :"+request.getURI().toString());
			addAuthentication(post);
			consumer.sign(post);
			response = HttpClientBuilder.create().build().execute(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// This delete request not for twitter API.
	// Twitter uses Post destroy to delete content.
	public void deleteRequest(String resourceUrl) {
		HttpDelete delete = new HttpDelete(resourceUrl);
		delete.setHeader("Content-type", "application/json");

		try {
			addAuthentication(delete);
			HttpClientBuilder.create().build().execute(delete);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int validateStatusCode() {
		int i = response.getStatusLine().getStatusCode();
		return i;
	}

	public String validateCreatedAt(int i) {
		pojo = getMyPojo();
		return pojo[i].getCreatedAt();
	}

	public String validateEntitiesUrl(int i) {
		return getMyPojo()[i].getEntities().getUrls()[0].getUrl();
	}

	public String validateUserScreenName(int i) {
		return getMyPojo()[i].getUser().getScreenName();
	}
}
