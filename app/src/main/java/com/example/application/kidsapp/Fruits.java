package com.example.application.kidsapp;

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

public class Fruits extends AppCompatActivity implements TextToSpeech.OnInitListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        b1=findViewById(R.id.apple);
        b2=findViewById(R.id.banana);
        b3=findViewById(R.id.mango);
        b4=findViewById(R.id.litchi);
        b5=findViewById(R.id.watermelon);
        b6=findViewById(R.id.papaya);
        b7=findViewById(R.id.guava);
        b8=findViewById(R.id.strawberry);
        b9=findViewById(R.id.cherry);
        b10=findViewById(R.id.kiwi);
        b11=findViewById(R.id.blueberry);
        b12=findViewById(R.id.pear);
        b13=findViewById(R.id.orange);
        b14=findViewById(R.id.pineapple);
        b15=findViewById(R.id.grapes);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("apple");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.apple);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("banana");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.banana);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("mango");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.mango);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("litchi");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.litchi);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("watermelon");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.watermelon);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("papaya");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.papaya);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("guava");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.guava);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("strawberry");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.strawberry);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cherry");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cherry);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("kiwi");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.kiwi);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("blueberry");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.blueberry);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("pear");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.pear);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("orange");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.orange);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("pineapple");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.pineapple);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("grapes");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.grapes);
            }
        });
    }

    public void speakWords(String speech)
    {

        myTTS.speak(speech,TextToSpeech.QUEUE_FLUSH,null);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        if (requestCode == MY_DATA_CHECK_CODE)
        {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS)
            {
                //the user has the necessary data - create the TTS
                myTTS = new TextToSpeech(this,this);
            }
            else
                {
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
