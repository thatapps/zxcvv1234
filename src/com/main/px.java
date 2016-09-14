package com.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.lazyswipe.notification.sms.ContactEditPanel;
import java.util.List;

public class px extends ArrayAdapter {

	final ContactEditPanel a;

	public px(ContactEditPanel contacteditpanel, Context context, List list) {
		super(context, 0, list);
		a = contacteditpanel;

	}

	public View getView(int i, View view, ViewGroup viewgroup) {
		mq mq1;
		py py ;
		if (view == null) {
			 py = new py(this, null);
			view = LayoutInflater.from(getContext()).inflate(0x7f040036, null);
			py.c = (ImageView) view.findViewById(0x7f0c00a1);
			py.b = (CheckBox) view.findViewById(0x7f0c00a3);
			py.a = (TextView) view.findViewById(0x7f0c00a2);
			py.d = view.findViewById(0x7f0c000e);
			view.setTag(py);
		} else {
			py = (py) view.getTag();
		}
		mq1 = (mq) getItem(i);
		((py) (py)).a.setText(mq1.f());
		((py) (py)).c.setImageDrawable(mq1.e());
		((py) (py)).b.setChecked(mq1.b());
		if (i >= getCount() - 1) {
			((py) (py)).d.setVisibility(4);
			return view;
		} else {
			((py) (py)).d.setVisibility(0);
			return view;
		}
	}
}
