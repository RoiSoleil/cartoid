package roisoleil.cartoid.view;

import roisoleil.cartoid.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class uCalendar extends LinearLayout {
	public uCalendar(Context context) {
		super(context);
		this.addView(inflate(context, R.layout.ucalendar, null));
	}

	public uCalendar(Context context, AttributeSet attrs) {
		super(context);
		this.addView(inflate(context, R.layout.ucalendar, null));
	}

	public uCalendar(Context context, AttributeSet attrs, int defStyle) {
		super(context);
		this.addView(inflate(context, R.layout.ucalendar, null));
	}
}
