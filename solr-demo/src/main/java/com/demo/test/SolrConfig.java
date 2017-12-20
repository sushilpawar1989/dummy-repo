package com.demo.test;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.server.SolrClientFactory;
import org.springframework.data.solr.server.support.HttpSolrClientFactory;

@Configuration
public class SolrConfig {

	@Bean
	public SolrClient solrClient() {
		return new HttpSolrClient("http://localhost:8983/solr");
	}

	// @Bean
	// public SolrTemplate solrTemplate(SolrClient client) throws Exception {
	// return new SolrTemplate(client);
	// }

	@Bean

	public SolrTemplate solrTemplate() {
		return new SolrTemplate(solrClientFactory());

	}

	@Bean

	public BasicCredentialsProvider credentialsProvider() {
		BasicCredentialsProvider provider = new BasicCredentialsProvider();
		provider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("foo", "foo"));
		return provider;

	}

	@Bean

	public SolrClientFactory solrClientFactory() {
		return new HttpSolrClientFactory(solrClient(), "", credentialsProvider().getCredentials(AuthScope.ANY),
				"BASIC");
	}
}
