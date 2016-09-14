
package com.lazyswipe.notification.sms;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class ContactAddPanelListView extends ListView {
	public ContactAddPanelListView(Context context) {
		super(context);
	}

	public ContactAddPanelListView(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	protected int computeVerticalScrollOffset() {
		int n;
		if (this.getHeight() == 0) {
			n = 0;
			do {
				return n + super.computeVerticalScrollOffset();

			} while (true);
		}
		n = (int) (1.0f * (float) vk.a(this.getContext(), 18.0f)
				* (float) super.computeVerticalScrollRange() / (float) this
				.getHeight());
		return n + super.computeVerticalScrollOffset();
	}
}
