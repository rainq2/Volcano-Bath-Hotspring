//1121
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

public class PrivateRoom extends AppCompatActivity {

    private int sss = 100;
    private int b2 = 12*sss;
    private int y2 = 30*sss;
    private int r2 = 36*sss;

    private int time1 = 18*sss;
    private int time2 = 36*sss;
    public boolean people2_1;
    public boolean people2_2;
    public boolean people2_3;
    public boolean people2_4;
    public boolean people2_5;

    public boolean people2_7;

    public boolean people2_66;

    private SharedPreferences sharedPreferences1;
    private SharedPreferences.Editor editor1;
    private static final String TIMER_STARTED_KEY1 = "timer_started1";
    private static final String START_TIME_KEY1 = "start_time1";
    private static final String ELAPSED_TIME_KEY1 = "elapsed_time1";

    private SharedPreferences sharedPreferences2;
    private SharedPreferences.Editor editor2;
    private static final String TIMER_STARTED_KEY2 = "timer_started2";
    private static final String START_TIME_KEY2 = "start_time2";
    private static final String ELAPSED_TIME_KEY2 = "elapsed_time2";

    private SharedPreferences sharedPreferences3;
    private SharedPreferences.Editor editor3;
    private static final String TIMER_STARTED_KEY3 = "timer_started3";
    private static final String START_TIME_KEY3 = "start_time3";
    private static final String ELAPSED_TIME_KEY3 = "elapsed_time3";

    private SharedPreferences sharedPreferences4;
    private SharedPreferences.Editor editor4;
    private static final String TIMER_STARTED_KEY4 = "timer_started4";
    private static final String START_TIME_KEY4 = "start_time4";
    private static final String ELAPSED_TIME_KEY4 = "elapsed_time4";
    private SharedPreferences sharedPreferences5;
    private SharedPreferences.Editor editor5;
    private static final String TIMER_STARTED_KEY5 = "timer_started5";
    private static final String START_TIME_KEY5 = "start_time5";
    private static final String ELAPSED_TIME_KEY5 = "elapsed_time5";



    private SharedPreferences sharedPreferences7;
    private SharedPreferences.Editor editor7;
    private static final String TIMER_STARTED_KEY7 = "timer_started7";
    private static final String START_TIME_KEY7 = "start_time7";
    private static final String ELAPSED_TIME_KEY7 = "elapsed_time7";



    private SharedPreferences sharedPreferences66;
    private SharedPreferences.Editor editor66;
    private static final String TIMER_STARTED_KEY66 = "timer_started66";
    private static final String START_TIME_KEY66 = "start_time66";
    private static final String ELAPSED_TIME_KEY66 = "elapsed_time66";




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



    private long startTime2 = 0L;
    private long timeInMilliseconds2 = 0L;
    private long updatedTime2 = 0L;
    private int seconds2 = 0;
    private int sec2 = 0;
    private int minutes2 = 0;
    private int hours2 = 0;
    private Button btnTimer2;
    private int blueThreshold2 = b2;
    private int yellowThreshold2 = y2;
    private int redThreshold2 = r2;
    public int people2;
    private boolean isTimerRunning2 = false;


    private long startTime3 = 0L;
    private long timeInMilliseconds3 = 0L;
    private long updatedTime3 = 0L;
    private int seconds3 = 0;
    private int sec3 = 0;
    private int minutes3 = 0;
    private int hours3 = 0;
    private Button btnTimer3;
    private int blueThreshold3 = b2;
    private int yellowThreshold3 = y2;
    private int redThreshold3 = r2;
    public int people3;
    private boolean isTimerRunning3 = false;


    private long startTime4 = 0L;
    private long timeInMilliseconds4 = 0L;
    private long updatedTime4 = 0L;
    private int seconds4 = 0;
    private int sec4 = 0;
    private int minutes4 = 0;
    private int hours4 = 0;
    private Button btnTimer4;
    private int blueThreshold4 = b2;
    private int yellowThreshold4 = y2;
    private int redThreshold4 = r2;
    public int people4;
    private boolean isTimerRunning4 = false;

    private long startTime5 = 0L;
    private long timeInMilliseconds5 = 0L;
    private long updatedTime5 = 0L;
    private int seconds5 = 0;
    private int sec5 = 0;
    private int minutes5 = 0;
    private int hours5 = 0;
    private Button btnTimer5;
    private int blueThreshold5 = b2;
    private int yellowThreshold5 = y2;
    private int redThreshold5 = r2;
    public int people5;
    private boolean isTimerRunning5 = false;


    private long startTime7 = 0L;
    private long timeInMilliseconds7 = 0L;
    private long updatedTime7 = 0L;
    private int seconds7 = 0;
    private int sec7 = 0;
    private int minutes7 = 0;
    private int hours7 = 0;
    private Button btnTimer7;
    private int blueThreshold7 = b2;
    private int yellowThreshold7 = y2;
    private int redThreshold7 = r2;
    public int people7;
    private boolean isTimerRunning7 = false;

    private long startTime66 = 0L;
    private long timeInMilliseconds66 = 0L;
    private long updatedTime66 = 0L;
    private int seconds66 = 0;
    private int sec66 = 0;
    private int minutes66 = 0;
    private int hours66 = 0;
    private Button btnTimer66;
    private int blueThreshold66 = b2;
    private int yellowThreshold66 = y2;
    private int redThreshold66 = r2;
    public int people66;
    private boolean isTimerRunning66 = false;



    private boolean flashing1;
    private boolean flashing2;
    private boolean flashing3;
    private boolean flashing4;
    private boolean flashing5;
    private boolean flashing7;
    private boolean flashing66 ;

    private boolean flashingg1;
    private boolean flashingg2 ;
    private boolean flashingg3 ;
    private boolean flashingg4 ;
    private boolean flashingg5 ;
    private boolean flashingg7 ;
    private boolean flashingg66 ;


    // 獲得現在的時間

    int currentHour1;
    int currentMinute1;

    int currentHour2;
    int currentMinute2;

    int currentHour3;
    int currentMinute3;

    int currentHour4;
    int currentMinute4;

    int currentHour5;
    int currentMinute5;



    int currentHour7;
    int currentMinute7;



    int currentHour66;
    int currentMinute66;


    int futureHour1;
    int futureMinute1;
    int futureHour2;
    int futureMinute2;

