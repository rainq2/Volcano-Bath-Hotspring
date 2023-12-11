package com.example.hotspringtest2;

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

public class SP extends AppCompatActivity {

    private int ssss = 100;
    private int delay = 1000;
    private int Blue = 12 * ssss;
    private int Yellow = 30 * ssss;
    private int Red = 36 * ssss;
    private int Time1 = 18 * ssss;
    private int Time2 = 36 * ssss;
    //-------------------------------
    public boolean peopleSH_101;
    private SharedPreferences sharedPreferencesSH101;
    private SharedPreferences.Editor editorSH101;
    private static final String TIMER_STARTED_KEY_SH101 = "timer_startedSH101";
    private static final String START_TIME_KEY_SH101 = "start_timeSH101";
    private static final String ELAPSED_TIME_KEY_SH101 = "elapsed_timeSH101";

    public boolean peopleSH_102;
    private SharedPreferences sharedPreferencesSH102;
    private SharedPreferences.Editor editorSH102;
    private static final String TIMER_STARTED_KEY_SH102 = "timer_startedSH102";
    private static final String START_TIME_KEY_SH102 = "start_timeSH102";
    private static final String ELAPSED_TIME_KEY_SH102 = "elapsed_timeSH102";

    public boolean peopleSH_103;
    private SharedPreferences sharedPreferencesSH103;
    private SharedPreferences.Editor editorSH103;
    private static final String TIMER_STARTED_KEY_SH103 = "timer_startedSH103";
    private static final String START_TIME_KEY_SH103 = "start_timeSH103";
    private static final String ELAPSED_TIME_KEY_SH103 = "elapsed_timeSH103";

    public boolean peopleSH_104;
    private SharedPreferences sharedPreferencesSH104;
    private SharedPreferences.Editor editorSH104;
    private static final String TIMER_STARTED_KEY_SH104 = "timer_startedSH104";
    private static final String START_TIME_KEY_SH104 = "start_timeSH104";
    private static final String ELAPSED_TIME_KEY_SH104 = "elapsed_timeSH104";

    public boolean peopleSH_105;
    private SharedPreferences sharedPreferencesSH105;
    private SharedPreferences.Editor editorSH105;
    private static final String TIMER_STARTED_KEY_SH105 = "timer_startedSH105";
    private static final String START_TIME_KEY_SH105 = "start_timeSH105";
    private static final String ELAPSED_TIME_KEY_SH105 = "elapsed_timeSH105";

    public boolean peopleSH_106;
    private SharedPreferences sharedPreferencesSH106;
    private SharedPreferences.Editor editorSH106;
    private static final String TIMER_STARTED_KEY_SH106 = "timer_startedSH106";
    private static final String START_TIME_KEY_SH106 = "start_timeSH106";
    private static final String ELAPSED_TIME_KEY_SH106 = "elapsed_timeSH106";

    public boolean peopleSH_107;
    private SharedPreferences sharedPreferencesSH107;
    private SharedPreferences.Editor editorSH107;
    private static final String TIMER_STARTED_KEY_SH107 = "timer_startedSH107";
    private static final String START_TIME_KEY_SH107 = "start_timeSH107";
    private static final String ELAPSED_TIME_KEY_SH107 = "elapsed_timeSH107";

    public boolean peopleSH_8;
    private SharedPreferences sharedPreferencesSH8;
    private SharedPreferences.Editor editorSH8;
    private static final String TIMER_STARTED_KEY_SH8 = "timer_startedSH8";
    private static final String START_TIME_KEY_SH8 = "start_timeSH8";
    private static final String ELAPSED_TIME_KEY_SH8 = "elapsed_timeSH8";

    public boolean peopleSH_9;
    private SharedPreferences sharedPreferencesSH9;
    private SharedPreferences.Editor editorSH9;
    private static final String TIMER_STARTED_KEY_SH9 = "timer_startedSH9";
    private static final String START_TIME_KEY_SH9 = "start_timeSH9";
    private static final String ELAPSED_TIME_KEY_SH9 = "elapsed_timeSH9";

    public boolean peopleSH_10;
    private SharedPreferences sharedPreferencesSH10;
    private SharedPreferences.Editor editorSH10;
    private static final String TIMER_STARTED_KEY_SH10 = "timer_startedSH10";
    private static final String START_TIME_KEY_SH10 = "start_timeSH10";
    private static final String ELAPSED_TIME_KEY_SH10 = "elapsed_timeSH10";

    public boolean peopleSH_11;
    private SharedPreferences sharedPreferencesSH11;
    private SharedPreferences.Editor editorSH11;
    private static final String TIMER_STARTED_KEY_SH11 = "timer_startedSH11";
    private static final String START_TIME_KEY_SH11 = "start_timeSH11";
    private static final String ELAPSED_TIME_KEY_SH11 = "elapsed_timeSH11";

    public boolean peopleSH_12;
    private SharedPreferences sharedPreferencesSH12;
    private SharedPreferences.Editor editorSH12;
    private static final String TIMER_STARTED_KEY_SH12 = "timer_startedSH12";
    private static final String START_TIME_KEY_SH12 = "start_timeSH12";
    private static final String ELAPSED_TIME_KEY_SH12 = "elapsed_timeSH12";

    public boolean peopleSH_13;
    private SharedPreferences sharedPreferencesSH13;
    private SharedPreferences.Editor editorSH13;
    private static final String TIMER_STARTED_KEY_SH13 = "timer_startedSH13";
    private static final String START_TIME_KEY_SH13 = "start_timeSH13";
    private static final String ELAPSED_TIME_KEY_SH13 = "elapsed_timeSH13";

    public boolean peopleSH_14;
    private SharedPreferences sharedPreferencesSH14;
    private SharedPreferences.Editor editorSH14;
    private static final String TIMER_STARTED_KEY_SH14 = "timer_startedSH14";
    private static final String START_TIME_KEY_SH14 = "start_timeSH14";
    private static final String ELAPSED_TIME_KEY_SH14 = "elapsed_timeSH14";

    public boolean peopleSH_15;
    private SharedPreferences sharedPreferencesSH15;
    private SharedPreferences.Editor editorSH15;
    private static final String TIMER_STARTED_KEY_SH15 = "timer_startedSH15";
    private static final String START_TIME_KEY_SH15 = "start_timeSH15";
    private static final String ELAPSED_TIME_KEY_SH15 = "elapsed_timeSH15";

    public boolean peopleSH_16;
    private SharedPreferences sharedPreferencesSH16;
    private SharedPreferences.Editor editorSH16;
    private static final String TIMER_STARTED_KEY_SH16 = "timer_startedSH16";
    private static final String START_TIME_KEY_SH16 = "start_timeSH16";
    private static final String ELAPSED_TIME_KEY_SH16 = "elapsed_timeSH16";

    public boolean peopleSH_17;
    private SharedPreferences sharedPreferencesSH17;
    private SharedPreferences.Editor editorSH17;
    private static final String TIMER_STARTED_KEY_SH17 = "timer_startedSH17";
    private static final String START_TIME_KEY_SH17 = "start_timeSH17";
    private static final String ELAPSED_TIME_KEY_SH17 = "elapsed_timeSH17";

    public boolean peopleSH_18;
    private SharedPreferences sharedPreferencesSH18;
    private SharedPreferences.Editor editorSH18;
    private static final String TIMER_STARTED_KEY_SH18 = "timer_startedSH18";
    private static final String START_TIME_KEY_SH18 = "start_timeSH18";
    private static final String ELAPSED_TIME_KEY_SH18 = "elapsed_timeSH18";

    public boolean peopleSH_19;
    private SharedPreferences sharedPreferencesSH19;
    private SharedPreferences.Editor editorSH19;
    private static final String TIMER_STARTED_KEY_SH19 = "timer_startedSH19";
    private static final String START_TIME_KEY_SH19 = "start_timeSH19";
    private static final String ELAPSED_TIME_KEY_SH19 = "elapsed_timeSH19";

    public boolean peopleSH_20;
    private SharedPreferences sharedPreferencesSH20;
    private SharedPreferences.Editor editorSH20;
    private static final String TIMER_STARTED_KEY_SH20 = "timer_startedSH20";
    private static final String START_TIME_KEY_SH20 = "start_timeSH20";
    private static final String ELAPSED_TIME_KEY_SH20 = "elapsed_timeSH20";

    public boolean peopleSH_21;
    private SharedPreferences sharedPreferencesSH21;
    private SharedPreferences.Editor editorSH21;
    private static final String TIMER_STARTED_KEY_SH21 = "timer_startedSH21";
    private static final String START_TIME_KEY_SH21 = "start_timeSH21";
    private static final String ELAPSED_TIME_KEY_SH21 = "elapsed_timeSH21";

    public boolean peopleSH_22;
    private SharedPreferences sharedPreferencesSH22;
    private SharedPreferences.Editor editorSH22;
    private static final String TIMER_STARTED_KEY_SH22 = "timer_startedSH22";
    private static final String START_TIME_KEY_SH22 = "start_timeSH22";
    private static final String ELAPSED_TIME_KEY_SH22 = "elapsed_timeSH22";

    public boolean peopleSH_23;
    private SharedPreferences sharedPreferencesSH23;
    private SharedPreferences.Editor editorSH23;
    private static final String TIMER_STARTED_KEY_SH23 = "timer_startedSH23";
    private static final String START_TIME_KEY_SH23 = "start_timeSH23";
    private static final String ELAPSED_TIME_KEY_SH23 = "elapsed_timeSH23";

    public boolean peopleSH_24;
    private SharedPreferences sharedPreferencesSH24;
    private SharedPreferences.Editor editorSH24;
    private static final String TIMER_STARTED_KEY_SH24 = "timer_startedSH24";
    private static final String START_TIME_KEY_SH24 = "start_timeSH24";
    private static final String ELAPSED_TIME_KEY_SH24 = "elapsed_timeSH24";

    public boolean peopleSH_25;
    private SharedPreferences sharedPreferencesSH25;
    private SharedPreferences.Editor editorSH25;
    private static final String TIMER_STARTED_KEY_SH25 = "timer_startedSH25";
    private static final String START_TIME_KEY_SH25 = "start_timeSH25";
    private static final String ELAPSED_TIME_KEY_SH25 = "elapsed_timeSH25";

    public boolean peopleSH_26;
    private SharedPreferences sharedPreferencesSH26;
    private SharedPreferences.Editor editorSH26;
    private static final String TIMER_STARTED_KEY_SH26 = "timer_startedSH26";
    private static final String START_TIME_KEY_SH26 = "start_timeSH26";
    private static final String ELAPSED_TIME_KEY_SH26 = "elapsed_timeSH26";

    public boolean peopleSH_27;
    private SharedPreferences sharedPreferencesSH27;
    private SharedPreferences.Editor editorSH27;
    private static final String TIMER_STARTED_KEY_SH27 = "timer_startedSH27";
    private static final String START_TIME_KEY_SH27 = "start_timeSH27";
    private static final String ELAPSED_TIME_KEY_SH27 = "elapsed_timeSH27";

    public boolean peopleSH_28;
    private SharedPreferences sharedPreferencesSH28;
    private SharedPreferences.Editor editorSH28;
    private static final String TIMER_STARTED_KEY_SH28 = "timer_startedSH28";
    private static final String START_TIME_KEY_SH28 = "start_timeSH28";
    private static final String ELAPSED_TIME_KEY_SH28 = "elapsed_timeSH28";

    public boolean peopleSH_29;
    private SharedPreferences sharedPreferencesSH29;
    private SharedPreferences.Editor editorSH29;
    private static final String TIMER_STARTED_KEY_SH29 = "timer_startedSH29";
    private static final String START_TIME_KEY_SH29 = "start_timeSH29";
    private static final String ELAPSED_TIME_KEY_SH29 = "elapsed_timeSH29";

    public boolean peopleSH_30;
    private SharedPreferences sharedPreferencesSH30;
    private SharedPreferences.Editor editorSH30;
    private static final String TIMER_STARTED_KEY_SH30 = "timer_startedSH30";
    private static final String START_TIME_KEY_SH30 = "start_timeSH30";
    private static final String ELAPSED_TIME_KEY_SH30 = "elapsed_timeSH30";

    public boolean peopleSH_31;
    private SharedPreferences sharedPreferencesSH31;
    private SharedPreferences.Editor editorSH31;
    private static final String TIMER_STARTED_KEY_SH31 = "timer_startedSH31";
    private static final String START_TIME_KEY_SH31 = "start_timeSH31";
    private static final String ELAPSED_TIME_KEY_SH31 = "elapsed_timeSH31";

    public boolean peopleSH_32;
    private SharedPreferences sharedPreferencesSH32;
    private SharedPreferences.Editor editorSH32;
    private static final String TIMER_STARTED_KEY_SH32 = "timer_startedSH32";
    private static final String START_TIME_KEY_SH32 = "start_timeSH32";
    private static final String ELAPSED_TIME_KEY_SH32 = "elapsed_timeSH32";

    public boolean peopleSH_33;
    private SharedPreferences sharedPreferencesSH33;
    private SharedPreferences.Editor editorSH33;
    private static final String TIMER_STARTED_KEY_SH33 = "timer_startedSH33";
    private static final String START_TIME_KEY_SH33 = "start_timeSH33";
    private static final String ELAPSED_TIME_KEY_SH33 = "elapsed_timeSH33";

    private int sss = 100;
    private int b2 = 12*sss;
    private int y2 = 66*sss;
    private int r2 = 72*sss;

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

    //----------------------------------------------------------------------------
    private Handler handlerSH = new Handler();
    private int originalblueThresholdSH2 = Blue;
    private int originalyellowThresholdSH2 = Yellow;
    private int originalredThresholdSH2 = Red;

    private Handler handler1 = new Handler();
    private int originalblueThreshold2 = b2;
    private int originalyellowThreshold2 = y2;
    private int originalredThreshold2 = r2;
    
    
    //----------------------------------------------------------------------------
    private long startTimeSH101 = 0L;
    private long timeInMillisecondsSH101 = 0L;
    private long updatedTimeSH101 = 0L;
    private int secondsSH101 = 0;
    private int secSH101 = 0;
    private int minutesSH101 = 0;
    private int hoursSH101 = 0;
    private Button btnTimerSH101;
    private int blueThreshold101 = Blue;
    private int yellowThreshold101 = Yellow;
    private int redThreshold101 = Red;
    private boolean isTimerRunningSH101 = false;

    private long startTimeSH102 = 0L;
    private long timeInMillisecondsSH102 = 0L;
    private long updatedTimeSH102 = 0L;
    private int secondsSH102 = 0;
    private int secSH102 = 0;
    private int minutesSH102 = 0;
    private int hoursSH102 = 0;
    private Button btnTimerSH102;
    private int blueThreshold102 = Blue;
    private int yellowThreshold102 = Yellow;
    private int redThreshold102 = Red;
    private boolean isTimerRunningSH102 = false;

    private long startTimeSH103 = 0L;
    private long timeInMillisecondsSH103 = 0L;
    private long updatedTimeSH103 = 0L;
    private int secondsSH103 = 0;
    private int secSH103 = 0;
    private int minutesSH103 = 0;
    private int hoursSH103 = 0;
    private Button btnTimerSH103;
    private int blueThreshold103 = Blue;
    private int yellowThreshold103 = Yellow;
    private int redThreshold103 = Red;
    private boolean isTimerRunningSH103 = false;

    private long startTimeSH104 = 0L;
    private long timeInMillisecondsSH104 = 0L;
    private long updatedTimeSH104 = 0L;
    private int secondsSH104 = 0;
    private int secSH104 = 0;
    private int minutesSH104 = 0;
    private int hoursSH104 = 0;
    private Button btnTimerSH104;
    private int blueThreshold104 = Blue;
    private int yellowThreshold104 = Yellow;
    private int redThreshold104 = Red;
    private boolean isTimerRunningSH104 = false;

    private long startTimeSH105 = 0L;
    private long timeInMillisecondsSH105 = 0L;
    private long updatedTimeSH105 = 0L;
    private int secondsSH105 = 0;
    private int secSH105 = 0;
    private int minutesSH105 = 0;
    private int hoursSH105 = 0;
    private Button btnTimerSH105;
    private int blueThreshold105 = Blue;
    private int yellowThreshold105 = Yellow;
    private int redThreshold105 = Red;
    private boolean isTimerRunningSH105 = false;

    private long startTimeSH106 = 0L;
    private long timeInMillisecondsSH106 = 0L;
    private long updatedTimeSH106 = 0L;
    private int secondsSH106 = 0;
    private int secSH106 = 0;
    private int minutesSH106 = 0;
    private int hoursSH106 = 0;
    private Button btnTimerSH106;
    private int blueThreshold106 = Blue;
    private int yellowThreshold106 = Yellow;
    private int redThreshold106 = Red;
    private boolean isTimerRunningSH106 = false;

    private long startTimeSH107 = 0L;
    private long timeInMillisecondsSH107 = 0L;
    private long updatedTimeSH107 = 0L;
    private int secondsSH107 = 0;
    private int secSH107 = 0;
    private int minutesSH107 = 0;
    private int hoursSH107 = 0;
    private Button btnTimerSH107;
    private int blueThreshold107 = Blue;
    private int yellowThreshold107 = Yellow;
    private int redThreshold107 = Red;
    private boolean isTimerRunningSH107 = false;

    private long startTimeSH8 = 0L;
    private long timeInMillisecondsSH8 = 0L;
    private long updatedTimeSH8 = 0L;
    private int secondsSH8 = 0;
    private int secSH8 = 0;
    private int minutesSH8 = 0;
    private int hoursSH8 = 0;
    private Button btnTimerSH8;
    private int blueThreshold8 = Blue;
    private int yellowThreshold8 = Yellow;
    private int redThreshold8 = Red;
    private boolean isTimerRunningSH8 = false;

    private long startTimeSH9 = 0L;
    private long timeInMillisecondsSH9 = 0L;
    private long updatedTimeSH9 = 0L;
    private int secondsSH9 = 0;
    private int secSH9 = 0;
    private int minutesSH9 = 0;
    private int hoursSH9 = 0;
    private Button btnTimerSH9;
    private int blueThreshold9 = Blue;
    private int yellowThreshold9 = Yellow;
    private int redThreshold9 = Red;
    private boolean isTimerRunningSH9 = false;

    private long startTimeSH10 = 0L;
    private long timeInMillisecondsSH10 = 0L;
    private long updatedTimeSH10 = 0L;
    private int secondsSH10 = 0;
    private int secSH10 = 0;
    private int minutesSH10 = 0;
    private int hoursSH10 = 0;
    private Button btnTimerSH10;
    private int blueThreshold10 = Blue;
    private int yellowThreshold10 = Yellow;
    private int redThreshold10 = Red;
    private boolean isTimerRunningSH10 = false;

    private long startTimeSH11 = 0L;
    private long timeInMillisecondsSH11 = 0L;
    private long updatedTimeSH11 = 0L;
    private int secondsSH11 = 0;
    private int secSH11 = 0;
    private int minutesSH11 = 0;
    private int hoursSH11 = 0;
    private Button btnTimerSH11;
    private int blueThreshold11 = Blue;
    private int yellowThreshold11 = Yellow;
    private int redThreshold11 = Red;
    private boolean isTimerRunningSH11 = false;

    private long startTimeSH12 = 0L;
    private long timeInMillisecondsSH12 = 0L;
    private long updatedTimeSH12 = 0L;
    private int secondsSH12 = 0;
    private int secSH12 = 0;
    private int minutesSH12 = 0;
    private int hoursSH12 = 0;
    private Button btnTimerSH12;
    private int blueThreshold12 = Blue;
    private int yellowThreshold12 = Yellow;
    private int redThreshold12 = Red;
    private boolean isTimerRunningSH12 = false;

    private long startTimeSH13 = 0L;
    private long timeInMillisecondsSH13 = 0L;
    private long updatedTimeSH13 = 0L;
    private int secondsSH13 = 0;
    private int secSH13 = 0;
    private int minutesSH13 = 0;
    private int hoursSH13 = 0;
    private Button btnTimerSH13;
    private int blueThreshold13 = Blue;
    private int yellowThreshold13 = Yellow;
    private int redThreshold13 = Red;
    private boolean isTimerRunningSH13 = false;

    private long startTimeSH14 = 0L;
    private long timeInMillisecondsSH14 = 0L;
    private long updatedTimeSH14 = 0L;
    private int secondsSH14 = 0;
    private int secSH14 = 0;
    private int minutesSH14 = 0;
    private int hoursSH14 = 0;
    private Button btnTimerSH14;
    private int blueThreshold14 = Blue;
    private int yellowThreshold14 = Yellow;
    private int redThreshold14 = Red;
    private boolean isTimerRunningSH14 = false;

    private long startTimeSH15 = 0L;
    private long timeInMillisecondsSH15 = 0L;
    private long updatedTimeSH15 = 0L;
    private int secondsSH15 = 0;
    private int secSH15 = 0;
    private int minutesSH15 = 0;
    private int hoursSH15 = 0;
    private Button btnTimerSH15;
    private int blueThreshold15 = Blue;
    private int yellowThreshold15 = Yellow;
    private int redThreshold15 = Red;
    private boolean isTimerRunningSH15 = false;

    private long startTimeSH16 = 0L;
    private long timeInMillisecondsSH16 = 0L;
    private long updatedTimeSH16 = 0L;
    private int secondsSH16 = 0;
    private int secSH16 = 0;
    private int minutesSH16 = 0;
    private int hoursSH16 = 0;
    private Button btnTimerSH16;
    private int blueThreshold16 = Blue;
    private int yellowThreshold16 = Yellow;
    private int redThreshold16 = Red;
    private boolean isTimerRunningSH16 = false;

    private long startTimeSH17 = 0L;
    private long timeInMillisecondsSH17 = 0L;
    private long updatedTimeSH17 = 0L;
    private int secondsSH17 = 0;
    private int secSH17 = 0;
    private int minutesSH17 = 0;
    private int hoursSH17 = 0;
    private Button btnTimerSH17;
    private int blueThreshold17 = Blue;
    private int yellowThreshold17 = Yellow;
    private int redThreshold17 = Red;
    private boolean isTimerRunningSH17 = false;

    private long startTimeSH18 = 0L;
    private long timeInMillisecondsSH18 = 0L;
    private long updatedTimeSH18 = 0L;
    private int secondsSH18 = 0;
    private int secSH18 = 0;
    private int minutesSH18 = 0;
    private int hoursSH18 = 0;
    private Button btnTimerSH18;
    private int blueThreshold18 = Blue;
    private int yellowThreshold18 = Yellow;
    private int redThreshold18 = Red;
    private boolean isTimerRunningSH18 = false;

    private long startTimeSH19 = 0L;
    private long timeInMillisecondsSH19 = 0L;
    private long updatedTimeSH19 = 0L;
    private int secondsSH19 = 0;
    private int secSH19 = 0;
    private int minutesSH19 = 0;
    private int hoursSH19 = 0;
    private Button btnTimerSH19;
    private int blueThreshold19 = Blue;
    private int yellowThreshold19 = Yellow;
    private int redThreshold19 = Red;
    private boolean isTimerRunningSH19 = false;

    private long startTimeSH20 = 0L;
    private long timeInMillisecondsSH20 = 0L;
    private long updatedTimeSH20 = 0L;
    private int secondsSH20 = 0;
    private int secSH20 = 0;
    private int minutesSH20 = 0;
    private int hoursSH20 = 0;
    private Button btnTimerSH20;
    private int blueThreshold20 = Blue;
    private int yellowThreshold20 = Yellow;
    private int redThreshold20 = Red;
    private boolean isTimerRunningSH20 = false;

    private long startTimeSH21 = 0L;
    private long timeInMillisecondsSH21 = 0L;
    private long updatedTimeSH21 = 0L;
    private int secondsSH21 = 0;
    private int secSH21 = 0;
    private int minutesSH21 = 0;
    private int hoursSH21 = 0;
    private Button btnTimerSH21;
    private int blueThreshold21 = Blue;
    private int yellowThreshold21 = Yellow;
    private int redThreshold21 = Red;
    private boolean isTimerRunningSH21 = false;

    private long startTimeSH22 = 0L;
    private long timeInMillisecondsSH22 = 0L;
    private long updatedTimeSH22 = 0L;
    private int secondsSH22 = 0;
    private int secSH22 = 0;
    private int minutesSH22 = 0;
    private int hoursSH22 = 0;
    private Button btnTimerSH22;
    private int blueThreshold22 = Blue;
    private int yellowThreshold22 = Yellow;
    private int redThreshold22 = Red;
    private boolean isTimerRunningSH22 = false;

    private long startTimeSH23 = 0L;
    private long timeInMillisecondsSH23 = 0L;
    private long updatedTimeSH23 = 0L;
    private int secondsSH23 = 0;
    private int secSH23 = 0;
    private int minutesSH23 = 0;
    private int hoursSH23 = 0;
    private Button btnTimerSH23;
    private int blueThreshold23 = Blue;
    private int yellowThreshold23 = Yellow;
    private int redThreshold23 = Red;
    private boolean isTimerRunningSH23 = false;

    private long startTimeSH24 = 0L;
    private long timeInMillisecondsSH24 = 0L;
    private long updatedTimeSH24 = 0L;
    private int secondsSH24 = 0;
    private int secSH24 = 0;
    private int minutesSH24 = 0;
    private int hoursSH24 = 0;
    private Button btnTimerSH24;
    private int blueThreshold24 = Blue;
    private int yellowThreshold24 = Yellow;
    private int redThreshold24 = Red;
    private boolean isTimerRunningSH24 = false;

    private long startTimeSH25 = 0L;
    private long timeInMillisecondsSH25 = 0L;
    private long updatedTimeSH25 = 0L;
    private int secondsSH25 = 0;
    private int secSH25 = 0;
    private int minutesSH25 = 0;
    private int hoursSH25 = 0;
    private Button btnTimerSH25;
    private int blueThreshold25 = Blue;
    private int yellowThreshold25 = Yellow;
    private int redThreshold25 = Red;
    private boolean isTimerRunningSH25 = false;

    private long startTimeSH26 = 0L;
    private long timeInMillisecondsSH26 = 0L;
    private long updatedTimeSH26 = 0L;
    private int secondsSH26 = 0;
    private int secSH26 = 0;
    private int minutesSH26 = 0;
    private int hoursSH26 = 0;
    private Button btnTimerSH26;
    private int blueThreshold26 = Blue;
    private int yellowThreshold26 = Yellow;
    private int redThreshold26 = Red;
    private boolean isTimerRunningSH26 = false;

    private long startTimeSH27 = 0L;
    private long timeInMillisecondsSH27 = 0L;
    private long updatedTimeSH27 = 0L;
    private int secondsSH27 = 0;
    private int secSH27 = 0;
    private int minutesSH27 = 0;
    private int hoursSH27 = 0;
    private Button btnTimerSH27;
    private int blueThreshold27 = Blue;
    private int yellowThreshold27 = Yellow;
    private int redThreshold27 = Red;
    private boolean isTimerRunningSH27 = false;
    private long startTimeSH28 = 0L;
    private long timeInMillisecondsSH28 = 0L;
    private long updatedTimeSH28 = 0L;
    private int secondsSH28 = 0;
    private int secSH28 = 0;
    private int minutesSH28 = 0;
    private int hoursSH28 = 0;
    private Button btnTimerSH28;
    private int blueThreshold28 = Blue;
    private int yellowThreshold28 = Yellow;
    private int redThreshold28 = Red;
    private boolean isTimerRunningSH28 = false;

    private long startTimeSH29 = 0L;
    private long timeInMillisecondsSH29 = 0L;
    private long updatedTimeSH29 = 0L;
    private int secondsSH29 = 0;
    private int secSH29 = 0;
    private int minutesSH29 = 0;
    private int hoursSH29 = 0;
    private Button btnTimerSH29;
    private int blueThreshold29 = Blue;
    private int yellowThreshold29 = Yellow;
    private int redThreshold29 = Red;
    private boolean isTimerRunningSH29 = false;

    private long startTimeSH30 = 0L;
    private long timeInMillisecondsSH30 = 0L;
    private long updatedTimeSH30 = 0L;
    private int secondsSH30 = 0;
    private int secSH30 = 0;
    private int minutesSH30 = 0;
    private int hoursSH30 = 0;
    private Button btnTimerSH30;
    private int blueThreshold30 = Blue;
    private int yellowThreshold30 = Yellow;
    private int redThreshold30 = Red;
    private boolean isTimerRunningSH30 = false;

    private long startTimeSH31 = 0L;
    private long timeInMillisecondsSH31 = 0L;
    private long updatedTimeSH31 = 0L;
    private int secondsSH31 = 0;
    private int secSH31 = 0;
    private int minutesSH31 = 0;
    private int hoursSH31 = 0;
    private Button btnTimerSH31;
    private int blueThreshold31 = Blue;
    private int yellowThreshold31 = Yellow;
    private int redThreshold31 = Red;
    private boolean isTimerRunningSH31 = false;

    private long startTimeSH32 = 0L;
    private long timeInMillisecondsSH32 = 0L;
    private long updatedTimeSH32 = 0L;
    private int secondsSH32 = 0;
    private int secSH32 = 0;
    private int minutesSH32 = 0;
    private int hoursSH32 = 0;
    private Button btnTimerSH32;
    private int blueThreshold32 = Blue;
    private int yellowThreshold32 = Yellow;
    private int redThreshold32 = Red;
    private boolean isTimerRunningSH32 = false;

    private long startTimeSH33 = 0L;
    private long timeInMillisecondsSH33 = 0L;
    private long updatedTimeSH33 = 0L;
    private int secondsSH33 = 0;
    private int secSH33 = 0;
    private int minutesSH33 = 0;
    private int hoursSH33 = 0;
    private Button btnTimerSH33;
    private int blueThreshold33 = Blue;
    private int yellowThreshold33 = Yellow;
    private int redThreshold33 = Red;
    private boolean isTimerRunningSH33 = false;

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

    //------------------------------------------------------------
    private boolean flashingSH101;
    private boolean flashinggSH101;

    private boolean flashingSH102;
    private boolean flashinggSH102;

    private boolean flashingSH103;
    private boolean flashinggSH103;

    private boolean flashingSH104;
    private boolean flashinggSH104;

    private boolean flashingSH105;
    private boolean flashinggSH105;

    private boolean flashingSH106;
    private boolean flashinggSH106;

    private boolean flashingSH107;
    private boolean flashinggSH107;

    private boolean flashingSH8;
    private boolean flashinggSH8;

    private boolean flashingSH9;
    private boolean flashinggSH9;

    private boolean flashingSH10;
    private boolean flashinggSH10;

    private boolean flashingSH11;
    private boolean flashinggSH11;

    private boolean flashingSH12;
    private boolean flashinggSH12;

    private boolean flashingSH13;
    private boolean flashinggSH13;

    private boolean flashingSH14;
    private boolean flashinggSH14;

    private boolean flashingSH15;
    private boolean flashinggSH15;

    private boolean flashingSH16;
    private boolean flashinggSH16;

    private boolean flashingSH17;
    private boolean flashinggSH17;

    private boolean flashingSH18;
    private boolean flashinggSH18;

    private boolean flashingSH19;
    private boolean flashinggSH19;

    private boolean flashingSH20;
    private boolean flashinggSH20;

    private boolean flashingSH21;
    private boolean flashinggSH21;

    private boolean flashingSH22;
    private boolean flashinggSH22;

    private boolean flashingSH23;
    private boolean flashinggSH23;

    private boolean flashingSH24;
    private boolean flashinggSH24;

    private boolean flashingSH25;
    private boolean flashinggSH25;

    private boolean flashingSH26;
    private boolean flashinggSH26;

    private boolean flashingSH27;
    private boolean flashinggSH27;

    private boolean flashingSH28;
    private boolean flashinggSH28;

    private boolean flashingSH29;
    private boolean flashinggSH29;

    private boolean flashingSH30;
    private boolean flashinggSH30;

    private boolean flashingSH31;
    private boolean flashinggSH31;

    private boolean flashingSH32;
    private boolean flashinggSH32;

    private boolean flashingSH33;
    private boolean flashinggSH33;

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
    //------------------------------------------
    int currentHourSH101;
    int currentMinuteSH101;
    int futureHourSH101;
    int futureMinuteSH101;

    int currentHourSH102;
    int currentMinuteSH102;
    int futureHourSH102;
    int futureMinuteSH102;

    int currentHourSH103;
    int currentMinuteSH103;
    int futureHourSH103;
    int futureMinuteSH103;

    int currentHourSH104;
    int currentMinuteSH104;
    int futureHourSH104;
    int futureMinuteSH104;

    int currentHourSH105;
    int currentMinuteSH105;
    int futureHourSH105;
    int futureMinuteSH105;

    int currentHourSH106;
    int currentMinuteSH106;
    int futureHourSH106;
    int futureMinuteSH106;

    int currentHourSH107;
    int currentMinuteSH107;
    int futureHourSH107;
    int futureMinuteSH107;

    int currentHourSH8;
    int currentMinuteSH8;
    int futureHourSH8;
    int futureMinuteSH8;

    int currentHourSH9;
    int currentMinuteSH9;
    int futureHourSH9;
    int futureMinuteSH9;

    int currentHourSH10;
    int currentMinuteSH10;
    int futureHourSH10;
    int futureMinuteSH10;

    int currentHourSH11;
    int currentMinuteSH11;
    int futureHourSH11;
    int futureMinuteSH11;

    int currentHourSH12;
    int currentMinuteSH12;
    int futureHourSH12;
    int futureMinuteSH12;

    int currentHourSH13;
    int currentMinuteSH13;
    int futureHourSH13;
    int futureMinuteSH13;

    int currentHourSH14;
    int currentMinuteSH14;
    int futureHourSH14;
    int futureMinuteSH14;

    int currentHourSH15;
    int currentMinuteSH15;
    int futureHourSH15;
    int futureMinuteSH15;

    int currentHourSH16;
    int currentMinuteSH16;
    int futureHourSH16;
    int futureMinuteSH16;

    int currentHourSH17;
    int currentMinuteSH17;
    int futureHourSH17;
    int futureMinuteSH17;

    int currentHourSH18;
    int currentMinuteSH18;
    int futureHourSH18;
    int futureMinuteSH18;

    int currentHourSH19;
    int currentMinuteSH19;
    int futureHourSH19;
    int futureMinuteSH19;

    int currentHourSH20;
    int currentMinuteSH20;
    int futureHourSH20;
    int futureMinuteSH20;

    int currentHourSH21;
    int currentMinuteSH21;
    int futureHourSH21;
    int futureMinuteSH21;

    int currentHourSH22;
    int currentMinuteSH22;
    int futureHourSH22;
    int futureMinuteSH22;

    int currentHourSH23;
    int currentMinuteSH23;
    int futureHourSH23;
    int futureMinuteSH23;

    int currentHourSH24;
    int currentMinuteSH24;
    int futureHourSH24;
    int futureMinuteSH24;

    int currentHourSH25;
    int currentMinuteSH25;
    int futureHourSH25;
    int futureMinuteSH25;

    int currentHourSH26;
    int currentMinuteSH26;
    int futureHourSH26;
    int futureMinuteSH26;

    int currentHourSH27;
    int currentMinuteSH27;
    int futureHourSH27;
    int futureMinuteSH27;

    int currentHourSH28;
    int currentMinuteSH28;
    int futureHourSH28;
    int futureMinuteSH28;

    int currentHourSH29;
    int currentMinuteSH29;
    int futureHourSH29;
    int futureMinuteSH29;

    int currentHourSH30;
    int currentMinuteSH30;
    int futureHourSH30;
    int futureMinuteSH30;

    int currentHourSH31;
    int currentMinuteSH31;
    int futureHourSH31;
    int futureMinuteSH31;

    int currentHourSH32;
    int currentMinuteSH32;
    int futureHourSH32;
    int futureMinuteSH32;

