package roisoleil.cartoid.view;

import roisoleil.cartoid.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Dialog extends FrameLayout {
	private int index = 0;
	private Adapter views;
	private Adapter buttons;

	public Dialog(Context context) {
		super(context);
		inflate(this.getContext(), R.layout.hw, this);
	}

	public Dialog(Context context, AttributeSet attrs) {
		super(context, attrs);
		inflate(this.getContext(), R.layout.hw, this);
	}

	public Dialog(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		inflate(this.getContext(), R.layout.hw, this);
	}

	public void init() {
		this.findViewById(R.id.hw_hdr_prev).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						onPrevClick(v);
					}
				});
		this.findViewById(R.id.hw_hdr_next).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						onNextClick(v);
					}
				});
		for (int i = 0; i < this.buttons.getCount(); i++) {
			View view = this.buttons.getView(i, null, null);
			view.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					onButtonClick(v);
				}
			});
			((LinearLayout) this.findViewById(R.id.hw_bt)).addView(view);
		}
		this.setView(this.index);

	}

	public void onPrevClick(View v) {
		if (this.index <= 0) {
			this.index = this.views.getCount() - 1;
		} else {
			this.index--;
		}
		this.setView(this.index);
	}

	public void onNextClick(View v) {
		if (this.index >= this.views.getCount() - 1) {
			this.index = 0;
		} else {
			this.index++;
		}
		this.setView(this.index);
	}

	public void onButtonClick(View v) {
		Log.v("cartoid", String.valueOf(((LinearLayout) this
				.findViewById(R.id.hw_bt)).indexOfChild(v)));
	}

	public void setView(int index) {
		View view = this.views.getView(index, null, null);
		((LinearLayout) this.findViewById(R.id.hw_ct)).removeAllViews();
		((LinearLayout) this.findViewById(R.id.hw_ct)).addView(view,
				new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.FILL_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT));
	}

	public void setTitle(String title) {
		((TextView) this.findViewById(R.id.hw_hdr_title)).setText(title);
	}

	public void setDialog(Adapter views, Adapter buttons) {
		this.views = views;
		this.buttons = buttons;
		this.init();
	}
}
