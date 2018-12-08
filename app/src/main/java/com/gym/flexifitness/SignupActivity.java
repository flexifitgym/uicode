package com.gym.flexifitness;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class SignupActivity extends Activity{

    EditText emailInput, passwordInput, confirmPasswordInput;
    CheckBox isCustomer,isGym;
    Button btnSignUp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        emailInput = (EditText) findViewById(R.id.email);
        passwordInput = (EditText) findViewById(R.id.password);
        confirmPasswordInput = (EditText) findViewById(R.id.confirmPassword);

        isCustomer = (CheckBox) findViewById(R.id.isCustomer);
        isGym = (CheckBox) findViewById(R.id.isGym);

        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCustomer.isChecked()){

                }else if(isGym.isChecked()){

                }
            }
        });


    }
}
