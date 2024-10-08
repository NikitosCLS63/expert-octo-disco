package com.example.lection222;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class PlayGemes extends AppCompatActivity {
    Button  button3, button4, button5, button6, button7, button8, button9,button10,button11, btnnazad, btnviyti;

    TextView textViewplay, PlayerPoint, PCpoint;

    int PlayerofPoints, PCpfpoints;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    String krest, nol;
    @Override
    protected  void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.playgemes);



         button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);
         button5 = findViewById(R.id.button5);
         button6 = findViewById(R.id.button6);
         button7 = findViewById(R.id.button7);
         button8 = findViewById(R.id.button8);
         button9 = findViewById(R.id.button9);
         button10 = findViewById(R.id.button10);
         button11 = findViewById(R.id.button11);
         textViewplay = findViewById(R.id.textViewplay);
         PlayerPoint = findViewById(R.id.PlayerPoint);
         PCpoint = findViewById(R.id.PCpoint);
         btnnazad = findViewById(R.id.btnnazad);
         btnviyti = findViewById(R.id.btnviyti);

         krest = "X";
         nol = "0";
         textViewplay.setText("");


         sharedPreferences = this.getSharedPreferences("krestiknolik", Context.MODE_PRIVATE);
         editor = sharedPreferences.edit();

        PlayerofPoints = sharedPreferences.getInt("PlayerofPoints", 0);
        PlayerPoint.setText("" + PlayerofPoints);


        PCpfpoints = sharedPreferences.getInt("PCpfpoints", 0);
        PCpoint.setText("" + PCpfpoints);

        btnnazad.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        btnviyti.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            editor.putInt("PlayerofPoints",0);
            editor.putInt("PCpfpoints", 0);
            editor.apply();
        });
    }
    public void clcBtn1(View view) {
        if (button3.getText() == "" && textViewplay.getText() == "") {
            button3.setText(krest);
            isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn2(View view){
        if(button4.getText() == ""  && textViewplay.getText() == ""){
        button4.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn3(View view){
        if(button5.getText() == "" && textViewplay.getText() == ""){
        button5.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn4(View view){
        if(button6.getText() == "" && textViewplay.getText() == ""){
        button6.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn5(View view){
        if(button7.getText() == "" && textViewplay.getText() == ""){
        button7.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn6(View view){
        if(button8.getText() == "" && textViewplay.getText() == ""){
        button8.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn7(View view){
        if(button9.getText() == "" && textViewplay.getText() == ""){
        button9.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn8(View view){
        if(button10.getText() == "" && textViewplay.getText() == ""){
        button10.setText(krest);
        isPlayerWinner();
            if (textViewplay.getText() == ""){
                hodPC();
            }
        }
    }
    public void clcBtn9(View view){
        if(button11.getText() == "" && textViewplay.getText() == "") {
            button11.setText(krest);
            isPlayerWinner();
            if (textViewplay.getText() == "") {
                hodPC();
            }
        }
    }
    public void isPlayerWinner() {
        if (button3.getText() == krest && button4.getText() == krest && button5.getText() == krest){
            button3.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button6.getText() == krest && button7.getText() == krest && button8.getText() == krest){
            button6.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button9.getText() == krest && button10.getText() == krest && button11.getText() == krest){
            button9.setBackgroundColor(Color.GREEN);
            button10.setBackgroundColor(Color.GREEN);
            button11.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button3.getText() == krest && button6.getText() == krest && button9.getText() == krest){
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button4.getText() == krest && button7.getText() == krest && button10.getText() == krest){
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button10.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button5.getText() == krest && button8.getText() == krest && button11.getText() == krest){
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button11.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText( "" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button3.getText() == krest && button7.getText() == krest && button11.getText() == krest){
            button3.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button11.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" +  PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else
        if (button5.getText() == krest && button7.getText() == krest && button9.getText() == krest){
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messeg);
            PlayerofPoints++;
            PlayerPoint.setText("" + PlayerofPoints);
            editor.putInt("PlayerofPoints", PlayerofPoints);
            editor.apply();
        }else if (button3.getText() != "" && button4.getText() != "" && button5.getText() != "" &&
                button6.getText() != "" && button7.getText() != "" && button8.getText() != "" &&
                button9.getText() != "" && button10.getText() != "" && button11.getText() != "") {
            textViewplay.setText(R.string.draw_messeg);
        }
    }

    public void isPCWinner() {
        if (button3.getText() == nol && button4.getText() == nol && button5.getText() == nol){
            button3.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button6.getText() == nol && button7.getText() == nol && button8.getText() == nol){
            button6.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button9.getText() == nol && button10.getText() == nol && button11.getText() == nol){
            button9.setBackgroundColor(Color.GREEN);
            button10.setBackgroundColor(Color.GREEN);
            button11.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button3.getText() == nol && button6.getText() == nol && button9.getText() == nol){
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button4.getText() == nol && button7.getText() == nol && button10.getText() == nol){
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button10.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button5.getText() == nol && button8.getText() == nol && button11.getText() == nol){
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button11.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button3.getText() == nol && button7.getText() == nol && button11.getText() == nol){
            button3.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button11.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }else
        if (button5.getText() == nol && button7.getText() == nol && button9.getText() == nol){
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textViewplay.setText(R.string.winner_messegPC);
            PCpfpoints++;
            PCpoint.setText("" + PCpfpoints);
            editor.putInt("PCpfpoints", PCpfpoints);
            editor.apply();
        }
    }

    private void hodPC() {
        Random random =  new Random();
        random.nextInt(8);
        int buttonPCclick = 1 + random.nextInt(9);
        Log.i("hodPC","buttonPCclick - " + buttonPCclick);

        switch(buttonPCclick){
            case(1): if(button3.getText() == ""){
                button3.setText(nol); isPCWinner();
            }else{hodPC();}
                break;

            case(2): if(button4.getText() == ""){
                button4.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(3): if(button5.getText() == ""){
                button5.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(4): if(button6.getText() == ""){
                button6.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(5): if(button7.getText() == ""){
                button7.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(6): if(button8.getText() == ""){
                button8.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(7): if(button9.getText() == ""){
                button9.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(8): if(button10.getText() == ""){
                button10.setText(nol);isPCWinner();
            }else{hodPC();}
                break;

            case(9): if(button11.getText() == ""){
                button11.setText(nol);isPCWinner();
            }else{hodPC();}
                break;
        }
    }

    public void clcRestart(View view){
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        textViewplay.setText("");

        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.pink));
        button4.setBackgroundColor(button4.getContext().getResources().getColor(R.color.pink));
        button5.setBackgroundColor(button5.getContext().getResources().getColor(R.color.pink));
        button6.setBackgroundColor(button6.getContext().getResources().getColor(R.color.pink));
        button7.setBackgroundColor(button7.getContext().getResources().getColor(R.color.pink));
        button8.setBackgroundColor(button8.getContext().getResources().getColor(R.color.pink));
        button9.setBackgroundColor(button9.getContext().getResources().getColor(R.color.pink));
        button10.setBackgroundColor(button10.getContext().getResources().getColor(R.color.pink));
        button11.setBackgroundColor(button11.getContext().getResources().getColor(R.color.pink));
    }
}
