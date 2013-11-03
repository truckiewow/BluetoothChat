package com.example.android.BluetoothChat;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class UserInfoActivity extends Activity {
	private static final boolean D = true;
	private static final String TAG = "BC_UIA";
	
	public static final String ID = "id";
	
	private RadioGroup mGenderRadioGroup;
	private RadioButton mGenderRadio1;
	private RadioButton mGenderRadio2;
	
	private RadioGroup mAgeRadioGroup;
	private RadioButton mAgeRadio1;
	private RadioButton mAgeRadio2;
	private RadioButton mAgeRadio3;
	private RadioButton mAgeRadio4;
	private RadioButton mAgeRadio5;
	private RadioButton mAgeRadio6;
	private RadioButton mAgeRadio7;
	private RadioButton mAgeRadio8;
	
	private TextView mPrefText;
	private TextView mGenderText;
	private TextView mAgeText;
	
	private Button mButton;
	
	private String mGender = "1";
	private String mAge = "1";
	
	public void onCreate(Bundle savedInstanceState) {
		if(D) Log.i("BC_UIA_onCreate", "onCreate");
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.user_info);
		
		mGenderRadioGroup = (RadioGroup) findViewById(R.id.userInfoGenderRadioGroup1);
		mGenderRadio1 = (RadioButton) findViewById(R.id.userInfoGenderRadioButton1);
		mGenderRadio2 = (RadioButton) findViewById(R.id.userInfoGenderRadioButton2);
		mAgeRadioGroup = (RadioGroup) findViewById(R.id.userInfoAgeRadioGroup1);
		mAgeRadio1 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton1);
		mAgeRadio2 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton2);
		mAgeRadio3 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton3);
		mAgeRadio4 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton4);
		mAgeRadio5 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton5);
		mAgeRadio6 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton6);
		mAgeRadio7 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton7);
		mAgeRadio8 = (RadioButton) findViewById(R.id.userInfoAgeRadioButton8);
		
		mGenderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
		{
			public void onCheckedChanged(RadioGroup rG, int checked) {
				RadioButton checkedRadioButton = (RadioButton) mGenderRadioGroup.findViewById(checked);
				if(checkedRadioButton.isChecked()) {
					int val = checked-rG.getId()-1;
					if(D) Log.i(TAG, "Val = " + val);
					mGender = "" + val;
					if(D) Log.i(TAG, "Gender = " + mGender);
				}
			}
		});
		
		mAgeRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
		{
			public void onCheckedChanged(RadioGroup rG, int checked) {
				RadioButton checkedRadioButton = (RadioButton) rG.findViewById(checked);
				if(checkedRadioButton.isChecked()) {
					int val = checked-rG.getId()-1;
					if(D) Log.i(TAG, "Val = " + val);
					mAge = "" + val;
					if(D) Log.i(TAG, "Age = " + mAge);				
				}
			}
		});
		
		mButton = (Button) findViewById(R.id.userInfoButton1);
		mButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				String ID_string = getString(R.string.ID_String);
			    ID_string += mGender;
			    ID_string += mAge;
			    Intent intent = new Intent();
			    intent.putExtra(ID, ID_string);
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		});
		
	}
	
	
}