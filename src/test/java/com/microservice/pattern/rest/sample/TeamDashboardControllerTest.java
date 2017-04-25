package com.microservice.pattern.rest.sample;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
public class TeamDashboardControllerTest {

	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8080);



	@Test
	public void validateTeamDashboardURLOnly() {
		stubFor(get(urlEqualTo("/api/v1/dashboard")).willReturn(aResponse().withHeader("Content-Type", "text/plain").withBody("Hello, fan!")));
		

		
//		assertThat(testClient.get("api/v1/dashboard").statusCode(), is(200));
//		assertThat(testClient.get("api/v1/sashboard").statusCode(), is(404));
	}
	


}
