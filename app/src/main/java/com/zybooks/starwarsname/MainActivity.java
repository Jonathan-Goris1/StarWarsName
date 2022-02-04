package com.zybooks.starwarsname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.zybooks.starwarsname.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.generateButton.setOnClickListener(view1 -> {
            String firstNameEditText = binding.firstnameEdittext.getText().toString();
            String lastNameEditText = binding.lastnameEdittext.getText().toString();
            String cityBornEditText = binding.citybornEdittext.getText().toString();
            String maidenNameEditText = binding.maidennameEdittext.getText().toString();

            String swFirstName = firstNameEditText.substring(0,2);
            String swLastName = lastNameEditText.substring(0,3);
            String swCityBorn = cityBornEditText.substring(0,3);
            String swMaidenName = maidenNameEditText.substring(0,2);

            binding.starwarnameTextview.setText(swLastName + swFirstName + " " + swMaidenName + swCityBorn);
        });
    }
}