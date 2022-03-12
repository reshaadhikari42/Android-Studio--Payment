package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class CreditCardActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credit_card);

        button= (Button) findViewById(R.id.button_confirm);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openPopUpWindow();
            }
        });
    }
    private void openPopUpWindow(){
        Intent popupwindow= new Intent(CreditCardActivity.this,PopupActivity.class);
        startActivity(popupwindow);
    }
}