package com.rider.rider.login;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.github.jorgecastilloprz.FABProgressCircle;
import com.rider.rider.R;
import com.rider.rider.RiderMainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.view.Gravity.RIGHT;

public class RiderPasswordActivity extends AppCompatActivity {

    @BindView(R.id.etPass)
    EditText etPass;

    @BindView(R.id.rootFrame)
    FrameLayout rootFrame;

    @BindView(R.id.fabProgressCircle)
    FABProgressCircle fabProgressCircle;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_password);

        ButterKnife.bind(this);

        Slide enterSlide = new Slide(RIGHT);
        enterSlide.setDuration(700);
        enterSlide.addTarget(R.id.llphone);
        enterSlide.setInterpolator(new DecelerateInterpolator(2));
        getWindow().setEnterTransition(enterSlide);

        Slide returnSlide = new Slide(RIGHT);
        returnSlide.setDuration(700);
        returnSlide.addTarget(R.id.llphone);
        returnSlide.setInterpolator(new DecelerateInterpolator());
        getWindow().setReturnTransition(returnSlide);
    }

    @OnClick(R.id.fabProgressCircle)
    void nextActivity() {
        etPass.setCursorVisible(false);
        rootFrame.setAlpha(0.4f);
        fabProgressCircle.show();

        InputMethodManager imm = (InputMethodManager) getSystemService(
                Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(etPass.getWindowToken(), 0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(RiderPasswordActivity.this, RiderMainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }

    @OnClick(R.id.ivback)
    void back() {
        onBackPressed();
    }
}