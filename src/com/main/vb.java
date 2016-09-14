package com.main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import android.util.Log;

public final class vb {
	public static vc a(String string, boolean bl, boolean bl2) {
		return vb.a(new String[] { string }, bl, bl2);
	}

	public static vc a(String as[], boolean flag, boolean flag1) {
		Object obj;
		Object obj1;
		Object obj2 = null;
		Object obj3 = null;
		Object obj4;
		BufferedReader bufferedreader = null;
		int i;
		int j;
		obj4 = null;
		j = -1;
		if (as == null || as.length == 0) {
			return new vc(-1, null, null);
		}
		Process process = null;
		Runtime runtime = null;
		DataOutputStream stream = null;
		Object obj5;
		int k;
		int l;
		try {
			runtime = Runtime.getRuntime();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			obj2 = null;
			obj1 = null;
			obj3 = null;
			bufferedreader = null;
			process = null;
			obj = null;
			i = j;
			// continue; /* Loop/switch isn't completed */
		} finally {

		}
		if (flag) {
			obj = "su";
		} else {
			obj = "sh";
		}
		try {
			process = ((Runtime) runtime).exec(((String) (obj)));
		} catch (IOException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		try {
			stream = new DataOutputStream(process.getOutputStream());
		}
		// Misplaced declaration of an exception variable
		catch (Exception obj4extException) {

			i = j;
			// continue; /* Loop/switch isn't completed */
		} finally {

		}
		i = j;
		l = as.length;
		k = 0;
		// _L5:
		if (k >= l) {
			i = j;
			try {
				((DataOutputStream) (stream)).writeBytes("exit\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = j;
			try {
				((DataOutputStream) (obj)).flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = j;
			try {
				j = process.waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!flag1) {
				// break MISSING_BLOCK_LABEL_770;
			}
			i = j;
			obj1 = new StringBuilder();
			try {
				obj2 = new StringBuilder();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {

				i = j;
				// continue; /* Loop/switch isn't completed */
			}
			try {
				bufferedreader = new BufferedReader(new InputStreamReader(
						process.getInputStream()));
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {

				obj3 = obj;
				obj = obj2;
				i = j;
				obj2 = obj3;
				// obj3 = obj6;
				// continue; /* Loop/switch isn't completed */
			}
			try {
				bufferedreader = new BufferedReader(new InputStreamReader(
						process.getErrorStream()));
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Object obj7 = null;
				obj3 = obj2;
				obj2 = obj;
				obj = obj3;
				i = j;
				obj3 = obj7;
				// continue; /* Loop/switch isn't completed */
			} finally {
				obj1 = obj4;
			}
			try {
				obj4 = bufferedreader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (obj4 == null) {
				// break MISSING_BLOCK_LABEL_397;
			}
			try {
				((StringBuilder) (obj1)).append(((String) (obj4)));
				// break MISSING_BLOCK_LABEL_374;
			} catch (Throwable throwable) {
				obj4 = obj2;
				obj2 = obj;
				obj = obj4;
				i = j;
				obj4 = throwable;
			} finally {
				obj1 = obj3;
			}

		} else {
			obj1 = as[k];
			if (obj1 != null) {

				i = j;
				try {
					((DataOutputStream) (stream)).write(((String) (obj1))
							.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i = j;
				try {
					((DataOutputStream) (stream)).writeBytes("\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i = j;
				try {
					((DataOutputStream) (stream)).flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				k++;

			} else {

				k++;

			}

		}

		// _L11:
		Log.w("Swipe.Shell",
				(new StringBuilder()).append("Executing commands failed: ")
						.append(ve.a(as, ";")).toString(), ((Throwable) (obj4)));
		if (obj2 == null) {
			// break MISSING_BLOCK_LABEL_199;
		}
		try {
			((DataOutputStream) (stream)).close();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		if (bufferedreader == null) {
			// break MISSING_BLOCK_LABEL_209;
		}
		/*
		 * try { bufferedreader.close(); } catch (IOException e2) { // TODO
		 * Auto-generated catch block e2.printStackTrace(); }
		 */
		if (bufferedreader != null) {
			try {
				((BufferedReader) (bufferedreader)).close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}
		obj2 = obj;
		obj3 = obj1;
		k = i;
		if (process != null) {
			process.destroy();
			k = i;
			obj3 = obj1;
			obj2 = obj;
		}
		if (obj3 == null) {
			as = null;
		} else {
			// as = ((StringBuilder) (obj3)).toString();
		}
		if (obj2 == null) {
			obj = null;
		} else {
			// obj = ((StringBuilder) (obj2)).toString();
		}

		Log.w("Swipe.Shell",
				(new StringBuilder()).append("ERROR->")
						.append(((String) (obj4))).toString());
		// ((StringBuilder) (obj2)).append(((String) (obj4)));
		// as = ((String[]) (obj2));

		if (obj == null) {
			// break MISSING_BLOCK_LABEL_459;
		}
		try {
			((DataOutputStream) (stream)).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (bufferedreader == null) {
			// break MISSING_BLOCK_LABEL_469;
		}

		if (bufferedreader != null) {
			try {
				((BufferedReader) (bufferedreader)).close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}
		if (process != null) {
			process.destroy();
		}

		if (obj == null) {
			// break MISSING_BLOCK_LABEL_502;
		}
		try {
			((DataOutputStream) (stream)).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (bufferedreader == null) {
			// break MISSING_BLOCK_LABEL_512;
		}

		if (bufferedreader != null) {
			try {
				((BufferedReader) (bufferedreader)).close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}

		k = j;
		if (process != null) {
			process.destroy();
			// obj2 = as;
			// obj3 = obj1;
			k = j;
		}
		return new vc(k);
	}

	public static void a(int paramInt) {
		Locale localLocale = Locale.US;
		Object[] arrayOfObject = new Object[1];
		arrayOfObject[0] = Integer.valueOf(paramInt);
		a(String.format(localLocale, "input keyevent %d", arrayOfObject), true,
				false);
	}

	public static boolean a() {
		boolean bool = true;
		if (a("echo root", bool, false).a == 0) {
		}

		bool = false;
		return bool;
	}

	public static void b() {
	}

	public static void c() {
		a(26);
	}

	public static void d() {
		a(4);
	}
}
