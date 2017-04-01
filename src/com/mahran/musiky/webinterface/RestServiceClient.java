package com.mahran.musiky.webinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

public abstract class RestServiceClient {
	private String BASE_URL = "http://api.goeuro.com/api/v2/";
	static HttpClient httpClient;
	/*
	 * Default ctor initialize the HTTP client
	 */
	public RestServiceClient() {
		httpClient = HttpClientBuilder.create().build();
	}
	/**
	 * Execute GET request
	 * 
	 * @param apiMethodPath:
	 *            method path
	 * @return
	 * @throws ClientProtocolException
	 *             in case could not reach the host
	 * @throws IOException
	 *             something went wrong in the call
	 */
	public String GET(String apiMethodPath) throws ClientProtocolException, IOException {
		String url = BASE_URL + apiMethodPath;
		HttpGet request = new HttpGet(url);
		HttpResponse response = httpClient.execute(request);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line = "", responseStr = "";
		while ((line = rd.readLine()) != null) {
			responseStr += line;
		}
		return responseStr;
	}
	/**
	 * Execute POST request
	 * 
	 * @param apiMethodPath:
	 *            method path
	 * @param requestInput:
	 *            request params
	 * @return
	 * @throws ClientProtocolException
	 *             in case could not reach the host
	 * @throws IOException
	 *             something went wrong in the call
	 */
	public String POST(String apiMethodPath, HttpEntity requestInput) throws ClientProtocolException, IOException {
		String url = BASE_URL + apiMethodPath;
		HttpPost postRequest = new HttpPost(url);
		postRequest.setEntity(requestInput);
		HttpResponse response = httpClient.execute(postRequest);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line = "", responseStr = "";
		while ((line = rd.readLine()) != null) {
			responseStr += line;
		}
		return responseStr;
	}
}
