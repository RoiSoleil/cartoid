package roisoleil.cartoid;

import java.util.ArrayList;
import java.util.HashMap;

import roisoleil.cartoid.view.Dialog;
import roisoleil.cartoid.view.adapter.ButtonAdapter;
import roisoleil.cartoid.view.adapter.ButtonAdapterEntity;
import roisoleil.cartoid.view.adapter.HardwareAdapter;
import roisoleil.cartoid.view.adapter.HardwareAdapterEntity;
import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Dialog hwd = (Dialog) this.findViewById(R.id.hw_dialog);
		ArrayList<HardwareAdapterEntity> data = new ArrayList<HardwareAdapterEntity>();
		HardwareAdapterEntity entity = new HardwareAdapterEntity();
		entity.setImage(R.drawable.icon_screen);
		entity.setConstructor("Samsung");
		entity.setPrice("5$");
		HashMap<String, String> attributes = new HashMap<String, String>();
		attributes.put("Luminosité", "348 lumens");
		attributes.put("Consommation", "3 watts");
		entity.setAttributes(attributes);

		HardwareAdapterEntity entity2 = new HardwareAdapterEntity();
		entity2.setImage(R.drawable.icon_screen);
		entity2.setConstructor("Sony");
		entity2.setPrice("15$");
		HashMap<String, String> attributes2 = new HashMap<String, String>();
		attributes2.put("Luminosité", "488 lumens");
		attributes2.put("Consommation", "5 watts");
		entity2.setAttributes(attributes2);

		data.add(entity);
		data.add(entity2);

		ArrayList<ButtonAdapterEntity> buttons = new ArrayList<ButtonAdapterEntity>();

		ButtonAdapterEntity entity3 = new ButtonAdapterEntity();
		entity3.setCode(1);
		entity3.setText("Signer");

		ButtonAdapterEntity entity4 = new ButtonAdapterEntity();
		entity4.setCode(-1);
		entity4.setText("Quitter");

		buttons.add(entity3);
		buttons.add(entity4);

		hwd.setDialog(new HardwareAdapter(getBaseContext(), data),
				new ButtonAdapter(getBaseContext(), buttons));
	}
}