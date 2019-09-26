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

public class Alphabets extends Activity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

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
        b14=findViewById(R.id.n);
        b15=findViewById(R.id.o);
        b16=findViewById(R.id.p);
        b17=findViewById(R.id.q);
        b18=findViewById(R.id.r);
        b19=findViewById(R.id.s);
        b20=findViewById(R.id.t);
        b21=findViewById(R.id.u);
        b22=findViewById(R.id.v);
        b23=findViewById(R.id.w);
        b24=findViewById(R.id.x);
        b25=findViewById(R.id.y);
        b26=findViewById(R.id.z);
        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);


        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        imageView.setImageResource(R.drawable.alp);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("A for Apple");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.a1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("B for Ball");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.b);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("C for Cat");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.c);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("D for Doll");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.d);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("E for Eagle");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.e);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("F for Fox");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.f);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("G for Goat");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.g);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("H for Horse");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.h);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("I for Ice-Cream");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("J for Jug");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.j);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("K for Kangaroo");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.k);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("L for Lion");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.l);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("M for Mango");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.m);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("N for Nest");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.n);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("O for Owl");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.o);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("P for Parrot");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.p);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Q for Quail");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.q);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("R for Rabbit ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.r);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("S for Snake");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.s);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("T for Tiger");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.t);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("U for Umbrella");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.u);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("V for Van");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.v);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("W for Watch");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.w);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("X for X-MAS");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.x);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Y for Yak");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.y);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("Z for Zebra");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.z);
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
