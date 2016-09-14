package com.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.lazyswipe.notification.sms.ContactAddPanel;
import java.util.List;

public class ps extends ArrayAdapter {

	final ContactAddPanel a;

	public ps(ContactAddPanel contactaddpanel, Context context, List list) {
		super(context, 0, list);
		a = contactaddpanel;

	}

	public View getView(int i, View view, ViewGroup viewgroup) {
		mu mu1;
		Bitmap bitmap;
		pt pt;
		if (view == null) {
			pt = new pt(this, null);
			view = LayoutInflater.from(getContext()).inflate(0x7f040001, null);
			pt.b = (TextView) view.findViewById(0x7f0c000d);
			pt.a = (TextView) view.findViewById(0x7f0c000b);
			pt.c = (ImageView) view.findViewById(0x7f0c000c);
			pt.d = view.findViewById(0x7f0c000e);
			view.setTag(pt);
		} else {
			pt = (pt) view.getTag();
		}
		mu1 = (mu) getItem(i);
		((pt) (pt)).c.setTag(mu1.d());
		bitmap = ContactAddPanel.f(a).a(mu1.d(), new qa() {

			final ps a;

			public void a(Bitmap bitmap1, String s) {
				ImageView imageView = (ImageView) ContactAddPanel.a(a.a)
						.findViewWithTag(s);
				if (s != null && tf.b(bitmap1)) {
					imageView.setImageBitmap(bitmap1);
				}
			}

			{
				a = ps.this;
				// super();
			}
		});
		if (tf.b(bitmap)) {
			((pt) (pt)).c.setImageBitmap(bitmap);
		} else {
			((pt) (pt)).c.setImageDrawable(mu1.a(getContext()));
		}
		if (mu1.g()) {
			((ViewGroup) ((pt) (pt)).a.getParent()).setVisibility(0);
			((pt) (pt)).a.setText(String.valueOf(mu1.f()));
		} else {
			((ViewGroup) ((pt) (pt)).a.getParent()).setVisibility(8);
		}
		if (mu1.h()) {
			((pt) (pt)).d.setVisibility(8);
		} else {
			((pt) (pt)).d.setVisibility(0);
		}
		((pt) (pt)).b.setText(mu1.e());
		return view;
	}
}
