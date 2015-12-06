package com.example.ianc.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText amountText;
    RadioButton YenToUs;
    RadioButton UsToYen;
    RadioButton UsToTaiwan;
    RadioButton TaiwanToUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        amountText = (EditText) findViewById(R.id.AmountEditText);
        YenToUs = (RadioButton) findViewById(R.id.YenToUSRadioB);
        UsToYen = (RadioButton) findViewById(R.id.UsToYenRadioB);
        UsToTaiwan = (RadioButton) findViewById(R.id.UsToTaiwanRadioB);
        TaiwanToUs = (RadioButton) findViewById(R.id.TaiwanToUsRadioB);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // when user click the convert button
    public void ConvertButton(View v){
        double amount = Double.valueOf(amountText.getText().toString());
        if(YenToUs.isChecked()){
            amount = Convert.JapanToUs(amount);
        }
        if (UsToYen.isChecked()){
            amount = Convert.UsToJapan(amount);
        }
        if(TaiwanToUs.isChecked()){
            amount = Convert.TaiwanToUs(amount);
        }
        else{
            amount = Convert.UsToTaiwan(amount);
        }
        amountText.setText(Double.toString(amount));
    }
}