    int futureHour3;
    int futureMinute3;

    int futureHour4;
    int futureMinute4;

    int futureHour5;
    int futureMinute5;



    int futureHour7;
    int futureMinute7;


    int futureHour66;
    int futureMinute66;

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

        // 初始化 SharedPreferences 和 editor2
        sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this);
        editor2 = sharedPreferences2.edit();
// 初始化 SharedPreferences 和 editor3
        sharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(this);
        editor3 = sharedPreferences3.edit();

// 初始化 SharedPreferences 和 editor4
        sharedPreferences4 = PreferenceManager.getDefaultSharedPreferences(this);
        editor4 = sharedPreferences4.edit();
        sharedPreferences5 = PreferenceManager.getDefaultSharedPreferences(this);
        editor5 = sharedPreferences5.edit();



        sharedPreferences7 = PreferenceManager.getDefaultSharedPreferences(this);
        editor7 = sharedPreferences7.edit();

        sharedPreferences66 = PreferenceManager.getDefaultSharedPreferences(this);
        editor66 = sharedPreferences66.edit();




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

        btnTimer2 = findViewById(R.id.button89);
        btnTimer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning2){
                    showConfirmationDialogForButton2();
                    updateButtonColor2(); // 更新颜色
                } else if (isTimerRunning2) {
                    if (sec2 < blueThreshold2) {
                        updateButtonColor2();
                        showConfirmationDialogYNForButton2();
                    } else if (blueThreshold2 <= sec2  && sec2 < yellowThreshold2  ) {
                        if(!flashing2){
                            flashing2 = true; // 停止蓝色闪烁
                            updateButtonColor2();
                        } else if (flashing2) {
                            updateButtonColor2();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (yellowThreshold2 <= sec2  && sec2 < redThreshold2) {
                        if(!flashingg2){
                            flashingg2 = true; // 停止黄色闪烁
                            updateButtonColor2();
                        } else if (flashingg2) {
                            updateButtonColor2();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (sec2 >= redThreshold2) {
                        updateButtonColor2();
                        showConfirmationDialogYNForButton2();
                    }
                }
            }
        });

        btnTimer2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton2();
                return true;
            }
        });


        btnTimer3 = findViewById(R.id.button3);
        btnTimer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning3){
                    showConfirmationDialogForButton3();
                    updateButtonColor3(); // 更新颜色
                } else if (isTimerRunning3) {
                    if (sec3 < blueThreshold3) {
                        updateButtonColor3();
                        showConfirmationDialogYNForButton3();
                    } else if (blueThreshold3 <= sec3  && sec3 < yellowThreshold3  ) {
                        if(!flashing3){
                            flashing3 = true; // 停止蓝色闪烁
                            updateButtonColor3();
                        } else if (flashing3) {
                            updateButtonColor3();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (yellowThreshold3 <= sec3  && sec3 < redThreshold3) {
                        if(!flashingg3){
                            flashingg3 = true; // 停止黄色闪烁
                            updateButtonColor3();
                        } else if (flashingg3) {
                            updateButtonColor3();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (sec3 >= redThreshold3) {
                        updateButtonColor3();
                        showConfirmationDialogYNForButton3();
                    }
                }
            }
        });

        btnTimer3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton3();
                return true;
            }
        });

        btnTimer4 = findViewById(R.id.button4);
        btnTimer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning4){
                    showConfirmationDialogForButton4();
                    updateButtonColor4(); // 更新颜色
                } else if (isTimerRunning4) {
                    if (sec4 < blueThreshold4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    } else if (blueThreshold4 <= sec4  && sec4 < yellowThreshold4  ) {
                        if(!flashing4){
                            flashing4 = true; // 停止蓝色闪烁
                            updateButtonColor4();
                        } else if (flashing4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (yellowThreshold4 <= sec4  && sec4 < redThreshold4) {
                        if(!flashingg4){
                            flashingg4 = true; // 停止黄色闪烁
                            updateButtonColor4();
                        } else if (flashingg4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (sec4 >= redThreshold4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    }
                }
            }
        });

        btnTimer4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton4();
                return true;
            }
        });

        btnTimer5 = findViewById(R.id.button5);
        btnTimer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning5){
                    showConfirmationDialogForButton5();
                    //isTimerRunning5 = true;
                    updateButtonColor5(); // 更新颜色
                } else if (isTimerRunning5) {
                    if (sec5 < blueThreshold5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    } else if (blueThreshold5 <= sec5  && sec5 < yellowThreshold5  ) {
                        if(!flashing5){
                            flashing5 = true; // 停止蓝色闪烁
                            updateButtonColor5();
                        } else if (flashing5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (yellowThreshold5 <= sec5  && sec5 < redThreshold5) {
                        if(!flashingg5){
                            flashingg5 = true; // 停止黄色闪烁
                            updateButtonColor5();
                        } else if (flashingg5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (sec5 >= redThreshold5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    }
                }
            }
        });

        btnTimer5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton5();
                return true;
            }
        });





        btnTimer7 = findViewById(R.id.button7);
        btnTimer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning7){
                    showConfirmationDialogForButton7();
                    //isTimerRunning7 = true;
                    updateButtonColor7(); // 更新颜色
                } else if (isTimerRunning7) {
                    if (sec7 < blueThreshold7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    } else if (blueThreshold7 <= sec7  && sec7 < yellowThreshold7  ) {
                        if(!flashing7){
                            flashing7 = true; // 停止蓝色闪烁
                            updateButtonColor7();
                        } else if (flashing7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (yellowThreshold7 <= sec7  && sec7 < redThreshold7) {
                        if(!flashingg7){
                            flashingg7 = true; // 停止黄色闪烁
                            updateButtonColor7();
                        } else if (flashingg7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (sec7 >= redThreshold7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    }
                }
            }
        });

        btnTimer7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton7();
                return true;
            }
        });


        btnTimer66 = findViewById(R.id.button6);
        btnTimer66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning66){
                    showConfirmationDialogForButton66();
                    //isTimerRunning66 = true;
                    updateButtonColor66(); // 更新颜色
                } else if (isTimerRunning66) {
                    if (sec66 < blueThreshold66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    } else if (blueThreshold66 <= sec66  && sec66 < yellowThreshold66  ) {
                        if(!flashing66){
                            flashing66 = true; // 停止蓝色闪烁
                            updateButtonColor66();
                        } else if (flashing66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (yellowThreshold66 <= sec66  && sec66 < redThreshold66) {
                        if(!flashingg66){
                            flashingg66 = true; // 停止黄色闪烁
                            updateButtonColor66();
                        } else if (flashingg66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (sec66 >= redThreshold66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    }
                }
            }
        });

        btnTimer66.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton66();
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

        // 在保存計時器2狀態時，使用editor2對象進行同步
        synchronized (editor2) {
            editor2.putBoolean(TIMER_STARTED_KEY2, handler1.hasCallbacks(updateTimerThread2));
            editor2.putLong(START_TIME_KEY2, startTime2);
            editor2.putLong(ELAPSED_TIME_KEY2, timeInMilliseconds2);
            editor2.putBoolean("people_key2", people2_2);


            editor2.putBoolean("flashing_key2", flashing2);
            editor2.putBoolean("flashingg_key2", flashingg2);
            editor2.putBoolean("isTimerRunning2", isTimerRunning2);
            editor2.putInt("currentHour2", currentHour2);
            editor2.putInt("currentMinute2", currentMinute2);


            // 保存加時時間到SharedPreferences
            editor2.putInt("blueThreshold2", blueThreshold2);
            editor2.putInt("yellowThreshold2", yellowThreshold2);
            editor2.putInt("redThreshold2", redThreshold2);
            editor2.apply();
        }

        synchronized (editor3) {
            editor3.putBoolean(TIMER_STARTED_KEY3, handler1.hasCallbacks(updateTimerThread3));
            editor3.putLong(START_TIME_KEY3, startTime3);
            editor3.putLong(ELAPSED_TIME_KEY3, timeInMilliseconds3);
            editor3.putBoolean("people_key3", people2_3);

            editor3.putBoolean("flashing_key3", flashing3);
            editor3.putBoolean("flashingg_key3", flashingg3);
            editor3.putBoolean("isTimerRunning3", isTimerRunning3);
            editor3.putInt("currentHour3", currentHour3);
            editor3.putInt("currentMinute3", currentMinute3);


            // 保存加時時間到SharedPreferences
            editor3.putInt("blueThreshold3", blueThreshold3);
            editor3.putInt("yellowThreshold3", yellowThreshold3);
            editor3.putInt("redThreshold3", redThreshold3);
            editor3.apply();
        }

        synchronized (editor4) {
            editor4.putBoolean(TIMER_STARTED_KEY4, handler1.hasCallbacks(updateTimerThread4));
            editor4.putLong(START_TIME_KEY4, startTime4);
            editor4.putLong(ELAPSED_TIME_KEY4, timeInMilliseconds4);
            editor4.putBoolean("people_key4", people2_4);

            editor4.putBoolean("flashing_key4", flashing4);
            editor4.putBoolean("flashingg_key4", flashingg4);
            editor4.putBoolean("isTimerRunning4", isTimerRunning4);
            editor4.putInt("currentHour4", currentHour4);
            editor4.putInt("currentMinute4", currentMinute4);


            // 保存加時時間到SharedPreferences
            editor4.putInt("blueThreshold4", blueThreshold4);
            editor4.putInt("yellowThreshold4", yellowThreshold4);
            editor4.putInt("redThreshold4", redThreshold4);
            editor4.apply();
        }

        synchronized (editor5) {
            editor5.putBoolean(TIMER_STARTED_KEY5, handler1.hasCallbacks(updateTimerThread5));
            editor5.putLong(START_TIME_KEY5, startTime5);
            editor5.putLong(ELAPSED_TIME_KEY5, timeInMilliseconds5);
            editor5.putBoolean("people_key5", people2_5);

            editor5.putBoolean("flashing_key5", flashing5);
            editor5.putBoolean("flashingg_key5", flashingg5);
            editor5.putBoolean("isTimerRunning5", isTimerRunning5);
            editor5.putInt("currentHour5", currentHour5);
            editor5.putInt("currentMinute5", currentMinute5);


// 保存加時時間到SharedPreferences
            editor5.putInt("blueThreshold5", blueThreshold5);
            editor5.putInt("yellowThreshold5", yellowThreshold5);
            editor5.putInt("redThreshold5", redThreshold5);
            editor5.apply();
        }



        synchronized (editor7) {
            editor7.putBoolean(TIMER_STARTED_KEY7, handler1.hasCallbacks(updateTimerThread7));
            editor7.putLong(START_TIME_KEY7, startTime7);
            editor7.putLong(ELAPSED_TIME_KEY7, timeInMilliseconds7);
            editor7.putBoolean("people_key7", people2_7);

            editor7.putBoolean("flashing_key7", flashing7);
            editor7.putBoolean("flashingg_key7", flashingg7);
            editor7.putBoolean("isTimerRunning7", isTimerRunning7);

            editor7.putInt("currentHour7", currentHour7);
            editor7.putInt("currentMinute7", currentMinute7);


            // 保存加時時間到SharedPreferences
            editor7.putInt("blueThreshold7", blueThreshold7);
            editor7.putInt("yellowThreshold7", yellowThreshold7);
            editor7.putInt("redThreshold7", redThreshold7);
            editor7.apply();
        }

        synchronized (editor66) {
            editor66.putBoolean(TIMER_STARTED_KEY66, handler1.hasCallbacks(updateTimerThread66));
            editor66.putLong(START_TIME_KEY66, startTime66);
            editor66.putLong(ELAPSED_TIME_KEY66, timeInMilliseconds66);
            editor66.putBoolean("people_key66", people2_66);

            editor66.putBoolean("flashing_key66", flashing66);
            editor66.putBoolean("flashingg_key66", flashingg66);
            editor66.putBoolean("isTimerRunning66", isTimerRunning66);
            editor66.putInt("currentHour66", currentHour66);
            editor66.putInt("currentMinute66", currentMinute66);


            editor66.putInt("blueThreshold66", blueThreshold66);
            editor66.putInt("yellowThreshold66", yellowThreshold66);
            editor66.putInt("redThreshold66", redThreshold66);
            editor66.apply();
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

        synchronized (editor2) {
            boolean timerStarted2 = sharedPreferences2.getBoolean(TIMER_STARTED_KEY2, false);
            if (timerStarted2) {
                startTime2 = sharedPreferences2.getLong(START_TIME_KEY2, 0);
                timeInMilliseconds2 = sharedPreferences2.getLong(ELAPSED_TIME_KEY2, 0);
                sec2 = (int) (timeInMilliseconds2 / 1000);
                handler1.postDelayed(updateTimerThread2, 0);
            }
            people2_2 = sharedPreferences2.getBoolean("people_key2", false);
            flashing2 = sharedPreferences2.getBoolean("flashing_key2", false);
            flashingg2 = sharedPreferences2.getBoolean("flashingg_key2", false);
            isTimerRunning2 = sharedPreferences2.getBoolean("isTimerRunning2", false);
            currentHour2 = sharedPreferences2.getInt("currentHour2", currentHour2);
            currentMinute2 = sharedPreferences2.getInt("currentMinute2", currentMinute2);




            // 恢复加時時間
            blueThreshold2 = sharedPreferences2.getInt("blueThreshold2", originalblueThreshold2);
            yellowThreshold2 = sharedPreferences2.getInt("yellowThreshold2", originalyellowThreshold2);
            redThreshold2 = sharedPreferences2.getInt("redThreshold2", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor2();
        }

        synchronized (editor3) {
            boolean timerStarted3 = sharedPreferences3.getBoolean(TIMER_STARTED_KEY3, false);
            if (timerStarted3) {
                startTime3 = sharedPreferences3.getLong(START_TIME_KEY3, 0);
                timeInMilliseconds3 = sharedPreferences3.getLong(ELAPSED_TIME_KEY3, 0);
                sec3 = (int) (timeInMilliseconds3 / 1000);
                handler1.postDelayed(updateTimerThread3, 0);
            }
            people2_3 = sharedPreferences3.getBoolean("people_key3", false);
            flashing3 = sharedPreferences3.getBoolean("flashing_key3", false);
            flashingg3 = sharedPreferences3.getBoolean("flashingg_key3", false);
            isTimerRunning3 = sharedPreferences3.getBoolean("isTimerRunning3", false);
            currentHour3 = sharedPreferences3.getInt("currentHour3", currentHour3);
            currentMinute3 = sharedPreferences3.getInt("currentMinute3", currentMinute3);




            // 恢复加時時間
            blueThreshold3 = sharedPreferences3.getInt("blueThreshold3", originalblueThreshold2);
            yellowThreshold3 = sharedPreferences3.getInt("yellowThreshold3", originalyellowThreshold2);
            redThreshold3 = sharedPreferences3.getInt("redThreshold3", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor3();
        }

        synchronized (editor4) {
            boolean timerStarted4 = sharedPreferences4.getBoolean(TIMER_STARTED_KEY4, false);
            if (timerStarted4) {
                startTime4 = sharedPreferences4.getLong(START_TIME_KEY4, 0);
                timeInMilliseconds4 = sharedPreferences4.getLong(ELAPSED_TIME_KEY4, 0);
                sec4 = (int) (timeInMilliseconds4 / 1000);
                handler1.postDelayed(updateTimerThread4, 0);
            }
            people2_4 = sharedPreferences4.getBoolean("people_key4", false);
            flashing4 = sharedPreferences4.getBoolean("flashing_key4", false);
            flashingg4 = sharedPreferences4.getBoolean("flashingg_key4", false);
            isTimerRunning4 = sharedPreferences4.getBoolean("isTimerRunning4", false);
            currentHour4 = sharedPreferences4.getInt("currentHour4", currentHour4);
            currentMinute4 = sharedPreferences4.getInt("currentMinute4", currentMinute4);



            // 恢复加時時間
            blueThreshold4 = sharedPreferences4.getInt("blueThreshold4", originalblueThreshold2);
            yellowThreshold4 = sharedPreferences4.getInt("yellowThreshold4", originalyellowThreshold2);
            redThreshold4 = sharedPreferences4.getInt("redThreshold4", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor4();
        }

        synchronized (editor5) {
            boolean timerStarted5 = sharedPreferences5.getBoolean(TIMER_STARTED_KEY5, false);
            if (timerStarted5) {
                startTime5 = sharedPreferences5.getLong(START_TIME_KEY5, 0);
                timeInMilliseconds5 = sharedPreferences5.getLong(ELAPSED_TIME_KEY5, 0);
                sec5 = (int) (timeInMilliseconds5 / 1000);
                handler1.postDelayed(updateTimerThread5, 0);
            }
            people2_5 = sharedPreferences5.getBoolean("people_key5", false);
            flashing5 = sharedPreferences5.getBoolean("flashing_key5", false);
            flashingg5 = sharedPreferences5.getBoolean("flashingg_key5", false);
            isTimerRunning5 = sharedPreferences5.getBoolean("isTimerRunning5", false);
            currentHour5 = sharedPreferences5.getInt("currentHour5", currentHour5);
            currentMinute5 = sharedPreferences5.getInt("currentMinute5", currentMinute5);




            // 恢复加時時間
            blueThreshold5 = sharedPreferences5.getInt("blueThreshold5", originalblueThreshold2);
            yellowThreshold5 = sharedPreferences5.getInt("yellowThreshold5", originalyellowThreshold2);
            redThreshold5 = sharedPreferences5.getInt("redThreshold5", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor5();
        }

        synchronized (editor7) {
            boolean timerStarted7 = sharedPreferences7.getBoolean(TIMER_STARTED_KEY7, false);
            if (timerStarted7) {
                startTime7 = sharedPreferences7.getLong(START_TIME_KEY7, 0);
                timeInMilliseconds7 = sharedPreferences7.getLong(ELAPSED_TIME_KEY7, 0);
                sec7 = (int) (timeInMilliseconds7 / 1000);
                handler1.postDelayed(updateTimerThread7, 0);
            }
            people2_7 = sharedPreferences7.getBoolean("people_key7", false);
            flashing7 = sharedPreferences7.getBoolean("flashing_key7", false);
            flashingg7 = sharedPreferences7.getBoolean("flashingg_key7", false);
            isTimerRunning7 = sharedPreferences7.getBoolean("isTimerRunning7", false);
            currentHour7 = sharedPreferences7.getInt("currentHour7", currentHour7);
            currentMinute7 = sharedPreferences7.getInt("currentMinute7", currentMinute7);




            // 恢复加時時間
            blueThreshold7 = sharedPreferences7.getInt("blueThreshold7", originalblueThreshold2);
            yellowThreshold7 = sharedPreferences7.getInt("yellowThreshold7", originalyellowThreshold2);
            redThreshold7 = sharedPreferences7.getInt("redThreshold7", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor7();
        }

        synchronized (editor66) {
            boolean timerStarted66 = sharedPreferences66.getBoolean(TIMER_STARTED_KEY66, false);
            if (timerStarted66) {
                startTime66 = sharedPreferences66.getLong(START_TIME_KEY66, 0);
                timeInMilliseconds66 = sharedPreferences66.getLong(ELAPSED_TIME_KEY66, 0);
                sec66 = (int) (timeInMilliseconds66 / 1000);
                handler1.postDelayed(updateTimerThread66, 0);
            }
            people2_66 = sharedPreferences66.getBoolean("people_key66", false);
            flashing66 = sharedPreferences66.getBoolean("flashing_key66", false);
            flashingg66 = sharedPreferences66.getBoolean("flashingg_key66", false);
            isTimerRunning66 = sharedPreferences66.getBoolean("isTimerRunning66", false);
            currentHour66 = sharedPreferences66.getInt("currentHour66", currentHour66);
            currentMinute66 = sharedPreferences66.getInt("currentMinute66", currentMinute66);




            // 恢复加時時間
            blueThreshold66 = sharedPreferences66.getInt("blueThreshold66", originalblueThreshold2);
            yellowThreshold66 = sharedPreferences66.getInt("yellowThreshold66", originalyellowThreshold2);
            redThreshold66 = sharedPreferences66.getInt("redThreshold66", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor66();

        }



    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handler1.removeCallbacks(updateTimerThread1);
    }
    private void stopTimer2() {
        handler1.removeCallbacks(updateTimerThread2);
    }
    private void stopTimer3() {
        handler1.removeCallbacks(updateTimerThread3);
    }
    private void stopTimer4() {
        handler1.removeCallbacks(updateTimerThread4);
    }
    private void stopTimer5() {
        handler1.removeCallbacks(updateTimerThread5);
    }

    private void stopTimer7() {
        handler1.removeCallbacks(updateTimerThread7);
    }
    private void stopTimer66() {
        handler1.removeCallbacks(updateTimerThread66);
    }



    private void resetseconds1() {
        seconds1 = 0;
        sec1 = 0;
        minutes1 = 0;
        hours1 = 0;
        String timeString = String.format("%02d:%02d", hours1, minutes1);
        btnTimer1.setText(timeString);
    }
    private void resetseconds2() {
        seconds2 = 0;
        sec2 = 0;
        minutes2 = 0;
        hours2 = 0;
        String timeString = String.format("%02d:%02d", hours2, minutes2);
        btnTimer2.setText(timeString);
    }

    private void resetseconds3() {
        seconds3 = 0;
        sec3 = 0;
        minutes3 = 0;
        hours3 = 0;
        String timeString = String.format("%02d:%02d", hours3, minutes3);
        btnTimer3.setText(timeString);
    }

    private void resetseconds4() {
        seconds4 = 0;
        sec4 = 0;
        minutes4 = 0;
        hours4 = 0;
        String timeString = String.format("%02d:%02d", hours4, minutes4);
        btnTimer4.setText(timeString);
    }
    private void resetseconds5() {
        seconds5 = 0;
        sec5 = 0;
        minutes5 = 0;
        hours5 = 0;
        String timeString = String.format("%02d:%02d", hours5, minutes5);
        btnTimer5.setText(timeString);
    }

    private void resetseconds7() {
        seconds7 = 0;
        sec7 = 0;
        minutes7 = 0;
        hours7 = 0;
        String timeString = String.format("%02d:%02d", hours7, minutes7);
        btnTimer7.setText(timeString);
    }
    private void resetseconds66() {
        seconds66 = 0;
        sec66 = 0;
        minutes66 = 0;
        hours66 = 0;
        String timeString = String.format("%02d:%02d",  hours66, minutes66);
        btnTimer66.setText(timeString);
    }



    private void resetButtonColor1() {
        btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor2() {
        btnTimer2.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor3() {
        btnTimer3.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor4() {
        btnTimer4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor5() {
        btnTimer5.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor7() {
        btnTimer7.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor66() {
        btnTimer66.setBackgroundColor(getResources().getColor(R.color.white));
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
    private void showConfirmationDialogYNForButton2() {
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
                stopTimer2();
                resetThresholdsToOriginal2();
                resetseconds2();
                resetButtonColor2();
                btnTimer2.clearAnimation();
                flashing2 = false;flashingg2 = false;
                isTimerRunning2 = false;


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

    private void showConfirmationDialogYNForButton3() {
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
                stopTimer3();
                resetThresholdsToOriginal3();
                resetseconds3();
                resetButtonColor3();
                btnTimer3.clearAnimation();
                flashing3 = false;flashingg3 = false;
                isTimerRunning3 = false;

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

    private void showConfirmationDialogYNForButton4() {
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
                stopTimer4();
                resetThresholdsToOriginal4();
                resetseconds4();
                resetButtonColor4();
                btnTimer4.clearAnimation();
                flashing4 = false;flashingg4 = false;
                isTimerRunning4 = false;

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
    private void showConfirmationDialogYNForButton5() {
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
                stopTimer5();
                resetThresholdsToOriginal5();
                resetseconds5();
                resetButtonColor5();
                btnTimer5.clearAnimation();
                flashing5 = false;flashingg5 = false;
                isTimerRunning5 = false;


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


    private void showConfirmationDialogYNForButton7() {
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
                stopTimer7();
                resetThresholdsToOriginal7();
                resetseconds7();
                resetButtonColor7();
                btnTimer7.clearAnimation();
                flashing7 = false;flashingg7 = false;
                isTimerRunning7 = false;


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
    private void showConfirmationDialogYNForButton66() {
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
                stopTimer66();
                resetThresholdsToOriginal66();
                resetseconds66();
                resetButtonColor66();
                btnTimer66.clearAnimation();
                flashing66 = false;flashingg66 = false;
                isTimerRunning66 = false;

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


    private void showConfirmationDialogForButton2() {
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
                people2_2 = true;isTimerRunning2 = true;
                startTime2r();
                dialog.dismiss();
                Calendar currentTime2 = Calendar.getInstance();
                currentHour2 = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinute2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_2 = false;isTimerRunning2 = true;
                startTime2r();
                dialog.dismiss();
                flashing2 = true;
                Calendar currentTime2 = Calendar.getInstance();
                currentHour2 = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinute2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton3() {
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
                people2_3 = true;isTimerRunning3 = true;
                startTime3r();
                dialog.dismiss();
                Calendar currentTime3 = Calendar.getInstance();
                currentHour3 = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinute3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_3 = false;isTimerRunning3 = true;
                startTime3r();
                dialog.dismiss();
                flashing3 = true;
                Calendar currentTime3 = Calendar.getInstance();
                currentHour3 = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinute3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton4() {
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
                people2_4 = true;isTimerRunning4 = true;
                startTime4r();
                dialog.dismiss();
                Calendar currentTime4 = Calendar.getInstance();
                currentHour4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinute4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_4 = false;isTimerRunning4 = true;
                startTime4r();
                dialog.dismiss();
                flashing4 = true;
                Calendar currentTime4 = Calendar.getInstance();
                currentHour4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinute4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton5() {
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
                people2_5 = true;isTimerRunning5 = true;
                startTime5r();
                dialog.dismiss();
                Calendar currentTime5 = Calendar.getInstance();
                currentHour5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinute5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_5 = false;isTimerRunning5 = true;
                startTime5r();
                dialog.dismiss();
                flashing5 = true;
                Calendar currentTime5 = Calendar.getInstance();
                currentHour5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinute5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton7() {
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
                people2_7 = true;isTimerRunning7 = true;
                startTime7r();
                dialog.dismiss();
                Calendar currentTime7 = Calendar.getInstance();
                currentHour7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinute7 = currentTime7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_7 = false;isTimerRunning7 = true;
                startTime7r();
                dialog.dismiss();
                flashing7 = true;
                Calendar currentTime7 = Calendar.getInstance();
                currentHour7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinute7 = currentTime7.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton66() {
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
                people2_66 = true;isTimerRunning66 = true;
                startTime66r();
                dialog.dismiss();

                Calendar currentTime66 = Calendar.getInstance();
                currentHour66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinute66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_66 = false;isTimerRunning66 = true;
                startTime66r();
                dialog.dismiss();
                flashing66 = true;

                Calendar currentTime66 = Calendar.getInstance();
                currentHour66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinute66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }




    private void startTime1r() {
        startTime1 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread1, 0);
    }
    private void startTime2r() {
        startTime2 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread2, 0);
    }

    private void startTime3r() {
        startTime3 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread3, 0);
    }

    private void startTime4r() {
        startTime4 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread4, 0);
    }
    private void startTime5r() {
        startTime5 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread5, 0);
    }

    private void startTime7r() {
        startTime7 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread7, 0);
    }
    private void startTime66r() {
        startTime66 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread66, 0);
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
    private void resetThresholdsToOriginal2() {
        yellowThreshold2 = originalyellowThreshold2;
        redThreshold2 = originalredThreshold2;
        blueThreshold2 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal3() {
        yellowThreshold3 = originalyellowThreshold2;
        redThreshold3 = originalredThreshold2;
        blueThreshold3 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal4() {
        yellowThreshold4 = originalyellowThreshold2;
        redThreshold4 = originalredThreshold2;
        blueThreshold4 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal5() {
        yellowThreshold5 = originalyellowThreshold2;
        redThreshold5 = originalredThreshold2;
        blueThreshold5 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal7() {
        yellowThreshold7 = originalyellowThreshold2;
        redThreshold7 = originalredThreshold2;
        blueThreshold7 = originalblueThreshold2;
    }
    private void resetThresholdsToOriginal66() {
        yellowThreshold66 = originalyellowThreshold2;
        redThreshold66 = originalredThreshold2;
        blueThreshold66 = originalblueThreshold2;
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




    private Runnable updateTimerThread2 = new Runnable() {
        public void run() {
            timeInMilliseconds2 = SystemClock.uptimeMillis() - startTime2;
            updatedTime2 = timeInMilliseconds2;
            seconds2 = (int) (updatedTime2 / 1000);
            minutes2 = seconds2 / 60;
            hours2 = minutes2 / 60;
            seconds2 = seconds2 % 60;
            minutes2 = minutes2 % 60;
            sec2 = hours2 * 3600 + minutes2 * 60 + seconds2;

            // 计算当前时间加上 redThreshold2 后的时间（秒数）
            int totalSeconds = currentHour2 * 60 * 60 + currentMinute2 * 60 + redThreshold2;
            // 计算小时和分钟
            futureHour2 = totalSeconds / 3600;
            futureMinute2 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour2 >= 24) {
                futureHour2 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour2, currentMinute2);
            String futureTimeString = String.format("%02d:%02d", futureHour2, futureMinute2);

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
                btnTimer2.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer2.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread3 = new Runnable() {
        public void run() {
            timeInMilliseconds3 = SystemClock.uptimeMillis() - startTime3;
            updatedTime3 = timeInMilliseconds3;
            seconds3 = (int) (updatedTime3 / 1000);
            minutes3 = seconds3 / 60;
            hours3 = minutes3 / 60;
            seconds3 = seconds3 % 60;
            minutes3 = minutes3 % 60;
            sec3 = hours3 * 3600 + minutes3 * 60 + seconds3;

// 计算当前时间加上 redThreshold3 后的时间（秒数）
            int totalSeconds = currentHour3 * 60 * 60 + currentMinute3 * 60 + redThreshold3;
            // 计算小时和分钟
            futureHour3 = totalSeconds / 3600;
            futureMinute3 = (totalSeconds % 3600) / 60;
            // 处理超过34小时的进位
            if (futureHour3 >= 24) {
                futureHour3 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour3, currentMinute3);
            String futureTimeString = String.format("%02d:%02d", futureHour3, futureMinute3);

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
                btnTimer3.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer3.setText(Html.fromHtml(displayText));
            }

            updateButtonColor3();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread4 = new Runnable() {
        public void run() {
            timeInMilliseconds4 = SystemClock.uptimeMillis() - startTime4;
            updatedTime4 = timeInMilliseconds4;
            seconds4 = (int) (updatedTime4 / 1000);
            minutes4 = seconds4 / 60;
            hours4 = minutes4 / 60;
            seconds4 = seconds4 % 60;
            minutes4 = minutes4 % 60;
            sec4 =hours4 * 3600 + minutes4 * 60 + seconds4;


            // 计算当前时间加上 redThreshold4 后的时间（秒数）
            int totalSeconds = currentHour4 * 60 * 60 + currentMinute4 * 60 + redThreshold4;
            // 计算小时和分钟
            futureHour4 = totalSeconds / 3600;
            futureMinute4 = (totalSeconds % 3600) / 60;
            // 处理超过44小时的进位
            if (futureHour4 >= 24) {
                futureHour4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour4, currentMinute4);
            String futureTimeString = String.format("%02d:%02d", futureHour4, futureMinute4);

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
                btnTimer4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer4.setText(Html.fromHtml(displayText));
            }

            updateButtonColor4();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread5 = new Runnable() {
        public void run() {
            timeInMilliseconds5 = SystemClock.uptimeMillis() - startTime5;
            updatedTime5 = timeInMilliseconds5;
            seconds5 = (int) (updatedTime5 / 1000);
            minutes5 = seconds5 / 60;
            hours5 = minutes5 / 60;
            seconds5 = seconds5 % 60;
            minutes5 = minutes5 % 60;
            sec5 =hours5 * 3600 + minutes5 * 60 + seconds5;



            // 计算当前时间加上 redThreshold5 后的时间（秒数）
            int totalSeconds = currentHour5 * 60 * 60 + currentMinute5 * 60 + redThreshold5;
            // 计算小时和分钟
            futureHour5 = totalSeconds / 3600;
            futureMinute5 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour5 >= 24) {
                futureHour5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour5, currentMinute5);
            String futureTimeString = String.format("%02d:%02d", futureHour5, futureMinute5);

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
                btnTimer5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer5.setText(Html.fromHtml(displayText));
            }

            updateButtonColor5();
            handler1.postDelayed(this, 1000);
        }
    };



    private Runnable updateTimerThread7 = new Runnable() {
        public void run() {
            timeInMilliseconds7 = SystemClock.uptimeMillis() - startTime7;
            updatedTime7 = timeInMilliseconds7;
            seconds7 = (int) (updatedTime7 / 1000);
            minutes7 = seconds7 / 60;
            hours7 = minutes7 / 60;
            seconds7 = seconds7 % 60;
            minutes7 = minutes7 % 60;
            sec7 =hours7 * 3600 + minutes7 * 60 + seconds7;



            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour7 * 60 * 60 + currentMinute7 * 60 + redThreshold7;
            // 计算小时和分钟
            futureHour7 = totalSeconds / 3600;
            futureMinute7 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour7 >= 24) {
                futureHour7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour7, currentMinute7);
            String futureTimeString = String.format("%02d:%02d", futureHour7, futureMinute7);

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
                btnTimer7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer7.setText(Html.fromHtml(displayText));
            }

            updateButtonColor7();
            handler1.postDelayed(this, 1000);
        }
    };


    private Runnable updateTimerThread66 = new Runnable() {
        public void run() {
            timeInMilliseconds66 = SystemClock.uptimeMillis() - startTime66;
            updatedTime66 = timeInMilliseconds66;
            seconds66 = (int) (updatedTime66 / 1000);
            minutes66 = seconds66 / 60;
            hours66 = minutes66 / 60;
            seconds66 = seconds66 % 60;
            minutes66 = minutes66 % 60;
            sec66 =hours66 * 3600 + minutes66 * 60 + seconds66;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour66 * 60 * 60 + currentMinute66 * 60 + redThreshold66;
            // 计算小时和分钟
            futureHour66 = totalSeconds / 3600;
            futureMinute66 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour66 >= 24) {
                futureHour66 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour66, currentMinute66);
            String futureTimeString = String.format("%02d:%02d", futureHour66, futureMinute66);

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
                btnTimer66.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer66.setText(Html.fromHtml(displayText));
            }

            updateButtonColor66();
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

        dialogTitle.setText("1號加時");

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
    private void showTimeDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime2(time1);

                    if (sec2 >= blueThreshold2) {
                        flashing2 = true;
                        updateButtonColor2();
                    }

                    if (flashingg2) {
                        flashingg2 = false;
                        updateButtonColor2();
                    }
                    break;
                case "60分鐘":
                    addTime2(time2);
                    if (sec2 >= blueThreshold2) {
                        flashing2 = true;
                        updateButtonColor2();
                    }

                    if (flashingg2) {
                        flashingg2 = false;
                        updateButtonColor2();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("5號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime3(time1); // Customize the time for button 3


                    if (sec3 >= blueThreshold3) {
                        flashing3 = true;
                        updateButtonColor3();
                    }

                    if (flashingg3) {
                        flashingg3 = false;
                        updateButtonColor3();
                    }

                    break;
                case "60分鐘":
                    addTime3(time2); // Customize the time for button 3

                    if (sec3 >= blueThreshold3) {
                        flashing3 = true;
                        updateButtonColor3();
                    }
                    if (flashingg3) {
                        flashingg3 = false;
                        updateButtonColor3();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("7號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime4(time1); // Customize the time for button 4


                    if (sec4 >= blueThreshold4) {
                        flashing4 = true;
                        updateButtonColor4();
                    }
                    if (flashingg4) {
                        flashingg4 = false;
                        updateButtonColor4();
                    }
                    break;
                case "60分鐘":
                    addTime4(time2); // Customize the time for button 4


                    if (sec4 >= blueThreshold4) {
                        flashing4 = true;
                        updateButtonColor4();
                    }
                    if (flashingg4) {
                        flashingg4 = false;
                        updateButtonColor4();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("8號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime5(time1); // Customize the time for button 5



                    if (sec5 >= blueThreshold5) {
                        flashing5 = true;
                        updateButtonColor5();
                    }
                    if (flashingg5) {
                        flashingg5 = false;
                        updateButtonColor5();
                    }
                    break;
                case "60分鐘":
                    addTime5(time2); // Customize the time for button 5

                    if (sec5 >= blueThreshold5) {
                        flashing5 = true;
                        updateButtonColor5();
                    }
                    if (flashingg5) {
                        flashingg5 = false;
                        updateButtonColor5();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }



    private void showTimeDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("10號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime7(time1); // Customize the time for button 7



                    if (sec7 >= blueThreshold7) {
                        flashing7 = true;
                        updateButtonColor7();
                    }
                    if (flashingg7) {
                        flashingg7 = false;
                        updateButtonColor7();
                    }
                    break;
                case "60分鐘":
                    addTime7(time2); // Customize the time for button 7

                    if (sec7 >= blueThreshold7) {
                        flashing7 = true;
                        updateButtonColor7();
                    }
                    if (flashingg7) {
                        flashingg7 = false;
                        updateButtonColor7();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }


    private void showTimeDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("9號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        PrivateRoom.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime66(time1); // Customize the time for button 66

                    if (sec66 >= blueThreshold66) {
                        flashing66 = true;
                        updateButtonColor66();
                    }

                    if (flashingg66) {
                        flashingg66 = false;
                        updateButtonColor66();
                    }
                    break;
                case "60分鐘":
                    addTime66(time2); // Customize the time for button 66

                    if (sec66 >= blueThreshold66) {
                        flashing66 = true;
                        updateButtonColor66();
                    }
                    if (flashingg66) {
                        flashingg66 = false;
                        updateButtonColor66();
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
    private void addTime2(int secondsToAdd) {
        //blueThreshold2 += secondsToAdd;
        yellowThreshold2 += secondsToAdd;
        redThreshold2 += secondsToAdd;

        updateButtonColor2();
    }

    private void addTime3(int secondsToAdd) {
        //blueThreshold3 += secondsToAdd; // Customize for button 3
        yellowThreshold3 += secondsToAdd; // Customize for button 3
        redThreshold3 += secondsToAdd; // Customize for button 3

        updateButtonColor3();
    }

    private void addTime4(int secondsToAdd) {
        //blueThreshold4 += secondsToAdd; // Customize for button 4
        yellowThreshold4 += secondsToAdd; // Customize for button 4
        redThreshold4 += secondsToAdd; // Customize for button 4

        updateButtonColor4();
    }
    private void addTime5(int secondsToAdd) {
        //blueThreshold5 += secondsToAdd; // Customize for button 5
        yellowThreshold5 += secondsToAdd; // Customize for button 5
        redThreshold5 += secondsToAdd; // Customize for button 5

        updateButtonColor5();
    }

    private void addTime7(int secondsToAdd) {
        //blueThreshold7 += secondsToAdd; // Customize for button 7
        yellowThreshold7 += secondsToAdd; // Customize for button 7
        redThreshold7 += secondsToAdd; // Customize for button 7

        updateButtonColor7();
    }


    private void addTime66(int secondsToAdd) {
        //blueThreshold66 += secondsToAdd; // Customize for button 66
        yellowThreshold66 += secondsToAdd; // Customize for button 66
        redThreshold66 += secondsToAdd; // Customize for button 66


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor66();
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
    private void updateButtonColor2() {
        if (sec2 < 0.01) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec2 < blueThreshold2 && people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec2 < blueThreshold2 && !people2_2 ) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec2 < yellowThreshold2 && people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer2.startAnimation(blinkAnimation);
            }else{
                btnTimer2.clearAnimation();
            }
        } else if (sec2 < yellowThreshold2 && !people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec2 < redThreshold2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashingg2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer2.startAnimation(blinkAnimation);
            }else{
                btnTimer2.clearAnimation();
            }
        } else {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer2.clearAnimation();
        }
    }

    private void updateButtonColor3() {
        if (sec3 < 0.01) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec3 < blueThreshold3 && people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec3 < blueThreshold3 && !people2_3 ) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec3 < yellowThreshold3 && people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer3.startAnimation(blinkAnimation);
            }else{
                btnTimer3.clearAnimation();
            }


        } else if (sec3 < yellowThreshold3 && !people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec3 < redThreshold3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer3.startAnimation(blinkAnimation);
            }else{
                btnTimer3.clearAnimation();
            }


        } else {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer3.clearAnimation();
        }
    }

    private void updateButtonColor4() {
        if (sec4 < 0.01) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec4 < blueThreshold4 && people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec4 < blueThreshold4 && !people2_4 ) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec4 < yellowThreshold4 && people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer4.startAnimation(blinkAnimation);
            }else{
                btnTimer4.clearAnimation();
            }


        } else if (sec4 < yellowThreshold4 && !people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec4 < redThreshold4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer4.startAnimation(blinkAnimation);
            }else{
                btnTimer4.clearAnimation();
            }


        } else {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer4.clearAnimation();
        }
    }
    private void updateButtonColor5() {
        if (sec5 < 0.01) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec5 < blueThreshold5 && people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec5 < blueThreshold5 && !people2_5 ) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec5 < yellowThreshold5 && people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer5.startAnimation(blinkAnimation);
            }else{
                btnTimer5.clearAnimation();
            }


        } else if (sec5 < yellowThreshold5 && !people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec5 < redThreshold5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer5.startAnimation(blinkAnimation);
            }else{
                btnTimer5.clearAnimation();
            }


        } else {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer5.clearAnimation();
        }
    }



    private void updateButtonColor7() {
        if (sec7 < 0.01) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec7 < blueThreshold7 && people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec7 < blueThreshold7 && !people2_7 ) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec7 < yellowThreshold7 && people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer7.startAnimation(blinkAnimation);
            }else{
                btnTimer7.clearAnimation();
            }


        } else if (sec7 < yellowThreshold7 && !people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec7 < redThreshold7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer7.startAnimation(blinkAnimation);
            }else{
                btnTimer7.clearAnimation();
            }


        } else {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer7.clearAnimation();
        }
    }


    private void updateButtonColor66() {
        if (sec66 < 0.01) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec66 < blueThreshold66 && people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec66 < blueThreshold66 && !people2_66 ) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec66 < yellowThreshold66 && people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer66.startAnimation(blinkAnimation);
            }else{
                btnTimer66.clearAnimation();
            }


        } else if (sec66 < yellowThreshold66 && !people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec66 < redThreshold66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer66.startAnimation(blinkAnimation);
            }else{
                btnTimer66.clearAnimation();
            }


        } else {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer66.clearAnimation();
        }
    }



}*/