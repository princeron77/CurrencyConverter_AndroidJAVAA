package com.ron.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onConvert(View View){
        EditText editText=(EditText) findViewById(R.id.amountText);

        Double dollarAmount = Double.parseDouble(editText.getText().toString());
        Double convertToDollar = dollarAmount / 70;

        Toast.makeText(MainActivity.this,"$"+ String.format("%.2f",convertToDollar),Toast.LENGTH_LONG).show();

        Log.i("value",editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}