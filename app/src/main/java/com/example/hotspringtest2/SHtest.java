/*package com.example.hotspringtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

import com.example.hotspringtest2.R;

public class SHtest extends AppCompatActivity {

    private int sss = 100;
    private int b2 = 12*sss;
    private int y2 = 30*sss;
    private int r2 = 36*sss;

    private int time1 = 18*sss;
    private int time2 = 36*sss;
    public boolean people2_1;

    private SharedPreferences sharedPreferences1;
    private SharedPreferences.Editor editor1;
    private static final String TIMER_STARTED_KEY1 = "timer_started1";
    private static final String START_TIME_KEY1 = "start_time1";
    private static final String ELAPSED_TIME_KEY1 = "elapsed_time1";





    private Handler handler1 = new Handler();
    private int originalblueThreshold2 = b2;
    private int originalyellowThreshold2 = y2;
    private int originalredThreshold2 = r2;



    private long startTime1 = 0L;
    private long timeInMilliseconds1 = 0L;
    private long updatedTime1 = 0L;
    private int seconds1 = 0;
    private int sec1 = 0;
    private int minutes1 = 0;
    private int hours1 = 0;
    private Button btnTimer1;
    //此為測試用 正式版應改為正確時間
    private int blueThreshold1 = b2;   //b2
    private int yellowThreshold1 = y2; //y2
    private int redThreshold1 = r2;    //r2
    //此為測試用 正式版應改為正確時間
    public int people1;
    private boolean isTimerRunning1 = false;





    private boolean flashing1;
    private boolean flashingg1;



    // 獲得現在的時間

    int currentHour1;
    int currentMinute1;


    int futureHour1;
    int futureMinute1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_room);

        Button PrivateRoom1 = findViewById(R.id.SoupHouse2);
        PrivateRoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(PrivateRoom.this, SoupHouse.class);
                startActivity(intent);
            }
        }); //當按下包廂鍵就會跳轉到PrivateRoom畫面

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Home = findViewById(R.id.pHome);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(PrivateRoom.this, MainActivity.class);
                startActivity(intent);
            }
        });


        // 啟動計時器服務
        Intent timerServiceIntent = new Intent(this, TimerServiceS1.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntent);
        } else {
            startService(timerServiceIntent);
        }
        // 初始化 SharedPreferences 和 editor1
        sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(this);
        editor1 = sharedPreferences1.edit();




        btnTimer1 = findViewById(R.id.button1);
        btnTimer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning1){
                    showConfirmationDialogForButton1();
                    updateButtonColor1(); // 更新颜色
                } else if (isTimerRunning1) {
                    if (sec1 < blueThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    } else if (blueThreshold1 <= sec1  && sec1 < yellowThreshold1  ) {
                        if(!flashing1){
                            flashing1 = true; // 停止蓝色闪烁
                            updateButtonColor1();
                        } else if (flashing1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (yellowThreshold1 <= sec1  && sec1 < redThreshold1) {
                        if(!flashingg1){
                            flashingg1 = true; // 停止黄色闪烁
                            updateButtonColor1();
                        } else if (flashingg1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (sec1 >= redThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    }
                }
            }
        });

        btnTimer1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton1();
                return true;
            }
        });


    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        handler1.removeCallbacks(updateTimerThread1);
        handler1.removeCallbacks(updateTimerThread2);
        handler1.removeCallbacks(updateTimerThread3);
        handler1.removeCallbacks(updateTimerThread4);
        handler1.removeCallbacks(updateTimerThread5);
        handler1.removeCallbacks(updateTimerThread66);
        handler1.removeCallbacks(updateTimerThread7);



        // 停止計時器服務
        Intent timerServiceIntent = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent);
        // 停止計時器服務
        Intent timerServiceIntent1 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent1);

        Intent timerServiceIntent2 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent2);

        Intent timerServiceIntent3 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent3);

        Intent timerServiceIntent4 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent4);

        Intent timerServiceIntent5 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent5);

        Intent timerServiceIntent6 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent6);

        Intent timerServiceIntent7 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent7);

        Intent timerServiceIntent8 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent8);

        Intent timerServiceIntent9 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent9);

        Intent timerServiceIntent10 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent10);

        Intent timerServiceIntent11 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent11);

        Intent timerServiceIntent12 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent12);

        Intent timerServiceIntent13 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent13);

        Intent timerServiceIntent14 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent14);

        Intent timerServiceIntent15 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent15);

        Intent timerServiceIntent16 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent16);

        Intent timerServiceIntent17 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent17);

        Intent timerServiceIntent18 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent18);

        Intent timerServiceIntent19 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent19);

        Intent timerServiceIntent20 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent20);

        Intent timerServiceIntent21 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent21);

        Intent timerServiceIntent22 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent22);

        Intent timerServiceIntent23 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent23);

        Intent timerServiceIntent24 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent24);

        Intent timerServiceIntent25 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent25);

        //Intent timerServiceIntent266 = new Intent(this, TimerServiceS1.class);
        //stopService(timerServiceIntent266);

        Intent timerServiceIntent27RR = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent27RR);

        Intent timerServiceIntent28RR = new Intent(this,TimerServiceS1.class);
        stopService(timerServiceIntent28RR);

        Intent timerServiceIntent66 = new Intent(this,TimerServiceS1.class);
        stopService(timerServiceIntent66);

        Intent timerServiceIntent26RR = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent26RR);

    }


    @Override
    public void onPause() {
        super.onPause();


        // 在保存計時器1狀態時，使用editor1對象進行同步
        synchronized (editor1) {
            editor1.putBoolean(TIMER_STARTED_KEY1, handler1.hasCallbacks(updateTimerThread1));
            editor1.putLong(START_TIME_KEY1, startTime1);
            editor1.putLong(ELAPSED_TIME_KEY1, timeInMilliseconds1);
            editor1.putBoolean("people_key1", people2_1);
            editor1.putBoolean("flashing_key1", flashing1);
            editor1.putBoolean("flashingg_key1", flashingg1);
            editor1.putBoolean("isTimerRunning1", isTimerRunning1);
            editor1.putInt("currentHour1",currentHour1);
            editor1.putInt("currentMinute1",currentMinute1);

            // 保存加時時間到SharedPreferences
            editor1.putInt("blueThreshold1", blueThreshold1);
            editor1.putInt("yellowThreshold1", yellowThreshold1);
            editor1.putInt("redThreshold1", redThreshold1);
            editor1.apply();
        }



    }

    @Override
    public void onResume() {
        super.onResume();

        synchronized (editor1) {
            boolean timerStarted1 = sharedPreferences1.getBoolean(TIMER_STARTED_KEY1, false);
            if (timerStarted1) {
                startTime1 = sharedPreferences1.getLong(START_TIME_KEY1, 0);
                timeInMilliseconds1 = sharedPreferences1.getLong(ELAPSED_TIME_KEY1, 0);
                sec1 = (int) (timeInMilliseconds1 / 1000);
                handler1.postDelayed(updateTimerThread1, 0);
            }
            people2_1 = sharedPreferences1.getBoolean("people_key1", false);
            flashing1 = sharedPreferences1.getBoolean("flashing_key1", false);
            flashingg1 = sharedPreferences1.getBoolean("flashingg_key1", false);
            isTimerRunning1 = sharedPreferences1.getBoolean("isTimerRunning1", false);
            currentHour1 = sharedPreferences1.getInt("currentHour1",currentHour1);
            currentMinute1 = sharedPreferences1.getInt("currentMinute1",currentMinute1);

            // 恢复加時時間  測試用
            blueThreshold1 = sharedPreferences1.getInt("blueThreshold1", originalblueThreshold2);
            yellowThreshold1 = sharedPreferences1.getInt("yellowThreshold1", originalyellowThreshold2);
            redThreshold1 = sharedPreferences1.getInt("redThreshold1", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor1();
        }


    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handler1.removeCallbacks(updateTimerThread1);
    }




    private void resetseconds1() {
        seconds1 = 0;
        sec1 = 0;
        minutes1 = 0;
        hours1 = 0;
        String timeString = String.format("%02d:%02d", hours1, minutes1);
        btnTimer1.setText(timeString);
    }




    private void resetButtonColor1() {
        btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
    }



    private void showConfirmationDialogYNForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer1();
                resetThresholdsToOriginal1();
                resetseconds1();
                resetButtonColor1();
                btnTimer1.clearAnimation();
                flashing1 = false;
                flashingg1 = false;
                isTimerRunning1 = false;
                dialog.dismiss();

            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = true;
                isTimerRunning1 = true;
                startTime1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                currentHour1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                currentMinute1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = false;
                isTimerRunning1 = true;
                startTime1r();
                flashing1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHour1 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinute1 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }




    private void startTime1r() {
        startTime1 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread1, 0);
    }





    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalyellowThreshold2
        yellowThreshold1 = originalyellowThreshold2;
        redThreshold1 = originalredThreshold2;
        blueThreshold1 = originalblueThreshold2;
        //yellowThreshold1 = originalyellowThreshold2;
        //redThreshold1 = originalredThreshold2;
        //blueThreshold1 = originalblueThreshold2;
        //此為測試用
    }



    private Runnable updateTimerThread1 = new Runnable() {
        public void run() {
            timeInMilliseconds1 = SystemClock.uptimeMillis() - startTime1;
            updatedTime1 = timeInMilliseconds1;
            seconds1 = (int) (updatedTime1 / 1000);
            minutes1 = seconds1 / 60;
            hours1 = minutes1 / 60;
            seconds1 = seconds1 % 60;
            minutes1 = minutes1 % 60;
            sec1 = hours1 * 3600 + minutes1 * 60 + seconds1;

            // 计算当前时间加上 redThreshold1 后的时间（秒数）
            int totalSeconds = currentHour1 * 60 * 60 + currentMinute1 * 60 + redThreshold1;
            // 计算小时和分钟
            futureHour1 = totalSeconds / 3600;
            futureMinute1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour1 >= 24) {
                futureHour1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour1, currentMinute1);
            String futureTimeString = String.format("%02d:%02d", futureHour1, futureMinute1);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer1.setText(Html.fromHtml(displayText));
            }

            updateButtonColor1();
            handler1.postDelayed(this, 1000);
        }
    };





    public class CustomArrayAdapter extends ArrayAdapter<String> {
        private Context context;
        private String[] options;
        private int textSize; // 字体大小字段

        public CustomArrayAdapter(Context context, String[] options, int textSize) {
            super(context, R.layout.custom_dialog_layout, options);
            this.context = context;
            this.options = options;
            this.textSize = textSize; // 设置字体大小
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.custom_dialog_layout, parent, false);

            TextView textView = rowView.findViewById(R.id.dialogTitle);
            textView.setText(options[position]);

            // 根据选项文本设置字体大小
            if (options[position].equals("30秒") || options[position].equals("60秒")) {
                textView.setTextSize(textSize); // 设置大字体大小
            } else {
                textView.setTextSize(textSize - 4); // 设置较小字体大小
            }

            return rowView;
        }
    }

    private void showTimeDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("205號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime1(time1);//time1

                    if(sec1 >= blueThreshold1){
                        flashing1 = true;
                        updateButtonColor1();
                    }
                    if(flashingg1){
                        flashingg1 = false;
                        updateButtonColor1();
                    }

                    break;
                case "60分鐘":
                    addTime1(time2);//time2

                    if(sec1 >= blueThreshold1){
                        flashing1 = true;
                        updateButtonColor1();
                    }
                    if(flashingg1){
                        flashingg1 = false;
                        updateButtonColor1();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void addTime1(int secondsToAdd) {
        //blueThreshold1 += secondsToAdd;
        yellowThreshold1 += secondsToAdd;
        redThreshold1 += secondsToAdd;
        updateButtonColor1();
    }

    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------


    private void updateButtonColor1() {
        if (sec1 < 0.01) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec1 < blueThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec1 < blueThreshold1 && !people2_1 ) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < yellowThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else if (sec1 < yellowThreshold1 && !people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < redThreshold1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashingg1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer1.clearAnimation();
        }
    }


}*/
/*package com.example.hotspringtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

import com.example.hotspringtest2.R;

public class SoupHouse extends AppCompatActivity {


    private int sss = 100;
    private int b2 = 12*sss;
    private int y2 = 30*sss;
    private int r2 = 36*sss;

    private int time1 = 18*sss;
    private int time2 = 36*sss;
    public boolean people2_1;

    private SharedPreferences sharedPreferences1;
    private SharedPreferences.Editor editor1;
    private static final String TIMER_STARTED_KEY1 = "timer_started1";
    private static final String START_TIME_KEY1 = "start_time1";
    private static final String ELAPSED_TIME_KEY1 = "elapsed_time1";





    private Handler handler1 = new Handler();
    private int originalblueThreshold2 = b2;
    private int originalyellowThreshold2 = y2;
    private int originalredThreshold2 = r2;



    private long startTime1 = 0L;
    private long timeInMilliseconds1 = 0L;
    private long updatedTime1 = 0L;
    private int seconds1 = 0;
    private int sec1 = 0;
    private int minutes1 = 0;
    private int hours1 = 0;
    private Button btnTimer1;
    //此為測試用 正式版應改為正確時間
    private int blueThreshold1 = b2;   //b2
    private int yellowThreshold1 = y2; //y2
    private int redThreshold1 = r2;    //r2
    //此為測試用 正式版應改為正確時間
    public int people1;
    private boolean isTimerRunning1 = false;





    private boolean flashing1;
    private boolean flashingg1;



    // 獲得現在的時間

    int currentHour1;
    int currentMinute1;


    int futureHour1;
    int futureMinute1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup_house);

        Button PrivateRoom1 = findViewById(R.id.PrivateRoom1);
        PrivateRoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(SoupHouse.this, PrivateRoom.class);
                startActivity(intent);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Home = findViewById(R.id.sHome);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(SoupHouse.this, MainActivity.class);
                startActivity(intent);
            }
        });


        // 啟動計時器服務
        Intent timerServiceIntent1 = new Intent(this, TimerServiceS1.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntent1);
        } else {
            startService(timerServiceIntent1);
        }
        // 初始化 SharedPreferences 和 editor1
        sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(this);
        editor1 = sharedPreferences1.edit();




        btnTimer1 = findViewById(R.id.SHbutton1);
        btnTimer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning1){
                    showConfirmationDialogForButton1();
                    updateButtonColor1(); // 更新颜色
                } else if (isTimerRunning1) {
                    if (sec1 < blueThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    } else if (blueThreshold1 <= sec1  && sec1 < yellowThreshold1  ) {
                        if(!flashing1){
                            flashing1 = true; // 停止蓝色闪烁
                            updateButtonColor1();
                        } else if (flashing1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (yellowThreshold1 <= sec1  && sec1 < redThreshold1) {
                        if(!flashingg1){
                            flashingg1 = true; // 停止黄色闪烁
                            updateButtonColor1();
                        } else if (flashingg1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (sec1 >= redThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    }
                }
            }
        });

        btnTimer1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton1();
                return true;
            }
        });


    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        handler1.removeCallbacks(updateTimerThread1);

        // 停止計時器服務
        Intent timerServiceIntent1 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent1);

    }


    @Override
    public void onPause() {
        super.onPause();


        // 在保存計時器1狀態時，使用editor1對象進行同步
        synchronized (editor1) {
            editor1.putBoolean(TIMER_STARTED_KEY1, handler1.hasCallbacks(updateTimerThread1));
            editor1.putLong(START_TIME_KEY1, startTime1);
            editor1.putLong(ELAPSED_TIME_KEY1, timeInMilliseconds1);
            editor1.putBoolean("people_key1", people2_1);
            editor1.putBoolean("flashing_key1", flashing1);
            editor1.putBoolean("flashingg_key1", flashingg1);
            editor1.putBoolean("isTimerRunning1", isTimerRunning1);
            editor1.putInt("currentHour1",currentHour1);
            editor1.putInt("currentMinute1",currentMinute1);

            // 保存加時時間到SharedPreferences
            editor1.putInt("blueThreshold1", blueThreshold1);
            editor1.putInt("yellowThreshold1", yellowThreshold1);
            editor1.putInt("redThreshold1", redThreshold1);
            editor1.apply();
        }



    }

    @Override
    public void onResume() {
        super.onResume();

        synchronized (editor1) {
            boolean timerStarted1 = sharedPreferences1.getBoolean(TIMER_STARTED_KEY1, false);
            if (timerStarted1) {
                startTime1 = sharedPreferences1.getLong(START_TIME_KEY1, 0);
                timeInMilliseconds1 = sharedPreferences1.getLong(ELAPSED_TIME_KEY1, 0);
                sec1 = (int) (timeInMilliseconds1 / 1000);
                handler1.postDelayed(updateTimerThread1, 0);
            }
            people2_1 = sharedPreferences1.getBoolean("people_key1", false);
            flashing1 = sharedPreferences1.getBoolean("flashing_key1", false);
            flashingg1 = sharedPreferences1.getBoolean("flashingg_key1", false);
            isTimerRunning1 = sharedPreferences1.getBoolean("isTimerRunning1", false);
            currentHour1 = sharedPreferences1.getInt("currentHour1",currentHour1);
            currentMinute1 = sharedPreferences1.getInt("currentMinute1",currentMinute1);

            // 恢复加時時間  測試用
            blueThreshold1 = sharedPreferences1.getInt("blueThreshold1", originalblueThreshold2);
            yellowThreshold1 = sharedPreferences1.getInt("yellowThreshold1", originalyellowThreshold2);
            redThreshold1 = sharedPreferences1.getInt("redThreshold1", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor1();
        }


    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handler1.removeCallbacks(updateTimerThread1);
    }




    private void resetseconds1() {
        seconds1 = 0;
        sec1 = 0;
        minutes1 = 0;
        hours1 = 0;
        String timeString = String.format("%02d:%02d", hours1, minutes1);
        btnTimer1.setText(timeString);
    }




    private void resetButtonColor1() {
        btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
    }



    private void showConfirmationDialogYNForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer1();
                resetThresholdsToOriginal1();
                resetseconds1();
                resetButtonColor1();
                btnTimer1.clearAnimation();
                flashing1 = false;
                flashingg1 = false;
                isTimerRunning1 = false;
                dialog.dismiss();

            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = true;
                isTimerRunning1 = true;
                startTime1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                currentHour1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                currentMinute1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = false;
                isTimerRunning1 = true;
                startTime1r();
                flashing1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHour1 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinute1 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }




    private void startTime1r() {
        startTime1 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread1, 0);
    }





    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalyellowThreshold2
        yellowThreshold1 = originalyellowThreshold2;
        redThreshold1 = originalredThreshold2;
        blueThreshold1 = originalblueThreshold2;
        //yellowThreshold1 = originalyellowThreshold2;
        //redThreshold1 = originalredThreshold2;
        //blueThreshold1 = originalblueThreshold2;
        //此為測試用
    }



    private Runnable updateTimerThread1 = new Runnable() {
        public void run() {
            timeInMilliseconds1 = SystemClock.uptimeMillis() - startTime1;
            updatedTime1 = timeInMilliseconds1;
            seconds1 = (int) (updatedTime1 / 1000);
            minutes1 = seconds1 / 60;
            hours1 = minutes1 / 60;
            seconds1 = seconds1 % 60;
            minutes1 = minutes1 % 60;
            sec1 = hours1 * 3600 + minutes1 * 60 + seconds1;

            // 计算当前时间加上 redThreshold1 后的时间（秒数）
            int totalSeconds = currentHour1 * 60 * 60 + currentMinute1 * 60 + redThreshold1;
            // 计算小时和分钟
            futureHour1 = totalSeconds / 3600;
            futureMinute1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour1 >= 24) {
                futureHour1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour1, currentMinute1);
            String futureTimeString = String.format("%02d:%02d", futureHour1, futureMinute1);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;
            btnTimer1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer1.setText(Html.fromHtml(displayText));
            }

            updateButtonColor1();
            handler1.postDelayed(this, 1000);
        }
    };





    public class CustomArrayAdapter extends ArrayAdapter<String> {
        private Context context;
        private String[] options;
        private int textSize; // 字体大小字段

        public CustomArrayAdapter(Context context, String[] options, int textSize) {
            super(context, R.layout.custom_dialog_layout, options);
            this.context = context;
            this.options = options;
            this.textSize = textSize; // 设置字体大小
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.custom_dialog_layout, parent, false);

            TextView textView = rowView.findViewById(R.id.dialogTitle);
            textView.setText(options[position]);

            // 根据选项文本设置字体大小
            if (options[position].equals("30秒") || options[position].equals("60秒")) {
                textView.setTextSize(textSize); // 设置大字体大小
            } else {
                textView.setTextSize(textSize - 4); // 设置较小字体大小
            }

            return rowView;
        }
    }

    private void showTimeDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouse.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime1(time1);//time1

                    if(sec1 >= blueThreshold1){
                        flashing1 = true;
                        updateButtonColor1();
                    }
                    if(flashingg1){
                        flashingg1 = false;
                        updateButtonColor1();
                    }

                    break;
                case "60分鐘":
                    addTime1(time2);//time2

                    if(sec1 >= blueThreshold1){
                        flashing1 = true;
                        updateButtonColor1();
                    }
                    if(flashingg1){
                        flashingg1 = false;
                        updateButtonColor1();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void addTime1(int secondsToAdd) {
        //blueThreshold1 += secondsToAdd;
        yellowThreshold1 += secondsToAdd;
        redThreshold1 += secondsToAdd;
        updateButtonColor1();
    }

    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------


    private void updateButtonColor1() {
        if (sec1 < 0.01) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec1 < blueThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec1 < blueThreshold1 && !people2_1 ) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < yellowThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else if (sec1 < yellowThreshold1 && !people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < redThreshold1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashingg1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer1.clearAnimation();
        }
    }


}
*/