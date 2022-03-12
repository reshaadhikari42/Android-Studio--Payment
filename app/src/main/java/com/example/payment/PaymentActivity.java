package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class PaymentActivity extends AppCompatActivity {
    public Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);

        button1= (Button) findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(PaymentActivity.this, CreditCardActivity.class);
                startActivity(intent);
            }
        });
        button2= (Button) findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(PaymentActivity.this, ChequeActivity.class);
                startActivity(intent);
            }
        });
    }
}