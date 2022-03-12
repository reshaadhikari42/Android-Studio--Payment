package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class ChequeActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cheque);

        button= (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openPopUpWindow();
            }
        });
    }
    private void openPopUpWindow(){
        Intent popupwindow= new Intent(ChequeActivity.this,PopupActivity.class);
        startActivity(popupwindow);
    }
}