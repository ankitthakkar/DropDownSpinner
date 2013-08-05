package com.anky.dropdownspinnerexample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

import com.anky.dropdownspinner.DropdownSpinner;
import com.anky.dropdownspinner.DropdownSpinner.SizeNotMatchException;
import com.indianic.dropdownspinnerexample.R;

public class MainActivity extends Activity {

	// private static final String TAG = MainActivity.class.getSimpleName();
	private String[] strings = { "Inter Milan", "AC Mila", "Manchesterb",
			"Barcelona", "Valencia", "Juventus" };
	private String clickItem;
	private DropdownSpinner spinner1, spinner2, spinner3, spinner4, spinner5;
	private TextView txtClick;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			initComponents();
		} catch (SizeNotMatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initComponents() throws SizeNotMatchException {
		spinner1 = (DropdownSpinner) findViewById(R.id.my_spinner1);
		spinner2 = (DropdownSpinner) findViewById(R.id.my_spinner2);
		spinner3 = (DropdownSpinner) findViewById(R.id.my_spinner3);
		spinner4 = (DropdownSpinner) findViewById(R.id.my_spinner4);
		spinner5 = (DropdownSpinner) findViewById(R.id.my_spinner5);
		txtClick = (TextView) findViewById(R.id.textView1);
		// spinner5=(Spinner)findViewById(R.id.my_spinner5);
		// LinearLayout ll = (LinearLayout) findViewById(R.id.ll_spinner);
		// spinner =new Spinner(this);
		spinner1.setTextSize(20);

		/*
		 * 
		 * custom Spinner add in layout
		 */
		// DropdownSpinner dropdownSpinner = new
		// DropdownSpinner(MainActivity.this);
		// //dropdownSpinner.setGravity(Gravity.RIGHT);
		// dropdownSpinner.addItem("Testing 1");
		// dropdownSpinner.addItem("Testing 2");
		// dropdownSpinner.addItem("Testing 3");
		// dropdownSpinner.setVisibleItemNo(2);
		// dropdownSpinner
		// .setBackgroundResource(R.drawable.standard_menu_button_bg);
		// dropdownSpinner.setWidth(50);
		// dropdownSpinner.setHeight(50);
		// ll.addView(dropdownSpinner);

		final int N = 15;
		int[] ico = new int[N];
		String[] arr = new String[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.format("Item No.%02d", i);
			ico[i] = R.drawable.ic_launcher;
		}

		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = String.format("Item No. %02d", i);
		// ico[i] = R.drawable.ic_launcher;
		// }

		spinner1.setItems(strings);
		// spinner1
		spinner1.addItem("Test1");
		spinner1.addItem("Test2");
		spinner1.addItem("Test3",
				R.drawable.ic_menu_moreoverflow_normal_holo_light);
		spinner1.addItem("", R.drawable.ic_menu_moreoverflow_normal_holo_light);
		spinner1.addItem("Test4", -1);

		spinner1.setVisibleItemNo(5);
		spinner1.setItemTextColor(Color.BLACK);

		// spinner1.setItemPadding(18, 15, 18, 15);
		spinner1.setItemTextSize(20);

		spinner1.setItemBackgroundColor(Color.WHITE);

		// spinner2.setItems(arr, ico);
		// spinner2.setVisibleItemNo(6);
		// spinner2.setItemBackgroundColor(Color.GREEN);
		//
		// spinner3.setItems(strings, ico);
		// spinner3.setVisibleItemNo(4);
		//
		// spinner4.setItems(arr);
		// spinner4.setVisibleItemNo(3);
		//
		// spinner5.setItems(arr, ico);
		// spinner5.setVisibleItemNo(2);
		//

		spinner1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> paramAdapterView,
					View paramView, int paramInt, long paramLong) {
				// TODO Auto-generated method stub
				clickItem = "Center:  Click item:" + paramInt;
				txtClick.setText(clickItem);
			}
		});

		spinner2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> paramAdapterView,
					View paramView, int paramInt, long paramLong) {
				// TODO Auto-generated method stub

				clickItem = "Top Left  : Click item:" + paramInt;
				txtClick.setText(clickItem);
			}
		});

		spinner3.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> paramAdapterView,
					View paramView, int paramInt, long paramLong) {
				// TODO Auto-generated method stub
				clickItem = "Top Right: Click item:" + paramInt;
				txtClick.setText(clickItem);
			}
		});

		spinner4.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> paramAdapterView,
					View paramView, int paramInt, long paramLong) {
				// TODO Auto-generated method stub
				clickItem = "Bottom Left:  Click item:" + paramInt;
				txtClick.setText(clickItem);
			}
		});
		spinner5.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> paramAdapterView,
					View paramView, int paramInt, long paramLong) {
				// TODO Auto-generated method stub
				clickItem = "Bottom Right:  Click item:" + paramInt;
				txtClick.setText(clickItem);
			}
		});
		// ll.addView(spinner);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
