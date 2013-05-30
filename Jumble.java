package com.example.typ;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Jumble extends Activity implements OnClickListener {
	EditText txt;
	TextView jum;
	Button cj;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jumble);
		txt=(EditText)findViewById(R.id.editText1);
		jum=(TextView)findViewById(R.id.textView1);
		cj=(Button)findViewById(R.id.button1);
		cj.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_jumble, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Random rdm= new Random();
		String tx=txt.getText().toString();
		char[] ca=tx.toCharArray();
		int l,n,i;
		l=tx.length();
		char temp;
		for(i=0;i<l;i++)
		{
			n=rdm.nextInt(l);
			temp=ca[i];
			ca[i]=ca[n];
			ca[n]=temp;
		}
		jum.setText(ca, 0, l);
		}
		
	}

