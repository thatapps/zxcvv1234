package com.main;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class fv {
	private static fv c;
	private SQLiteDatabase a;
	private SQLiteOpenHelper b;

	public static fv a() {
		if (c == null) {
			c = new fv();
		}
		return c;
	}

	/* Error */
	/**
	 * @deprecated
	 */
	private boolean a(String string, String string2) {
		Cursor cursor = null;
		fv fv = this;
		synchronized (fv) {
			int n;
			boolean bl;
			boolean bl2 = this.c(string);
			boolean bl3 = false;
			if (!bl2)
				return bl3;
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				String string3 = String
						.format((String) "SELECT * FROM TabAgent2 WHERE eventId='%1$s' and eventMessage='%2$s'",
								(Object[]) new Object[] { string, string2 });
				if (fx.a) {
					Log.i((String) "DF_SQL", (String) string3);
				}
				cursor = this.a.rawQuery(string3, null);
				n = 0;
			} catch (Exception var8_10) {
				try {
					var8_10.printStackTrace();
					bl3 = false;
					if (cursor == null)
						return bl3;
				} catch (Throwable var7_11) {
					if (cursor == null)
						try {
							throw var7_11;
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					cursor.close();
					try {
						throw var7_11;
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				cursor.close();
				return false;
			}
			while (bl = cursor.moveToNext()) {
				++n;
			}
			bl3 = false;
			if (n >= 1) {
				bl3 = true;
			}
			if (cursor == null)
				return bl3;
			cursor.close();
			return bl3;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private boolean b(String string, long l) {
		Cursor cursor = null;
		fv fv = this;
		synchronized (fv) {
			boolean bl;
			int n;
			boolean bl2 = this.c(string);
			boolean bl3 = false;
			if (!bl2)
				return bl3;
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				Object[] arrobject = new Object[] { string, l };
				String string2 = String
						.format((String) "SELECT * FROM TabAgent2 WHERE eventId='%1$s' and date='%2$d'",
								(Object[]) arrobject);
				if (fx.a) {
					Log.i((String) "DF_SQL", (String) string2);
				}
				cursor = this.a.rawQuery(string2, null);
				n = 0;
			} catch (Exception var9_11) {
				try {
					var9_11.printStackTrace();
					bl3 = false;
					if (cursor == null)
						return bl3;
				} catch (Throwable var8_12) {
					if (cursor == null)
						try {
							throw var8_12;
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					cursor.close();
					try {
						throw var8_12;
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				cursor.close();
				return false;
			}
			while (bl = cursor.moveToNext()) {
				++n;
			}
			bl3 = false;
			if (n >= 1) {
				bl3 = true;
			}
			if (cursor == null)
				return bl3;
			cursor.close();
			return bl3;
		}
	}

	private int c(String s, long l1) {
		Object obj1;
		Object obj2;
		int j1;
		boolean flag;
		obj1 = null;
		obj2 = null;
		flag = false;
		j1 = 0;
		int i1 = 0;
		// this;
		// JVM INSTR monitorenter ;
		boolean flag1 = c(s);
		if (flag1) {
			_L2: if (!d()) {
				a().a(ge.c().e);
			}
			Object obj = obj1;
			String s1 = String
					.format("SELECT * FROM TabAgent2 WHERE eventId='%1$s' and date='%2$d'",
							new Object[] { s, Long.valueOf(l1) });
			obj = obj1;
			obj1 = a.rawQuery(s1, null);
			j1 = 0;
			i1 = 0;
		} else {
			return i1;
		}

		// _L4:
		int k1;
		if (!((Cursor) (obj1)).moveToNext()) {
			// break; /* Loop/switch isn't completed */

			k1 = ((Cursor) (obj1)).getInt(((Cursor) (obj1))
					.getColumnIndex("count"));
			j1++;
			i1 = k1;
		} else {
			if (j1 <= 1) {
				j1 = i1;
				i1 = j1;
				if (obj1 == null) {
					return i1;
				} else {
					((Cursor) (obj1)).close();
					i1 = j1;
					s = (String) obj2;
					return i1;
					// s;
					// throw s;
					// obj1;

				}
				// s;
				/*
				 * if (obj == null) { break MISSING_BLOCK_LABEL_233; } ((Cursor)
				 * (obj)).close(); throw s; s; obj = obj1; goto _L9 Exception
				 * exception; exception; s = ((String) (obj1)); obj1 =
				 * exception; j1 = i1; goto _L10
				 */
			} else {
				a(s);
				j1 = ((flag) ? 1 : 0);
			}
		}

		/*
		 * L5: a(s); j1 = ((flag) ? 1 : 0); _L11: i1 = j1; if (obj1 == null)
		 * goto _L1; else goto _L7 _L7: ((Cursor) (obj1)).close(); i1 = j1; goto
		 * _L1 s; throw s; obj1; s = obj2; _L10: obj = s; ((Exception)
		 * (obj1)).printStackTrace(); i1 = j1; if (s == null) goto _L1; else
		 * goto _L8 _L8: s.close(); i1 = j1; goto _L1 _L9: if (obj == null) {
		 * break MISSING_BLOCK_LABEL_233; } ((Cursor) (obj)).close(); throw s;
		 * s; obj = obj1; goto _L9 Exception exception; exception; s = ((String)
		 * (obj1)); obj1 = exception; j1 = i1; goto _L10 _L6: j1 = i1; goto _L11
		 * s; goto _L9
		 */
		return i1;
	}

	private boolean c(String paramString) {
		boolean bool1 = true;
		boolean bool2 = false;
		if ((paramString.contentEquals(" "))
				|| (paramString.contentEquals("Exception"))
				|| (paramString.length() > 10)) {
			bool2 = bool1;
			if (bool2) {
				bool1 = false;
			}
		}

		return bool1;

		// label42: bool1 = false;

	}

	public SQLiteDatabase a(final Context context) {
		try {
			if (this.d())
				return this.a;
			if (this.b == null) {
				this.b = new SQLiteOpenHelper(context, "qiigameAgent.db", null,
						3) {

					private void a(SQLiteDatabase sQLiteDatabase) {
						sQLiteDatabase
								.execSQL("CREATE TABLE if NOT EXISTS TabAgent2 (ID integer primary key autoincrement,date long default 0,eventId text null,eventType int default 0,eventMessage text null,count long default 0,sendState int default 0)");
					}

					private void b(SQLiteDatabase sQLiteDatabase) {
						sQLiteDatabase
								.execSQL("DROP TABLE IF EXISTS TabAgent2");
					}

					public void onCreate(SQLiteDatabase sQLiteDatabase) {
						try {
							if (fx.a) {
								Log.d((String) "DF_SQL",
										(String) "Enter onCreate");
							}
							gh gh = new gh(context);
							gh.a(true);
							gh.a();
							sQLiteDatabase.beginTransaction();
							this.a(sQLiteDatabase);
							sQLiteDatabase.setTransactionSuccessful();
							sQLiteDatabase.endTransaction();
							return;
						} catch (Exception var2_3) {
							var2_3.printStackTrace();
							return;
						}
					}

					public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n,
							int n2) {
						if (fx.a) {
							Log.d((String) "DF_SQL", (String) "Enter OnUpdate");
						}
						try {
							gh gh = new gh(context);
							gh.a(false);
							gh.a();
							sQLiteDatabase.beginTransaction();
							this.b(sQLiteDatabase);
							this.a(sQLiteDatabase);
							sQLiteDatabase.setTransactionSuccessful();
							sQLiteDatabase.endTransaction();
							sQLiteDatabase.setVersion(n2);
							return;
						} catch (Exception var5_5) {
							var5_5.printStackTrace();
							return;
						}
					}
				};
			}
			this.a = this.b.getWritableDatabase();
			if (!fx.a)
				return this.a;
			StringBuilder stringBuilder = new StringBuilder()
					.append("updateSendToNone mDatabase: ");
			boolean bl = this.a == null;
			Log.d((String) "DF_SQL", (String) stringBuilder.append(bl)
					.toString());
			return this.a;
		} catch (Exception var2_4) {
			if (fx.a) {
				Log.e((String) "system.err",
						(String) ("Exception:" + (Object) var2_4),
						(Throwable) var2_4);
			}
			var2_4.printStackTrace();
			this.i();
			ge.c().d = false;
			return this.a;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public List a(int i1, String s) {
		String s1 = null;
		Object obj1 = null;
		// this;
		// JVM INSTR monitorenter ;
		ArrayList arraylist;
		if (!d()) {
			a().a(ge.c().e);
		}
		arraylist = new ArrayList();
		Object obj;
		obj = obj1;
		s = s1;
		String s2 = String
				.format("SELECT * FROM TabAgent2 WHERE eventType = '%1$d' ORDER BY date ASC",
						new Object[] { Integer.valueOf(i1) });
		obj = obj1;
		s = s1;
		obj1 = a.rawQuery(s2, null);
		// _L4:
		obj = obj1;
		s = ((String) (obj1));
		if (!((Cursor) (obj1)).moveToNext()) {

			if (obj1 == null) {
				return arraylist;
			} else {

				((Cursor) (obj1)).close();
				return arraylist;
				/*
				 * s; throw s; Exception exception; exception; if (s == null) {
				 * break MISSING_BLOCK_LABEL_442; } s.close(); throw exception;
				 * }
				 */

			}
		} else {

			obj = obj1;
			s = ((String) (obj1));
			long l1 = ((Cursor) (obj1)).getLong(((Cursor) (obj1))
					.getColumnIndex("date"));
			obj = obj1;
			s = ((String) (obj1));
			s1 = (new StringBuilder())
					.append("")
					.append(((Cursor) (obj1)).getString(((Cursor) (obj1))
							.getColumnIndex("eventId"))).toString();
			obj = obj1;
			s = ((String) (obj1));
			i1 = ((Cursor) (obj1)).getInt(((Cursor) (obj1))
					.getColumnIndex("eventType"));
			obj = obj1;
			s = ((String) (obj1));
			s2 = (new StringBuilder())
					.append("")
					.append(((Cursor) (obj1)).getString(((Cursor) (obj1))
							.getColumnIndex("eventMessage"))).toString();
			obj = obj1;
			s = ((String) (obj1));
			if (!fx.a) {
				// break MISSING_BLOCK_LABEL_299;
			}
			obj = obj1;
			s = ((String) (obj1));
			Log.i("DF_SQL", (new StringBuilder()).append("dt:").append(l1)
					.append(",ei:").append(s1).append(",et:").append(i1)
					.append(",em:").append(s2).toString());
			obj = obj1;
			s = ((String) (obj1));
			gf gf1 = new gf();
			obj = obj1;
			s = ((String) (obj1));
			gf1.a(Long.valueOf(l1));
			obj = obj1;
			s = ((String) (obj1));
			gf1.a(s1);
			obj = obj1;
			s = ((String) (obj1));
			gf1.b(s2);
			obj = obj1;
			s = ((String) (obj1));
			gf1.a(i1);
			obj = obj1;
			s = ((String) (obj1));
			arraylist.add(gf1);

		}
		return arraylist;

		/*
		 * _L3: obj1; s = ((String) (obj)); ((Exception)
		 * (obj1)).printStackTrace(); if (obj == null) { break
		 * MISSING_BLOCK_LABEL_406; } ((Cursor) (obj)).close(); _L6: this; JVM
		 * INSTR monitorexit ; return arraylist; _L2: if (obj1 == null) goto
		 * _L6; else goto _L5 _L5: ((Cursor) (obj1)).close(); goto _L6 s; throw
		 * s; Exception exception; exception; if (s == null) { break
		 * MISSING_BLOCK_LABEL_442; } s.close(); throw exception;
		 */
	}

	/**
	 * @deprecated
	 */
	public void a(long l, String string, int n, String string2, long l2) {
		fv fv = this;
		synchronized (fv) {
			try {
				boolean bl = this.c(string);
				if (bl) {
					if (!this.d()) {
						fv.a().a(ge.c().e);
					}
					if (!(n > 2 && this.b(string, l) || n == 9
							&& this.a(string, string2))) {
						Object[] arrobject = new Object[] { l, string, n,
								string2, l2, 0 };
						String string3 = String
								.format((String) "INSERT INTO TabAgent2 ( date,eventId,eventType,eventMessage,count,sendState ) values ('%1$d','%2$s','%3$d','%4$s','%5$d','%6$d')",
										(Object[]) arrobject);
						Log.i((String) "DF_SQL", (String) string3);
						this.a.execSQL(string3);
					}
				}
			} catch (Exception var9_10) {
				var9_10.printStackTrace();
			}
			return;
		}
	}

	/**
	 * @deprecated
	 */
	public void a(gf paramgf, int paramInt) {
		try {
			if (!d()) {
				a().a(ge.c().e);
			}
			Object[] arrayOfObject = new Object[5];
			arrayOfObject[0] = Integer.valueOf(paramInt);
			arrayOfObject[1] = paramgf.a();
			arrayOfObject[2] = paramgf.b();
			arrayOfObject[3] = Integer.valueOf(paramgf.c());
			arrayOfObject[4] = paramgf.d();
			String str = String
					.format("UPDATE TabAgent2 SET sendState = '%1$d' WHERE date='%2$d' AND eventId = '%3$s' AND eventType = '%4$d' AND eventMessage = '%5$s'",
							arrayOfObject);
			if (fx.a) {
				Log.i("DF_SQL", str);
			}
			this.a.execSQL(str);
			return;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();
			}
		} finally {
		}
	}

	/**
	 * @deprecated
	 */
	public void a(String string, long l) {
		fv fv = this;
		synchronized (fv) {
			try {
				boolean bl = this.c(string);
				if (bl) {
					int n;
					if (!this.d()) {
						fv.a().a(ge.c().e);
					}
					if ((n = this.c(string, l)) == 0) {
						this.a(l, string, 6, "", 1);
					}
					Object[] arrobject = new Object[] { n + 1, string, l };
					String string2 = String
							.format((String) "UPDATE TabAgent2 SET count = '%1$d' WHERE eventId='%2$s' and date='%3$d'",
									(Object[]) arrobject);
					if (fx.a) {
						Log.i((String) "DF_SQL", (String) string2);
					}
					this.a.execSQL(string2);
				}
			} catch (Exception var5_6) {
				var5_6.printStackTrace();
			}
			return;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public boolean a(String string) {
		boolean bl = true;
		fv fv = this;
		synchronized (fv) {
			boolean bl2 = this.c(string);
			boolean bl3 = false;
			if (!bl2)
				return bl3;
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				String string2 = String.format(
						(String) "DELETE FROM TabAgent2 WHERE eventId='%1$s'",
						(Object[]) new Object[] { string });
				this.a.execSQL(string2);
				return bl;
			} catch (Exception var6_7) {
				var6_7.printStackTrace();
				return false;
			}
		}
	}

	public void b() {
		if (this.a != null) {
			this.a.beginTransaction();
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public boolean b(String string) {
		boolean bl = true;
		fv fv = this;
		synchronized (fv) {
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				String string2 = String
						.format((String) "DELETE FROM TabAgent2 WHERE eventMessage<>'%1$s' AND eventType='9'",
								(Object[]) new Object[] { string });
				if (fx.a) {
					Log.i((String) "SQL", (String) string2);
				}
				this.a.execSQL(string2);
				return bl;
			} catch (Exception var4_5) {
				var4_5.printStackTrace();
				return false;
			}
		}
	}

	public void c() {
		if (this.a != null) {
			this.a.setTransactionSuccessful();
			this.a.endTransaction();
		}
	}

	public boolean d() {
		if (this.a == null) {
			return false;
		}
		return this.a.isOpen();
	}

	/**
	 * @deprecated
	 */
	public void e() {
		boolean bl = true;
		fv fv = this;
		synchronized (fv) {
			try {
				if (!this.d()) {
					fv.a().a(ge.c().e);
				}
				Object[] arrobject = new Object[] { 0, 1 };
				String string = String
						.format((String) "UPDATE TabAgent2 SET sendState = '%1$d' WHERE sendState= '%2$d'",
								(Object[]) arrobject);
				if (fx.a) {
					Log.i((String) "DF_SQL", (String) string);
					StringBuilder stringBuilder = new StringBuilder()
							.append("updateSendToNone mDatabase: ");
					if (this.a != null) {
						bl = false;
					}
					Log.d((String) "DF_SQL", (String) stringBuilder.append(bl)
							.toString());
				}
				this.a.execSQL(string);
			} catch (Exception var3_6) {
				var3_6.printStackTrace();
			}
			return;
		}
	}

	/**
	 * @deprecated
	 */
	public void f() {
		fv fv = this;
		synchronized (fv) {
			try {
				if (!this.d()) {
					fv.a().a(ge.c().e);
				}
				Object[] arrobject = new Object[] { 2, 1 };
				String string = String
						.format((String) "UPDATE TabAgent2 SET sendState = '%1$d' WHERE sendState= '%2$d'",
								(Object[]) arrobject);
				if (fx.a) {
					Log.i((String) "DF_SQL", (String) string);
				}
				this.a.execSQL(string);
				do {
					return;
					// break;
				} while (true);
			} catch (Exception var2_4) {
				var2_4.printStackTrace();
				return;
			} finally {
			}
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public List g() {
		String s = null;
		Object obj2 = null;
		// this;
		// JVM INSTR monitorenter ;
		ArrayList arraylist;
		if (!d()) {
			a().a(ge.c().e);
		}
		arraylist = new ArrayList();
		Object obj;
		Object obj1;
		obj1 = obj2;
		obj = s;
		String s1 = String
				.format("SELECT * FROM TabAgent2 WHERE eventType='6' and date<'%1$d' ORDER BY date ASC",
						new Object[] { Long.valueOf(gg.e()) });
		obj1 = obj2;
		obj = s;
		if (!fx.a) {
			// break MISSING_BLOCK_LABEL_86;
		}
		obj1 = obj2;
		obj = s;
		Log.i("DF_SQL", s1);
		obj1 = obj2;
		obj = s;
		obj2 = a.rawQuery(s1, null);
		// _L4:
		obj1 = obj2;
		obj = obj2;
		if (!((Cursor) (obj2)).moveToNext()) {
			if (obj2 == null) {
				return arraylist;
			} else {
				((Cursor) (obj2)).close();
				return arraylist;
				/*
				 * obj; throw obj; Exception exception;
				 */
				// exception;
				/*
				 * if (obj == null) { break MISSING_BLOCK_LABEL_472; }
				 */
				// ((Cursor) (obj)).close();
				// throw exception;
			}

		} else {

			obj1 = obj2;
			obj = obj2;
			long l1 = ((Cursor) (obj2)).getLong(((Cursor) (obj2))
					.getColumnIndex("date"));
			obj1 = obj2;
			obj = obj2;
			s = (new StringBuilder())
					.append("")
					.append(((Cursor) (obj2)).getString(((Cursor) (obj2))
							.getColumnIndex("eventId"))).toString();
			obj1 = obj2;
			obj = obj2;
			int i1 = ((Cursor) (obj2)).getInt(((Cursor) (obj2))
					.getColumnIndex("eventType"));
			obj1 = obj2;
			obj = obj2;
			s1 = (new StringBuilder())
					.append("")
					.append(((Cursor) (obj2)).getString(((Cursor) (obj2))
							.getColumnIndex("eventMessage"))).toString();
			obj1 = obj2;
			obj = obj2;
			long l2 = ((Cursor) (obj2)).getLong(((Cursor) (obj2))
					.getColumnIndex("count"));
			obj1 = obj2;
			obj = obj2;
			if (!fx.a) {
				// break MISSING_BLOCK_LABEL_333;
			}
			obj1 = obj2;
			obj = obj2;
			Log.i("DF_SQL",
					(new StringBuilder()).append("getDateSendData dt:")
							.append(l1).append(",ei:").append(s).append(",et:")
							.append(i1).append(",em:").append(s1)
							.append(",ct:").append(l2).toString());
			obj1 = obj2;
			obj = obj2;
			gf gf1 = new gf();
			obj1 = obj2;
			obj = obj2;
			gf1.a(Long.valueOf(l1));
			obj1 = obj2;
			obj = obj2;
			gf1.a(s);
			obj1 = obj2;
			obj = obj2;
			gf1.b(s1);
			obj1 = obj2;
			obj = obj2;
			gf1.a(i1);
			obj1 = obj2;
			obj = obj2;
			gf1.a(l2);
			obj1 = obj2;
			obj = obj2;
			arraylist.add(gf1);
		}
		((Cursor) (obj1)).close();
		/*
		 * _L3: obj2; obj = obj1; ((Exception) (obj2)).printStackTrace(); if
		 * (obj1 == null) { break MISSING_BLOCK_LABEL_438; } ((Cursor)
		 * (obj1)).close(); _L6: this; JVM INSTR monitorexit ; return arraylist;
		 * _L2: if (obj2 == null) goto _L6; else goto _L5 _L5: ((Cursor)
		 * (obj2)).close(); goto _L6 obj; throw obj; Exception exception;
		 * exception; if (obj == null) { break MISSING_BLOCK_LABEL_472; }
		 * ((Cursor) (obj)).close(); throw exception;
		 */
		return arraylist;
	}

	/**
	 * @deprecated
	 */
	public boolean h() {
		fv fv = this;
		synchronized (fv) {
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				if (fx.a) {
					Log.i((String) "SQL",
							(String) "DELETE FROM TabAgent2 WHERE sendState='2'");
				}
				this.a.execSQL("DELETE FROM TabAgent2 WHERE sendState='2'");
				return true;
			} catch (Exception var2_3) {
				var2_3.printStackTrace();
				return false;
			}
		}
	}

	public void i() {

		try {
			if (fx.a) {
				Log.i("SQL", "close DBManager start.");
			}
		} catch (Exception localException1) {
			localException1.printStackTrace();
			this.a = null;
			this.b = null;
			c = null;
			// continue;
		} finally {
			this.a = null;
			this.b = null;
			c = null;
		}
		try {
			if (this.b != null) {
				this.b.close();
			}
			if (this.a != null) {
				this.a.close();
			}
			if (fx.a) {
				Log.i("SQL", "close DBManager ok.");
			}
			this.a = null;
			this.b = null;
			c = null;
			return;
		} catch (Exception localException2) {
			localException2.printStackTrace();

		}
	}

	/* Error */
	public int j() {
		Cursor cursor = null;
		int i1 = 0;
		if (!d()) {
			a().a(ge.c().e);
		}
		cursor = a
				.rawQuery(
						"SELECT count(ID) as total FROM TabAgent2 WHERE eventType='1' or eventType='2' or eventType='3' or eventType='4' or eventType='5' or eventType='6' or eventType='7'",
						null);
		Cursor cursor1 = cursor;
		cursor.moveToFirst();
		cursor1 = cursor;
		i1 = cursor.getInt(cursor.getColumnIndex("total"));
		cursor1 = cursor;
		if (!fx.a) {
			// break MISSING_BLOCK_LABEL_97;
		}
		cursor1 = cursor;
		Log.e("DF_SQL", (new StringBuilder()).append("countRecord count:")
				.append(i1).toString());
		int j1;
		j1 = i1;
		if (cursor != null) {
			cursor.close();
			j1 = i1;
			return j1;
		}
		// _L2:

		// Exception exception1;
		// exception1;

		// _L5:
		cursor1 = cursor;
		if (!fx.a) {
			// break MISSING_BLOCK_LABEL_163;
		}
		cursor1 = cursor;
		// Log.e("DF_SQL", (new
		// StringBuilder()).append("countRecord exception:").append(exception1.getMessage()).toString());
		j1 = i1;
		if (cursor == null) {
			return j1;
		} else {
			cursor.close();
			cursor1 = null;
			return i1;
		}

		/*
		 * _L1: cursor.close(); return i1; Exception exception; exception;
		 * cursor1 = null; _L4: if (cursor1 != null) { cursor1.close(); } throw
		 * exception; exception; if (true) goto _L4; else goto _L3 _L3:
		 * exception1; i1 = 0; goto _L5 exception1; goto _L5
		 */
	}

	/**
	 * @deprecated
	 */
	public boolean k() {
		fv fv = this;
		synchronized (fv) {
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				if (fx.a) {
					Log.i((String) "DF_SQL",
							(String) "deleteMoreData ..............");
				}
				String string = String
						.format((String) "DELETE FROM TabAgent2 WHERE eventType='3' or eventType='4' or eventType='5' ORDER BY date ASC limit 0,4000",
								(Object[]) new Object[0]);
				this.a.execSQL(string);
				return true;
			} catch (Exception var2_4) {
				var2_4.printStackTrace();
				return false;
			}
		}
	}

	/**
	 * @deprecated
	 */
	public boolean l() {
		fv fv = this;
		synchronized (fv) {
			if (!this.d()) {
				fv.a().a(ge.c().e);
			}
			try {
				if (fx.a) {
					Log.i((String) "DF_SQL",
							(String) "deleteMoreEventData ..............");
				}
				String string = String
						.format((String) "DELETE FROM TabAgent2 WHERE eventType='3' or eventType='4' or eventType='5'",
								(Object[]) new Object[0]);
				this.a.execSQL(string);
				return true;
			} catch (Exception var2_4) {
				var2_4.printStackTrace();
				return false;
			}
		}
	}
}
