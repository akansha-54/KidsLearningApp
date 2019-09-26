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

public class Counting extends Activity implements  TextToSpeech.OnInitListener
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);

        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        b10=findViewById(R.id.ten);
        b11=findViewById(R.id.eleven);
        b12=findViewById(R.id.twelve);
        b13=findViewById(R.id.thirteen);
        b14=findViewById(R.id.fourteen);
        b15=findViewById(R.id.fifteen);
        b16=findViewById(R.id.sixteen);
        b17=findViewById(R.id.seventeen);
        b18=findViewById(R.id.eighteen);
        b19=findViewById(R.id.nineteen);
        b20=findViewById(R.id.twenty);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);
        imageView.setImageResource(R.drawable.download);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("One");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.one);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Two");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.two);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Three");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.three);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Four");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.four);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Five");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.five);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Six");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.six);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Seven");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.seven);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Eight");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.eight);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Nine");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.nine);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Ten");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ten);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Eleven");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.eleven);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Twelve");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.twelve);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Thirteen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.thirteen);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Fourteen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.fourteen);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Fifteen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.fifteen);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Sixteen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.sixteen);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Seventeen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.seventeen);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Eighteen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.eighteen);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Nineteen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.nineteen);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Twenty");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.twenty);
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
            if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }
}
