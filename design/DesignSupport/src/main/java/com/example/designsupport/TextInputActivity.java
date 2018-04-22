package com.example.designsupport;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by cqian on 2018/4/22.
 */

public class TextInputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        final TextInputEditText inpuText=findViewById(R.id.input_text);
        inpuText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length()<6){
                    inpuText.setError("用户名至少6位");
//                    inpuText.setErrorEn(true);
//                    inpuText.seterr
                }else {

                }
            }
        });
    }
}
