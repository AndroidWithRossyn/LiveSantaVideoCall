package com.idefun.christmaschildren.videochatplay.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.idefun.christmaschildren.videochatplay.R;
import com.idefun.christmaschildren.videochatplay.reject.RejectAudioCallActivity;
import com.idefun.christmaschildren.videochatplay.reject.RejectAudioCallFourActivity;
import com.idefun.christmaschildren.videochatplay.reject.RejectAudioCallOneActivity;
import com.idefun.christmaschildren.videochatplay.reject.RejectAudioCallTwoActivity;
import com.pesonal.adsdk.AppManage;

public class SelectsSantaAudioActivity extends AppCompatActivity {
    private CardView bl1,bl2,bl3,bl4;
    private TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selects_santa_audio);
        AppManage.getInstance(SelectsSantaAudioActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(SelectsSantaAudioActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[0], FACEBOOK_N[0]);
        bl1=findViewById(R.id.bl1);
        bl2=findViewById(R.id.bl2);
        bl3=findViewById(R.id.bl3);
        bl4=findViewById(R.id.bl4);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        bl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallOneActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallOneActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        bl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallTwoActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallTwoActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        bl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallFourActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(SelectsSantaAudioActivity.this).showInterstitialAd(SelectsSantaAudioActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(SelectsSantaAudioActivity.this, RejectAudioCallFourActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
    }
}