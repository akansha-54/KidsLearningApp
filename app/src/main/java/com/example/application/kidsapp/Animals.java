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
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

public class Animals extends Activity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        b1=findViewById(R.id.bear);
        b2=findViewById(R.id.cow);
        b3=findViewById(R.id.dog);
        b4=findViewById(R.id.cat);
        b5=findViewById(R.id.deer);
        b6=findViewById(R.id.rabbit);
        b7=findViewById(R.id.ox);
        b8=findViewById(R.id.fox);
        b9=findViewById(R.id.elephant);
        b10=findViewById(R.id.tiger);
        b11=findViewById(R.id.donkey);
        b12=findViewById(R.id.horse);
        b13=findViewById(R.id.monkey);
        b14=findViewById(R.id.camel);
        b15=findViewById(R.id.lion);
        b16=findViewById(R.id.sheep);
        b17=findViewById(R.id.zebra);
        b18=findViewById(R.id.yak);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        imageView.setImageResource(R.drawable.animal);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("bear");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.bear);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cow");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cow);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("dog");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.dog);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("cat");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.cat);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("deer");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.deer);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("rabbit");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.rabbit);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ox");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.ox);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("fox");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.fox);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("elephant");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.elephant);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("tiger");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.tiger);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("donkey");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.donkey);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("horse");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.horse);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("monkey");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.monkey);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("camel");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.camel);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("lion");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.lion);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("sheep");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.sheep);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("zebra");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.zebra);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("yak");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.yak);
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
