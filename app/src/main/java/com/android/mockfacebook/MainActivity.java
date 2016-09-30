package com.android.mockfacebook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {


    private Button btnLike, btnComment, btnShare, btnOptions, btnCrazyFeatureWeDontReallyNeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLike = (Button) findViewById(R.id.like_button);

        btnLike.setOnClickListener(this);


    }

    private void performACalculation() {
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.out.println("We pressed back");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.like_button:
                //Do all this goodness
                System.out.println("We just tired");
                break;
            case R.id.comment_button:
                //Do all this goodness
                //postComment();
                break;
            case R.id.share_button:
                //Do all this goodness
                //sharePost();
                break;


        }
    }
}
