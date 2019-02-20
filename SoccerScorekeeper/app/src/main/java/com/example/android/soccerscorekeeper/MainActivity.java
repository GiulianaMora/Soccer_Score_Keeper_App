package com.example.android.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccerscorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreVisitors = 0;
    int foulsHome = 0;
    int foulsVisitors = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Home by one point.
     */
    public void addOneForHome(View v){
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    /**
     * Increase the number of fouls for Home by one point.
     */
    public void addOneForFoulsHome(View v){
        foulsHome = foulsHome + 1;
        displayFoulsHome(foulsHome);
    }

    /**
     * Increase the score for Visitors by one point.
     */
    public void addOneForVisitors(View v){
        scoreVisitors = scoreVisitors + 1;
        displayForVisitors(scoreVisitors);
    }

    /**
     * Increase the number of fouls for Visitors by one point.
     */
    public void addOneForFoulsVisitors(View v){
        foulsVisitors = foulsVisitors + 1;
        displayFoulsVisitors(foulsVisitors);
    }



    /**
     * Resets the score for both teams back to 0
     */
    public void resetScore(View v) {
        scoreHome = 0;
        scoreVisitors = 0;
        displayForHome(scoreHome);
        displayForVisitors(scoreVisitors);
        foulsHome = 0;
        foulsVisitors = 0;
        displayFoulsHome(foulsHome);
        displayFoulsVisitors(foulsVisitors);
    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the number of fouls for Home.
     */
    public void displayFoulsHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForVisitors(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of fouls for Home.
     */
    public void displayFoulsVisitors(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_fouls);
        scoreView.setText(String.valueOf(score));

    }
}
