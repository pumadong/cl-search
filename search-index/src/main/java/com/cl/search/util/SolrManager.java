package com.cl.search.util;

import org.apache.solr.client.solrj.impl.BinaryRequestWriter;
import org.apache.solr.client.solrj.impl.HttpSolrServer;


public class SolrManager {

	private static String solrUrl = PropertyFile.getProps().getProperty("solr_url");
	
	public static HttpSolrServer getSolrHttpConnect() {
		HttpSolrServer chServer = null;
		chServer = new HttpSolrServer(solrUrl);
		chServer.setSoTimeout(500000);
		chServer.setConnectionTimeout(500000);
		chServer.setDefaultMaxConnectionsPerHost(1000);
		chServer.setMaxTotalConnections(1000);
		chServer.setFollowRedirects(false);
		chServer.setAllowCompression(true);
		chServer.setRequestWriter(new BinaryRequestWriter());
		chServer.setMaxRetries(5);
		return chServer;
	}
	
}
