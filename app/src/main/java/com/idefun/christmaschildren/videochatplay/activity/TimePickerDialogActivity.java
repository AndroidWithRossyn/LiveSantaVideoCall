package com.idefun.christmaschildren.videochatplay.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.idefun.christmaschildren.videochatplay.R;
import com.pesonal.adsdk.AppManage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimePickerDialogActivity extends AppCompatActivity {
    CardView next;
    TextView next_t1,age;
    LottieAnimationView lottieVideo;
    CheckBox checkbox;
    LinearLayout t1;
    int P = 13;
    int Q = 32;
    int R123 = 33;
    int I = 2;

    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);
//        lottieVideo=findViewById(R.id.lottieVideo);
        t1=findViewById(R.id.t1);
        next=findViewById(R.id.next);
        age=findViewById(R.id.age);
        checkbox=findViewById(R.id.checkBox);
        next_t1=findViewById(R.id.next_t1);
        final Calendar calendar = Calendar.getInstance();
        AppManage.getInstance(TimePickerDialogActivity.this).loadInterstitialAd(this);
        next_t1.setOnClickListener(v -> {
            if(checkbox.isChecked()==true){
                AppManage.getInstance(TimePickerDialogActivity.this).showInterstitialAd(TimePickerDialogActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {

                        Intent intent = new Intent(TimePickerDialogActivity.this, DashboardActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            } else {
                Toast.makeText(TimePickerDialogActivity.this, "Please Select your birth date", Toast.LENGTH_SHORT).show();
            }

        });
        next.setOnClickListener(v -> {
            if(checkbox.isChecked()==true){
                AppManage.getInstance(TimePickerDialogActivity.this).showInterstitialAd(TimePickerDialogActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(TimePickerDialogActivity.this, DashboardActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            } else {
                Toast.makeText(TimePickerDialogActivity.this, "Please Select your birth date", Toast.LENGTH_SHORT).show();
            }

        });
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), datePickerListener, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();

//                TimePickerDialogActivity.this.a("clock");
//                Calendar instance = Calendar.getInstance();
//                @SuppressLint("WrongConstant") TimePickerDialog timePickerDialog = new TimePickerDialog(view.getContext(), new TimePickerDialog.OnTimeSetListener() {
//                    public void onTimeSet(TimePicker timePicker, int i, int i2) {
//                        int i3;
//                        TimePickerDialogActivity.this.P = i;
//                        TimePickerDialogActivity.this.Q = i2;
//                        TimePickerDialogActivity.this.R123 = new Date().getSeconds() + 3;
//                        int i4 = 0;
//                        if (TimePickerDialogActivity.this.P > i) {
//                            i4 = TimePickerDialogActivity.this.P - i;
//                            i3 = TimePickerDialogActivity.this.Q;
//                        } else {
//                            i3 = TimePickerDialogActivity.this.Q > 0 ? TimePickerDialogActivity.this.Q - 0 : 0;
//                        }
//                        TimePickerDialogActivity.this.I = (i4 * 3600) + (i3 * 60) + TimePickerDialogActivity.this.R123;
//                    }
//                }, instance.get(11), instance.get(12), true);
//                timePickerDialog.setTitle("Select Time");
//                timePickerDialog.show();
            }
        });
    }
    private DatePickerDialog.OnDateSetListener datePickerListener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year1, int month1, int day1) {
            Calendar userAge = new GregorianCalendar(year1,month1,day1);
            Calendar minAdultAge = new GregorianCalendar();
//            minAdultAge.add(Calendar.YEAR, -18);
//            if (minAdultAge.before(userAge)) {
//                Toast.makeText(TimePickerDialogActivity.this, "Person should be greater than 18 year year old", Toast.LENGTH_SHORT).show();
//            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR,year1);
            calendar.set(Calendar.MONTH,month1);
            calendar.set(Calendar.DAY_OF_MONTH,day1);
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                String format=new SimpleDateFormat("dd MM YYYY").format(calendar.getTime());
            }
            age.setText("Hii, Santa here \uD83C\uDF85\uD83C\uDFFB, You are "+ Integer.toString(calculateAge(calendar.getTimeInMillis()))+ " years old. I wish you that this Christmas be full of snowflakes, candies and gifts for you. Warm greetings on Christmas to you my dear.");
        }
    };
    int calculateAge(long date){
        Calendar dob=Calendar.getInstance();
        dob.setTimeInMillis(date);
        Calendar today=Calendar.getInstance();
        int age=today.get(Calendar.YEAR)-dob.get(Calendar.YEAR);
        if(today.get(Calendar.DAY_OF_MONTH)<dob.get(Calendar.DAY_OF_MONTH)){
            age--;
        }

        return age;
    }

    @Override
    public void onBackPressed() {
        AppManage.getInstance(TimePickerDialogActivity.this).showInterstitialAd(TimePickerDialogActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                TimePickerDialogActivity.super.onBackPressed();
            }
        }, "", AppManage.app_mainClickCntSwAd);

    }
}