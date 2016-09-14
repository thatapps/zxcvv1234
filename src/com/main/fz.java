package com.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

import android.text.TextUtils;
import android.util.Log;

public class fz {
	public static String a(String paramString1, Map paramMap,
			String paramString2) {
		return b(paramString1, paramMap, "UTF-8", paramString2, false);
	}

	public static String a(String s, Map map, byte abyte0[], String s1) {
		Object obj;
		Object obj2;
		Object obj1 = null;
		abyte0 = null;
		obj = null;
		s = "";
		HttpPost httppost;
		if (s == null || "".equals(s)) {
			return null;
		}

		try {
			obj = a("UTF-8");
		}
		// Misplaced declaration of an exception variable

		finally {
			obj2 = null;
			obj = null;
		}

		if (map == null) {
			httppost = new HttpPost(((String) (obj1)));
			if (abyte0 == null) {
				// break MISSING_BLOCK_LABEL_132;
			}
			obj2 = httppost;
			obj1 = obj;
			httppost.setEntity(new ByteArrayEntity(abyte0));
			obj2 = httppost;
			obj1 = obj;
			if (TextUtils.isEmpty(s1)) {
				// break MISSING_BLOCK_LABEL_163;
			}
			obj2 = httppost;
			obj1 = obj;
			httppost.addHeader("HOST", s1);
			obj2 = httppost;
			obj1 = obj;
			try {
				map = (Map) ((HttpClient) (obj)).execute(httppost);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj2 = httppost;
			obj1 = obj;
			if (((HttpResponse) map).getStatusLine().getStatusCode() == 200) {

				obj2 = httppost;
				obj1 = obj;
				try {
					s = EntityUtils.toString(((HttpResponse) map).getEntity(),
							"UTF-8");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a(((HttpRequestBase) (httppost)), ((HttpClient) (obj)));

				while (true) {
					a(((HttpRequestBase) (obj2)), ((HttpClient) (obj)));
					// throw s;
				}

				// abyte0 = httppost;
				// if (true) goto _L11; else goto _L7

			} else {

			}
			obj2 = httppost;
			obj1 = obj;
			s = (new StringBuilder())
					.append("hc:")
					.append(((HttpResponse) map).getStatusLine()
							.getStatusCode()).toString();
			obj2 = httppost;
			obj1 = obj;
			try {
				try {
					throw new Exception((new StringBuilder())
							.append("HttpResponse error statuscode:")
							.append(((HttpResponse) map).getStatusLine()
									.getStatusCode()).toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// Misplaced declaration of an exception variable
			// catch (Map map)
			// {
			// // abyte0 = httppost;
			// }
			finally {
				obj = obj1;
			}

		} else {
			List list = a(map);
			obj1 = s;
			if (map == null) {
				httppost = new HttpPost(((String) (obj1)));
				if (abyte0 == null) {
					// break MISSING_BLOCK_LABEL_132;
				}
				obj2 = httppost;
				obj1 = obj;
				httppost.setEntity(new ByteArrayEntity(abyte0));
				obj2 = httppost;
				obj1 = obj;
				if (TextUtils.isEmpty(s1)) {
					// break MISSING_BLOCK_LABEL_163;
				}
				obj2 = httppost;
				obj1 = obj;
				httppost.addHeader("HOST", s1);
				obj2 = httppost;
				obj1 = obj;
				try {
					map = (Map) ((HttpClient) (obj)).execute(httppost);
				} catch (ClientProtocolException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				obj2 = httppost;
				obj1 = obj;
				if (((HttpResponse) map).getStatusLine().getStatusCode() == 200) {

					obj2 = httppost;
					obj1 = obj;
					try {
						s = EntityUtils.toString(
								((HttpResponse) map).getEntity(), "UTF-8");
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					a(((HttpRequestBase) (httppost)), ((HttpClient) (obj)));

					while (true) {
						a(((HttpRequestBase) (obj2)), ((HttpClient) (obj)));
						// throw s;
					}
					// goto _L10
					// map;

					// abyte0 = httppost;
					// if (true) goto _L11; else goto _L7
				} else {
					obj2 = httppost;
					obj1 = obj;
					s = (new StringBuilder())
							.append("hc:")
							.append(((HttpResponse) map).getStatusLine()
									.getStatusCode()).toString();
					obj2 = httppost;
					obj1 = obj;
					try {
						try {
							throw new Exception((new StringBuilder())
									.append("HttpResponse error statuscode:")
									.append(((HttpResponse) map)
											.getStatusLine().getStatusCode())
									.toString());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// Misplaced declaration of an exception variable

					finally {
						obj = obj1;
					}
				}
			} else {
				obj1 = s;
				if (map.size() <= 0) {
					obj1 = s;

				} else {
					String lisst = URLEncodedUtils.format(list, "UTF-8");
					if (s.indexOf("?") >= 0) {
						try {
							s = (new StringBuilder())
									.append(s.substring(0, s.indexOf("?") + 1))
									.append(map).toString();
							/* Loop/switch isn't completed */
						}
						// Misplaced declaration of an exception variable

						finally {
							obj2 = null;
						}
					}
				}
			}
		}
		return s1;

	}

	private static List a(Map map) {
		if (map == null || map.size() == 0) {
			return null;
		}
		ArrayList arraylist = new ArrayList();
		java.util.Map.Entry entry;
		for (map = (Map) map.entrySet().iterator(); ((Iterator) map).hasNext(); arraylist
				.add(new BasicNameValuePair((String) entry.getKey(),
						(String) entry.getValue()))) {
			entry = (java.util.Map.Entry) ((Iterator) map).next();
		}

		return arraylist;
	}

	public static HttpResponse a(String s, Map map, String s1, String s2,
			boolean flag) {
		Object obj1;
		obj1 = null;
		if (s == null || "".equals(s) || s.startsWith("null/")) {
			return null;
		}
		DefaultHttpClient httpClient = a(s1, flag);
		Object obj = s;
		Iterator iterator = null;
		java.util.Map.Entry entry;
		boolean flag1;
		try {
			if (map.size() <= 0) {
				// break MISSING_BLOCK_LABEL_185;
			}
			obj = new StringBuilder();
			iterator = map.entrySet().iterator();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			s = null;
			// continue; /* Loop/switch isn't completed */
		}

		_L3: flag1 = true;
		// _L2:
		if (!iterator.hasNext()) {
			// break; /* Loop/switch isn't completed */
		}
		entry = (java.util.Map.Entry) iterator.next();
		if (flag1) {
			// map = "?";
			((StringBuilder) (obj)).append("?");
			((StringBuilder) (obj)).append((new StringBuilder())
					.append((String) entry.getKey()).append("=").toString());
			((StringBuilder) (obj)).append((String) entry.getValue());
			flag1 = false;
		} else {
			// map = "&";
			((StringBuilder) (obj)).append("&");
			((StringBuilder) (obj)).append((new StringBuilder())
					.append((String) entry.getKey()).append("=").toString());
			((StringBuilder) (obj)).append((String) entry.getValue());
			flag1 = false;
		}

		// _L1:
		obj = (new StringBuilder()).append(s).append(obj).toString();
		HttpGet httpGet = new HttpGet(((String) (obj)));
		obj = s;
		;
		if (TextUtils.isEmpty(s2)) {
			// break MISSING_BLOCK_LABEL_219;
		}
		obj = s;
		
		httpGet.addHeader("HOST", s2);
		obj = s;

		HttpResponse response = null;
		try {
			response = httpClient.execute(httpGet);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a(((HttpRequestBase) (httpGet)), ((HttpClient) (httpClient)));

		obj = s;

		if (!fx.a) {
		
		}
		obj = s;

		a(((HttpRequestBase) (httpGet)), ((HttpClient) (httpClient)));

		return response;

	}

	private static DefaultHttpClient a(String paramString) {
		return a(paramString, false);
	}

	private static DefaultHttpClient a(String paramString, boolean paramBoolean) {
		BasicHttpParams localBasicHttpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 10000);
		HttpConnectionParams.setSoTimeout(localBasicHttpParams, 10000);
		HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 9216);
		HttpClientParams.setRedirecting(localBasicHttpParams, true);
		if (paramBoolean) {
		}
		for (String str = "haloappsflyer";; str = "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2) Gecko/20100115 Firefox/3.6") {
			HttpProtocolParams.setUserAgent(localBasicHttpParams, str);
			return new DefaultHttpClient(localBasicHttpParams);
		}
	}

	public static void a(HttpRequestBase paramHttpRequestBase,
			HttpClient paramHttpClient) {
		if (paramHttpRequestBase != null) {
		}
		try {
			paramHttpRequestBase.abort();
			if (paramHttpClient == null) {
			}
		} catch (Exception localException2) {
			try {
				paramHttpClient.getConnectionManager().shutdown();
				return;
				// localException2 = localException2;
			} catch (Exception localException1) {
				for (;;) {
				}
			}
		}
	}

	public static String b(String s, Map map, String s1, String s2, boolean flag)
    {
        Object obj1;
        Object obj2 = null;
        Object obj5 = null;
        Object obj4 = null;
        if (s == null || "".equals(s) || s.startsWith("null/"))
        {
            return null;
        }
        Object obj;
        Object obj3;
        java.util.Map.Entry entry;
        boolean flag1;
        try
        {
            obj = a(s1, flag);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            obj = null;
            s = "";
         //   s1 = obj4;
            /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
        }
        obj3 = s;
        obj2 = obj5;
        obj1 = obj;
        if (map.size() <= 0)
        {
          //  break MISSING_BLOCK_LABEL_230;
        }
        obj2 = obj5;
        obj1 = obj;
        obj3 = new StringBuilder();
        obj2 = obj5;
        obj1 = obj;
       
        obj2 = map.entrySet().iterator();
        flag1 = true;
//_L2:
        if (!((Iterator) (obj2)).hasNext())
        {
           // break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
        if (flag1)
        {
            obj1 = "?";
        } else
        {
            obj1 = "&";
        }
        ((StringBuilder) (obj3)).append(((String) (obj1)));
        ((StringBuilder) (obj3)).append((new StringBuilder()).append((String)entry.getKey()).append("=").toString());
        ((StringBuilder) (obj3)).append((String)entry.getValue());
        flag1 = false;
       
     
        obj2 = obj5;
        obj1 = obj;
        obj3 = (new StringBuilder()).append(s).append(obj3).toString();
        obj2 = obj5;
        obj1 = obj;
        HttpGet get = new HttpGet(((String) (obj3)));
        if (!TextUtils.isEmpty(s2))
        {
        	get.addHeader("HOST", s2);
        }
       HttpResponse response = null;
	try {
		response = ((HttpClient) (obj)).execute(get);
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        if (response.getStatusLine().getStatusCode() == 200){
        	// map = "";
        	
        	
        	
        } else {
        	
        	  s = (new StringBuilder()).append("hc:").append(response.getStatusLine().getStatusCode()).toString();
        	
        }

        try {
			s1 = EntityUtils.toString(response.getEntity(), s1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        a(s,  (Boolean) (obj));
       
       
        obj2 = obj5;
        obj1 = obj;
        
       
        obj2 = s1;
        obj1 = obj;
        if (!fx.a)
        {
           // break MISSING_BLOCK_LABEL_384;
        }
        obj2 = s1;
        obj1 = obj;
        Log.w("system.err", map.toString());
        obj2 = s1;
        obj1 = obj;
       
        a(s1, (Boolean) (obj));
       

        a(((HttpRequestBase) (obj2)), ((HttpClient) (obj)));
       
        s1 = s;
        return s;
       
  
    }

	public static HttpResponse b(String paramString1, Map paramMap,
			String paramString2) {
		return a(paramString1, paramMap, "UTF-8", paramString2, true);
	}
}
