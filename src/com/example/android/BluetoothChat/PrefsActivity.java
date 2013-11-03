package com.example.android.BluetoothChat;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PrefsActivity extends Activity {
	private static final boolean D = true;
	private static final String TAG = "BC_UIA";
	
	public static final String AGE = "age";
	public static final String GENDER = "gender";
	
	private LinearLayout mGenderLayout;
	private CheckBox mGenderCheck1;
	private CheckBox mGenderCheck2;
	
	private LinearLayout mAgeLayout;
	private CheckBox mAgeCheck1;
	private CheckBox mAgeCheck2;
	private CheckBox mAgeCheck3;
	private CheckBox mAgeCheck4;
	private CheckBox mAgeCheck5;
	private CheckBox mAgeCheck6;
	private CheckBox mAgeCheck7;
	private CheckBox mAgeCheck8;
	
	private TextView mPrefText;
	private TextView mGenderText;
	private TextView mAgeText;
	
	private Button mButton;
	
	private ArrayList<Integer> mGender;
	private ArrayList<Integer> mAge;
	
	public void onCreate(Bundle savedInstanceState) {
		if(D) Log.i("BC_UIA_onCreate", "onCreate");
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.prefs);
		
		mGenderLayout = (LinearLayout) findViewById(R.id.PrefsGenderLayout1);
		mGenderCheck1 = (CheckBox) findViewById(R.id.PrefsGenderCheckBox1);
		mGenderCheck2 = (CheckBox) findViewById(R.id.PrefsGenderCheckBox2);
		mAgeLayout = (LinearLayout) findViewById(R.id.PrefsAgeLayout1);
		mAgeCheck1 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox1);
		mAgeCheck2 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox2);
		mAgeCheck3 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox3);
		mAgeCheck4 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox4);
		mAgeCheck5 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox5);
		mAgeCheck6 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox6);
		mAgeCheck7 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox7);
		mAgeCheck8 = (CheckBox) findViewById(R.id.PrefsAgeCheckBox8);
		
		mButton = (Button) findViewById(R.id.PrefsButton1);
		
		mGender = new ArrayList<Integer>(0);
		mAge = new ArrayList<Integer>(0);
		

		mGenderCheck1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsGenderCheckBox1 - R.id.PrefsGenderLayout1 -1; 
				if(isChecked) mGender.add(Integer.valueOf(val));
				else mGender.remove(Integer.valueOf(val));
				return;
			}
		}); 
		
		mGenderCheck2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsGenderCheckBox2 - R.id.PrefsGenderLayout1 - 1; 
				if(isChecked) mGender.add(Integer.valueOf(val));
				else mGender.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox1 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox2 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox3 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox4 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox5 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck6.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox6 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck7.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox7 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 

		mAgeCheck8.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				int val = R.id.PrefsAgeCheckBox8 - R.id.PrefsAgeLayout1 -1; 
				if(isChecked) mAge.add(Integer.valueOf(val));
				else mAge.remove(Integer.valueOf(val));
			}
		}); 
		
		mButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			    Intent intent = new Intent();
			    intent.putExtra(AGE, mAge);
			    intent.putExtra(GENDER, mGender);
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		});
	}
	
	
}