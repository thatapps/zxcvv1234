package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Context;

public class rq extends rn {
	public rq(Context paramContext) {
	}

	public boolean a() {
		boolean flag1 = false;
		boolean flag;
		Object obj = null;
		try {
			obj = new FileInputStream("/sys/class/leds/spotlight/brightness");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		int i = 0;
		try {
			i = ((FileInputStream) (obj)).read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			((FileInputStream) (obj)).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i != -1) {

			flag = a(false);
			flag1 = flag;
			flag = flag1;
			if (obj == null) {

				return flag;
			} else {

				tq.a(((java.io.Closeable) (obj)));
				return flag1;

			}

		} else {

			flag = flag1;
			if (obj != null) {
				tq.a(((java.io.Closeable) (obj)));
				flag = flag1;
			}

		}

		flag = flag1;
		if (obj == null) {

			return flag;
		} else {
			Object obj1;
			obj = null;
			tq.a(((java.io.Closeable) (obj)));
			return false;
		}

		// if (obj != null)
		// {
		// tq.a(((java.io.Closeable) (obj)));
		// }

	}

	public boolean a(boolean flag) {
		Object obj = null;
		try {
			obj = new FileOutputStream("/sys/class/leds/spotlight/brightness");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		Object obj1;
		int i;
		if (flag) {
			i = 49;
		} else {
			i = 48;
		}
		try {
			((FileOutputStream) (obj)).write(new byte[] { (byte) i, 10 });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (obj != null) {
			tq.a(((java.io.Closeable) (obj)));
			return true;
		}

		// obj = null;

		// _L4:
		if (obj != null) {
			tq.a(((java.io.Closeable) (obj)));
		}
		return false;

		// obj1;
		// obj = null;

	}

	public boolean b() {
		Object obj1;
		boolean flag;
		boolean flag1;
		flag1 = false;
		flag = false;
		obj1 = null;
		Object obj = null;
		try {
			obj = new FileInputStream("/sys/class/leds/spotlight/brightness");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		obj1 = obj;
		int i = 0;
		try {
			i = ((FileInputStream) (obj)).read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i != 48) {
			flag = true;
		}
		flag1 = flag;
		if (obj != null) {
			tq.a(((java.io.Closeable) (obj)));
			flag1 = flag;
		}
		// _L2:
		// return flag1;
		// obj;
		// obj = null;
		if (obj1 != null) {
			tq.a(((java.io.Closeable) (obj1)));
		}
		if (obj == null) {
			return flag1;
		} else {
			tq.a(((java.io.Closeable) (obj)));
			return false;

		}

	}

	public void c() {
		a(false);
	}

	public void d() {
		a(true);
	}
}
