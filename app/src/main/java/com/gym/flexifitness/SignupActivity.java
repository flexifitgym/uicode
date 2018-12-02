package com.gym.flexifitness;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class SignupActivity extends Activity{

    EditText emailInput, passwordInput, confirmPasswordInput;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        emailInput = (EditText) findViewById(R.id.email_input_edit);
        passwordInput = (EditText) findViewById(R.id.password_input_edit);
        confirmPasswordInput = (EditText) findViewById(R.id.confirm_password_edit);
    }
}
