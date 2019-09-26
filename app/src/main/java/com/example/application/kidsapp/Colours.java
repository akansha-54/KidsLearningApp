package com.example.application.kidsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

public class Colours extends Activity implements TextToSpeech.OnInitListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    LinearLayout linear;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        b1=findViewById(R.id.red);
        b2=findViewById(R.id.yellow);
        b3=findViewById(R.id.green);
        b4=findViewById(R.id.orange);
        b5=findViewById(R.id.black);
        b6=findViewById(R.id.blue);
        b7=findViewById(R.id.white);
        b8=findViewById(R.id.brown);
        b9=findViewById(R.id.pink);
        b10=findViewById(R.id.purple);
        b11=findViewById(R.id.grey);
        linear=findViewById(R.id.linearlayout);
        edit=findViewById(R.id.edit1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("red");
                linear.setBackgroundColor(Color.RED);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("yellow");
                linear.setBackgroundColor(Color.YELLOW);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("green");
                linear.setBackgroundColor(Color.GREEN);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("orange");
                linear.setBackgroundColor(Color.rgb(255,55,00));
                String words=edit.getText().toString();
                speakWords(words);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("black");
                linear.setBackgroundColor(Color.BLACK);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("blue");
                linear.setBackgroundColor(Color.BLUE);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("white");
                linear.setBackgroundColor(Color.WHITE);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("brown");
                linear.setBackgroundColor(Color.rgb(245,90,7));
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("pink");
                linear.setBackgroundColor(Color.rgb(249,93,190));
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("purple");
                linear.setBackgroundColor(Color.rgb(80,00,80));
                String words=edit.getText().toString();
                speakWords(words);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("gray");
                linear.setBackgroundColor(Color.GRAY);
                String words=edit.getText().toString();
                speakWords(words);
            }
        });
    }

    public void speakWords(String speech)
    {
        myTTS.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                //the user has the necessary data - create the TTS
                myTTS = new TextToSpeech(this, this);
            }
            else {
                //no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }

    @Override
    public void onInit(int i) {
        if (i == TextToSpeech.SUCCESS) {
            if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        }
        else if (i == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }
}
