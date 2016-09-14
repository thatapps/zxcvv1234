package com.main;

import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

class hg extends org.apache.http.conn.ssl.SSLSocketFactory {
	SSLContext a = SSLContext.getInstance("TLS");

	public hg(KeyStore keyStore) throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException {
		super(keyStore);
		X509TrustManager var2_2 = new X509TrustManager() {

			public void checkClientTrusted(
					X509Certificate[] arrx509Certificate, String string) {
			}

			public void checkServerTrusted(
					X509Certificate[] arrx509Certificate, String string) {
			}

			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};
		try {
			this.a.init(null, new TrustManager[] { var2_2 }, null);
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Socket createSocket() {
		try {
			return this.a.getSocketFactory().createSocket();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Socket createSocket(Socket paramSocket, String paramString,
			int paramInt, boolean paramBoolean) {
		try {
			return this.a.getSocketFactory().createSocket(paramSocket,
					paramString, paramInt, paramBoolean);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
