package com.example.petsocial;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView backBtn;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        initialize();

        backBtn.setOnClickListener(v->{
            finish();
        });

    }

    public void initialize(){

        backBtn=findViewById(R.id.backBtnProfile);
    }

}
