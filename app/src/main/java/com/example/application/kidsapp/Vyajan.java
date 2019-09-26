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

public class Vyajan extends Activity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37;
    ImageView imageView;
    EditText edit;
    private TextToSpeech myTTS;
    private  int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vyajan);

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
        b27=findViewById(R.id.a1);
        b28=findViewById(R.id.b1);
        b29=findViewById(R.id.c1);
        b30=findViewById(R.id.d1);
        b31=findViewById(R.id.e1);
        b32=findViewById(R.id.f1);
        b33=findViewById(R.id.g1);
        b34=findViewById(R.id.h1);
        b35=findViewById(R.id.i1);
        b36=findViewById(R.id.j1);
        b37=findViewById(R.id.k1);

        edit=findViewById(R.id.edit1);
        imageView=findViewById(R.id.image1);

        Intent checkTTSIntent= new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,MY_DATA_CHECK_CODE);

        imageView.setImageResource(R.drawable.vy);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("क");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.a2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ख ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.b2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ग ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.c2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" घ  ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.d2);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ङ ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.e2);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("च");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.f2);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("छ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.g2);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ज");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.h2);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" झ ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.i2);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ञ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.j2);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ट");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.k2);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ठ ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.l2);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ड ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.m2);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ढ ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.n2);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ण");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.o2);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("त");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.p2);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("थ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.q2);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" द  ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.r2);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ध ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.s2);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("न");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.t2);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("प");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.u2);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("फ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.v2);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ब ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.w2);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" भ  ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.x2);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("म");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.y2);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("य");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.z2);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" र ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.a3);
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ल ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.b3);
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("व्");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.c3);
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("श");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.d3);
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ष");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.e3);
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" स ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.f3);
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ह");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.g3);
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("क्ष");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.h3);
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" त्र ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.i3);
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("ज्ञ");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.j3);
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("श्र");
                String words=edit.getText().toString();
                speakWords(words);
                imageView.setImageResource(R.drawable.k3);
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
            if(myTTS.isLanguageAvailable(new Locale("hin"))==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(new Locale("hin"));
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }
}
