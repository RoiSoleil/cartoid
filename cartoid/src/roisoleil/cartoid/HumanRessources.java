package roisoleil.cartoid;

import android.app.Activity;
import android.os.Bundle;

public class HumanRessources extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hr);
		this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
	}
}