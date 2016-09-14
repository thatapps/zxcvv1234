package com.lazyswipe.notification;

import android.accessibilityservice.AccessibilityServiceInfo;

public final class SwipeAccessibilityServicePreJellyBean extends
		SwipeAccessibilityService {
	protected void onServiceConnected() {
		super.onServiceConnected();
		AccessibilityServiceInfo localAccessibilityServiceInfo = new AccessibilityServiceInfo();
		localAccessibilityServiceInfo.eventTypes = 64;
		localAccessibilityServiceInfo.feedbackType = 16;
		localAccessibilityServiceInfo.flags = 1;
		localAccessibilityServiceInfo.notificationTimeout = 100L;
		setServiceInfo(localAccessibilityServiceInfo);
	}
}
