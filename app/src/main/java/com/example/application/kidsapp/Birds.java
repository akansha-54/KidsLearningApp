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

public class Birds extends AppCompatActivity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        b1=findViewById(R.id.crane);
        b2=findViewById(R.id.crow);
        b3=findViewById(R.id.cuckoo);
        b4=findViewById(R.id.dove);
        b5=findViewById(R.id.flamingo);
        b6=findViewById(R.id.duck);
        b7=findViewById(R.id.hen);
        b8=findViewById(R.id.ostrich);
        b9=findViewById(R.id.owl);
        b10=findViewById(R.id.parrot);
        b11=findViewById(R.id.peacock);
        b12=findViewById(R.id.penguin);
        b13=findViewById(R.id.pigeon);
        b14=findViewById(R.id.sparrow);
        b15=findViewById(R.id.swam);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("crane");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.crane);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("crow");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.crow);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cuckoo");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cuckoo);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("dove");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.dove);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("flamingo");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.flamingo);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("duck");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.duck);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("hen");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.hen);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ostrich");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ostrich);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("owl");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.owl);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("parrot");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.parrot);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("peacock");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.peacock);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("penguin");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.penguin);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("pigeon");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.pigeon);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("sparrow");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.sparrow);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("swam");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.swam);
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
    public void onInit(int initStatus)
    {
        if (initStatus == TextToSpeech.SUCCESS) {
            if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }
}
