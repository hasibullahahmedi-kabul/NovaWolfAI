package com.novawolf.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.RecognitionListener;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends Activity {

    LinearLayout chatContainer;
    EditText messageInput;
    TextToSpeech textToSpeech;
    SpeechRecognizer speechRecognizer;

    int white = Color.rgb(245,247,250);
    int gray = Color.rgb(141,149,165);
    int blue = Color.rgb(77,141,255);
    int card = Color.rgb(23,27,35);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createInterface();

        textToSpeech = new TextToSpeech(this, status -> {});
    }

    TextView createText(String text, float size) {

        TextView view = new TextView(this);

        view.setText(text);
        view.setTextColor(white);
        view.setTextSize(size);
        view.setPadding(24, 18, 24, 18);

        return view;
    }

    void createInterface() {

        LinearLayout root = new LinearLayout(this);

        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.rgb(8,10,15));

        // Header
        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(18, 10, 18, 10);

        TextView logo = createText("🐺", 34);

        TextView title = createText("NovaWolf AI", 22);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);

        TextView subtitle = createText("دستیار هوشمند شما", 12);
        subtitle.setTextColor(gray);

        LinearLayout titleBox = new LinearLayout(this);
        titleBox.setOrientation(LinearLayout.VERTICAL);

        titleBox.addView(title);
        titleBox.addView(subtitle);

        header.addView(logo);
        header.addView(titleBox);

        root.addView(
                header,
                new LinearLayout.LayoutParams(
                        -1,
                        



