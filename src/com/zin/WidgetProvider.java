/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.appwidget.AppWidgetManager
 *  android.appwidget.AppWidgetProvider
 *  android.content.Context
 *  android.content.Intent
 *  android.widget.RemoteViews
 *  java.lang.String
 */
package com.lazyswipe;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import com.lazyswipe.zev.R;

/*
 * Failed to analyse overrides
 */
public class WidgetProvider extends AppWidgetProvider {
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] arrn) {
		for (int n : arrn) {
			PendingIntent pendingIntent = PendingIntent
					.getBroadcast((Context) context.getApplicationContext(),
							(int) 1, (Intent) new Intent(
									"com.lazyswipe.action.OPEN_FROM_WIDGET"),
							(int) 0);
			RemoteViews remoteViews = new RemoteViews("com.lazyswipe.zev",
					R.layout.widget);
			remoteViews.setOnClickPendingIntent(R.id.widget_container,
					pendingIntent);
			appWidgetManager.updateAppWidget(n, remoteViews);
		}
	}
}
