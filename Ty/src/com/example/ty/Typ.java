package com.example.ty;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Typ extends Activity implements OnClickListener {

	EditText edt;
	TextView tve;
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_typ);
		edt=(EditText)findViewById(R.id.editText1);
		tve=(TextView)findViewById(R.id.textView1);
		btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_typ, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Random regen=new Random(); 
		String str=edt.getText().toString();
		char[] st=str.toCharArray();
		int l,n,i;
		char temp;
		l=str.length();
		for(i=0;i<l;i++)
		{
			n=regen.nextInt(l);
			temp=st[n];
			st[n]=st[i];
			st[i]=temp;
		}
		tve.setText(st, 0, l);
	}

}
