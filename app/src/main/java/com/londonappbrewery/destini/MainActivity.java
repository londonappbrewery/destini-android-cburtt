package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView  mstoryText;
    private Button mtopBtn;
    private Button mbottomBtn;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryText =  findViewById(R.id.storyTextView);
        mtopBtn =  findViewById(R.id.buttonTop);
        mbottomBtn  = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mtopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex){
                    case 1:
                        //first answer is top button, etc
                        mstoryText.setText(R.string.T3_Story);
                        mtopBtn.setText(R.string.T3_Ans1);
                        mbottomBtn.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 2:
                        mstoryText.setText(R.string.T3_Story);
                        mtopBtn.setText(R.string.T3_Ans1);
                        mbottomBtn.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mstoryText.setText(R.string.T6_End);
                        mtopBtn.setVisibility(View.GONE);
                        mbottomBtn.setVisibility(View.GONE);
                        mStoryIndex = 6;
                        break;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex){
                    case 1:
                        //first answer is top button, etc
                        mstoryText.setText(R.string.T2_Story);
                        mtopBtn.setText(R.string.T2_Ans1);
                        mbottomBtn.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mstoryText.setText(R.string.T4_End);
                        mtopBtn.setVisibility(View.GONE);
                        mbottomBtn.setVisibility(View.GONE);
                        mStoryIndex = 4;
                        break;
                    case 3:
                        mstoryText.setText(R.string.T5_End);
                        mtopBtn.setVisibility(View.GONE);
                        mbottomBtn.setVisibility(View.GONE);
                        mStoryIndex = 5;
                        break;


                }
            }
        });

    }

}
