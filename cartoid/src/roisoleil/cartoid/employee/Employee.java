package roisoleil.cartoid.employee;

import java.util.Date;

import android.widget.ImageView;

public class Employee {
	public static final boolean MAN = true;
	public static final boolean WOMAN = false;

	public static final int BOSS = 0;
	public static final int R_AND_D = 1;
	public static final int B_AND_S = 2;

	public String lastname;
	public String firstname;
	public ImageView face;
	public Date birth;
	public int divison;
	public int sex;
	public int enthusiasm;
	public int pay;

	public Employee() {
	}
}
