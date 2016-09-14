package com.main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import android.text.TextUtils;

public class fy {
	private static final String c = System.getProperty("line.separator");
	public String a;
	public boolean b;
	private HashMap d = new HashMap();
	List e = new ArrayList();
	private boolean f = false;

	public fy(String paramString) {
		try {
			this.b = false;
			this.a = paramString;
			this.b = d(paramString);
			return;
		} finally {
			if (!this.b) {
				this.d.clear();
			}
		}
	}

	private boolean d(String string) {
		HashMap hashMap;
		HashMap hashMap2 = hashMap = this.d;
		synchronized (hashMap2) {
			this.d.clear();
			File file = new File(string);
			if (!file.exists()) {
				return false;
			}
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DataInputStream dataInputStream = new DataInputStream(
					(InputStream) fileInputStream);
			BufferedReader bufferedReader = null;
			try {
				bufferedReader = new BufferedReader(
						(Reader) new InputStreamReader(
								(InputStream) dataInputStream, "utf-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			do {
				String string2 = null;
				try {
					if (TextUtils
							.isEmpty((CharSequence) (string2 = bufferedReader
									.readLine()))) {
						bufferedReader.close();
						dataInputStream.close();
						fileInputStream.close();
						return true;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String[] arrstring = string2.split("=");
				if (arrstring == null || arrstring.length != 2)
					continue;
				this.d.put((Object) arrstring[0], (Object) arrstring[1]);
			} while (true);
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	protected void a(String string) {
		fy fy = this;
		synchronized (fy) {
			HashMap hashMap;
			HashMap hashMap2 = hashMap = this.d;
			synchronized (hashMap2) {
				FileInputStream fileInputStream = null;
				try {
					fileInputStream = new FileInputStream(new File(string));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				DataInputStream dataInputStream = new DataInputStream(
						(InputStream) fileInputStream);
				BufferedReader bufferedReader = null;
				try {
					bufferedReader = new BufferedReader(
							(Reader) new InputStreamReader(
									(InputStream) dataInputStream, "utf-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.d.clear();
				do {
					String string2 = null;
					try {
						if (TextUtils
								.isEmpty((CharSequence) (string2 = bufferedReader
										.readLine()))) {
							try {
								bufferedReader.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							try {
								dataInputStream.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							try {
								fileInputStream.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return;
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String[] arrstring = string2.split("=");
					if (arrstring == null || arrstring.length != 2)
						continue;
					this.d.put((Object) arrstring[0], (Object) arrstring[1]);
				} while (true);
			}
		}
	}

	public void a(String paramString1, String paramString2) {
		synchronized (this.d) {
			if ("null".equals(paramString2)) {
				this.d.put(paramString1, "");
				return;
			}
			if (paramString2 != null) {
				this.d.put(paramString1, paramString2);
			}
		}
	}

	public String b(String paramString1, String paramString2) {
		String str = null;

		synchronized (this.d) {
			if (this.d == null) {
				if (paramString2 != null) {
					str = paramString2;
				}
			} else {
				str = (String) this.d.get(paramString1);
				if (str == null) {
					str = paramString2;
				}
			}
		}
		return str;
		// label80:

	}

	/* Error */
	/**
	 * @deprecated
	 */
	public void b() {
		fy fy = this;
		synchronized (fy) {
			if (this.e.size() == 0) {
				this.b(this.a);
			} else {
				this.e.add((Object) true);
			}
			return;
		}
	}

	static List a(fy fy1) {
		return fy1.e;
	}

	static boolean a(fy fy1, boolean flag) {
		fy1.f = flag;
		return flag;
	}

	static HashMap b(fy fy1) {
		return fy1.d;
	}

	static String c() {
		return c;
	}

	/**
	 * @deprecated
	 */
	public void b(final String s) {

		(new Thread(new Runnable() {

			final String a;
			final fy b;

			public void run() {
				Object obj;
				Object obj1;
				byte byte0 = -1;
				fy.a(b, true);
				fy.a(b).clear();
				obj = new File(a);
				StringBuffer exception1;
				obj1 = (((File) obj)).getParentFile();
				if (obj1 == null) {

					exception1 = new StringBuffer();
					exception1.append((new StringBuilder()).append(" ")
							.append(fy.c()).toString());
					HashMap hashmap = fy.b(b);
					// hashmap;
					// JVM INSTR monitorenter ;
					java.util.Map.Entry entry;
					for (Iterator iterator = fy.b(b).entrySet().iterator(); iterator
							.hasNext(); exception1.append("=")
							.append((String) entry.getValue()).append(fy.c())) {
						entry = (java.util.Map.Entry) iterator.next();
						exception1.append((String) entry.getKey());
					}

					fy.a(b, false);

					try {
						obj = new FileOutputStream(((File) (obj)));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					OutputStreamWriter outputstreamwriter = null;
					try {
						outputstreamwriter = new OutputStreamWriter(
								((OutputStream) (obj)), "utf-8");
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						outputstreamwriter.write(exception1.toString());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						outputstreamwriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						((OutputStream) (obj)).close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (!b.b) {
						b.b = true;
					}
					fy.a(b, false);
					return;

				} else {

					if (((File) (obj1)).exists()) {

						exception1 = new StringBuffer();
						exception1.append((new StringBuilder()).append(" ")
								.append(fy.c()).toString());
						HashMap hashmap = fy.b(b);
						// hashmap;
						// JVM INSTR monitorenter ;
						java.util.Map.Entry entry = null;
						for (Iterator iterator = fy.b(b).entrySet().iterator(); iterator
								.hasNext(); exception1.append("=")
								.append((String) entry.getValue())
								.append(fy.c())) {
							try {
								entry = (java.util.Map.Entry) iterator.next();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								return ;
							}
							exception1.append((String) entry.getKey());
						}

						fy.a(b, false);

						try {
							obj = new FileOutputStream(((File) (obj)));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						OutputStreamWriter outputstreamwriter = null;
						try {
							outputstreamwriter = new OutputStreamWriter(
									((OutputStream) (obj)), "utf-8");
						} catch (UnsupportedEncodingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							outputstreamwriter.write(exception1.toString());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							outputstreamwriter.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							((OutputStream) (obj)).close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (!b.b) {
							b.b = true;
						}
						fy.a(b, false);
						return;

					} else {

						byte0 = 5;

					}
				}

				// _L6:
				boolean flag = ((File) (obj1)).mkdirs();
				byte byte1;
				if (flag) {
					// break; /* Loop/switch isn't completed */
				}
				byte1 = (byte) (byte0 - 1);
				if (byte1 < 0) {
					// break; /* Loop/switch isn't completed */
				}
				long l = System.currentTimeMillis();
				// _L5:
				byte0 = byte1;
				if (System.currentTimeMillis() - l >= 200L) {
					// continue; /* Loop/switch isn't completed */
				}
				Thread.yield();

			}

			{
				b = fy.this;
				a = s;
				// ;; super();
			}
		})).start();

	}

	/**
	 * @deprecated
	 */
	public String c(String string) {
		fy fy = this;
		synchronized (fy) {
			String string2 = this.b(string, "");
			return string2;
		}
	}
}
