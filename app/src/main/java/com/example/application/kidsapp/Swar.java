package com.example.application.kidsapp;

import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class Swar extends Activity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swar);

        b1=findViewById(R.id.a);
        b2=findViewById(R.id.b);
        b3=findViewById(R.id.c);
        b4=findViewById(R.id.d);
        b5=findViewById(R.id.e);
        b6=findViewById(R.id.f);
        b7=findViewById(R.id.g);
        b8=findViewById(R.id.h);
        b9=findViewById(R.id.i);
        b10=findViewById(R.id.j);
        b11=findViewById(R.id.k);
        b12=findViewById(R.id.l);
        b13=findViewById(R.id.m);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        imageView.setImageResource(R.drawable.sw);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("अ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.anar);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("आ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.aam);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("इ ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.imli);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ई ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ikh);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("उ ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ullu);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ऊ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.un);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ए");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.aenak);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ऐ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ekara);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ओ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.okhali);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("औ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.aurat);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("अं ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.angur);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("अ:");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.anhkhali);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ऋ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.rishi);
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
    public void onInit(int initStatus) {
        if (initStatus == TextToSpeech.SUCCESS) {
            if(myTTS.isLanguageAvailable(new Locale("hin"))==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(new Locale("hin"));
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }
}