    int currentHourSH33;
    int currentMinuteSH33;
    int futureHourSH33;
    int futureMinuteSH33;


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
    //----------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
//-----------------------------------------------------------------------------------------------
        // 啟動計時器服務
        Intent timerServiceIntent = new Intent(this, TimerServiceS1.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntent);
        } else {
            startService(timerServiceIntent);
        }
        // 啟動計時器服務
        Intent timerServiceIntentSH101 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH101);
        } else {
            startService(timerServiceIntentSH101);
        }

        Intent timerServiceIntentSH102 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH102);
        } else {
            startService(timerServiceIntentSH102);
        }

        Intent timerServiceIntentSH103 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH103);
        } else {
            startService(timerServiceIntentSH103);
        }

        Intent timerServiceIntentSH104 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH104);
        } else {
            startService(timerServiceIntentSH104);
        }

        Intent timerServiceIntentSH105 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH105);
        } else {
            startService(timerServiceIntentSH105);
        }

        Intent timerServiceIntentSH106 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH106);
        } else {
            startService(timerServiceIntentSH106);
        }

        Intent timerServiceIntentSH107 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH107);
        } else {
            startService(timerServiceIntentSH107);
        }

        Intent timerServiceIntentSH8 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH8);
        } else {
            startService(timerServiceIntentSH8);
        }

        Intent timerServiceIntentSH9 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH9);
        } else {
            startService(timerServiceIntentSH9);
        }

        Intent timerServiceIntentSH10 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH10);
        } else {
            startService(timerServiceIntentSH10);
        }

        Intent timerServiceIntentSH11 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH11);
        } else {
            startService(timerServiceIntentSH11);
        }

        Intent timerServiceIntentSH12 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH12);
        } else {
            startService(timerServiceIntentSH12);
        }

        Intent timerServiceIntentSH13 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH13);
        } else {
            startService(timerServiceIntentSH13);
        }

        Intent timerServiceIntentSH14 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH14);
        } else {
            startService(timerServiceIntentSH14);
        }

        Intent timerServiceIntentSH15 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH15);
        } else {
            startService(timerServiceIntentSH15);
        }

        Intent timerServiceIntentSH16 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH16);
        } else {
            startService(timerServiceIntentSH16);
        }

        Intent timerServiceIntentSH17 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH17);
        } else {
            startService(timerServiceIntentSH17);
        }

        Intent timerServiceIntentSH18 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH18);
        } else {
            startService(timerServiceIntentSH18);
        }

        Intent timerServiceIntentSH19 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH19);
        } else {
            startService(timerServiceIntentSH19);
        }

        Intent timerServiceIntentSH20 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH20);
        } else {
            startService(timerServiceIntentSH20);
        }

        Intent timerServiceIntentSH21 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH21);
        } else {
            startService(timerServiceIntentSH21);
        }

        Intent timerServiceIntentSH22 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH22);
        } else {
            startService(timerServiceIntentSH22);
        }

        Intent timerServiceIntentSH23 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH23);
        } else {
            startService(timerServiceIntentSH23);
        }

        Intent timerServiceIntentSH24 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH24);
        } else {
            startService(timerServiceIntentSH24);
        }

        Intent timerServiceIntentSH25 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH25);
        } else {
            startService(timerServiceIntentSH25);
        }

        Intent timerServiceIntentSH26 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH26);
        } else {
            startService(timerServiceIntentSH26);
        }

        Intent timerServiceIntentSH27 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH27);
        } else {
            startService(timerServiceIntentSH27);
        }

        Intent timerServiceIntentSH28 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH28);
        } else {
            startService(timerServiceIntentSH28);
        }

        Intent timerServiceIntentSH29 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH29);
        } else {
            startService(timerServiceIntentSH29);
        }

        Intent timerServiceIntentSH30 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH30);
        } else {
            startService(timerServiceIntentSH30);
        }

        Intent timerServiceIntentSH31 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH31);
        } else {
            startService(timerServiceIntentSH31);
        }

        Intent timerServiceIntentSH32 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH32);
        } else {
            startService(timerServiceIntentSH32);
        }

        Intent timerServiceIntentSH33 = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntentSH33);
        } else {
            startService(timerServiceIntentSH33);
        }

