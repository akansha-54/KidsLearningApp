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

public class Vegetables extends Activity implements  TextToSpeech.OnInitListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        b1=findViewById(R.id.tomato);
        b2=findViewById(R.id.bottlegourd);
        b3=findViewById(R.id.potato);
        b4=findViewById(R.id.carrot);
        b5=findViewById(R.id.bittergourd);
        b6=findViewById(R.id.cabbage);
        b7=findViewById(R.id.brinjal);
        b8=findViewById(R.id.capsicum);
        b9=findViewById(R.id.chilli);
        b10=findViewById(R.id.lemon);
        b11=findViewById(R.id.cauliflower);
        b12=findViewById(R.id.ginger);
        b13=findViewById(R.id.onion);
        b14=findViewById(R.id.ladyfinger);
        b15=findViewById(R.id.spinach);
        b16=findViewById(R.id.pumpkin);
        b17=findViewById(R.id.cucumber);
        b18=findViewById(R.id.raddish);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        imageView.setImageResource(R.drawable.veggie);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("tomato");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.tomato);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("bottlegourd");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.bottlegourd);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("potato");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.potato);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("carrot");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.carrot);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("bittergourd");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.bittergourd);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cabbage");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cabbage);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("brinjal");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.brinjal);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("capsicum");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.capsicum);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("chilli");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.chilli);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("lemon");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.lemon);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cauliflower");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cauliflower);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ginger");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ginger);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("onion");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.onion);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ladyfinger");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ladyfinger);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("spinach");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.spinach);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("pumpkin");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.pumpkin);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cucumber");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cucumber);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("raddish");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.raddish);
            }
        });
    }

    public void speakWords(String speech)
    {
        myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH,null);
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
            if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }
}
