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

public class Flowers extends AppCompatActivity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        b1=findViewById(R.id.bluebell);
        b2=findViewById(R.id.buttercup);
        b3=findViewById(R.id.daisy);
        b4=findViewById(R.id.dahlia);
        b5=findViewById(R.id.daffodil);
        b6=findViewById(R.id.lily);
        b7=findViewById(R.id.dandelion);
        b8=findViewById(R.id.hibicus);
        b9=findViewById(R.id.jasmine);
        b10=findViewById(R.id.lotus);
        b11=findViewById(R.id.marigold);
        b12=findViewById(R.id.mogra);
        b13=findViewById(R.id.orchids);
        b14=findViewById(R.id.periwinkle);
        b15=findViewById(R.id.rose);
        b16=findViewById(R.id.sunflower);
        b17=findViewById(R.id.tulip);
        b18=findViewById(R.id.waterlily);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("bluebell");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.bluebell);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("buttercup");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.buttercup);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("daisy");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.daisy);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("dahlia");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.dahlia);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("daffodil");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.daffodil);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("lily");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.lily);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("dandelion");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.dandelion);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("hibicus");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.hibicus);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("jasmine");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.jasmine);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("lotus");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.lotus);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("marigold");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.marigold);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("mogra");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.mogra);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("orchids");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.orchids);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("periwinkle");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.periwinkle);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("rose");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.rose);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("sunflower");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.sunflower);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("tulip");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.tulip);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("waterlily");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.waterlily);
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
