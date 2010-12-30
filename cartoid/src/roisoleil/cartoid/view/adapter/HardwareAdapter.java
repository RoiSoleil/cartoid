package roisoleil.cartoid.view.adapter;

import java.util.List;
import java.util.Map.Entry;

import roisoleil.cartoid.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HardwareAdapter extends BaseAdapter {
	private Context context;
	private List<HardwareAdapterEntity> data;

	public HardwareAdapter(Context context,
			List<HardwareAdapterEntity> data) {
		this.context = context;
		this.data = data;
	}

	@Override
	public int getCount() {
		return this.data.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.data.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		HardwareAdapterEntity entity = this.data.get(position);
		View ret = View.inflate(this.context, R.layout.hw_ct, null);
		((ImageView) ret.findViewById(R.id.image)).setImageResource(entity
				.getImage());
		((TextView) ret.findViewById(R.id.constructor))
				.setText("Constructeur : " + entity.getConstructor());
		((TextView) ret.findViewById(R.id.price)).setText("Prix : "
				+ entity.getPrice());
		for (Entry<String, String> entry : entity.getAttributes().entrySet()) {
			TextView attribute = (TextView) View.inflate(this.context,
					R.layout.hw_attribute, null);
			attribute.setText(entry.getKey() + " : " + entry.getValue());
			((LinearLayout) ret.findViewById(R.id.hw_attributes))
					.addView(attribute);
		}
		return ret;
	}
}
