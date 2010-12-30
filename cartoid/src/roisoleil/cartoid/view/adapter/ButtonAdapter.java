package roisoleil.cartoid.view.adapter;

import java.util.List;

import roisoleil.cartoid.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ButtonAdapter extends BaseAdapter {
	private Context context;
	private List<ButtonAdapterEntity> data;

	public ButtonAdapter(Context context, List<ButtonAdapterEntity> data) {
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
		ButtonAdapterEntity entity = this.data.get(position);
		TextView ret = (TextView) View.inflate(this.context, R.layout.dlg_bt,
				null);
		ret.setText(entity.getText());
		return ret;
	}
}
