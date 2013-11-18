package com.example.android.RadiusFriends;

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
	private Button mButtonSelect;
	
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
		mButtonSelect = (Button) findViewById(R.id.PrefsSelectButton);
		
        //set initial values
		
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
		
		mButtonSelect.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(!mGenderCheck1.isChecked() || !mGenderCheck2.isChecked() || !mAgeCheck1.isChecked() || !mAgeCheck2.isChecked() || !mAgeCheck3.isChecked() || !mAgeCheck4.isChecked() || !mAgeCheck5.isChecked() || !mAgeCheck6.isChecked() || !mAgeCheck7.isChecked() || !mAgeCheck8.isChecked()) {
					mGenderCheck1.setChecked(true);
					mGenderCheck2.setChecked(true);
					mAgeCheck1.setChecked(true);
					mAgeCheck2.setChecked(true);
					mAgeCheck3.setChecked(true);
					mAgeCheck4.setChecked(true);
					mAgeCheck5.setChecked(true);
					mAgeCheck6.setChecked(true);
					mAgeCheck7.setChecked(true);
					mAgeCheck8.setChecked(true);
				}
				else {
					mGenderCheck1.setChecked(false);
					mGenderCheck2.setChecked(false);
					mAgeCheck1.setChecked(false);
					mAgeCheck2.setChecked(false);
					mAgeCheck3.setChecked(false);
					mAgeCheck4.setChecked(false);
					mAgeCheck5.setChecked(false);
					mAgeCheck6.setChecked(false);
					mAgeCheck7.setChecked(false);
					mAgeCheck8.setChecked(false);
					
					mGender.clear();
					mAge.clear();
					
				}
			}
		});
	}
	
	
}