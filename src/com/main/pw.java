package com.main;

import java.util.Comparator;

import com.lazyswipe.notification.sms.ContactEditPanel;

public class pw implements Comparator {

	final ContactEditPanel a;

	public pw(ContactEditPanel contacteditpanel) {
		super();
		a = contacteditpanel;

	}

	public int compare(Object obj, Object obj1) {
		obj = (mq) obj;
		obj1 = (mq) obj1;
		return ((mq) (obj)).g() <= ((mq) (obj1)).g() ? -1 : 1;
	}
}
