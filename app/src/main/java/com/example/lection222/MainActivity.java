package com.example.lection222;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    SharedPreferences themeSettings;
    SharedPreferences.Editor settingsEditor;
    Button buttonPlay;
    ImageButton imageTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        themeSettings=getSharedPreferences("SETTINGS", MODE_PRIVATE);
        if (!themeSettings.contains("MODE_NIGHT_ON")){
            settingsEditor = themeSettings.edit();
            settingsEditor.putBoolean("MODE_NIGHT_ON", false);
            settingsEditor.apply();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            Toast.makeText(this, "Запуск", Toast.LENGTH_SHORT).show();
        }
        else {
            setCurrentTheme();
        }
        setContentView(R.layout.activity_main);
        imageTheme = findViewById(R.id.imageButton);
        updateImageButton();

        buttonPlay = findViewById(R.id.buttonPlay);

        imageTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (themeSettings.getBoolean("MODE_NIGHT_ON",false)){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    settingsEditor = themeSettings.edit();
                    settingsEditor.putBoolean("MODE_NIGHT_ON", false);
                    settingsEditor.apply();

                    Toast.makeText(MainActivity.this, "Темная тема отключена", Toast.LENGTH_SHORT).show();
                }else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    settingsEditor = themeSettings.edit();
                    settingsEditor.putBoolean("MODE_NIGHT_ON", true);
                    settingsEditor.apply();
                    Toast.makeText(MainActivity.this, "Темная тема включена", Toast.LENGTH_SHORT).show();
                }
                updateImageButton();
            }
        });

        buttonPlay.setOnClickListener(v -> {
            Intent intent = new Intent(this, PlayGemes.class);
            startActivity(intent);

        });

    }
    private void updateImageButton() {
        if(themeSettings.getBoolean("MODE_NIGHT_ON", false)){
            imageTheme.setImageResource(R.drawable.sunblack);
        }else{
            imageTheme.setImageResource(R.drawable.a);
        }

    }
    private void setCurrentTheme() {
        if(themeSettings.getBoolean("MODE_NIGHT_ON", false)){
            AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_YES));
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
