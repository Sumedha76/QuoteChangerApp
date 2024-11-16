package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView quoteTextView;
    private Button changeQuoteButton;
    private String[] quotes={
            "The greatest glory in living lies not in never falling, but in rising every time we fall",
            "The way to get started is to quit talking and begin doing",
            "The future belongs to those who believe in the beauty of their dreams",
            "Well done is better than well said",
            "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that",
            "The strength of a thousand is not as powerful as the strength of one with faith",
            "The life of a fool is empty of faith and full of fears",
            "Ignorance gives rise to doubt which leads to sin and regret",
            "The one who has conquered his mind is free from all sorrows and fears",
            "The weak cannot forgive; the strong can, forgiveness is an attribute of the strong",
            "Anger clouds reason and leads to destruction",
            "Peace comes from within. When one conquers his inner enemies, peace will come automatically",
            "You will continue to suffer if you have an emotional reaction to everything that is said to you \n If words can control you then everyone else can control you",
            "True power is sitting back and observing everything everything with logic\nBreathe and allow things to pass"
    };

    private int currentQuoteIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        changeQuoteButton= findViewById(R.id.changeQuoteButton);

        changeQuoteButton.setOnClickListener(view -> showNextQuote());
    }

    private void showNextQuote() {
        if(currentQuoteIndex<quotes.length-1)
        {
            currentQuoteIndex++;
        }
        else {
            currentQuoteIndex=0;
        }
        quoteTextView.setText(quotes[currentQuoteIndex]);
    }

}