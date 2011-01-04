package roisoleil.cartoid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class Main extends Activity implements OnClickListener {
	private ImageButton prev;
	private ImageButton next;
	private ViewFlipper vf;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.slides);
		prev = (ImageButton) this.findViewById(R.id.arw_left);
		next = (ImageButton) this.findViewById(R.id.arw_right);
		vf = (ViewFlipper) this.findViewById(R.id.flipper);
		prev.setOnClickListener(this);
		next.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		if (v == next) {
			vf.setInAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_left_in));
			vf.setOutAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_left_out));
			vf.showNext();
		}
		if (v == prev) {
			vf.setInAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_right_in));
			vf.setOutAnimation(AnimationUtils.loadAnimation(this,
					R.anim.push_right_out));
			vf.showPrevious();
		}
	}

	// Dialog hwd = (Dialog) this.findViewById(R.id.hw_dialog);
	// ArrayList<HardwareAdapterEntity> data = new
	// ArrayList<HardwareAdapterEntity>();
	// HardwareAdapterEntity entity = new HardwareAdapterEntity();
	// entity.setImage(R.drawable.icon_screen);
	// entity.setConstructor("Samsung");
	// entity.setPrice("5$");
	// HashMap<String, String> attributes = new HashMap<String, String>();
	// attributes.put("Luminosité", "348 lumens");
	// attributes.put("Consommation", "3 watts");
	// entity.setAttributes(attributes);
	//
	// HardwareAdapterEntity entity2 = new HardwareAdapterEntity();
	// entity2.setImage(R.drawable.icon_screen);
	// entity2.setConstructor("Sony");
	// entity2.setPrice("15$");
	// HashMap<String, String> attributes2 = new HashMap<String, String>();
	// attributes2.put("Luminosité", "488 lumens");
	// attributes2.put("Consommation", "5 watts");
	// entity2.setAttributes(attributes2);
	//
	// data.add(entity);
	// data.add(entity2);
	//
	// ArrayList<ButtonAdapterEntity> buttons = new
	// ArrayList<ButtonAdapterEntity>();
	//
	// ButtonAdapterEntity entity3 = new ButtonAdapterEntity();
	// entity3.setCode(1);
	// entity3.setText("Signer");
	//
	// ButtonAdapterEntity entity4 = new ButtonAdapterEntity();
	// entity4.setCode(-1);
	// entity4.setText("Quitter");
	//
	// buttons.add(entity3);
	// buttons.add(entity4);
	//
	// hwd.setDialog(new HardwareAdapter(getBaseContext(), data),
	// new ButtonAdapter(getBaseContext(), buttons));

	public void toHumanRessources(View v) {
	}
}