package com.example.administrator.mydrink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class Activity extends AppCompatActivity
{
    private Spinner mspn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        mspn = (Spinner) findViewById(R.id.spn);
        mspn.setOnItemSelectedListener(spnOnItemSelected);
    }

     private AdapterView.OnItemSelectedListener spnOnItemSelected
            = new AdapterView.OnItemSelectedListener()
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {

        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0)
        {


        }
    };











    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txt1;
        Button btn_o;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        txt1 = (TextView) findViewById(R.id.txt1);
        btn_o = (Button) findViewById(R.id.btn_o);

        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("送出訂購");
                txt1.setTextSize(50);
            }
        });


    }
}
