package com.main;

import android.database.AbstractCursor;

public class ko extends AbstractCursor {

	private String a[] = { "value" };
	private Object b;

	public ko(Object obj) {
		b = obj;
	}

	public String[] getColumnNames() {
		return a;
	}

	public int getCount() {
		return 1;
	}

	public double getDouble(int i) {
		Double double1;
		if (b instanceof Double) {
			double1 = (Double) b;
		} else {
			double1 = null;
		}
		return double1.doubleValue();
	}

	public float getFloat(int i) {
		Float float1;
		if (b instanceof Float) {
			float1 = (Float) b;
		} else {
			float1 = null;
		}
		return float1.floatValue();
	}

	public int getInt(int i) {
		Integer integer;
		if (b instanceof Integer) {
			integer = (Integer) b;
		} else {
			integer = null;
		}
		return integer.intValue();
	}

	public long getLong(int i) {
		Long long1;
		if (b instanceof Long) {
			long1 = (Long) b;
		} else {
			long1 = null;
		}
		return long1.longValue();
	}

	public short getShort(int i) {
		Short short1;
		if (b instanceof Short) {
			short1 = (Short) b;
		} else {
			short1 = null;
		}
		return short1.shortValue();
	}

	public String getString(int i) {
		if (b instanceof String) {
			return (String) b;
		} else {
			return null;
		}
	}

	public boolean isNull(int i) {
		return b == null;
	}
}
