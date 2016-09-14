package com.main;

import android.content.Context;
import android.util.Log;

public class gh {

	private gi a;

	public gh(Context context) {
		a = new gi(context, "qiigameAgent@v2");
	}

	private void c(String s1, int i1) {
		a.a(s1, i1);
	}

	public void A() {
		a.a(203, "");
	}

	public String B() {
		return a.b(204, "");
	}

	public void C() {
		a.a(204, "");
	}

	public String D() {
		return a.b(205, "");
	}

	public void E() {
		a.a(205, "");
	}

	public String F() {
		return a.b(206, "");
	}

	public void G() {
		a.a(206, "");
	}

	public String H() {
		return a.b(207, "");
	}

	public void I() {
		a.a(207, "");
	}

	public String J() {
		return a.b(209, "");
	}

	public void K() {
		a.a(209, "");
	}

	public long L() {
		return a.b(400, 0L);
	}

	public long M() {
		return a.b(403, 0L);
	}

	public long N() {
		return a.b(401, 0L);
	}

	public boolean O() {
		return a.b(501, false);
	}

	public void P() {
		String s1 = (new StringBuilder()).append(404)
				.append(String.valueOf(gg.e())).toString();
		String s2 = a.b(503, "");
		if (!s2.equals(s1)) {
			a.b(s2);
			a.a(503, s1);
		}
		a.a(s1, true);
	}

	public boolean Q() {
		String s1 = (new StringBuilder()).append(404)
				.append(String.valueOf(gg.e())).toString();
		return a.b(s1, false);
	}

	public long R() {
		return a.b(402, 0L);
	}

	public void S() {
		String s1 = (new StringBuilder()).append(406).append(ge.c().i())
				.toString();
		String s2 = a.b(505, "");
		if (!s2.equals(s1)) {
			a.b(s2);
			a.a(505, s1);
		}
		a.a(s1, T() + 1);
	}

	public int T() {
		String s1 = (new StringBuilder()).append(406).append(ge.c().i())
				.toString();
		return a.b(s1, 0);
	}

	public void U() {
		String s1 = (new StringBuilder()).append(407).append(ge.c().i())
				.toString();
		String s2 = a.b(506, "");
		if (!s2.equals(s1)) {
			a.b(s2);
			a.a(506, s1);
		}
		a.a(s1, T() + 1);
	}

	public int V() {
		String s1 = (new StringBuilder()).append(407).append(ge.c().i())
				.toString();
		return a.b(s1, 0);
	}

	public void a() {
		if (a != null) {
			a.a();
		}
		a = null;
	}

	public void a(long l1) {
		a.a(400, l1);
	}

	public void a(String s1) {
		if (!ge.c().p()) {
			a.a(100, (new StringBuilder()).append(s1).append("<>").append(b())
					.toString());
			if (b().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(200, (new StringBuilder()).append(s1).append("<>").append(t())
					.toString());
			return;
		}
	}

	public void a(String s1, int i1) {
		String s2 = a.b(502, "");
		if (!s2.equals(s1)) {
			a.b(s2);
			a.a(502, s1);
		}
		c(s1, i1);
	}

	public void a(boolean flag) {
		a.a(501, flag);
	}

	public int b(String s1, int i1) {
		return a.b(s1, i1);
	}

	public String b() {
		return a.b(100, "");
	}

	public void b(long l1) {
		a.a(403, l1);
	}

	public void b(String s1) {
		if (!ge.c().p()) {
			a.a(101, (new StringBuilder()).append(s1).append("<>").append(d())
					.toString());
			if (d().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(201, (new StringBuilder()).append(s1).append("<>").append(v())
					.toString());
			return;
		}
	}

	public void c() {
		a.a(100, "");
	}

	public void c(long l1) {
		a.a(401, l1);
	}

	public void c(String s1) {
		if (!ge.c().p()) {
			a.a(102, (new StringBuilder()).append(s1).append("<>").append(f())
					.toString());
			if (f().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(202, (new StringBuilder()).append(s1).append("<>").append(x())
					.toString());
			return;
		}
	}

	public String d() {
		return a.b(101, "");
	}

	public void d(long l1) {
		a.a(402, l1);
	}

	public void d(String s1) {
		if (!ge.c().p()) {
			a.a(103, (new StringBuilder()).append(s1).append("<>").append(h())
					.toString());
			if (h().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(203, (new StringBuilder()).append(s1).append("<>").append(z())
					.toString());
			return;
		}
	}

	public void e() {
		a.a(101, "");
	}

	public void e(String s1) {
		if (!ge.c().p()) {
			a.a(104, (new StringBuilder()).append(s1).append("<>").append(j())
					.toString());
			if (j().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(204, (new StringBuilder()).append(s1).append("<>").append(B())
					.toString());
			return;
		}
	}

	public String f() {
		return a.b(102, "");
	}

	public void f(String s1) {
		if (!ge.c().p()) {
			a.a(105, (new StringBuilder()).append(s1).append("<>").append(l())
					.toString());
			if (l().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(205, (new StringBuilder()).append(s1).append("<>").append(D())
					.toString());
			return;
		}
	}

	public void g() {
		a.a(102, "");
	}

	public void g(String s1) {
		if (!ge.c().p()) {
			a.a(106, (new StringBuilder()).append(s1).append("<>").append(n())
					.toString());
			if (n().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(206, (new StringBuilder()).append(s1).append("<>").append(F())
					.toString());
			return;
		}
	}

	public String h() {
		return a.b(103, "");
	}

	public void h(String s1) {
		if (!ge.c().p()) {
			a.a(107, (new StringBuilder()).append(s1).append("<>").append(p())
					.toString());
			if (p().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(207, (new StringBuilder()).append(s1).append("<>").append(H())
					.toString());
			return;
		}
	}

	public void i() {
		a.a(103, "");
	}

	public void i(String s1) {
		if (fx.a) {
			Log.d("QiigameAgent", (new StringBuilder())
					.append("addEventData9:").append(s1).toString());
		}
		if (!ge.c().p()) {
			a.a(109, (new StringBuilder()).append(s1).append("<>").append(r())
					.toString());
			if (r().getBytes().length > 30000) {
				ge.c().n();
			}
			return;
		} else {
			a.a(209, (new StringBuilder()).append(s1).append("<>").append(J())
					.toString());
			return;
		}
	}

	public String j() {
		return a.b(104, "");
	}

	public void k() {
		a.a(104, "");
	}

	public String l() {
		return a.b(105, "");
	}

	public void m() {
		a.a(105, "");
	}

	public String n() {
		return a.b(106, "");
	}

	public void o() {
		a.a(106, "");
	}

	public String p() {
		return a.b(107, "");
	}

	public void q() {
		a.a(107, "");
	}

	public String r() {
		return a.b(109, "");
	}

	public void s() {
		a.a(109, "");
	}

	public String t() {
		return a.b(200, "");
	}

	public void u() {
		a.a(200, "");
	}

	public String v() {
		return a.b(201, "");
	}

	public void w() {
		a.a(201, "");
	}

	public String x() {
		return a.b(202, "");
	}

	public void y() {
		a.a(202, "");
	}

	public String z() {
		return a.b(203, "");
	}
}