//-----------------------------------------------------------------------------------------------
// 初始化 SharedPreferences 和 editorSH1
        sharedPreferencesSH101 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH101 = sharedPreferencesSH101.edit();

        sharedPreferencesSH102 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH102 = sharedPreferencesSH102.edit();

        sharedPreferencesSH103 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH103 = sharedPreferencesSH103.edit();

        sharedPreferencesSH104 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH104 = sharedPreferencesSH104.edit();

        sharedPreferencesSH105 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH105 = sharedPreferencesSH105.edit();

        sharedPreferencesSH106 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH106 = sharedPreferencesSH106.edit();

        sharedPreferencesSH107 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH107 = sharedPreferencesSH107.edit();

        sharedPreferencesSH8 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH8 = sharedPreferencesSH8.edit();

        sharedPreferencesSH9 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH9 = sharedPreferencesSH9.edit();

        sharedPreferencesSH10 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH10 = sharedPreferencesSH10.edit();

        sharedPreferencesSH11 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH11 = sharedPreferencesSH11.edit();

        sharedPreferencesSH12 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH12 = sharedPreferencesSH12.edit();

        sharedPreferencesSH13 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH13 = sharedPreferencesSH13.edit();

        sharedPreferencesSH14 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH14 = sharedPreferencesSH14.edit();

        sharedPreferencesSH15 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH15 = sharedPreferencesSH15.edit();

        sharedPreferencesSH16 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH16 = sharedPreferencesSH16.edit();

        sharedPreferencesSH17 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH17 = sharedPreferencesSH17.edit();

        sharedPreferencesSH18 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH18 = sharedPreferencesSH18.edit();

        sharedPreferencesSH19 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH19 = sharedPreferencesSH19.edit();

        sharedPreferencesSH20 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH20 = sharedPreferencesSH20.edit();

        sharedPreferencesSH21 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH21 = sharedPreferencesSH21.edit();

        sharedPreferencesSH22 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH22 = sharedPreferencesSH22.edit();

        sharedPreferencesSH23 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH23 = sharedPreferencesSH23.edit();

        sharedPreferencesSH24 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH24 = sharedPreferencesSH24.edit();

        sharedPreferencesSH25 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH25 = sharedPreferencesSH25.edit();

        sharedPreferencesSH26 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH26 = sharedPreferencesSH26.edit();

        sharedPreferencesSH27 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH27 = sharedPreferencesSH27.edit();

        sharedPreferencesSH28 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH28 = sharedPreferencesSH28.edit();

        sharedPreferencesSH29 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH29 = sharedPreferencesSH29.edit();

        sharedPreferencesSH30 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH30 = sharedPreferencesSH30.edit();

        sharedPreferencesSH31 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH31 = sharedPreferencesSH31.edit();

        sharedPreferencesSH32 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH32 = sharedPreferencesSH32.edit();

        sharedPreferencesSH33 = PreferenceManager.getDefaultSharedPreferences(this);
        editorSH33 = sharedPreferencesSH33.edit();
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
//-----------------------------------------------------------------------------------------------

        btnTimerSH101 = findViewById(R.id.SHbutton101);
        btnTimerSH101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH101) {
                    showConfirmationDialogForButton101();
                    updateButtonColor101(); // 更新颜色
                } else if (isTimerRunningSH101) {
                    if (secSH101 < blueThreshold101) {
                        updateButtonColor101();
                        showConfirmationDialogYNForButton101();
                    } else if (blueThreshold101 <= secSH101 && secSH101 < yellowThreshold101) {
                        if (!flashingSH101) {
                            flashingSH101 = true; // 停止蓝色闪烁
                            updateButtonColor101();
                        } else if (flashingSH101) {
                            updateButtonColor101();
                            showConfirmationDialogYNForButton101();
                        }

                    } else if (yellowThreshold101 <= secSH101 && secSH101 < redThreshold101) {
                        if (!flashinggSH101) {
                            flashinggSH101 = true; // 停止黄色闪烁
                            updateButtonColor101();
                        } else if (flashinggSH101) {
                            updateButtonColor101();
                            showConfirmationDialogYNForButton101();
                        }

                    } else if (secSH101 >= redThreshold101) {
                        updateButtonColor101();
                        showConfirmationDialogYNForButton101();
                    }
                }
            }
        });

        btnTimerSH101.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton101();
                return true;
            }
        });

        btnTimerSH102 = findViewById(R.id.SHbutton102);
        btnTimerSH102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH102) {
                    showConfirmationDialogForButton102();
                    updateButtonColor102(); // 更新颜色
                } else if (isTimerRunningSH102) {
                    if (secSH102 < blueThreshold102) {
                        updateButtonColor102();
                        showConfirmationDialogYNForButton102();
                    } else if (blueThreshold102 <= secSH102 && secSH102 < yellowThreshold102) {
                        if (!flashingSH102) {
                            flashingSH102 = true; // 停止蓝色闪烁
                            updateButtonColor102();
                        } else if (flashingSH102) {
                            updateButtonColor102();
                            showConfirmationDialogYNForButton102();
                        }

                    } else if (yellowThreshold102 <= secSH102 && secSH102 < redThreshold102) {
                        if (!flashinggSH102) {
                            flashinggSH102 = true; // 停止黄色闪烁
                            updateButtonColor102();
                        } else if (flashinggSH102) {
                            updateButtonColor102();
                            showConfirmationDialogYNForButton102();
                        }

                    } else if (secSH102 >= redThreshold102) {
                        updateButtonColor102();
                        showConfirmationDialogYNForButton102();
                    }
                }
            }
        });

        btnTimerSH102.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton102();
                return true;
            }
        });
        btnTimerSH103 = findViewById(R.id.SHbutton103);
        btnTimerSH103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH103) {
                    showConfirmationDialogForButton103();
                    updateButtonColor103(); // 更新颜色
                } else if (isTimerRunningSH103) {
                    if (secSH103 < blueThreshold103) {
                        updateButtonColor103();
                        showConfirmationDialogYNForButton103();
                    } else if (blueThreshold103 <= secSH103 && secSH103 < yellowThreshold103) {
                        if (!flashingSH103) {
                            flashingSH103 = true; // 停止蓝色闪烁
                            updateButtonColor103();
                        } else if (flashingSH103) {
                            updateButtonColor103();
                            showConfirmationDialogYNForButton103();
                        }

                    } else if (yellowThreshold103 <= secSH103 && secSH103 < redThreshold103) {
                        if (!flashinggSH103) {
                            flashinggSH103 = true; // 停止黄色闪烁
                            updateButtonColor103();
                        } else if (flashinggSH103) {
                            updateButtonColor103();
                            showConfirmationDialogYNForButton103();
                        }

                    } else if (secSH103 >= redThreshold103) {
                        updateButtonColor103();
                        showConfirmationDialogYNForButton103();
                    }
                }
            }
        });

        btnTimerSH103.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton103();
                return true;
            }
        });
        btnTimerSH104 = findViewById(R.id.SHbutton104);
        btnTimerSH104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH104) {
                    showConfirmationDialogForButton104();
                    updateButtonColor104(); // 更新颜色
                } else if (isTimerRunningSH104) {
                    if (secSH104 < blueThreshold104) {
                        updateButtonColor104();
                        showConfirmationDialogYNForButton104();
                    } else if (blueThreshold104 <= secSH104 && secSH104 < yellowThreshold104) {
                        if (!flashingSH104) {
                            flashingSH104 = true; // 停止蓝色闪烁
                            updateButtonColor104();
                        } else if (flashingSH104) {
                            updateButtonColor104();
                            showConfirmationDialogYNForButton104();
                        }

                    } else if (yellowThreshold104 <= secSH104 && secSH104 < redThreshold104) {
                        if (!flashinggSH104) {
                            flashinggSH104 = true; // 停止黄色闪烁
                            updateButtonColor104();
                        } else if (flashinggSH104) {
                            updateButtonColor104();
                            showConfirmationDialogYNForButton104();
                        }

                    } else if (secSH104 >= redThreshold104) {
                        updateButtonColor104();
                        showConfirmationDialogYNForButton104();
                    }
                }
            }
        });

        btnTimerSH104.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton104();
                return true;
            }
        });
        btnTimerSH105 = findViewById(R.id.SHbutton105);
        btnTimerSH105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH105) {
                    showConfirmationDialogForButton105();
                    updateButtonColor105(); // 更新颜色
                } else if (isTimerRunningSH105) {
                    if (secSH105 < blueThreshold105) {
                        updateButtonColor105();
                        showConfirmationDialogYNForButton105();
                    } else if (blueThreshold105 <= secSH105 && secSH105 < yellowThreshold105) {
                        if (!flashingSH105) {
                            flashingSH105 = true; // 停止蓝色闪烁
                            updateButtonColor105();
                        } else if (flashingSH105) {
                            updateButtonColor105();
                            showConfirmationDialogYNForButton105();
                        }

                    } else if (yellowThreshold105 <= secSH105 && secSH105 < redThreshold105) {
                        if (!flashinggSH105) {
                            flashinggSH105 = true; // 停止黄色闪烁
                            updateButtonColor105();
                        } else if (flashinggSH105) {
                            updateButtonColor105();
                            showConfirmationDialogYNForButton105();
                        }

                    } else if (secSH105 >= redThreshold105) {
                        updateButtonColor105();
                        showConfirmationDialogYNForButton105();
                    }
                }
            }
        });

        btnTimerSH105.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton105();
                return true;
            }
        });
        btnTimerSH106 = findViewById(R.id.SHbutton106);
        btnTimerSH106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH106) {
                    showConfirmationDialogForButton106();
                    updateButtonColor106(); // 更新颜色
                } else if (isTimerRunningSH106) {
                    if (secSH106 < blueThreshold106) {
                        updateButtonColor106();
                        showConfirmationDialogYNForButton106();
                    } else if (blueThreshold106 <= secSH106 && secSH106 < yellowThreshold106) {
                        if (!flashingSH106) {
                            flashingSH106 = true; // 停止蓝色闪烁
                            updateButtonColor106();
                        } else if (flashingSH106) {
                            updateButtonColor106();
                            showConfirmationDialogYNForButton106();
                        }

                    } else if (yellowThreshold106 <= secSH106 && secSH106 < redThreshold106) {
                        if (!flashinggSH106) {
                            flashinggSH106 = true; // 停止黄色闪烁
                            updateButtonColor106();
                        } else if (flashinggSH106) {
                            updateButtonColor106();
                            showConfirmationDialogYNForButton106();
                        }

                    } else if (secSH106 >= redThreshold106) {
                        updateButtonColor106();
                        showConfirmationDialogYNForButton106();
                    }
                }
            }
        });

        btnTimerSH106.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton106();
                return true;
            }
        });
        btnTimerSH107 = findViewById(R.id.SHbutton107);
        btnTimerSH107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH107) {
                    showConfirmationDialogForButton107();
                    updateButtonColor107(); // 更新颜色
                } else if (isTimerRunningSH107) {
                    if (secSH107 < blueThreshold107) {
                        updateButtonColor107();
                        showConfirmationDialogYNForButton107();
                    } else if (blueThreshold107 <= secSH107 && secSH107 < yellowThreshold107) {
                        if (!flashingSH107) {
                            flashingSH107 = true; // 停止蓝色闪烁
                            updateButtonColor107();
                        } else if (flashingSH107) {
                            updateButtonColor107();
                            showConfirmationDialogYNForButton107();
                        }

                    } else if (yellowThreshold107 <= secSH107 && secSH107 < redThreshold107) {
                        if (!flashinggSH107) {
                            flashinggSH107 = true; // 停止黄色闪烁
                            updateButtonColor107();
                        } else if (flashinggSH107) {
                            updateButtonColor107();
                            showConfirmationDialogYNForButton107();
                        }

                    } else if (secSH107 >= redThreshold107) {
                        updateButtonColor107();
                        showConfirmationDialogYNForButton107();
                    }
                }
            }
        });

        btnTimerSH107.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton107();
                return true;
            }
        });

        btnTimerSH8 = findViewById(R.id.SHbutton8);
        btnTimerSH8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH8) {
                    showConfirmationDialogForButton8();
                    updateButtonColor8(); // 更新颜色
                } else if (isTimerRunningSH8) {
                    if (secSH8 < blueThreshold8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    } else if (blueThreshold8 <= secSH8 && secSH8 < yellowThreshold8) {
                        if (!flashingSH8) {
                            flashingSH8 = true; // 停止蓝色闪烁
                            updateButtonColor8();
                        } else if (flashingSH8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (yellowThreshold8 <= secSH8 && secSH8 < redThreshold8) {
                        if (!flashinggSH8) {
                            flashinggSH8 = true; // 停止黄色闪烁
                            updateButtonColor8();
                        } else if (flashinggSH8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (secSH8 >= redThreshold8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    }
                }
            }
        });

        btnTimerSH8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton8();
                return true;
            }
        });
        btnTimerSH9 = findViewById(R.id.SHbutton9);
        btnTimerSH9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH9) {
                    showConfirmationDialogForButton9();
                    updateButtonColor9(); // 更新颜色
                } else if (isTimerRunningSH9) {
                    if (secSH9 < blueThreshold9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    } else if (blueThreshold9 <= secSH9 && secSH9 < yellowThreshold9) {
                        if (!flashingSH9) {
                            flashingSH9 = true; // 停止蓝色闪烁
                            updateButtonColor9();
                        } else if (flashingSH9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (yellowThreshold9 <= secSH9 && secSH9 < redThreshold9) {
                        if (!flashinggSH9) {
                            flashinggSH9 = true; // 停止黄色闪烁
                            updateButtonColor9();
                        } else if (flashinggSH9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (secSH9 >= redThreshold9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    }
                }
            }
        });

        btnTimerSH9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton9();
                return true;
            }
        });
        btnTimerSH10 = findViewById(R.id.SHbutton10);
        btnTimerSH10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH10) {
                    showConfirmationDialogForButton10();
                    updateButtonColor10(); // 更新颜色
                } else if (isTimerRunningSH10) {
                    if (secSH10 < blueThreshold10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    } else if (blueThreshold10 <= secSH10 && secSH10 < yellowThreshold10) {
                        if (!flashingSH10) {
                            flashingSH10 = true; // 停止蓝色闪烁
                            updateButtonColor10();
                        } else if (flashingSH10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (yellowThreshold10 <= secSH10 && secSH10 < redThreshold10) {
                        if (!flashinggSH10) {
                            flashinggSH10 = true; // 停止黄色闪烁
                            updateButtonColor10();
                        } else if (flashinggSH10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (secSH10 >= redThreshold10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    }
                }
            }
        });

        btnTimerSH10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton10();
                return true;
            }
        });
        btnTimerSH11 = findViewById(R.id.SHbutton11);
        btnTimerSH11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH11) {
                    showConfirmationDialogForButton11();
                    updateButtonColor11(); // 更新颜色
                } else if (isTimerRunningSH11) {
                    if (secSH11 < blueThreshold11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    } else if (blueThreshold11 <= secSH11 && secSH11 < yellowThreshold11) {
                        if (!flashingSH11) {
                            flashingSH11 = true; // 停止蓝色闪烁
                            updateButtonColor11();
                        } else if (flashingSH11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (yellowThreshold11 <= secSH11 && secSH11 < redThreshold11) {
                        if (!flashinggSH11) {
                            flashinggSH11 = true; // 停止黄色闪烁
                            updateButtonColor11();
                        } else if (flashinggSH11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (secSH11 >= redThreshold11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    }
                }
            }
        });

        btnTimerSH11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton11();
                return true;
            }
        });
        btnTimerSH12 = findViewById(R.id.SHbutton12);
        btnTimerSH12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH12) {
                    showConfirmationDialogForButton12();
                    updateButtonColor12(); // 更新颜色
                } else if (isTimerRunningSH12) {
                    if (secSH12 < blueThreshold12) {
                        updateButtonColor12();
                        showConfirmationDialogYNForButton12();
                    } else if (blueThreshold12 <= secSH12 && secSH12 < yellowThreshold12) {
                        if (!flashingSH12) {
                            flashingSH12 = true; // 停止蓝色闪烁
                            updateButtonColor12();
                        } else if (flashingSH12) {
                            updateButtonColor12();
                            showConfirmationDialogYNForButton12();
                        }

                    } else if (yellowThreshold12 <= secSH12 && secSH12 < redThreshold12) {
                        if (!flashinggSH12) {
                            flashinggSH12 = true; // 停止黄色闪烁
                            updateButtonColor12();
                        } else if (flashinggSH12) {
                            updateButtonColor12();
                            showConfirmationDialogYNForButton12();
                        }

                    } else if (secSH12 >= redThreshold12) {
                        updateButtonColor12();
                        showConfirmationDialogYNForButton12();
                    }
                }
            }
        });

        btnTimerSH12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton12();
                return true;
            }
        });

        btnTimerSH13 = findViewById(R.id.SHbutton13);
        btnTimerSH13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH13) {
                    showConfirmationDialogForButton13();
                    updateButtonColor13(); // 更新颜色
                } else if (isTimerRunningSH13) {
                    if (secSH13 < blueThreshold13) {
                        updateButtonColor13();
                        showConfirmationDialogYNForButton13();
                    } else if (blueThreshold13 <= secSH13 && secSH13 < yellowThreshold13) {
                        if (!flashingSH13) {
                            flashingSH13 = true; // 停止蓝色闪烁
                            updateButtonColor13();
                        } else if (flashingSH13) {
                            updateButtonColor13();
                            showConfirmationDialogYNForButton13();
                        }

                    } else if (yellowThreshold13 <= secSH13 && secSH13 < redThreshold13) {
                        if (!flashinggSH13) {
                            flashinggSH13 = true; // 停止黄色闪烁
                            updateButtonColor13();
                        } else if (flashinggSH13) {
                            updateButtonColor13();
                            showConfirmationDialogYNForButton13();
                        }

                    } else if (secSH13 >= redThreshold13) {
                        updateButtonColor13();
                        showConfirmationDialogYNForButton13();
                    }
                }
            }
        });

        btnTimerSH13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton13();
                return true;
            }
        });
        btnTimerSH14 = findViewById(R.id.SHbutton14);
        btnTimerSH14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH14) {
                    showConfirmationDialogForButton14();
                    updateButtonColor14(); // 更新颜色
                } else if (isTimerRunningSH14) {
                    if (secSH14 < blueThreshold14) {
                        updateButtonColor14();
                        showConfirmationDialogYNForButton14();
                    } else if (blueThreshold14 <= secSH14 && secSH14 < yellowThreshold14) {
                        if (!flashingSH14) {
                            flashingSH14 = true; // 停止蓝色闪烁
                            updateButtonColor14();
                        } else if (flashingSH14) {
                            updateButtonColor14();
                            showConfirmationDialogYNForButton14();
                        }

                    } else if (yellowThreshold14 <= secSH14 && secSH14 < redThreshold14) {
                        if (!flashinggSH14) {
                            flashinggSH14 = true; // 停止黄色闪烁
                            updateButtonColor14();
                        } else if (flashinggSH14) {
                            updateButtonColor14();
                            showConfirmationDialogYNForButton14();
                        }

                    } else if (secSH14 >= redThreshold14) {
                        updateButtonColor14();
                        showConfirmationDialogYNForButton14();
                    }
                }
            }
        });

        btnTimerSH14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton14();
                return true;
            }
        });
        btnTimerSH15 = findViewById(R.id.SHbutton15);
        btnTimerSH15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH15) {
                    showConfirmationDialogForButton15();
                    updateButtonColor15(); // 更新颜色
                } else if (isTimerRunningSH15) {
                    if (secSH15 < blueThreshold15) {
                        updateButtonColor15();
                        showConfirmationDialogYNForButton15();
                    } else if (blueThreshold15 <= secSH15 && secSH15 < yellowThreshold15) {
                        if (!flashingSH15) {
                            flashingSH15 = true; // 停止蓝色闪烁
                            updateButtonColor15();
                        } else if (flashingSH15) {
                            updateButtonColor15();
                            showConfirmationDialogYNForButton15();
                        }

                    } else if (yellowThreshold15 <= secSH15 && secSH15 < redThreshold15) {
                        if (!flashinggSH15) {
                            flashinggSH15 = true; // 停止黄色闪烁
                            updateButtonColor15();
                        } else if (flashinggSH15) {
                            updateButtonColor15();
                            showConfirmationDialogYNForButton15();
                        }

                    } else if (secSH15 >= redThreshold15) {
                        updateButtonColor15();
                        showConfirmationDialogYNForButton15();
                    }
                }
            }
        });

        btnTimerSH15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton15();
                return true;
            }
        });
        btnTimerSH16 = findViewById(R.id.SHbutton16);
        btnTimerSH16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH16) {
                    showConfirmationDialogForButton16();
                    updateButtonColor16(); // 更新颜色
                } else if (isTimerRunningSH16) {
                    if (secSH16 < blueThreshold16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    } else if (blueThreshold16 <= secSH16 && secSH16 < yellowThreshold16) {
                        if (!flashingSH16) {
                            flashingSH16 = true; // 停止蓝色闪烁
                            updateButtonColor16();
                        } else if (flashingSH16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (yellowThreshold16 <= secSH16 && secSH16 < redThreshold16) {
                        if (!flashinggSH16) {
                            flashinggSH16 = true; // 停止黄色闪烁
                            updateButtonColor16();
                        } else if (flashinggSH16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (secSH16 >= redThreshold16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    }
                }
            }
        });

        btnTimerSH16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton16();
                return true;
            }
        });
        btnTimerSH17 = findViewById(R.id.SHbutton17);
        btnTimerSH17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH17) {
                    showConfirmationDialogForButton17();
                    updateButtonColor17(); // 更新颜色
                } else if (isTimerRunningSH17) {
                    if (secSH17 < blueThreshold17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    } else if (blueThreshold17 <= secSH17 && secSH17 < yellowThreshold17) {
                        if (!flashingSH17) {
                            flashingSH17 = true; // 停止蓝色闪烁
                            updateButtonColor17();
                        } else if (flashingSH17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (yellowThreshold17 <= secSH17 && secSH17 < redThreshold17) {
                        if (!flashinggSH17) {
                            flashinggSH17 = true; // 停止黄色闪烁
                            updateButtonColor17();
                        } else if (flashinggSH17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (secSH17 >= redThreshold17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    }
                }
            }
        });

        btnTimerSH17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton17();
                return true;
            }
        });

        btnTimerSH18 = findViewById(R.id.SHbutton18);
        btnTimerSH18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH18) {
                    showConfirmationDialogForButton18();
                    updateButtonColor18(); // 更新颜色
                } else if (isTimerRunningSH18) {
                    if (secSH18 < blueThreshold18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    } else if (blueThreshold18 <= secSH18 && secSH18 < yellowThreshold18) {
                        if (!flashingSH18) {
                            flashingSH18 = true; // 停止蓝色闪烁
                            updateButtonColor18();
                        } else if (flashingSH18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (yellowThreshold18 <= secSH18 && secSH18 < redThreshold18) {
                        if (!flashinggSH18) {
                            flashinggSH18 = true; // 停止黄色闪烁
                            updateButtonColor18();
                        } else if (flashinggSH18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (secSH18 >= redThreshold18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    }
                }
            }
        });

        btnTimerSH18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton18();
                return true;
            }
        });
        btnTimerSH19 = findViewById(R.id.SHbutton19);
        btnTimerSH19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH19) {
                    showConfirmationDialogForButton19();
                    updateButtonColor19(); // 更新颜色
                } else if (isTimerRunningSH19) {
                    if (secSH19 < blueThreshold19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    } else if (blueThreshold19 <= secSH19 && secSH19 < yellowThreshold19) {
                        if (!flashingSH19) {
                            flashingSH19 = true; // 停止蓝色闪烁
                            updateButtonColor19();
                        } else if (flashingSH19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (yellowThreshold19 <= secSH19 && secSH19 < redThreshold19) {
                        if (!flashinggSH19) {
                            flashinggSH19 = true; // 停止黄色闪烁
                            updateButtonColor19();
                        } else if (flashinggSH19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (secSH19 >= redThreshold19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    }
                }
            }
        });

        btnTimerSH19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton19();
                return true;
            }
        });
        btnTimerSH20 = findViewById(R.id.SHbutton20);
        btnTimerSH20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH20) {
                    showConfirmationDialogForButton20();
                    updateButtonColor20(); // 更新颜色
                } else if (isTimerRunningSH20) {
                    if (secSH20 < blueThreshold20) {
                        updateButtonColor20();
                        showConfirmationDialogYNForButton20();
                    } else if (blueThreshold20 <= secSH20 && secSH20 < yellowThreshold20) {
                        if (!flashingSH20) {
                            flashingSH20 = true; // 停止蓝色闪烁
                            updateButtonColor20();
                        } else if (flashingSH20) {
                            updateButtonColor20();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (yellowThreshold20 <= secSH20 && secSH20 < redThreshold20) {
                        if (!flashinggSH20) {
                            flashinggSH20 = true; // 停止黄色闪烁
                            updateButtonColor20();
                        } else if (flashinggSH20) {
                            updateButtonColor20();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (secSH20 >= redThreshold20) {
                        updateButtonColor20();
                        showConfirmationDialogYNForButton20();
                    }
                }
            }
        });

        btnTimerSH20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton20();
                return true;
            }
        });
        btnTimerSH21 = findViewById(R.id.SHbutton21);
        btnTimerSH21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH21) {
                    showConfirmationDialogForButton21();
                    updateButtonColor21(); // 更新颜色
                } else if (isTimerRunningSH21) {
                    if (secSH21 < blueThreshold21) {
                        updateButtonColor21();
                        showConfirmationDialogYNForButton21();
                    } else if (blueThreshold21 <= secSH21 && secSH21 < yellowThreshold21) {
                        if (!flashingSH21) {
                            flashingSH21 = true; // 停止蓝色闪烁
                            updateButtonColor21();
                        } else if (flashingSH21) {
                            updateButtonColor21();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (yellowThreshold21 <= secSH21 && secSH21 < redThreshold21) {
                        if (!flashinggSH21) {
                            flashinggSH21 = true; // 停止黄色闪烁
                            updateButtonColor21();
                        } else if (flashinggSH21) {
                            updateButtonColor21();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (secSH21 >= redThreshold21) {
                        updateButtonColor21();
                        showConfirmationDialogYNForButton21();
                    }
                }
            }
        });

        btnTimerSH21.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton21();
                return true;
            }
        });
        btnTimerSH22 = findViewById(R.id.SHbutton22);
        btnTimerSH22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH22) {
                    showConfirmationDialogForButton22();
                    updateButtonColor22(); // 更新颜色
                } else if (isTimerRunningSH22) {
                    if (secSH22 < blueThreshold22) {
                        updateButtonColor22();
                        showConfirmationDialogYNForButton22();
                    } else if (blueThreshold22 <= secSH22 && secSH22 < yellowThreshold22) {
                        if (!flashingSH22) {
                            flashingSH22 = true; // 停止蓝色闪烁
                            updateButtonColor22();
                        } else if (flashingSH22) {
                            updateButtonColor22();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (yellowThreshold22 <= secSH22 && secSH22 < redThreshold22) {
                        if (!flashinggSH22) {
                            flashinggSH22 = true; // 停止黄色闪烁
                            updateButtonColor22();
                        } else if (flashinggSH22) {
                            updateButtonColor22();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (secSH22 >= redThreshold22) {
                        updateButtonColor22();
                        showConfirmationDialogYNForButton22();
                    }
                }
            }
        });

        btnTimerSH22.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton22();
                return true;
            }
        });

        btnTimerSH23 = findViewById(R.id.SHbutton23);
        btnTimerSH23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH23) {
                    showConfirmationDialogForButton23();
                    updateButtonColor23(); // 更新颜色
                } else if (isTimerRunningSH23) {
                    if (secSH23 < blueThreshold23) {
                        updateButtonColor23();
                        showConfirmationDialogYNForButton23();
                    } else if (blueThreshold23 <= secSH23 && secSH23 < yellowThreshold23) {
                        if (!flashingSH23) {
                            flashingSH23 = true; // 停止蓝色闪烁
                            updateButtonColor23();
                        } else if (flashingSH23) {
                            updateButtonColor23();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (yellowThreshold23 <= secSH23 && secSH23 < redThreshold23) {
                        if (!flashinggSH23) {
                            flashinggSH23 = true; // 停止黄色闪烁
                            updateButtonColor23();
                        } else if (flashinggSH23) {
                            updateButtonColor23();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (secSH23 >= redThreshold23) {
                        updateButtonColor23();
                        showConfirmationDialogYNForButton23();
                    }
                }
            }
        });

        btnTimerSH23.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton23();
                return true;
            }
        });
        btnTimerSH24 = findViewById(R.id.SHbutton24);
        btnTimerSH24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH24) {
                    showConfirmationDialogForButton24();
                    updateButtonColor24(); // 更新颜色
                } else if (isTimerRunningSH24) {
                    if (secSH24 < blueThreshold24) {
                        updateButtonColor24();
                        showConfirmationDialogYNForButton24();
                    } else if (blueThreshold24 <= secSH24 && secSH24 < yellowThreshold24) {
                        if (!flashingSH24) {
                            flashingSH24 = true; // 停止蓝色闪烁
                            updateButtonColor24();
                        } else if (flashingSH24) {
                            updateButtonColor24();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (yellowThreshold24 <= secSH24 && secSH24 < redThreshold24) {
                        if (!flashinggSH24) {
                            flashinggSH24 = true; // 停止黄色闪烁
                            updateButtonColor24();
                        } else if (flashinggSH24) {
                            updateButtonColor24();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (secSH24 >= redThreshold24) {
                        updateButtonColor24();
                        showConfirmationDialogYNForButton24();
                    }
                }
            }
        });

        btnTimerSH24.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton24();
                return true;
            }
        });
        btnTimerSH25 = findViewById(R.id.SHbutton25);
        btnTimerSH25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH25) {
                    showConfirmationDialogForButton25();
                    updateButtonColor25(); // 更新颜色
                } else if (isTimerRunningSH25) {
                    if (secSH25 < blueThreshold25) {
                        updateButtonColor25();
                        showConfirmationDialogYNForButton25();
                    } else if (blueThreshold25 <= secSH25 && secSH25 < yellowThreshold25) {
                        if (!flashingSH25) {
                            flashingSH25 = true; // 停止蓝色闪烁
                            updateButtonColor25();
                        } else if (flashingSH25) {
                            updateButtonColor25();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (yellowThreshold25 <= secSH25 && secSH25 < redThreshold25) {
                        if (!flashinggSH25) {
                            flashinggSH25 = true; // 停止黄色闪烁
                            updateButtonColor25();
                        } else if (flashinggSH25) {
                            updateButtonColor25();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (secSH25 >= redThreshold25) {
                        updateButtonColor25();
                        showConfirmationDialogYNForButton25();
                    }
                }
            }
        });

        btnTimerSH25.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton25();
                return true;
            }
        });
        btnTimerSH26 = findViewById(R.id.SHbutton26);
        btnTimerSH26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH26) {
                    showConfirmationDialogForButton26();
                    updateButtonColor26(); // 更新颜色
                } else if (isTimerRunningSH26) {
                    if (secSH26 < blueThreshold26) {
                        updateButtonColor26();
                        showConfirmationDialogYNForButton26();
                    } else if (blueThreshold26 <= secSH26 && secSH26 < yellowThreshold26) {
                        if (!flashingSH26) {
                            flashingSH26 = true; // 停止蓝色闪烁
                            updateButtonColor26();
                        } else if (flashingSH26) {
                            updateButtonColor26();
                            showConfirmationDialogYNForButton26();
                        }

                    } else if (yellowThreshold26 <= secSH26 && secSH26 < redThreshold26) {
                        if (!flashinggSH26) {
                            flashinggSH26 = true; // 停止黄色闪烁
                            updateButtonColor26();
                        } else if (flashinggSH26) {
                            updateButtonColor26();
                            showConfirmationDialogYNForButton26();
                        }

                    } else if (secSH26 >= redThreshold26) {
                        updateButtonColor26();
                        showConfirmationDialogYNForButton26();
                    }
                }
            }
        });

        btnTimerSH26.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton26();
                return true;
            }
        });
        btnTimerSH27 = findViewById(R.id.SHbutton27);
        btnTimerSH27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH27) {
                    showConfirmationDialogForButton27();
                    updateButtonColor27(); // 更新颜色
                } else if (isTimerRunningSH27) {
                    if (secSH27 < blueThreshold27) {
                        updateButtonColor27();
                        showConfirmationDialogYNForButton27();
                    } else if (blueThreshold27 <= secSH27 && secSH27 < yellowThreshold27) {
                        if (!flashingSH27) {
                            flashingSH27 = true; // 停止蓝色闪烁
                            updateButtonColor27();
                        } else if (flashingSH27) {
                            updateButtonColor27();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (yellowThreshold27 <= secSH27 && secSH27 < redThreshold27) {
                        if (!flashinggSH27) {
                            flashinggSH27 = true; // 停止黄色闪烁
                            updateButtonColor27();
                        } else if (flashinggSH27) {
                            updateButtonColor27();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (secSH27 >= redThreshold27) {
                        updateButtonColor27();
                        showConfirmationDialogYNForButton27();
                    }
                }
            }
        });

        btnTimerSH27.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton27();
                return true;
            }
        });

        btnTimerSH28 = findViewById(R.id.SHbutton28);
        btnTimerSH28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH28) {
                    showConfirmationDialogForButton28();
                    updateButtonColor28(); // 更新颜色
                } else if (isTimerRunningSH28) {
                    if (secSH28 < blueThreshold28) {
                        updateButtonColor28();
                        showConfirmationDialogYNForButton28();
                    } else if (blueThreshold28 <= secSH28 && secSH28 < yellowThreshold28) {
                        if (!flashingSH28) {
                            flashingSH28 = true; // 停止蓝色闪烁
                            updateButtonColor28();
                        } else if (flashingSH28) {
                            updateButtonColor28();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (yellowThreshold28 <= secSH28 && secSH28 < redThreshold28) {
                        if (!flashinggSH28) {
                            flashinggSH28 = true; // 停止黄色闪烁
                            updateButtonColor28();
                        } else if (flashinggSH28) {
                            updateButtonColor28();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (secSH28 >= redThreshold28) {
                        updateButtonColor28();
                        showConfirmationDialogYNForButton28();
                    }
                }
            }
        });

        btnTimerSH28.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton28();
                return true;
            }
        });
        btnTimerSH29 = findViewById(R.id.SHbutton29);
        btnTimerSH29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH29) {
                    showConfirmationDialogForButton29();
                    updateButtonColor29(); // 更新颜色
                } else if (isTimerRunningSH29) {
                    if (secSH29 < blueThreshold29) {
                        updateButtonColor29();
                        showConfirmationDialogYNForButton29();
                    } else if (blueThreshold29 <= secSH29 && secSH29 < yellowThreshold29) {
                        if (!flashingSH29) {
                            flashingSH29 = true; // 停止蓝色闪烁
                            updateButtonColor29();
                        } else if (flashingSH29) {
                            updateButtonColor29();
                            showConfirmationDialogYNForButton29();
                        }

                    } else if (yellowThreshold29 <= secSH29 && secSH29 < redThreshold29) {
                        if (!flashinggSH29) {
                            flashinggSH29 = true; // 停止黄色闪烁
                            updateButtonColor29();
                        } else if (flashinggSH29) {
                            updateButtonColor29();
                            showConfirmationDialogYNForButton29();
                        }

                    } else if (secSH29 >= redThreshold29) {
                        updateButtonColor29();
                        showConfirmationDialogYNForButton29();
                    }
                }
            }
        });

        btnTimerSH29.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton29();
                return true;
            }
        });
        btnTimerSH30 = findViewById(R.id.SHbutton30);
        btnTimerSH30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH30) {
                    showConfirmationDialogForButton30();
                    updateButtonColor30(); // 更新颜色
                } else if (isTimerRunningSH30) {
                    if (secSH30 < blueThreshold30) {
                        updateButtonColor30();
                        showConfirmationDialogYNForButton30();
                    } else if (blueThreshold30 <= secSH30 && secSH30 < yellowThreshold30) {
                        if (!flashingSH30) {
                            flashingSH30 = true; // 停止蓝色闪烁
                            updateButtonColor30();
                        } else if (flashingSH30) {
                            updateButtonColor30();
                            showConfirmationDialogYNForButton30();
                        }

                    } else if (yellowThreshold30 <= secSH30 && secSH30 < redThreshold30) {
                        if (!flashinggSH30) {
                            flashinggSH30 = true; // 停止黄色闪烁
                            updateButtonColor30();
                        } else if (flashinggSH30) {
                            updateButtonColor30();
                            showConfirmationDialogYNForButton30();
                        }

                    } else if (secSH30 >= redThreshold30) {
                        updateButtonColor30();
                        showConfirmationDialogYNForButton30();
                    }
                }
            }
        });

        btnTimerSH30.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton30();
                return true;
            }
        });
        btnTimerSH31 = findViewById(R.id.SHbutton31);
        btnTimerSH31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH31) {
                    showConfirmationDialogForButton31();
                    updateButtonColor31(); // 更新颜色
                } else if (isTimerRunningSH31) {
                    if (secSH31 < blueThreshold31) {
                        updateButtonColor31();
                        showConfirmationDialogYNForButton31();
                    } else if (blueThreshold31 <= secSH31 && secSH31 < yellowThreshold31) {
                        if (!flashingSH31) {
                            flashingSH31 = true; // 停止蓝色闪烁
                            updateButtonColor31();
                        } else if (flashingSH31) {
                            updateButtonColor31();
                            showConfirmationDialogYNForButton31();
                        }

                    } else if (yellowThreshold31 <= secSH31 && secSH31 < redThreshold31) {
                        if (!flashinggSH31) {
                            flashinggSH31 = true; // 停止黄色闪烁
                            updateButtonColor31();
                        } else if (flashinggSH31) {
                            updateButtonColor31();
                            showConfirmationDialogYNForButton31();
                        }

                    } else if (secSH31 >= redThreshold31) {
                        updateButtonColor31();
                        showConfirmationDialogYNForButton31();
                    }
                }
            }
        });

        btnTimerSH31.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton31();
                return true;
            }
        });
        btnTimerSH32 = findViewById(R.id.SHbutton32);
        btnTimerSH32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH32) {
                    showConfirmationDialogForButton32();
                    updateButtonColor32(); // 更新颜色
                } else if (isTimerRunningSH32) {
                    if (secSH32 < blueThreshold32) {
                        updateButtonColor32();
                        showConfirmationDialogYNForButton32();
                    } else if (blueThreshold32 <= secSH32 && secSH32 < yellowThreshold32) {
                        if (!flashingSH32) {
                            flashingSH32 = true; // 停止蓝色闪烁
                            updateButtonColor32();
                        } else if (flashingSH32) {
                            updateButtonColor32();
                            showConfirmationDialogYNForButton32();
                        }

                    } else if (yellowThreshold32 <= secSH32 && secSH32 < redThreshold32) {
                        if (!flashinggSH32) {
                            flashinggSH32 = true; // 停止黄色闪烁
                            updateButtonColor32();
                        } else if (flashinggSH32) {
                            updateButtonColor32();
                            showConfirmationDialogYNForButton32();
                        }

                    } else if (secSH32 >= redThreshold32) {
                        updateButtonColor32();
                        showConfirmationDialogYNForButton32();
                    }
                }
            }
        });

        btnTimerSH32.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton32();
                return true;
            }
        });

        btnTimerSH33 = findViewById(R.id.SHbutton33);
        btnTimerSH33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isTimerRunningSH33) {
                    showConfirmationDialogForButton33();
                    updateButtonColor33(); // 更新颜色
                } else if (isTimerRunningSH33) {
                    if (secSH33 < blueThreshold33) {
                        updateButtonColor33();
                        showConfirmationDialogYNForButton33();
                    } else if (blueThreshold33 <= secSH33 && secSH33 < yellowThreshold33) {
                        if (!flashingSH33) {
                            flashingSH33 = true; // 停止蓝色闪烁
                            updateButtonColor33();
                        } else if (flashingSH33) {
                            updateButtonColor33();
                            showConfirmationDialogYNForButton33();
                        }

                    } else if (yellowThreshold33 <= secSH33 && secSH33 < redThreshold33) {
                        if (!flashinggSH33) {
                            flashinggSH33 = true; // 停止黄色闪烁
                            updateButtonColor33();
                        } else if (flashinggSH33) {
                            updateButtonColor33();
                            showConfirmationDialogYNForButton33();
                        }

                    } else if (secSH33 >= redThreshold33) {
                        updateButtonColor33();
                        showConfirmationDialogYNForButton33();
                    }
                }
            }
        });

        btnTimerSH33.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton33();
                return true;
            }
        });
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
//-----------------------------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        //-----------------------------------------------------------------------------------------------
        handlerSH.removeCallbacks(updateTimerThread107);
        handlerSH.removeCallbacks(updateTimerThread102);
        handlerSH.removeCallbacks(updateTimerThread103);
        handlerSH.removeCallbacks(updateTimerThread104);
        handlerSH.removeCallbacks(updateTimerThread105);
        handlerSH.removeCallbacks(updateTimerThread106);
        handlerSH.removeCallbacks(updateTimerThread107);
        handlerSH.removeCallbacks(updateTimerThread8);
        handlerSH.removeCallbacks(updateTimerThread9);
        handlerSH.removeCallbacks(updateTimerThread10);
        handlerSH.removeCallbacks(updateTimerThread11);
        handlerSH.removeCallbacks(updateTimerThread12);
        handlerSH.removeCallbacks(updateTimerThread13);
        handlerSH.removeCallbacks(updateTimerThread14);
        handlerSH.removeCallbacks(updateTimerThread15);
        handlerSH.removeCallbacks(updateTimerThread16);
        handlerSH.removeCallbacks(updateTimerThread17);
        handlerSH.removeCallbacks(updateTimerThread18);
        handlerSH.removeCallbacks(updateTimerThread19);
        handlerSH.removeCallbacks(updateTimerThread20);
        handlerSH.removeCallbacks(updateTimerThread21);
        handlerSH.removeCallbacks(updateTimerThread22);
        handlerSH.removeCallbacks(updateTimerThread23);
        handlerSH.removeCallbacks(updateTimerThread24);
        handlerSH.removeCallbacks(updateTimerThread25);
        handlerSH.removeCallbacks(updateTimerThread26);
        handlerSH.removeCallbacks(updateTimerThread27);
        handlerSH.removeCallbacks(updateTimerThread28);
        handlerSH.removeCallbacks(updateTimerThread29);
        handlerSH.removeCallbacks(updateTimerThread30);
        handlerSH.removeCallbacks(updateTimerThread31);
        handlerSH.removeCallbacks(updateTimerThread32);
        handlerSH.removeCallbacks(updateTimerThread33);
        handler1.removeCallbacks(updateTimerThread1);
        handler1.removeCallbacks(updateTimerThread2);
        handler1.removeCallbacks(updateTimerThread3);
        handler1.removeCallbacks(updateTimerThread4);
        handler1.removeCallbacks(updateTimerThread5);
        handler1.removeCallbacks(updateTimerThread66);
        handler1.removeCallbacks(updateTimerThread7);

        //-----------------------------------------------------------------------------------------------
        // 停止計時器服務
        Intent timerServiceIntentSH1 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH1);

        Intent timerServiceIntentSH2 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH2);

        Intent timerServiceIntentSH3 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH3);

        Intent timerServiceIntentSH4 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH4);

        Intent timerServiceIntentSH5 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH5);

        Intent timerServiceIntentSH6 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH6);

        Intent timerServiceIntentSH7 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH7);

        Intent timerServiceIntentSH8 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH8);

        Intent timerServiceIntentSH9 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH9);

        Intent timerServiceIntentSH10 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH10);

        Intent timerServiceIntentSH11 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH11);

        Intent timerServiceIntentSH12 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH12);

        Intent timerServiceIntentSH13 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH13);

        Intent timerServiceIntentSH14 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH14);

        Intent timerServiceIntentSH15 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH15);

        Intent timerServiceIntentSH16 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH16);

        Intent timerServiceIntentSH17 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH17);

        Intent timerServiceIntentSH18 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH18);

        Intent timerServiceIntentSH19 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH19);

        Intent timerServiceIntentSH20 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH20);

        Intent timerServiceIntentSH21 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH21);

        Intent timerServiceIntentSH22 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH22);

        Intent timerServiceIntentSH23 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH23);

        Intent timerServiceIntentSH24 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH24);

        Intent timerServiceIntentSH25 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH25);

        Intent timerServiceIntentSH26 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH26);

        Intent timerServiceIntentSH27 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH27);

        Intent timerServiceIntentSH28 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH28);

        Intent timerServiceIntentSH29 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH29);

        Intent timerServiceIntentSH30 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH30);

        Intent timerServiceIntentSH31 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH31);

        Intent timerServiceIntentSH32 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH32);

        Intent timerServiceIntentSH33 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntentSH33);

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

        Intent timerServiceIntent66 = new Intent(this,TimerServiceS1.class);
        stopService(timerServiceIntent66);

        //------------------------------------------------------------------------------------------
    }


    @Override
    public void onPause() {
        super.onPause();


        // 在保存計時器1狀態時，使用editorSH1對象進行同步
        synchronized (editorSH101) {
            editorSH101.putBoolean(TIMER_STARTED_KEY_SH101, handlerSH.hasCallbacks(updateTimerThread101));
            editorSH101.putLong(START_TIME_KEY_SH101, startTimeSH101);
            editorSH101.putLong(ELAPSED_TIME_KEY_SH101, timeInMillisecondsSH101);
            editorSH101.putBoolean("people_key101", peopleSH_101);
            editorSH101.putBoolean("flashing_key101", flashingSH101);
            editorSH101.putBoolean("flashingg_key101", flashinggSH101);
            editorSH101.putBoolean("isTimerRunningSH101", isTimerRunningSH101);
            editorSH101.putInt("currentHourSH101", currentHourSH101);
            editorSH101.putInt("currentMinuteSH101", currentMinuteSH101);
            // 保存加時時間到SharedPreferences
            editorSH101.putInt("blueThreshold101", blueThreshold101);
            editorSH101.putInt("yellowThreshold101", yellowThreshold101);
            editorSH101.putInt("redThreshold101", redThreshold101);
            editorSH101.apply();
        }
        synchronized (editorSH102) {
            editorSH102.putBoolean(TIMER_STARTED_KEY_SH102, handlerSH.hasCallbacks(updateTimerThread102));
            editorSH102.putLong(START_TIME_KEY_SH102, startTimeSH102);
            editorSH102.putLong(ELAPSED_TIME_KEY_SH102, timeInMillisecondsSH102);
            editorSH102.putBoolean("people_key102", peopleSH_102);
            editorSH102.putBoolean("flashing_key102", flashingSH102);
            editorSH102.putBoolean("flashingg_key102", flashinggSH102);
            editorSH102.putBoolean("isTimerRunningSH102", isTimerRunningSH102);
            editorSH102.putInt("currentHourSH102", currentHourSH102);
            editorSH102.putInt("currentMinuteSH102", currentMinuteSH102);
            // 保存加時時間到SharedPreferences
            editorSH102.putInt("blueThreshold102", blueThreshold102);
            editorSH102.putInt("yellowThreshold102", yellowThreshold102);
            editorSH102.putInt("redThreshold102", redThreshold102);
            editorSH102.apply();
        }
        synchronized (editorSH103) {
            editorSH103.putBoolean(TIMER_STARTED_KEY_SH103, handlerSH.hasCallbacks(updateTimerThread103));
            editorSH103.putLong(START_TIME_KEY_SH103, startTimeSH103);
            editorSH103.putLong(ELAPSED_TIME_KEY_SH103, timeInMillisecondsSH103);
            editorSH103.putBoolean("people_key103", peopleSH_103);
            editorSH103.putBoolean("flashing_key103", flashingSH103);
            editorSH103.putBoolean("flashingg_key103", flashinggSH103);
            editorSH103.putBoolean("isTimerRunningSH103", isTimerRunningSH103);
            editorSH103.putInt("currentHourSH103", currentHourSH103);
            editorSH103.putInt("currentMinuteSH103", currentMinuteSH103);
            // 保存加時時間到SharedPreferences
            editorSH103.putInt("blueThreshold103", blueThreshold103);
            editorSH103.putInt("yellowThreshold103", yellowThreshold103);
            editorSH103.putInt("redThreshold103", redThreshold103);
            editorSH103.apply();
        }

        synchronized (editorSH104) {
            editorSH104.putBoolean(TIMER_STARTED_KEY_SH104, handlerSH.hasCallbacks(updateTimerThread104));
            editorSH104.putLong(START_TIME_KEY_SH104, startTimeSH104);
            editorSH104.putLong(ELAPSED_TIME_KEY_SH104, timeInMillisecondsSH104);
            editorSH104.putBoolean("people_key104", peopleSH_104);
            editorSH104.putBoolean("flashing_key104", flashingSH104);
            editorSH104.putBoolean("flashingg_key104", flashinggSH104);
            editorSH104.putBoolean("isTimerRunningSH104", isTimerRunningSH104);
            editorSH104.putInt("currentHourSH104", currentHourSH104);
            editorSH104.putInt("currentMinuteSH104", currentMinuteSH104);
            // 保存加時時間到SharedPreferences
            editorSH104.putInt("blueThreshold104", blueThreshold104);
            editorSH104.putInt("yellowThreshold104", yellowThreshold104);
            editorSH104.putInt("redThreshold104", redThreshold104);
            editorSH104.apply();
        }
        synchronized (editorSH105) {
            editorSH105.putBoolean(TIMER_STARTED_KEY_SH105, handlerSH.hasCallbacks(updateTimerThread105));
            editorSH105.putLong(START_TIME_KEY_SH105, startTimeSH105);
            editorSH105.putLong(ELAPSED_TIME_KEY_SH105, timeInMillisecondsSH105);
            editorSH105.putBoolean("people_key105", peopleSH_105);
            editorSH105.putBoolean("flashing_key105", flashingSH105);
            editorSH105.putBoolean("flashingg_key105", flashinggSH105);
            editorSH105.putBoolean("isTimerRunningSH105", isTimerRunningSH105);
            editorSH105.putInt("currentHourSH105", currentHourSH105);
            editorSH105.putInt("currentMinuteSH105", currentMinuteSH105);
            // 保存加時時間到SharedPreferences
            editorSH105.putInt("blueThreshold105", blueThreshold105);
            editorSH105.putInt("yellowThreshold105", yellowThreshold105);
            editorSH105.putInt("redThreshold105", redThreshold105);
            editorSH105.apply();
        }
        synchronized (editorSH106) {
            editorSH106.putBoolean(TIMER_STARTED_KEY_SH106, handlerSH.hasCallbacks(updateTimerThread106));
            editorSH106.putLong(START_TIME_KEY_SH106, startTimeSH106);
            editorSH106.putLong(ELAPSED_TIME_KEY_SH106, timeInMillisecondsSH106);
            editorSH106.putBoolean("people_key106", peopleSH_106);
            editorSH106.putBoolean("flashing_key106", flashingSH106);
            editorSH106.putBoolean("flashingg_key106", flashinggSH106);
            editorSH106.putBoolean("isTimerRunningSH106", isTimerRunningSH106);
            editorSH106.putInt("currentHourSH106", currentHourSH106);
            editorSH106.putInt("currentMinuteSH106", currentMinuteSH106);
            // 保存加時時間到SharedPreferences
            editorSH106.putInt("blueThreshold106", blueThreshold106);
            editorSH106.putInt("yellowThreshold106", yellowThreshold106);
            editorSH106.putInt("redThreshold106", redThreshold106);
            editorSH106.apply();
        }
        synchronized (editorSH107) {
            editorSH107.putBoolean(TIMER_STARTED_KEY_SH107, handlerSH.hasCallbacks(updateTimerThread107));
            editorSH107.putLong(START_TIME_KEY_SH107, startTimeSH107);
            editorSH107.putLong(ELAPSED_TIME_KEY_SH107, timeInMillisecondsSH107);
            editorSH107.putBoolean("people_key107", peopleSH_107);
            editorSH107.putBoolean("flashing_key107", flashingSH107);
            editorSH107.putBoolean("flashingg_key107", flashinggSH107);
            editorSH107.putBoolean("isTimerRunningSH107", isTimerRunningSH107);
            editorSH107.putInt("currentHourSH107", currentHourSH107);
            editorSH107.putInt("currentMinuteSH107", currentMinuteSH107);
            // 保存加時時間到SharedPreferences
            editorSH107.putInt("blueThreshold107", blueThreshold107);
            editorSH107.putInt("yellowThreshold107", yellowThreshold107);
            editorSH107.putInt("redThreshold107", redThreshold107);
            editorSH107.apply();
        }
        synchronized (editorSH8) {
            editorSH8.putBoolean(TIMER_STARTED_KEY_SH8, handlerSH.hasCallbacks(updateTimerThread8));
            editorSH8.putLong(START_TIME_KEY_SH8, startTimeSH8);
            editorSH8.putLong(ELAPSED_TIME_KEY_SH8, timeInMillisecondsSH8);
            editorSH8.putBoolean("people_key8", peopleSH_8);
            editorSH8.putBoolean("flashing_key8", flashingSH8);
            editorSH8.putBoolean("flashingg_key8", flashinggSH8);
            editorSH8.putBoolean("isTimerRunningSH8", isTimerRunningSH8);
            editorSH8.putInt("currentHourSH8", currentHourSH8);
            editorSH8.putInt("currentMinuteSH8", currentMinuteSH8);
            // 保存加時時間到SharedPreferences
            editorSH8.putInt("blueThreshold8", blueThreshold8);
            editorSH8.putInt("yellowThreshold8", yellowThreshold8);
            editorSH8.putInt("redThreshold8", redThreshold8);
            editorSH8.apply();
        }
        synchronized (editorSH9) {
            editorSH9.putBoolean(TIMER_STARTED_KEY_SH9, handlerSH.hasCallbacks(updateTimerThread9));
            editorSH9.putLong(START_TIME_KEY_SH9, startTimeSH9);
            editorSH9.putLong(ELAPSED_TIME_KEY_SH9, timeInMillisecondsSH9);
            editorSH9.putBoolean("people_key9", peopleSH_9);
            editorSH9.putBoolean("flashing_key9", flashingSH9);
            editorSH9.putBoolean("flashingg_key9", flashinggSH9);
            editorSH9.putBoolean("isTimerRunningSH9", isTimerRunningSH9);
            editorSH9.putInt("currentHourSH9", currentHourSH9);
            editorSH9.putInt("currentMinuteSH9", currentMinuteSH9);
            // 保存加時時間到SharedPreferences
            editorSH9.putInt("blueThreshold9", blueThreshold9);
            editorSH9.putInt("yellowThreshold9", yellowThreshold9);
            editorSH9.putInt("redThreshold9", redThreshold9);
            editorSH9.apply();
        }
        synchronized (editorSH10) {
            editorSH10.putBoolean(TIMER_STARTED_KEY_SH10, handlerSH.hasCallbacks(updateTimerThread10));
            editorSH10.putLong(START_TIME_KEY_SH10, startTimeSH10);
            editorSH10.putLong(ELAPSED_TIME_KEY_SH10, timeInMillisecondsSH10);
            editorSH10.putBoolean("people_key10", peopleSH_10);
            editorSH10.putBoolean("flashing_key10", flashingSH10);
            editorSH10.putBoolean("flashingg_key10", flashinggSH10);
            editorSH10.putBoolean("isTimerRunningSH10", isTimerRunningSH10);
            editorSH10.putInt("currentHourSH10", currentHourSH10);
            editorSH10.putInt("currentMinuteSH10", currentMinuteSH10);
            // 保存加時時間到SharedPreferences
            editorSH10.putInt("blueThreshold10", blueThreshold10);
            editorSH10.putInt("yellowThreshold10", yellowThreshold10);
            editorSH10.putInt("redThreshold10", redThreshold10);
            editorSH10.apply();
        }
        synchronized (editorSH11) {
            editorSH11.putBoolean(TIMER_STARTED_KEY_SH11, handlerSH.hasCallbacks(updateTimerThread11));
            editorSH11.putLong(START_TIME_KEY_SH11, startTimeSH11);
            editorSH11.putLong(ELAPSED_TIME_KEY_SH11, timeInMillisecondsSH11);
            editorSH11.putBoolean("people_key11", peopleSH_11);
            editorSH11.putBoolean("flashing_key11", flashingSH11);
            editorSH11.putBoolean("flashingg_key11", flashinggSH11);
            editorSH11.putBoolean("isTimerRunningSH11", isTimerRunningSH11);
            editorSH11.putInt("currentHourSH11", currentHourSH11);
            editorSH11.putInt("currentMinuteSH11", currentMinuteSH11);
            // 保存加時時間到SharedPreferences
            editorSH11.putInt("blueThreshold11", blueThreshold11);
            editorSH11.putInt("yellowThreshold11", yellowThreshold11);
            editorSH11.putInt("redThreshold11", redThreshold11);
            editorSH11.apply();
        }
        synchronized (editorSH12) {
            editorSH12.putBoolean(TIMER_STARTED_KEY_SH12, handlerSH.hasCallbacks(updateTimerThread12));
            editorSH12.putLong(START_TIME_KEY_SH12, startTimeSH12);
            editorSH12.putLong(ELAPSED_TIME_KEY_SH12, timeInMillisecondsSH12);
            editorSH12.putBoolean("people_key12", peopleSH_12);
            editorSH12.putBoolean("flashing_key12", flashingSH12);
            editorSH12.putBoolean("flashingg_key12", flashinggSH12);
            editorSH12.putBoolean("isTimerRunningSH12", isTimerRunningSH12);
            editorSH12.putInt("currentHourSH12", currentHourSH12);
            editorSH12.putInt("currentMinuteSH12", currentMinuteSH12);
            // 保存加時時間到SharedPreferences
            editorSH12.putInt("blueThreshold12", blueThreshold12);
            editorSH12.putInt("yellowThreshold12", yellowThreshold12);
            editorSH12.putInt("redThreshold12", redThreshold12);
            editorSH12.apply();
        }
        synchronized (editorSH13) {
            editorSH13.putBoolean(TIMER_STARTED_KEY_SH13, handlerSH.hasCallbacks(updateTimerThread13));
            editorSH13.putLong(START_TIME_KEY_SH13, startTimeSH13);
            editorSH13.putLong(ELAPSED_TIME_KEY_SH13, timeInMillisecondsSH13);
            editorSH13.putBoolean("people_key13", peopleSH_13);
            editorSH13.putBoolean("flashing_key13", flashingSH13);
            editorSH13.putBoolean("flashingg_key13", flashinggSH13);
            editorSH13.putBoolean("isTimerRunningSH13", isTimerRunningSH13);
            editorSH13.putInt("currentHourSH13", currentHourSH13);
            editorSH13.putInt("currentMinuteSH13", currentMinuteSH13);
            // 保存加時時間到SharedPreferences
            editorSH13.putInt("blueThreshold13", blueThreshold13);
            editorSH13.putInt("yellowThreshold13", yellowThreshold13);
            editorSH13.putInt("redThreshold13", redThreshold13);
            editorSH13.apply();
        }
        synchronized (editorSH14) {
            editorSH14.putBoolean(TIMER_STARTED_KEY_SH14, handlerSH.hasCallbacks(updateTimerThread14));
            editorSH14.putLong(START_TIME_KEY_SH14, startTimeSH14);
            editorSH14.putLong(ELAPSED_TIME_KEY_SH14, timeInMillisecondsSH14);
            editorSH14.putBoolean("people_key14", peopleSH_14);
            editorSH14.putBoolean("flashing_key14", flashingSH14);
            editorSH14.putBoolean("flashingg_key14", flashinggSH14);
            editorSH14.putBoolean("isTimerRunningSH14", isTimerRunningSH14);
            editorSH14.putInt("currentHourSH14", currentHourSH14);
            editorSH14.putInt("currentMinuteSH14", currentMinuteSH14);
            // 保存加時時間到SharedPreferences
            editorSH14.putInt("blueThreshold14", blueThreshold14);
            editorSH14.putInt("yellowThreshold14", yellowThreshold14);
            editorSH14.putInt("redThreshold14", redThreshold14);
            editorSH14.apply();
        }
        synchronized (editorSH15) {
            editorSH15.putBoolean(TIMER_STARTED_KEY_SH15, handlerSH.hasCallbacks(updateTimerThread15));
            editorSH15.putLong(START_TIME_KEY_SH15, startTimeSH15);
            editorSH15.putLong(ELAPSED_TIME_KEY_SH15, timeInMillisecondsSH15);
            editorSH15.putBoolean("people_key15", peopleSH_15);
            editorSH15.putBoolean("flashing_key15", flashingSH15);
            editorSH15.putBoolean("flashingg_key15", flashinggSH15);
            editorSH15.putBoolean("isTimerRunningSH15", isTimerRunningSH15);
            editorSH15.putInt("currentHourSH15", currentHourSH15);
            editorSH15.putInt("currentMinuteSH15", currentMinuteSH15);
            // 保存加時時間到SharedPreferences
            editorSH15.putInt("blueThreshold15", blueThreshold15);
            editorSH15.putInt("yellowThreshold15", yellowThreshold15);
            editorSH15.putInt("redThreshold15", redThreshold15);
            editorSH15.apply();
        }
        synchronized (editorSH16) {
            editorSH16.putBoolean(TIMER_STARTED_KEY_SH16, handlerSH.hasCallbacks(updateTimerThread16));
            editorSH16.putLong(START_TIME_KEY_SH16, startTimeSH16);
            editorSH16.putLong(ELAPSED_TIME_KEY_SH16, timeInMillisecondsSH16);
            editorSH16.putBoolean("people_key16", peopleSH_16);
            editorSH16.putBoolean("flashing_key16", flashingSH16);
            editorSH16.putBoolean("flashingg_key16", flashinggSH16);
            editorSH16.putBoolean("isTimerRunningSH16", isTimerRunningSH16);
            editorSH16.putInt("currentHourSH16", currentHourSH16);
            editorSH16.putInt("currentMinuteSH16", currentMinuteSH16);
            // 保存加時時間到SharedPreferences
            editorSH16.putInt("blueThreshold16", blueThreshold16);
            editorSH16.putInt("yellowThreshold16", yellowThreshold16);
            editorSH16.putInt("redThreshold16", redThreshold16);
            editorSH16.apply();
        }
        synchronized (editorSH17) {
            editorSH17.putBoolean(TIMER_STARTED_KEY_SH17, handlerSH.hasCallbacks(updateTimerThread17));
            editorSH17.putLong(START_TIME_KEY_SH17, startTimeSH17);
            editorSH17.putLong(ELAPSED_TIME_KEY_SH17, timeInMillisecondsSH17);
            editorSH17.putBoolean("people_key17", peopleSH_17);
            editorSH17.putBoolean("flashing_key17", flashingSH17);
            editorSH17.putBoolean("flashingg_key17", flashinggSH17);
            editorSH17.putBoolean("isTimerRunningSH17", isTimerRunningSH17);
            editorSH17.putInt("currentHourSH17", currentHourSH17);
            editorSH17.putInt("currentMinuteSH17", currentMinuteSH17);
            // 保存加時時間到SharedPreferences
            editorSH17.putInt("blueThreshold17", blueThreshold17);
            editorSH17.putInt("yellowThreshold17", yellowThreshold17);
            editorSH17.putInt("redThreshold17", redThreshold17);
            editorSH17.apply();
        }
        synchronized (editorSH18) {
            editorSH18.putBoolean(TIMER_STARTED_KEY_SH18, handlerSH.hasCallbacks(updateTimerThread18));
            editorSH18.putLong(START_TIME_KEY_SH18, startTimeSH18);
            editorSH18.putLong(ELAPSED_TIME_KEY_SH18, timeInMillisecondsSH18);
            editorSH18.putBoolean("people_key18", peopleSH_18);
            editorSH18.putBoolean("flashing_key18", flashingSH18);
            editorSH18.putBoolean("flashingg_key18", flashinggSH18);
            editorSH18.putBoolean("isTimerRunningSH18", isTimerRunningSH18);
            editorSH18.putInt("currentHourSH18", currentHourSH18);
            editorSH18.putInt("currentMinuteSH18", currentMinuteSH18);
            // 保存加時時間到SharedPreferences
            editorSH18.putInt("blueThreshold18", blueThreshold18);
            editorSH18.putInt("yellowThreshold18", yellowThreshold18);
            editorSH18.putInt("redThreshold18", redThreshold18);
            editorSH18.apply();
        }
        synchronized (editorSH19) {
            editorSH19.putBoolean(TIMER_STARTED_KEY_SH19, handlerSH.hasCallbacks(updateTimerThread19));
            editorSH19.putLong(START_TIME_KEY_SH19, startTimeSH19);
            editorSH19.putLong(ELAPSED_TIME_KEY_SH19, timeInMillisecondsSH19);
            editorSH19.putBoolean("people_key19", peopleSH_19);
            editorSH19.putBoolean("flashing_key19", flashingSH19);
            editorSH19.putBoolean("flashingg_key19", flashinggSH19);
            editorSH19.putBoolean("isTimerRunningSH19", isTimerRunningSH19);
            editorSH19.putInt("currentHourSH19", currentHourSH19);
            editorSH19.putInt("currentMinuteSH19", currentMinuteSH19);
            // 保存加時時間到SharedPreferences
            editorSH19.putInt("blueThreshold19", blueThreshold19);
            editorSH19.putInt("yellowThreshold19", yellowThreshold19);
            editorSH19.putInt("redThreshold19", redThreshold19);
            editorSH19.apply();
        }
        synchronized (editorSH20) {
            editorSH20.putBoolean(TIMER_STARTED_KEY_SH20, handlerSH.hasCallbacks(updateTimerThread20));
            editorSH20.putLong(START_TIME_KEY_SH20, startTimeSH20);
            editorSH20.putLong(ELAPSED_TIME_KEY_SH20, timeInMillisecondsSH20);
            editorSH20.putBoolean("people_key20", peopleSH_20);
            editorSH20.putBoolean("flashing_key20", flashingSH20);
            editorSH20.putBoolean("flashingg_key20", flashinggSH20);
            editorSH20.putBoolean("isTimerRunningSH20", isTimerRunningSH20);
            editorSH20.putInt("currentHourSH20", currentHourSH20);
            editorSH20.putInt("currentMinuteSH20", currentMinuteSH20);
            // 保存加時時間到SharedPreferences
            editorSH20.putInt("blueThreshold20", blueThreshold20);
            editorSH20.putInt("yellowThreshold20", yellowThreshold20);
            editorSH20.putInt("redThreshold20", redThreshold20);
            editorSH20.apply();
        }
        synchronized (editorSH21) {
            editorSH21.putBoolean(TIMER_STARTED_KEY_SH21, handlerSH.hasCallbacks(updateTimerThread21));
            editorSH21.putLong(START_TIME_KEY_SH21, startTimeSH21);
            editorSH21.putLong(ELAPSED_TIME_KEY_SH21, timeInMillisecondsSH21);
            editorSH21.putBoolean("people_key21", peopleSH_21);
            editorSH21.putBoolean("flashing_key21", flashingSH21);
            editorSH21.putBoolean("flashingg_key21", flashinggSH21);
            editorSH21.putBoolean("isTimerRunningSH21", isTimerRunningSH21);
            editorSH21.putInt("currentHourSH21", currentHourSH21);
            editorSH21.putInt("currentMinuteSH21", currentMinuteSH21);
            // 保存加時時間到SharedPreferences
            editorSH21.putInt("blueThreshold21", blueThreshold21);
            editorSH21.putInt("yellowThreshold21", yellowThreshold21);
            editorSH21.putInt("redThreshold21", redThreshold21);
            editorSH21.apply();
        }
        synchronized (editorSH22) {
            editorSH22.putBoolean(TIMER_STARTED_KEY_SH22, handlerSH.hasCallbacks(updateTimerThread22));
            editorSH22.putLong(START_TIME_KEY_SH22, startTimeSH22);
            editorSH22.putLong(ELAPSED_TIME_KEY_SH22, timeInMillisecondsSH22);
            editorSH22.putBoolean("people_key22", peopleSH_22);
            editorSH22.putBoolean("flashing_key22", flashingSH22);
            editorSH22.putBoolean("flashingg_key22", flashinggSH22);
            editorSH22.putBoolean("isTimerRunningSH22", isTimerRunningSH22);
            editorSH22.putInt("currentHourSH22", currentHourSH22);
            editorSH22.putInt("currentMinuteSH22", currentMinuteSH22);
            // 保存加時時間到SharedPreferences
            editorSH22.putInt("blueThreshold22", blueThreshold22);
            editorSH22.putInt("yellowThreshold22", yellowThreshold22);
            editorSH22.putInt("redThreshold22", redThreshold22);
            editorSH22.apply();
        }
        synchronized (editorSH23) {
            editorSH23.putBoolean(TIMER_STARTED_KEY_SH23, handlerSH.hasCallbacks(updateTimerThread23));
            editorSH23.putLong(START_TIME_KEY_SH23, startTimeSH23);
            editorSH23.putLong(ELAPSED_TIME_KEY_SH23, timeInMillisecondsSH23);
            editorSH23.putBoolean("people_key23", peopleSH_23);
            editorSH23.putBoolean("flashing_key23", flashingSH23);
            editorSH23.putBoolean("flashingg_key23", flashinggSH23);
            editorSH23.putBoolean("isTimerRunningSH23", isTimerRunningSH23);
            editorSH23.putInt("currentHourSH23", currentHourSH23);
            editorSH23.putInt("currentMinuteSH23", currentMinuteSH23);
            // 保存加時時間到SharedPreferences
            editorSH23.putInt("blueThreshold23", blueThreshold23);
            editorSH23.putInt("yellowThreshold23", yellowThreshold23);
            editorSH23.putInt("redThreshold23", redThreshold23);
            editorSH23.apply();
        }
        synchronized (editorSH24) {
            editorSH24.putBoolean(TIMER_STARTED_KEY_SH24, handlerSH.hasCallbacks(updateTimerThread24));
            editorSH24.putLong(START_TIME_KEY_SH24, startTimeSH24);
            editorSH24.putLong(ELAPSED_TIME_KEY_SH24, timeInMillisecondsSH24);
            editorSH24.putBoolean("people_key24", peopleSH_24);
            editorSH24.putBoolean("flashing_key24", flashingSH24);
            editorSH24.putBoolean("flashingg_key24", flashinggSH24);
            editorSH24.putBoolean("isTimerRunningSH24", isTimerRunningSH24);
            editorSH24.putInt("currentHourSH24", currentHourSH24);
            editorSH24.putInt("currentMinuteSH24", currentMinuteSH24);
            // 保存加時時間到SharedPreferences
            editorSH24.putInt("blueThreshold24", blueThreshold24);
            editorSH24.putInt("yellowThreshold24", yellowThreshold24);
            editorSH24.putInt("redThreshold24", redThreshold24);
            editorSH24.apply();
        }
        synchronized (editorSH25) {
            editorSH25.putBoolean(TIMER_STARTED_KEY_SH25, handlerSH.hasCallbacks(updateTimerThread25));
            editorSH25.putLong(START_TIME_KEY_SH25, startTimeSH25);
            editorSH25.putLong(ELAPSED_TIME_KEY_SH25, timeInMillisecondsSH25);
            editorSH25.putBoolean("people_key25", peopleSH_25);
            editorSH25.putBoolean("flashing_key25", flashingSH25);
            editorSH25.putBoolean("flashingg_key25", flashinggSH25);
            editorSH25.putBoolean("isTimerRunningSH25", isTimerRunningSH25);
            editorSH25.putInt("currentHourSH25", currentHourSH25);
            editorSH25.putInt("currentMinuteSH25", currentMinuteSH25);
            // 保存加時時間到SharedPreferences
            editorSH25.putInt("blueThreshold25", blueThreshold25);
            editorSH25.putInt("yellowThreshold25", yellowThreshold25);
            editorSH25.putInt("redThreshold25", redThreshold25);
            editorSH25.apply();
        }
        synchronized (editorSH26) {
            editorSH26.putBoolean(TIMER_STARTED_KEY_SH26, handlerSH.hasCallbacks(updateTimerThread26));
            editorSH26.putLong(START_TIME_KEY_SH26, startTimeSH26);
            editorSH26.putLong(ELAPSED_TIME_KEY_SH26, timeInMillisecondsSH26);
            editorSH26.putBoolean("people_key26", peopleSH_26);
            editorSH26.putBoolean("flashing_key26", flashingSH26);
            editorSH26.putBoolean("flashingg_key26", flashinggSH26);
            editorSH26.putBoolean("isTimerRunningSH26", isTimerRunningSH26);
            editorSH26.putInt("currentHourSH26", currentHourSH26);
            editorSH26.putInt("currentMinuteSH26", currentMinuteSH26);
            // 保存加時時間到SharedPreferences
            editorSH26.putInt("blueThreshold26", blueThreshold26);
            editorSH26.putInt("yellowThreshold26", yellowThreshold26);
            editorSH26.putInt("redThreshold26", redThreshold26);
            editorSH26.apply();
        }
        synchronized (editorSH27) {
            editorSH27.putBoolean(TIMER_STARTED_KEY_SH27, handlerSH.hasCallbacks(updateTimerThread27));
            editorSH27.putLong(START_TIME_KEY_SH27, startTimeSH27);
            editorSH27.putLong(ELAPSED_TIME_KEY_SH27, timeInMillisecondsSH27);
            editorSH27.putBoolean("people_key27", peopleSH_27);
            editorSH27.putBoolean("flashing_key27", flashingSH27);
            editorSH27.putBoolean("flashingg_key27", flashinggSH27);
            editorSH27.putBoolean("isTimerRunningSH27", isTimerRunningSH27);
            editorSH27.putInt("currentHourSH27", currentHourSH27);
            editorSH27.putInt("currentMinuteSH27", currentMinuteSH27);
            // 保存加時時間到SharedPreferences
            editorSH27.putInt("blueThreshold27", blueThreshold27);
            editorSH27.putInt("yellowThreshold27", yellowThreshold27);
            editorSH27.putInt("redThreshold27", redThreshold27);
            editorSH27.apply();
        }
        synchronized (editorSH28) {
            editorSH28.putBoolean(TIMER_STARTED_KEY_SH28, handlerSH.hasCallbacks(updateTimerThread28));
            editorSH28.putLong(START_TIME_KEY_SH28, startTimeSH28);
            editorSH28.putLong(ELAPSED_TIME_KEY_SH28, timeInMillisecondsSH28);
            editorSH28.putBoolean("people_key28", peopleSH_28);
            editorSH28.putBoolean("flashing_key28", flashingSH28);
            editorSH28.putBoolean("flashingg_key28", flashinggSH28);
            editorSH28.putBoolean("isTimerRunningSH28", isTimerRunningSH28);
            editorSH28.putInt("currentHourSH28", currentHourSH28);
            editorSH28.putInt("currentMinuteSH28", currentMinuteSH28);
            // 保存加時時間到SharedPreferences
            editorSH28.putInt("blueThreshold28", blueThreshold28);
            editorSH28.putInt("yellowThreshold28", yellowThreshold28);
            editorSH28.putInt("redThreshold28", redThreshold28);
            editorSH28.apply();
        }
        synchronized (editorSH29) {
            editorSH29.putBoolean(TIMER_STARTED_KEY_SH29, handlerSH.hasCallbacks(updateTimerThread29));
            editorSH29.putLong(START_TIME_KEY_SH29, startTimeSH29);
            editorSH29.putLong(ELAPSED_TIME_KEY_SH29, timeInMillisecondsSH29);
            editorSH29.putBoolean("people_key29", peopleSH_29);
            editorSH29.putBoolean("flashing_key29", flashingSH29);
            editorSH29.putBoolean("flashingg_key29", flashinggSH29);
            editorSH29.putBoolean("isTimerRunningSH29", isTimerRunningSH29);
            editorSH29.putInt("currentHourSH29", currentHourSH29);
            editorSH29.putInt("currentMinuteSH29", currentMinuteSH29);
            // 保存加時時間到SharedPreferences
            editorSH29.putInt("blueThreshold29", blueThreshold29);
            editorSH29.putInt("yellowThreshold29", yellowThreshold29);
            editorSH29.putInt("redThreshold29", redThreshold29);
            editorSH29.apply();
        }
        synchronized (editorSH30) {
            editorSH30.putBoolean(TIMER_STARTED_KEY_SH30, handlerSH.hasCallbacks(updateTimerThread30));
            editorSH30.putLong(START_TIME_KEY_SH30, startTimeSH30);
            editorSH30.putLong(ELAPSED_TIME_KEY_SH30, timeInMillisecondsSH30);
            editorSH30.putBoolean("people_key30", peopleSH_30);
            editorSH30.putBoolean("flashing_key30", flashingSH30);
            editorSH30.putBoolean("flashingg_key30", flashinggSH30);
            editorSH30.putBoolean("isTimerRunningSH30", isTimerRunningSH30);
            editorSH30.putInt("currentHourSH30", currentHourSH30);
            editorSH30.putInt("currentMinuteSH30", currentMinuteSH30);
            // 保存加時時間到SharedPreferences
            editorSH30.putInt("blueThreshold30", blueThreshold30);
            editorSH30.putInt("yellowThreshold30", yellowThreshold30);
            editorSH30.putInt("redThreshold30", redThreshold30);
            editorSH30.apply();
        }
        synchronized (editorSH31) {
            editorSH31.putBoolean(TIMER_STARTED_KEY_SH31, handlerSH.hasCallbacks(updateTimerThread31));
            editorSH31.putLong(START_TIME_KEY_SH31, startTimeSH31);
            editorSH31.putLong(ELAPSED_TIME_KEY_SH31, timeInMillisecondsSH31);
            editorSH31.putBoolean("people_key31", peopleSH_31);
            editorSH31.putBoolean("flashing_key31", flashingSH31);
            editorSH31.putBoolean("flashingg_key31", flashinggSH31);
            editorSH31.putBoolean("isTimerRunningSH31", isTimerRunningSH31);
            editorSH31.putInt("currentHourSH31", currentHourSH31);
            editorSH31.putInt("currentMinuteSH31", currentMinuteSH31);
            // 保存加時時間到SharedPreferences
            editorSH31.putInt("blueThreshold31", blueThreshold31);
            editorSH31.putInt("yellowThreshold31", yellowThreshold31);
            editorSH31.putInt("redThreshold31", redThreshold31);
            editorSH31.apply();
        }
        synchronized (editorSH32) {
            editorSH32.putBoolean(TIMER_STARTED_KEY_SH32, handlerSH.hasCallbacks(updateTimerThread32));
            editorSH32.putLong(START_TIME_KEY_SH32, startTimeSH32);
            editorSH32.putLong(ELAPSED_TIME_KEY_SH32, timeInMillisecondsSH32);
            editorSH32.putBoolean("people_key32", peopleSH_32);
            editorSH32.putBoolean("flashing_key32", flashingSH32);
            editorSH32.putBoolean("flashingg_key32", flashinggSH32);
            editorSH32.putBoolean("isTimerRunningSH32", isTimerRunningSH32);
            editorSH32.putInt("currentHourSH32", currentHourSH32);
            editorSH32.putInt("currentMinuteSH32", currentMinuteSH32);
            // 保存加時時間到SharedPreferences
            editorSH32.putInt("blueThreshold32", blueThreshold32);
            editorSH32.putInt("yellowThreshold32", yellowThreshold32);
            editorSH32.putInt("redThreshold32", redThreshold32);
            editorSH32.apply();
        }
        synchronized (editorSH33) {
            editorSH33.putBoolean(TIMER_STARTED_KEY_SH33, handlerSH.hasCallbacks(updateTimerThread33));
            editorSH33.putLong(START_TIME_KEY_SH33, startTimeSH33);
            editorSH33.putLong(ELAPSED_TIME_KEY_SH33, timeInMillisecondsSH33);
            editorSH33.putBoolean("people_key33", peopleSH_33);
            editorSH33.putBoolean("flashing_key33", flashingSH33);
            editorSH33.putBoolean("flashingg_key33", flashinggSH33);
            editorSH33.putBoolean("isTimerRunningSH33", isTimerRunningSH33);
            editorSH33.putInt("currentHourSH33", currentHourSH33);
            editorSH33.putInt("currentMinuteSH33", currentMinuteSH33);
            // 保存加時時間到SharedPreferences
            editorSH33.putInt("blueThreshold33", blueThreshold33);
            editorSH33.putInt("yellowThreshold33", yellowThreshold33);
            editorSH33.putInt("redThreshold33", redThreshold33);
            editorSH33.apply();
        }

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

    //------------------------------------------------------------------------------------------
    @Override
    public void onResume() {
        super.onResume();

        synchronized (editorSH101) {
            boolean timerStarted101 = sharedPreferencesSH101.getBoolean(TIMER_STARTED_KEY_SH101, false);
            if (timerStarted101) {
                startTimeSH101 = sharedPreferencesSH101.getLong(START_TIME_KEY_SH101, 0);
                timeInMillisecondsSH101 = sharedPreferencesSH101.getLong(ELAPSED_TIME_KEY_SH101, 0);
                secSH101 = (int) (timeInMillisecondsSH101 / 1000);
                handlerSH.postDelayed(updateTimerThread101, 0);
            }
            peopleSH_101 = sharedPreferencesSH101.getBoolean("people_key101", false);
            flashingSH101 = sharedPreferencesSH101.getBoolean("flashing_key101", false);
            flashinggSH101 = sharedPreferencesSH101.getBoolean("flashingg_key101", false);
            isTimerRunningSH101 = sharedPreferencesSH101.getBoolean("isTimerRunningSH101", false);
            currentHourSH101 = sharedPreferencesSH101.getInt("currentHourSH101", currentHourSH101);
            currentMinuteSH101 = sharedPreferencesSH101.getInt("currentMinuteSH101", currentMinuteSH101);

            // 恢复加時時間  測試用
            blueThreshold101 = sharedPreferencesSH101.getInt("blueThreshold101", originalblueThresholdSH2);
            yellowThreshold101 = sharedPreferencesSH101.getInt("yellowThreshold101", originalyellowThresholdSH2);
            redThreshold101 = sharedPreferencesSH101.getInt("redThreshold101", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor101();
        }
        synchronized (editorSH102) {
            boolean timerStarted102 = sharedPreferencesSH102.getBoolean(TIMER_STARTED_KEY_SH102, false);
            if (timerStarted102) {
                startTimeSH102 = sharedPreferencesSH102.getLong(START_TIME_KEY_SH102, 0);
                timeInMillisecondsSH102 = sharedPreferencesSH102.getLong(ELAPSED_TIME_KEY_SH102, 0);
                secSH102 = (int) (timeInMillisecondsSH102 / 1000);
                handlerSH.postDelayed(updateTimerThread102, 0);
            }
            peopleSH_102 = sharedPreferencesSH102.getBoolean("people_key102", false);
            flashingSH102 = sharedPreferencesSH102.getBoolean("flashing_key102", false);
            flashinggSH102 = sharedPreferencesSH102.getBoolean("flashingg_key102", false);
            isTimerRunningSH102 = sharedPreferencesSH102.getBoolean("isTimerRunningSH102", false);
            currentHourSH102 = sharedPreferencesSH102.getInt("currentHourSH102", currentHourSH102);
            currentMinuteSH102 = sharedPreferencesSH102.getInt("currentMinuteSH102", currentMinuteSH102);

            // 恢复加時時間  測試用
            blueThreshold102 = sharedPreferencesSH102.getInt("blueThreshold102", originalblueThresholdSH2);
            yellowThreshold102 = sharedPreferencesSH102.getInt("yellowThreshold102", originalyellowThresholdSH2);
            redThreshold102 = sharedPreferencesSH102.getInt("redThreshold102", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor102();
        }
        synchronized (editorSH103) {
            boolean timerStarted103 = sharedPreferencesSH103.getBoolean(TIMER_STARTED_KEY_SH103, false);
            if (timerStarted103) {
                startTimeSH103 = sharedPreferencesSH103.getLong(START_TIME_KEY_SH103, 0);
                timeInMillisecondsSH103 = sharedPreferencesSH103.getLong(ELAPSED_TIME_KEY_SH103, 0);
                secSH103 = (int) (timeInMillisecondsSH103 / 1000);
                handlerSH.postDelayed(updateTimerThread103, 0);
            }
            peopleSH_103 = sharedPreferencesSH103.getBoolean("people_key103", false);
            flashingSH103 = sharedPreferencesSH103.getBoolean("flashing_key103", false);
            flashinggSH103 = sharedPreferencesSH103.getBoolean("flashingg_key103", false);
            isTimerRunningSH103 = sharedPreferencesSH103.getBoolean("isTimerRunningSH103", false);
            currentHourSH103 = sharedPreferencesSH103.getInt("currentHourSH103", currentHourSH103);
            currentMinuteSH103 = sharedPreferencesSH103.getInt("currentMinuteSH103", currentMinuteSH103);

            // 恢复加時時間  測試用
            blueThreshold103 = sharedPreferencesSH103.getInt("blueThreshold103", originalblueThresholdSH2);
            yellowThreshold103 = sharedPreferencesSH103.getInt("yellowThreshold103", originalyellowThresholdSH2);
            redThreshold103 = sharedPreferencesSH103.getInt("redThreshold103", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor103();
        }
        synchronized (editorSH104) {
            boolean timerStarted104 = sharedPreferencesSH104.getBoolean(TIMER_STARTED_KEY_SH104, false);
            if (timerStarted104) {
                startTimeSH104 = sharedPreferencesSH104.getLong(START_TIME_KEY_SH104, 0);
                timeInMillisecondsSH104 = sharedPreferencesSH104.getLong(ELAPSED_TIME_KEY_SH104, 0);
                secSH104 = (int) (timeInMillisecondsSH104 / 1000);
                handlerSH.postDelayed(updateTimerThread104, 0);
            }
            peopleSH_104 = sharedPreferencesSH104.getBoolean("people_key104", false);
            flashingSH104 = sharedPreferencesSH104.getBoolean("flashing_key104", false);
            flashinggSH104 = sharedPreferencesSH104.getBoolean("flashingg_key104", false);
            isTimerRunningSH104 = sharedPreferencesSH104.getBoolean("isTimerRunningSH104", false);
            currentHourSH104 = sharedPreferencesSH104.getInt("currentHourSH104", currentHourSH104);
            currentMinuteSH104 = sharedPreferencesSH104.getInt("currentMinuteSH104", currentMinuteSH104);

            // 恢复加時時間  測試用
            blueThreshold104 = sharedPreferencesSH104.getInt("blueThreshold104", originalblueThresholdSH2);
            yellowThreshold104 = sharedPreferencesSH104.getInt("yellowThreshold104", originalyellowThresholdSH2);
            redThreshold104 = sharedPreferencesSH104.getInt("redThreshold104", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor104();
        }
        synchronized (editorSH105) {
            boolean timerStarted105 = sharedPreferencesSH105.getBoolean(TIMER_STARTED_KEY_SH105, false);
            if (timerStarted105) {
                startTimeSH105 = sharedPreferencesSH105.getLong(START_TIME_KEY_SH105, 0);
                timeInMillisecondsSH105 = sharedPreferencesSH105.getLong(ELAPSED_TIME_KEY_SH105, 0);
                secSH105 = (int) (timeInMillisecondsSH105 / 1000);
                handlerSH.postDelayed(updateTimerThread105, 0);
            }
            peopleSH_105 = sharedPreferencesSH105.getBoolean("people_key105", false);
            flashingSH105 = sharedPreferencesSH105.getBoolean("flashing_key105", false);
            flashinggSH105 = sharedPreferencesSH105.getBoolean("flashingg_key105", false);
            isTimerRunningSH105 = sharedPreferencesSH105.getBoolean("isTimerRunningSH105", false);
            currentHourSH105 = sharedPreferencesSH105.getInt("currentHourSH105", currentHourSH105);
            currentMinuteSH105 = sharedPreferencesSH105.getInt("currentMinuteSH105", currentMinuteSH105);

            // 恢复加時時間  測試用
            blueThreshold105 = sharedPreferencesSH105.getInt("blueThreshold105", originalblueThresholdSH2);
            yellowThreshold105 = sharedPreferencesSH105.getInt("yellowThreshold105", originalyellowThresholdSH2);
            redThreshold105 = sharedPreferencesSH105.getInt("redThreshold105", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor105();
        }
        synchronized (editorSH106) {
            boolean timerStarted106 = sharedPreferencesSH106.getBoolean(TIMER_STARTED_KEY_SH106, false);
            if (timerStarted106) {
                startTimeSH106 = sharedPreferencesSH106.getLong(START_TIME_KEY_SH106, 0);
                timeInMillisecondsSH106 = sharedPreferencesSH106.getLong(ELAPSED_TIME_KEY_SH106, 0);
                secSH106 = (int) (timeInMillisecondsSH106 / 1000);
                handlerSH.postDelayed(updateTimerThread106, 0);
            }
            peopleSH_106 = sharedPreferencesSH106.getBoolean("people_key106", false);
            flashingSH106 = sharedPreferencesSH106.getBoolean("flashing_key106", false);
            flashinggSH106 = sharedPreferencesSH106.getBoolean("flashingg_key106", false);
            isTimerRunningSH106 = sharedPreferencesSH106.getBoolean("isTimerRunningSH106", false);
            currentHourSH106 = sharedPreferencesSH106.getInt("currentHourSH106", currentHourSH106);
            currentMinuteSH106 = sharedPreferencesSH106.getInt("currentMinuteSH106", currentMinuteSH106);

            // 恢复加時時間  測試用
            blueThreshold106 = sharedPreferencesSH106.getInt("blueThreshold106", originalblueThresholdSH2);
            yellowThreshold106 = sharedPreferencesSH106.getInt("yellowThreshold106", originalyellowThresholdSH2);
            redThreshold106 = sharedPreferencesSH106.getInt("redThreshold106", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor106();
        }
        synchronized (editorSH107) {
            boolean timerStarted107 = sharedPreferencesSH107.getBoolean(TIMER_STARTED_KEY_SH107, false);
            if (timerStarted107) {
                startTimeSH107 = sharedPreferencesSH107.getLong(START_TIME_KEY_SH107, 0);
                timeInMillisecondsSH107 = sharedPreferencesSH107.getLong(ELAPSED_TIME_KEY_SH107, 0);
                secSH107 = (int) (timeInMillisecondsSH107 / 1000);
                handlerSH.postDelayed(updateTimerThread107, 0);
            }
            peopleSH_107 = sharedPreferencesSH107.getBoolean("people_key107", false);
            flashingSH107 = sharedPreferencesSH107.getBoolean("flashing_key107", false);
            flashinggSH107 = sharedPreferencesSH107.getBoolean("flashingg_key107", false);
            isTimerRunningSH107 = sharedPreferencesSH107.getBoolean("isTimerRunningSH107", false);
            currentHourSH107 = sharedPreferencesSH107.getInt("currentHourSH107", currentHourSH107);
            currentMinuteSH107 = sharedPreferencesSH107.getInt("currentMinuteSH107", currentMinuteSH107);

            // 恢复加時時間  測試用
            blueThreshold107 = sharedPreferencesSH107.getInt("blueThreshold107", originalblueThresholdSH2);
            yellowThreshold107 = sharedPreferencesSH107.getInt("yellowThreshold107", originalyellowThresholdSH2);
            redThreshold107 = sharedPreferencesSH107.getInt("redThreshold107", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor107();
        }
        synchronized (editorSH8) {
            boolean timerStarted8 = sharedPreferencesSH8.getBoolean(TIMER_STARTED_KEY_SH8, false);
            if (timerStarted8) {
                startTimeSH8 = sharedPreferencesSH8.getLong(START_TIME_KEY_SH8, 0);
                timeInMillisecondsSH8 = sharedPreferencesSH8.getLong(ELAPSED_TIME_KEY_SH8, 0);
                secSH8 = (int) (timeInMillisecondsSH8 / 1000);
                handlerSH.postDelayed(updateTimerThread8, 0);
            }
            peopleSH_8 = sharedPreferencesSH8.getBoolean("people_key8", false);
            flashingSH8 = sharedPreferencesSH8.getBoolean("flashing_key8", false);
            flashinggSH8 = sharedPreferencesSH8.getBoolean("flashingg_key8", false);
            isTimerRunningSH8 = sharedPreferencesSH8.getBoolean("isTimerRunningSH8", false);
            currentHourSH8 = sharedPreferencesSH8.getInt("currentHourSH8", currentHourSH8);
            currentMinuteSH8 = sharedPreferencesSH8.getInt("currentMinuteSH8", currentMinuteSH8);

            // 恢复加時時間  測試用
            blueThreshold8 = sharedPreferencesSH8.getInt("blueThreshold8", originalblueThresholdSH2);
            yellowThreshold8 = sharedPreferencesSH8.getInt("yellowThreshold8", originalyellowThresholdSH2);
            redThreshold8 = sharedPreferencesSH8.getInt("redThreshold8", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor8();
        }
        synchronized (editorSH9) {
            boolean timerStarted9 = sharedPreferencesSH9.getBoolean(TIMER_STARTED_KEY_SH9, false);
            if (timerStarted9) {
                startTimeSH9 = sharedPreferencesSH9.getLong(START_TIME_KEY_SH9, 0);
                timeInMillisecondsSH9 = sharedPreferencesSH9.getLong(ELAPSED_TIME_KEY_SH9, 0);
                secSH9 = (int) (timeInMillisecondsSH9 / 1000);
                handlerSH.postDelayed(updateTimerThread9, 0);
            }
            peopleSH_9 = sharedPreferencesSH9.getBoolean("people_key9", false);
            flashingSH9 = sharedPreferencesSH9.getBoolean("flashing_key9", false);
            flashinggSH9 = sharedPreferencesSH9.getBoolean("flashingg_key9", false);
            isTimerRunningSH9 = sharedPreferencesSH9.getBoolean("isTimerRunningSH9", false);
            currentHourSH9 = sharedPreferencesSH9.getInt("currentHourSH9", currentHourSH9);
            currentMinuteSH9 = sharedPreferencesSH9.getInt("currentMinuteSH9", currentMinuteSH9);

            // 恢复加時時間  測試用
            blueThreshold9 = sharedPreferencesSH9.getInt("blueThreshold9", originalblueThresholdSH2);
            yellowThreshold9 = sharedPreferencesSH9.getInt("yellowThreshold9", originalyellowThresholdSH2);
            redThreshold9 = sharedPreferencesSH9.getInt("redThreshold9", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor9();
        }
        synchronized (editorSH10) {
            boolean timerStarted10 = sharedPreferencesSH10.getBoolean(TIMER_STARTED_KEY_SH10, false);
            if (timerStarted10) {
                startTimeSH10 = sharedPreferencesSH10.getLong(START_TIME_KEY_SH10, 0);
                timeInMillisecondsSH10 = sharedPreferencesSH10.getLong(ELAPSED_TIME_KEY_SH10, 0);
                secSH10 = (int) (timeInMillisecondsSH10 / 1000);
                handlerSH.postDelayed(updateTimerThread10, 0);
            }
            peopleSH_10 = sharedPreferencesSH10.getBoolean("people_key10", false);
            flashingSH10 = sharedPreferencesSH10.getBoolean("flashing_key10", false);
            flashinggSH10 = sharedPreferencesSH10.getBoolean("flashingg_key10", false);
            isTimerRunningSH10 = sharedPreferencesSH10.getBoolean("isTimerRunningSH10", false);
            currentHourSH10 = sharedPreferencesSH10.getInt("currentHourSH10", currentHourSH10);
            currentMinuteSH10 = sharedPreferencesSH10.getInt("currentMinuteSH10", currentMinuteSH10);

            // 恢复加時時間  測試用
            blueThreshold10 = sharedPreferencesSH10.getInt("blueThreshold10", originalblueThresholdSH2);
            yellowThreshold10 = sharedPreferencesSH10.getInt("yellowThreshold10", originalyellowThresholdSH2);
            redThreshold10 = sharedPreferencesSH10.getInt("redThreshold10", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor10();
        }
        synchronized (editorSH11) {
            boolean timerStarted11 = sharedPreferencesSH11.getBoolean(TIMER_STARTED_KEY_SH11, false);
            if (timerStarted11) {
                startTimeSH11 = sharedPreferencesSH11.getLong(START_TIME_KEY_SH11, 0);
                timeInMillisecondsSH11 = sharedPreferencesSH11.getLong(ELAPSED_TIME_KEY_SH11, 0);
                secSH11 = (int) (timeInMillisecondsSH11 / 1000);
                handlerSH.postDelayed(updateTimerThread11, 0);
            }
            peopleSH_11 = sharedPreferencesSH11.getBoolean("people_key11", false);
            flashingSH11 = sharedPreferencesSH11.getBoolean("flashing_key11", false);
            flashinggSH11 = sharedPreferencesSH11.getBoolean("flashingg_key11", false);
            isTimerRunningSH11 = sharedPreferencesSH11.getBoolean("isTimerRunningSH11", false);
            currentHourSH11 = sharedPreferencesSH11.getInt("currentHourSH11", currentHourSH11);
            currentMinuteSH11 = sharedPreferencesSH11.getInt("currentMinuteSH11", currentMinuteSH11);

            // 恢复加時時間  測試用
            blueThreshold11 = sharedPreferencesSH11.getInt("blueThreshold11", originalblueThresholdSH2);
            yellowThreshold11 = sharedPreferencesSH11.getInt("yellowThreshold11", originalyellowThresholdSH2);
            redThreshold11 = sharedPreferencesSH11.getInt("redThreshold11", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor11();
        }
        synchronized (editorSH12) {
            boolean timerStarted12 = sharedPreferencesSH12.getBoolean(TIMER_STARTED_KEY_SH12, false);
            if (timerStarted12) {
                startTimeSH12 = sharedPreferencesSH12.getLong(START_TIME_KEY_SH12, 0);
                timeInMillisecondsSH12 = sharedPreferencesSH12.getLong(ELAPSED_TIME_KEY_SH12, 0);
                secSH12 = (int) (timeInMillisecondsSH12 / 1000);
                handlerSH.postDelayed(updateTimerThread12, 0);
            }
            peopleSH_12 = sharedPreferencesSH12.getBoolean("people_key12", false);
            flashingSH12 = sharedPreferencesSH12.getBoolean("flashing_key12", false);
            flashinggSH12 = sharedPreferencesSH12.getBoolean("flashingg_key12", false);
            isTimerRunningSH12 = sharedPreferencesSH12.getBoolean("isTimerRunningSH12", false);
            currentHourSH12 = sharedPreferencesSH12.getInt("currentHourSH12", currentHourSH12);
            currentMinuteSH12 = sharedPreferencesSH12.getInt("currentMinuteSH12", currentMinuteSH12);

            // 恢复加時時間  測試用
            blueThreshold12 = sharedPreferencesSH12.getInt("blueThreshold12", originalblueThresholdSH2);
            yellowThreshold12 = sharedPreferencesSH12.getInt("yellowThreshold12", originalyellowThresholdSH2);
            redThreshold12 = sharedPreferencesSH12.getInt("redThreshold12", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor12();
        }
        synchronized (editorSH13) {
            boolean timerStarted13 = sharedPreferencesSH13.getBoolean(TIMER_STARTED_KEY_SH13, false);
            if (timerStarted13) {
                startTimeSH13 = sharedPreferencesSH13.getLong(START_TIME_KEY_SH13, 0);
                timeInMillisecondsSH13 = sharedPreferencesSH13.getLong(ELAPSED_TIME_KEY_SH13, 0);
                secSH13 = (int) (timeInMillisecondsSH13 / 1000);
                handlerSH.postDelayed(updateTimerThread13, 0);
            }
            peopleSH_13 = sharedPreferencesSH13.getBoolean("people_key13", false);
            flashingSH13 = sharedPreferencesSH13.getBoolean("flashing_key13", false);
            flashinggSH13 = sharedPreferencesSH13.getBoolean("flashingg_key13", false);
            isTimerRunningSH13 = sharedPreferencesSH13.getBoolean("isTimerRunningSH13", false);
            currentHourSH13 = sharedPreferencesSH13.getInt("currentHourSH13", currentHourSH13);
            currentMinuteSH13 = sharedPreferencesSH13.getInt("currentMinuteSH13", currentMinuteSH13);

            // 恢复加時時間  測試用
            blueThreshold13 = sharedPreferencesSH13.getInt("blueThreshold13", originalblueThresholdSH2);
            yellowThreshold13 = sharedPreferencesSH13.getInt("yellowThreshold13", originalyellowThresholdSH2);
            redThreshold13 = sharedPreferencesSH13.getInt("redThreshold13", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor13();
        }
        synchronized (editorSH14) {
            boolean timerStarted14 = sharedPreferencesSH14.getBoolean(TIMER_STARTED_KEY_SH14, false);
            if (timerStarted14) {
                startTimeSH14 = sharedPreferencesSH14.getLong(START_TIME_KEY_SH14, 0);
                timeInMillisecondsSH14 = sharedPreferencesSH14.getLong(ELAPSED_TIME_KEY_SH14, 0);
                secSH14 = (int) (timeInMillisecondsSH14 / 1000);
                handlerSH.postDelayed(updateTimerThread14, 0);
            }
            peopleSH_14 = sharedPreferencesSH14.getBoolean("people_key14", false);
            flashingSH14 = sharedPreferencesSH14.getBoolean("flashing_key14", false);
            flashinggSH14 = sharedPreferencesSH14.getBoolean("flashingg_key14", false);
            isTimerRunningSH14 = sharedPreferencesSH14.getBoolean("isTimerRunningSH14", false);
            currentHourSH14 = sharedPreferencesSH14.getInt("currentHourSH14", currentHourSH14);
            currentMinuteSH14 = sharedPreferencesSH14.getInt("currentMinuteSH14", currentMinuteSH14);

            // 恢复加時時間  測試用
            blueThreshold14 = sharedPreferencesSH14.getInt("blueThreshold14", originalblueThresholdSH2);
            yellowThreshold14 = sharedPreferencesSH14.getInt("yellowThreshold14", originalyellowThresholdSH2);
            redThreshold14 = sharedPreferencesSH14.getInt("redThreshold14", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor14();
        }
        synchronized (editorSH15) {
            boolean timerStarted15 = sharedPreferencesSH15.getBoolean(TIMER_STARTED_KEY_SH15, false);
            if (timerStarted15) {
                startTimeSH15 = sharedPreferencesSH15.getLong(START_TIME_KEY_SH15, 0);
                timeInMillisecondsSH15 = sharedPreferencesSH15.getLong(ELAPSED_TIME_KEY_SH15, 0);
                secSH15 = (int) (timeInMillisecondsSH15 / 1000);
                handlerSH.postDelayed(updateTimerThread15, 0);
            }
            peopleSH_15 = sharedPreferencesSH15.getBoolean("people_key15", false);
            flashingSH15 = sharedPreferencesSH15.getBoolean("flashing_key15", false);
            flashinggSH15 = sharedPreferencesSH15.getBoolean("flashingg_key15", false);
            isTimerRunningSH15 = sharedPreferencesSH15.getBoolean("isTimerRunningSH15", false);
            currentHourSH15 = sharedPreferencesSH15.getInt("currentHourSH15", currentHourSH15);
            currentMinuteSH15 = sharedPreferencesSH15.getInt("currentMinuteSH15", currentMinuteSH15);

            // 恢复加時時間  測試用
            blueThreshold15 = sharedPreferencesSH15.getInt("blueThreshold15", originalblueThresholdSH2);
            yellowThreshold15 = sharedPreferencesSH15.getInt("yellowThreshold15", originalyellowThresholdSH2);
            redThreshold15 = sharedPreferencesSH15.getInt("redThreshold15", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor15();
        }
        synchronized (editorSH16) {
            boolean timerStarted16 = sharedPreferencesSH16.getBoolean(TIMER_STARTED_KEY_SH16, false);
            if (timerStarted16) {
                startTimeSH16 = sharedPreferencesSH16.getLong(START_TIME_KEY_SH16, 0);
                timeInMillisecondsSH16 = sharedPreferencesSH16.getLong(ELAPSED_TIME_KEY_SH16, 0);
                secSH16 = (int) (timeInMillisecondsSH16 / 1000);
                handlerSH.postDelayed(updateTimerThread16, 0);
            }
            peopleSH_16 = sharedPreferencesSH16.getBoolean("people_key16", false);
            flashingSH16 = sharedPreferencesSH16.getBoolean("flashing_key16", false);
            flashinggSH16 = sharedPreferencesSH16.getBoolean("flashingg_key16", false);
            isTimerRunningSH16 = sharedPreferencesSH16.getBoolean("isTimerRunningSH16", false);
            currentHourSH16 = sharedPreferencesSH16.getInt("currentHourSH16", currentHourSH16);
            currentMinuteSH16 = sharedPreferencesSH16.getInt("currentMinuteSH16", currentMinuteSH16);

            // 恢复加時時間  測試用
            blueThreshold16 = sharedPreferencesSH16.getInt("blueThreshold16", originalblueThresholdSH2);
            yellowThreshold16 = sharedPreferencesSH16.getInt("yellowThreshold16", originalyellowThresholdSH2);
            redThreshold16 = sharedPreferencesSH16.getInt("redThreshold16", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor16();
        }
        synchronized (editorSH17) {
            boolean timerStarted17 = sharedPreferencesSH17.getBoolean(TIMER_STARTED_KEY_SH17, false);
            if (timerStarted17) {
                startTimeSH17 = sharedPreferencesSH17.getLong(START_TIME_KEY_SH17, 0);
                timeInMillisecondsSH17 = sharedPreferencesSH17.getLong(ELAPSED_TIME_KEY_SH17, 0);
                secSH17 = (int) (timeInMillisecondsSH17 / 1000);
                handlerSH.postDelayed(updateTimerThread17, 0);
            }
            peopleSH_17 = sharedPreferencesSH17.getBoolean("people_key17", false);
            flashingSH17 = sharedPreferencesSH17.getBoolean("flashing_key17", false);
            flashinggSH17 = sharedPreferencesSH17.getBoolean("flashingg_key17", false);
            isTimerRunningSH17 = sharedPreferencesSH17.getBoolean("isTimerRunningSH17", false);
            currentHourSH17 = sharedPreferencesSH17.getInt("currentHourSH17", currentHourSH17);
            currentMinuteSH17 = sharedPreferencesSH17.getInt("currentMinuteSH17", currentMinuteSH17);

            // 恢复加時時間  測試用
            blueThreshold17 = sharedPreferencesSH17.getInt("blueThreshold17", originalblueThresholdSH2);
            yellowThreshold17 = sharedPreferencesSH17.getInt("yellowThreshold17", originalyellowThresholdSH2);
            redThreshold17 = sharedPreferencesSH17.getInt("redThreshold17", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor17();
        }
        synchronized (editorSH18) {
            boolean timerStarted18 = sharedPreferencesSH18.getBoolean(TIMER_STARTED_KEY_SH18, false);
            if (timerStarted18) {
                startTimeSH18 = sharedPreferencesSH18.getLong(START_TIME_KEY_SH18, 0);
                timeInMillisecondsSH18 = sharedPreferencesSH18.getLong(ELAPSED_TIME_KEY_SH18, 0);
                secSH18 = (int) (timeInMillisecondsSH18 / 1000);
                handlerSH.postDelayed(updateTimerThread18, 0);
            }
            peopleSH_18 = sharedPreferencesSH18.getBoolean("people_key18", false);
            flashingSH18 = sharedPreferencesSH18.getBoolean("flashing_key18", false);
            flashinggSH18 = sharedPreferencesSH18.getBoolean("flashingg_key18", false);
            isTimerRunningSH18 = sharedPreferencesSH18.getBoolean("isTimerRunningSH18", false);
            currentHourSH18 = sharedPreferencesSH18.getInt("currentHourSH18", currentHourSH18);
            currentMinuteSH18 = sharedPreferencesSH18.getInt("currentMinuteSH18", currentMinuteSH18);

            // 恢复加時時間  測試用
            blueThreshold18 = sharedPreferencesSH18.getInt("blueThreshold18", originalblueThresholdSH2);
            yellowThreshold18 = sharedPreferencesSH18.getInt("yellowThreshold18", originalyellowThresholdSH2);
            redThreshold18 = sharedPreferencesSH18.getInt("redThreshold18", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor18();
        }
        synchronized (editorSH19) {
            boolean timerStarted19 = sharedPreferencesSH19.getBoolean(TIMER_STARTED_KEY_SH19, false);
            if (timerStarted19) {
                startTimeSH19 = sharedPreferencesSH19.getLong(START_TIME_KEY_SH19, 0);
                timeInMillisecondsSH19 = sharedPreferencesSH19.getLong(ELAPSED_TIME_KEY_SH19, 0);
                secSH19 = (int) (timeInMillisecondsSH19 / 1000);
                handlerSH.postDelayed(updateTimerThread19, 0);
            }
            peopleSH_19 = sharedPreferencesSH19.getBoolean("people_key19", false);
            flashingSH19 = sharedPreferencesSH19.getBoolean("flashing_key19", false);
            flashinggSH19 = sharedPreferencesSH19.getBoolean("flashingg_key19", false);
            isTimerRunningSH19 = sharedPreferencesSH19.getBoolean("isTimerRunningSH19", false);
            currentHourSH19 = sharedPreferencesSH19.getInt("currentHourSH19", currentHourSH19);
            currentMinuteSH19 = sharedPreferencesSH19.getInt("currentMinuteSH19", currentMinuteSH19);

            // 恢复加時時間  測試用
            blueThreshold19 = sharedPreferencesSH19.getInt("blueThreshold19", originalblueThresholdSH2);
            yellowThreshold19 = sharedPreferencesSH19.getInt("yellowThreshold19", originalyellowThresholdSH2);
            redThreshold19 = sharedPreferencesSH19.getInt("redThreshold19", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor19();
        }
        synchronized (editorSH20) {
            boolean timerStarted20 = sharedPreferencesSH20.getBoolean(TIMER_STARTED_KEY_SH20, false);
            if (timerStarted20) {
                startTimeSH20 = sharedPreferencesSH20.getLong(START_TIME_KEY_SH20, 0);
                timeInMillisecondsSH20 = sharedPreferencesSH20.getLong(ELAPSED_TIME_KEY_SH20, 0);
                secSH20 = (int) (timeInMillisecondsSH20 / 1000);
                handlerSH.postDelayed(updateTimerThread20, 0);
            }
            peopleSH_20 = sharedPreferencesSH20.getBoolean("people_key20", false);
            flashingSH20 = sharedPreferencesSH20.getBoolean("flashing_key20", false);
            flashinggSH20 = sharedPreferencesSH20.getBoolean("flashingg_key20", false);
            isTimerRunningSH20 = sharedPreferencesSH20.getBoolean("isTimerRunningSH20", false);
            currentHourSH20 = sharedPreferencesSH20.getInt("currentHourSH20", currentHourSH20);
            currentMinuteSH20 = sharedPreferencesSH20.getInt("currentMinuteSH20", currentMinuteSH20);

            // 恢复加時時間  測試用
            blueThreshold20 = sharedPreferencesSH20.getInt("blueThreshold20", originalblueThresholdSH2);
            yellowThreshold20 = sharedPreferencesSH20.getInt("yellowThreshold20", originalyellowThresholdSH2);
            redThreshold20 = sharedPreferencesSH20.getInt("redThreshold20", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor20();
        }
        synchronized (editorSH21) {
            boolean timerStarted21 = sharedPreferencesSH21.getBoolean(TIMER_STARTED_KEY_SH21, false);
            if (timerStarted21) {
                startTimeSH21 = sharedPreferencesSH21.getLong(START_TIME_KEY_SH21, 0);
                timeInMillisecondsSH21 = sharedPreferencesSH21.getLong(ELAPSED_TIME_KEY_SH21, 0);
                secSH21 = (int) (timeInMillisecondsSH21 / 1000);
                handlerSH.postDelayed(updateTimerThread21, 0);
            }
            peopleSH_21 = sharedPreferencesSH21.getBoolean("people_key21", false);
            flashingSH21 = sharedPreferencesSH21.getBoolean("flashing_key21", false);
            flashinggSH21 = sharedPreferencesSH21.getBoolean("flashingg_key21", false);
            isTimerRunningSH21 = sharedPreferencesSH21.getBoolean("isTimerRunningSH21", false);
            currentHourSH21 = sharedPreferencesSH21.getInt("currentHourSH21", currentHourSH21);
            currentMinuteSH21 = sharedPreferencesSH21.getInt("currentMinuteSH21", currentMinuteSH21);

            // 恢复加時時間  測試用
            blueThreshold21 = sharedPreferencesSH21.getInt("blueThreshold21", originalblueThresholdSH2);
            yellowThreshold21 = sharedPreferencesSH21.getInt("yellowThreshold21", originalyellowThresholdSH2);
            redThreshold21 = sharedPreferencesSH21.getInt("redThreshold21", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor21();
        }
        synchronized (editorSH22) {
            boolean timerStarted22 = sharedPreferencesSH22.getBoolean(TIMER_STARTED_KEY_SH22, false);
            if (timerStarted22) {
                startTimeSH22 = sharedPreferencesSH22.getLong(START_TIME_KEY_SH22, 0);
                timeInMillisecondsSH22 = sharedPreferencesSH22.getLong(ELAPSED_TIME_KEY_SH22, 0);
                secSH22 = (int) (timeInMillisecondsSH22 / 1000);
                handlerSH.postDelayed(updateTimerThread22, 0);
            }
            peopleSH_22 = sharedPreferencesSH22.getBoolean("people_key22", false);
            flashingSH22 = sharedPreferencesSH22.getBoolean("flashing_key22", false);
            flashinggSH22 = sharedPreferencesSH22.getBoolean("flashingg_key22", false);
            isTimerRunningSH22 = sharedPreferencesSH22.getBoolean("isTimerRunningSH22", false);
            currentHourSH22 = sharedPreferencesSH22.getInt("currentHourSH22", currentHourSH22);
            currentMinuteSH22 = sharedPreferencesSH22.getInt("currentMinuteSH22", currentMinuteSH22);

            // 恢复加時時間  測試用
            blueThreshold22 = sharedPreferencesSH22.getInt("blueThreshold22", originalblueThresholdSH2);
            yellowThreshold22 = sharedPreferencesSH22.getInt("yellowThreshold22", originalyellowThresholdSH2);
            redThreshold22 = sharedPreferencesSH22.getInt("redThreshold22", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor22();
        }
        synchronized (editorSH23) {
            boolean timerStarted23 = sharedPreferencesSH23.getBoolean(TIMER_STARTED_KEY_SH23, false);
            if (timerStarted23) {
                startTimeSH23 = sharedPreferencesSH23.getLong(START_TIME_KEY_SH23, 0);
                timeInMillisecondsSH23 = sharedPreferencesSH23.getLong(ELAPSED_TIME_KEY_SH23, 0);
                secSH23 = (int) (timeInMillisecondsSH23 / 1000);
                handlerSH.postDelayed(updateTimerThread23, 0);
            }
            peopleSH_23 = sharedPreferencesSH23.getBoolean("people_key23", false);
            flashingSH23 = sharedPreferencesSH23.getBoolean("flashing_key23", false);
            flashinggSH23 = sharedPreferencesSH23.getBoolean("flashingg_key23", false);
            isTimerRunningSH23 = sharedPreferencesSH23.getBoolean("isTimerRunningSH23", false);
            currentHourSH23 = sharedPreferencesSH23.getInt("currentHourSH23", currentHourSH23);
            currentMinuteSH23 = sharedPreferencesSH23.getInt("currentMinuteSH23", currentMinuteSH23);

            // 恢复加時時間  測試用
            blueThreshold23 = sharedPreferencesSH23.getInt("blueThreshold23", originalblueThresholdSH2);
            yellowThreshold23 = sharedPreferencesSH23.getInt("yellowThreshold23", originalyellowThresholdSH2);
            redThreshold23 = sharedPreferencesSH23.getInt("redThreshold23", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor23();
        }
        synchronized (editorSH24) {
            boolean timerStarted24 = sharedPreferencesSH24.getBoolean(TIMER_STARTED_KEY_SH24, false);
            if (timerStarted24) {
                startTimeSH24 = sharedPreferencesSH24.getLong(START_TIME_KEY_SH24, 0);
                timeInMillisecondsSH24 = sharedPreferencesSH24.getLong(ELAPSED_TIME_KEY_SH24, 0);
                secSH24 = (int) (timeInMillisecondsSH24 / 1000);
                handlerSH.postDelayed(updateTimerThread24, 0);
            }
            peopleSH_24 = sharedPreferencesSH24.getBoolean("people_key24", false);
            flashingSH24 = sharedPreferencesSH24.getBoolean("flashing_key24", false);
            flashinggSH24 = sharedPreferencesSH24.getBoolean("flashingg_key24", false);
            isTimerRunningSH24 = sharedPreferencesSH24.getBoolean("isTimerRunningSH24", false);
            currentHourSH24 = sharedPreferencesSH24.getInt("currentHourSH24", currentHourSH24);
            currentMinuteSH24 = sharedPreferencesSH24.getInt("currentMinuteSH24", currentMinuteSH24);

            // 恢复加時時間  測試用
            blueThreshold24 = sharedPreferencesSH24.getInt("blueThreshold24", originalblueThresholdSH2);
            yellowThreshold24 = sharedPreferencesSH24.getInt("yellowThreshold24", originalyellowThresholdSH2);
            redThreshold24 = sharedPreferencesSH24.getInt("redThreshold24", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor24();
        }
        synchronized (editorSH25) {
            boolean timerStarted25 = sharedPreferencesSH25.getBoolean(TIMER_STARTED_KEY_SH25, false);
            if (timerStarted25) {
                startTimeSH25 = sharedPreferencesSH25.getLong(START_TIME_KEY_SH25, 0);
                timeInMillisecondsSH25 = sharedPreferencesSH25.getLong(ELAPSED_TIME_KEY_SH25, 0);
                secSH25 = (int) (timeInMillisecondsSH25 / 1000);
                handlerSH.postDelayed(updateTimerThread25, 0);
            }
            peopleSH_25 = sharedPreferencesSH25.getBoolean("people_key25", false);
            flashingSH25 = sharedPreferencesSH25.getBoolean("flashing_key25", false);
            flashinggSH25 = sharedPreferencesSH25.getBoolean("flashingg_key25", false);
            isTimerRunningSH25 = sharedPreferencesSH25.getBoolean("isTimerRunningSH25", false);
            currentHourSH25 = sharedPreferencesSH25.getInt("currentHourSH25", currentHourSH25);
            currentMinuteSH25 = sharedPreferencesSH25.getInt("currentMinuteSH25", currentMinuteSH25);

            // 恢复加時時間  測試用
            blueThreshold25 = sharedPreferencesSH25.getInt("blueThreshold25", originalblueThresholdSH2);
            yellowThreshold25 = sharedPreferencesSH25.getInt("yellowThreshold25", originalyellowThresholdSH2);
            redThreshold25 = sharedPreferencesSH25.getInt("redThreshold25", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor25();
        }
        synchronized (editorSH26) {
            boolean timerStarted26 = sharedPreferencesSH26.getBoolean(TIMER_STARTED_KEY_SH26, false);
            if (timerStarted26) {
                startTimeSH26 = sharedPreferencesSH26.getLong(START_TIME_KEY_SH26, 0);
                timeInMillisecondsSH26 = sharedPreferencesSH26.getLong(ELAPSED_TIME_KEY_SH26, 0);
                secSH26 = (int) (timeInMillisecondsSH26 / 1000);
                handlerSH.postDelayed(updateTimerThread26, 0);
            }
            peopleSH_26 = sharedPreferencesSH26.getBoolean("people_key26", false);
            flashingSH26 = sharedPreferencesSH26.getBoolean("flashing_key26", false);
            flashinggSH26 = sharedPreferencesSH26.getBoolean("flashingg_key26", false);
            isTimerRunningSH26 = sharedPreferencesSH26.getBoolean("isTimerRunningSH26", false);
            currentHourSH26 = sharedPreferencesSH26.getInt("currentHourSH26", currentHourSH26);
            currentMinuteSH26 = sharedPreferencesSH26.getInt("currentMinuteSH26", currentMinuteSH26);

            // 恢复加時時間  測試用
            blueThreshold26 = sharedPreferencesSH26.getInt("blueThreshold26", originalblueThresholdSH2);
            yellowThreshold26 = sharedPreferencesSH26.getInt("yellowThreshold26", originalyellowThresholdSH2);
            redThreshold26 = sharedPreferencesSH26.getInt("redThreshold26", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor26();
        }
        synchronized (editorSH27) {
            boolean timerStarted27 = sharedPreferencesSH27.getBoolean(TIMER_STARTED_KEY_SH27, false);
            if (timerStarted27) {
                startTimeSH27 = sharedPreferencesSH27.getLong(START_TIME_KEY_SH27, 0);
                timeInMillisecondsSH27 = sharedPreferencesSH27.getLong(ELAPSED_TIME_KEY_SH27, 0);
                secSH27 = (int) (timeInMillisecondsSH27 / 1000);
                handlerSH.postDelayed(updateTimerThread27, 0);
            }
            peopleSH_27 = sharedPreferencesSH27.getBoolean("people_key27", false);
            flashingSH27 = sharedPreferencesSH27.getBoolean("flashing_key27", false);
            flashinggSH27 = sharedPreferencesSH27.getBoolean("flashingg_key27", false);
            isTimerRunningSH27 = sharedPreferencesSH27.getBoolean("isTimerRunningSH27", false);
            currentHourSH27 = sharedPreferencesSH27.getInt("currentHourSH27", currentHourSH27);
            currentMinuteSH27 = sharedPreferencesSH27.getInt("currentMinuteSH27", currentMinuteSH27);

            // 恢复加時時間  測試用
            blueThreshold27 = sharedPreferencesSH27.getInt("blueThreshold27", originalblueThresholdSH2);
            yellowThreshold27 = sharedPreferencesSH27.getInt("yellowThreshold27", originalyellowThresholdSH2);
            redThreshold27 = sharedPreferencesSH27.getInt("redThreshold27", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor27();
        }
        synchronized (editorSH28) {
            boolean timerStarted28 = sharedPreferencesSH28.getBoolean(TIMER_STARTED_KEY_SH28, false);
            if (timerStarted28) {
                startTimeSH28 = sharedPreferencesSH28.getLong(START_TIME_KEY_SH28, 0);
                timeInMillisecondsSH28 = sharedPreferencesSH28.getLong(ELAPSED_TIME_KEY_SH28, 0);
                secSH28 = (int) (timeInMillisecondsSH28 / 1000);
                handlerSH.postDelayed(updateTimerThread28, 0);
            }
            peopleSH_28 = sharedPreferencesSH28.getBoolean("people_key28", false);
            flashingSH28 = sharedPreferencesSH28.getBoolean("flashing_key28", false);
            flashinggSH28 = sharedPreferencesSH28.getBoolean("flashingg_key28", false);
            isTimerRunningSH28 = sharedPreferencesSH28.getBoolean("isTimerRunningSH28", false);
            currentHourSH28 = sharedPreferencesSH28.getInt("currentHourSH28", currentHourSH28);
            currentMinuteSH28 = sharedPreferencesSH28.getInt("currentMinuteSH28", currentMinuteSH28);

            // 恢复加時時間  測試用
            blueThreshold28 = sharedPreferencesSH28.getInt("blueThreshold28", originalblueThresholdSH2);
            yellowThreshold28 = sharedPreferencesSH28.getInt("yellowThreshold28", originalyellowThresholdSH2);
            redThreshold28 = sharedPreferencesSH28.getInt("redThreshold28", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor28();
        }
        synchronized (editorSH29) {
            boolean timerStarted29 = sharedPreferencesSH29.getBoolean(TIMER_STARTED_KEY_SH29, false);
            if (timerStarted29) {
                startTimeSH29 = sharedPreferencesSH29.getLong(START_TIME_KEY_SH29, 0);
                timeInMillisecondsSH29 = sharedPreferencesSH29.getLong(ELAPSED_TIME_KEY_SH29, 0);
                secSH29 = (int) (timeInMillisecondsSH29 / 1000);
                handlerSH.postDelayed(updateTimerThread29, 0);
            }
            peopleSH_29 = sharedPreferencesSH29.getBoolean("people_key29", false);
            flashingSH29 = sharedPreferencesSH29.getBoolean("flashing_key29", false);
            flashinggSH29 = sharedPreferencesSH29.getBoolean("flashingg_key29", false);
            isTimerRunningSH29 = sharedPreferencesSH29.getBoolean("isTimerRunningSH29", false);
            currentHourSH29 = sharedPreferencesSH29.getInt("currentHourSH29", currentHourSH29);
            currentMinuteSH29 = sharedPreferencesSH29.getInt("currentMinuteSH29", currentMinuteSH29);

            // 恢复加時時間  測試用
            blueThreshold29 = sharedPreferencesSH29.getInt("blueThreshold29", originalblueThresholdSH2);
            yellowThreshold29 = sharedPreferencesSH29.getInt("yellowThreshold29", originalyellowThresholdSH2);
            redThreshold29 = sharedPreferencesSH29.getInt("redThreshold29", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor29();
        }
        synchronized (editorSH30) {
            boolean timerStarted30 = sharedPreferencesSH30.getBoolean(TIMER_STARTED_KEY_SH30, false);
            if (timerStarted30) {
                startTimeSH30 = sharedPreferencesSH30.getLong(START_TIME_KEY_SH30, 0);
                timeInMillisecondsSH30 = sharedPreferencesSH30.getLong(ELAPSED_TIME_KEY_SH30, 0);
                secSH30 = (int) (timeInMillisecondsSH30 / 1000);
                handlerSH.postDelayed(updateTimerThread30, 0);
            }
            peopleSH_30 = sharedPreferencesSH30.getBoolean("people_key30", false);
            flashingSH30 = sharedPreferencesSH30.getBoolean("flashing_key30", false);
            flashinggSH30 = sharedPreferencesSH30.getBoolean("flashingg_key30", false);
            isTimerRunningSH30 = sharedPreferencesSH30.getBoolean("isTimerRunningSH30", false);
            currentHourSH30 = sharedPreferencesSH30.getInt("currentHourSH30", currentHourSH30);
            currentMinuteSH30 = sharedPreferencesSH30.getInt("currentMinuteSH30", currentMinuteSH30);

            // 恢复加時時間  測試用
            blueThreshold30 = sharedPreferencesSH30.getInt("blueThreshold30", originalblueThresholdSH2);
            yellowThreshold30 = sharedPreferencesSH30.getInt("yellowThreshold30", originalyellowThresholdSH2);
            redThreshold30 = sharedPreferencesSH30.getInt("redThreshold30", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor30();
        }
        synchronized (editorSH31) {
            boolean timerStarted31 = sharedPreferencesSH31.getBoolean(TIMER_STARTED_KEY_SH31, false);
            if (timerStarted31) {
                startTimeSH31 = sharedPreferencesSH31.getLong(START_TIME_KEY_SH31, 0);
                timeInMillisecondsSH31 = sharedPreferencesSH31.getLong(ELAPSED_TIME_KEY_SH31, 0);
                secSH31 = (int) (timeInMillisecondsSH31 / 1000);
                handlerSH.postDelayed(updateTimerThread31, 0);
            }
            peopleSH_31 = sharedPreferencesSH31.getBoolean("people_key31", false);
            flashingSH31 = sharedPreferencesSH31.getBoolean("flashing_key31", false);
            flashinggSH31 = sharedPreferencesSH31.getBoolean("flashingg_key31", false);
            isTimerRunningSH31 = sharedPreferencesSH31.getBoolean("isTimerRunningSH31", false);
            currentHourSH31 = sharedPreferencesSH31.getInt("currentHourSH31", currentHourSH31);
            currentMinuteSH31 = sharedPreferencesSH31.getInt("currentMinuteSH31", currentMinuteSH31);

            // 恢复加時時間  測試用
            blueThreshold31 = sharedPreferencesSH31.getInt("blueThreshold31", originalblueThresholdSH2);
            yellowThreshold31 = sharedPreferencesSH31.getInt("yellowThreshold31", originalyellowThresholdSH2);
            redThreshold31 = sharedPreferencesSH31.getInt("redThreshold31", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor31();
        }
        synchronized (editorSH32) {
            boolean timerStarted32 = sharedPreferencesSH32.getBoolean(TIMER_STARTED_KEY_SH32, false);
            if (timerStarted32) {
                startTimeSH32 = sharedPreferencesSH32.getLong(START_TIME_KEY_SH32, 0);
                timeInMillisecondsSH32 = sharedPreferencesSH32.getLong(ELAPSED_TIME_KEY_SH32, 0);
                secSH32 = (int) (timeInMillisecondsSH32 / 1000);
                handlerSH.postDelayed(updateTimerThread32, 0);
            }
            peopleSH_32 = sharedPreferencesSH32.getBoolean("people_key32", false);
            flashingSH32 = sharedPreferencesSH32.getBoolean("flashing_key32", false);
            flashinggSH32 = sharedPreferencesSH32.getBoolean("flashingg_key32", false);
            isTimerRunningSH32 = sharedPreferencesSH32.getBoolean("isTimerRunningSH32", false);
            currentHourSH32 = sharedPreferencesSH32.getInt("currentHourSH32", currentHourSH32);
            currentMinuteSH32 = sharedPreferencesSH32.getInt("currentMinuteSH32", currentMinuteSH32);

            // 恢复加時時間  測試用
            blueThreshold32 = sharedPreferencesSH32.getInt("blueThreshold32", originalblueThresholdSH2);
            yellowThreshold32 = sharedPreferencesSH32.getInt("yellowThreshold32", originalyellowThresholdSH2);
            redThreshold32 = sharedPreferencesSH32.getInt("redThreshold32", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor32();
        }
        synchronized (editorSH33) {
            boolean timerStarted33 = sharedPreferencesSH33.getBoolean(TIMER_STARTED_KEY_SH33, false);
            if (timerStarted33) {
                startTimeSH33 = sharedPreferencesSH33.getLong(START_TIME_KEY_SH33, 0);
                timeInMillisecondsSH33 = sharedPreferencesSH33.getLong(ELAPSED_TIME_KEY_SH33, 0);
                secSH33 = (int) (timeInMillisecondsSH33 / 1000);
                handlerSH.postDelayed(updateTimerThread33, 0);
            }
            peopleSH_33 = sharedPreferencesSH33.getBoolean("people_key33", false);
            flashingSH33 = sharedPreferencesSH33.getBoolean("flashing_key33", false);
            flashinggSH33 = sharedPreferencesSH33.getBoolean("flashingg_key33", false);
            isTimerRunningSH33 = sharedPreferencesSH33.getBoolean("isTimerRunningSH33", false);
            currentHourSH33 = sharedPreferencesSH33.getInt("currentHourSH33", currentHourSH33);
            currentMinuteSH33 = sharedPreferencesSH33.getInt("currentMinuteSH33", currentMinuteSH33);

            // 恢复加時時間  測試用
            blueThreshold33 = sharedPreferencesSH33.getInt("blueThreshold33", originalblueThresholdSH2);
            yellowThreshold33 = sharedPreferencesSH33.getInt("yellowThreshold33", originalyellowThresholdSH2);
            redThreshold33 = sharedPreferencesSH33.getInt("redThreshold33", originalredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor33();
        }

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
    private void stopTimer101() {
        handlerSH.removeCallbacks(updateTimerThread101);
    }

    private void stopTimer102() {
        handlerSH.removeCallbacks(updateTimerThread102);
    }

    private void stopTimer103() {
        handlerSH.removeCallbacks(updateTimerThread103);
    }

    private void stopTimer104() {
        handlerSH.removeCallbacks(updateTimerThread104);
    }

    private void stopTimer105() {
        handlerSH.removeCallbacks(updateTimerThread105);
    }

    private void stopTimer106() {
        handlerSH.removeCallbacks(updateTimerThread106);
    }

    private void stopTimer107() {
        handlerSH.removeCallbacks(updateTimerThread107);
    }

    private void stopTimer8() {
        handlerSH.removeCallbacks(updateTimerThread8);
    }

    private void stopTimer9() {
        handlerSH.removeCallbacks(updateTimerThread9);
    }

    private void stopTimer10() {
        handlerSH.removeCallbacks(updateTimerThread10);
    }

    private void stopTimer11() {
        handlerSH.removeCallbacks(updateTimerThread11);
    }

    private void stopTimer12() {
        handlerSH.removeCallbacks(updateTimerThread12);
    }

    private void stopTimer13() {
        handlerSH.removeCallbacks(updateTimerThread13);
    }

    private void stopTimer14() {
        handlerSH.removeCallbacks(updateTimerThread14);
    }

    private void stopTimer15() {
        handlerSH.removeCallbacks(updateTimerThread15);
    }

    private void stopTimer16() {
        handlerSH.removeCallbacks(updateTimerThread16);
    }

    private void stopTimer17() {
        handlerSH.removeCallbacks(updateTimerThread17);
    }

    private void stopTimer18() {
        handlerSH.removeCallbacks(updateTimerThread18);
    }

    private void stopTimer19() {
        handlerSH.removeCallbacks(updateTimerThread19);
    }

    private void stopTimer20() {
        handlerSH.removeCallbacks(updateTimerThread20);
    }

    private void stopTimer21() {
        handlerSH.removeCallbacks(updateTimerThread21);
    }

    private void stopTimer22() {
        handlerSH.removeCallbacks(updateTimerThread22);
    }

    private void stopTimer23() {
        handlerSH.removeCallbacks(updateTimerThread23);
    }

    private void stopTimer24() {
        handlerSH.removeCallbacks(updateTimerThread24);
    }

    private void stopTimer25() {
        handlerSH.removeCallbacks(updateTimerThread25);
    }

    private void stopTimer26() {
        handlerSH.removeCallbacks(updateTimerThread26);
    }

    private void stopTimer27() {
        handlerSH.removeCallbacks(updateTimerThread27);
    }

    private void stopTimer28() {
        handlerSH.removeCallbacks(updateTimerThread28);
    }

    private void stopTimer29() {
        handlerSH.removeCallbacks(updateTimerThread29);
    }

    private void stopTimer30() {
        handlerSH.removeCallbacks(updateTimerThread30);
    }

    private void stopTimer31() {
        handlerSH.removeCallbacks(updateTimerThread31);
    }

    private void stopTimer32() {
        handlerSH.removeCallbacks(updateTimerThread32);
    }

    private void stopTimer33() {
        handlerSH.removeCallbacks(updateTimerThread33);
    }

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



    private void resetsecondsSH101() {
        secondsSH101 = 0;
        secSH101 = 0;
        minutesSH101 = 0;
        hoursSH101 = 0;
        btnTimerSH101.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString101 = String.format("%02d:%02d", hoursSH101, minutesSH101);
        btnTimerSH101.setText(timeString101);
    }

    private void resetsecondsSH102() {
        secondsSH102 = 0;
        secSH102 = 0;
        minutesSH102 = 0;
        hoursSH102 = 0;
        btnTimerSH102.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString102 = String.format("%02d:%02d", hoursSH102, minutesSH102);
        btnTimerSH102.setText(timeString102);
    }

    private void resetsecondsSH103() {
        secondsSH103 = 0;
        secSH103 = 0;
        minutesSH103 = 0;
        hoursSH103 = 0;
        btnTimerSH103.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString103 = String.format("%02d:%02d", hoursSH103, minutesSH103);
        btnTimerSH103.setText(timeString103);
    }

    private void resetsecondsSH104() {
        secondsSH104 = 0;
        secSH104 = 0;
        minutesSH104 = 0;
        hoursSH104 = 0;
        btnTimerSH104.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString104 = String.format("%02d:%02d", hoursSH104, minutesSH104);
        btnTimerSH104.setText(timeString104);
    }

    private void resetsecondsSH105() {
        secondsSH105 = 0;
        secSH105 = 0;
        minutesSH105 = 0;
        hoursSH105 = 0;
        btnTimerSH105.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString105 = String.format("%02d:%02d", hoursSH105, minutesSH105);
        btnTimerSH105.setText(timeString105);
    }

    private void resetsecondsSH106() {
        secondsSH106 = 0;
        secSH106 = 0;
        minutesSH106 = 0;
        hoursSH106 = 0;
        btnTimerSH106.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString106 = String.format("%02d:%02d", hoursSH106, minutesSH106);
        btnTimerSH106.setText(timeString106);
    }

    private void resetsecondsSH107() {
        secondsSH107 = 0;
        secSH107 = 0;
        minutesSH107 = 0;
        hoursSH107 = 0;
        btnTimerSH107.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString107 = String.format("%02d:%02d", hoursSH107, minutesSH107);
        btnTimerSH107.setText(timeString107);
    }

    private void resetsecondsSH8() {
        secondsSH8 = 0;
        secSH8 = 0;
        minutesSH8 = 0;
        hoursSH8 = 0;
        btnTimerSH8.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString8 = String.format("%02d:%02d", hoursSH8, minutesSH8);
        btnTimerSH8.setText(timeString8);
    }

    private void resetsecondsSH9() {
        secondsSH9 = 0;
        secSH9 = 0;
        minutesSH9 = 0;
        hoursSH9 = 0;
        btnTimerSH9.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString9 = String.format("%02d:%02d", hoursSH9, minutesSH9);
        btnTimerSH9.setText(timeString9);
    }

    private void resetsecondsSH10() {
        secondsSH10 = 0;
        secSH10 = 0;
        minutesSH10 = 0;
        hoursSH10 = 0;
        btnTimerSH10.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString10 = String.format("%02d:%02d", hoursSH10, minutesSH10);
        btnTimerSH10.setText(timeString10);
    }
    private void resetsecondsSH11() {
        secondsSH11 = 0;
        secSH11 = 0;
        minutesSH11 = 0;
        hoursSH11 = 0;

        btnTimerSH11.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString11 = String.format("%02d:%02d", hoursSH11, minutesSH11);
        btnTimerSH11.setText(timeString11);
    }

    private void resetsecondsSH12() {
        secondsSH12 = 0;
        secSH12 = 0;
        minutesSH12 = 0;
        hoursSH12 = 0;
        btnTimerSH12.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString12 = String.format("%02d:%02d", hoursSH12, minutesSH12);
        btnTimerSH12.setText(timeString12);
    }

    private void resetsecondsSH13() {
        secondsSH13 = 0;
        secSH13 = 0;
        minutesSH13 = 0;
        hoursSH13 = 0;
        btnTimerSH13.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString13 = String.format("%02d:%02d", hoursSH13, minutesSH13);
        btnTimerSH13.setText(timeString13);
    }

    private void resetsecondsSH14() {
        secondsSH14 = 0;
        secSH14 = 0;
        minutesSH14 = 0;
        hoursSH14 = 0;
        btnTimerSH14.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString14 = String.format("%02d:%02d", hoursSH14, minutesSH14);
        btnTimerSH14.setText(timeString14);
    }

    private void resetsecondsSH15() {
        secondsSH15 = 0;
        secSH15 = 0;
        minutesSH15 = 0;
        hoursSH15 = 0;
        btnTimerSH15.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString15 = String.format("%02d:%02d", hoursSH15, minutesSH15);
        btnTimerSH15.setText(timeString15);
    }

    private void resetsecondsSH16() {
        secondsSH16 = 0;
        secSH16 = 0;
        minutesSH16 = 0;
        hoursSH16 = 0;
        btnTimerSH16.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString16 = String.format("%02d:%02d", hoursSH16, minutesSH16);
        btnTimerSH16.setText(timeString16);
    }

    private void resetsecondsSH17() {
        secondsSH17 = 0;
        secSH17 = 0;
        minutesSH17 = 0;
        hoursSH17 = 0;
        btnTimerSH17.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString17 = String.format("%02d:%02d", hoursSH17, minutesSH17);
        btnTimerSH17.setText(timeString17);
    }

    private void resetsecondsSH18() {
        secondsSH18 = 0;
        secSH18 = 0;
        minutesSH18 = 0;
        hoursSH18 = 0;

        btnTimerSH18.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString18 = String.format("%02d:%02d", hoursSH18, minutesSH18);
        btnTimerSH18.setText(timeString18);
    }

    private void resetsecondsSH19() {
        secondsSH19 = 0;
        secSH19 = 0;
        minutesSH19 = 0;
        hoursSH19 = 0;
        btnTimerSH19.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString19 = String.format("%02d:%02d", hoursSH19, minutesSH19);
        btnTimerSH19.setText(timeString19);
    }

    private void resetsecondsSH20() {
        secondsSH20 = 0;
        secSH20 = 0;
        minutesSH20 = 0;
        hoursSH20 = 0;

        btnTimerSH20.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString20 = String.format("%02d:%02d", hoursSH20, minutesSH20);
        btnTimerSH20.setText(timeString20);

    }
    private void resetsecondsSH21() {
        secondsSH21 = 0;
        secSH21 = 0;
        minutesSH21 = 0;
        hoursSH21 = 0;
        btnTimerSH21.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString21 = String.format("%02d:%02d", hoursSH21, minutesSH21);
        btnTimerSH21.setText(timeString21);
    }

    private void resetsecondsSH22() {
        secondsSH22 = 0;
        secSH22 = 0;
        minutesSH22 = 0;
        hoursSH22 = 0;
        btnTimerSH22.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString22 = String.format("%02d:%02d", hoursSH22, minutesSH22);
        btnTimerSH22.setText(timeString22);
    }

    private void resetsecondsSH23() {
        secondsSH23 = 0;
        secSH23 = 0;
        minutesSH23 = 0;
        hoursSH23 = 0;
        btnTimerSH23.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString23 = String.format("%02d:%02d", hoursSH23, minutesSH23);
        btnTimerSH23.setText(timeString23);
    }

    private void resetsecondsSH24() {
        secondsSH24 = 0;
        secSH24 = 0;
        minutesSH24 = 0;
        hoursSH24 = 0;
        btnTimerSH24.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString24 = String.format("%02d:%02d", hoursSH24, minutesSH24);
        btnTimerSH24.setText(timeString24);
    }

    private void resetsecondsSH25() {
        secondsSH25 = 0;
        secSH25 = 0;
        minutesSH25 = 0;
        hoursSH25 = 0;
        btnTimerSH25.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString25 = String.format("%02d:%02d", hoursSH25, minutesSH25);
        btnTimerSH25.setText(timeString25);
    }

    private void resetsecondsSH26() {
        secondsSH26 = 0;
        secSH26 = 0;
        minutesSH26 = 0;
        hoursSH26 = 0;
        btnTimerSH26.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString26 = String.format("%02d:%02d", hoursSH26, minutesSH26);
        btnTimerSH26.setText(timeString26);
    }

    private void resetsecondsSH27() {
        secondsSH27 = 0;
        secSH27 = 0;
        minutesSH27 = 0;
        hoursSH27 = 0;
        btnTimerSH27.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString27 = String.format("%02d:%02d", hoursSH27, minutesSH27);
        btnTimerSH27.setText(timeString27);
    }

    private void resetsecondsSH28() {
        secondsSH28 = 0;
        secSH28 = 0;
        minutesSH28 = 0;
        hoursSH28 = 0;
        btnTimerSH28.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString28 = String.format("%02d:%02d", hoursSH28, minutesSH28);
        btnTimerSH28.setText(timeString28);
    }

    private void resetsecondsSH29() {
        secondsSH29 = 0;
        secSH29 = 0;
        minutesSH29 = 0;
        hoursSH29 = 0;
        btnTimerSH29.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString29 = String.format("%02d:%02d", hoursSH29, minutesSH29);
        btnTimerSH29.setText(timeString29);
    }

    private void resetsecondsSH30() {
        secondsSH30 = 0;
        secSH30 = 0;
        minutesSH30 = 0;
        hoursSH30 = 0;
        btnTimerSH30.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString30 = String.format("%02d:%02d", hoursSH30, minutesSH30);
        btnTimerSH30.setText(timeString30);
    }
    private void resetsecondsSH31() {
        secondsSH31 = 0;
        secSH31 = 0;
        minutesSH31 = 0;
        hoursSH31 = 0;
        btnTimerSH31.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString31 = String.format("%02d:%02d", hoursSH31, minutesSH31);
        btnTimerSH31.setText(timeString31);
    }

    private void resetsecondsSH32() {
        secondsSH32 = 0;
        secSH32 = 0;
        minutesSH32 = 0;
        hoursSH32 = 0;
        btnTimerSH32.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString32 = String.format("%02d:%02d", hoursSH32, minutesSH32);
        btnTimerSH32.setText(timeString32);
    }

    private void resetsecondsSH33() {
        secondsSH33 = 0;
        secSH33 = 0;
        minutesSH33 = 0;
        hoursSH33 = 0;
        btnTimerSH33.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString33 = String.format("%02d:%02d", hoursSH33, minutesSH33);
        btnTimerSH33.setText(timeString33);
    }

    private void resetseconds1() {
        seconds1 = 0;
        sec1 = 0;
        minutes1 = 0;
        hours1 = 0;
        btnTimer1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d", hours1, minutes1);
        btnTimer1.setText(timeString);
    }
    private void resetseconds2() {
        seconds2 = 0;
        sec2 = 0;
        minutes2 = 0;
        hours2 = 0;
        btnTimer2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d", hours2, minutes2);
        btnTimer2.setText(timeString);
    }

    private void resetseconds3() {
        seconds3 = 0;
        sec3 = 0;
        minutes3 = 0;
        hours3 = 0;
        btnTimer3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d", hours3, minutes3);
        btnTimer3.setText(timeString);
    }

    private void resetseconds4() {
        seconds4 = 0;
        sec4 = 0;
        minutes4 = 0;
        hours4 = 0;
        btnTimer4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d", hours4, minutes4);
        btnTimer4.setText(timeString);
    }
    private void resetseconds5() {
        seconds5 = 0;
        sec5 = 0;
        minutes5 = 0;
        hours5 = 0;
        btnTimer5.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d", hours5, minutes5);
        btnTimer5.setText(timeString);
    }

    private void resetseconds7() {
        seconds7 = 0;
        sec7 = 0;
        minutes7 = 0;
        hours7 = 0;
        btnTimer7.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d", hours7, minutes7);
        btnTimer7.setText(timeString);
    }
    private void resetseconds66() {
        seconds66 = 0;
        sec66 = 0;
        minutes66 = 0;
        hours66 = 0;
        btnTimer66.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString = String.format("%02d:%02d",  hours66, minutes66);
        btnTimer66.setText(timeString);
    }





    private void resetButtonColor101() {
        btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor102() {
        btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor103() {
        btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor104() {
        btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor105() {
        btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor106() {
        btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor107() {
        btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor8() {
        btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor9() {
        btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor10() {
        btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor11() {
        btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor12() {
        btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor13() {
        btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor14() {
        btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor15() {
        btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor16() {
        btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor17() {
        btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor18() {
        btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor19() {
        btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor20() {
        btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor21() {
        btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor22() {
        btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor23() {
        btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor24() {
        btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor25() {
        btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor26() {
        btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor27() {
        btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor28() {
        btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor29() {
        btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor30() {
        btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor31() {
        btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor32() {
        btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor33() {
        btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.white));
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






    private void showConfirmationDialogYNForButton101() {
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
                stopTimer101();
                resetThresholdsToOriginal101();
                resetsecondsSH101();
                resetButtonColor101();
                btnTimerSH101.clearAnimation();
                flashingSH101 = false;
                flashinggSH101 = false;
                isTimerRunningSH101 = false;
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

    private void showConfirmationDialogForButton101() {
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
                peopleSH_101 = true;
                isTimerRunningSH101 = true;
                startTimeSH101r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime101 = Calendar.getInstance();
                currentHourSH101 = currentTime101.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH101 = currentTime101.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_101 = false;
                isTimerRunningSH101 = true;
                startTimeSH101r();
                flashingSH101 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH101 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH101 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton102() {
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
                stopTimer102();
                resetThresholdsToOriginal102();
                resetsecondsSH102();
                resetButtonColor102();
                btnTimerSH102.clearAnimation();
                flashingSH102 = false;
                flashinggSH102 = false;
                isTimerRunningSH102 = false;
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

    private void showConfirmationDialogForButton102() {
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
                peopleSH_102 = true;
                isTimerRunningSH102 = true;
                startTimeSH102r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime102 = Calendar.getInstance();
                currentHourSH102 = currentTime102.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH102 = currentTime102.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_102 = false;
                isTimerRunningSH102 = true;
                startTimeSH102r();
                flashingSH102 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH102 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH102 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton103() {
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
                stopTimer103();
                resetThresholdsToOriginal103();
                resetsecondsSH103();
                resetButtonColor103();
                btnTimerSH103.clearAnimation();
                flashingSH103 = false;
                flashinggSH103 = false;
                isTimerRunningSH103 = false;
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

    private void showConfirmationDialogForButton103() {
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
                peopleSH_103 = true;
                isTimerRunningSH103 = true;
                startTimeSH103r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime103 = Calendar.getInstance();
                currentHourSH103 = currentTime103.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH103 = currentTime103.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_103 = false;
                isTimerRunningSH103 = true;
                startTimeSH103r();
                flashingSH103 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH103 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH103 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton104() {
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
                stopTimer104();
                resetThresholdsToOriginal104();
                resetsecondsSH104();
                resetButtonColor104();
                btnTimerSH104.clearAnimation();
                flashingSH104 = false;
                flashinggSH104 = false;
                isTimerRunningSH104 = false;
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

    private void showConfirmationDialogForButton104() {
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
                peopleSH_104 = true;
                isTimerRunningSH104 = true;
                startTimeSH104r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime104 = Calendar.getInstance();
                currentHourSH104 = currentTime104.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH104 = currentTime104.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_104 = false;
                isTimerRunningSH104 = true;
                startTimeSH104r();
                flashingSH104 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH104 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH104 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton105() {
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
                stopTimer105();
                resetThresholdsToOriginal105();
                resetsecondsSH105();
                resetButtonColor105();
                btnTimerSH105.clearAnimation();
                flashingSH105 = false;
                flashinggSH105 = false;
                isTimerRunningSH105 = false;
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

    private void showConfirmationDialogForButton105() {
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
                peopleSH_105 = true;
                isTimerRunningSH105 = true;
                startTimeSH105r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime105 = Calendar.getInstance();
                currentHourSH105 = currentTime105.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH105 = currentTime105.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_105 = false;
                isTimerRunningSH105 = true;
                startTimeSH105r();
                flashingSH105 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH105 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH105 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton106() {
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
                stopTimer106();
                resetThresholdsToOriginal106();
                resetsecondsSH106();
                resetButtonColor106();
                btnTimerSH106.clearAnimation();
                flashingSH106 = false;
                flashinggSH106 = false;
                isTimerRunningSH106 = false;
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

    private void showConfirmationDialogForButton106() {
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
                peopleSH_106 = true;
                isTimerRunningSH106 = true;
                startTimeSH106r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime106 = Calendar.getInstance();
                currentHourSH106 = currentTime106.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH106 = currentTime106.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_106 = false;
                isTimerRunningSH106 = true;
                startTimeSH106r();
                flashingSH106 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH106 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH106 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton107() {
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
                stopTimer107();
                resetThresholdsToOriginal107();
                resetsecondsSH107();
                resetButtonColor107();
                btnTimerSH107.clearAnimation();
                flashingSH107 = false;
                flashinggSH107 = false;
                isTimerRunningSH107 = false;
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

    private void showConfirmationDialogForButton107() {
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
                peopleSH_107 = true;
                isTimerRunningSH107 = true;
                startTimeSH107r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime107 = Calendar.getInstance();
                currentHourSH107 = currentTime107.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH107 = currentTime107.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_107 = false;
                isTimerRunningSH107 = true;
                startTimeSH107r();
                flashingSH107 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH107 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH107 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton8() {
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
                stopTimer8();
                resetThresholdsToOriginal8();
                resetsecondsSH8();
                resetButtonColor8();
                btnTimerSH8.clearAnimation();
                flashingSH8 = false;
                flashinggSH8 = false;
                isTimerRunningSH8 = false;
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

    private void showConfirmationDialogForButton8() {
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
                peopleSH_8 = true;
                isTimerRunningSH8 = true;
                startTimeSH8r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime8 = Calendar.getInstance();
                currentHourSH8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_8 = false;
                isTimerRunningSH8 = true;
                startTimeSH8r();
                flashingSH8 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH8 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH8 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton9() {
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
                stopTimer9();
                resetThresholdsToOriginal9();
                resetsecondsSH9();
                resetButtonColor9();
                btnTimerSH9.clearAnimation();
                flashingSH9 = false;
                flashinggSH9 = false;
                isTimerRunningSH9 = false;
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

    private void showConfirmationDialogForButton9() {
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
                peopleSH_9 = true;
                isTimerRunningSH9 = true;
                startTimeSH9r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime9 = Calendar.getInstance();
                currentHourSH9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_9 = false;
                isTimerRunningSH9 = true;
                startTimeSH9r();
                flashingSH9 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH9 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH9 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton10() {
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
                stopTimer10();
                resetThresholdsToOriginal10();
                resetsecondsSH10();
                resetButtonColor10();
                btnTimerSH10.clearAnimation();
                flashingSH10 = false;
                flashinggSH10 = false;
                isTimerRunningSH10 = false;
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

    private void showConfirmationDialogForButton10() {
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
                peopleSH_10 = true;
                isTimerRunningSH10 = true;
                startTimeSH10r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime10 = Calendar.getInstance();
                currentHourSH10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_10 = false;
                isTimerRunningSH10 = true;
                startTimeSH10r();
                flashingSH10 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH10 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH10 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton11() {
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
                stopTimer11();
                resetThresholdsToOriginal11();
                resetsecondsSH11();
                resetButtonColor11();
                btnTimerSH11.clearAnimation();
                flashingSH11 = false;
                flashinggSH11 = false;
                isTimerRunningSH11 = false;
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

    private void showConfirmationDialogForButton11() {
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
                peopleSH_11 = true;
                isTimerRunningSH11 = true;
                startTimeSH11r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime11 = Calendar.getInstance();
                currentHourSH11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_11 = false;
                isTimerRunningSH11 = true;
                startTimeSH11r();
                flashingSH11 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH11 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH11 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton12() {
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
                stopTimer12();
                resetThresholdsToOriginal12();
                resetsecondsSH12();
                resetButtonColor12();
                btnTimerSH12.clearAnimation();
                flashingSH12 = false;
                flashinggSH12 = false;
                isTimerRunningSH12 = false;
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

    private void showConfirmationDialogForButton12() {
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
                peopleSH_12 = true;
                isTimerRunningSH12 = true;
                startTimeSH12r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime12 = Calendar.getInstance();
                currentHourSH12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_12 = false;
                isTimerRunningSH12 = true;
                startTimeSH12r();
                flashingSH12 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH12 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH12 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton13() {
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
                stopTimer13();
                resetThresholdsToOriginal13();
                resetsecondsSH13();
                resetButtonColor13();
                btnTimerSH13.clearAnimation();
                flashingSH13 = false;
                flashinggSH13 = false;
                isTimerRunningSH13 = false;
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

    private void showConfirmationDialogForButton13() {
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
                peopleSH_13 = true;
                isTimerRunningSH13 = true;
                startTimeSH13r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime13 = Calendar.getInstance();
                currentHourSH13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_13 = false;
                isTimerRunningSH13 = true;
                startTimeSH13r();
                flashingSH13 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH13 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH13 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton14() {
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
                stopTimer14();
                resetThresholdsToOriginal14();
                resetsecondsSH14();
                resetButtonColor14();
                btnTimerSH14.clearAnimation();
                flashingSH14 = false;
                flashinggSH14 = false;
                isTimerRunningSH14 = false;
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

    private void showConfirmationDialogForButton14() {
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
                peopleSH_14 = true;
                isTimerRunningSH14 = true;
                startTimeSH14r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime14 = Calendar.getInstance();
                currentHourSH14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_14 = false;
                isTimerRunningSH14 = true;
                startTimeSH14r();
                flashingSH14 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH14 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH14 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton15() {
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
                stopTimer15();
                resetThresholdsToOriginal15();
                resetsecondsSH15();
                resetButtonColor15();
                btnTimerSH15.clearAnimation();
                flashingSH15 = false;
                flashinggSH15 = false;
                isTimerRunningSH15 = false;
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

    private void showConfirmationDialogForButton15() {
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
                peopleSH_15 = true;
                isTimerRunningSH15 = true;
                startTimeSH15r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime15 = Calendar.getInstance();
                currentHourSH15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_15 = false;
                isTimerRunningSH15 = true;
                startTimeSH15r();
                flashingSH15 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH15 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH15 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton16() {
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
                stopTimer16();
                resetThresholdsToOriginal16();
                resetsecondsSH16();
                resetButtonColor16();
                btnTimerSH16.clearAnimation();
                flashingSH16 = false;
                flashinggSH16 = false;
                isTimerRunningSH16 = false;
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

    private void showConfirmationDialogForButton16() {
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
                peopleSH_16 = true;
                isTimerRunningSH16 = true;
                startTimeSH16r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime16 = Calendar.getInstance();
                currentHourSH16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_16 = false;
                isTimerRunningSH16 = true;
                startTimeSH16r();
                flashingSH16 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH16 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH16 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton17() {
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
                stopTimer17();
                resetThresholdsToOriginal17();
                resetsecondsSH17();
                resetButtonColor17();
                btnTimerSH17.clearAnimation();
                flashingSH17 = false;
                flashinggSH17 = false;
                isTimerRunningSH17 = false;
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

    private void showConfirmationDialogForButton17() {
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
                peopleSH_17 = true;
                isTimerRunningSH17 = true;
                startTimeSH17r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime17 = Calendar.getInstance();
                currentHourSH17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_17 = false;
                isTimerRunningSH17 = true;
                startTimeSH17r();
                flashingSH17 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH17 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH17 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton18() {
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
                stopTimer18();
                resetThresholdsToOriginal18();
                resetsecondsSH18();
                resetButtonColor18();
                btnTimerSH18.clearAnimation();
                flashingSH18 = false;
                flashinggSH18 = false;
                isTimerRunningSH18 = false;
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

    private void showConfirmationDialogForButton18() {
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
                peopleSH_18 = true;
                isTimerRunningSH18 = true;
                startTimeSH18r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime18 = Calendar.getInstance();
                currentHourSH18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_18 = false;
                isTimerRunningSH18 = true;
                startTimeSH18r();
                flashingSH18 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH18 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH18 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton19() {
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
                stopTimer19();
                resetThresholdsToOriginal19();
                resetsecondsSH19();
                resetButtonColor19();
                btnTimerSH19.clearAnimation();
                flashingSH19 = false;
                flashinggSH19 = false;
                isTimerRunningSH19 = false;
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

    private void showConfirmationDialogForButton19() {
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
                peopleSH_19 = true;
                isTimerRunningSH19 = true;
                startTimeSH19r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime19 = Calendar.getInstance();
                currentHourSH19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_19 = false;
                isTimerRunningSH19 = true;
                startTimeSH19r();
                flashingSH19 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH19 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH19 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton20() {
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
                stopTimer20();
                resetThresholdsToOriginal20();
                resetsecondsSH20();
                resetButtonColor20();
                btnTimerSH20.clearAnimation();
                flashingSH20 = false;
                flashinggSH20 = false;
                isTimerRunningSH20 = false;
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

    private void showConfirmationDialogForButton20() {
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
                peopleSH_20 = true;
                isTimerRunningSH20 = true;
                startTimeSH20r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime20 = Calendar.getInstance();
                currentHourSH20 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_20 = false;
                isTimerRunningSH20 = true;
                startTimeSH20r();
                flashingSH20 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH20 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH20 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton21() {
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
                stopTimer21();
                resetThresholdsToOriginal21();
                resetsecondsSH21();
                resetButtonColor21();
                btnTimerSH21.clearAnimation();
                flashingSH21 = false;
                flashinggSH21 = false;
                isTimerRunningSH21 = false;
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

    private void showConfirmationDialogForButton21() {
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
                peopleSH_21 = true;
                isTimerRunningSH21 = true;
                startTimeSH21r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime21 = Calendar.getInstance();
                currentHourSH21 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_21 = false;
                isTimerRunningSH21 = true;
                startTimeSH21r();
                flashingSH21 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH21 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH21 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton22() {
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
                stopTimer22();
                resetThresholdsToOriginal22();
                resetsecondsSH22();
                resetButtonColor22();
                btnTimerSH22.clearAnimation();
                flashingSH22 = false;
                flashinggSH22 = false;
                isTimerRunningSH22 = false;
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

    private void showConfirmationDialogForButton22() {
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
                peopleSH_22 = true;
                isTimerRunningSH22 = true;
                startTimeSH22r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime22 = Calendar.getInstance();
                currentHourSH22 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_22 = false;
                isTimerRunningSH22 = true;
                startTimeSH22r();
                flashingSH22 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH22 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH22 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton23() {
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
                stopTimer23();
                resetThresholdsToOriginal23();
                resetsecondsSH23();
                resetButtonColor23();
                btnTimerSH23.clearAnimation();
                flashingSH23 = false;
                flashinggSH23 = false;
                isTimerRunningSH23 = false;
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

    private void showConfirmationDialogForButton23() {
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
                peopleSH_23 = true;
                isTimerRunningSH23 = true;
                startTimeSH23r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime23 = Calendar.getInstance();
                currentHourSH23 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_23 = false;
                isTimerRunningSH23 = true;
                startTimeSH23r();
                flashingSH23 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH23 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH23 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton24() {
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
                stopTimer24();
                resetThresholdsToOriginal24();
                resetsecondsSH24();
                resetButtonColor24();
                btnTimerSH24.clearAnimation();
                flashingSH24 = false;
                flashinggSH24 = false;
                isTimerRunningSH24 = false;
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

    private void showConfirmationDialogForButton24() {
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
                peopleSH_24 = true;
                isTimerRunningSH24 = true;
                startTimeSH24r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime24 = Calendar.getInstance();
                currentHourSH24 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_24 = false;
                isTimerRunningSH24 = true;
                startTimeSH24r();
                flashingSH24 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH24 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH24 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton25() {
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
                stopTimer25();
                resetThresholdsToOriginal25();
                resetsecondsSH25();
                resetButtonColor25();
                btnTimerSH25.clearAnimation();
                flashingSH25 = false;
                flashinggSH25 = false;
                isTimerRunningSH25 = false;
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

    private void showConfirmationDialogForButton25() {
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
                peopleSH_25 = true;
                isTimerRunningSH25 = true;
                startTimeSH25r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime25 = Calendar.getInstance();
                currentHourSH25 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_25 = false;
                isTimerRunningSH25 = true;
                startTimeSH25r();
                flashingSH25 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH25 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH25 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton26() {
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
                stopTimer26();
                resetThresholdsToOriginal26();
                resetsecondsSH26();
                resetButtonColor26();
                btnTimerSH26.clearAnimation();
                flashingSH26 = false;
                flashinggSH26 = false;
                isTimerRunningSH26 = false;
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

    private void showConfirmationDialogForButton26() {
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
                peopleSH_26 = true;
                isTimerRunningSH26 = true;
                startTimeSH26r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime26 = Calendar.getInstance();
                currentHourSH26 = currentTime26.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH26 = currentTime26.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_26 = false;
                isTimerRunningSH26 = true;
                startTimeSH26r();
                flashingSH26 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH26 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH26 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton27() {
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
                stopTimer27();
                resetThresholdsToOriginal27();
                resetsecondsSH27();
                resetButtonColor27();
                btnTimerSH27.clearAnimation();
                flashingSH27 = false;
                flashinggSH27 = false;
                isTimerRunningSH27 = false;
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

    private void showConfirmationDialogForButton27() {
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
                peopleSH_27 = true;
                isTimerRunningSH27 = true;
                startTimeSH27r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime27 = Calendar.getInstance();
                currentHourSH27 = currentTime27.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH27 = currentTime27.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_27 = false;
                isTimerRunningSH27 = true;
                startTimeSH27r();
                flashingSH27 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH27 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH27 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton28() {
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
                stopTimer28();
                resetThresholdsToOriginal28();
                resetsecondsSH28();
                resetButtonColor28();
                btnTimerSH28.clearAnimation();
                flashingSH28 = false;
                flashinggSH28 = false;
                isTimerRunningSH28 = false;
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

    private void showConfirmationDialogForButton28() {
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
                peopleSH_28 = true;
                isTimerRunningSH28 = true;
                startTimeSH28r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime28 = Calendar.getInstance();
                currentHourSH28 = currentTime28.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH28 = currentTime28.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_28 = false;
                isTimerRunningSH28 = true;
                startTimeSH28r();
                flashingSH28 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH28 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH28 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton29() {
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
                stopTimer29();
                resetThresholdsToOriginal29();
                resetsecondsSH29();
                resetButtonColor29();
                btnTimerSH29.clearAnimation();
                flashingSH29 = false;
                flashinggSH29 = false;
                isTimerRunningSH29 = false;
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

    private void showConfirmationDialogForButton29() {
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
                peopleSH_29 = true;
                isTimerRunningSH29 = true;
                startTimeSH29r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime29 = Calendar.getInstance();
                currentHourSH29 = currentTime29.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH29 = currentTime29.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_29 = false;
                isTimerRunningSH29 = true;
                startTimeSH29r();
                flashingSH29 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH29 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH29 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton30() {
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
                stopTimer30();
                resetThresholdsToOriginal30();
                resetsecondsSH30();
                resetButtonColor30();
                btnTimerSH30.clearAnimation();
                flashingSH30 = false;
                flashinggSH30 = false;
                isTimerRunningSH30 = false;
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

    private void showConfirmationDialogForButton30() {
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
                peopleSH_30 = true;
                isTimerRunningSH30 = true;
                startTimeSH30r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime30 = Calendar.getInstance();
                currentHourSH30 = currentTime30.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH30 = currentTime30.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_30 = false;
                isTimerRunningSH30 = true;
                startTimeSH30r();
                flashingSH30 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH30 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH30 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton31() {
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
                stopTimer31();
                resetThresholdsToOriginal31();
                resetsecondsSH31();
                resetButtonColor31();
                btnTimerSH31.clearAnimation();
                flashingSH31 = false;
                flashinggSH31 = false;
                isTimerRunningSH31 = false;
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

    private void showConfirmationDialogForButton31() {
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
                peopleSH_31 = true;
                isTimerRunningSH31 = true;
                startTimeSH31r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime31 = Calendar.getInstance();
                currentHourSH31 = currentTime31.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH31 = currentTime31.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_31 = false;
                isTimerRunningSH31 = true;
                startTimeSH31r();
                flashingSH31 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH31 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH31 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton32() {
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
                stopTimer32();
                resetThresholdsToOriginal32();
                resetsecondsSH32();
                resetButtonColor32();
                btnTimerSH32.clearAnimation();
                flashingSH32 = false;
                flashinggSH32 = false;
                isTimerRunningSH32 = false;
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

    private void showConfirmationDialogForButton32() {
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
                peopleSH_32 = true;
                isTimerRunningSH32 = true;
                startTimeSH32r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime32 = Calendar.getInstance();
                currentHourSH32 = currentTime32.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH32 = currentTime32.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_32 = false;
                isTimerRunningSH32 = true;
                startTimeSH32r();
                flashingSH32 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH32 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH32 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton33() {
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
                stopTimer33();
                resetThresholdsToOriginal33();
                resetsecondsSH33();
                resetButtonColor33();
                btnTimerSH33.clearAnimation();
                flashingSH33 = false;
                flashinggSH33 = false;
                isTimerRunningSH33 = false;
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

    private void showConfirmationDialogForButton33() {
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
                peopleSH_33 = true;
                isTimerRunningSH33 = true;
                startTimeSH33r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime33 = Calendar.getInstance();
                currentHourSH33 = currentTime33.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH33 = currentTime33.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_33 = false;
                isTimerRunningSH33 = true;
                startTimeSH33r();
                flashingSH33 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourSH33 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteSH33 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
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






    private void startTimeSH101r() {
        startTimeSH101 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread101, 0);
    }

    private void startTimeSH102r() {
        startTimeSH102 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread102, 0);
    }

    private void startTimeSH103r() {
        startTimeSH103 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread103, 0);
    }

    private void startTimeSH104r() {
        startTimeSH104 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread104, 0);
    }

    private void startTimeSH105r() {
        startTimeSH105 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread105, 0);
    }

    private void startTimeSH106r() {
        startTimeSH106 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread106, 0);
    }

    private void startTimeSH107r() {
        startTimeSH107 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread107, 0);
    }

    private void startTimeSH8r() {
        startTimeSH8 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread8, 0);
    }

    private void startTimeSH9r() {
        startTimeSH9 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread9, 0);
    }

    private void startTimeSH10r() {
        startTimeSH10 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread10, 0);
    }

    private void startTimeSH11r() {
        startTimeSH11 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread11, 0);
    }

    private void startTimeSH12r() {
        startTimeSH12 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread12, 0);
    }

    private void startTimeSH13r() {
        startTimeSH13 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread13, 0);
    }

    private void startTimeSH14r() {
        startTimeSH14 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread14, 0);
    }

    private void startTimeSH15r() {
        startTimeSH15 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread15, 0);
    }

    private void startTimeSH16r() {
        startTimeSH16 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread16, 0);
    }

    private void startTimeSH17r() {
        startTimeSH17 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread17, 0);
    }

    private void startTimeSH18r() {
        startTimeSH18 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread18, 0);
    }

    private void startTimeSH19r() {
        startTimeSH19 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread19, 0);
    }

    private void startTimeSH20r() {
        startTimeSH20 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread20, 0);
    }
    private void startTimeSH21r() {
        startTimeSH21 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread21, 0);
    }

    private void startTimeSH22r() {
        startTimeSH22 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread22, 0);
    }

    private void startTimeSH23r() {
        startTimeSH23 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread23, 0);
    }

    private void startTimeSH24r() {
        startTimeSH24 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread24, 0);
    }

    private void startTimeSH25r() {
        startTimeSH25 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread25, 0);
    }

    private void startTimeSH26r() {
        startTimeSH26 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread26, 0);
    }

    private void startTimeSH27r() {
        startTimeSH27 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread27, 0);
    }

    private void startTimeSH28r() {
        startTimeSH28 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread28, 0);
    }

    private void startTimeSH29r() {
        startTimeSH29 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread29, 0);
    }

    private void startTimeSH30r() {
        startTimeSH30 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread30, 0);
    }

    private void startTimeSH31r() {
        startTimeSH31 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread31, 0);
    }

    private void startTimeSH32r() {
        startTimeSH32 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread32, 0);
    }

    private void startTimeSH33r() {
        startTimeSH33 = SystemClock.uptimeMillis();
        handlerSH.postDelayed(updateTimerThread33, 0);
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






    private void resetThresholdsToOriginal101() {
        yellowThreshold101 = originalyellowThresholdSH2;
        redThreshold101 = originalredThresholdSH2;
        blueThreshold101 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal102() {
        yellowThreshold102 = originalyellowThresholdSH2;
        redThreshold102 = originalredThresholdSH2;
        blueThreshold102 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal103() {
        yellowThreshold103 = originalyellowThresholdSH2;
        redThreshold103 = originalredThresholdSH2;
        blueThreshold103 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal104() {
        yellowThreshold104 = originalyellowThresholdSH2;
        redThreshold104 = originalredThresholdSH2;
        blueThreshold104 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal105() {
        yellowThreshold105 = originalyellowThresholdSH2;
        redThreshold105 = originalredThresholdSH2;
        blueThreshold105 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal106() {
        yellowThreshold106 = originalyellowThresholdSH2;
        redThreshold106 = originalredThresholdSH2;
        blueThreshold106 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal107() {
        yellowThreshold107 = originalyellowThresholdSH2;
        redThreshold107 = originalredThresholdSH2;
        blueThreshold107 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal8() {
        yellowThreshold8 = originalyellowThresholdSH2;
        redThreshold8 = originalredThresholdSH2;
        blueThreshold8 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal9() {
        yellowThreshold9 = originalyellowThresholdSH2;
        redThreshold9 = originalredThresholdSH2;
        blueThreshold9 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal10() {
        yellowThreshold10 = originalyellowThresholdSH2;
        redThreshold10 = originalredThresholdSH2;
        blueThreshold10 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal11() {
        yellowThreshold11 = originalyellowThresholdSH2;
        redThreshold11 = originalredThresholdSH2;
        blueThreshold11 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal12() {
        yellowThreshold12 = originalyellowThresholdSH2;
        redThreshold12 = originalredThresholdSH2;
        blueThreshold12 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal13() {
        yellowThreshold13 = originalyellowThresholdSH2;
        redThreshold13 = originalredThresholdSH2;
        blueThreshold13 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal14() {
        yellowThreshold14 = originalyellowThresholdSH2;
        redThreshold14 = originalredThresholdSH2;
        blueThreshold14 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal15() {
        yellowThreshold15 = originalyellowThresholdSH2;
        redThreshold15 = originalredThresholdSH2;
        blueThreshold15 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal16() {
        yellowThreshold16 = originalyellowThresholdSH2;
        redThreshold16 = originalredThresholdSH2;
        blueThreshold16 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal17() {
        yellowThreshold17 = originalyellowThresholdSH2;
        redThreshold17 = originalredThresholdSH2;
        blueThreshold17 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal18() {
        yellowThreshold18 = originalyellowThresholdSH2;
        redThreshold18 = originalredThresholdSH2;
        blueThreshold18 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal19() {
        yellowThreshold19 = originalyellowThresholdSH2;
        redThreshold19 = originalredThresholdSH2;
        blueThreshold19 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal20() {
        yellowThreshold20 = originalyellowThresholdSH2;
        redThreshold20 = originalredThresholdSH2;
        blueThreshold20 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal21() {
        yellowThreshold21 = originalyellowThresholdSH2;
        redThreshold21 = originalredThresholdSH2;
        blueThreshold21 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal22() {
        yellowThreshold22 = originalyellowThresholdSH2;
        redThreshold22 = originalredThresholdSH2;
        blueThreshold22 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal23() {
        yellowThreshold23 = originalyellowThresholdSH2;
        redThreshold23 = originalredThresholdSH2;
        blueThreshold23 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal24() {
        yellowThreshold24 = originalyellowThresholdSH2;
        redThreshold24 = originalredThresholdSH2;
        blueThreshold24 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal25() {
        yellowThreshold25 = originalyellowThresholdSH2;
        redThreshold25 = originalredThresholdSH2;
        blueThreshold25 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal26() {
        yellowThreshold26 = originalyellowThresholdSH2;
        redThreshold26 = originalredThresholdSH2;
        blueThreshold26 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal27() {
        yellowThreshold27 = originalyellowThresholdSH2;
        redThreshold27 = originalredThresholdSH2;
        blueThreshold27 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal28() {
        yellowThreshold28 = originalyellowThresholdSH2;
        redThreshold28 = originalredThresholdSH2;
        blueThreshold28 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal29() {
        yellowThreshold29 = originalyellowThresholdSH2;
        redThreshold29 = originalredThresholdSH2;
        blueThreshold29 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal30() {
        yellowThreshold30 = originalyellowThresholdSH2;
        redThreshold30 = originalredThresholdSH2;
        blueThreshold30 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal31() {
        yellowThreshold31 = originalyellowThresholdSH2;
        redThreshold31 = originalredThresholdSH2;
        blueThreshold31 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal32() {
        yellowThreshold32 = originalyellowThresholdSH2;
        redThreshold32 = originalredThresholdSH2;
        blueThreshold32 = originalblueThresholdSH2;
    }

    private void resetThresholdsToOriginal33() {
        yellowThreshold33 = originalyellowThresholdSH2;
        redThreshold33 = originalredThresholdSH2;
        blueThreshold33 = originalblueThresholdSH2;
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





    private int Thousand = 1000;
    private int Thirty = 30;
    private int Sixty = 60;
    private int ThreeThousandSix = 3600;
    private int TwentyFour = 24;
    private int Eleven = 11;
    private int Five = 5;
    private int Twenty = 16;

    private Runnable updateTimerThread101 = new Runnable() {
        public void run() {
            timeInMillisecondsSH101 = SystemClock.uptimeMillis() - startTimeSH101;
            updatedTimeSH101 = timeInMillisecondsSH101;
            secondsSH101 = (int) (updatedTimeSH101 / Thousand);
            minutesSH101 = secondsSH101 / Sixty;
            hoursSH101 = minutesSH101 / Sixty;
            secondsSH101 = secondsSH101 % Sixty;
            minutesSH101 = minutesSH101 % Sixty;
            secSH101 = hoursSH101 * ThreeThousandSix + minutesSH101 * Sixty + secondsSH101;

            // 计算当前时间加上 redThreshold101 后的时间（秒数）
            int totalSeconds = currentHourSH101 * ThreeThousandSix + currentMinuteSH101 * Sixty + redThreshold101;
            // 计算小时和分钟
            futureHourSH101 = totalSeconds / ThreeThousandSix;
            futureMinuteSH101 = (totalSeconds % ThreeThousandSix) / Sixty;
            // 处理超过102104小时的进位
            if (futureHourSH101 >= TwentyFour) {
                futureHourSH101 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH101, currentMinuteSH101);
            String futureTimeString = String.format("%02d:%02d", futureHourSH101, futureMinuteSH101);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共有101101個字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH101.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH101.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH101.setText(Html.fromHtml(displayText));
            }

            updateButtonColor101();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread102 = new Runnable() {
        public void run() {
            timeInMillisecondsSH102 = SystemClock.uptimeMillis() - startTimeSH102;
            updatedTimeSH102 = timeInMillisecondsSH102;
            secondsSH102 = (int) (updatedTimeSH102 / Thousand);
            minutesSH102 = secondsSH102 / Sixty;
            hoursSH102 = minutesSH102 / Sixty;
            secondsSH102 = secondsSH102 % Sixty;
            minutesSH102 = minutesSH102 % Sixty;
            secSH102 = hoursSH102 * ThreeThousandSix + minutesSH102 * Sixty + secondsSH102;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH102 * ThreeThousandSix + currentMinuteSH102 * Sixty + redThreshold102;
            // 计算小时和分钟
            futureHourSH102 = totalSeconds / ThreeThousandSix;
            futureMinuteSH102 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH102 >= TwentyFour) {
                futureHourSH102 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH102, currentMinuteSH102);
            String futureTimeString = String.format("%02d:%02d", futureHourSH102, futureMinuteSH102);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH102.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH102.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH102.setText(Html.fromHtml(displayText));
            }

            updateButtonColor102();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread103 = new Runnable() {
        public void run() {
            timeInMillisecondsSH103 = SystemClock.uptimeMillis() - startTimeSH103;
            updatedTimeSH103 = timeInMillisecondsSH103;
            secondsSH103 = (int) (updatedTimeSH103 / Thousand);
            minutesSH103 = secondsSH103 / Sixty;
            hoursSH103 = minutesSH103 / Sixty;
            secondsSH103 = secondsSH103 % Sixty;
            minutesSH103 = minutesSH103 % Sixty;
            secSH103 = hoursSH103 * ThreeThousandSix + minutesSH103 * Sixty + secondsSH103;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH103 * ThreeThousandSix + currentMinuteSH103 * Sixty + redThreshold103;
            // 计算小时和分钟
            futureHourSH103 = totalSeconds / ThreeThousandSix;
            futureMinuteSH103 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH103 >= TwentyFour) {
                futureHourSH103 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH103, currentMinuteSH103);
            String futureTimeString = String.format("%02d:%02d", futureHourSH103, futureMinuteSH103);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH103.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH103.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH103.setText(Html.fromHtml(displayText));
            }

            updateButtonColor103();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread104 = new Runnable() {
        public void run() {
            timeInMillisecondsSH104 = SystemClock.uptimeMillis() - startTimeSH104;
            updatedTimeSH104 = timeInMillisecondsSH104;
            secondsSH104 = (int) (updatedTimeSH104 / Thousand);
            minutesSH104 = secondsSH104 / Sixty;
            hoursSH104 = minutesSH104 / Sixty;
            secondsSH104 = secondsSH104 % Sixty;
            minutesSH104 = minutesSH104 % Sixty;
            secSH104 = hoursSH104 * ThreeThousandSix + minutesSH104 * Sixty + secondsSH104;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH104 * ThreeThousandSix + currentMinuteSH104 * Sixty + redThreshold104;
            // 计算小时和分钟
            futureHourSH104 = totalSeconds / ThreeThousandSix;
            futureMinuteSH104 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH104 >= TwentyFour) {
                futureHourSH104 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH104, currentMinuteSH104);
            String futureTimeString = String.format("%02d:%02d", futureHourSH104, futureMinuteSH104);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH104.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH104.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH104.setText(Html.fromHtml(displayText));
            }

            updateButtonColor104();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread105 = new Runnable() {
        public void run() {
            timeInMillisecondsSH105 = SystemClock.uptimeMillis() - startTimeSH105;
            updatedTimeSH105 = timeInMillisecondsSH105;
            secondsSH105 = (int) (updatedTimeSH105 / Thousand);
            minutesSH105 = secondsSH105 / Sixty;
            hoursSH105 = minutesSH105 / Sixty;
            secondsSH105 = secondsSH105 % Sixty;
            minutesSH105 = minutesSH105 % Sixty;
            secSH105 = hoursSH105 * ThreeThousandSix + minutesSH105 * Sixty + secondsSH105;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH105 * ThreeThousandSix + currentMinuteSH105 * Sixty + redThreshold105;
            // 计算小时和分钟
            futureHourSH105 = totalSeconds / ThreeThousandSix;
            futureMinuteSH105 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH105 >= TwentyFour) {
                futureHourSH105 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH105, currentMinuteSH105);
            String futureTimeString = String.format("%02d:%02d", futureHourSH105, futureMinuteSH105);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH105.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH105.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH105.setText(Html.fromHtml(displayText));
            }

            updateButtonColor105();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread106 = new Runnable() {
        public void run() {
            timeInMillisecondsSH106 = SystemClock.uptimeMillis() - startTimeSH106;
            updatedTimeSH106 = timeInMillisecondsSH106;
            secondsSH106 = (int) (updatedTimeSH106 / Thousand);
            minutesSH106 = secondsSH106 / Sixty;
            hoursSH106 = minutesSH106 / Sixty;
            secondsSH106 = secondsSH106 % Sixty;
            minutesSH106 = minutesSH106 % Sixty;
            secSH106 = hoursSH106 * ThreeThousandSix + minutesSH106 * Sixty + secondsSH106;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH106 * ThreeThousandSix + currentMinuteSH106 * Sixty + redThreshold106;
            // 计算小时和分钟
            futureHourSH106 = totalSeconds / ThreeThousandSix;
            futureMinuteSH106 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH106 >= TwentyFour) {
                futureHourSH106 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH106, currentMinuteSH106);
            String futureTimeString = String.format("%02d:%02d", futureHourSH106, futureMinuteSH106);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH106.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH106.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH106.setText(Html.fromHtml(displayText));
            }

            updateButtonColor106();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread107 = new Runnable() {
        public void run() {
            timeInMillisecondsSH107 = SystemClock.uptimeMillis() - startTimeSH107;
            updatedTimeSH107 = timeInMillisecondsSH107;
            secondsSH107 = (int) (updatedTimeSH107 / Thousand);
            minutesSH107 = secondsSH107 / Sixty;
            hoursSH107 = minutesSH107 / Sixty;
            secondsSH107 = secondsSH107 % Sixty;
            minutesSH107 = minutesSH107 % Sixty;
            secSH107 = hoursSH107 * ThreeThousandSix + minutesSH107 * Sixty + secondsSH107;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH107 * ThreeThousandSix + currentMinuteSH107 * Sixty + redThreshold107;
            // 计算小时和分钟
            futureHourSH107 = totalSeconds / ThreeThousandSix;
            futureMinuteSH107 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH107 >= TwentyFour) {
                futureHourSH107 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH107, currentMinuteSH107);
            String futureTimeString = String.format("%02d:%02d", futureHourSH107, futureMinuteSH107);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH107.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH107.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH107.setText(Html.fromHtml(displayText));
            }

            updateButtonColor107();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread8 = new Runnable() {
        public void run() {
            timeInMillisecondsSH8 = SystemClock.uptimeMillis() - startTimeSH8;
            updatedTimeSH8 = timeInMillisecondsSH8;
            secondsSH8 = (int) (updatedTimeSH8 / Thousand);
            minutesSH8 = secondsSH8 / Sixty;
            hoursSH8 = minutesSH8 / Sixty;
            secondsSH8 = secondsSH8 % Sixty;
            minutesSH8 = minutesSH8 % Sixty;
            secSH8 = hoursSH8 * ThreeThousandSix + minutesSH8 * Sixty + secondsSH8;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH8 * ThreeThousandSix + currentMinuteSH8 * Sixty + redThreshold8;
            // 计算小时和分钟
            futureHourSH8 = totalSeconds / ThreeThousandSix;
            futureMinuteSH8 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH8 >= TwentyFour) {
                futureHourSH8 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH8, currentMinuteSH8);
            String futureTimeString = String.format("%02d:%02d", futureHourSH8, futureMinuteSH8);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH8.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH8.setText(Html.fromHtml(displayText));
            }

            updateButtonColor8();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread9 = new Runnable() {
        public void run() {
            timeInMillisecondsSH9 = SystemClock.uptimeMillis() - startTimeSH9;
            updatedTimeSH9 = timeInMillisecondsSH9;
            secondsSH9 = (int) (updatedTimeSH9 / Thousand);
            minutesSH9 = secondsSH9 / Sixty;
            hoursSH9 = minutesSH9 / Sixty;
            secondsSH9 = secondsSH9 % Sixty;
            minutesSH9 = minutesSH9 % Sixty;
            secSH9 = hoursSH9 * ThreeThousandSix + minutesSH9 * Sixty + secondsSH9;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH9 * ThreeThousandSix + currentMinuteSH9 * Sixty + redThreshold9;
            // 计算小时和分钟
            futureHourSH9 = totalSeconds / ThreeThousandSix;
            futureMinuteSH9 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH9 >= TwentyFour) {
                futureHourSH9 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH9, currentMinuteSH9);
            String futureTimeString = String.format("%02d:%02d", futureHourSH9, futureMinuteSH9);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH9.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH9.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH9.setText(Html.fromHtml(displayText));
            }

            updateButtonColor9();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread10 = new Runnable() {
        public void run() {
            timeInMillisecondsSH10 = SystemClock.uptimeMillis() - startTimeSH10;
            updatedTimeSH10 = timeInMillisecondsSH10;
            secondsSH10 = (int) (updatedTimeSH10 / Thousand);
            minutesSH10 = secondsSH10 / Sixty;
            hoursSH10 = minutesSH10 / Sixty;
            secondsSH10 = secondsSH10 % Sixty;
            minutesSH10 = minutesSH10 % Sixty;
            secSH10 = hoursSH10 * ThreeThousandSix + minutesSH10 * Sixty + secondsSH10;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH10 * ThreeThousandSix + currentMinuteSH10 * Sixty + redThreshold10;
            // 计算小时和分钟
            futureHourSH10 = totalSeconds / ThreeThousandSix;
            futureMinuteSH10 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH10 >= TwentyFour) {
                futureHourSH10 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH10, currentMinuteSH10);
            String futureTimeString = String.format("%02d:%02d", futureHourSH10, futureMinuteSH10);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH10.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH10.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH10.setText(Html.fromHtml(displayText));
            }

            updateButtonColor10();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread11 = new Runnable() {
        public void run() {
            timeInMillisecondsSH11 = SystemClock.uptimeMillis() - startTimeSH11;
            updatedTimeSH11 = timeInMillisecondsSH11;
            secondsSH11 = (int) (updatedTimeSH11 / Thousand);
            minutesSH11 = secondsSH11 / Sixty;
            hoursSH11 = minutesSH11 / Sixty;
            secondsSH11 = secondsSH11 % Sixty;
            minutesSH11 = minutesSH11 % Sixty;
            secSH11 = hoursSH11 * ThreeThousandSix + minutesSH11 * Sixty + secondsSH11;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH11 * ThreeThousandSix + currentMinuteSH11 * Sixty + redThreshold11;
            // 计算小时和分钟
            futureHourSH11 = totalSeconds / ThreeThousandSix;
            futureMinuteSH11 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH11 >= TwentyFour) {
                futureHourSH11 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH11, currentMinuteSH11);
            String futureTimeString = String.format("%02d:%02d", futureHourSH11, futureMinuteSH11);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH11.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH11.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH11.setText(Html.fromHtml(displayText));
            }

            updateButtonColor11();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread12 = new Runnable() {
        public void run() {
            timeInMillisecondsSH12 = SystemClock.uptimeMillis() - startTimeSH12;
            updatedTimeSH12 = timeInMillisecondsSH12;
            secondsSH12 = (int) (updatedTimeSH12 / Thousand);
            minutesSH12 = secondsSH12 / Sixty;
            hoursSH12 = minutesSH12 / Sixty;
            secondsSH12 = secondsSH12 % Sixty;
            minutesSH12 = minutesSH12 % Sixty;
            secSH12 = hoursSH12 * ThreeThousandSix + minutesSH12 * Sixty + secondsSH12;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH12 * ThreeThousandSix + currentMinuteSH12 * Sixty + redThreshold12;
            // 计算小时和分钟
            futureHourSH12 = totalSeconds / ThreeThousandSix;
            futureMinuteSH12 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH12 >= TwentyFour) {
                futureHourSH12 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH12, currentMinuteSH12);
            String futureTimeString = String.format("%02d:%02d", futureHourSH12, futureMinuteSH12);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH12.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH12.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH12.setText(Html.fromHtml(displayText));
            }

            updateButtonColor12();
            handlerSH.postDelayed(this,delay);
        }
    };
    private Runnable updateTimerThread13 = new Runnable() {
        public void run() {
            timeInMillisecondsSH13 = SystemClock.uptimeMillis() - startTimeSH13;
            updatedTimeSH13 = timeInMillisecondsSH13;
            secondsSH13 = (int) (updatedTimeSH13 / Thousand);
            minutesSH13 = secondsSH13 / Sixty;
            hoursSH13 = minutesSH13 / Sixty;
            secondsSH13 = secondsSH13 % Sixty;
            minutesSH13 = minutesSH13 % Sixty;
            secSH13 = hoursSH13 * ThreeThousandSix + minutesSH13 * Sixty + secondsSH13;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH13 * ThreeThousandSix + currentMinuteSH13 * Sixty + redThreshold13;
            // 计算小时和分钟
            futureHourSH13 = totalSeconds / ThreeThousandSix;
            futureMinuteSH13 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH13 >= TwentyFour) {
                futureHourSH13 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH13, currentMinuteSH13);
            String futureTimeString = String.format("%02d:%02d", futureHourSH13, futureMinuteSH13);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH13.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH13.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH13.setText(Html.fromHtml(displayText));
            }

            updateButtonColor13();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread14 = new Runnable() {
        public void run() {
            timeInMillisecondsSH14 = SystemClock.uptimeMillis() - startTimeSH14;
            updatedTimeSH14 = timeInMillisecondsSH14;
            secondsSH14 = (int) (updatedTimeSH14 / Thousand);
            minutesSH14 = secondsSH14 / Sixty;
            hoursSH14 = minutesSH14 / Sixty;
            secondsSH14 = secondsSH14 % Sixty;
            minutesSH14 = minutesSH14 % Sixty;
            secSH14 = hoursSH14 * ThreeThousandSix + minutesSH14 * Sixty + secondsSH14;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH14 * ThreeThousandSix + currentMinuteSH14 * Sixty + redThreshold14;
            // 计算小时和分钟
            futureHourSH14 = totalSeconds / ThreeThousandSix;
            futureMinuteSH14 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH14 >= TwentyFour) {
                futureHourSH14 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH14, currentMinuteSH14);
            String futureTimeString = String.format("%02d:%02d", futureHourSH14, futureMinuteSH14);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH14.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH14.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH14.setText(Html.fromHtml(displayText));
            }

            updateButtonColor14();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread15 = new Runnable() {
        public void run() {
            timeInMillisecondsSH15 = SystemClock.uptimeMillis() - startTimeSH15;
            updatedTimeSH15 = timeInMillisecondsSH15;
            secondsSH15 = (int) (updatedTimeSH15 / Thousand);
            minutesSH15 = secondsSH15 / Sixty;
            hoursSH15 = minutesSH15 / Sixty;
            secondsSH15 = secondsSH15 % Sixty;
            minutesSH15 = minutesSH15 % Sixty;
            secSH15 = hoursSH15 * ThreeThousandSix + minutesSH15 * Sixty + secondsSH15;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH15 * ThreeThousandSix + currentMinuteSH15 * Sixty + redThreshold15;
            // 计算小时和分钟
            futureHourSH15 = totalSeconds / ThreeThousandSix;
            futureMinuteSH15 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH15 >= TwentyFour) {
                futureHourSH15 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH15, currentMinuteSH15);
            String futureTimeString = String.format("%02d:%02d", futureHourSH15, futureMinuteSH15);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH15.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH15.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH15.setText(Html.fromHtml(displayText));
            }

            updateButtonColor15();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread16 = new Runnable() {
        public void run() {
            timeInMillisecondsSH16 = SystemClock.uptimeMillis() - startTimeSH16;
            updatedTimeSH16 = timeInMillisecondsSH16;
            secondsSH16 = (int) (updatedTimeSH16 / Thousand);
            minutesSH16 = secondsSH16 / Sixty;
            hoursSH16 = minutesSH16 / Sixty;
            secondsSH16 = secondsSH16 % Sixty;
            minutesSH16 = minutesSH16 % Sixty;
            secSH16 = hoursSH16 * ThreeThousandSix + minutesSH16 * Sixty + secondsSH16;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH16 * ThreeThousandSix + currentMinuteSH16 * Sixty + redThreshold16;
            // 计算小时和分钟
            futureHourSH16 = totalSeconds / ThreeThousandSix;
            futureMinuteSH16 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH16 >= TwentyFour) {
                futureHourSH16 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH16, currentMinuteSH16);
            String futureTimeString = String.format("%02d:%02d", futureHourSH16, futureMinuteSH16);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH16.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH16.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH16.setText(Html.fromHtml(displayText));
            }

            updateButtonColor16();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread17 = new Runnable() {
        public void run() {
            timeInMillisecondsSH17 = SystemClock.uptimeMillis() - startTimeSH17;
            updatedTimeSH17 = timeInMillisecondsSH17;
            secondsSH17 = (int) (updatedTimeSH17 / Thousand);
            minutesSH17 = secondsSH17 / Sixty;
            hoursSH17 = minutesSH17 / Sixty;
            secondsSH17 = secondsSH17 % Sixty;
            minutesSH17 = minutesSH17 % Sixty;
            secSH17 = hoursSH17 * ThreeThousandSix + minutesSH17 * Sixty + secondsSH17;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH17 * ThreeThousandSix + currentMinuteSH17 * Sixty + redThreshold17;
            // 计算小时和分钟
            futureHourSH17 = totalSeconds / ThreeThousandSix;
            futureMinuteSH17 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH17 >= TwentyFour) {
                futureHourSH17 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH17, currentMinuteSH17);
            String futureTimeString = String.format("%02d:%02d", futureHourSH17, futureMinuteSH17);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH17.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH17.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH17.setText(Html.fromHtml(displayText));
            }

            updateButtonColor17();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread18 = new Runnable() {
        public void run() {
            timeInMillisecondsSH18 = SystemClock.uptimeMillis() - startTimeSH18;
            updatedTimeSH18 = timeInMillisecondsSH18;
            secondsSH18 = (int) (updatedTimeSH18 / Thousand);
            minutesSH18 = secondsSH18 / Sixty;
            hoursSH18 = minutesSH18 / Sixty;
            secondsSH18 = secondsSH18 % Sixty;
            minutesSH18 = minutesSH18 % Sixty;
            secSH18 = hoursSH18 * ThreeThousandSix + minutesSH18 * Sixty + secondsSH18;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH18 * ThreeThousandSix + currentMinuteSH18 * Sixty + redThreshold18;
            // 计算小时和分钟
            futureHourSH18 = totalSeconds / ThreeThousandSix;
            futureMinuteSH18 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH18 >= TwentyFour) {
                futureHourSH18 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH18, currentMinuteSH18);
            String futureTimeString = String.format("%02d:%02d", futureHourSH18, futureMinuteSH18);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH18.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH18.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH18.setText(Html.fromHtml(displayText));
            }

            updateButtonColor18();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread19 = new Runnable() {
        public void run() {
            timeInMillisecondsSH19 = SystemClock.uptimeMillis() - startTimeSH19;
            updatedTimeSH19 = timeInMillisecondsSH19;
            secondsSH19 = (int) (updatedTimeSH19 / Thousand);
            minutesSH19 = secondsSH19 / Sixty;
            hoursSH19 = minutesSH19 / Sixty;
            secondsSH19 = secondsSH19 % Sixty;
            minutesSH19 = minutesSH19 % Sixty;
            secSH19 = hoursSH19 * ThreeThousandSix + minutesSH19 * Sixty + secondsSH19;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH19 * ThreeThousandSix + currentMinuteSH19 * Sixty + redThreshold19;
            // 计算小时和分钟
            futureHourSH19 = totalSeconds / ThreeThousandSix;
            futureMinuteSH19 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH19 >= TwentyFour) {
                futureHourSH19 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH19, currentMinuteSH19);
            String futureTimeString = String.format("%02d:%02d", futureHourSH19, futureMinuteSH19);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH19.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH19.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH19.setText(Html.fromHtml(displayText));
            }

            updateButtonColor19();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread20 = new Runnable() {
        public void run() {
            timeInMillisecondsSH20 = SystemClock.uptimeMillis() - startTimeSH20;
            updatedTimeSH20 = timeInMillisecondsSH20;
            secondsSH20 = (int) (updatedTimeSH20 / Thousand);
            minutesSH20 = secondsSH20 / Sixty;
            hoursSH20 = minutesSH20 / Sixty;
            secondsSH20 = secondsSH20 % Sixty;
            minutesSH20 = minutesSH20 % Sixty;
            secSH20 = hoursSH20 * ThreeThousandSix + minutesSH20 * Sixty + secondsSH20;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH20 * ThreeThousandSix + currentMinuteSH20 * Sixty + redThreshold20;
            // 计算小时和分钟
            futureHourSH20 = totalSeconds / ThreeThousandSix;
            futureMinuteSH20 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH20 >= TwentyFour) {
                futureHourSH20 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH20, currentMinuteSH20);
            String futureTimeString = String.format("%02d:%02d", futureHourSH20, futureMinuteSH20);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH20.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH20.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH20.setText(Html.fromHtml(displayText));
            }

            updateButtonColor20();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread21 = new Runnable() {
        public void run() {
            timeInMillisecondsSH21 = SystemClock.uptimeMillis() - startTimeSH21;
            updatedTimeSH21 = timeInMillisecondsSH21;
            secondsSH21 = (int) (updatedTimeSH21 / Thousand);
            minutesSH21 = secondsSH21 / Sixty;
            hoursSH21 = minutesSH21 / Sixty;
            secondsSH21 = secondsSH21 % Sixty;
            minutesSH21 = minutesSH21 % Sixty;
            secSH21 = hoursSH21 * ThreeThousandSix + minutesSH21 * Sixty + secondsSH21;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH21 * ThreeThousandSix + currentMinuteSH21 * Sixty + redThreshold21;
            // 计算小时和分钟
            futureHourSH21 = totalSeconds / ThreeThousandSix;
            futureMinuteSH21 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH21 >= TwentyFour) {
                futureHourSH21 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH21, currentMinuteSH21);
            String futureTimeString = String.format("%02d:%02d", futureHourSH21, futureMinuteSH21);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH21.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH21.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH21.setText(Html.fromHtml(displayText));
            }

            updateButtonColor21();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread22 = new Runnable() {
        public void run() {
            timeInMillisecondsSH22 = SystemClock.uptimeMillis() - startTimeSH22;
            updatedTimeSH22 = timeInMillisecondsSH22;
            secondsSH22 = (int) (updatedTimeSH22 / Thousand);
            minutesSH22 = secondsSH22 / Sixty;
            hoursSH22 = minutesSH22 / Sixty;
            secondsSH22 = secondsSH22 % Sixty;
            minutesSH22 = minutesSH22 % Sixty;
            secSH22 = hoursSH22 * ThreeThousandSix + minutesSH22 * Sixty + secondsSH22;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH22 * ThreeThousandSix + currentMinuteSH22 * Sixty + redThreshold22;
            // 计算小时和分钟
            futureHourSH22 = totalSeconds / ThreeThousandSix;
            futureMinuteSH22 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH22 >= TwentyFour) {
                futureHourSH22 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH22, currentMinuteSH22);
            String futureTimeString = String.format("%02d:%02d", futureHourSH22, futureMinuteSH22);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH22.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH22.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH22.setText(Html.fromHtml(displayText));
            }

            updateButtonColor22();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread23 = new Runnable() {
        public void run() {
            timeInMillisecondsSH23 = SystemClock.uptimeMillis() - startTimeSH23;
            updatedTimeSH23 = timeInMillisecondsSH23;
            secondsSH23 = (int) (updatedTimeSH23 / Thousand);
            minutesSH23 = secondsSH23 / Sixty;
            hoursSH23 = minutesSH23 / Sixty;
            secondsSH23 = secondsSH23 % Sixty;
            minutesSH23 = minutesSH23 % Sixty;
            secSH23 = hoursSH23 * ThreeThousandSix + minutesSH23 * Sixty + secondsSH23;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH23 * ThreeThousandSix + currentMinuteSH23 * Sixty + redThreshold23;
            // 计算小时和分钟
            futureHourSH23 = totalSeconds / ThreeThousandSix;
            futureMinuteSH23 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH23 >= TwentyFour) {
                futureHourSH23 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH23, currentMinuteSH23);
            String futureTimeString = String.format("%02d:%02d", futureHourSH23, futureMinuteSH23);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH23.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH23.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH23.setText(Html.fromHtml(displayText));
            }

            updateButtonColor23();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread24 = new Runnable() {
        public void run() {
            timeInMillisecondsSH24 = SystemClock.uptimeMillis() - startTimeSH24;
            updatedTimeSH24 = timeInMillisecondsSH24;
            secondsSH24 = (int) (updatedTimeSH24 / Thousand);
            minutesSH24 = secondsSH24 / Sixty;
            hoursSH24 = minutesSH24 / Sixty;
            secondsSH24 = secondsSH24 % Sixty;
            minutesSH24 = minutesSH24 % Sixty;
            secSH24 = hoursSH24 * ThreeThousandSix + minutesSH24 * Sixty + secondsSH24;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH24 * ThreeThousandSix + currentMinuteSH24 * Sixty + redThreshold24;
            // 计算小时和分钟
            futureHourSH24 = totalSeconds / ThreeThousandSix;
            futureMinuteSH24 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH24 >= TwentyFour) {
                futureHourSH24 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH24, currentMinuteSH24);
            String futureTimeString = String.format("%02d:%02d", futureHourSH24, futureMinuteSH24);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH24.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH24.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH24.setText(Html.fromHtml(displayText));
            }

            updateButtonColor24();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread25 = new Runnable() {
        public void run() {
            timeInMillisecondsSH25 = SystemClock.uptimeMillis() - startTimeSH25;
            updatedTimeSH25 = timeInMillisecondsSH25;
            secondsSH25 = (int) (updatedTimeSH25 / Thousand);
            minutesSH25 = secondsSH25 / Sixty;
            hoursSH25 = minutesSH25 / Sixty;
            secondsSH25 = secondsSH25 % Sixty;
            minutesSH25 = minutesSH25 % Sixty;
            secSH25 = hoursSH25 * ThreeThousandSix + minutesSH25 * Sixty + secondsSH25;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH25 * ThreeThousandSix + currentMinuteSH25 * Sixty + redThreshold25;
            // 计算小时和分钟
            futureHourSH25 = totalSeconds / ThreeThousandSix;
            futureMinuteSH25 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH25 >= TwentyFour) {
                futureHourSH25 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH25, currentMinuteSH25);
            String futureTimeString = String.format("%02d:%02d", futureHourSH25, futureMinuteSH25);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH25.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH25.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH25.setText(Html.fromHtml(displayText));
            }

            updateButtonColor25();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread26 = new Runnable() {
        public void run() {
            timeInMillisecondsSH26 = SystemClock.uptimeMillis() - startTimeSH26;
            updatedTimeSH26 = timeInMillisecondsSH26;
            secondsSH26 = (int) (updatedTimeSH26 / Thousand);
            minutesSH26 = secondsSH26 / Sixty;
            hoursSH26 = minutesSH26 / Sixty;
            secondsSH26 = secondsSH26 % Sixty;
            minutesSH26 = minutesSH26 % Sixty;
            secSH26 = hoursSH26 * ThreeThousandSix + minutesSH26 * Sixty + secondsSH26;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH26 * ThreeThousandSix + currentMinuteSH26 * Sixty + redThreshold26;
            // 计算小时和分钟
            futureHourSH26 = totalSeconds / ThreeThousandSix;
            futureMinuteSH26 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH26 >= TwentyFour) {
                futureHourSH26 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH26, currentMinuteSH26);
            String futureTimeString = String.format("%02d:%02d", futureHourSH26, futureMinuteSH26);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH26.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH26.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH26.setText(Html.fromHtml(displayText));
            }

            updateButtonColor26();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread27 = new Runnable() {
        public void run() {
            timeInMillisecondsSH27 = SystemClock.uptimeMillis() - startTimeSH27;
            updatedTimeSH27 = timeInMillisecondsSH27;
            secondsSH27 = (int) (updatedTimeSH27 / Thousand);
            minutesSH27 = secondsSH27 / Sixty;
            hoursSH27 = minutesSH27 / Sixty;
            secondsSH27 = secondsSH27 % Sixty;
            minutesSH27 = minutesSH27 % Sixty;
            secSH27 = hoursSH27 * ThreeThousandSix + minutesSH27 * Sixty + secondsSH27;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH27 * ThreeThousandSix + currentMinuteSH27 * Sixty + redThreshold27;
            // 计算小时和分钟
            futureHourSH27 = totalSeconds / ThreeThousandSix;
            futureMinuteSH27 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH27 >= TwentyFour) {
                futureHourSH27 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH27, currentMinuteSH27);
            String futureTimeString = String.format("%02d:%02d", futureHourSH27, futureMinuteSH27);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH27.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH27.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH27.setText(Html.fromHtml(displayText));
            }

            updateButtonColor27();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread28 = new Runnable() {
        public void run() {
            timeInMillisecondsSH28 = SystemClock.uptimeMillis() - startTimeSH28;
            updatedTimeSH28 = timeInMillisecondsSH28;
            secondsSH28 = (int) (updatedTimeSH28 / Thousand);
            minutesSH28 = secondsSH28 / Sixty;
            hoursSH28 = minutesSH28 / Sixty;
            secondsSH28 = secondsSH28 % Sixty;
            minutesSH28 = minutesSH28 % Sixty;
            secSH28 = hoursSH28 * ThreeThousandSix + minutesSH28 * Sixty + secondsSH28;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH28 * ThreeThousandSix + currentMinuteSH28 * Sixty + redThreshold28;
            // 计算小时和分钟
            futureHourSH28 = totalSeconds / ThreeThousandSix;
            futureMinuteSH28 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH28 >= TwentyFour) {
                futureHourSH28 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH28, currentMinuteSH28);
            String futureTimeString = String.format("%02d:%02d", futureHourSH28, futureMinuteSH28);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH28.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH28.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH28.setText(Html.fromHtml(displayText));
            }

            updateButtonColor28();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread29 = new Runnable() {
        public void run() {
            timeInMillisecondsSH29 = SystemClock.uptimeMillis() - startTimeSH29;
            updatedTimeSH29 = timeInMillisecondsSH29;
            secondsSH29 = (int) (updatedTimeSH29 / Thousand);
            minutesSH29 = secondsSH29 / Sixty;
            hoursSH29 = minutesSH29 / Sixty;
            secondsSH29 = secondsSH29 % Sixty;
            minutesSH29 = minutesSH29 % Sixty;
            secSH29 = hoursSH29 * ThreeThousandSix + minutesSH29 * Sixty + secondsSH29;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH29 * ThreeThousandSix + currentMinuteSH29 * Sixty + redThreshold29;
            // 计算小时和分钟
            futureHourSH29 = totalSeconds / ThreeThousandSix;
            futureMinuteSH29 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH29 >= TwentyFour) {
                futureHourSH29 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH29, currentMinuteSH29);
            String futureTimeString = String.format("%02d:%02d", futureHourSH29, futureMinuteSH29);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH29.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH29.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH29.setText(Html.fromHtml(displayText));
            }

            updateButtonColor29();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread30 = new Runnable() {
        public void run() {
            timeInMillisecondsSH30 = SystemClock.uptimeMillis() - startTimeSH30;
            updatedTimeSH30 = timeInMillisecondsSH30;
            secondsSH30 = (int) (updatedTimeSH30 / Thousand);
            minutesSH30 = secondsSH30 / Sixty;
            hoursSH30 = minutesSH30 / Sixty;
            secondsSH30 = secondsSH30 % Sixty;
            minutesSH30 = minutesSH30 % Sixty;
            secSH30 = hoursSH30 * ThreeThousandSix + minutesSH30 * Sixty + secondsSH30;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH30 * ThreeThousandSix + currentMinuteSH30 * Sixty + redThreshold30;
            // 计算小时和分钟
            futureHourSH30 = totalSeconds / ThreeThousandSix;
            futureMinuteSH30 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH30 >= TwentyFour) {
                futureHourSH30 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH30, currentMinuteSH30);
            String futureTimeString = String.format("%02d:%02d", futureHourSH30, futureMinuteSH30);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH30.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH30.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH30.setText(Html.fromHtml(displayText));
            }

            updateButtonColor30();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread31 = new Runnable() {
        public void run() {
            timeInMillisecondsSH31 = SystemClock.uptimeMillis() - startTimeSH31;
            updatedTimeSH31 = timeInMillisecondsSH31;
            secondsSH31 = (int) (updatedTimeSH31 / Thousand);
            minutesSH31 = secondsSH31 / Sixty;
            hoursSH31 = minutesSH31 / Sixty;
            secondsSH31 = secondsSH31 % Sixty;
            minutesSH31 = minutesSH31 % Sixty;
            secSH31 = hoursSH31 * ThreeThousandSix + minutesSH31 * Sixty + secondsSH31;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH31 * ThreeThousandSix + currentMinuteSH31 * Sixty + redThreshold31;
            // 计算小时和分钟
            futureHourSH31 = totalSeconds / ThreeThousandSix;
            futureMinuteSH31 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH31 >= TwentyFour) {
                futureHourSH31 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH31, currentMinuteSH31);
            String futureTimeString = String.format("%02d:%02d", futureHourSH31, futureMinuteSH31);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH31.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH31.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH31.setText(Html.fromHtml(displayText));
            }

            updateButtonColor31();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread32 = new Runnable() {
        public void run() {
            timeInMillisecondsSH32 = SystemClock.uptimeMillis() - startTimeSH32;
            updatedTimeSH32 = timeInMillisecondsSH32;
            secondsSH32 = (int) (updatedTimeSH32 / Thousand);
            minutesSH32 = secondsSH32 / Sixty;
            hoursSH32 = minutesSH32 / Sixty;
            secondsSH32 = secondsSH32 % Sixty;
            minutesSH32 = minutesSH32 % Sixty;
            secSH32 = hoursSH32 * ThreeThousandSix + minutesSH32 * Sixty + secondsSH32;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH32 * ThreeThousandSix + currentMinuteSH32 * Sixty + redThreshold32;
            // 计算小时和分钟
            futureHourSH32 = totalSeconds / ThreeThousandSix;
            futureMinuteSH32 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH32 >= TwentyFour) {
                futureHourSH32 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH32, currentMinuteSH32);
            String futureTimeString = String.format("%02d:%02d", futureHourSH32, futureMinuteSH32);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH32.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH32.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH32.setText(Html.fromHtml(displayText));
            }

            updateButtonColor32();
            handlerSH.postDelayed(this, delay);
        }
    };
    private Runnable updateTimerThread33 = new Runnable() {
        public void run() {
            timeInMillisecondsSH33 = SystemClock.uptimeMillis() - startTimeSH33;
            updatedTimeSH33 = timeInMillisecondsSH33;
            secondsSH33 = (int) (updatedTimeSH33 / Thousand);
            minutesSH33 = secondsSH33 / Sixty;
            hoursSH33 = minutesSH33 / Sixty;
            secondsSH33 = secondsSH33 % Sixty;
            minutesSH33 = minutesSH33 % Sixty;
            secSH33 = hoursSH33 * ThreeThousandSix + minutesSH33 * Sixty + secondsSH33;

            // 计算当前时间加上 redThreshold 后的时间（秒数）
            int totalSeconds = currentHourSH33 * ThreeThousandSix + currentMinuteSH33 * Sixty + redThreshold33;
            // 计算小时和分钟
            futureHourSH33 = totalSeconds / ThreeThousandSix;
            futureMinuteSH33 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH33 >= TwentyFour) {
                futureHourSH33 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourSH33, currentMinuteSH33);
            String futureTimeString = String.format("%02d:%02d", futureHourSH33, futureMinuteSH33);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimerSH33.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerSH33.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerSH33.setText(Html.fromHtml(displayText));
            }

            updateButtonColor33();
            handlerSH.postDelayed(this, delay);
        }
    };
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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer1.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer2.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer3.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer4.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer5.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer7.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            btnTimer66.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);

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
            if (options[position].equals("30分鐘") || options[position].equals("60分鐘_")) {
                textView.setTextSize(textSize); // 设置大字体大小
            } else {
                textView.setTextSize(textSize - 4); // 设置较小字体大小
            }

            return rowView;
        }
    }



    private void showTimeDialogForButton101() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime101(Time1);

                    if(secSH101 >= blueThreshold101){
                        flashingSH101 = true;
                        updateButtonColor101();
                    }
                    if(flashinggSH101){
                        flashinggSH101 = false;
                        updateButtonColor101();
                    }

                    break;
                case "60分鐘" :
                    addTime101(Time2);

                    if(secSH101 >= blueThreshold101){
                        flashingSH101 = true;
                        updateButtonColor101();
                    }
                    if(flashinggSH101){
                        flashinggSH101 = false;
                        updateButtonColor101();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime101(int secondsToAdd) {
        yellowThreshold101 += secondsToAdd;
        redThreshold101 += secondsToAdd;
        updateButtonColor101();
    }


    private void showTimeDialogForButton102() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("13號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime102(Time1);

                    if(secSH102 >= blueThreshold102){
                        flashingSH102 = true;
                        updateButtonColor102();
                    }
                    if(flashinggSH102){
                        flashinggSH102 = false;
                        updateButtonColor102();
                    }

                    break;
                case "60分鐘" :
                    addTime102(Time2);

                    if(secSH102 >= blueThreshold102){
                        flashingSH102 = true;
                        updateButtonColor102();
                    }
                    if(flashinggSH102){
                        flashinggSH102 = false;
                        updateButtonColor102();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime102(int secondsToAdd) {
        yellowThreshold102 += secondsToAdd;
        redThreshold102 += secondsToAdd;
        updateButtonColor102();
    }

    private void showTimeDialogForButton103() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("14號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime103(Time1);

                    if(secSH103 >= blueThreshold103){
                        flashingSH103 = true;
                        updateButtonColor103();
                    }
                    if(flashinggSH103){
                        flashinggSH103 = false;
                        updateButtonColor103();
                    }

                    break;
                case "60分鐘" :
                    addTime103(Time2);

                    if(secSH103 >= blueThreshold103){
                        flashingSH103 = true;
                        updateButtonColor103();
                    }
                    if(flashinggSH103){
                        flashinggSH103 = false;
                        updateButtonColor103();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime103(int secondsToAdd) {
        yellowThreshold103 += secondsToAdd;
        redThreshold103 += secondsToAdd;
        updateButtonColor103();
    }

    private void showTimeDialogForButton104() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("15號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime104(Time1);

                    if(secSH104 >= blueThreshold104){
                        flashingSH104 = true;
                        updateButtonColor104();
                    }
                    if(flashinggSH104){
                        flashinggSH104 = false;
                        updateButtonColor104();
                    }

                    break;
                case "60分鐘" :
                    addTime104(Time2);

                    if(secSH104 >= blueThreshold104){
                        flashingSH104 = true;
                        updateButtonColor104();
                    }
                    if(flashinggSH104){
                        flashinggSH104 = false;
                        updateButtonColor104();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime104(int secondsToAdd) {
        yellowThreshold104 += secondsToAdd;
        redThreshold104 += secondsToAdd;
        updateButtonColor104();
    }


    private void showTimeDialogForButton105() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("17號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime105(Time1);

                    if(secSH105 >= blueThreshold105){
                        flashingSH105 = true;
                        updateButtonColor105();
                    }
                    if(flashinggSH105){
                        flashinggSH105 = false;
                        updateButtonColor105();
                    }

                    break;
                case "60分鐘" :
                    addTime105(Time2);

                    if(secSH105 >= blueThreshold105){
                        flashingSH105 = true;
                        updateButtonColor105();
                    }
                    if(flashinggSH105){
                        flashinggSH105 = false;
                        updateButtonColor105();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime105(int secondsToAdd) {
        yellowThreshold105 += secondsToAdd;
        redThreshold105 += secondsToAdd;
        updateButtonColor105();
    }


    private void showTimeDialogForButton106() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("18號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime106(Time1);

                    if(secSH106 >= blueThreshold106){
                        flashingSH106 = true;
                        updateButtonColor106();
                    }
                    if(flashinggSH106){
                        flashinggSH106 = false;
                        updateButtonColor106();
                    }

                    break;
                case "60分鐘" :
                    addTime106(Time2);

                    if(secSH106 >= blueThreshold106){
                        flashingSH106 = true;
                        updateButtonColor106();
                    }
                    if(flashinggSH106){
                        flashinggSH106 = false;
                        updateButtonColor106();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime106(int secondsToAdd) {
        yellowThreshold106 += secondsToAdd;
        redThreshold106 += secondsToAdd;
        updateButtonColor106();
    }


    private void showTimeDialogForButton107() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("19號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime107(Time1);

                    if(secSH107 >= blueThreshold107){
                        flashingSH107 = true;
                        updateButtonColor107();
                    }
                    if(flashinggSH107){
                        flashinggSH107 = false;
                        updateButtonColor107();
                    }

                    break;
                case "60分鐘" :
                    addTime107(Time2);

                    if(secSH107 >= blueThreshold107){
                        flashingSH107 = true;
                        updateButtonColor107();
                    }
                    if(flashinggSH107){
                        flashinggSH107 = false;
                        updateButtonColor107();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime107(int secondsToAdd) {
        yellowThreshold107 += secondsToAdd;
        redThreshold107 += secondsToAdd;
        updateButtonColor107();
    }


    private void showTimeDialogForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("20號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime8(Time1);

                    if(secSH8 >= blueThreshold8){
                        flashingSH8 = true;
                        updateButtonColor8();
                    }
                    if(flashinggSH8){
                        flashinggSH8 = false;
                        updateButtonColor8();
                    }

                    break;
                case "60分鐘" :
                    addTime8(Time2);

                    if(secSH8 >= blueThreshold8){
                        flashingSH8 = true;
                        updateButtonColor8();
                    }
                    if(flashinggSH8){
                        flashinggSH8 = false;
                        updateButtonColor8();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime8(int secondsToAdd) {
        yellowThreshold8 += secondsToAdd;
        redThreshold8 += secondsToAdd;
        updateButtonColor8();
    }


    private void showTimeDialogForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("21號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime9(Time1);

                    if(secSH9 >= blueThreshold9){
                        flashingSH9 = true;
                        updateButtonColor9();
                    }
                    if(flashinggSH9){
                        flashinggSH9 = false;
                        updateButtonColor9();
                    }

                    break;
                case "60分鐘" :
                    addTime9(Time2);

                    if(secSH9 >= blueThreshold9){
                        flashingSH9 = true;
                        updateButtonColor9();
                    }
                    if(flashinggSH9){
                        flashinggSH9 = false;
                        updateButtonColor9();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime9(int secondsToAdd) {
        yellowThreshold9 += secondsToAdd;
        redThreshold9 += secondsToAdd;
        updateButtonColor9();
    }


    private void showTimeDialogForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("33號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime10(Time1);

                    if(secSH10 >= blueThreshold10){
                        flashingSH10 = true;
                        updateButtonColor10();
                    }
                    if(flashinggSH10){
                        flashinggSH10 = false;
                        updateButtonColor10();
                    }

                    break;
                case "60分鐘" :
                    addTime10(Time2);

                    if(secSH10 >= blueThreshold10){
                        flashingSH10 = true;
                        updateButtonColor10();
                    }
                    if(flashinggSH10){
                        flashinggSH10 = false;
                        updateButtonColor10();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime10(int secondsToAdd) {
        yellowThreshold10 += secondsToAdd;
        redThreshold10 += secondsToAdd;
        updateButtonColor10();
    }


    private void showTimeDialogForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("35號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime11(Time1);

                    if(secSH11 >= blueThreshold11){
                        flashingSH11 = true;
                        updateButtonColor11();
                    }
                    if(flashinggSH11){
                        flashinggSH11 = false;
                        updateButtonColor11();
                    }

                    break;
                case "60分鐘" :
                    addTime11(Time2);

                    if(secSH11 >= blueThreshold11){
                        flashingSH11 = true;
                        updateButtonColor11();
                    }
                    if(flashinggSH11){
                        flashinggSH11 = false;
                        updateButtonColor11();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime11(int secondsToAdd) {
        yellowThreshold11 += secondsToAdd;
        redThreshold11 += secondsToAdd;
        updateButtonColor11();
    }


    private void showTimeDialogForButton12() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("36號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime12(Time1);

                    if(secSH12 >= blueThreshold12){
                        flashingSH12 = true;
                        updateButtonColor12();
                    }
                    if(flashinggSH12){
                        flashinggSH12 = false;
                        updateButtonColor12();
                    }

                    break;
                case "60分鐘" :
                    addTime12(Time2);

                    if(secSH12 >= blueThreshold12){
                        flashingSH12 = true;
                        updateButtonColor12();
                    }
                    if(flashinggSH12){
                        flashinggSH12 = false;
                        updateButtonColor12();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime12(int secondsToAdd) {
        yellowThreshold12 += secondsToAdd;
        redThreshold12 += secondsToAdd;
        updateButtonColor12();
    }


    private void showTimeDialogForButton13() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("37號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime13(Time1);

                    if(secSH13 >= blueThreshold13){
                        flashingSH13 = true;
                        updateButtonColor13();
                    }
                    if(flashinggSH13){
                        flashinggSH13 = false;
                        updateButtonColor13();
                    }

                    break;
                case "60分鐘" :
                    addTime13(Time2);

                    if(secSH13 >= blueThreshold13){
                        flashingSH13 = true;
                        updateButtonColor13();
                    }
                    if(flashinggSH13){
                        flashinggSH13 = false;
                        updateButtonColor13();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime13(int secondsToAdd) {
        yellowThreshold13 += secondsToAdd;
        redThreshold13 += secondsToAdd;
        updateButtonColor13();
    }


    private void showTimeDialogForButton14() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("38加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime14(Time1);

                    if(secSH14 >= blueThreshold14){
                        flashingSH14 = true;
                        updateButtonColor14();
                    }
                    if(flashinggSH14){
                        flashinggSH14 = false;
                        updateButtonColor14();
                    }

                    break;
                case "60分鐘" :
                    addTime14(Time2);

                    if(secSH14 >= blueThreshold14){
                        flashingSH14 = true;
                        updateButtonColor14();
                    }
                    if(flashinggSH14){
                        flashinggSH14 = false;
                        updateButtonColor14();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime14(int secondsToAdd) {
        yellowThreshold14 += secondsToAdd;
        redThreshold14 += secondsToAdd;
        updateButtonColor14();
    }


    private void showTimeDialogForButton15() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("40號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime15(Time1);

                    if(secSH15 >= blueThreshold15){
                        flashingSH15 = true;
                        updateButtonColor15();
                    }
                    if(flashinggSH15){
                        flashinggSH15 = false;
                        updateButtonColor15();
                    }

                    break;
                case "60分鐘" :
                    addTime15(Time2);

                    if(secSH15 >= blueThreshold15){
                        flashingSH15 = true;
                        updateButtonColor15();
                    }
                    if(flashinggSH15){
                        flashinggSH15 = false;
                        updateButtonColor15();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime15(int secondsToAdd) {
        yellowThreshold15 += secondsToAdd;
        redThreshold15 += secondsToAdd;
        updateButtonColor15();
    }


    private void showTimeDialogForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("42號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime16(Time1);

                    if(secSH16 >= blueThreshold16){
                        flashingSH16 = true;
                        updateButtonColor16();
                    }
                    if(flashinggSH16){
                        flashinggSH16 = false;
                        updateButtonColor16();
                    }

                    break;
                case "60分鐘" :
                    addTime16(Time2);

                    if(secSH16 >= blueThreshold16){
                        flashingSH16 = true;
                        updateButtonColor16();
                    }
                    if(flashinggSH16){
                        flashinggSH16 = false;
                        updateButtonColor16();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime16(int secondsToAdd) {
        yellowThreshold16 += secondsToAdd;
        redThreshold16 += secondsToAdd;
        updateButtonColor16();
    }


    private void showTimeDialogForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("43號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime17(Time1);

                    if(secSH17 >= blueThreshold17){
                        flashingSH17 = true;
                        updateButtonColor17();
                    }
                    if(flashinggSH17){
                        flashinggSH17 = false;
                        updateButtonColor17();
                    }

                    break;
                case "60分鐘" :
                    addTime17(Time2);

                    if(secSH17 >= blueThreshold17){
                        flashingSH17 = true;
                        updateButtonColor17();
                    }
                    if(flashinggSH17){
                        flashinggSH17 = false;
                        updateButtonColor17();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime17(int secondsToAdd) {
        yellowThreshold17 += secondsToAdd;
        redThreshold17 += secondsToAdd;
        updateButtonColor17();
    }


    private void showTimeDialogForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("1號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime18(Time1);

                    if(secSH18 >= blueThreshold18){
                        flashingSH18 = true;
                        updateButtonColor18();
                    }
                    if(flashinggSH18){
                        flashinggSH18 = false;
                        updateButtonColor18();
                    }

                    break;
                case "60分鐘" :
                    addTime18(Time2);

                    if(secSH18 >= blueThreshold18){
                        flashingSH18 = true;
                        updateButtonColor18();
                    }
                    if(flashinggSH18){
                        flashinggSH18 = false;
                        updateButtonColor18();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime18(int secondsToAdd) {
        yellowThreshold18 += secondsToAdd;
        redThreshold18 += secondsToAdd;
        updateButtonColor18();
    }


    private void showTimeDialogForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("8號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime19(Time1);

                    if(secSH19 >= blueThreshold19){
                        flashingSH19 = true;
                        updateButtonColor19();
                    }
                    if(flashinggSH19){
                        flashinggSH19 = false;
                        updateButtonColor19();
                    }

                    break;
                case "60分鐘" :
                    addTime19(Time2);

                    if(secSH19 >= blueThreshold19){
                        flashingSH19 = true;
                        updateButtonColor19();
                    }
                    if(flashinggSH19){
                        flashinggSH19 = false;
                        updateButtonColor19();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime19(int secondsToAdd) {
        yellowThreshold19 += secondsToAdd;
        redThreshold19 += secondsToAdd;
        updateButtonColor19();
    }


    private void showTimeDialogForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("9號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime20(Time1);

                    if(secSH20 >= blueThreshold20){
                        flashingSH20 = true;
                        updateButtonColor20();
                    }
                    if(flashinggSH20){
                        flashinggSH20 = false;
                        updateButtonColor20();
                    }

                    break;
                case "60分鐘" :
                    addTime20(Time2);

                    if(secSH20 >= blueThreshold20){
                        flashingSH20 = true;
                        updateButtonColor20();
                    }
                    if(flashinggSH20){
                        flashinggSH20 = false;
                        updateButtonColor20();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime20(int secondsToAdd) {
        yellowThreshold20 += secondsToAdd;
        redThreshold20 += secondsToAdd;
        updateButtonColor20();
    }


    private void showTimeDialogForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("10號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime21(Time1);

                    if(secSH21 >= blueThreshold21){
                        flashingSH21 = true;
                        updateButtonColor21();
                    }
                    if(flashinggSH21){
                        flashinggSH21 = false;
                        updateButtonColor21();
                    }

                    break;
                case "60分鐘" :
                    addTime21(Time2);

                    if(secSH21 >= blueThreshold21){
                        flashingSH21 = true;
                        updateButtonColor21();
                    }
                    if(flashinggSH21){
                        flashinggSH21 = false;
                        updateButtonColor21();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime21(int secondsToAdd) {
        yellowThreshold21 += secondsToAdd;
        redThreshold21 += secondsToAdd;
        updateButtonColor21();
    }


    private void showTimeDialogForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("11號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime22(Time1);

                    if(secSH22 >= blueThreshold22){
                        flashingSH22 = true;
                        updateButtonColor22();
                    }
                    if(flashinggSH22){
                        flashinggSH22 = false;
                        updateButtonColor22();
                    }

                    break;
                case "60分鐘" :
                    addTime22(Time2);

                    if(secSH22 >= blueThreshold22){
                        flashingSH22 = true;
                        updateButtonColor22();
                    }
                    if(flashinggSH22){
                        flashinggSH22 = false;
                        updateButtonColor22();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime22(int secondsToAdd) {
        yellowThreshold22 += secondsToAdd;
        redThreshold22 += secondsToAdd;
        updateButtonColor22();
    }


    private void showTimeDialogForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("16號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime23(Time1);

                    if(secSH23 >= blueThreshold23){
                        flashingSH23 = true;
                        updateButtonColor23();
                    }
                    if(flashinggSH23){
                        flashinggSH23 = false;
                        updateButtonColor23();
                    }

                    break;
                case "60分鐘" :
                    addTime23(Time2);

                    if(secSH23 >= blueThreshold23){
                        flashingSH23 = true;
                        updateButtonColor23();
                    }
                    if(flashinggSH23){
                        flashinggSH23 = false;
                        updateButtonColor23();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime23(int secondsToAdd) {
        yellowThreshold23 += secondsToAdd;
        redThreshold23 += secondsToAdd;
        updateButtonColor23();
    }


    private void showTimeDialogForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("39號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime24(Time1);

                    if(secSH24 >= blueThreshold24){
                        flashingSH24 = true;
                        updateButtonColor24();
                    }
                    if(flashinggSH24){
                        flashinggSH24 = false;
                        updateButtonColor24();
                    }

                    break;
                case "60分鐘" :
                    addTime24(Time2);

                    if(secSH24 >= blueThreshold24){
                        flashingSH24 = true;
                        updateButtonColor24();
                    }
                    if(flashinggSH24){
                        flashinggSH24 = false;
                        updateButtonColor24();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime24(int secondsToAdd) {
        yellowThreshold24 += secondsToAdd;
        redThreshold24 += secondsToAdd;
        updateButtonColor24();
    }


    private void showTimeDialogForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("3號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime25(Time1);

                    if(secSH25 >= blueThreshold25){
                        flashingSH25 = true;
                        updateButtonColor25();
                    }
                    if(flashinggSH25){
                        flashinggSH25 = false;
                        updateButtonColor25();
                    }

                    break;
                case "60分鐘" :
                    addTime25(Time2);

                    if(secSH25 >= blueThreshold25){
                        flashingSH25 = true;
                        updateButtonColor25();
                    }
                    if(flashinggSH25){
                        flashinggSH25 = false;
                        updateButtonColor25();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime25(int secondsToAdd) {
        yellowThreshold25 += secondsToAdd;
        redThreshold25 += secondsToAdd;
        updateButtonColor25();
    }


    private void showTimeDialogForButton26() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("12號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime26(Time1);

                    if(secSH26 >= blueThreshold26){
                        flashingSH26 = true;
                        updateButtonColor26();
                    }
                    if(flashinggSH26){
                        flashinggSH26 = false;
                        updateButtonColor26();
                    }

                    break;
                case "60分鐘" :
                    addTime26(Time2);

                    if(secSH26 >= blueThreshold26){
                        flashingSH26 = true;
                        updateButtonColor26();
                    }
                    if(flashinggSH26){
                        flashinggSH26 = false;
                        updateButtonColor26();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime26(int secondsToAdd) {
        yellowThreshold26 += secondsToAdd;
        redThreshold26 += secondsToAdd;
        updateButtonColor26();
    }


    private void showTimeDialogForButton27() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("28號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime27(Time1);

                    if(secSH27 >= blueThreshold27){
                        flashingSH27 = true;
                        updateButtonColor27();
                    }
                    if(flashinggSH27){
                        flashinggSH27 = false;
                        updateButtonColor27();
                    }

                    break;
                case "60分鐘" :
                    addTime27(Time2);

                    if(secSH27 >= blueThreshold27){
                        flashingSH27 = true;
                        updateButtonColor27();
                    }
                    if(flashinggSH27){
                        flashinggSH27 = false;
                        updateButtonColor27();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime27(int secondsToAdd) {
        yellowThreshold27 += secondsToAdd;
        redThreshold27 += secondsToAdd;
        updateButtonColor27();
    }


    private void showTimeDialogForButton28() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("29號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime28(Time1);

                    if(secSH28 >= blueThreshold28){
                        flashingSH28 = true;
                        updateButtonColor28();
                    }
                    if(flashinggSH28){
                        flashinggSH28 = false;
                        updateButtonColor28();
                    }

                    break;
                case "60分鐘" :
                    addTime28(Time2);

                    if(secSH28 >= blueThreshold28){
                        flashingSH28 = true;
                        updateButtonColor28();
                    }
                    if(flashinggSH28){
                        flashinggSH28 = false;
                        updateButtonColor28();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime28(int secondsToAdd) {
        yellowThreshold28 += secondsToAdd;
        redThreshold28 += secondsToAdd;
        updateButtonColor28();
    }


    private void showTimeDialogForButton29() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("41號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime29(Time1);

                    if(secSH29 >= blueThreshold29){
                        flashingSH29 = true;
                        updateButtonColor29();
                    }
                    if(flashinggSH29){
                        flashinggSH29 = false;
                        updateButtonColor29();
                    }

                    break;
                case "60分鐘" :
                    addTime29(Time2);

                    if(secSH29 >= blueThreshold29){
                        flashingSH29 = true;
                        updateButtonColor29();
                    }
                    if(flashinggSH29){
                        flashinggSH29 = false;
                        updateButtonColor29();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime29(int secondsToAdd) {
        yellowThreshold29 += secondsToAdd;
        redThreshold29 += secondsToAdd;
        updateButtonColor29();
    }


    private void showTimeDialogForButton30() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("45號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime30(Time1);

                    if(secSH30 >= blueThreshold30){
                        flashingSH30 = true;
                        updateButtonColor30();
                    }
                    if(flashinggSH30){
                        flashinggSH30 = false;
                        updateButtonColor30();
                    }

                    break;
                case "60分鐘" :
                    addTime30(Time2);

                    if(secSH30 >= blueThreshold30){
                        flashingSH30 = true;
                        updateButtonColor30();
                    }
                    if(flashinggSH30){
                        flashinggSH30 = false;
                        updateButtonColor30();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime30(int secondsToAdd) {
        yellowThreshold30 += secondsToAdd;
        redThreshold30 += secondsToAdd;
        updateButtonColor30();
    }


    private void showTimeDialogForButton31() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("46號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime31(Time1);

                    if(secSH31 >= blueThreshold31){
                        flashingSH31 = true;
                        updateButtonColor31();
                    }
                    if(flashinggSH31){
                        flashinggSH31 = false;
                        updateButtonColor31();
                    }

                    break;
                case "60分鐘" :
                    addTime31(Time2);

                    if(secSH31 >= blueThreshold31){
                        flashingSH31 = true;
                        updateButtonColor31();
                    }
                    if(flashinggSH31){
                        flashinggSH31 = false;
                        updateButtonColor31();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime31(int secondsToAdd) {
        yellowThreshold31 += secondsToAdd;
        redThreshold31 += secondsToAdd;
        updateButtonColor31();
    }


    private void showTimeDialogForButton32() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("47號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime32(Time1);

                    if(secSH32 >= blueThreshold32){
                        flashingSH32 = true;
                        updateButtonColor32();
                    }
                    if(flashinggSH32){
                        flashinggSH32 = false;
                        updateButtonColor32();
                    }

                    break;
                case "60分鐘" :
                    addTime32(Time2);

                    if(secSH32 >= blueThreshold32){
                        flashingSH32 = true;
                        updateButtonColor32();
                    }
                    if(flashinggSH32){
                        flashinggSH32 = false;
                        updateButtonColor32();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime32(int secondsToAdd) {
        yellowThreshold32 += secondsToAdd;
        redThreshold32 += secondsToAdd;
        updateButtonColor32();
    }


    private void showTimeDialogForButton33() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("48號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime33(Time1);

                    if(secSH33 >= blueThreshold33){
                        flashingSH33 = true;
                        updateButtonColor33();
                    }
                    if(flashinggSH33){
                        flashinggSH33 = false;
                        updateButtonColor33();
                    }

                    break;
                case "60分鐘" :
                    addTime33(Time2);

                    if(secSH33 >= blueThreshold33){
                        flashingSH33 = true;
                        updateButtonColor33();
                    }
                    if(flashinggSH33){
                        flashinggSH33 = false;
                        updateButtonColor33();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime33(int secondsToAdd) {
        yellowThreshold33 += secondsToAdd;
        redThreshold33 += secondsToAdd;
        updateButtonColor33();
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
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

        dialogTitle.setText("207號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

        dialogTitle.setText("203號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

        dialogTitle.setText("206號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

        dialogTitle.setText("201號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

        dialogTitle.setText("208號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

        dialogTitle.setText("202號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SP.CustomArrayAdapter adapter = new SP.CustomArrayAdapter(this, options, textSize);
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

    final private double check = 0.01;
    private void updateButtonColor101() {
        if (secSH101 < check) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH101 < blueThreshold101 && peopleSH_101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH101 < blueThreshold101 && !peopleSH_101 ) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH101 < yellowThreshold101 && peopleSH_101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH101 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH101.startAnimation(blinkAnimation);
            }else{
                btnTimerSH101.clearAnimation();
            }
        } else if (secSH101 < yellowThreshold101 && !peopleSH_101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH101 < redThreshold101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH101 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH101.startAnimation(blinkAnimation);
            }else{
                btnTimerSH101.clearAnimation();
            }
        } else {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH101.clearAnimation();
        }
    }


    private void updateButtonColor102() {
        if (secSH102 < check) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH102 < blueThreshold102 && peopleSH_102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH102 < blueThreshold102 && !peopleSH_102 ) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH102 < yellowThreshold102 && peopleSH_102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH102 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH102.startAnimation(blinkAnimation);
            }else{
                btnTimerSH102.clearAnimation();
            }
        } else if (secSH102 < yellowThreshold102 && !peopleSH_102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH102 < redThreshold102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH102 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH102.startAnimation(blinkAnimation);
            }else{
                btnTimerSH102.clearAnimation();
            }
        } else {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH102.clearAnimation();
        }
    }


    private void updateButtonColor103() {
        if (secSH103 < check) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH103 < blueThreshold103 && peopleSH_103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH103 < blueThreshold103 && !peopleSH_103 ) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH103 < yellowThreshold103 && peopleSH_103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH103 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH103.startAnimation(blinkAnimation);
            }else{
                btnTimerSH103.clearAnimation();
            }
        } else if (secSH103 < yellowThreshold103 && !peopleSH_103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH103 < redThreshold103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH103 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH103.startAnimation(blinkAnimation);
            }else{
                btnTimerSH103.clearAnimation();
            }
        } else {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH103.clearAnimation();
        }
    }


    private void updateButtonColor104() {
        if (secSH104 < check) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH104 < blueThreshold104 && peopleSH_104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH104 < blueThreshold104 && !peopleSH_104 ) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH104 < yellowThreshold104 && peopleSH_104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH104 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH104.startAnimation(blinkAnimation);
            }else{
                btnTimerSH104.clearAnimation();
            }
        } else if (secSH104 < yellowThreshold104 && !peopleSH_104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH104 < redThreshold104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH104 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH104.startAnimation(blinkAnimation);
            }else{
                btnTimerSH104.clearAnimation();
            }
        } else {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH104.clearAnimation();
        }
    }


    private void updateButtonColor105() {
        if (secSH105 < check) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH105 < blueThreshold105 && peopleSH_105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH105 < blueThreshold105 && !peopleSH_105 ) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH105 < yellowThreshold105 && peopleSH_105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH105 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH105.startAnimation(blinkAnimation);
            }else{
                btnTimerSH105.clearAnimation();
            }
        } else if (secSH105 < yellowThreshold105 && !peopleSH_105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH105 < redThreshold105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH105 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH105.startAnimation(blinkAnimation);
            }else{
                btnTimerSH105.clearAnimation();
            }
        } else {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH105.clearAnimation();
        }
    }


    private void updateButtonColor106() {
        if (secSH106 < check) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH106 < blueThreshold106 && peopleSH_106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH106 < blueThreshold106 && !peopleSH_106 ) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH106 < yellowThreshold106 && peopleSH_106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH106 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH106.startAnimation(blinkAnimation);
            }else{
                btnTimerSH106.clearAnimation();
            }
        } else if (secSH106 < yellowThreshold106 && !peopleSH_106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH106 < redThreshold106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH106 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH106.startAnimation(blinkAnimation);
            }else{
                btnTimerSH106.clearAnimation();
            }
        } else {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH106.clearAnimation();
        }
    }


    private void updateButtonColor107() {
        if (secSH107 < check) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH107 < blueThreshold107 && peopleSH_107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH107 < blueThreshold107 && !peopleSH_107 ) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH107 < yellowThreshold107 && peopleSH_107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH107 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH107.startAnimation(blinkAnimation);
            }else{
                btnTimerSH107.clearAnimation();
            }
        } else if (secSH107 < yellowThreshold107 && !peopleSH_107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH107 < redThreshold107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH107 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH107.startAnimation(blinkAnimation);
            }else{
                btnTimerSH107.clearAnimation();
            }
        } else {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH107.clearAnimation();
        }
    }


    private void updateButtonColor8() {
        if (secSH8 < check) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH8 < blueThreshold8 && peopleSH_8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH8 < blueThreshold8 && !peopleSH_8 ) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH8 < yellowThreshold8 && peopleSH_8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH8.startAnimation(blinkAnimation);
            }else{
                btnTimerSH8.clearAnimation();
            }
        } else if (secSH8 < yellowThreshold8 && !peopleSH_8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH8 < redThreshold8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH8.startAnimation(blinkAnimation);
            }else{
                btnTimerSH8.clearAnimation();
            }
        } else {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH8.clearAnimation();
        }
    }


    private void updateButtonColor9() {
        if (secSH9 < check) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH9 < blueThreshold9 && peopleSH_9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH9 < blueThreshold9 && !peopleSH_9 ) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH9 < yellowThreshold9 && peopleSH_9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH9.startAnimation(blinkAnimation);
            }else{
                btnTimerSH9.clearAnimation();
            }
        } else if (secSH9 < yellowThreshold9 && !peopleSH_9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH9 < redThreshold9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH9.startAnimation(blinkAnimation);
            }else{
                btnTimerSH9.clearAnimation();
            }
        } else {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH9.clearAnimation();
        }
    }


    private void updateButtonColor10() {
        if (secSH10 < check) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH10 < blueThreshold10 && peopleSH_10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH10 < blueThreshold10 && !peopleSH_10 ) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH10 < yellowThreshold10 && peopleSH_10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH10.startAnimation(blinkAnimation);
            }else{
                btnTimerSH10.clearAnimation();
            }
        } else if (secSH10 < yellowThreshold10 && !peopleSH_10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH10 < redThreshold10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH10.startAnimation(blinkAnimation);
            }else{
                btnTimerSH10.clearAnimation();
            }
        } else {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH10.clearAnimation();
        }
    }


    private void updateButtonColor11() {
        if (secSH11 < check) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH11 < blueThreshold11 && peopleSH_11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH11 < blueThreshold11 && !peopleSH_11 ) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH11 < yellowThreshold11 && peopleSH_11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH11.startAnimation(blinkAnimation);
            }else{
                btnTimerSH11.clearAnimation();
            }
        } else if (secSH11 < yellowThreshold11 && !peopleSH_11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH11 < redThreshold11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH11.startAnimation(blinkAnimation);
            }else{
                btnTimerSH11.clearAnimation();
            }
        } else {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH11.clearAnimation();
        }
    }


    private void updateButtonColor12() {
        if (secSH12 < check) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH12 < blueThreshold12 && peopleSH_12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH12 < blueThreshold12 && !peopleSH_12 ) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH12 < yellowThreshold12 && peopleSH_12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH12 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH12.startAnimation(blinkAnimation);
            }else{
                btnTimerSH12.clearAnimation();
            }
        } else if (secSH12 < yellowThreshold12 && !peopleSH_12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH12 < redThreshold12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH12 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH12.startAnimation(blinkAnimation);
            }else{
                btnTimerSH12.clearAnimation();
            }
        } else {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH12.clearAnimation();
        }
    }


    private void updateButtonColor13() {
        if (secSH13 < check) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH13 < blueThreshold13 && peopleSH_13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH13 < blueThreshold13 && !peopleSH_13 ) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH13 < yellowThreshold13 && peopleSH_13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH13 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH13.startAnimation(blinkAnimation);
            }else{
                btnTimerSH13.clearAnimation();
            }
        } else if (secSH13 < yellowThreshold13 && !peopleSH_13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH13 < redThreshold13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH13 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH13.startAnimation(blinkAnimation);
            }else{
                btnTimerSH13.clearAnimation();
            }
        } else {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH13.clearAnimation();
        }
    }


    private void updateButtonColor14() {
        if (secSH14 < check) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH14 < blueThreshold14 && peopleSH_14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH14 < blueThreshold14 && !peopleSH_14 ) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH14 < yellowThreshold14 && peopleSH_14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH14 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH14.startAnimation(blinkAnimation);
            }else{
                btnTimerSH14.clearAnimation();
            }
        } else if (secSH14 < yellowThreshold14 && !peopleSH_14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH14 < redThreshold14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH14 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH14.startAnimation(blinkAnimation);
            }else{
                btnTimerSH14.clearAnimation();
            }
        } else {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH14.clearAnimation();
        }
    }


    private void updateButtonColor15() {
        if (secSH15 < check) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH15 < blueThreshold15 && peopleSH_15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH15 < blueThreshold15 && !peopleSH_15 ) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH15 < yellowThreshold15 && peopleSH_15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH15 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH15.startAnimation(blinkAnimation);
            }else{
                btnTimerSH15.clearAnimation();
            }
        } else if (secSH15 < yellowThreshold15 && !peopleSH_15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH15 < redThreshold15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH15 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH15.startAnimation(blinkAnimation);
            }else{
                btnTimerSH15.clearAnimation();
            }
        } else {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH15.clearAnimation();
        }
    }


    private void updateButtonColor16() {
        if (secSH16 < check) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH16 < blueThreshold16 && peopleSH_16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH16 < blueThreshold16 && !peopleSH_16 ) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH16 < yellowThreshold16 && peopleSH_16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH16.startAnimation(blinkAnimation);
            }else{
                btnTimerSH16.clearAnimation();
            }
        } else if (secSH16 < yellowThreshold16 && !peopleSH_16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH16 < redThreshold16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH16.startAnimation(blinkAnimation);
            }else{
                btnTimerSH16.clearAnimation();
            }
        } else {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH16.clearAnimation();
        }
    }


    private void updateButtonColor17() {
        if (secSH17 < check) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH17 < blueThreshold17 && peopleSH_17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH17 < blueThreshold17 && !peopleSH_17 ) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH17 < yellowThreshold17 && peopleSH_17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH17.startAnimation(blinkAnimation);
            }else{
                btnTimerSH17.clearAnimation();
            }
        } else if (secSH17 < yellowThreshold17 && !peopleSH_17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH17 < redThreshold17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH17.startAnimation(blinkAnimation);
            }else{
                btnTimerSH17.clearAnimation();
            }
        } else {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH17.clearAnimation();
        }
    }


    private void updateButtonColor18() {
        if (secSH18 < check) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH18 < blueThreshold18 && peopleSH_18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH18 < blueThreshold18 && !peopleSH_18 ) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH18 < yellowThreshold18 && peopleSH_18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH18.startAnimation(blinkAnimation);
            }else{
                btnTimerSH18.clearAnimation();
            }
        } else if (secSH18 < yellowThreshold18 && !peopleSH_18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH18 < redThreshold18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH18.startAnimation(blinkAnimation);
            }else{
                btnTimerSH18.clearAnimation();
            }
        } else {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH18.clearAnimation();
        }
    }


    private void updateButtonColor19() {
        if (secSH19 < check) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH19 < blueThreshold19 && peopleSH_19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH19 < blueThreshold19 && !peopleSH_19 ) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH19 < yellowThreshold19 && peopleSH_19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH19.startAnimation(blinkAnimation);
            }else{
                btnTimerSH19.clearAnimation();
            }
        } else if (secSH19 < yellowThreshold19 && !peopleSH_19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH19 < redThreshold19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH19.startAnimation(blinkAnimation);
            }else{
                btnTimerSH19.clearAnimation();
            }
        } else {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH19.clearAnimation();
        }
    }


    private void updateButtonColor20() {
        if (secSH20 < check) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH20 < blueThreshold20 && peopleSH_20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH20 < blueThreshold20 && !peopleSH_20 ) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH20 < yellowThreshold20 && peopleSH_20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH20.startAnimation(blinkAnimation);
            }else{
                btnTimerSH20.clearAnimation();
            }
        } else if (secSH20 < yellowThreshold20 && !peopleSH_20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH20 < redThreshold20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH20.startAnimation(blinkAnimation);
            }else{
                btnTimerSH20.clearAnimation();
            }
        } else {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH20.clearAnimation();
        }
    }


    private void updateButtonColor21() {
        if (secSH21 < check) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH21 < blueThreshold21 && peopleSH_21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH21 < blueThreshold21 && !peopleSH_21 ) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH21 < yellowThreshold21 && peopleSH_21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH21.startAnimation(blinkAnimation);
            }else{
                btnTimerSH21.clearAnimation();
            }
        } else if (secSH21 < yellowThreshold21 && !peopleSH_21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH21 < redThreshold21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH21.startAnimation(blinkAnimation);
            }else{
                btnTimerSH21.clearAnimation();
            }
        } else {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH21.clearAnimation();
        }
    }


    private void updateButtonColor22() {
        if (secSH22 < check) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH22 < blueThreshold22 && peopleSH_22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH22 < blueThreshold22 && !peopleSH_22 ) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH22 < yellowThreshold22 && peopleSH_22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH22.startAnimation(blinkAnimation);
            }else{
                btnTimerSH22.clearAnimation();
            }
        } else if (secSH22 < yellowThreshold22 && !peopleSH_22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH22 < redThreshold22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH22.startAnimation(blinkAnimation);
            }else{
                btnTimerSH22.clearAnimation();
            }
        } else {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH22.clearAnimation();
        }
    }


    private void updateButtonColor23() {
        if (secSH23 < check) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH23 < blueThreshold23 && peopleSH_23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH23 < blueThreshold23 && !peopleSH_23 ) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH23 < yellowThreshold23 && peopleSH_23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH23.startAnimation(blinkAnimation);
            }else{
                btnTimerSH23.clearAnimation();
            }
        } else if (secSH23 < yellowThreshold23 && !peopleSH_23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH23 < redThreshold23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH23.startAnimation(blinkAnimation);
            }else{
                btnTimerSH23.clearAnimation();
            }
        } else {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH23.clearAnimation();
        }
    }


    private void updateButtonColor24() {
        if (secSH24 < check) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH24 < blueThreshold24 && peopleSH_24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH24 < blueThreshold24 && !peopleSH_24 ) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH24 < yellowThreshold24 && peopleSH_24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH24.startAnimation(blinkAnimation);
            }else{
                btnTimerSH24.clearAnimation();
            }
        } else if (secSH24 < yellowThreshold24 && !peopleSH_24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH24 < redThreshold24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH24.startAnimation(blinkAnimation);
            }else{
                btnTimerSH24.clearAnimation();
            }
        } else {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH24.clearAnimation();
        }
    }


    private void updateButtonColor25() {
        if (secSH25 < check) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH25 < blueThreshold25 && peopleSH_25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH25 < blueThreshold25 && !peopleSH_25 ) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH25 < yellowThreshold25 && peopleSH_25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH25.startAnimation(blinkAnimation);
            }else{
                btnTimerSH25.clearAnimation();
            }
        } else if (secSH25 < yellowThreshold25 && !peopleSH_25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH25 < redThreshold25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH25.startAnimation(blinkAnimation);
            }else{
                btnTimerSH25.clearAnimation();
            }
        } else {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH25.clearAnimation();
        }
    }


    private void updateButtonColor26() {
        if (secSH26 < check) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH26 < blueThreshold26 && peopleSH_26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH26 < blueThreshold26 && !peopleSH_26 ) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH26 < yellowThreshold26 && peopleSH_26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH26.startAnimation(blinkAnimation);
            }else{
                btnTimerSH26.clearAnimation();
            }
        } else if (secSH26 < yellowThreshold26 && !peopleSH_26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH26 < redThreshold26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH26.startAnimation(blinkAnimation);
            }else{
                btnTimerSH26.clearAnimation();
            }
        } else {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH26.clearAnimation();
        }
    }


    private void updateButtonColor27() {
        if (secSH27 < check) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH27 < blueThreshold27 && peopleSH_27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH27 < blueThreshold27 && !peopleSH_27 ) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH27 < yellowThreshold27 && peopleSH_27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH27.startAnimation(blinkAnimation);
            }else{
                btnTimerSH27.clearAnimation();
            }
        } else if (secSH27 < yellowThreshold27 && !peopleSH_27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH27 < redThreshold27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH27.startAnimation(blinkAnimation);
            }else{
                btnTimerSH27.clearAnimation();
            }
        } else {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH27.clearAnimation();
        }
    }


    private void updateButtonColor28() {
        if (secSH28 < check) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH28 < blueThreshold28 && peopleSH_28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH28 < blueThreshold28 && !peopleSH_28 ) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH28 < yellowThreshold28 && peopleSH_28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH28.startAnimation(blinkAnimation);
            }else{
                btnTimerSH28.clearAnimation();
            }
        } else if (secSH28 < yellowThreshold28 && !peopleSH_28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH28 < redThreshold28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH28.startAnimation(blinkAnimation);
            }else{
                btnTimerSH28.clearAnimation();
            }
        } else {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH28.clearAnimation();
        }
    }


    private void updateButtonColor29() {
        if (secSH29 < check) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH29 < blueThreshold29 && peopleSH_29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH29 < blueThreshold29 && !peopleSH_29 ) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH29 < yellowThreshold29 && peopleSH_29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH29 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH29.startAnimation(blinkAnimation);
            }else{
                btnTimerSH29.clearAnimation();
            }
        } else if (secSH29 < yellowThreshold29 && !peopleSH_29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH29 < redThreshold29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH29 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH29.startAnimation(blinkAnimation);
            }else{
                btnTimerSH29.clearAnimation();
            }
        } else {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH29.clearAnimation();
        }
    }


    private void updateButtonColor30() {
        if (secSH30 < check) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH30 < blueThreshold30 && peopleSH_30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH30 < blueThreshold30 && !peopleSH_30 ) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH30 < yellowThreshold30 && peopleSH_30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH30 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH30.startAnimation(blinkAnimation);
            }else{
                btnTimerSH30.clearAnimation();
            }
        } else if (secSH30 < yellowThreshold30 && !peopleSH_30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH30 < redThreshold30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH30 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH30.startAnimation(blinkAnimation);
            }else{
                btnTimerSH30.clearAnimation();
            }
        } else {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH30.clearAnimation();
        }
    }


    private void updateButtonColor31() {
        if (secSH31 < check) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH31 < blueThreshold31 && peopleSH_31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH31 < blueThreshold31 && !peopleSH_31 ) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH31 < yellowThreshold31 && peopleSH_31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH31 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH31.startAnimation(blinkAnimation);
            }else{
                btnTimerSH31.clearAnimation();
            }
        } else if (secSH31 < yellowThreshold31 && !peopleSH_31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH31 < redThreshold31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH31 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH31.startAnimation(blinkAnimation);
            }else{
                btnTimerSH31.clearAnimation();
            }
        } else {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH31.clearAnimation();
        }
    }


    private void updateButtonColor32() {
        if (secSH32 < check) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH32 < blueThreshold32 && peopleSH_32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH32 < blueThreshold32 && !peopleSH_32 ) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH32 < yellowThreshold32 && peopleSH_32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH32 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH32.startAnimation(blinkAnimation);
            }else{
                btnTimerSH32.clearAnimation();
            }
        } else if (secSH32 < yellowThreshold32 && !peopleSH_32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH32 < redThreshold32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH32 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH32.startAnimation(blinkAnimation);
            }else{
                btnTimerSH32.clearAnimation();
            }
        } else {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH32.clearAnimation();
        }
    }


    private void updateButtonColor33() {
        if (secSH33 < check) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH33 < blueThreshold33 && peopleSH_33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH33 < blueThreshold33 && !peopleSH_33 ) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH33 < yellowThreshold33 && peopleSH_33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH33 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH33.startAnimation(blinkAnimation);
            }else{
                btnTimerSH33.clearAnimation();
            }
        } else if (secSH33 < yellowThreshold33 && !peopleSH_33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH33 < redThreshold33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinggSH33 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH33.startAnimation(blinkAnimation);
            }else{
                btnTimerSH33.clearAnimation();
            }
        } else {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerSH33.clearAnimation();
        }
    }

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

}
