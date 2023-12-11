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

public class SPH extends AppCompatActivity {

    private int ssss = 100;
    private int delay = 1000;
    private int Blue = 12 * ssss;
    private int Yellow = 24 * ssss;
    private int Red = 30 * ssss;
    private int Time1 = 18 * ssss;
    private int Time2 = 36 * ssss;
    //-------------------------------
    public boolean peopleSH_101;
    private SharedPreferences sharedPreferencesSH101;
    private SharedPreferences.Editor editorSH101;
    private static final String SHHSHHtimer_started_KEY_SH101 = "SHHSHHtimer_startedSH101";
    private static final String SHHSHHSHHstart_time_KEY_SH101 = "SHHSHHstart_timeSH101";
    private static final String SHHSHHSHHelapsed_time_KEY_SH101 = "SHHSHHelapsed_timeSH101";

    public boolean peopleSH_102;
    private SharedPreferences sharedPreferencesSH102;
    private SharedPreferences.Editor editorSH102;
    private static final String SHHSHHtimer_started_KEY_SH102 = "SHHSHHtimer_startedSH102";
    private static final String SHHSHHSHHstart_time_KEY_SH102 = "SHHSHHstart_timeSH102";
    private static final String SHHSHHSHHelapsed_time_KEY_SH102 = "SHHSHHelapsed_timeSH102";

    public boolean peopleSH_103;
    private SharedPreferences sharedPreferencesSH103;
    private SharedPreferences.Editor editorSH103;
    private static final String SHHSHHtimer_started_KEY_SH103 = "SHHSHHtimer_startedSH103";
    private static final String SHHSHHSHHstart_time_KEY_SH103 = "SHHSHHstart_timeSH103";
    private static final String SHHSHHSHHelapsed_time_KEY_SH103 = "SHHSHHelapsed_timeSH103";

    public boolean peopleSH_104;
    private SharedPreferences sharedPreferencesSH104;
    private SharedPreferences.Editor editorSH104;
    private static final String SHHSHHtimer_started_KEY_SH104 = "SHHSHHtimer_startedSH104";
    private static final String SHHSHHSHHstart_time_KEY_SH104 = "SHHSHHstart_timeSH104";
    private static final String SHHSHHSHHelapsed_time_KEY_SH104 = "SHHSHHelapsed_timeSH104";

    public boolean peopleSH_105;
    private SharedPreferences sharedPreferencesSH105;
    private SharedPreferences.Editor editorSH105;
    private static final String SHHSHHtimer_started_KEY_SH105 = "SHHSHHtimer_startedSH105";
    private static final String SHHSHHSHHstart_time_KEY_SH105 = "SHHSHHstart_timeSH105";
    private static final String SHHSHHSHHelapsed_time_KEY_SH105 = "SHHSHHelapsed_timeSH105";

    public boolean peopleSH_106;
    private SharedPreferences sharedPreferencesSH106;
    private SharedPreferences.Editor editorSH106;
    private static final String SHHSHHtimer_started_KEY_SH106 = "SHHSHHtimer_startedSH106";
    private static final String SHHSHHSHHstart_time_KEY_SH106 = "SHHSHHstart_timeSH106";
    private static final String SHHSHHSHHelapsed_time_KEY_SH106 = "SHHSHHelapsed_timeSH106";

    public boolean peopleSH_107;
    private SharedPreferences sharedPreferencesSH107;
    private SharedPreferences.Editor editorSH107;
    private static final String SHHSHHtimer_started_KEY_SH107 = "SHHSHHtimer_startedSH107";
    private static final String SHHSHHSHHstart_time_KEY_SH107 = "SHHSHHstart_timeSH107";
    private static final String SHHSHHSHHelapsed_time_KEY_SH107 = "SHHSHHelapsed_timeSH107";

    public boolean peopleSH_8;
    private SharedPreferences sharedPreferencesSH8;
    private SharedPreferences.Editor editorSH8;
    private static final String SHHSHHtimer_started_KEY_SH8 = "SHHSHHtimer_startedSH8";
    private static final String SHHSHHSHHstart_time_KEY_SH8 = "SHHSHHstart_timeSH8";
    private static final String SHHSHHSHHelapsed_time_KEY_SH8 = "SHHSHHelapsed_timeSH8";

    public boolean peopleSH_9;
    private SharedPreferences sharedPreferencesSH9;
    private SharedPreferences.Editor editorSH9;
    private static final String SHHSHHtimer_started_KEY_SH9 = "SHHSHHtimer_startedSH9";
    private static final String SHHSHHSHHstart_time_KEY_SH9 = "SHHSHHstart_timeSH9";
    private static final String SHHSHHSHHelapsed_time_KEY_SH9 = "SHHSHHelapsed_timeSH9";

    public boolean peopleSH_10;
    private SharedPreferences sharedPreferencesSH10;
    private SharedPreferences.Editor editorSH10;
    private static final String SHHSHHtimer_started_KEY_SH10 = "SHHSHHtimer_startedSH10";
    private static final String SHHSHHSHHstart_time_KEY_SH10 = "SHHSHHstart_timeSH10";
    private static final String SHHSHHSHHelapsed_time_KEY_SH10 = "SHHSHHelapsed_timeSH10";

    public boolean peopleSH_11;
    private SharedPreferences sharedPreferencesSH11;
    private SharedPreferences.Editor editorSH11;
    private static final String SHHSHHtimer_started_KEY_SH11 = "SHHSHHtimer_startedSH11";
    private static final String SHHSHHSHHstart_time_KEY_SH11 = "SHHSHHstart_timeSH11";
    private static final String SHHSHHSHHelapsed_time_KEY_SH11 = "SHHSHHelapsed_timeSH11";

    public boolean peopleSH_12;
    private SharedPreferences sharedPreferencesSH12;
    private SharedPreferences.Editor editorSH12;
    private static final String SHHSHHtimer_started_KEY_SH12 = "SHHSHHtimer_startedSH12";
    private static final String SHHSHHSHHstart_time_KEY_SH12 = "SHHSHHstart_timeSH12";
    private static final String SHHSHHSHHelapsed_time_KEY_SH12 = "SHHSHHelapsed_timeSH12";

    public boolean peopleSH_13;
    private SharedPreferences sharedPreferencesSH13;
    private SharedPreferences.Editor editorSH13;
    private static final String SHHSHHtimer_started_KEY_SH13 = "SHHSHHtimer_startedSH13";
    private static final String SHHSHHSHHstart_time_KEY_SH13 = "SHHSHHstart_timeSH13";
    private static final String SHHSHHSHHelapsed_time_KEY_SH13 = "SHHSHHelapsed_timeSH13";

    public boolean peopleSH_14;
    private SharedPreferences sharedPreferencesSH14;
    private SharedPreferences.Editor editorSH14;
    private static final String SHHSHHtimer_started_KEY_SH14 = "SHHSHHtimer_startedSH14";
    private static final String SHHSHHSHHstart_time_KEY_SH14 = "SHHSHHstart_timeSH14";
    private static final String SHHSHHSHHelapsed_time_KEY_SH14 = "SHHSHHelapsed_timeSH14";

    public boolean peopleSH_15;
    private SharedPreferences sharedPreferencesSH15;
    private SharedPreferences.Editor editorSH15;
    private static final String SHHSHHtimer_started_KEY_SH15 = "SHHSHHtimer_startedSH15";
    private static final String SHHSHHSHHstart_time_KEY_SH15 = "SHHSHHstart_timeSH15";
    private static final String SHHSHHSHHelapsed_time_KEY_SH15 = "SHHSHHelapsed_timeSH15";

    public boolean peopleSH_16;
    private SharedPreferences sharedPreferencesSH16;
    private SharedPreferences.Editor editorSH16;
    private static final String SHHSHHtimer_started_KEY_SH16 = "SHHSHHtimer_startedSH16";
    private static final String SHHSHHSHHstart_time_KEY_SH16 = "SHHSHHstart_timeSH16";
    private static final String SHHSHHSHHelapsed_time_KEY_SH16 = "SHHSHHelapsed_timeSH16";

    public boolean peopleSH_17;
    private SharedPreferences sharedPreferencesSH17;
    private SharedPreferences.Editor editorSH17;
    private static final String SHHSHHtimer_started_KEY_SH17 = "SHHSHHtimer_startedSH17";
    private static final String SHHSHHSHHstart_time_KEY_SH17 = "SHHSHHstart_timeSH17";
    private static final String SHHSHHSHHelapsed_time_KEY_SH17 = "SHHSHHelapsed_timeSH17";

    public boolean peopleSH_18;
    private SharedPreferences sharedPreferencesSH18;
    private SharedPreferences.Editor editorSH18;
    private static final String SHHSHHtimer_started_KEY_SH18 = "SHHSHHtimer_startedSH18";
    private static final String SHHSHHSHHstart_time_KEY_SH18 = "SHHSHHstart_timeSH18";
    private static final String SHHSHHSHHelapsed_time_KEY_SH18 = "SHHSHHelapsed_timeSH18";

    public boolean peopleSH_19;
    private SharedPreferences sharedPreferencesSH19;
    private SharedPreferences.Editor editorSH19;
    private static final String SHHSHHtimer_started_KEY_SH19 = "SHHSHHtimer_startedSH19";
    private static final String SHHSHHSHHstart_time_KEY_SH19 = "SHHSHHstart_timeSH19";
    private static final String SHHSHHSHHelapsed_time_KEY_SH19 = "SHHSHHelapsed_timeSH19";

    public boolean peopleSH_20;
    private SharedPreferences sharedPreferencesSH20;
    private SharedPreferences.Editor editorSH20;
    private static final String SHHSHHtimer_started_KEY_SH20 = "SHHSHHtimer_startedSH20";
    private static final String SHHSHHSHHstart_time_KEY_SH20 = "SHHSHHstart_timeSH20";
    private static final String SHHSHHSHHelapsed_time_KEY_SH20 = "SHHSHHelapsed_timeSH20";

    public boolean peopleSH_21;
    private SharedPreferences sharedPreferencesSH21;
    private SharedPreferences.Editor editorSH21;
    private static final String SHHSHHtimer_started_KEY_SH21 = "SHHSHHtimer_startedSH21";
    private static final String SHHSHHSHHstart_time_KEY_SH21 = "SHHSHHstart_timeSH21";
    private static final String SHHSHHSHHelapsed_time_KEY_SH21 = "SHHSHHelapsed_timeSH21";

    public boolean peopleSH_22;
    private SharedPreferences sharedPreferencesSH22;
    private SharedPreferences.Editor editorSH22;
    private static final String SHHSHHtimer_started_KEY_SH22 = "SHHSHHtimer_startedSH22";
    private static final String SHHSHHSHHstart_time_KEY_SH22 = "SHHSHHstart_timeSH22";
    private static final String SHHSHHSHHelapsed_time_KEY_SH22 = "SHHSHHelapsed_timeSH22";

    public boolean peopleSH_23;
    private SharedPreferences sharedPreferencesSH23;
    private SharedPreferences.Editor editorSH23;
    private static final String SHHSHHtimer_started_KEY_SH23 = "SHHSHHtimer_startedSH23";
    private static final String SHHSHHSHHstart_time_KEY_SH23 = "SHHSHHstart_timeSH23";
    private static final String SHHSHHSHHelapsed_time_KEY_SH23 = "SHHSHHelapsed_timeSH23";

    public boolean peopleSH_24;
    private SharedPreferences sharedPreferencesSH24;
    private SharedPreferences.Editor editorSH24;
    private static final String SHHSHHtimer_started_KEY_SH24 = "SHHSHHtimer_startedSH24";
    private static final String SHHSHHSHHstart_time_KEY_SH24 = "SHHSHHstart_timeSH24";
    private static final String SHHSHHSHHelapsed_time_KEY_SH24 = "SHHSHHelapsed_timeSH24";

    public boolean peopleSH_25;
    private SharedPreferences sharedPreferencesSH25;
    private SharedPreferences.Editor editorSH25;
    private static final String SHHSHHtimer_started_KEY_SH25 = "SHHSHHtimer_startedSH25";
    private static final String SHHSHHSHHstart_time_KEY_SH25 = "SHHSHHstart_timeSH25";
    private static final String SHHSHHSHHelapsed_time_KEY_SH25 = "SHHSHHelapsed_timeSH25";

    public boolean peopleSH_26;
    private SharedPreferences sharedPreferencesSH26;
    private SharedPreferences.Editor editorSH26;
    private static final String SHHSHHtimer_started_KEY_SH26 = "SHHSHHtimer_startedSH26";
    private static final String SHHSHHSHHstart_time_KEY_SH26 = "SHHSHHstart_timeSH26";
    private static final String SHHSHHSHHelapsed_time_KEY_SH26 = "SHHSHHelapsed_timeSH26";

    public boolean peopleSH_27;
    private SharedPreferences sharedPreferencesSH27;
    private SharedPreferences.Editor editorSH27;
    private static final String SHHSHHtimer_started_KEY_SH27 = "SHHSHHtimer_startedSH27";
    private static final String SHHSHHSHHstart_time_KEY_SH27 = "SHHSHHstart_timeSH27";
    private static final String SHHSHHSHHelapsed_time_KEY_SH27 = "SHHSHHelapsed_timeSH27";

    public boolean peopleSH_28;
    private SharedPreferences sharedPreferencesSH28;
    private SharedPreferences.Editor editorSH28;
    private static final String SHHSHHtimer_started_KEY_SH28 = "SHHSHHtimer_startedSH28";
    private static final String SHHSHHSHHstart_time_KEY_SH28 = "SHHSHHstart_timeSH28";
    private static final String SHHSHHSHHelapsed_time_KEY_SH28 = "SHHSHHelapsed_timeSH28";

    public boolean peopleSH_29;
    private SharedPreferences sharedPreferencesSH29;
    private SharedPreferences.Editor editorSH29;
    private static final String SHHSHHtimer_started_KEY_SH29 = "SHHSHHtimer_startedSH29";
    private static final String SHHSHHSHHstart_time_KEY_SH29 = "SHHSHHstart_timeSH29";
    private static final String SHHSHHSHHelapsed_time_KEY_SH29 = "SHHSHHelapsed_timeSH29";

    public boolean peopleSH_30;
    private SharedPreferences sharedPreferencesSH30;
    private SharedPreferences.Editor editorSH30;
    private static final String SHHSHHtimer_started_KEY_SH30 = "SHHSHHtimer_startedSH30";
    private static final String SHHSHHSHHstart_time_KEY_SH30 = "SHHSHHstart_timeSH30";
    private static final String SHHSHHSHHelapsed_time_KEY_SH30 = "SHHSHHelapsed_timeSH30";

    public boolean peopleSH_31;
    private SharedPreferences sharedPreferencesSH31;
    private SharedPreferences.Editor editorSH31;
    private static final String SHHSHHtimer_started_KEY_SH31 = "SHHSHHtimer_startedSH31";
    private static final String SHHSHHSHHstart_time_KEY_SH31 = "SHHSHHstart_timeSH31";
    private static final String SHHSHHSHHelapsed_time_KEY_SH31 = "SHHSHHelapsed_timeSH31";

    public boolean peopleSH_32;
    private SharedPreferences sharedPreferencesSH32;
    private SharedPreferences.Editor editorSH32;
    private static final String SHHSHHtimer_started_KEY_SH32 = "SHHSHHtimer_startedSH32";
    private static final String SHHSHHSHHstart_time_KEY_SH32 = "SHHSHHstart_timeSH32";
    private static final String SHHSHHSHHelapsed_time_KEY_SH32 = "SHHSHHelapsed_timeSH32";

    public boolean peopleSH_33;
    private SharedPreferences sharedPreferencesSH33;
    private SharedPreferences.Editor editorSH33;
    private static final String SHHSHHtimer_started_KEY_SH33 = "SHHSHHtimer_startedSH33";
    private static final String SHHSHHSHHstart_time_KEY_SH33 = "SHHSHHstart_timeSH33";
    private static final String SHHSHHSHHelapsed_time_KEY_SH33 = "SHHSHHelapsed_timeSH33";

    private int sss = 100;
    private int b2 = 12*sss;
    private int y2 = 48*sss;
    private int r2 = 54*sss;

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
    private static final String SHHSHHtimer_started_KEY1 = "SHHtimer_started1";
    private static final String SHHSHHstart_time_KEY1 = "SHHstart_time1";
    private static final String SHHSHHelapsed_time_KEY1 = "SHHelapsed_time1";

    private SharedPreferences sharedPreferences2;
    private SharedPreferences.Editor editor2;
    private static final String SHHSHHtimer_started_KEY2 = "SHHtimer_started2";
    private static final String SHHSHHstart_time_KEY2 = "SHHstart_time2";
    private static final String SHHSHHelapsed_time_KEY2 = "SHHelapsed_time2";

    private SharedPreferences sharedPreferences3;
    private SharedPreferences.Editor editor3;
    private static final String SHHSHHtimer_started_KEY3 = "SHHtimer_started3";
    private static final String SHHSHHstart_time_KEY3 = "SHHstart_time3";
    private static final String SHHSHHelapsed_time_KEY3 = "SHHelapsed_time3";

    private SharedPreferences sharedPreferences4;
    private SharedPreferences.Editor editor4;
    private static final String SHHSHHtimer_started_KEY4 = "SHHtimer_started4";
    private static final String SHHSHHstart_time_KEY4 = "SHHstart_time4";
    private static final String SHHSHHelapsed_time_KEY4 = "SHHelapsed_time4";
    private SharedPreferences sharedPreferences5;
    private SharedPreferences.Editor editor5;
    private static final String SHHSHHtimer_started_KEY5 = "SHHtimer_started5";
    private static final String SHHSHHstart_time_KEY5 = "SHHstart_time5";
    private static final String SHHSHHelapsed_time_KEY5 = "SHHelapsed_time5";



    private SharedPreferences sharedPreferences7;
    private SharedPreferences.Editor editor7;
    private static final String SHHSHHtimer_started_KEY7 = "SHHtimer_started7";
    private static final String SHHSHHstart_time_KEY7 = "SHHstart_time7";
    private static final String SHHSHHelapsed_time_KEY7 = "SHHelapsed_time7";



    private SharedPreferences sharedPreferences66;
    private SharedPreferences.Editor editor66;
    private static final String SHHSHHtimer_started_KEY66 = "SHHtimer_started66";
    private static final String SHHSHHstart_time_KEY66 = "SHHstart_time66";
    private static final String SHHSHHelapsed_time_KEY66 = "SHHelapsed_time66";

    //----------------------------------------------------------------------------
    private Handler handlerSH = new Handler();
    private int originalSHHblueThresholdSH2 = Blue;
    private int originalSHHyellowThresholdSH2 = Yellow;
    private int originalSHHredThresholdSH2 = Red;

    private Handler handler1 = new Handler();
    private int originalSHHblueThreshold2 = b2;
    private int originalSHHyellowThreshold2 = y2;
    private int originalSHHredThreshold2 = r2;


    //----------------------------------------------------------------------------
    private long startTimeSH101 = 0L;
    private long timeInMillisecondsSH101 = 0L;
    private long updatedTimeSH101 = 0L;
    private int secondsSH101 = 0;
    private int secSH101 = 0;
    private int minutesSH101 = 0;
    private int hoursSH101 = 0;
    private Button btnTimerSH101;
    private int SHHblueThreshold101 = Blue;
    private int SHHyellowThreshold101 = Yellow;
    private int SHHredThreshold101 = Red;
    private boolean SHHSHHisTimerRunningSH101 = false;

    private long startTimeSH102 = 0L;
    private long timeInMillisecondsSH102 = 0L;
    private long updatedTimeSH102 = 0L;
    private int secondsSH102 = 0;
    private int secSH102 = 0;
    private int minutesSH102 = 0;
    private int hoursSH102 = 0;
    private Button btnTimerSH102;
    private int SHHblueThreshold102 = Blue;
    private int SHHyellowThreshold102 = Yellow;
    private int SHHredThreshold102 = Red;
    private boolean SHHSHHisTimerRunningSH102 = false;

    private long startTimeSH103 = 0L;
    private long timeInMillisecondsSH103 = 0L;
    private long updatedTimeSH103 = 0L;
    private int secondsSH103 = 0;
    private int secSH103 = 0;
    private int minutesSH103 = 0;
    private int hoursSH103 = 0;
    private Button btnTimerSH103;
    private int SHHblueThreshold103 = Blue;
    private int SHHyellowThreshold103 = Yellow;
    private int SHHredThreshold103 = Red;
    private boolean SHHSHHisTimerRunningSH103 = false;

    private long startTimeSH104 = 0L;
    private long timeInMillisecondsSH104 = 0L;
    private long updatedTimeSH104 = 0L;
    private int secondsSH104 = 0;
    private int secSH104 = 0;
    private int minutesSH104 = 0;
    private int hoursSH104 = 0;
    private Button btnTimerSH104;
    private int SHHblueThreshold104 = Blue;
    private int SHHyellowThreshold104 = Yellow;
    private int SHHredThreshold104 = Red;
    private boolean SHHSHHisTimerRunningSH104 = false;

    private long startTimeSH105 = 0L;
    private long timeInMillisecondsSH105 = 0L;
    private long updatedTimeSH105 = 0L;
    private int secondsSH105 = 0;
    private int secSH105 = 0;
    private int minutesSH105 = 0;
    private int hoursSH105 = 0;
    private Button btnTimerSH105;
    private int SHHblueThreshold105 = Blue;
    private int SHHyellowThreshold105 = Yellow;
    private int SHHredThreshold105 = Red;
    private boolean SHHSHHisTimerRunningSH105 = false;

    private long startTimeSH106 = 0L;
    private long timeInMillisecondsSH106 = 0L;
    private long updatedTimeSH106 = 0L;
    private int secondsSH106 = 0;
    private int secSH106 = 0;
    private int minutesSH106 = 0;
    private int hoursSH106 = 0;
    private Button btnTimerSH106;
    private int SHHblueThreshold106 = Blue;
    private int SHHyellowThreshold106 = Yellow;
    private int SHHredThreshold106 = Red;
    private boolean SHHSHHisTimerRunningSH106 = false;

    private long startTimeSH107 = 0L;
    private long timeInMillisecondsSH107 = 0L;
    private long updatedTimeSH107 = 0L;
    private int secondsSH107 = 0;
    private int secSH107 = 0;
    private int minutesSH107 = 0;
    private int hoursSH107 = 0;
    private Button btnTimerSH107;
    private int SHHblueThreshold107 = Blue;
    private int SHHyellowThreshold107 = Yellow;
    private int SHHredThreshold107 = Red;
    private boolean SHHSHHisTimerRunningSH107 = false;

    private long startTimeSH8 = 0L;
    private long timeInMillisecondsSH8 = 0L;
    private long updatedTimeSH8 = 0L;
    private int secondsSH8 = 0;
    private int secSH8 = 0;
    private int minutesSH8 = 0;
    private int hoursSH8 = 0;
    private Button btnTimerSH8;
    private int SHHblueThreshold8 = Blue;
    private int SHHyellowThreshold8 = Yellow;
    private int SHHredThreshold8 = Red;
    private boolean SHHSHHisTimerRunningSH8 = false;

    private long startTimeSH9 = 0L;
    private long timeInMillisecondsSH9 = 0L;
    private long updatedTimeSH9 = 0L;
    private int secondsSH9 = 0;
    private int secSH9 = 0;
    private int minutesSH9 = 0;
    private int hoursSH9 = 0;
    private Button btnTimerSH9;
    private int SHHblueThreshold9 = Blue;
    private int SHHyellowThreshold9 = Yellow;
    private int SHHredThreshold9 = Red;
    private boolean SHHSHHisTimerRunningSH9 = false;

    private long startTimeSH10 = 0L;
    private long timeInMillisecondsSH10 = 0L;
    private long updatedTimeSH10 = 0L;
    private int secondsSH10 = 0;
    private int secSH10 = 0;
    private int minutesSH10 = 0;
    private int hoursSH10 = 0;
    private Button btnTimerSH10;
    private int SHHblueThreshold10 = Blue;
    private int SHHyellowThreshold10 = Yellow;
    private int SHHredThreshold10 = Red;
    private boolean SHHSHHisTimerRunningSH10 = false;

    private long startTimeSH11 = 0L;
    private long timeInMillisecondsSH11 = 0L;
    private long updatedTimeSH11 = 0L;
    private int secondsSH11 = 0;
    private int secSH11 = 0;
    private int minutesSH11 = 0;
    private int hoursSH11 = 0;
    private Button btnTimerSH11;
    private int SHHblueThreshold11 = Blue;
    private int SHHyellowThreshold11 = Yellow;
    private int SHHredThreshold11 = Red;
    private boolean SHHSHHisTimerRunningSH11 = false;

    private long startTimeSH12 = 0L;
    private long timeInMillisecondsSH12 = 0L;
    private long updatedTimeSH12 = 0L;
    private int secondsSH12 = 0;
    private int secSH12 = 0;
    private int minutesSH12 = 0;
    private int hoursSH12 = 0;
    private Button btnTimerSH12;
    private int SHHblueThreshold12 = Blue;
    private int SHHyellowThreshold12 = Yellow;
    private int SHHredThreshold12 = Red;
    private boolean SHHSHHisTimerRunningSH12 = false;

    private long startTimeSH13 = 0L;
    private long timeInMillisecondsSH13 = 0L;
    private long updatedTimeSH13 = 0L;
    private int secondsSH13 = 0;
    private int secSH13 = 0;
    private int minutesSH13 = 0;
    private int hoursSH13 = 0;
    private Button btnTimerSH13;
    private int SHHblueThreshold13 = Blue;
    private int SHHyellowThreshold13 = Yellow;
    private int SHHredThreshold13 = Red;
    private boolean SHHSHHisTimerRunningSH13 = false;

    private long startTimeSH14 = 0L;
    private long timeInMillisecondsSH14 = 0L;
    private long updatedTimeSH14 = 0L;
    private int secondsSH14 = 0;
    private int secSH14 = 0;
    private int minutesSH14 = 0;
    private int hoursSH14 = 0;
    private Button btnTimerSH14;
    private int SHHblueThreshold14 = Blue;
    private int SHHyellowThreshold14 = Yellow;
    private int SHHredThreshold14 = Red;
    private boolean SHHSHHisTimerRunningSH14 = false;

    private long startTimeSH15 = 0L;
    private long timeInMillisecondsSH15 = 0L;
    private long updatedTimeSH15 = 0L;
    private int secondsSH15 = 0;
    private int secSH15 = 0;
    private int minutesSH15 = 0;
    private int hoursSH15 = 0;
    private Button btnTimerSH15;
    private int SHHblueThreshold15 = Blue;
    private int SHHyellowThreshold15 = Yellow;
    private int SHHredThreshold15 = Red;
    private boolean SHHSHHisTimerRunningSH15 = false;

    private long startTimeSH16 = 0L;
    private long timeInMillisecondsSH16 = 0L;
    private long updatedTimeSH16 = 0L;
    private int secondsSH16 = 0;
    private int secSH16 = 0;
    private int minutesSH16 = 0;
    private int hoursSH16 = 0;
    private Button btnTimerSH16;
    private int SHHblueThreshold16 = Blue;
    private int SHHyellowThreshold16 = Yellow;
    private int SHHredThreshold16 = Red;
    private boolean SHHSHHisTimerRunningSH16 = false;

    private long startTimeSH17 = 0L;
    private long timeInMillisecondsSH17 = 0L;
    private long updatedTimeSH17 = 0L;
    private int secondsSH17 = 0;
    private int secSH17 = 0;
    private int minutesSH17 = 0;
    private int hoursSH17 = 0;
    private Button btnTimerSH17;
    private int SHHblueThreshold17 = Blue;
    private int SHHyellowThreshold17 = Yellow;
    private int SHHredThreshold17 = Red;
    private boolean SHHSHHisTimerRunningSH17 = false;

    private long startTimeSH18 = 0L;
    private long timeInMillisecondsSH18 = 0L;
    private long updatedTimeSH18 = 0L;
    private int secondsSH18 = 0;
    private int secSH18 = 0;
    private int minutesSH18 = 0;
    private int hoursSH18 = 0;
    private Button btnTimerSH18;
    private int SHHblueThreshold18 = Blue;
    private int SHHyellowThreshold18 = Yellow;
    private int SHHredThreshold18 = Red;
    private boolean SHHSHHisTimerRunningSH18 = false;

    private long startTimeSH19 = 0L;
    private long timeInMillisecondsSH19 = 0L;
    private long updatedTimeSH19 = 0L;
    private int secondsSH19 = 0;
    private int secSH19 = 0;
    private int minutesSH19 = 0;
    private int hoursSH19 = 0;
    private Button btnTimerSH19;
    private int SHHblueThreshold19 = Blue;
    private int SHHyellowThreshold19 = Yellow;
    private int SHHredThreshold19 = Red;
    private boolean SHHSHHisTimerRunningSH19 = false;

    private long startTimeSH20 = 0L;
    private long timeInMillisecondsSH20 = 0L;
    private long updatedTimeSH20 = 0L;
    private int secondsSH20 = 0;
    private int secSH20 = 0;
    private int minutesSH20 = 0;
    private int hoursSH20 = 0;
    private Button btnTimerSH20;
    private int SHHblueThreshold20 = Blue;
    private int SHHyellowThreshold20 = Yellow;
    private int SHHredThreshold20 = Red;
    private boolean SHHSHHisTimerRunningSH20 = false;

    private long startTimeSH21 = 0L;
    private long timeInMillisecondsSH21 = 0L;
    private long updatedTimeSH21 = 0L;
    private int secondsSH21 = 0;
    private int secSH21 = 0;
    private int minutesSH21 = 0;
    private int hoursSH21 = 0;
    private Button btnTimerSH21;
    private int SHHblueThreshold21 = Blue;
    private int SHHyellowThreshold21 = Yellow;
    private int SHHredThreshold21 = Red;
    private boolean SHHSHHisTimerRunningSH21 = false;

    private long startTimeSH22 = 0L;
    private long timeInMillisecondsSH22 = 0L;
    private long updatedTimeSH22 = 0L;
    private int secondsSH22 = 0;
    private int secSH22 = 0;
    private int minutesSH22 = 0;
    private int hoursSH22 = 0;
    private Button btnTimerSH22;
    private int SHHblueThreshold22 = Blue;
    private int SHHyellowThreshold22 = Yellow;
    private int SHHredThreshold22 = Red;
    private boolean SHHSHHisTimerRunningSH22 = false;

    private long startTimeSH23 = 0L;
    private long timeInMillisecondsSH23 = 0L;
    private long updatedTimeSH23 = 0L;
    private int secondsSH23 = 0;
    private int secSH23 = 0;
    private int minutesSH23 = 0;
    private int hoursSH23 = 0;
    private Button btnTimerSH23;
    private int SHHblueThreshold23 = Blue;
    private int SHHyellowThreshold23 = Yellow;
    private int SHHredThreshold23 = Red;
    private boolean SHHSHHisTimerRunningSH23 = false;

    private long startTimeSH24 = 0L;
    private long timeInMillisecondsSH24 = 0L;
    private long updatedTimeSH24 = 0L;
    private int secondsSH24 = 0;
    private int secSH24 = 0;
    private int minutesSH24 = 0;
    private int hoursSH24 = 0;
    private Button btnTimerSH24;
    private int SHHblueThreshold24 = Blue;
    private int SHHyellowThreshold24 = Yellow;
    private int SHHredThreshold24 = Red;
    private boolean SHHSHHisTimerRunningSH24 = false;

    private long startTimeSH25 = 0L;
    private long timeInMillisecondsSH25 = 0L;
    private long updatedTimeSH25 = 0L;
    private int secondsSH25 = 0;
    private int secSH25 = 0;
    private int minutesSH25 = 0;
    private int hoursSH25 = 0;
    private Button btnTimerSH25;
    private int SHHblueThreshold25 = Blue;
    private int SHHyellowThreshold25 = Yellow;
    private int SHHredThreshold25 = Red;
    private boolean SHHSHHisTimerRunningSH25 = false;

    private long startTimeSH26 = 0L;
    private long timeInMillisecondsSH26 = 0L;
    private long updatedTimeSH26 = 0L;
    private int secondsSH26 = 0;
    private int secSH26 = 0;
    private int minutesSH26 = 0;
    private int hoursSH26 = 0;
    private Button btnTimerSH26;
    private int SHHblueThreshold26 = Blue;
    private int SHHyellowThreshold26 = Yellow;
    private int SHHredThreshold26 = Red;
    private boolean SHHSHHisTimerRunningSH26 = false;

    private long startTimeSH27 = 0L;
    private long timeInMillisecondsSH27 = 0L;
    private long updatedTimeSH27 = 0L;
    private int secondsSH27 = 0;
    private int secSH27 = 0;
    private int minutesSH27 = 0;
    private int hoursSH27 = 0;
    private Button btnTimerSH27;
    private int SHHblueThreshold27 = Blue;
    private int SHHyellowThreshold27 = Yellow;
    private int SHHredThreshold27 = Red;
    private boolean SHHSHHisTimerRunningSH27 = false;
    private long startTimeSH28 = 0L;
    private long timeInMillisecondsSH28 = 0L;
    private long updatedTimeSH28 = 0L;
    private int secondsSH28 = 0;
    private int secSH28 = 0;
    private int minutesSH28 = 0;
    private int hoursSH28 = 0;
    private Button btnTimerSH28;
    private int SHHblueThreshold28 = Blue;
    private int SHHyellowThreshold28 = Yellow;
    private int SHHredThreshold28 = Red;
    private boolean SHHSHHisTimerRunningSH28 = false;

    private long startTimeSH29 = 0L;
    private long timeInMillisecondsSH29 = 0L;
    private long updatedTimeSH29 = 0L;
    private int secondsSH29 = 0;
    private int secSH29 = 0;
    private int minutesSH29 = 0;
    private int hoursSH29 = 0;
    private Button btnTimerSH29;
    private int SHHblueThreshold29 = Blue;
    private int SHHyellowThreshold29 = Yellow;
    private int SHHredThreshold29 = Red;
    private boolean SHHSHHisTimerRunningSH29 = false;

    private long startTimeSH30 = 0L;
    private long timeInMillisecondsSH30 = 0L;
    private long updatedTimeSH30 = 0L;
    private int secondsSH30 = 0;
    private int secSH30 = 0;
    private int minutesSH30 = 0;
    private int hoursSH30 = 0;
    private Button btnTimerSH30;
    private int SHHblueThreshold30 = Blue;
    private int SHHyellowThreshold30 = Yellow;
    private int SHHredThreshold30 = Red;
    private boolean SHHSHHisTimerRunningSH30 = false;

    private long startTimeSH31 = 0L;
    private long timeInMillisecondsSH31 = 0L;
    private long updatedTimeSH31 = 0L;
    private int secondsSH31 = 0;
    private int secSH31 = 0;
    private int minutesSH31 = 0;
    private int hoursSH31 = 0;
    private Button btnTimerSH31;
    private int SHHblueThreshold31 = Blue;
    private int SHHyellowThreshold31 = Yellow;
    private int SHHredThreshold31 = Red;
    private boolean SHHSHHisTimerRunningSH31 = false;

    private long startTimeSH32 = 0L;
    private long timeInMillisecondsSH32 = 0L;
    private long updatedTimeSH32 = 0L;
    private int secondsSH32 = 0;
    private int secSH32 = 0;
    private int minutesSH32 = 0;
    private int hoursSH32 = 0;
    private Button btnTimerSH32;
    private int SHHblueThreshold32 = Blue;
    private int SHHyellowThreshold32 = Yellow;
    private int SHHredThreshold32 = Red;
    private boolean SHHSHHisTimerRunningSH32 = false;

    private long startTimeSH33 = 0L;
    private long timeInMillisecondsSH33 = 0L;
    private long updatedTimeSH33 = 0L;
    private int secondsSH33 = 0;
    private int secSH33 = 0;
    private int minutesSH33 = 0;
    private int hoursSH33 = 0;
    private Button btnTimerSH33;
    private int SHHblueThreshold33 = Blue;
    private int SHHyellowThreshold33 = Yellow;
    private int SHHredThreshold33 = Red;
    private boolean SHHSHHisTimerRunningSH33 = false;

    private long startTime1 = 0L;
    private long timeInMilliseconds1 = 0L;
    private long updatedTime1 = 0L;
    private int seconds1 = 0;
    private int sec1 = 0;
    private int minutes1 = 0;
    private int hours1 = 0;
    private Button btnTimer1;
    //此為測試用 正式版應改為正確時間
    private int SHHblueThreshold1 = b2;   //b2
    private int SHHyellowThreshold1 = y2; //y2
    private int SHHredThreshold1 = r2;    //r2
    //此為測試用 正式版應改為正確時間
    public int people1;
    private boolean SHHisTimerRunning1 = false;



    private long startTime2 = 0L;
    private long timeInMilliseconds2 = 0L;
    private long updatedTime2 = 0L;
    private int seconds2 = 0;
    private int sec2 = 0;
    private int minutes2 = 0;
    private int hours2 = 0;
    private Button btnTimer2;
    private int SHHblueThreshold2 = b2;
    private int SHHyellowThreshold2 = y2;
    private int SHHredThreshold2 = r2;
    public int people2;
    private boolean SHHisTimerRunning2 = false;


    private long startTime3 = 0L;
    private long timeInMilliseconds3 = 0L;
    private long updatedTime3 = 0L;
    private int seconds3 = 0;
    private int sec3 = 0;
    private int minutes3 = 0;
    private int hours3 = 0;
    private Button btnTimer3;
    private int SHHblueThreshold3 = b2;
    private int SHHyellowThreshold3 = y2;
    private int SHHredThreshold3 = r2;
    public int people3;
    private boolean SHHisTimerRunning3 = false;


    private long startTime4 = 0L;
    private long timeInMilliseconds4 = 0L;
    private long updatedTime4 = 0L;
    private int seconds4 = 0;
    private int sec4 = 0;
    private int minutes4 = 0;
    private int hours4 = 0;
    private Button btnTimer4;
    private int SHHblueThreshold4 = b2;
    private int SHHyellowThreshold4 = y2;
    private int SHHredThreshold4 = r2;
    public int people4;
    private boolean SHHisTimerRunning4 = false;

    private long startTime5 = 0L;
    private long timeInMilliseconds5 = 0L;
    private long updatedTime5 = 0L;
    private int seconds5 = 0;
    private int sec5 = 0;
    private int minutes5 = 0;
    private int hours5 = 0;
    private Button btnTimer5;
    private int SHHblueThreshold5 = b2;
    private int SHHyellowThreshold5 = y2;
    private int SHHredThreshold5 = r2;
    public int people5;
    private boolean SHHisTimerRunning5 = false;


    private long startTime7 = 0L;
    private long timeInMilliseconds7 = 0L;
    private long updatedTime7 = 0L;
    private int seconds7 = 0;
    private int sec7 = 0;
    private int minutes7 = 0;
    private int hours7 = 0;
    private Button btnTimer7;
    private int SHHblueThreshold7 = b2;
    private int SHHyellowThreshold7 = y2;
    private int SHHredThreshold7 = r2;
    public int people7;
    private boolean SHHisTimerRunning7 = false;

    private long startTime66 = 0L;
    private long timeInMilliseconds66 = 0L;
    private long updatedTime66 = 0L;
    private int seconds66 = 0;
    private int sec66 = 0;
    private int minutes66 = 0;
    private int hours66 = 0;
    private Button btnTimer66;
    private int SHHblueThreshold66 = b2;
    private int SHHyellowThreshold66 = y2;
    private int SHHredThreshold66 = r2;
    public int people66;
    private boolean SHHisTimerRunning66 = false;

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
    int SHHSHHcurrentHourSH101;
    int SHHSHHcurrentMinuteSH101;
    int futureHourSH101;
    int futureMinuteSH101;

    int SHHSHHcurrentHourSH102;
    int SHHSHHcurrentMinuteSH102;
    int futureHourSH102;
    int futureMinuteSH102;

    int SHHSHHcurrentHourSH103;
    int SHHSHHcurrentMinuteSH103;
    int futureHourSH103;
    int futureMinuteSH103;

    int SHHSHHcurrentHourSH104;
    int SHHSHHcurrentMinuteSH104;
    int futureHourSH104;
    int futureMinuteSH104;

    int SHHSHHcurrentHourSH105;
    int SHHSHHcurrentMinuteSH105;
    int futureHourSH105;
    int futureMinuteSH105;

    int SHHSHHcurrentHourSH106;
    int SHHSHHcurrentMinuteSH106;
    int futureHourSH106;
    int futureMinuteSH106;

    int SHHSHHcurrentHourSH107;
    int SHHSHHcurrentMinuteSH107;
    int futureHourSH107;
    int futureMinuteSH107;

    int SHHSHHcurrentHourSH8;
    int SHHSHHcurrentMinuteSH8;
    int futureHourSH8;
    int futureMinuteSH8;

    int SHHSHHcurrentHourSH9;
    int SHHSHHcurrentMinuteSH9;
    int futureHourSH9;
    int futureMinuteSH9;

    int SHHSHHcurrentHourSH10;
    int SHHSHHcurrentMinuteSH10;
    int futureHourSH10;
    int futureMinuteSH10;

    int SHHSHHcurrentHourSH11;
    int SHHSHHcurrentMinuteSH11;
    int futureHourSH11;
    int futureMinuteSH11;

    int SHHSHHcurrentHourSH12;
    int SHHSHHcurrentMinuteSH12;
    int futureHourSH12;
    int futureMinuteSH12;

    int SHHSHHcurrentHourSH13;
    int SHHSHHcurrentMinuteSH13;
    int futureHourSH13;
    int futureMinuteSH13;

    int SHHSHHcurrentHourSH14;
    int SHHSHHcurrentMinuteSH14;
    int futureHourSH14;
    int futureMinuteSH14;

    int SHHSHHcurrentHourSH15;
    int SHHSHHcurrentMinuteSH15;
    int futureHourSH15;
    int futureMinuteSH15;

    int SHHSHHcurrentHourSH16;
    int SHHSHHcurrentMinuteSH16;
    int futureHourSH16;
    int futureMinuteSH16;

    int SHHSHHcurrentHourSH17;
    int SHHSHHcurrentMinuteSH17;
    int futureHourSH17;
    int futureMinuteSH17;

    int SHHSHHcurrentHourSH18;
    int SHHSHHcurrentMinuteSH18;
    int futureHourSH18;
    int futureMinuteSH18;

    int SHHSHHcurrentHourSH19;
    int SHHSHHcurrentMinuteSH19;
    int futureHourSH19;
    int futureMinuteSH19;

    int SHHSHHcurrentHourSH20;
    int SHHSHHcurrentMinuteSH20;
    int futureHourSH20;
    int futureMinuteSH20;

    int SHHSHHcurrentHourSH21;
    int SHHSHHcurrentMinuteSH21;
    int futureHourSH21;
    int futureMinuteSH21;

    int SHHSHHcurrentHourSH22;
    int SHHSHHcurrentMinuteSH22;
    int futureHourSH22;
    int futureMinuteSH22;

    int SHHSHHcurrentHourSH23;
    int SHHSHHcurrentMinuteSH23;
    int futureHourSH23;
    int futureMinuteSH23;

    int SHHSHHcurrentHourSH24;
    int SHHSHHcurrentMinuteSH24;
    int futureHourSH24;
    int futureMinuteSH24;

    int SHHSHHcurrentHourSH25;
    int SHHSHHcurrentMinuteSH25;
    int futureHourSH25;
    int futureMinuteSH25;

    int SHHSHHcurrentHourSH26;
    int SHHSHHcurrentMinuteSH26;
    int futureHourSH26;
    int futureMinuteSH26;

    int SHHSHHcurrentHourSH27;
    int SHHSHHcurrentMinuteSH27;
    int futureHourSH27;
    int futureMinuteSH27;

    int SHHSHHcurrentHourSH28;
    int SHHSHHcurrentMinuteSH28;
    int futureHourSH28;
    int futureMinuteSH28;

    int SHHSHHcurrentHourSH29;
    int SHHSHHcurrentMinuteSH29;
    int futureHourSH29;
    int futureMinuteSH29;

    int SHHSHHcurrentHourSH30;
    int SHHSHHcurrentMinuteSH30;
    int futureHourSH30;
    int futureMinuteSH30;

    int SHHSHHcurrentHourSH31;
    int SHHSHHcurrentMinuteSH31;
    int futureHourSH31;
    int futureMinuteSH31;

    int SHHSHHcurrentHourSH32;
    int SHHSHHcurrentMinuteSH32;
    int futureHourSH32;
    int futureMinuteSH32;

    int SHHSHHcurrentHourSH33;
    int SHHSHHcurrentMinuteSH33;
    int futureHourSH33;
    int futureMinuteSH33;


    int SHHcurrentHour1;
    int SHHcurrentMinute1;

    int SHHcurrentHour2;
    int SHHcurrentMinute2;

    int SHHcurrentHour3;
    int SHHcurrentMinute3;

    int SHHcurrentHour4;
    int SHHcurrentMinute4;

    int SHHcurrentHour5;
    int SHHcurrentMinute5;



    int SHHcurrentHour7;
    int SHHcurrentMinute7;



    int SHHcurrentHour66;
    int SHHcurrentMinute66;


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
        setContentView(R.layout.activity_sph);
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

        btnTimerSH101 = findViewById(R.id.SHHbuttonSHH101);
        btnTimerSH101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH101) {
                    showConfirmationDialogForButton101();
                    updateButtonColor101(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH101) {
                    if (secSH101 < SHHblueThreshold101) {
                        updateButtonColor101();
                        showConfirmationDialogYNForButton101();
                    } else if (SHHblueThreshold101 <= secSH101 && secSH101 < SHHyellowThreshold101) {
                        if (!flashingSH101) {
                            flashingSH101 = true; // 停止蓝色闪烁
                            updateButtonColor101();
                        } else if (flashingSH101) {
                            updateButtonColor101();
                            showConfirmationDialogYNForButton101();
                        }

                    } else if (SHHyellowThreshold101 <= secSH101 && secSH101 < SHHredThreshold101) {
                        if (!flashinggSH101) {
                            flashinggSH101 = true; // 停止黄色闪烁
                            updateButtonColor101();
                        } else if (flashinggSH101) {
                            updateButtonColor101();
                            showConfirmationDialogYNForButton101();
                        }

                    } else if (secSH101 >= SHHredThreshold101) {
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

        btnTimerSH102 = findViewById(R.id.SHHbuttonSHH102);
        btnTimerSH102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH102) {
                    showConfirmationDialogForButton102();
                    updateButtonColor102(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH102) {
                    if (secSH102 < SHHblueThreshold102) {
                        updateButtonColor102();
                        showConfirmationDialogYNForButton102();
                    } else if (SHHblueThreshold102 <= secSH102 && secSH102 < SHHyellowThreshold102) {
                        if (!flashingSH102) {
                            flashingSH102 = true; // 停止蓝色闪烁
                            updateButtonColor102();
                        } else if (flashingSH102) {
                            updateButtonColor102();
                            showConfirmationDialogYNForButton102();
                        }

                    } else if (SHHyellowThreshold102 <= secSH102 && secSH102 < SHHredThreshold102) {
                        if (!flashinggSH102) {
                            flashinggSH102 = true; // 停止黄色闪烁
                            updateButtonColor102();
                        } else if (flashinggSH102) {
                            updateButtonColor102();
                            showConfirmationDialogYNForButton102();
                        }

                    } else if (secSH102 >= SHHredThreshold102) {
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
        btnTimerSH103 = findViewById(R.id.SHHbuttonSHH103);
        btnTimerSH103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH103) {
                    showConfirmationDialogForButton103();
                    updateButtonColor103(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH103) {
                    if (secSH103 < SHHblueThreshold103) {
                        updateButtonColor103();
                        showConfirmationDialogYNForButton103();
                    } else if (SHHblueThreshold103 <= secSH103 && secSH103 < SHHyellowThreshold103) {
                        if (!flashingSH103) {
                            flashingSH103 = true; // 停止蓝色闪烁
                            updateButtonColor103();
                        } else if (flashingSH103) {
                            updateButtonColor103();
                            showConfirmationDialogYNForButton103();
                        }

                    } else if (SHHyellowThreshold103 <= secSH103 && secSH103 < SHHredThreshold103) {
                        if (!flashinggSH103) {
                            flashinggSH103 = true; // 停止黄色闪烁
                            updateButtonColor103();
                        } else if (flashinggSH103) {
                            updateButtonColor103();
                            showConfirmationDialogYNForButton103();
                        }

                    } else if (secSH103 >= SHHredThreshold103) {
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
        btnTimerSH104 = findViewById(R.id.SHHbuttonSHH104);
        btnTimerSH104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH104) {
                    showConfirmationDialogForButton104();
                    updateButtonColor104(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH104) {
                    if (secSH104 < SHHblueThreshold104) {
                        updateButtonColor104();
                        showConfirmationDialogYNForButton104();
                    } else if (SHHblueThreshold104 <= secSH104 && secSH104 < SHHyellowThreshold104) {
                        if (!flashingSH104) {
                            flashingSH104 = true; // 停止蓝色闪烁
                            updateButtonColor104();
                        } else if (flashingSH104) {
                            updateButtonColor104();
                            showConfirmationDialogYNForButton104();
                        }

                    } else if (SHHyellowThreshold104 <= secSH104 && secSH104 < SHHredThreshold104) {
                        if (!flashinggSH104) {
                            flashinggSH104 = true; // 停止黄色闪烁
                            updateButtonColor104();
                        } else if (flashinggSH104) {
                            updateButtonColor104();
                            showConfirmationDialogYNForButton104();
                        }

                    } else if (secSH104 >= SHHredThreshold104) {
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
        btnTimerSH105 = findViewById(R.id.SHHbuttonSHH105);
        btnTimerSH105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH105) {
                    showConfirmationDialogForButton105();
                    updateButtonColor105(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH105) {
                    if (secSH105 < SHHblueThreshold105) {
                        updateButtonColor105();
                        showConfirmationDialogYNForButton105();
                    } else if (SHHblueThreshold105 <= secSH105 && secSH105 < SHHyellowThreshold105) {
                        if (!flashingSH105) {
                            flashingSH105 = true; // 停止蓝色闪烁
                            updateButtonColor105();
                        } else if (flashingSH105) {
                            updateButtonColor105();
                            showConfirmationDialogYNForButton105();
                        }

                    } else if (SHHyellowThreshold105 <= secSH105 && secSH105 < SHHredThreshold105) {
                        if (!flashinggSH105) {
                            flashinggSH105 = true; // 停止黄色闪烁
                            updateButtonColor105();
                        } else if (flashinggSH105) {
                            updateButtonColor105();
                            showConfirmationDialogYNForButton105();
                        }

                    } else if (secSH105 >= SHHredThreshold105) {
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
        btnTimerSH106 = findViewById(R.id.SHHbuttonSHH106);
        btnTimerSH106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH106) {
                    showConfirmationDialogForButton106();
                    updateButtonColor106(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH106) {
                    if (secSH106 < SHHblueThreshold106) {
                        updateButtonColor106();
                        showConfirmationDialogYNForButton106();
                    } else if (SHHblueThreshold106 <= secSH106 && secSH106 < SHHyellowThreshold106) {
                        if (!flashingSH106) {
                            flashingSH106 = true; // 停止蓝色闪烁
                            updateButtonColor106();
                        } else if (flashingSH106) {
                            updateButtonColor106();
                            showConfirmationDialogYNForButton106();
                        }

                    } else if (SHHyellowThreshold106 <= secSH106 && secSH106 < SHHredThreshold106) {
                        if (!flashinggSH106) {
                            flashinggSH106 = true; // 停止黄色闪烁
                            updateButtonColor106();
                        } else if (flashinggSH106) {
                            updateButtonColor106();
                            showConfirmationDialogYNForButton106();
                        }

                    } else if (secSH106 >= SHHredThreshold106) {
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
        btnTimerSH107 = findViewById(R.id.SHHbuttonSHH107);
        btnTimerSH107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH107) {
                    showConfirmationDialogForButton107();
                    updateButtonColor107(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH107) {
                    if (secSH107 < SHHblueThreshold107) {
                        updateButtonColor107();
                        showConfirmationDialogYNForButton107();
                    } else if (SHHblueThreshold107 <= secSH107 && secSH107 < SHHyellowThreshold107) {
                        if (!flashingSH107) {
                            flashingSH107 = true; // 停止蓝色闪烁
                            updateButtonColor107();
                        } else if (flashingSH107) {
                            updateButtonColor107();
                            showConfirmationDialogYNForButton107();
                        }

                    } else if (SHHyellowThreshold107 <= secSH107 && secSH107 < SHHredThreshold107) {
                        if (!flashinggSH107) {
                            flashinggSH107 = true; // 停止黄色闪烁
                            updateButtonColor107();
                        } else if (flashinggSH107) {
                            updateButtonColor107();
                            showConfirmationDialogYNForButton107();
                        }

                    } else if (secSH107 >= SHHredThreshold107) {
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

        btnTimerSH8 = findViewById(R.id.SHHbuttonSHH8);
        btnTimerSH8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH8) {
                    showConfirmationDialogForButton8();
                    updateButtonColor8(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH8) {
                    if (secSH8 < SHHblueThreshold8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    } else if (SHHblueThreshold8 <= secSH8 && secSH8 < SHHyellowThreshold8) {
                        if (!flashingSH8) {
                            flashingSH8 = true; // 停止蓝色闪烁
                            updateButtonColor8();
                        } else if (flashingSH8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (SHHyellowThreshold8 <= secSH8 && secSH8 < SHHredThreshold8) {
                        if (!flashinggSH8) {
                            flashinggSH8 = true; // 停止黄色闪烁
                            updateButtonColor8();
                        } else if (flashinggSH8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (secSH8 >= SHHredThreshold8) {
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
        btnTimerSH9 = findViewById(R.id.SHHbuttonSHH9);
        btnTimerSH9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH9) {
                    showConfirmationDialogForButton9();
                    updateButtonColor9(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH9) {
                    if (secSH9 < SHHblueThreshold9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    } else if (SHHblueThreshold9 <= secSH9 && secSH9 < SHHyellowThreshold9) {
                        if (!flashingSH9) {
                            flashingSH9 = true; // 停止蓝色闪烁
                            updateButtonColor9();
                        } else if (flashingSH9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (SHHyellowThreshold9 <= secSH9 && secSH9 < SHHredThreshold9) {
                        if (!flashinggSH9) {
                            flashinggSH9 = true; // 停止黄色闪烁
                            updateButtonColor9();
                        } else if (flashinggSH9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (secSH9 >= SHHredThreshold9) {
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
        btnTimerSH10 = findViewById(R.id.SHHbuttonSHH10);
        btnTimerSH10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH10) {
                    showConfirmationDialogForButton10();
                    updateButtonColor10(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH10) {
                    if (secSH10 < SHHblueThreshold10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    } else if (SHHblueThreshold10 <= secSH10 && secSH10 < SHHyellowThreshold10) {
                        if (!flashingSH10) {
                            flashingSH10 = true; // 停止蓝色闪烁
                            updateButtonColor10();
                        } else if (flashingSH10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (SHHyellowThreshold10 <= secSH10 && secSH10 < SHHredThreshold10) {
                        if (!flashinggSH10) {
                            flashinggSH10 = true; // 停止黄色闪烁
                            updateButtonColor10();
                        } else if (flashinggSH10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (secSH10 >= SHHredThreshold10) {
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
        btnTimerSH11 = findViewById(R.id.SHHbuttonSHH11);
        btnTimerSH11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH11) {
                    showConfirmationDialogForButton11();
                    updateButtonColor11(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH11) {
                    if (secSH11 < SHHblueThreshold11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    } else if (SHHblueThreshold11 <= secSH11 && secSH11 < SHHyellowThreshold11) {
                        if (!flashingSH11) {
                            flashingSH11 = true; // 停止蓝色闪烁
                            updateButtonColor11();
                        } else if (flashingSH11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (SHHyellowThreshold11 <= secSH11 && secSH11 < SHHredThreshold11) {
                        if (!flashinggSH11) {
                            flashinggSH11 = true; // 停止黄色闪烁
                            updateButtonColor11();
                        } else if (flashinggSH11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (secSH11 >= SHHredThreshold11) {
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
        btnTimerSH12 = findViewById(R.id.SHHbuttonSHH12);
        btnTimerSH12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH12) {
                    showConfirmationDialogForButton12();
                    updateButtonColor12(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH12) {
                    if (secSH12 < SHHblueThreshold12) {
                        updateButtonColor12();
                        showConfirmationDialogYNForButton12();
                    } else if (SHHblueThreshold12 <= secSH12 && secSH12 < SHHyellowThreshold12) {
                        if (!flashingSH12) {
                            flashingSH12 = true; // 停止蓝色闪烁
                            updateButtonColor12();
                        } else if (flashingSH12) {
                            updateButtonColor12();
                            showConfirmationDialogYNForButton12();
                        }

                    } else if (SHHyellowThreshold12 <= secSH12 && secSH12 < SHHredThreshold12) {
                        if (!flashinggSH12) {
                            flashinggSH12 = true; // 停止黄色闪烁
                            updateButtonColor12();
                        } else if (flashinggSH12) {
                            updateButtonColor12();
                            showConfirmationDialogYNForButton12();
                        }

                    } else if (secSH12 >= SHHredThreshold12) {
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

        btnTimerSH13 = findViewById(R.id.SHHbuttonSHH13);
        btnTimerSH13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH13) {
                    showConfirmationDialogForButton13();
                    updateButtonColor13(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH13) {
                    if (secSH13 < SHHblueThreshold13) {
                        updateButtonColor13();
                        showConfirmationDialogYNForButton13();
                    } else if (SHHblueThreshold13 <= secSH13 && secSH13 < SHHyellowThreshold13) {
                        if (!flashingSH13) {
                            flashingSH13 = true; // 停止蓝色闪烁
                            updateButtonColor13();
                        } else if (flashingSH13) {
                            updateButtonColor13();
                            showConfirmationDialogYNForButton13();
                        }

                    } else if (SHHyellowThreshold13 <= secSH13 && secSH13 < SHHredThreshold13) {
                        if (!flashinggSH13) {
                            flashinggSH13 = true; // 停止黄色闪烁
                            updateButtonColor13();
                        } else if (flashinggSH13) {
                            updateButtonColor13();
                            showConfirmationDialogYNForButton13();
                        }

                    } else if (secSH13 >= SHHredThreshold13) {
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
        btnTimerSH14 = findViewById(R.id.SHHbuttonSHH14);
        btnTimerSH14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH14) {
                    showConfirmationDialogForButton14();
                    updateButtonColor14(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH14) {
                    if (secSH14 < SHHblueThreshold14) {
                        updateButtonColor14();
                        showConfirmationDialogYNForButton14();
                    } else if (SHHblueThreshold14 <= secSH14 && secSH14 < SHHyellowThreshold14) {
                        if (!flashingSH14) {
                            flashingSH14 = true; // 停止蓝色闪烁
                            updateButtonColor14();
                        } else if (flashingSH14) {
                            updateButtonColor14();
                            showConfirmationDialogYNForButton14();
                        }

                    } else if (SHHyellowThreshold14 <= secSH14 && secSH14 < SHHredThreshold14) {
                        if (!flashinggSH14) {
                            flashinggSH14 = true; // 停止黄色闪烁
                            updateButtonColor14();
                        } else if (flashinggSH14) {
                            updateButtonColor14();
                            showConfirmationDialogYNForButton14();
                        }

                    } else if (secSH14 >= SHHredThreshold14) {
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
        btnTimerSH15 = findViewById(R.id.SHHbuttonSHH15);
        btnTimerSH15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH15) {
                    showConfirmationDialogForButton15();
                    updateButtonColor15(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH15) {
                    if (secSH15 < SHHblueThreshold15) {
                        updateButtonColor15();
                        showConfirmationDialogYNForButton15();
                    } else if (SHHblueThreshold15 <= secSH15 && secSH15 < SHHyellowThreshold15) {
                        if (!flashingSH15) {
                            flashingSH15 = true; // 停止蓝色闪烁
                            updateButtonColor15();
                        } else if (flashingSH15) {
                            updateButtonColor15();
                            showConfirmationDialogYNForButton15();
                        }

                    } else if (SHHyellowThreshold15 <= secSH15 && secSH15 < SHHredThreshold15) {
                        if (!flashinggSH15) {
                            flashinggSH15 = true; // 停止黄色闪烁
                            updateButtonColor15();
                        } else if (flashinggSH15) {
                            updateButtonColor15();
                            showConfirmationDialogYNForButton15();
                        }

                    } else if (secSH15 >= SHHredThreshold15) {
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
        btnTimerSH16 = findViewById(R.id.SHHbuttonSHH16);
        btnTimerSH16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH16) {
                    showConfirmationDialogForButton16();
                    updateButtonColor16(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH16) {
                    if (secSH16 < SHHblueThreshold16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    } else if (SHHblueThreshold16 <= secSH16 && secSH16 < SHHyellowThreshold16) {
                        if (!flashingSH16) {
                            flashingSH16 = true; // 停止蓝色闪烁
                            updateButtonColor16();
                        } else if (flashingSH16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (SHHyellowThreshold16 <= secSH16 && secSH16 < SHHredThreshold16) {
                        if (!flashinggSH16) {
                            flashinggSH16 = true; // 停止黄色闪烁
                            updateButtonColor16();
                        } else if (flashinggSH16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (secSH16 >= SHHredThreshold16) {
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
        btnTimerSH17 = findViewById(R.id.SHHbuttonSHH17);
        btnTimerSH17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH17) {
                    showConfirmationDialogForButton17();
                    updateButtonColor17(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH17) {
                    if (secSH17 < SHHblueThreshold17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    } else if (SHHblueThreshold17 <= secSH17 && secSH17 < SHHyellowThreshold17) {
                        if (!flashingSH17) {
                            flashingSH17 = true; // 停止蓝色闪烁
                            updateButtonColor17();
                        } else if (flashingSH17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (SHHyellowThreshold17 <= secSH17 && secSH17 < SHHredThreshold17) {
                        if (!flashinggSH17) {
                            flashinggSH17 = true; // 停止黄色闪烁
                            updateButtonColor17();
                        } else if (flashinggSH17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (secSH17 >= SHHredThreshold17) {
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

        btnTimerSH18 = findViewById(R.id.SHHbuttonSHH18);
        btnTimerSH18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH18) {
                    showConfirmationDialogForButton18();
                    updateButtonColor18(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH18) {
                    if (secSH18 < SHHblueThreshold18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    } else if (SHHblueThreshold18 <= secSH18 && secSH18 < SHHyellowThreshold18) {
                        if (!flashingSH18) {
                            flashingSH18 = true; // 停止蓝色闪烁
                            updateButtonColor18();
                        } else if (flashingSH18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (SHHyellowThreshold18 <= secSH18 && secSH18 < SHHredThreshold18) {
                        if (!flashinggSH18) {
                            flashinggSH18 = true; // 停止黄色闪烁
                            updateButtonColor18();
                        } else if (flashinggSH18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (secSH18 >= SHHredThreshold18) {
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
        btnTimerSH19 = findViewById(R.id.SHHbuttonSHH19);
        btnTimerSH19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH19) {
                    showConfirmationDialogForButton19();
                    updateButtonColor19(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH19) {
                    if (secSH19 < SHHblueThreshold19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    } else if (SHHblueThreshold19 <= secSH19 && secSH19 < SHHyellowThreshold19) {
                        if (!flashingSH19) {
                            flashingSH19 = true; // 停止蓝色闪烁
                            updateButtonColor19();
                        } else if (flashingSH19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (SHHyellowThreshold19 <= secSH19 && secSH19 < SHHredThreshold19) {
                        if (!flashinggSH19) {
                            flashinggSH19 = true; // 停止黄色闪烁
                            updateButtonColor19();
                        } else if (flashinggSH19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (secSH19 >= SHHredThreshold19) {
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
        btnTimerSH20 = findViewById(R.id.SHHbuttonSHH20);
        btnTimerSH20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH20) {
                    showConfirmationDialogForButton20();
                    updateButtonColor20(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH20) {
                    if (secSH20 < SHHblueThreshold20) {
                        updateButtonColor20();
                        showConfirmationDialogYNForButton20();
                    } else if (SHHblueThreshold20 <= secSH20 && secSH20 < SHHyellowThreshold20) {
                        if (!flashingSH20) {
                            flashingSH20 = true; // 停止蓝色闪烁
                            updateButtonColor20();
                        } else if (flashingSH20) {
                            updateButtonColor20();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (SHHyellowThreshold20 <= secSH20 && secSH20 < SHHredThreshold20) {
                        if (!flashinggSH20) {
                            flashinggSH20 = true; // 停止黄色闪烁
                            updateButtonColor20();
                        } else if (flashinggSH20) {
                            updateButtonColor20();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (secSH20 >= SHHredThreshold20) {
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
        btnTimerSH21 = findViewById(R.id.SHHbuttonSHH21);
        btnTimerSH21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH21) {
                    showConfirmationDialogForButton21();
                    updateButtonColor21(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH21) {
                    if (secSH21 < SHHblueThreshold21) {
                        updateButtonColor21();
                        showConfirmationDialogYNForButton21();
                    } else if (SHHblueThreshold21 <= secSH21 && secSH21 < SHHyellowThreshold21) {
                        if (!flashingSH21) {
                            flashingSH21 = true; // 停止蓝色闪烁
                            updateButtonColor21();
                        } else if (flashingSH21) {
                            updateButtonColor21();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (SHHyellowThreshold21 <= secSH21 && secSH21 < SHHredThreshold21) {
                        if (!flashinggSH21) {
                            flashinggSH21 = true; // 停止黄色闪烁
                            updateButtonColor21();
                        } else if (flashinggSH21) {
                            updateButtonColor21();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (secSH21 >= SHHredThreshold21) {
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
        btnTimerSH22 = findViewById(R.id.SHHbuttonSHH22);
        btnTimerSH22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH22) {
                    showConfirmationDialogForButton22();
                    updateButtonColor22(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH22) {
                    if (secSH22 < SHHblueThreshold22) {
                        updateButtonColor22();
                        showConfirmationDialogYNForButton22();
                    } else if (SHHblueThreshold22 <= secSH22 && secSH22 < SHHyellowThreshold22) {
                        if (!flashingSH22) {
                            flashingSH22 = true; // 停止蓝色闪烁
                            updateButtonColor22();
                        } else if (flashingSH22) {
                            updateButtonColor22();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (SHHyellowThreshold22 <= secSH22 && secSH22 < SHHredThreshold22) {
                        if (!flashinggSH22) {
                            flashinggSH22 = true; // 停止黄色闪烁
                            updateButtonColor22();
                        } else if (flashinggSH22) {
                            updateButtonColor22();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (secSH22 >= SHHredThreshold22) {
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

        btnTimerSH23 = findViewById(R.id.SHHbuttonSHH23);
        btnTimerSH23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH23) {
                    showConfirmationDialogForButton23();
                    updateButtonColor23(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH23) {
                    if (secSH23 < SHHblueThreshold23) {
                        updateButtonColor23();
                        showConfirmationDialogYNForButton23();
                    } else if (SHHblueThreshold23 <= secSH23 && secSH23 < SHHyellowThreshold23) {
                        if (!flashingSH23) {
                            flashingSH23 = true; // 停止蓝色闪烁
                            updateButtonColor23();
                        } else if (flashingSH23) {
                            updateButtonColor23();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (SHHyellowThreshold23 <= secSH23 && secSH23 < SHHredThreshold23) {
                        if (!flashinggSH23) {
                            flashinggSH23 = true; // 停止黄色闪烁
                            updateButtonColor23();
                        } else if (flashinggSH23) {
                            updateButtonColor23();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (secSH23 >= SHHredThreshold23) {
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
        btnTimerSH24 = findViewById(R.id.SHHbuttonSHH24);
        btnTimerSH24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH24) {
                    showConfirmationDialogForButton24();
                    updateButtonColor24(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH24) {
                    if (secSH24 < SHHblueThreshold24) {
                        updateButtonColor24();
                        showConfirmationDialogYNForButton24();
                    } else if (SHHblueThreshold24 <= secSH24 && secSH24 < SHHyellowThreshold24) {
                        if (!flashingSH24) {
                            flashingSH24 = true; // 停止蓝色闪烁
                            updateButtonColor24();
                        } else if (flashingSH24) {
                            updateButtonColor24();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (SHHyellowThreshold24 <= secSH24 && secSH24 < SHHredThreshold24) {
                        if (!flashinggSH24) {
                            flashinggSH24 = true; // 停止黄色闪烁
                            updateButtonColor24();
                        } else if (flashinggSH24) {
                            updateButtonColor24();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (secSH24 >= SHHredThreshold24) {
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
        btnTimerSH25 = findViewById(R.id.SHHbuttonSHH25);
        btnTimerSH25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH25) {
                    showConfirmationDialogForButton25();
                    updateButtonColor25(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH25) {
                    if (secSH25 < SHHblueThreshold25) {
                        updateButtonColor25();
                        showConfirmationDialogYNForButton25();
                    } else if (SHHblueThreshold25 <= secSH25 && secSH25 < SHHyellowThreshold25) {
                        if (!flashingSH25) {
                            flashingSH25 = true; // 停止蓝色闪烁
                            updateButtonColor25();
                        } else if (flashingSH25) {
                            updateButtonColor25();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (SHHyellowThreshold25 <= secSH25 && secSH25 < SHHredThreshold25) {
                        if (!flashinggSH25) {
                            flashinggSH25 = true; // 停止黄色闪烁
                            updateButtonColor25();
                        } else if (flashinggSH25) {
                            updateButtonColor25();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (secSH25 >= SHHredThreshold25) {
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
        btnTimerSH26 = findViewById(R.id.SHHbuttonSHH26);
        btnTimerSH26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH26) {
                    showConfirmationDialogForButton26();
                    updateButtonColor26(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH26) {
                    if (secSH26 < SHHblueThreshold26) {
                        updateButtonColor26();
                        showConfirmationDialogYNForButton26();
                    } else if (SHHblueThreshold26 <= secSH26 && secSH26 < SHHyellowThreshold26) {
                        if (!flashingSH26) {
                            flashingSH26 = true; // 停止蓝色闪烁
                            updateButtonColor26();
                        } else if (flashingSH26) {
                            updateButtonColor26();
                            showConfirmationDialogYNForButton26();
                        }

                    } else if (SHHyellowThreshold26 <= secSH26 && secSH26 < SHHredThreshold26) {
                        if (!flashinggSH26) {
                            flashinggSH26 = true; // 停止黄色闪烁
                            updateButtonColor26();
                        } else if (flashinggSH26) {
                            updateButtonColor26();
                            showConfirmationDialogYNForButton26();
                        }

                    } else if (secSH26 >= SHHredThreshold26) {
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
        btnTimerSH27 = findViewById(R.id.SHHbuttonSHH27);
        btnTimerSH27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH27) {
                    showConfirmationDialogForButton27();
                    updateButtonColor27(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH27) {
                    if (secSH27 < SHHblueThreshold27) {
                        updateButtonColor27();
                        showConfirmationDialogYNForButton27();
                    } else if (SHHblueThreshold27 <= secSH27 && secSH27 < SHHyellowThreshold27) {
                        if (!flashingSH27) {
                            flashingSH27 = true; // 停止蓝色闪烁
                            updateButtonColor27();
                        } else if (flashingSH27) {
                            updateButtonColor27();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (SHHyellowThreshold27 <= secSH27 && secSH27 < SHHredThreshold27) {
                        if (!flashinggSH27) {
                            flashinggSH27 = true; // 停止黄色闪烁
                            updateButtonColor27();
                        } else if (flashinggSH27) {
                            updateButtonColor27();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (secSH27 >= SHHredThreshold27) {
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

        btnTimerSH28 = findViewById(R.id.SHHbuttonSHH28);
        btnTimerSH28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH28) {
                    showConfirmationDialogForButton28();
                    updateButtonColor28(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH28) {
                    if (secSH28 < SHHblueThreshold28) {
                        updateButtonColor28();
                        showConfirmationDialogYNForButton28();
                    } else if (SHHblueThreshold28 <= secSH28 && secSH28 < SHHyellowThreshold28) {
                        if (!flashingSH28) {
                            flashingSH28 = true; // 停止蓝色闪烁
                            updateButtonColor28();
                        } else if (flashingSH28) {
                            updateButtonColor28();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (SHHyellowThreshold28 <= secSH28 && secSH28 < SHHredThreshold28) {
                        if (!flashinggSH28) {
                            flashinggSH28 = true; // 停止黄色闪烁
                            updateButtonColor28();
                        } else if (flashinggSH28) {
                            updateButtonColor28();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (secSH28 >= SHHredThreshold28) {
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
        btnTimerSH29 = findViewById(R.id.SHHbuttonSHH29);
        btnTimerSH29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH29) {
                    showConfirmationDialogForButton29();
                    updateButtonColor29(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH29) {
                    if (secSH29 < SHHblueThreshold29) {
                        updateButtonColor29();
                        showConfirmationDialogYNForButton29();
                    } else if (SHHblueThreshold29 <= secSH29 && secSH29 < SHHyellowThreshold29) {
                        if (!flashingSH29) {
                            flashingSH29 = true; // 停止蓝色闪烁
                            updateButtonColor29();
                        } else if (flashingSH29) {
                            updateButtonColor29();
                            showConfirmationDialogYNForButton29();
                        }

                    } else if (SHHyellowThreshold29 <= secSH29 && secSH29 < SHHredThreshold29) {
                        if (!flashinggSH29) {
                            flashinggSH29 = true; // 停止黄色闪烁
                            updateButtonColor29();
                        } else if (flashinggSH29) {
                            updateButtonColor29();
                            showConfirmationDialogYNForButton29();
                        }

                    } else if (secSH29 >= SHHredThreshold29) {
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
        btnTimerSH30 = findViewById(R.id.SHHbuttonSHH30);
        btnTimerSH30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH30) {
                    showConfirmationDialogForButton30();
                    updateButtonColor30(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH30) {
                    if (secSH30 < SHHblueThreshold30) {
                        updateButtonColor30();
                        showConfirmationDialogYNForButton30();
                    } else if (SHHblueThreshold30 <= secSH30 && secSH30 < SHHyellowThreshold30) {
                        if (!flashingSH30) {
                            flashingSH30 = true; // 停止蓝色闪烁
                            updateButtonColor30();
                        } else if (flashingSH30) {
                            updateButtonColor30();
                            showConfirmationDialogYNForButton30();
                        }

                    } else if (SHHyellowThreshold30 <= secSH30 && secSH30 < SHHredThreshold30) {
                        if (!flashinggSH30) {
                            flashinggSH30 = true; // 停止黄色闪烁
                            updateButtonColor30();
                        } else if (flashinggSH30) {
                            updateButtonColor30();
                            showConfirmationDialogYNForButton30();
                        }

                    } else if (secSH30 >= SHHredThreshold30) {
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
        btnTimerSH31 = findViewById(R.id.SHHbuttonSHH31);
        btnTimerSH31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH31) {
                    showConfirmationDialogForButton31();
                    updateButtonColor31(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH31) {
                    if (secSH31 < SHHblueThreshold31) {
                        updateButtonColor31();
                        showConfirmationDialogYNForButton31();
                    } else if (SHHblueThreshold31 <= secSH31 && secSH31 < SHHyellowThreshold31) {
                        if (!flashingSH31) {
                            flashingSH31 = true; // 停止蓝色闪烁
                            updateButtonColor31();
                        } else if (flashingSH31) {
                            updateButtonColor31();
                            showConfirmationDialogYNForButton31();
                        }

                    } else if (SHHyellowThreshold31 <= secSH31 && secSH31 < SHHredThreshold31) {
                        if (!flashinggSH31) {
                            flashinggSH31 = true; // 停止黄色闪烁
                            updateButtonColor31();
                        } else if (flashinggSH31) {
                            updateButtonColor31();
                            showConfirmationDialogYNForButton31();
                        }

                    } else if (secSH31 >= SHHredThreshold31) {
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
        btnTimerSH32 = findViewById(R.id.SHHbuttonSHH32);
        btnTimerSH32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH32) {
                    showConfirmationDialogForButton32();
                    updateButtonColor32(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH32) {
                    if (secSH32 < SHHblueThreshold32) {
                        updateButtonColor32();
                        showConfirmationDialogYNForButton32();
                    } else if (SHHblueThreshold32 <= secSH32 && secSH32 < SHHyellowThreshold32) {
                        if (!flashingSH32) {
                            flashingSH32 = true; // 停止蓝色闪烁
                            updateButtonColor32();
                        } else if (flashingSH32) {
                            updateButtonColor32();
                            showConfirmationDialogYNForButton32();
                        }

                    } else if (SHHyellowThreshold32 <= secSH32 && secSH32 < SHHredThreshold32) {
                        if (!flashinggSH32) {
                            flashinggSH32 = true; // 停止黄色闪烁
                            updateButtonColor32();
                        } else if (flashinggSH32) {
                            updateButtonColor32();
                            showConfirmationDialogYNForButton32();
                        }

                    } else if (secSH32 >= SHHredThreshold32) {
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

        btnTimerSH33 = findViewById(R.id.SHHbuttonSHH33);
        btnTimerSH33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHSHHisTimerRunningSH33) {
                    showConfirmationDialogForButton33();
                    updateButtonColor33(); // 更新颜色
                } else if (SHHSHHisTimerRunningSH33) {
                    if (secSH33 < SHHblueThreshold33) {
                        updateButtonColor33();
                        showConfirmationDialogYNForButton33();
                    } else if (SHHblueThreshold33 <= secSH33 && secSH33 < SHHyellowThreshold33) {
                        if (!flashingSH33) {
                            flashingSH33 = true; // 停止蓝色闪烁
                            updateButtonColor33();
                        } else if (flashingSH33) {
                            updateButtonColor33();
                            showConfirmationDialogYNForButton33();
                        }

                    } else if (SHHyellowThreshold33 <= secSH33 && secSH33 < SHHredThreshold33) {
                        if (!flashinggSH33) {
                            flashinggSH33 = true; // 停止黄色闪烁
                            updateButtonColor33();
                        } else if (flashinggSH33) {
                            updateButtonColor33();
                            showConfirmationDialogYNForButton33();
                        }

                    } else if (secSH33 >= SHHredThreshold33) {
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
        btnTimer1 = findViewById(R.id.Button1);
        btnTimer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning1){
                    showConfirmationDialogForButton1();
                    updateButtonColor1(); // 更新颜色
                } else if (SHHisTimerRunning1) {
                    if (sec1 < SHHblueThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    } else if (SHHblueThreshold1 <= sec1  && sec1 < SHHyellowThreshold1  ) {
                        if(!flashing1){
                            flashing1 = true; // 停止蓝色闪烁
                            updateButtonColor1();
                        } else if (flashing1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (SHHyellowThreshold1 <= sec1  && sec1 < SHHredThreshold1) {
                        if(!flashingg1){
                            flashingg1 = true; // 停止黄色闪烁
                            updateButtonColor1();
                        } else if (flashingg1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (sec1 >= SHHredThreshold1) {
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

        btnTimer2 = findViewById(R.id.Button89);
        btnTimer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning2){
                    showConfirmationDialogForButton2();
                    updateButtonColor2(); // 更新颜色
                } else if (SHHisTimerRunning2) {
                    if (sec2 < SHHblueThreshold2) {
                        updateButtonColor2();
                        showConfirmationDialogYNForButton2();
                    } else if (SHHblueThreshold2 <= sec2  && sec2 < SHHyellowThreshold2  ) {
                        if(!flashing2){
                            flashing2 = true; // 停止蓝色闪烁
                            updateButtonColor2();
                        } else if (flashing2) {
                            updateButtonColor2();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (SHHyellowThreshold2 <= sec2  && sec2 < SHHredThreshold2) {
                        if(!flashingg2){
                            flashingg2 = true; // 停止黄色闪烁
                            updateButtonColor2();
                        } else if (flashingg2) {
                            updateButtonColor2();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (sec2 >= SHHredThreshold2) {
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


        btnTimer3 = findViewById(R.id.Button3);
        btnTimer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning3){
                    showConfirmationDialogForButton3();
                    updateButtonColor3(); // 更新颜色
                } else if (SHHisTimerRunning3) {
                    if (sec3 < SHHblueThreshold3) {
                        updateButtonColor3();
                        showConfirmationDialogYNForButton3();
                    } else if (SHHblueThreshold3 <= sec3  && sec3 < SHHyellowThreshold3  ) {
                        if(!flashing3){
                            flashing3 = true; // 停止蓝色闪烁
                            updateButtonColor3();
                        } else if (flashing3) {
                            updateButtonColor3();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (SHHyellowThreshold3 <= sec3  && sec3 < SHHredThreshold3) {
                        if(!flashingg3){
                            flashingg3 = true; // 停止黄色闪烁
                            updateButtonColor3();
                        } else if (flashingg3) {
                            updateButtonColor3();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (sec3 >= SHHredThreshold3) {
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

        btnTimer4 = findViewById(R.id.Button4);
        btnTimer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning4){
                    showConfirmationDialogForButton4();
                    updateButtonColor4(); // 更新颜色
                } else if (SHHisTimerRunning4) {
                    if (sec4 < SHHblueThreshold4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    } else if (SHHblueThreshold4 <= sec4  && sec4 < SHHyellowThreshold4  ) {
                        if(!flashing4){
                            flashing4 = true; // 停止蓝色闪烁
                            updateButtonColor4();
                        } else if (flashing4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (SHHyellowThreshold4 <= sec4  && sec4 < SHHredThreshold4) {
                        if(!flashingg4){
                            flashingg4 = true; // 停止黄色闪烁
                            updateButtonColor4();
                        } else if (flashingg4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (sec4 >= SHHredThreshold4) {
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

        btnTimer5 = findViewById(R.id.Button5);
        btnTimer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning5){
                    showConfirmationDialogForButton5();
                    //SHHisTimerRunning5 = true;
                    updateButtonColor5(); // 更新颜色
                } else if (SHHisTimerRunning5) {
                    if (sec5 < SHHblueThreshold5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    } else if (SHHblueThreshold5 <= sec5  && sec5 < SHHyellowThreshold5  ) {
                        if(!flashing5){
                            flashing5 = true; // 停止蓝色闪烁
                            updateButtonColor5();
                        } else if (flashing5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (SHHyellowThreshold5 <= sec5  && sec5 < SHHredThreshold5) {
                        if(!flashingg5){
                            flashingg5 = true; // 停止黄色闪烁
                            updateButtonColor5();
                        } else if (flashingg5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (sec5 >= SHHredThreshold5) {
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





        btnTimer7 = findViewById(R.id.Button7);
        btnTimer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning7){
                    showConfirmationDialogForButton7();
                    //SHHisTimerRunning7 = true;
                    updateButtonColor7(); // 更新颜色
                } else if (SHHisTimerRunning7) {
                    if (sec7 < SHHblueThreshold7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    } else if (SHHblueThreshold7 <= sec7  && sec7 < SHHyellowThreshold7  ) {
                        if(!flashing7){
                            flashing7 = true; // 停止蓝色闪烁
                            updateButtonColor7();
                        } else if (flashing7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (SHHyellowThreshold7 <= sec7  && sec7 < SHHredThreshold7) {
                        if(!flashingg7){
                            flashingg7 = true; // 停止黄色闪烁
                            updateButtonColor7();
                        } else if (flashingg7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (sec7 >= SHHredThreshold7) {
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


        btnTimer66 = findViewById(R.id.Button6);
        btnTimer66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SHHisTimerRunning66){
                    showConfirmationDialogForButton66();
                    //SHHisTimerRunning66 = true;
                    updateButtonColor66(); // 更新颜色
                } else if (SHHisTimerRunning66) {
                    if (sec66 < SHHblueThreshold66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    } else if (SHHblueThreshold66 <= sec66  && sec66 < SHHyellowThreshold66  ) {
                        if(!flashing66){
                            flashing66 = true; // 停止蓝色闪烁
                            updateButtonColor66();
                        } else if (flashing66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (SHHyellowThreshold66 <= sec66  && sec66 < SHHredThreshold66) {
                        if(!flashingg66){
                            flashingg66 = true; // 停止黄色闪烁
                            updateButtonColor66();
                        } else if (flashingg66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (sec66 >= SHHredThreshold66) {
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
            editorSH101.putBoolean(SHHSHHtimer_started_KEY_SH101, handlerSH.hasCallbacks(updateTimerThread101));
            editorSH101.putLong(SHHSHHSHHstart_time_KEY_SH101, startTimeSH101);
            editorSH101.putLong(SHHSHHSHHelapsed_time_KEY_SH101, timeInMillisecondsSH101);
            editorSH101.putBoolean("SHHpeople_key101", peopleSH_101);
            editorSH101.putBoolean("SHHflashing_key101", flashingSH101);
            editorSH101.putBoolean("SHHflashingg_key101", flashinggSH101);
            editorSH101.putBoolean("SHHSHHisTimerRunningSH101", SHHSHHisTimerRunningSH101);
            editorSH101.putInt("SHHSHHcurrentHourSH101", SHHSHHcurrentHourSH101);
            editorSH101.putInt("SHHSHHcurrentMinuteSH101", SHHSHHcurrentMinuteSH101);
            // 保存加時時間到SharedPreferences
            editorSH101.putInt("SHHblueThreshold101", SHHblueThreshold101);
            editorSH101.putInt("SHHyellowThreshold101", SHHyellowThreshold101);
            editorSH101.putInt("SHHredThreshold101", SHHredThreshold101);
            editorSH101.apply();
        }
        synchronized (editorSH102) {
            editorSH102.putBoolean(SHHSHHtimer_started_KEY_SH102, handlerSH.hasCallbacks(updateTimerThread102));
            editorSH102.putLong(SHHSHHSHHstart_time_KEY_SH102, startTimeSH102);
            editorSH102.putLong(SHHSHHSHHelapsed_time_KEY_SH102, timeInMillisecondsSH102);
            editorSH102.putBoolean("SHHpeople_key102", peopleSH_102);
            editorSH102.putBoolean("SHHflashing_key102", flashingSH102);
            editorSH102.putBoolean("SHHflashingg_key102", flashinggSH102);
            editorSH102.putBoolean("SHHSHHisTimerRunningSH102", SHHSHHisTimerRunningSH102);
            editorSH102.putInt("SHHSHHcurrentHourSH102", SHHSHHcurrentHourSH102);
            editorSH102.putInt("SHHSHHcurrentMinuteSH102", SHHSHHcurrentMinuteSH102);
            // 保存加時時間到SharedPreferences
            editorSH102.putInt("SHHblueThreshold102", SHHblueThreshold102);
            editorSH102.putInt("SHHyellowThreshold102", SHHyellowThreshold102);
            editorSH102.putInt("SHHredThreshold102", SHHredThreshold102);
            editorSH102.apply();
        }
        synchronized (editorSH103) {
            editorSH103.putBoolean(SHHSHHtimer_started_KEY_SH103, handlerSH.hasCallbacks(updateTimerThread103));
            editorSH103.putLong(SHHSHHSHHstart_time_KEY_SH103, startTimeSH103);
            editorSH103.putLong(SHHSHHSHHelapsed_time_KEY_SH103, timeInMillisecondsSH103);
            editorSH103.putBoolean("SHHpeople_key103", peopleSH_103);
            editorSH103.putBoolean("SHHflashing_key103", flashingSH103);
            editorSH103.putBoolean("SHHflashingg_key103", flashinggSH103);
            editorSH103.putBoolean("SHHSHHisTimerRunningSH103", SHHSHHisTimerRunningSH103);
            editorSH103.putInt("SHHSHHcurrentHourSH103", SHHSHHcurrentHourSH103);
            editorSH103.putInt("SHHSHHcurrentMinuteSH103", SHHSHHcurrentMinuteSH103);
            // 保存加時時間到SharedPreferences
            editorSH103.putInt("SHHblueThreshold103", SHHblueThreshold103);
            editorSH103.putInt("SHHyellowThreshold103", SHHyellowThreshold103);
            editorSH103.putInt("SHHredThreshold103", SHHredThreshold103);
            editorSH103.apply();
        }

        synchronized (editorSH104) {
            editorSH104.putBoolean(SHHSHHtimer_started_KEY_SH104, handlerSH.hasCallbacks(updateTimerThread104));
            editorSH104.putLong(SHHSHHSHHstart_time_KEY_SH104, startTimeSH104);
            editorSH104.putLong(SHHSHHSHHelapsed_time_KEY_SH104, timeInMillisecondsSH104);
            editorSH104.putBoolean("SHHpeople_key104", peopleSH_104);
            editorSH104.putBoolean("SHHflashing_key104", flashingSH104);
            editorSH104.putBoolean("SHHflashingg_key104", flashinggSH104);
            editorSH104.putBoolean("SHHSHHisTimerRunningSH104", SHHSHHisTimerRunningSH104);
            editorSH104.putInt("SHHSHHcurrentHourSH104", SHHSHHcurrentHourSH104);
            editorSH104.putInt("SHHSHHcurrentMinuteSH104", SHHSHHcurrentMinuteSH104);
            // 保存加時時間到SharedPreferences
            editorSH104.putInt("SHHblueThreshold104", SHHblueThreshold104);
            editorSH104.putInt("SHHyellowThreshold104", SHHyellowThreshold104);
            editorSH104.putInt("SHHredThreshold104", SHHredThreshold104);
            editorSH104.apply();
        }
        synchronized (editorSH105) {
            editorSH105.putBoolean(SHHSHHtimer_started_KEY_SH105, handlerSH.hasCallbacks(updateTimerThread105));
            editorSH105.putLong(SHHSHHSHHstart_time_KEY_SH105, startTimeSH105);
            editorSH105.putLong(SHHSHHSHHelapsed_time_KEY_SH105, timeInMillisecondsSH105);
            editorSH105.putBoolean("SHHpeople_key105", peopleSH_105);
            editorSH105.putBoolean("SHHflashing_key105", flashingSH105);
            editorSH105.putBoolean("SHHflashingg_key105", flashinggSH105);
            editorSH105.putBoolean("SHHSHHisTimerRunningSH105", SHHSHHisTimerRunningSH105);
            editorSH105.putInt("SHHSHHcurrentHourSH105", SHHSHHcurrentHourSH105);
            editorSH105.putInt("SHHSHHcurrentMinuteSH105", SHHSHHcurrentMinuteSH105);
            // 保存加時時間到SharedPreferences
            editorSH105.putInt("SHHblueThreshold105", SHHblueThreshold105);
            editorSH105.putInt("SHHyellowThreshold105", SHHyellowThreshold105);
            editorSH105.putInt("SHHredThreshold105", SHHredThreshold105);
            editorSH105.apply();
        }
        synchronized (editorSH106) {
            editorSH106.putBoolean(SHHSHHtimer_started_KEY_SH106, handlerSH.hasCallbacks(updateTimerThread106));
            editorSH106.putLong(SHHSHHSHHstart_time_KEY_SH106, startTimeSH106);
            editorSH106.putLong(SHHSHHSHHelapsed_time_KEY_SH106, timeInMillisecondsSH106);
            editorSH106.putBoolean("SHHpeople_key106", peopleSH_106);
            editorSH106.putBoolean("SHHflashing_key106", flashingSH106);
            editorSH106.putBoolean("SHHflashingg_key106", flashinggSH106);
            editorSH106.putBoolean("SHHSHHisTimerRunningSH106", SHHSHHisTimerRunningSH106);
            editorSH106.putInt("SHHSHHcurrentHourSH106", SHHSHHcurrentHourSH106);
            editorSH106.putInt("SHHSHHcurrentMinuteSH106", SHHSHHcurrentMinuteSH106);
            // 保存加時時間到SharedPreferences
            editorSH106.putInt("SHHblueThreshold106", SHHblueThreshold106);
            editorSH106.putInt("SHHyellowThreshold106", SHHyellowThreshold106);
            editorSH106.putInt("SHHredThreshold106", SHHredThreshold106);
            editorSH106.apply();
        }
        synchronized (editorSH107) {
            editorSH107.putBoolean(SHHSHHtimer_started_KEY_SH107, handlerSH.hasCallbacks(updateTimerThread107));
            editorSH107.putLong(SHHSHHSHHstart_time_KEY_SH107, startTimeSH107);
            editorSH107.putLong(SHHSHHSHHelapsed_time_KEY_SH107, timeInMillisecondsSH107);
            editorSH107.putBoolean("SHHpeople_key107", peopleSH_107);
            editorSH107.putBoolean("SHHflashing_key107", flashingSH107);
            editorSH107.putBoolean("SHHflashingg_key107", flashinggSH107);
            editorSH107.putBoolean("SHHSHHisTimerRunningSH107", SHHSHHisTimerRunningSH107);
            editorSH107.putInt("SHHSHHcurrentHourSH107", SHHSHHcurrentHourSH107);
            editorSH107.putInt("SHHSHHcurrentMinuteSH107", SHHSHHcurrentMinuteSH107);
            // 保存加時時間到SharedPreferences
            editorSH107.putInt("SHHblueThreshold107", SHHblueThreshold107);
            editorSH107.putInt("SHHyellowThreshold107", SHHyellowThreshold107);
            editorSH107.putInt("SHHredThreshold107", SHHredThreshold107);
            editorSH107.apply();
        }
        synchronized (editorSH8) {
            editorSH8.putBoolean(SHHSHHtimer_started_KEY_SH8, handlerSH.hasCallbacks(updateTimerThread8));
            editorSH8.putLong(SHHSHHSHHstart_time_KEY_SH8, startTimeSH8);
            editorSH8.putLong(SHHSHHSHHelapsed_time_KEY_SH8, timeInMillisecondsSH8);
            editorSH8.putBoolean("SHHpeople_key8", peopleSH_8);
            editorSH8.putBoolean("SHHflashing_key8", flashingSH8);
            editorSH8.putBoolean("SHHflashingg_key8", flashinggSH8);
            editorSH8.putBoolean("SHHSHHisTimerRunningSH8", SHHSHHisTimerRunningSH8);
            editorSH8.putInt("SHHSHHcurrentHourSH8", SHHSHHcurrentHourSH8);
            editorSH8.putInt("SHHSHHcurrentMinuteSH8", SHHSHHcurrentMinuteSH8);
            // 保存加時時間到SharedPreferences
            editorSH8.putInt("SHHblueThreshold8", SHHblueThreshold8);
            editorSH8.putInt("SHHyellowThreshold8", SHHyellowThreshold8);
            editorSH8.putInt("SHHredThreshold8", SHHredThreshold8);
            editorSH8.apply();
        }
        synchronized (editorSH9) {
            editorSH9.putBoolean(SHHSHHtimer_started_KEY_SH9, handlerSH.hasCallbacks(updateTimerThread9));
            editorSH9.putLong(SHHSHHSHHstart_time_KEY_SH9, startTimeSH9);
            editorSH9.putLong(SHHSHHSHHelapsed_time_KEY_SH9, timeInMillisecondsSH9);
            editorSH9.putBoolean("SHHpeople_key9", peopleSH_9);
            editorSH9.putBoolean("SHHflashing_key9", flashingSH9);
            editorSH9.putBoolean("SHHflashingg_key9", flashinggSH9);
            editorSH9.putBoolean("SHHSHHisTimerRunningSH9", SHHSHHisTimerRunningSH9);
            editorSH9.putInt("SHHSHHcurrentHourSH9", SHHSHHcurrentHourSH9);
            editorSH9.putInt("SHHSHHcurrentMinuteSH9", SHHSHHcurrentMinuteSH9);
            // 保存加時時間到SharedPreferences
            editorSH9.putInt("SHHblueThreshold9", SHHblueThreshold9);
            editorSH9.putInt("SHHyellowThreshold9", SHHyellowThreshold9);
            editorSH9.putInt("SHHredThreshold9", SHHredThreshold9);
            editorSH9.apply();
        }
        synchronized (editorSH10) {
            editorSH10.putBoolean(SHHSHHtimer_started_KEY_SH10, handlerSH.hasCallbacks(updateTimerThread10));
            editorSH10.putLong(SHHSHHSHHstart_time_KEY_SH10, startTimeSH10);
            editorSH10.putLong(SHHSHHSHHelapsed_time_KEY_SH10, timeInMillisecondsSH10);
            editorSH10.putBoolean("SHHpeople_key10", peopleSH_10);
            editorSH10.putBoolean("SHHflashing_key10", flashingSH10);
            editorSH10.putBoolean("SHHflashingg_key10", flashinggSH10);
            editorSH10.putBoolean("SHHSHHisTimerRunningSH10", SHHSHHisTimerRunningSH10);
            editorSH10.putInt("SHHSHHcurrentHourSH10", SHHSHHcurrentHourSH10);
            editorSH10.putInt("SHHSHHcurrentMinuteSH10", SHHSHHcurrentMinuteSH10);
            // 保存加時時間到SharedPreferences
            editorSH10.putInt("SHHblueThreshold10", SHHblueThreshold10);
            editorSH10.putInt("SHHyellowThreshold10", SHHyellowThreshold10);
            editorSH10.putInt("SHHredThreshold10", SHHredThreshold10);
            editorSH10.apply();
        }
        synchronized (editorSH11) {
            editorSH11.putBoolean(SHHSHHtimer_started_KEY_SH11, handlerSH.hasCallbacks(updateTimerThread11));
            editorSH11.putLong(SHHSHHSHHstart_time_KEY_SH11, startTimeSH11);
            editorSH11.putLong(SHHSHHSHHelapsed_time_KEY_SH11, timeInMillisecondsSH11);
            editorSH11.putBoolean("SHHpeople_key11", peopleSH_11);
            editorSH11.putBoolean("SHHflashing_key11", flashingSH11);
            editorSH11.putBoolean("SHHflashingg_key11", flashinggSH11);
            editorSH11.putBoolean("SHHSHHisTimerRunningSH11", SHHSHHisTimerRunningSH11);
            editorSH11.putInt("SHHSHHcurrentHourSH11", SHHSHHcurrentHourSH11);
            editorSH11.putInt("SHHSHHcurrentMinuteSH11", SHHSHHcurrentMinuteSH11);
            // 保存加時時間到SharedPreferences
            editorSH11.putInt("SHHblueThreshold11", SHHblueThreshold11);
            editorSH11.putInt("SHHyellowThreshold11", SHHyellowThreshold11);
            editorSH11.putInt("SHHredThreshold11", SHHredThreshold11);
            editorSH11.apply();
        }
        synchronized (editorSH12) {
            editorSH12.putBoolean(SHHSHHtimer_started_KEY_SH12, handlerSH.hasCallbacks(updateTimerThread12));
            editorSH12.putLong(SHHSHHSHHstart_time_KEY_SH12, startTimeSH12);
            editorSH12.putLong(SHHSHHSHHelapsed_time_KEY_SH12, timeInMillisecondsSH12);
            editorSH12.putBoolean("SHHpeople_key12", peopleSH_12);
            editorSH12.putBoolean("SHHflashing_key12", flashingSH12);
            editorSH12.putBoolean("SHHflashingg_key12", flashinggSH12);
            editorSH12.putBoolean("SHHSHHisTimerRunningSH12", SHHSHHisTimerRunningSH12);
            editorSH12.putInt("SHHSHHcurrentHourSH12", SHHSHHcurrentHourSH12);
            editorSH12.putInt("SHHSHHcurrentMinuteSH12", SHHSHHcurrentMinuteSH12);
            // 保存加時時間到SharedPreferences
            editorSH12.putInt("SHHblueThreshold12", SHHblueThreshold12);
            editorSH12.putInt("SHHyellowThreshold12", SHHyellowThreshold12);
            editorSH12.putInt("SHHredThreshold12", SHHredThreshold12);
            editorSH12.apply();
        }
        synchronized (editorSH13) {
            editorSH13.putBoolean(SHHSHHtimer_started_KEY_SH13, handlerSH.hasCallbacks(updateTimerThread13));
            editorSH13.putLong(SHHSHHSHHstart_time_KEY_SH13, startTimeSH13);
            editorSH13.putLong(SHHSHHSHHelapsed_time_KEY_SH13, timeInMillisecondsSH13);
            editorSH13.putBoolean("SHHpeople_key13", peopleSH_13);
            editorSH13.putBoolean("SHHflashing_key13", flashingSH13);
            editorSH13.putBoolean("SHHflashingg_key13", flashinggSH13);
            editorSH13.putBoolean("SHHSHHisTimerRunningSH13", SHHSHHisTimerRunningSH13);
            editorSH13.putInt("SHHSHHcurrentHourSH13", SHHSHHcurrentHourSH13);
            editorSH13.putInt("SHHSHHcurrentMinuteSH13", SHHSHHcurrentMinuteSH13);
            // 保存加時時間到SharedPreferences
            editorSH13.putInt("SHHblueThreshold13", SHHblueThreshold13);
            editorSH13.putInt("SHHyellowThreshold13", SHHyellowThreshold13);
            editorSH13.putInt("SHHredThreshold13", SHHredThreshold13);
            editorSH13.apply();
        }
        synchronized (editorSH14) {
            editorSH14.putBoolean(SHHSHHtimer_started_KEY_SH14, handlerSH.hasCallbacks(updateTimerThread14));
            editorSH14.putLong(SHHSHHSHHstart_time_KEY_SH14, startTimeSH14);
            editorSH14.putLong(SHHSHHSHHelapsed_time_KEY_SH14, timeInMillisecondsSH14);
            editorSH14.putBoolean("SHHpeople_key14", peopleSH_14);
            editorSH14.putBoolean("SHHflashing_key14", flashingSH14);
            editorSH14.putBoolean("SHHflashingg_key14", flashinggSH14);
            editorSH14.putBoolean("SHHSHHisTimerRunningSH14", SHHSHHisTimerRunningSH14);
            editorSH14.putInt("SHHSHHcurrentHourSH14", SHHSHHcurrentHourSH14);
            editorSH14.putInt("SHHSHHcurrentMinuteSH14", SHHSHHcurrentMinuteSH14);
            // 保存加時時間到SharedPreferences
            editorSH14.putInt("SHHblueThreshold14", SHHblueThreshold14);
            editorSH14.putInt("SHHyellowThreshold14", SHHyellowThreshold14);
            editorSH14.putInt("SHHredThreshold14", SHHredThreshold14);
            editorSH14.apply();
        }
        synchronized (editorSH15) {
            editorSH15.putBoolean(SHHSHHtimer_started_KEY_SH15, handlerSH.hasCallbacks(updateTimerThread15));
            editorSH15.putLong(SHHSHHSHHstart_time_KEY_SH15, startTimeSH15);
            editorSH15.putLong(SHHSHHSHHelapsed_time_KEY_SH15, timeInMillisecondsSH15);
            editorSH15.putBoolean("SHHpeople_key15", peopleSH_15);
            editorSH15.putBoolean("SHHflashing_key15", flashingSH15);
            editorSH15.putBoolean("SHHflashingg_key15", flashinggSH15);
            editorSH15.putBoolean("SHHSHHisTimerRunningSH15", SHHSHHisTimerRunningSH15);
            editorSH15.putInt("SHHSHHcurrentHourSH15", SHHSHHcurrentHourSH15);
            editorSH15.putInt("SHHSHHcurrentMinuteSH15", SHHSHHcurrentMinuteSH15);
            // 保存加時時間到SharedPreferences
            editorSH15.putInt("SHHblueThreshold15", SHHblueThreshold15);
            editorSH15.putInt("SHHyellowThreshold15", SHHyellowThreshold15);
            editorSH15.putInt("SHHredThreshold15", SHHredThreshold15);
            editorSH15.apply();
        }
        synchronized (editorSH16) {
            editorSH16.putBoolean(SHHSHHtimer_started_KEY_SH16, handlerSH.hasCallbacks(updateTimerThread16));
            editorSH16.putLong(SHHSHHSHHstart_time_KEY_SH16, startTimeSH16);
            editorSH16.putLong(SHHSHHSHHelapsed_time_KEY_SH16, timeInMillisecondsSH16);
            editorSH16.putBoolean("SHHpeople_key16", peopleSH_16);
            editorSH16.putBoolean("SHHflashing_key16", flashingSH16);
            editorSH16.putBoolean("SHHflashingg_key16", flashinggSH16);
            editorSH16.putBoolean("SHHSHHisTimerRunningSH16", SHHSHHisTimerRunningSH16);
            editorSH16.putInt("SHHSHHcurrentHourSH16", SHHSHHcurrentHourSH16);
            editorSH16.putInt("SHHSHHcurrentMinuteSH16", SHHSHHcurrentMinuteSH16);
            // 保存加時時間到SharedPreferences
            editorSH16.putInt("SHHblueThreshold16", SHHblueThreshold16);
            editorSH16.putInt("SHHyellowThreshold16", SHHyellowThreshold16);
            editorSH16.putInt("SHHredThreshold16", SHHredThreshold16);
            editorSH16.apply();
        }
        synchronized (editorSH17) {
            editorSH17.putBoolean(SHHSHHtimer_started_KEY_SH17, handlerSH.hasCallbacks(updateTimerThread17));
            editorSH17.putLong(SHHSHHSHHstart_time_KEY_SH17, startTimeSH17);
            editorSH17.putLong(SHHSHHSHHelapsed_time_KEY_SH17, timeInMillisecondsSH17);
            editorSH17.putBoolean("SHHpeople_key17", peopleSH_17);
            editorSH17.putBoolean("SHHflashing_key17", flashingSH17);
            editorSH17.putBoolean("SHHflashingg_key17", flashinggSH17);
            editorSH17.putBoolean("SHHSHHisTimerRunningSH17", SHHSHHisTimerRunningSH17);
            editorSH17.putInt("SHHSHHcurrentHourSH17", SHHSHHcurrentHourSH17);
            editorSH17.putInt("SHHSHHcurrentMinuteSH17", SHHSHHcurrentMinuteSH17);
            // 保存加時時間到SharedPreferences
            editorSH17.putInt("SHHblueThreshold17", SHHblueThreshold17);
            editorSH17.putInt("SHHyellowThreshold17", SHHyellowThreshold17);
            editorSH17.putInt("SHHredThreshold17", SHHredThreshold17);
            editorSH17.apply();
        }
        synchronized (editorSH18) {
            editorSH18.putBoolean(SHHSHHtimer_started_KEY_SH18, handlerSH.hasCallbacks(updateTimerThread18));
            editorSH18.putLong(SHHSHHSHHstart_time_KEY_SH18, startTimeSH18);
            editorSH18.putLong(SHHSHHSHHelapsed_time_KEY_SH18, timeInMillisecondsSH18);
            editorSH18.putBoolean("SHHpeople_key18", peopleSH_18);
            editorSH18.putBoolean("SHHflashing_key18", flashingSH18);
            editorSH18.putBoolean("SHHflashingg_key18", flashinggSH18);
            editorSH18.putBoolean("SHHSHHisTimerRunningSH18", SHHSHHisTimerRunningSH18);
            editorSH18.putInt("SHHSHHcurrentHourSH18", SHHSHHcurrentHourSH18);
            editorSH18.putInt("SHHSHHcurrentMinuteSH18", SHHSHHcurrentMinuteSH18);
            // 保存加時時間到SharedPreferences
            editorSH18.putInt("SHHblueThreshold18", SHHblueThreshold18);
            editorSH18.putInt("SHHyellowThreshold18", SHHyellowThreshold18);
            editorSH18.putInt("SHHredThreshold18", SHHredThreshold18);
            editorSH18.apply();
        }
        synchronized (editorSH19) {
            editorSH19.putBoolean(SHHSHHtimer_started_KEY_SH19, handlerSH.hasCallbacks(updateTimerThread19));
            editorSH19.putLong(SHHSHHSHHstart_time_KEY_SH19, startTimeSH19);
            editorSH19.putLong(SHHSHHSHHelapsed_time_KEY_SH19, timeInMillisecondsSH19);
            editorSH19.putBoolean("SHHpeople_key19", peopleSH_19);
            editorSH19.putBoolean("SHHflashing_key19", flashingSH19);
            editorSH19.putBoolean("SHHflashingg_key19", flashinggSH19);
            editorSH19.putBoolean("SHHSHHisTimerRunningSH19", SHHSHHisTimerRunningSH19);
            editorSH19.putInt("SHHSHHcurrentHourSH19", SHHSHHcurrentHourSH19);
            editorSH19.putInt("SHHSHHcurrentMinuteSH19", SHHSHHcurrentMinuteSH19);
            // 保存加時時間到SharedPreferences
            editorSH19.putInt("SHHblueThreshold19", SHHblueThreshold19);
            editorSH19.putInt("SHHyellowThreshold19", SHHyellowThreshold19);
            editorSH19.putInt("SHHredThreshold19", SHHredThreshold19);
            editorSH19.apply();
        }
        synchronized (editorSH20) {
            editorSH20.putBoolean(SHHSHHtimer_started_KEY_SH20, handlerSH.hasCallbacks(updateTimerThread20));
            editorSH20.putLong(SHHSHHSHHstart_time_KEY_SH20, startTimeSH20);
            editorSH20.putLong(SHHSHHSHHelapsed_time_KEY_SH20, timeInMillisecondsSH20);
            editorSH20.putBoolean("SHHpeople_key20", peopleSH_20);
            editorSH20.putBoolean("SHHflashing_key20", flashingSH20);
            editorSH20.putBoolean("SHHflashingg_key20", flashinggSH20);
            editorSH20.putBoolean("SHHSHHisTimerRunningSH20", SHHSHHisTimerRunningSH20);
            editorSH20.putInt("SHHSHHcurrentHourSH20", SHHSHHcurrentHourSH20);
            editorSH20.putInt("SHHSHHcurrentMinuteSH20", SHHSHHcurrentMinuteSH20);
            // 保存加時時間到SharedPreferences
            editorSH20.putInt("SHHblueThreshold20", SHHblueThreshold20);
            editorSH20.putInt("SHHyellowThreshold20", SHHyellowThreshold20);
            editorSH20.putInt("SHHredThreshold20", SHHredThreshold20);
            editorSH20.apply();
        }
        synchronized (editorSH21) {
            editorSH21.putBoolean(SHHSHHtimer_started_KEY_SH21, handlerSH.hasCallbacks(updateTimerThread21));
            editorSH21.putLong(SHHSHHSHHstart_time_KEY_SH21, startTimeSH21);
            editorSH21.putLong(SHHSHHSHHelapsed_time_KEY_SH21, timeInMillisecondsSH21);
            editorSH21.putBoolean("SHHpeople_key21", peopleSH_21);
            editorSH21.putBoolean("SHHflashing_key21", flashingSH21);
            editorSH21.putBoolean("SHHflashingg_key21", flashinggSH21);
            editorSH21.putBoolean("SHHSHHisTimerRunningSH21", SHHSHHisTimerRunningSH21);
            editorSH21.putInt("SHHSHHcurrentHourSH21", SHHSHHcurrentHourSH21);
            editorSH21.putInt("SHHSHHcurrentMinuteSH21", SHHSHHcurrentMinuteSH21);
            // 保存加時時間到SharedPreferences
            editorSH21.putInt("SHHblueThreshold21", SHHblueThreshold21);
            editorSH21.putInt("SHHyellowThreshold21", SHHyellowThreshold21);
            editorSH21.putInt("SHHredThreshold21", SHHredThreshold21);
            editorSH21.apply();
        }
        synchronized (editorSH22) {
            editorSH22.putBoolean(SHHSHHtimer_started_KEY_SH22, handlerSH.hasCallbacks(updateTimerThread22));
            editorSH22.putLong(SHHSHHSHHstart_time_KEY_SH22, startTimeSH22);
            editorSH22.putLong(SHHSHHSHHelapsed_time_KEY_SH22, timeInMillisecondsSH22);
            editorSH22.putBoolean("SHHpeople_key22", peopleSH_22);
            editorSH22.putBoolean("SHHflashing_key22", flashingSH22);
            editorSH22.putBoolean("SHHflashingg_key22", flashinggSH22);
            editorSH22.putBoolean("SHHSHHisTimerRunningSH22", SHHSHHisTimerRunningSH22);
            editorSH22.putInt("SHHSHHcurrentHourSH22", SHHSHHcurrentHourSH22);
            editorSH22.putInt("SHHSHHcurrentMinuteSH22", SHHSHHcurrentMinuteSH22);
            // 保存加時時間到SharedPreferences
            editorSH22.putInt("SHHblueThreshold22", SHHblueThreshold22);
            editorSH22.putInt("SHHyellowThreshold22", SHHyellowThreshold22);
            editorSH22.putInt("SHHredThreshold22", SHHredThreshold22);
            editorSH22.apply();
        }
        synchronized (editorSH23) {
            editorSH23.putBoolean(SHHSHHtimer_started_KEY_SH23, handlerSH.hasCallbacks(updateTimerThread23));
            editorSH23.putLong(SHHSHHSHHstart_time_KEY_SH23, startTimeSH23);
            editorSH23.putLong(SHHSHHSHHelapsed_time_KEY_SH23, timeInMillisecondsSH23);
            editorSH23.putBoolean("SHHpeople_key23", peopleSH_23);
            editorSH23.putBoolean("SHHflashing_key23", flashingSH23);
            editorSH23.putBoolean("SHHflashingg_key23", flashinggSH23);
            editorSH23.putBoolean("SHHSHHisTimerRunningSH23", SHHSHHisTimerRunningSH23);
            editorSH23.putInt("SHHSHHcurrentHourSH23", SHHSHHcurrentHourSH23);
            editorSH23.putInt("SHHSHHcurrentMinuteSH23", SHHSHHcurrentMinuteSH23);
            // 保存加時時間到SharedPreferences
            editorSH23.putInt("SHHblueThreshold23", SHHblueThreshold23);
            editorSH23.putInt("SHHyellowThreshold23", SHHyellowThreshold23);
            editorSH23.putInt("SHHredThreshold23", SHHredThreshold23);
            editorSH23.apply();
        }
        synchronized (editorSH24) {
            editorSH24.putBoolean(SHHSHHtimer_started_KEY_SH24, handlerSH.hasCallbacks(updateTimerThread24));
            editorSH24.putLong(SHHSHHSHHstart_time_KEY_SH24, startTimeSH24);
            editorSH24.putLong(SHHSHHSHHelapsed_time_KEY_SH24, timeInMillisecondsSH24);
            editorSH24.putBoolean("SHHpeople_key24", peopleSH_24);
            editorSH24.putBoolean("SHHflashing_key24", flashingSH24);
            editorSH24.putBoolean("SHHflashingg_key24", flashinggSH24);
            editorSH24.putBoolean("SHHSHHisTimerRunningSH24", SHHSHHisTimerRunningSH24);
            editorSH24.putInt("SHHSHHcurrentHourSH24", SHHSHHcurrentHourSH24);
            editorSH24.putInt("SHHSHHcurrentMinuteSH24", SHHSHHcurrentMinuteSH24);
            // 保存加時時間到SharedPreferences
            editorSH24.putInt("SHHblueThreshold24", SHHblueThreshold24);
            editorSH24.putInt("SHHyellowThreshold24", SHHyellowThreshold24);
            editorSH24.putInt("SHHredThreshold24", SHHredThreshold24);
            editorSH24.apply();
        }
        synchronized (editorSH25) {
            editorSH25.putBoolean(SHHSHHtimer_started_KEY_SH25, handlerSH.hasCallbacks(updateTimerThread25));
            editorSH25.putLong(SHHSHHSHHstart_time_KEY_SH25, startTimeSH25);
            editorSH25.putLong(SHHSHHSHHelapsed_time_KEY_SH25, timeInMillisecondsSH25);
            editorSH25.putBoolean("SHHpeople_key25", peopleSH_25);
            editorSH25.putBoolean("SHHflashing_key25", flashingSH25);
            editorSH25.putBoolean("SHHflashingg_key25", flashinggSH25);
            editorSH25.putBoolean("SHHSHHisTimerRunningSH25", SHHSHHisTimerRunningSH25);
            editorSH25.putInt("SHHSHHcurrentHourSH25", SHHSHHcurrentHourSH25);
            editorSH25.putInt("SHHSHHcurrentMinuteSH25", SHHSHHcurrentMinuteSH25);
            // 保存加時時間到SharedPreferences
            editorSH25.putInt("SHHblueThreshold25", SHHblueThreshold25);
            editorSH25.putInt("SHHyellowThreshold25", SHHyellowThreshold25);
            editorSH25.putInt("SHHredThreshold25", SHHredThreshold25);
            editorSH25.apply();
        }
        synchronized (editorSH26) {
            editorSH26.putBoolean(SHHSHHtimer_started_KEY_SH26, handlerSH.hasCallbacks(updateTimerThread26));
            editorSH26.putLong(SHHSHHSHHstart_time_KEY_SH26, startTimeSH26);
            editorSH26.putLong(SHHSHHSHHelapsed_time_KEY_SH26, timeInMillisecondsSH26);
            editorSH26.putBoolean("SHHpeople_key26", peopleSH_26);
            editorSH26.putBoolean("SHHflashing_key26", flashingSH26);
            editorSH26.putBoolean("SHHflashingg_key26", flashinggSH26);
            editorSH26.putBoolean("SHHSHHisTimerRunningSH26", SHHSHHisTimerRunningSH26);
            editorSH26.putInt("SHHSHHcurrentHourSH26", SHHSHHcurrentHourSH26);
            editorSH26.putInt("SHHSHHcurrentMinuteSH26", SHHSHHcurrentMinuteSH26);
            // 保存加時時間到SharedPreferences
            editorSH26.putInt("SHHblueThreshold26", SHHblueThreshold26);
            editorSH26.putInt("SHHyellowThreshold26", SHHyellowThreshold26);
            editorSH26.putInt("SHHredThreshold26", SHHredThreshold26);
            editorSH26.apply();
        }
        synchronized (editorSH27) {
            editorSH27.putBoolean(SHHSHHtimer_started_KEY_SH27, handlerSH.hasCallbacks(updateTimerThread27));
            editorSH27.putLong(SHHSHHSHHstart_time_KEY_SH27, startTimeSH27);
            editorSH27.putLong(SHHSHHSHHelapsed_time_KEY_SH27, timeInMillisecondsSH27);
            editorSH27.putBoolean("SHHpeople_key27", peopleSH_27);
            editorSH27.putBoolean("SHHflashing_key27", flashingSH27);
            editorSH27.putBoolean("SHHflashingg_key27", flashinggSH27);
            editorSH27.putBoolean("SHHSHHisTimerRunningSH27", SHHSHHisTimerRunningSH27);
            editorSH27.putInt("SHHSHHcurrentHourSH27", SHHSHHcurrentHourSH27);
            editorSH27.putInt("SHHSHHcurrentMinuteSH27", SHHSHHcurrentMinuteSH27);
            // 保存加時時間到SharedPreferences
            editorSH27.putInt("SHHblueThreshold27", SHHblueThreshold27);
            editorSH27.putInt("SHHyellowThreshold27", SHHyellowThreshold27);
            editorSH27.putInt("SHHredThreshold27", SHHredThreshold27);
            editorSH27.apply();
        }
        synchronized (editorSH28) {
            editorSH28.putBoolean(SHHSHHtimer_started_KEY_SH28, handlerSH.hasCallbacks(updateTimerThread28));
            editorSH28.putLong(SHHSHHSHHstart_time_KEY_SH28, startTimeSH28);
            editorSH28.putLong(SHHSHHSHHelapsed_time_KEY_SH28, timeInMillisecondsSH28);
            editorSH28.putBoolean("SHHpeople_key28", peopleSH_28);
            editorSH28.putBoolean("SHHflashing_key28", flashingSH28);
            editorSH28.putBoolean("SHHflashingg_key28", flashinggSH28);
            editorSH28.putBoolean("SHHSHHisTimerRunningSH28", SHHSHHisTimerRunningSH28);
            editorSH28.putInt("SHHSHHcurrentHourSH28", SHHSHHcurrentHourSH28);
            editorSH28.putInt("SHHSHHcurrentMinuteSH28", SHHSHHcurrentMinuteSH28);
            // 保存加時時間到SharedPreferences
            editorSH28.putInt("SHHblueThreshold28", SHHblueThreshold28);
            editorSH28.putInt("SHHyellowThreshold28", SHHyellowThreshold28);
            editorSH28.putInt("SHHredThreshold28", SHHredThreshold28);
            editorSH28.apply();
        }
        synchronized (editorSH29) {
            editorSH29.putBoolean(SHHSHHtimer_started_KEY_SH29, handlerSH.hasCallbacks(updateTimerThread29));
            editorSH29.putLong(SHHSHHSHHstart_time_KEY_SH29, startTimeSH29);
            editorSH29.putLong(SHHSHHSHHelapsed_time_KEY_SH29, timeInMillisecondsSH29);
            editorSH29.putBoolean("SHHpeople_key29", peopleSH_29);
            editorSH29.putBoolean("SHHflashing_key29", flashingSH29);
            editorSH29.putBoolean("SHHflashingg_key29", flashinggSH29);
            editorSH29.putBoolean("SHHSHHisTimerRunningSH29", SHHSHHisTimerRunningSH29);
            editorSH29.putInt("SHHSHHcurrentHourSH29", SHHSHHcurrentHourSH29);
            editorSH29.putInt("SHHSHHcurrentMinuteSH29", SHHSHHcurrentMinuteSH29);
            // 保存加時時間到SharedPreferences
            editorSH29.putInt("SHHblueThreshold29", SHHblueThreshold29);
            editorSH29.putInt("SHHyellowThreshold29", SHHyellowThreshold29);
            editorSH29.putInt("SHHredThreshold29", SHHredThreshold29);
            editorSH29.apply();
        }
        synchronized (editorSH30) {
            editorSH30.putBoolean(SHHSHHtimer_started_KEY_SH30, handlerSH.hasCallbacks(updateTimerThread30));
            editorSH30.putLong(SHHSHHSHHstart_time_KEY_SH30, startTimeSH30);
            editorSH30.putLong(SHHSHHSHHelapsed_time_KEY_SH30, timeInMillisecondsSH30);
            editorSH30.putBoolean("SHHpeople_key30", peopleSH_30);
            editorSH30.putBoolean("SHHflashing_key30", flashingSH30);
            editorSH30.putBoolean("SHHflashingg_key30", flashinggSH30);
            editorSH30.putBoolean("SHHSHHisTimerRunningSH30", SHHSHHisTimerRunningSH30);
            editorSH30.putInt("SHHSHHcurrentHourSH30", SHHSHHcurrentHourSH30);
            editorSH30.putInt("SHHSHHcurrentMinuteSH30", SHHSHHcurrentMinuteSH30);
            // 保存加時時間到SharedPreferences
            editorSH30.putInt("SHHblueThreshold30", SHHblueThreshold30);
            editorSH30.putInt("SHHyellowThreshold30", SHHyellowThreshold30);
            editorSH30.putInt("SHHredThreshold30", SHHredThreshold30);
            editorSH30.apply();
        }
        synchronized (editorSH31) {
            editorSH31.putBoolean(SHHSHHtimer_started_KEY_SH31, handlerSH.hasCallbacks(updateTimerThread31));
            editorSH31.putLong(SHHSHHSHHstart_time_KEY_SH31, startTimeSH31);
            editorSH31.putLong(SHHSHHSHHelapsed_time_KEY_SH31, timeInMillisecondsSH31);
            editorSH31.putBoolean("SHHpeople_key31", peopleSH_31);
            editorSH31.putBoolean("SHHflashing_key31", flashingSH31);
            editorSH31.putBoolean("SHHflashingg_key31", flashinggSH31);
            editorSH31.putBoolean("SHHSHHisTimerRunningSH31", SHHSHHisTimerRunningSH31);
            editorSH31.putInt("SHHSHHcurrentHourSH31", SHHSHHcurrentHourSH31);
            editorSH31.putInt("SHHSHHcurrentMinuteSH31", SHHSHHcurrentMinuteSH31);
            // 保存加時時間到SharedPreferences
            editorSH31.putInt("SHHblueThreshold31", SHHblueThreshold31);
            editorSH31.putInt("SHHyellowThreshold31", SHHyellowThreshold31);
            editorSH31.putInt("SHHredThreshold31", SHHredThreshold31);
            editorSH31.apply();
        }
        synchronized (editorSH32) {
            editorSH32.putBoolean(SHHSHHtimer_started_KEY_SH32, handlerSH.hasCallbacks(updateTimerThread32));
            editorSH32.putLong(SHHSHHSHHstart_time_KEY_SH32, startTimeSH32);
            editorSH32.putLong(SHHSHHSHHelapsed_time_KEY_SH32, timeInMillisecondsSH32);
            editorSH32.putBoolean("SHHpeople_key32", peopleSH_32);
            editorSH32.putBoolean("SHHflashing_key32", flashingSH32);
            editorSH32.putBoolean("SHHflashingg_key32", flashinggSH32);
            editorSH32.putBoolean("SHHSHHisTimerRunningSH32", SHHSHHisTimerRunningSH32);
            editorSH32.putInt("SHHSHHcurrentHourSH32", SHHSHHcurrentHourSH32);
            editorSH32.putInt("SHHSHHcurrentMinuteSH32", SHHSHHcurrentMinuteSH32);
            // 保存加時時間到SharedPreferences
            editorSH32.putInt("SHHblueThreshold32", SHHblueThreshold32);
            editorSH32.putInt("SHHyellowThreshold32", SHHyellowThreshold32);
            editorSH32.putInt("SHHredThreshold32", SHHredThreshold32);
            editorSH32.apply();
        }
        synchronized (editorSH33) {
            editorSH33.putBoolean(SHHSHHtimer_started_KEY_SH33, handlerSH.hasCallbacks(updateTimerThread33));
            editorSH33.putLong(SHHSHHSHHstart_time_KEY_SH33, startTimeSH33);
            editorSH33.putLong(SHHSHHSHHelapsed_time_KEY_SH33, timeInMillisecondsSH33);
            editorSH33.putBoolean("SHHpeople_key33", peopleSH_33);
            editorSH33.putBoolean("SHHflashing_key33", flashingSH33);
            editorSH33.putBoolean("SHHflashingg_key33", flashinggSH33);
            editorSH33.putBoolean("SHHSHHisTimerRunningSH33", SHHSHHisTimerRunningSH33);
            editorSH33.putInt("SHHSHHcurrentHourSH33", SHHSHHcurrentHourSH33);
            editorSH33.putInt("SHHSHHcurrentMinuteSH33", SHHSHHcurrentMinuteSH33);
            // 保存加時時間到SharedPreferences
            editorSH33.putInt("SHHblueThreshold33", SHHblueThreshold33);
            editorSH33.putInt("SHHyellowThreshold33", SHHyellowThreshold33);
            editorSH33.putInt("SHHredThreshold33", SHHredThreshold33);
            editorSH33.apply();
        }

        // 在保存計時器1狀態時，使用editor1對象進行同步
        synchronized (editor1) {
            editor1.putBoolean(SHHSHHtimer_started_KEY1, handler1.hasCallbacks(updateTimerThread1));
            editor1.putLong(SHHSHHstart_time_KEY1, startTime1);
            editor1.putLong(SHHSHHelapsed_time_KEY1, timeInMilliseconds1);
            editor1.putBoolean("SHHpeople_key1", people2_1);
            editor1.putBoolean("SHHflashing_key1", flashing1);
            editor1.putBoolean("SHHflashingg_key1", flashingg1);
            editor1.putBoolean("SHHisTimerRunning1", SHHisTimerRunning1);
            editor1.putInt("SHHcurrentHour1",SHHcurrentHour1);
            editor1.putInt("SHHcurrentMinute1",SHHcurrentMinute1);

            // 保存加時時間到SharedPreferences
            editor1.putInt("SHHblueThreshold1", SHHblueThreshold1);
            editor1.putInt("SHHyellowThreshold1", SHHyellowThreshold1);
            editor1.putInt("SHHredThreshold1", SHHredThreshold1);
            editor1.apply();
        }

        // 在保存計時器2狀態時，使用editor2對象進行同步
        synchronized (editor2) {
            editor2.putBoolean(SHHSHHtimer_started_KEY2, handler1.hasCallbacks(updateTimerThread2));
            editor2.putLong(SHHSHHstart_time_KEY2, startTime2);
            editor2.putLong(SHHSHHelapsed_time_KEY2, timeInMilliseconds2);
            editor2.putBoolean("SHHpeople_key2", people2_2);


            editor2.putBoolean("SHHflashing_key2", flashing2);
            editor2.putBoolean("SHHflashingg_key2", flashingg2);
            editor2.putBoolean("SHHisTimerRunning2", SHHisTimerRunning2);
            editor2.putInt("SHHcurrentHour2", SHHcurrentHour2);
            editor2.putInt("SHHcurrentMinute2", SHHcurrentMinute2);


            // 保存加時時間到SharedPreferences
            editor2.putInt("SHHblueThreshold2", SHHblueThreshold2);
            editor2.putInt("SHHyellowThreshold2", SHHyellowThreshold2);
            editor2.putInt("SHHredThreshold2", SHHredThreshold2);
            editor2.apply();
        }

        synchronized (editor3) {
            editor3.putBoolean(SHHSHHtimer_started_KEY3, handler1.hasCallbacks(updateTimerThread3));
            editor3.putLong(SHHSHHstart_time_KEY3, startTime3);
            editor3.putLong(SHHSHHelapsed_time_KEY3, timeInMilliseconds3);
            editor3.putBoolean("SHHpeople_key3", people2_3);

            editor3.putBoolean("SHHflashing_key3", flashing3);
            editor3.putBoolean("SHHflashingg_key3", flashingg3);
            editor3.putBoolean("SHHisTimerRunning3", SHHisTimerRunning3);
            editor3.putInt("SHHcurrentHour3", SHHcurrentHour3);
            editor3.putInt("SHHcurrentMinute3", SHHcurrentMinute3);


            // 保存加時時間到SharedPreferences
            editor3.putInt("SHHblueThreshold3", SHHblueThreshold3);
            editor3.putInt("SHHyellowThreshold3", SHHyellowThreshold3);
            editor3.putInt("SHHredThreshold3", SHHredThreshold3);
            editor3.apply();
        }

        synchronized (editor4) {
            editor4.putBoolean(SHHSHHtimer_started_KEY4, handler1.hasCallbacks(updateTimerThread4));
            editor4.putLong(SHHSHHstart_time_KEY4, startTime4);
            editor4.putLong(SHHSHHelapsed_time_KEY4, timeInMilliseconds4);
            editor4.putBoolean("SHHpeople_key4", people2_4);

            editor4.putBoolean("SHHflashing_key4", flashing4);
            editor4.putBoolean("SHHflashingg_key4", flashingg4);
            editor4.putBoolean("SHHisTimerRunning4", SHHisTimerRunning4);
            editor4.putInt("SHHcurrentHour4", SHHcurrentHour4);
            editor4.putInt("SHHcurrentMinute4", SHHcurrentMinute4);


            // 保存加時時間到SharedPreferences
            editor4.putInt("SHHblueThreshold4", SHHblueThreshold4);
            editor4.putInt("SHHyellowThreshold4", SHHyellowThreshold4);
            editor4.putInt("SHHredThreshold4", SHHredThreshold4);
            editor4.apply();
        }

        synchronized (editor5) {
            editor5.putBoolean(SHHSHHtimer_started_KEY5, handler1.hasCallbacks(updateTimerThread5));
            editor5.putLong(SHHSHHstart_time_KEY5, startTime5);
            editor5.putLong(SHHSHHelapsed_time_KEY5, timeInMilliseconds5);
            editor5.putBoolean("SHHpeople_key5", people2_5);

            editor5.putBoolean("SHHflashing_key5", flashing5);
            editor5.putBoolean("SHHflashingg_key5", flashingg5);
            editor5.putBoolean("SHHisTimerRunning5", SHHisTimerRunning5);
            editor5.putInt("SHHcurrentHour5", SHHcurrentHour5);
            editor5.putInt("SHHcurrentMinute5", SHHcurrentMinute5);


// 保存加時時間到SharedPreferences
            editor5.putInt("SHHblueThreshold5", SHHblueThreshold5);
            editor5.putInt("SHHyellowThreshold5", SHHyellowThreshold5);
            editor5.putInt("SHHredThreshold5", SHHredThreshold5);
            editor5.apply();
        }



        synchronized (editor7) {
            editor7.putBoolean(SHHSHHtimer_started_KEY7, handler1.hasCallbacks(updateTimerThread7));
            editor7.putLong(SHHSHHstart_time_KEY7, startTime7);
            editor7.putLong(SHHSHHelapsed_time_KEY7, timeInMilliseconds7);
            editor7.putBoolean("SHHpeople_key7", people2_7);

            editor7.putBoolean("SHHflashing_key7", flashing7);
            editor7.putBoolean("SHHflashingg_key7", flashingg7);
            editor7.putBoolean("SHHisTimerRunning7", SHHisTimerRunning7);

            editor7.putInt("SHHcurrentHour7", SHHcurrentHour7);
            editor7.putInt("SHHcurrentMinute7", SHHcurrentMinute7);


            // 保存加時時間到SharedPreferences
            editor7.putInt("SHHblueThreshold7", SHHblueThreshold7);
            editor7.putInt("SHHyellowThreshold7", SHHyellowThreshold7);
            editor7.putInt("SHHredThreshold7", SHHredThreshold7);
            editor7.apply();
        }

        synchronized (editor66) {
            editor66.putBoolean(SHHSHHtimer_started_KEY66, handler1.hasCallbacks(updateTimerThread66));
            editor66.putLong(SHHSHHstart_time_KEY66, startTime66);
            editor66.putLong(SHHSHHelapsed_time_KEY66, timeInMilliseconds66);
            editor66.putBoolean("SHHpeople_key66", people2_66);

            editor66.putBoolean("SHHflashing_key66", flashing66);
            editor66.putBoolean("SHHflashingg_key66", flashingg66);
            editor66.putBoolean("SHHisTimerRunning66", SHHisTimerRunning66);
            editor66.putInt("SHHcurrentHour66", SHHcurrentHour66);
            editor66.putInt("SHHcurrentMinute66", SHHcurrentMinute66);


            editor66.putInt("SHHblueThreshold66", SHHblueThreshold66);
            editor66.putInt("SHHyellowThreshold66", SHHyellowThreshold66);
            editor66.putInt("SHHredThreshold66", SHHredThreshold66);
            editor66.apply();
        }

    }

    //------------------------------------------------------------------------------------------
    @Override
    public void onResume() {
        super.onResume();

        synchronized (editorSH101) {
            boolean timerStarted101 = sharedPreferencesSH101.getBoolean(SHHSHHtimer_started_KEY_SH101, false);
            if (timerStarted101) {
                startTimeSH101 = sharedPreferencesSH101.getLong(SHHSHHSHHstart_time_KEY_SH101, 0);
                timeInMillisecondsSH101 = sharedPreferencesSH101.getLong(SHHSHHSHHelapsed_time_KEY_SH101, 0);
                secSH101 = (int) (timeInMillisecondsSH101 / 1000);
                handlerSH.postDelayed(updateTimerThread101, 0);
            }
            peopleSH_101 = sharedPreferencesSH101.getBoolean("SHHpeople_key101", false);
            flashingSH101 = sharedPreferencesSH101.getBoolean("SHHflashing_key101", false);
            flashinggSH101 = sharedPreferencesSH101.getBoolean("SHHflashingg_key101", false);
            SHHSHHisTimerRunningSH101 = sharedPreferencesSH101.getBoolean("SHHSHHisTimerRunningSH101", false);
            SHHSHHcurrentHourSH101 = sharedPreferencesSH101.getInt("SHHSHHcurrentHourSH101", SHHSHHcurrentHourSH101);
            SHHSHHcurrentMinuteSH101 = sharedPreferencesSH101.getInt("SHHSHHcurrentMinuteSH101", SHHSHHcurrentMinuteSH101);

            // 恢复加時時間  測試用
            SHHblueThreshold101 = sharedPreferencesSH101.getInt("SHHblueThreshold101", originalSHHblueThresholdSH2);
            SHHyellowThreshold101 = sharedPreferencesSH101.getInt("SHHyellowThreshold101", originalSHHyellowThresholdSH2);
            SHHredThreshold101 = sharedPreferencesSH101.getInt("SHHredThreshold101", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor101();
        }
        synchronized (editorSH102) {
            boolean timerStarted102 = sharedPreferencesSH102.getBoolean(SHHSHHtimer_started_KEY_SH102, false);
            if (timerStarted102) {
                startTimeSH102 = sharedPreferencesSH102.getLong(SHHSHHSHHstart_time_KEY_SH102, 0);
                timeInMillisecondsSH102 = sharedPreferencesSH102.getLong(SHHSHHSHHelapsed_time_KEY_SH102, 0);
                secSH102 = (int) (timeInMillisecondsSH102 / 1000);
                handlerSH.postDelayed(updateTimerThread102, 0);
            }
            peopleSH_102 = sharedPreferencesSH102.getBoolean("SHHpeople_key102", false);
            flashingSH102 = sharedPreferencesSH102.getBoolean("SHHflashing_key102", false);
            flashinggSH102 = sharedPreferencesSH102.getBoolean("SHHflashingg_key102", false);
            SHHSHHisTimerRunningSH102 = sharedPreferencesSH102.getBoolean("SHHSHHisTimerRunningSH102", false);
            SHHSHHcurrentHourSH102 = sharedPreferencesSH102.getInt("SHHSHHcurrentHourSH102", SHHSHHcurrentHourSH102);
            SHHSHHcurrentMinuteSH102 = sharedPreferencesSH102.getInt("SHHSHHcurrentMinuteSH102", SHHSHHcurrentMinuteSH102);

            // 恢复加時時間  測試用
            SHHblueThreshold102 = sharedPreferencesSH102.getInt("SHHblueThreshold102", originalSHHblueThresholdSH2);
            SHHyellowThreshold102 = sharedPreferencesSH102.getInt("SHHyellowThreshold102", originalSHHyellowThresholdSH2);
            SHHredThreshold102 = sharedPreferencesSH102.getInt("SHHredThreshold102", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor102();
        }
        synchronized (editorSH103) {
            boolean timerStarted103 = sharedPreferencesSH103.getBoolean(SHHSHHtimer_started_KEY_SH103, false);
            if (timerStarted103) {
                startTimeSH103 = sharedPreferencesSH103.getLong(SHHSHHSHHstart_time_KEY_SH103, 0);
                timeInMillisecondsSH103 = sharedPreferencesSH103.getLong(SHHSHHSHHelapsed_time_KEY_SH103, 0);
                secSH103 = (int) (timeInMillisecondsSH103 / 1000);
                handlerSH.postDelayed(updateTimerThread103, 0);
            }
            peopleSH_103 = sharedPreferencesSH103.getBoolean("SHHpeople_key103", false);
            flashingSH103 = sharedPreferencesSH103.getBoolean("SHHflashing_key103", false);
            flashinggSH103 = sharedPreferencesSH103.getBoolean("SHHflashingg_key103", false);
            SHHSHHisTimerRunningSH103 = sharedPreferencesSH103.getBoolean("SHHSHHisTimerRunningSH103", false);
            SHHSHHcurrentHourSH103 = sharedPreferencesSH103.getInt("SHHSHHcurrentHourSH103", SHHSHHcurrentHourSH103);
            SHHSHHcurrentMinuteSH103 = sharedPreferencesSH103.getInt("SHHSHHcurrentMinuteSH103", SHHSHHcurrentMinuteSH103);

            // 恢复加時時間  測試用
            SHHblueThreshold103 = sharedPreferencesSH103.getInt("SHHblueThreshold103", originalSHHblueThresholdSH2);
            SHHyellowThreshold103 = sharedPreferencesSH103.getInt("SHHyellowThreshold103", originalSHHyellowThresholdSH2);
            SHHredThreshold103 = sharedPreferencesSH103.getInt("SHHredThreshold103", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor103();
        }
        synchronized (editorSH104) {
            boolean timerStarted104 = sharedPreferencesSH104.getBoolean(SHHSHHtimer_started_KEY_SH104, false);
            if (timerStarted104) {
                startTimeSH104 = sharedPreferencesSH104.getLong(SHHSHHSHHstart_time_KEY_SH104, 0);
                timeInMillisecondsSH104 = sharedPreferencesSH104.getLong(SHHSHHSHHelapsed_time_KEY_SH104, 0);
                secSH104 = (int) (timeInMillisecondsSH104 / 1000);
                handlerSH.postDelayed(updateTimerThread104, 0);
            }
            peopleSH_104 = sharedPreferencesSH104.getBoolean("SHHpeople_key104", false);
            flashingSH104 = sharedPreferencesSH104.getBoolean("SHHflashing_key104", false);
            flashinggSH104 = sharedPreferencesSH104.getBoolean("SHHflashingg_key104", false);
            SHHSHHisTimerRunningSH104 = sharedPreferencesSH104.getBoolean("SHHSHHisTimerRunningSH104", false);
            SHHSHHcurrentHourSH104 = sharedPreferencesSH104.getInt("SHHSHHcurrentHourSH104", SHHSHHcurrentHourSH104);
            SHHSHHcurrentMinuteSH104 = sharedPreferencesSH104.getInt("SHHSHHcurrentMinuteSH104", SHHSHHcurrentMinuteSH104);

            // 恢复加時時間  測試用
            SHHblueThreshold104 = sharedPreferencesSH104.getInt("SHHblueThreshold104", originalSHHblueThresholdSH2);
            SHHyellowThreshold104 = sharedPreferencesSH104.getInt("SHHyellowThreshold104", originalSHHyellowThresholdSH2);
            SHHredThreshold104 = sharedPreferencesSH104.getInt("SHHredThreshold104", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor104();
        }
        synchronized (editorSH105) {
            boolean timerStarted105 = sharedPreferencesSH105.getBoolean(SHHSHHtimer_started_KEY_SH105, false);
            if (timerStarted105) {
                startTimeSH105 = sharedPreferencesSH105.getLong(SHHSHHSHHstart_time_KEY_SH105, 0);
                timeInMillisecondsSH105 = sharedPreferencesSH105.getLong(SHHSHHSHHelapsed_time_KEY_SH105, 0);
                secSH105 = (int) (timeInMillisecondsSH105 / 1000);
                handlerSH.postDelayed(updateTimerThread105, 0);
            }
            peopleSH_105 = sharedPreferencesSH105.getBoolean("SHHpeople_key105", false);
            flashingSH105 = sharedPreferencesSH105.getBoolean("SHHflashing_key105", false);
            flashinggSH105 = sharedPreferencesSH105.getBoolean("SHHflashingg_key105", false);
            SHHSHHisTimerRunningSH105 = sharedPreferencesSH105.getBoolean("SHHSHHisTimerRunningSH105", false);
            SHHSHHcurrentHourSH105 = sharedPreferencesSH105.getInt("SHHSHHcurrentHourSH105", SHHSHHcurrentHourSH105);
            SHHSHHcurrentMinuteSH105 = sharedPreferencesSH105.getInt("SHHSHHcurrentMinuteSH105", SHHSHHcurrentMinuteSH105);

            // 恢复加時時間  測試用
            SHHblueThreshold105 = sharedPreferencesSH105.getInt("SHHblueThreshold105", originalSHHblueThresholdSH2);
            SHHyellowThreshold105 = sharedPreferencesSH105.getInt("SHHyellowThreshold105", originalSHHyellowThresholdSH2);
            SHHredThreshold105 = sharedPreferencesSH105.getInt("SHHredThreshold105", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor105();
        }
        synchronized (editorSH106) {
            boolean timerStarted106 = sharedPreferencesSH106.getBoolean(SHHSHHtimer_started_KEY_SH106, false);
            if (timerStarted106) {
                startTimeSH106 = sharedPreferencesSH106.getLong(SHHSHHSHHstart_time_KEY_SH106, 0);
                timeInMillisecondsSH106 = sharedPreferencesSH106.getLong(SHHSHHSHHelapsed_time_KEY_SH106, 0);
                secSH106 = (int) (timeInMillisecondsSH106 / 1000);
                handlerSH.postDelayed(updateTimerThread106, 0);
            }
            peopleSH_106 = sharedPreferencesSH106.getBoolean("SHHpeople_key106", false);
            flashingSH106 = sharedPreferencesSH106.getBoolean("SHHflashing_key106", false);
            flashinggSH106 = sharedPreferencesSH106.getBoolean("SHHflashingg_key106", false);
            SHHSHHisTimerRunningSH106 = sharedPreferencesSH106.getBoolean("SHHSHHisTimerRunningSH106", false);
            SHHSHHcurrentHourSH106 = sharedPreferencesSH106.getInt("SHHSHHcurrentHourSH106", SHHSHHcurrentHourSH106);
            SHHSHHcurrentMinuteSH106 = sharedPreferencesSH106.getInt("SHHSHHcurrentMinuteSH106", SHHSHHcurrentMinuteSH106);

            // 恢复加時時間  測試用
            SHHblueThreshold106 = sharedPreferencesSH106.getInt("SHHblueThreshold106", originalSHHblueThresholdSH2);
            SHHyellowThreshold106 = sharedPreferencesSH106.getInt("SHHyellowThreshold106", originalSHHyellowThresholdSH2);
            SHHredThreshold106 = sharedPreferencesSH106.getInt("SHHredThreshold106", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor106();
        }
        synchronized (editorSH107) {
            boolean timerStarted107 = sharedPreferencesSH107.getBoolean(SHHSHHtimer_started_KEY_SH107, false);
            if (timerStarted107) {
                startTimeSH107 = sharedPreferencesSH107.getLong(SHHSHHSHHstart_time_KEY_SH107, 0);
                timeInMillisecondsSH107 = sharedPreferencesSH107.getLong(SHHSHHSHHelapsed_time_KEY_SH107, 0);
                secSH107 = (int) (timeInMillisecondsSH107 / 1000);
                handlerSH.postDelayed(updateTimerThread107, 0);
            }
            peopleSH_107 = sharedPreferencesSH107.getBoolean("SHHpeople_key107", false);
            flashingSH107 = sharedPreferencesSH107.getBoolean("SHHflashing_key107", false);
            flashinggSH107 = sharedPreferencesSH107.getBoolean("SHHflashingg_key107", false);
            SHHSHHisTimerRunningSH107 = sharedPreferencesSH107.getBoolean("SHHSHHisTimerRunningSH107", false);
            SHHSHHcurrentHourSH107 = sharedPreferencesSH107.getInt("SHHSHHcurrentHourSH107", SHHSHHcurrentHourSH107);
            SHHSHHcurrentMinuteSH107 = sharedPreferencesSH107.getInt("SHHSHHcurrentMinuteSH107", SHHSHHcurrentMinuteSH107);

            // 恢复加時時間  測試用
            SHHblueThreshold107 = sharedPreferencesSH107.getInt("SHHblueThreshold107", originalSHHblueThresholdSH2);
            SHHyellowThreshold107 = sharedPreferencesSH107.getInt("SHHyellowThreshold107", originalSHHyellowThresholdSH2);
            SHHredThreshold107 = sharedPreferencesSH107.getInt("SHHredThreshold107", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor107();
        }
        synchronized (editorSH8) {
            boolean timerStarted8 = sharedPreferencesSH8.getBoolean(SHHSHHtimer_started_KEY_SH8, false);
            if (timerStarted8) {
                startTimeSH8 = sharedPreferencesSH8.getLong(SHHSHHSHHstart_time_KEY_SH8, 0);
                timeInMillisecondsSH8 = sharedPreferencesSH8.getLong(SHHSHHSHHelapsed_time_KEY_SH8, 0);
                secSH8 = (int) (timeInMillisecondsSH8 / 1000);
                handlerSH.postDelayed(updateTimerThread8, 0);
            }
            peopleSH_8 = sharedPreferencesSH8.getBoolean("SHHpeople_key8", false);
            flashingSH8 = sharedPreferencesSH8.getBoolean("SHHflashing_key8", false);
            flashinggSH8 = sharedPreferencesSH8.getBoolean("SHHflashingg_key8", false);
            SHHSHHisTimerRunningSH8 = sharedPreferencesSH8.getBoolean("SHHSHHisTimerRunningSH8", false);
            SHHSHHcurrentHourSH8 = sharedPreferencesSH8.getInt("SHHSHHcurrentHourSH8", SHHSHHcurrentHourSH8);
            SHHSHHcurrentMinuteSH8 = sharedPreferencesSH8.getInt("SHHSHHcurrentMinuteSH8", SHHSHHcurrentMinuteSH8);

            // 恢复加時時間  測試用
            SHHblueThreshold8 = sharedPreferencesSH8.getInt("SHHblueThreshold8", originalSHHblueThresholdSH2);
            SHHyellowThreshold8 = sharedPreferencesSH8.getInt("SHHyellowThreshold8", originalSHHyellowThresholdSH2);
            SHHredThreshold8 = sharedPreferencesSH8.getInt("SHHredThreshold8", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor8();
        }
        synchronized (editorSH9) {
            boolean timerStarted9 = sharedPreferencesSH9.getBoolean(SHHSHHtimer_started_KEY_SH9, false);
            if (timerStarted9) {
                startTimeSH9 = sharedPreferencesSH9.getLong(SHHSHHSHHstart_time_KEY_SH9, 0);
                timeInMillisecondsSH9 = sharedPreferencesSH9.getLong(SHHSHHSHHelapsed_time_KEY_SH9, 0);
                secSH9 = (int) (timeInMillisecondsSH9 / 1000);
                handlerSH.postDelayed(updateTimerThread9, 0);
            }
            peopleSH_9 = sharedPreferencesSH9.getBoolean("SHHpeople_key9", false);
            flashingSH9 = sharedPreferencesSH9.getBoolean("SHHflashing_key9", false);
            flashinggSH9 = sharedPreferencesSH9.getBoolean("SHHflashingg_key9", false);
            SHHSHHisTimerRunningSH9 = sharedPreferencesSH9.getBoolean("SHHSHHisTimerRunningSH9", false);
            SHHSHHcurrentHourSH9 = sharedPreferencesSH9.getInt("SHHSHHcurrentHourSH9", SHHSHHcurrentHourSH9);
            SHHSHHcurrentMinuteSH9 = sharedPreferencesSH9.getInt("SHHSHHcurrentMinuteSH9", SHHSHHcurrentMinuteSH9);

            // 恢复加時時間  測試用
            SHHblueThreshold9 = sharedPreferencesSH9.getInt("SHHblueThreshold9", originalSHHblueThresholdSH2);
            SHHyellowThreshold9 = sharedPreferencesSH9.getInt("SHHyellowThreshold9", originalSHHyellowThresholdSH2);
            SHHredThreshold9 = sharedPreferencesSH9.getInt("SHHredThreshold9", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor9();
        }
        synchronized (editorSH10) {
            boolean timerStarted10 = sharedPreferencesSH10.getBoolean(SHHSHHtimer_started_KEY_SH10, false);
            if (timerStarted10) {
                startTimeSH10 = sharedPreferencesSH10.getLong(SHHSHHSHHstart_time_KEY_SH10, 0);
                timeInMillisecondsSH10 = sharedPreferencesSH10.getLong(SHHSHHSHHelapsed_time_KEY_SH10, 0);
                secSH10 = (int) (timeInMillisecondsSH10 / 1000);
                handlerSH.postDelayed(updateTimerThread10, 0);
            }
            peopleSH_10 = sharedPreferencesSH10.getBoolean("SHHpeople_key10", false);
            flashingSH10 = sharedPreferencesSH10.getBoolean("SHHflashing_key10", false);
            flashinggSH10 = sharedPreferencesSH10.getBoolean("SHHflashingg_key10", false);
            SHHSHHisTimerRunningSH10 = sharedPreferencesSH10.getBoolean("SHHSHHisTimerRunningSH10", false);
            SHHSHHcurrentHourSH10 = sharedPreferencesSH10.getInt("SHHSHHcurrentHourSH10", SHHSHHcurrentHourSH10);
            SHHSHHcurrentMinuteSH10 = sharedPreferencesSH10.getInt("SHHSHHcurrentMinuteSH10", SHHSHHcurrentMinuteSH10);

            // 恢复加時時間  測試用
            SHHblueThreshold10 = sharedPreferencesSH10.getInt("SHHblueThreshold10", originalSHHblueThresholdSH2);
            SHHyellowThreshold10 = sharedPreferencesSH10.getInt("SHHyellowThreshold10", originalSHHyellowThresholdSH2);
            SHHredThreshold10 = sharedPreferencesSH10.getInt("SHHredThreshold10", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor10();
        }
        synchronized (editorSH11) {
            boolean timerStarted11 = sharedPreferencesSH11.getBoolean(SHHSHHtimer_started_KEY_SH11, false);
            if (timerStarted11) {
                startTimeSH11 = sharedPreferencesSH11.getLong(SHHSHHSHHstart_time_KEY_SH11, 0);
                timeInMillisecondsSH11 = sharedPreferencesSH11.getLong(SHHSHHSHHelapsed_time_KEY_SH11, 0);
                secSH11 = (int) (timeInMillisecondsSH11 / 1000);
                handlerSH.postDelayed(updateTimerThread11, 0);
            }
            peopleSH_11 = sharedPreferencesSH11.getBoolean("SHHpeople_key11", false);
            flashingSH11 = sharedPreferencesSH11.getBoolean("SHHflashing_key11", false);
            flashinggSH11 = sharedPreferencesSH11.getBoolean("SHHflashingg_key11", false);
            SHHSHHisTimerRunningSH11 = sharedPreferencesSH11.getBoolean("SHHSHHisTimerRunningSH11", false);
            SHHSHHcurrentHourSH11 = sharedPreferencesSH11.getInt("SHHSHHcurrentHourSH11", SHHSHHcurrentHourSH11);
            SHHSHHcurrentMinuteSH11 = sharedPreferencesSH11.getInt("SHHSHHcurrentMinuteSH11", SHHSHHcurrentMinuteSH11);

            // 恢复加時時間  測試用
            SHHblueThreshold11 = sharedPreferencesSH11.getInt("SHHblueThreshold11", originalSHHblueThresholdSH2);
            SHHyellowThreshold11 = sharedPreferencesSH11.getInt("SHHyellowThreshold11", originalSHHyellowThresholdSH2);
            SHHredThreshold11 = sharedPreferencesSH11.getInt("SHHredThreshold11", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor11();
        }
        synchronized (editorSH12) {
            boolean timerStarted12 = sharedPreferencesSH12.getBoolean(SHHSHHtimer_started_KEY_SH12, false);
            if (timerStarted12) {
                startTimeSH12 = sharedPreferencesSH12.getLong(SHHSHHSHHstart_time_KEY_SH12, 0);
                timeInMillisecondsSH12 = sharedPreferencesSH12.getLong(SHHSHHSHHelapsed_time_KEY_SH12, 0);
                secSH12 = (int) (timeInMillisecondsSH12 / 1000);
                handlerSH.postDelayed(updateTimerThread12, 0);
            }
            peopleSH_12 = sharedPreferencesSH12.getBoolean("SHHpeople_key12", false);
            flashingSH12 = sharedPreferencesSH12.getBoolean("SHHflashing_key12", false);
            flashinggSH12 = sharedPreferencesSH12.getBoolean("SHHflashingg_key12", false);
            SHHSHHisTimerRunningSH12 = sharedPreferencesSH12.getBoolean("SHHSHHisTimerRunningSH12", false);
            SHHSHHcurrentHourSH12 = sharedPreferencesSH12.getInt("SHHSHHcurrentHourSH12", SHHSHHcurrentHourSH12);
            SHHSHHcurrentMinuteSH12 = sharedPreferencesSH12.getInt("SHHSHHcurrentMinuteSH12", SHHSHHcurrentMinuteSH12);

            // 恢复加時時間  測試用
            SHHblueThreshold12 = sharedPreferencesSH12.getInt("SHHblueThreshold12", originalSHHblueThresholdSH2);
            SHHyellowThreshold12 = sharedPreferencesSH12.getInt("SHHyellowThreshold12", originalSHHyellowThresholdSH2);
            SHHredThreshold12 = sharedPreferencesSH12.getInt("SHHredThreshold12", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor12();
        }
        synchronized (editorSH13) {
            boolean timerStarted13 = sharedPreferencesSH13.getBoolean(SHHSHHtimer_started_KEY_SH13, false);
            if (timerStarted13) {
                startTimeSH13 = sharedPreferencesSH13.getLong(SHHSHHSHHstart_time_KEY_SH13, 0);
                timeInMillisecondsSH13 = sharedPreferencesSH13.getLong(SHHSHHSHHelapsed_time_KEY_SH13, 0);
                secSH13 = (int) (timeInMillisecondsSH13 / 1000);
                handlerSH.postDelayed(updateTimerThread13, 0);
            }
            peopleSH_13 = sharedPreferencesSH13.getBoolean("SHHpeople_key13", false);
            flashingSH13 = sharedPreferencesSH13.getBoolean("SHHflashing_key13", false);
            flashinggSH13 = sharedPreferencesSH13.getBoolean("SHHflashingg_key13", false);
            SHHSHHisTimerRunningSH13 = sharedPreferencesSH13.getBoolean("SHHSHHisTimerRunningSH13", false);
            SHHSHHcurrentHourSH13 = sharedPreferencesSH13.getInt("SHHSHHcurrentHourSH13", SHHSHHcurrentHourSH13);
            SHHSHHcurrentMinuteSH13 = sharedPreferencesSH13.getInt("SHHSHHcurrentMinuteSH13", SHHSHHcurrentMinuteSH13);

            // 恢复加時時間  測試用
            SHHblueThreshold13 = sharedPreferencesSH13.getInt("SHHblueThreshold13", originalSHHblueThresholdSH2);
            SHHyellowThreshold13 = sharedPreferencesSH13.getInt("SHHyellowThreshold13", originalSHHyellowThresholdSH2);
            SHHredThreshold13 = sharedPreferencesSH13.getInt("SHHredThreshold13", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor13();
        }
        synchronized (editorSH14) {
            boolean timerStarted14 = sharedPreferencesSH14.getBoolean(SHHSHHtimer_started_KEY_SH14, false);
            if (timerStarted14) {
                startTimeSH14 = sharedPreferencesSH14.getLong(SHHSHHSHHstart_time_KEY_SH14, 0);
                timeInMillisecondsSH14 = sharedPreferencesSH14.getLong(SHHSHHSHHelapsed_time_KEY_SH14, 0);
                secSH14 = (int) (timeInMillisecondsSH14 / 1000);
                handlerSH.postDelayed(updateTimerThread14, 0);
            }
            peopleSH_14 = sharedPreferencesSH14.getBoolean("SHHpeople_key14", false);
            flashingSH14 = sharedPreferencesSH14.getBoolean("SHHflashing_key14", false);
            flashinggSH14 = sharedPreferencesSH14.getBoolean("SHHflashingg_key14", false);
            SHHSHHisTimerRunningSH14 = sharedPreferencesSH14.getBoolean("SHHSHHisTimerRunningSH14", false);
            SHHSHHcurrentHourSH14 = sharedPreferencesSH14.getInt("SHHSHHcurrentHourSH14", SHHSHHcurrentHourSH14);
            SHHSHHcurrentMinuteSH14 = sharedPreferencesSH14.getInt("SHHSHHcurrentMinuteSH14", SHHSHHcurrentMinuteSH14);

            // 恢复加時時間  測試用
            SHHblueThreshold14 = sharedPreferencesSH14.getInt("SHHblueThreshold14", originalSHHblueThresholdSH2);
            SHHyellowThreshold14 = sharedPreferencesSH14.getInt("SHHyellowThreshold14", originalSHHyellowThresholdSH2);
            SHHredThreshold14 = sharedPreferencesSH14.getInt("SHHredThreshold14", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor14();
        }
        synchronized (editorSH15) {
            boolean timerStarted15 = sharedPreferencesSH15.getBoolean(SHHSHHtimer_started_KEY_SH15, false);
            if (timerStarted15) {
                startTimeSH15 = sharedPreferencesSH15.getLong(SHHSHHSHHstart_time_KEY_SH15, 0);
                timeInMillisecondsSH15 = sharedPreferencesSH15.getLong(SHHSHHSHHelapsed_time_KEY_SH15, 0);
                secSH15 = (int) (timeInMillisecondsSH15 / 1000);
                handlerSH.postDelayed(updateTimerThread15, 0);
            }
            peopleSH_15 = sharedPreferencesSH15.getBoolean("SHHpeople_key15", false);
            flashingSH15 = sharedPreferencesSH15.getBoolean("SHHflashing_key15", false);
            flashinggSH15 = sharedPreferencesSH15.getBoolean("SHHflashingg_key15", false);
            SHHSHHisTimerRunningSH15 = sharedPreferencesSH15.getBoolean("SHHSHHisTimerRunningSH15", false);
            SHHSHHcurrentHourSH15 = sharedPreferencesSH15.getInt("SHHSHHcurrentHourSH15", SHHSHHcurrentHourSH15);
            SHHSHHcurrentMinuteSH15 = sharedPreferencesSH15.getInt("SHHSHHcurrentMinuteSH15", SHHSHHcurrentMinuteSH15);

            // 恢复加時時間  測試用
            SHHblueThreshold15 = sharedPreferencesSH15.getInt("SHHblueThreshold15", originalSHHblueThresholdSH2);
            SHHyellowThreshold15 = sharedPreferencesSH15.getInt("SHHyellowThreshold15", originalSHHyellowThresholdSH2);
            SHHredThreshold15 = sharedPreferencesSH15.getInt("SHHredThreshold15", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor15();
        }
        synchronized (editorSH16) {
            boolean timerStarted16 = sharedPreferencesSH16.getBoolean(SHHSHHtimer_started_KEY_SH16, false);
            if (timerStarted16) {
                startTimeSH16 = sharedPreferencesSH16.getLong(SHHSHHSHHstart_time_KEY_SH16, 0);
                timeInMillisecondsSH16 = sharedPreferencesSH16.getLong(SHHSHHSHHelapsed_time_KEY_SH16, 0);
                secSH16 = (int) (timeInMillisecondsSH16 / 1000);
                handlerSH.postDelayed(updateTimerThread16, 0);
            }
            peopleSH_16 = sharedPreferencesSH16.getBoolean("SHHpeople_key16", false);
            flashingSH16 = sharedPreferencesSH16.getBoolean("SHHflashing_key16", false);
            flashinggSH16 = sharedPreferencesSH16.getBoolean("SHHflashingg_key16", false);
            SHHSHHisTimerRunningSH16 = sharedPreferencesSH16.getBoolean("SHHSHHisTimerRunningSH16", false);
            SHHSHHcurrentHourSH16 = sharedPreferencesSH16.getInt("SHHSHHcurrentHourSH16", SHHSHHcurrentHourSH16);
            SHHSHHcurrentMinuteSH16 = sharedPreferencesSH16.getInt("SHHSHHcurrentMinuteSH16", SHHSHHcurrentMinuteSH16);

            // 恢复加時時間  測試用
            SHHblueThreshold16 = sharedPreferencesSH16.getInt("SHHblueThreshold16", originalSHHblueThresholdSH2);
            SHHyellowThreshold16 = sharedPreferencesSH16.getInt("SHHyellowThreshold16", originalSHHyellowThresholdSH2);
            SHHredThreshold16 = sharedPreferencesSH16.getInt("SHHredThreshold16", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor16();
        }
        synchronized (editorSH17) {
            boolean timerStarted17 = sharedPreferencesSH17.getBoolean(SHHSHHtimer_started_KEY_SH17, false);
            if (timerStarted17) {
                startTimeSH17 = sharedPreferencesSH17.getLong(SHHSHHSHHstart_time_KEY_SH17, 0);
                timeInMillisecondsSH17 = sharedPreferencesSH17.getLong(SHHSHHSHHelapsed_time_KEY_SH17, 0);
                secSH17 = (int) (timeInMillisecondsSH17 / 1000);
                handlerSH.postDelayed(updateTimerThread17, 0);
            }
            peopleSH_17 = sharedPreferencesSH17.getBoolean("SHHpeople_key17", false);
            flashingSH17 = sharedPreferencesSH17.getBoolean("SHHflashing_key17", false);
            flashinggSH17 = sharedPreferencesSH17.getBoolean("SHHflashingg_key17", false);
            SHHSHHisTimerRunningSH17 = sharedPreferencesSH17.getBoolean("SHHSHHisTimerRunningSH17", false);
            SHHSHHcurrentHourSH17 = sharedPreferencesSH17.getInt("SHHSHHcurrentHourSH17", SHHSHHcurrentHourSH17);
            SHHSHHcurrentMinuteSH17 = sharedPreferencesSH17.getInt("SHHSHHcurrentMinuteSH17", SHHSHHcurrentMinuteSH17);

            // 恢复加時時間  測試用
            SHHblueThreshold17 = sharedPreferencesSH17.getInt("SHHblueThreshold17", originalSHHblueThresholdSH2);
            SHHyellowThreshold17 = sharedPreferencesSH17.getInt("SHHyellowThreshold17", originalSHHyellowThresholdSH2);
            SHHredThreshold17 = sharedPreferencesSH17.getInt("SHHredThreshold17", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor17();
        }
        synchronized (editorSH18) {
            boolean timerStarted18 = sharedPreferencesSH18.getBoolean(SHHSHHtimer_started_KEY_SH18, false);
            if (timerStarted18) {
                startTimeSH18 = sharedPreferencesSH18.getLong(SHHSHHSHHstart_time_KEY_SH18, 0);
                timeInMillisecondsSH18 = sharedPreferencesSH18.getLong(SHHSHHSHHelapsed_time_KEY_SH18, 0);
                secSH18 = (int) (timeInMillisecondsSH18 / 1000);
                handlerSH.postDelayed(updateTimerThread18, 0);
            }
            peopleSH_18 = sharedPreferencesSH18.getBoolean("SHHpeople_key18", false);
            flashingSH18 = sharedPreferencesSH18.getBoolean("SHHflashing_key18", false);
            flashinggSH18 = sharedPreferencesSH18.getBoolean("SHHflashingg_key18", false);
            SHHSHHisTimerRunningSH18 = sharedPreferencesSH18.getBoolean("SHHSHHisTimerRunningSH18", false);
            SHHSHHcurrentHourSH18 = sharedPreferencesSH18.getInt("SHHSHHcurrentHourSH18", SHHSHHcurrentHourSH18);
            SHHSHHcurrentMinuteSH18 = sharedPreferencesSH18.getInt("SHHSHHcurrentMinuteSH18", SHHSHHcurrentMinuteSH18);

            // 恢复加時時間  測試用
            SHHblueThreshold18 = sharedPreferencesSH18.getInt("SHHblueThreshold18", originalSHHblueThresholdSH2);
            SHHyellowThreshold18 = sharedPreferencesSH18.getInt("SHHyellowThreshold18", originalSHHyellowThresholdSH2);
            SHHredThreshold18 = sharedPreferencesSH18.getInt("SHHredThreshold18", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor18();
        }
        synchronized (editorSH19) {
            boolean timerStarted19 = sharedPreferencesSH19.getBoolean(SHHSHHtimer_started_KEY_SH19, false);
            if (timerStarted19) {
                startTimeSH19 = sharedPreferencesSH19.getLong(SHHSHHSHHstart_time_KEY_SH19, 0);
                timeInMillisecondsSH19 = sharedPreferencesSH19.getLong(SHHSHHSHHelapsed_time_KEY_SH19, 0);
                secSH19 = (int) (timeInMillisecondsSH19 / 1000);
                handlerSH.postDelayed(updateTimerThread19, 0);
            }
            peopleSH_19 = sharedPreferencesSH19.getBoolean("SHHpeople_key19", false);
            flashingSH19 = sharedPreferencesSH19.getBoolean("SHHflashing_key19", false);
            flashinggSH19 = sharedPreferencesSH19.getBoolean("SHHflashingg_key19", false);
            SHHSHHisTimerRunningSH19 = sharedPreferencesSH19.getBoolean("SHHSHHisTimerRunningSH19", false);
            SHHSHHcurrentHourSH19 = sharedPreferencesSH19.getInt("SHHSHHcurrentHourSH19", SHHSHHcurrentHourSH19);
            SHHSHHcurrentMinuteSH19 = sharedPreferencesSH19.getInt("SHHSHHcurrentMinuteSH19", SHHSHHcurrentMinuteSH19);

            // 恢复加時時間  測試用
            SHHblueThreshold19 = sharedPreferencesSH19.getInt("SHHblueThreshold19", originalSHHblueThresholdSH2);
            SHHyellowThreshold19 = sharedPreferencesSH19.getInt("SHHyellowThreshold19", originalSHHyellowThresholdSH2);
            SHHredThreshold19 = sharedPreferencesSH19.getInt("SHHredThreshold19", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor19();
        }
        synchronized (editorSH20) {
            boolean timerStarted20 = sharedPreferencesSH20.getBoolean(SHHSHHtimer_started_KEY_SH20, false);
            if (timerStarted20) {
                startTimeSH20 = sharedPreferencesSH20.getLong(SHHSHHSHHstart_time_KEY_SH20, 0);
                timeInMillisecondsSH20 = sharedPreferencesSH20.getLong(SHHSHHSHHelapsed_time_KEY_SH20, 0);
                secSH20 = (int) (timeInMillisecondsSH20 / 1000);
                handlerSH.postDelayed(updateTimerThread20, 0);
            }
            peopleSH_20 = sharedPreferencesSH20.getBoolean("SHHpeople_key20", false);
            flashingSH20 = sharedPreferencesSH20.getBoolean("SHHflashing_key20", false);
            flashinggSH20 = sharedPreferencesSH20.getBoolean("SHHflashingg_key20", false);
            SHHSHHisTimerRunningSH20 = sharedPreferencesSH20.getBoolean("SHHSHHisTimerRunningSH20", false);
            SHHSHHcurrentHourSH20 = sharedPreferencesSH20.getInt("SHHSHHcurrentHourSH20", SHHSHHcurrentHourSH20);
            SHHSHHcurrentMinuteSH20 = sharedPreferencesSH20.getInt("SHHSHHcurrentMinuteSH20", SHHSHHcurrentMinuteSH20);

            // 恢复加時時間  測試用
            SHHblueThreshold20 = sharedPreferencesSH20.getInt("SHHblueThreshold20", originalSHHblueThresholdSH2);
            SHHyellowThreshold20 = sharedPreferencesSH20.getInt("SHHyellowThreshold20", originalSHHyellowThresholdSH2);
            SHHredThreshold20 = sharedPreferencesSH20.getInt("SHHredThreshold20", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor20();
        }
        synchronized (editorSH21) {
            boolean timerStarted21 = sharedPreferencesSH21.getBoolean(SHHSHHtimer_started_KEY_SH21, false);
            if (timerStarted21) {
                startTimeSH21 = sharedPreferencesSH21.getLong(SHHSHHSHHstart_time_KEY_SH21, 0);
                timeInMillisecondsSH21 = sharedPreferencesSH21.getLong(SHHSHHSHHelapsed_time_KEY_SH21, 0);
                secSH21 = (int) (timeInMillisecondsSH21 / 1000);
                handlerSH.postDelayed(updateTimerThread21, 0);
            }
            peopleSH_21 = sharedPreferencesSH21.getBoolean("SHHpeople_key21", false);
            flashingSH21 = sharedPreferencesSH21.getBoolean("SHHflashing_key21", false);
            flashinggSH21 = sharedPreferencesSH21.getBoolean("SHHflashingg_key21", false);
            SHHSHHisTimerRunningSH21 = sharedPreferencesSH21.getBoolean("SHHSHHisTimerRunningSH21", false);
            SHHSHHcurrentHourSH21 = sharedPreferencesSH21.getInt("SHHSHHcurrentHourSH21", SHHSHHcurrentHourSH21);
            SHHSHHcurrentMinuteSH21 = sharedPreferencesSH21.getInt("SHHSHHcurrentMinuteSH21", SHHSHHcurrentMinuteSH21);

            // 恢复加時時間  測試用
            SHHblueThreshold21 = sharedPreferencesSH21.getInt("SHHblueThreshold21", originalSHHblueThresholdSH2);
            SHHyellowThreshold21 = sharedPreferencesSH21.getInt("SHHyellowThreshold21", originalSHHyellowThresholdSH2);
            SHHredThreshold21 = sharedPreferencesSH21.getInt("SHHredThreshold21", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor21();
        }
        synchronized (editorSH22) {
            boolean timerStarted22 = sharedPreferencesSH22.getBoolean(SHHSHHtimer_started_KEY_SH22, false);
            if (timerStarted22) {
                startTimeSH22 = sharedPreferencesSH22.getLong(SHHSHHSHHstart_time_KEY_SH22, 0);
                timeInMillisecondsSH22 = sharedPreferencesSH22.getLong(SHHSHHSHHelapsed_time_KEY_SH22, 0);
                secSH22 = (int) (timeInMillisecondsSH22 / 1000);
                handlerSH.postDelayed(updateTimerThread22, 0);
            }
            peopleSH_22 = sharedPreferencesSH22.getBoolean("SHHpeople_key22", false);
            flashingSH22 = sharedPreferencesSH22.getBoolean("SHHflashing_key22", false);
            flashinggSH22 = sharedPreferencesSH22.getBoolean("SHHflashingg_key22", false);
            SHHSHHisTimerRunningSH22 = sharedPreferencesSH22.getBoolean("SHHSHHisTimerRunningSH22", false);
            SHHSHHcurrentHourSH22 = sharedPreferencesSH22.getInt("SHHSHHcurrentHourSH22", SHHSHHcurrentHourSH22);
            SHHSHHcurrentMinuteSH22 = sharedPreferencesSH22.getInt("SHHSHHcurrentMinuteSH22", SHHSHHcurrentMinuteSH22);

            // 恢复加時時間  測試用
            SHHblueThreshold22 = sharedPreferencesSH22.getInt("SHHblueThreshold22", originalSHHblueThresholdSH2);
            SHHyellowThreshold22 = sharedPreferencesSH22.getInt("SHHyellowThreshold22", originalSHHyellowThresholdSH2);
            SHHredThreshold22 = sharedPreferencesSH22.getInt("SHHredThreshold22", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor22();
        }
        synchronized (editorSH23) {
            boolean timerStarted23 = sharedPreferencesSH23.getBoolean(SHHSHHtimer_started_KEY_SH23, false);
            if (timerStarted23) {
                startTimeSH23 = sharedPreferencesSH23.getLong(SHHSHHSHHstart_time_KEY_SH23, 0);
                timeInMillisecondsSH23 = sharedPreferencesSH23.getLong(SHHSHHSHHelapsed_time_KEY_SH23, 0);
                secSH23 = (int) (timeInMillisecondsSH23 / 1000);
                handlerSH.postDelayed(updateTimerThread23, 0);
            }
            peopleSH_23 = sharedPreferencesSH23.getBoolean("SHHpeople_key23", false);
            flashingSH23 = sharedPreferencesSH23.getBoolean("SHHflashing_key23", false);
            flashinggSH23 = sharedPreferencesSH23.getBoolean("SHHflashingg_key23", false);
            SHHSHHisTimerRunningSH23 = sharedPreferencesSH23.getBoolean("SHHSHHisTimerRunningSH23", false);
            SHHSHHcurrentHourSH23 = sharedPreferencesSH23.getInt("SHHSHHcurrentHourSH23", SHHSHHcurrentHourSH23);
            SHHSHHcurrentMinuteSH23 = sharedPreferencesSH23.getInt("SHHSHHcurrentMinuteSH23", SHHSHHcurrentMinuteSH23);

            // 恢复加時時間  測試用
            SHHblueThreshold23 = sharedPreferencesSH23.getInt("SHHblueThreshold23", originalSHHblueThresholdSH2);
            SHHyellowThreshold23 = sharedPreferencesSH23.getInt("SHHyellowThreshold23", originalSHHyellowThresholdSH2);
            SHHredThreshold23 = sharedPreferencesSH23.getInt("SHHredThreshold23", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor23();
        }
        synchronized (editorSH24) {
            boolean timerStarted24 = sharedPreferencesSH24.getBoolean(SHHSHHtimer_started_KEY_SH24, false);
            if (timerStarted24) {
                startTimeSH24 = sharedPreferencesSH24.getLong(SHHSHHSHHstart_time_KEY_SH24, 0);
                timeInMillisecondsSH24 = sharedPreferencesSH24.getLong(SHHSHHSHHelapsed_time_KEY_SH24, 0);
                secSH24 = (int) (timeInMillisecondsSH24 / 1000);
                handlerSH.postDelayed(updateTimerThread24, 0);
            }
            peopleSH_24 = sharedPreferencesSH24.getBoolean("SHHpeople_key24", false);
            flashingSH24 = sharedPreferencesSH24.getBoolean("SHHflashing_key24", false);
            flashinggSH24 = sharedPreferencesSH24.getBoolean("SHHflashingg_key24", false);
            SHHSHHisTimerRunningSH24 = sharedPreferencesSH24.getBoolean("SHHSHHisTimerRunningSH24", false);
            SHHSHHcurrentHourSH24 = sharedPreferencesSH24.getInt("SHHSHHcurrentHourSH24", SHHSHHcurrentHourSH24);
            SHHSHHcurrentMinuteSH24 = sharedPreferencesSH24.getInt("SHHSHHcurrentMinuteSH24", SHHSHHcurrentMinuteSH24);

            // 恢复加時時間  測試用
            SHHblueThreshold24 = sharedPreferencesSH24.getInt("SHHblueThreshold24", originalSHHblueThresholdSH2);
            SHHyellowThreshold24 = sharedPreferencesSH24.getInt("SHHyellowThreshold24", originalSHHyellowThresholdSH2);
            SHHredThreshold24 = sharedPreferencesSH24.getInt("SHHredThreshold24", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor24();
        }
        synchronized (editorSH25) {
            boolean timerStarted25 = sharedPreferencesSH25.getBoolean(SHHSHHtimer_started_KEY_SH25, false);
            if (timerStarted25) {
                startTimeSH25 = sharedPreferencesSH25.getLong(SHHSHHSHHstart_time_KEY_SH25, 0);
                timeInMillisecondsSH25 = sharedPreferencesSH25.getLong(SHHSHHSHHelapsed_time_KEY_SH25, 0);
                secSH25 = (int) (timeInMillisecondsSH25 / 1000);
                handlerSH.postDelayed(updateTimerThread25, 0);
            }
            peopleSH_25 = sharedPreferencesSH25.getBoolean("SHHpeople_key25", false);
            flashingSH25 = sharedPreferencesSH25.getBoolean("SHHflashing_key25", false);
            flashinggSH25 = sharedPreferencesSH25.getBoolean("SHHflashingg_key25", false);
            SHHSHHisTimerRunningSH25 = sharedPreferencesSH25.getBoolean("SHHSHHisTimerRunningSH25", false);
            SHHSHHcurrentHourSH25 = sharedPreferencesSH25.getInt("SHHSHHcurrentHourSH25", SHHSHHcurrentHourSH25);
            SHHSHHcurrentMinuteSH25 = sharedPreferencesSH25.getInt("SHHSHHcurrentMinuteSH25", SHHSHHcurrentMinuteSH25);

            // 恢复加時時間  測試用
            SHHblueThreshold25 = sharedPreferencesSH25.getInt("SHHblueThreshold25", originalSHHblueThresholdSH2);
            SHHyellowThreshold25 = sharedPreferencesSH25.getInt("SHHyellowThreshold25", originalSHHyellowThresholdSH2);
            SHHredThreshold25 = sharedPreferencesSH25.getInt("SHHredThreshold25", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor25();
        }
        synchronized (editorSH26) {
            boolean timerStarted26 = sharedPreferencesSH26.getBoolean(SHHSHHtimer_started_KEY_SH26, false);
            if (timerStarted26) {
                startTimeSH26 = sharedPreferencesSH26.getLong(SHHSHHSHHstart_time_KEY_SH26, 0);
                timeInMillisecondsSH26 = sharedPreferencesSH26.getLong(SHHSHHSHHelapsed_time_KEY_SH26, 0);
                secSH26 = (int) (timeInMillisecondsSH26 / 1000);
                handlerSH.postDelayed(updateTimerThread26, 0);
            }
            peopleSH_26 = sharedPreferencesSH26.getBoolean("SHHpeople_key26", false);
            flashingSH26 = sharedPreferencesSH26.getBoolean("SHHflashing_key26", false);
            flashinggSH26 = sharedPreferencesSH26.getBoolean("SHHflashingg_key26", false);
            SHHSHHisTimerRunningSH26 = sharedPreferencesSH26.getBoolean("SHHSHHisTimerRunningSH26", false);
            SHHSHHcurrentHourSH26 = sharedPreferencesSH26.getInt("SHHSHHcurrentHourSH26", SHHSHHcurrentHourSH26);
            SHHSHHcurrentMinuteSH26 = sharedPreferencesSH26.getInt("SHHSHHcurrentMinuteSH26", SHHSHHcurrentMinuteSH26);

            // 恢复加時時間  測試用
            SHHblueThreshold26 = sharedPreferencesSH26.getInt("SHHblueThreshold26", originalSHHblueThresholdSH2);
            SHHyellowThreshold26 = sharedPreferencesSH26.getInt("SHHyellowThreshold26", originalSHHyellowThresholdSH2);
            SHHredThreshold26 = sharedPreferencesSH26.getInt("SHHredThreshold26", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor26();
        }
        synchronized (editorSH27) {
            boolean timerStarted27 = sharedPreferencesSH27.getBoolean(SHHSHHtimer_started_KEY_SH27, false);
            if (timerStarted27) {
                startTimeSH27 = sharedPreferencesSH27.getLong(SHHSHHSHHstart_time_KEY_SH27, 0);
                timeInMillisecondsSH27 = sharedPreferencesSH27.getLong(SHHSHHSHHelapsed_time_KEY_SH27, 0);
                secSH27 = (int) (timeInMillisecondsSH27 / 1000);
                handlerSH.postDelayed(updateTimerThread27, 0);
            }
            peopleSH_27 = sharedPreferencesSH27.getBoolean("SHHpeople_key27", false);
            flashingSH27 = sharedPreferencesSH27.getBoolean("SHHflashing_key27", false);
            flashinggSH27 = sharedPreferencesSH27.getBoolean("SHHflashingg_key27", false);
            SHHSHHisTimerRunningSH27 = sharedPreferencesSH27.getBoolean("SHHSHHisTimerRunningSH27", false);
            SHHSHHcurrentHourSH27 = sharedPreferencesSH27.getInt("SHHSHHcurrentHourSH27", SHHSHHcurrentHourSH27);
            SHHSHHcurrentMinuteSH27 = sharedPreferencesSH27.getInt("SHHSHHcurrentMinuteSH27", SHHSHHcurrentMinuteSH27);

            // 恢复加時時間  測試用
            SHHblueThreshold27 = sharedPreferencesSH27.getInt("SHHblueThreshold27", originalSHHblueThresholdSH2);
            SHHyellowThreshold27 = sharedPreferencesSH27.getInt("SHHyellowThreshold27", originalSHHyellowThresholdSH2);
            SHHredThreshold27 = sharedPreferencesSH27.getInt("SHHredThreshold27", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor27();
        }
        synchronized (editorSH28) {
            boolean timerStarted28 = sharedPreferencesSH28.getBoolean(SHHSHHtimer_started_KEY_SH28, false);
            if (timerStarted28) {
                startTimeSH28 = sharedPreferencesSH28.getLong(SHHSHHSHHstart_time_KEY_SH28, 0);
                timeInMillisecondsSH28 = sharedPreferencesSH28.getLong(SHHSHHSHHelapsed_time_KEY_SH28, 0);
                secSH28 = (int) (timeInMillisecondsSH28 / 1000);
                handlerSH.postDelayed(updateTimerThread28, 0);
            }
            peopleSH_28 = sharedPreferencesSH28.getBoolean("SHHpeople_key28", false);
            flashingSH28 = sharedPreferencesSH28.getBoolean("SHHflashing_key28", false);
            flashinggSH28 = sharedPreferencesSH28.getBoolean("SHHflashingg_key28", false);
            SHHSHHisTimerRunningSH28 = sharedPreferencesSH28.getBoolean("SHHSHHisTimerRunningSH28", false);
            SHHSHHcurrentHourSH28 = sharedPreferencesSH28.getInt("SHHSHHcurrentHourSH28", SHHSHHcurrentHourSH28);
            SHHSHHcurrentMinuteSH28 = sharedPreferencesSH28.getInt("SHHSHHcurrentMinuteSH28", SHHSHHcurrentMinuteSH28);

            // 恢复加時時間  測試用
            SHHblueThreshold28 = sharedPreferencesSH28.getInt("SHHblueThreshold28", originalSHHblueThresholdSH2);
            SHHyellowThreshold28 = sharedPreferencesSH28.getInt("SHHyellowThreshold28", originalSHHyellowThresholdSH2);
            SHHredThreshold28 = sharedPreferencesSH28.getInt("SHHredThreshold28", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor28();
        }
        synchronized (editorSH29) {
            boolean timerStarted29 = sharedPreferencesSH29.getBoolean(SHHSHHtimer_started_KEY_SH29, false);
            if (timerStarted29) {
                startTimeSH29 = sharedPreferencesSH29.getLong(SHHSHHSHHstart_time_KEY_SH29, 0);
                timeInMillisecondsSH29 = sharedPreferencesSH29.getLong(SHHSHHSHHelapsed_time_KEY_SH29, 0);
                secSH29 = (int) (timeInMillisecondsSH29 / 1000);
                handlerSH.postDelayed(updateTimerThread29, 0);
            }
            peopleSH_29 = sharedPreferencesSH29.getBoolean("SHHpeople_key29", false);
            flashingSH29 = sharedPreferencesSH29.getBoolean("SHHflashing_key29", false);
            flashinggSH29 = sharedPreferencesSH29.getBoolean("SHHflashingg_key29", false);
            SHHSHHisTimerRunningSH29 = sharedPreferencesSH29.getBoolean("SHHSHHisTimerRunningSH29", false);
            SHHSHHcurrentHourSH29 = sharedPreferencesSH29.getInt("SHHSHHcurrentHourSH29", SHHSHHcurrentHourSH29);
            SHHSHHcurrentMinuteSH29 = sharedPreferencesSH29.getInt("SHHSHHcurrentMinuteSH29", SHHSHHcurrentMinuteSH29);

            // 恢复加時時間  測試用
            SHHblueThreshold29 = sharedPreferencesSH29.getInt("SHHblueThreshold29", originalSHHblueThresholdSH2);
            SHHyellowThreshold29 = sharedPreferencesSH29.getInt("SHHyellowThreshold29", originalSHHyellowThresholdSH2);
            SHHredThreshold29 = sharedPreferencesSH29.getInt("SHHredThreshold29", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor29();
        }
        synchronized (editorSH30) {
            boolean timerStarted30 = sharedPreferencesSH30.getBoolean(SHHSHHtimer_started_KEY_SH30, false);
            if (timerStarted30) {
                startTimeSH30 = sharedPreferencesSH30.getLong(SHHSHHSHHstart_time_KEY_SH30, 0);
                timeInMillisecondsSH30 = sharedPreferencesSH30.getLong(SHHSHHSHHelapsed_time_KEY_SH30, 0);
                secSH30 = (int) (timeInMillisecondsSH30 / 1000);
                handlerSH.postDelayed(updateTimerThread30, 0);
            }
            peopleSH_30 = sharedPreferencesSH30.getBoolean("SHHpeople_key30", false);
            flashingSH30 = sharedPreferencesSH30.getBoolean("SHHflashing_key30", false);
            flashinggSH30 = sharedPreferencesSH30.getBoolean("SHHflashingg_key30", false);
            SHHSHHisTimerRunningSH30 = sharedPreferencesSH30.getBoolean("SHHSHHisTimerRunningSH30", false);
            SHHSHHcurrentHourSH30 = sharedPreferencesSH30.getInt("SHHSHHcurrentHourSH30", SHHSHHcurrentHourSH30);
            SHHSHHcurrentMinuteSH30 = sharedPreferencesSH30.getInt("SHHSHHcurrentMinuteSH30", SHHSHHcurrentMinuteSH30);

            // 恢复加時時間  測試用
            SHHblueThreshold30 = sharedPreferencesSH30.getInt("SHHblueThreshold30", originalSHHblueThresholdSH2);
            SHHyellowThreshold30 = sharedPreferencesSH30.getInt("SHHyellowThreshold30", originalSHHyellowThresholdSH2);
            SHHredThreshold30 = sharedPreferencesSH30.getInt("SHHredThreshold30", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor30();
        }
        synchronized (editorSH31) {
            boolean timerStarted31 = sharedPreferencesSH31.getBoolean(SHHSHHtimer_started_KEY_SH31, false);
            if (timerStarted31) {
                startTimeSH31 = sharedPreferencesSH31.getLong(SHHSHHSHHstart_time_KEY_SH31, 0);
                timeInMillisecondsSH31 = sharedPreferencesSH31.getLong(SHHSHHSHHelapsed_time_KEY_SH31, 0);
                secSH31 = (int) (timeInMillisecondsSH31 / 1000);
                handlerSH.postDelayed(updateTimerThread31, 0);
            }
            peopleSH_31 = sharedPreferencesSH31.getBoolean("SHHpeople_key31", false);
            flashingSH31 = sharedPreferencesSH31.getBoolean("SHHflashing_key31", false);
            flashinggSH31 = sharedPreferencesSH31.getBoolean("SHHflashingg_key31", false);
            SHHSHHisTimerRunningSH31 = sharedPreferencesSH31.getBoolean("SHHSHHisTimerRunningSH31", false);
            SHHSHHcurrentHourSH31 = sharedPreferencesSH31.getInt("SHHSHHcurrentHourSH31", SHHSHHcurrentHourSH31);
            SHHSHHcurrentMinuteSH31 = sharedPreferencesSH31.getInt("SHHSHHcurrentMinuteSH31", SHHSHHcurrentMinuteSH31);

            // 恢复加時時間  測試用
            SHHblueThreshold31 = sharedPreferencesSH31.getInt("SHHblueThreshold31", originalSHHblueThresholdSH2);
            SHHyellowThreshold31 = sharedPreferencesSH31.getInt("SHHyellowThreshold31", originalSHHyellowThresholdSH2);
            SHHredThreshold31 = sharedPreferencesSH31.getInt("SHHredThreshold31", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor31();
        }
        synchronized (editorSH32) {
            boolean timerStarted32 = sharedPreferencesSH32.getBoolean(SHHSHHtimer_started_KEY_SH32, false);
            if (timerStarted32) {
                startTimeSH32 = sharedPreferencesSH32.getLong(SHHSHHSHHstart_time_KEY_SH32, 0);
                timeInMillisecondsSH32 = sharedPreferencesSH32.getLong(SHHSHHSHHelapsed_time_KEY_SH32, 0);
                secSH32 = (int) (timeInMillisecondsSH32 / 1000);
                handlerSH.postDelayed(updateTimerThread32, 0);
            }
            peopleSH_32 = sharedPreferencesSH32.getBoolean("SHHpeople_key32", false);
            flashingSH32 = sharedPreferencesSH32.getBoolean("SHHflashing_key32", false);
            flashinggSH32 = sharedPreferencesSH32.getBoolean("SHHflashingg_key32", false);
            SHHSHHisTimerRunningSH32 = sharedPreferencesSH32.getBoolean("SHHSHHisTimerRunningSH32", false);
            SHHSHHcurrentHourSH32 = sharedPreferencesSH32.getInt("SHHSHHcurrentHourSH32", SHHSHHcurrentHourSH32);
            SHHSHHcurrentMinuteSH32 = sharedPreferencesSH32.getInt("SHHSHHcurrentMinuteSH32", SHHSHHcurrentMinuteSH32);

            // 恢复加時時間  測試用
            SHHblueThreshold32 = sharedPreferencesSH32.getInt("SHHblueThreshold32", originalSHHblueThresholdSH2);
            SHHyellowThreshold32 = sharedPreferencesSH32.getInt("SHHyellowThreshold32", originalSHHyellowThresholdSH2);
            SHHredThreshold32 = sharedPreferencesSH32.getInt("SHHredThreshold32", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor32();
        }
        synchronized (editorSH33) {
            boolean timerStarted33 = sharedPreferencesSH33.getBoolean(SHHSHHtimer_started_KEY_SH33, false);
            if (timerStarted33) {
                startTimeSH33 = sharedPreferencesSH33.getLong(SHHSHHSHHstart_time_KEY_SH33, 0);
                timeInMillisecondsSH33 = sharedPreferencesSH33.getLong(SHHSHHSHHelapsed_time_KEY_SH33, 0);
                secSH33 = (int) (timeInMillisecondsSH33 / 1000);
                handlerSH.postDelayed(updateTimerThread33, 0);
            }
            peopleSH_33 = sharedPreferencesSH33.getBoolean("SHHpeople_key33", false);
            flashingSH33 = sharedPreferencesSH33.getBoolean("SHHflashing_key33", false);
            flashinggSH33 = sharedPreferencesSH33.getBoolean("SHHflashingg_key33", false);
            SHHSHHisTimerRunningSH33 = sharedPreferencesSH33.getBoolean("SHHSHHisTimerRunningSH33", false);
            SHHSHHcurrentHourSH33 = sharedPreferencesSH33.getInt("SHHSHHcurrentHourSH33", SHHSHHcurrentHourSH33);
            SHHSHHcurrentMinuteSH33 = sharedPreferencesSH33.getInt("SHHSHHcurrentMinuteSH33", SHHSHHcurrentMinuteSH33);

            // 恢复加時時間  測試用
            SHHblueThreshold33 = sharedPreferencesSH33.getInt("SHHblueThreshold33", originalSHHblueThresholdSH2);
            SHHyellowThreshold33 = sharedPreferencesSH33.getInt("SHHyellowThreshold33", originalSHHyellowThresholdSH2);
            SHHredThreshold33 = sharedPreferencesSH33.getInt("SHHredThreshold33", originalSHHredThresholdSH2);

            // 更新按鈕的背景顏色
            updateButtonColor33();
        }

        synchronized (editor1) {
            boolean timerStarted1 = sharedPreferences1.getBoolean(SHHSHHtimer_started_KEY1, false);
            if (timerStarted1) {
                startTime1 = sharedPreferences1.getLong(SHHSHHstart_time_KEY1, 0);
                timeInMilliseconds1 = sharedPreferences1.getLong(SHHSHHelapsed_time_KEY1, 0);
                sec1 = (int) (timeInMilliseconds1 / 1000);
                handler1.postDelayed(updateTimerThread1, 0);
            }
            people2_1 = sharedPreferences1.getBoolean("SHHpeople_key1", false);
            flashing1 = sharedPreferences1.getBoolean("SHHflashing_key1", false);
            flashingg1 = sharedPreferences1.getBoolean("SHHflashingg_key1", false);
            SHHisTimerRunning1 = sharedPreferences1.getBoolean("SHHisTimerRunning1", false);
            SHHcurrentHour1 = sharedPreferences1.getInt("SHHcurrentHour1",SHHcurrentHour1);
            SHHcurrentMinute1 = sharedPreferences1.getInt("SHHcurrentMinute1",SHHcurrentMinute1);

            // 恢复加時時間  測試用
            SHHblueThreshold1 = sharedPreferences1.getInt("SHHblueThreshold1", originalSHHblueThreshold2);
            SHHyellowThreshold1 = sharedPreferences1.getInt("SHHyellowThreshold1", originalSHHyellowThreshold2);
            SHHredThreshold1 = sharedPreferences1.getInt("SHHredThreshold1", originalSHHredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor1();
        }

        synchronized (editor2) {
            boolean timerStarted2 = sharedPreferences2.getBoolean(SHHSHHtimer_started_KEY2, false);
            if (timerStarted2) {
                startTime2 = sharedPreferences2.getLong(SHHSHHstart_time_KEY2, 0);
                timeInMilliseconds2 = sharedPreferences2.getLong(SHHSHHelapsed_time_KEY2, 0);
                sec2 = (int) (timeInMilliseconds2 / 1000);
                handler1.postDelayed(updateTimerThread2, 0);
            }
            people2_2 = sharedPreferences2.getBoolean("SHHpeople_key2", false);
            flashing2 = sharedPreferences2.getBoolean("SHHflashing_key2", false);
            flashingg2 = sharedPreferences2.getBoolean("SHHflashingg_key2", false);
            SHHisTimerRunning2 = sharedPreferences2.getBoolean("SHHisTimerRunning2", false);
            SHHcurrentHour2 = sharedPreferences2.getInt("SHHcurrentHour2", SHHcurrentHour2);
            SHHcurrentMinute2 = sharedPreferences2.getInt("SHHcurrentMinute2", SHHcurrentMinute2);




            // 恢复加時時間
            SHHblueThreshold2 = sharedPreferences2.getInt("SHHblueThreshold2", originalSHHblueThreshold2);
            SHHyellowThreshold2 = sharedPreferences2.getInt("SHHyellowThreshold2", originalSHHyellowThreshold2);
            SHHredThreshold2 = sharedPreferences2.getInt("SHHredThreshold2", originalSHHredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor2();
        }

        synchronized (editor3) {
            boolean timerStarted3 = sharedPreferences3.getBoolean(SHHSHHtimer_started_KEY3, false);
            if (timerStarted3) {
                startTime3 = sharedPreferences3.getLong(SHHSHHstart_time_KEY3, 0);
                timeInMilliseconds3 = sharedPreferences3.getLong(SHHSHHelapsed_time_KEY3, 0);
                sec3 = (int) (timeInMilliseconds3 / 1000);
                handler1.postDelayed(updateTimerThread3, 0);
            }
            people2_3 = sharedPreferences3.getBoolean("SHHpeople_key3", false);
            flashing3 = sharedPreferences3.getBoolean("SHHflashing_key3", false);
            flashingg3 = sharedPreferences3.getBoolean("SHHflashingg_key3", false);
            SHHisTimerRunning3 = sharedPreferences3.getBoolean("SHHisTimerRunning3", false);
            SHHcurrentHour3 = sharedPreferences3.getInt("SHHcurrentHour3", SHHcurrentHour3);
            SHHcurrentMinute3 = sharedPreferences3.getInt("SHHcurrentMinute3", SHHcurrentMinute3);




            // 恢复加時時間
            SHHblueThreshold3 = sharedPreferences3.getInt("SHHblueThreshold3", originalSHHblueThreshold2);
            SHHyellowThreshold3 = sharedPreferences3.getInt("SHHyellowThreshold3", originalSHHyellowThreshold2);
            SHHredThreshold3 = sharedPreferences3.getInt("SHHredThreshold3", originalSHHredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor3();
        }

        synchronized (editor4) {
            boolean timerStarted4 = sharedPreferences4.getBoolean(SHHSHHtimer_started_KEY4, false);
            if (timerStarted4) {
                startTime4 = sharedPreferences4.getLong(SHHSHHstart_time_KEY4, 0);
                timeInMilliseconds4 = sharedPreferences4.getLong(SHHSHHelapsed_time_KEY4, 0);
                sec4 = (int) (timeInMilliseconds4 / 1000);
                handler1.postDelayed(updateTimerThread4, 0);
            }
            people2_4 = sharedPreferences4.getBoolean("SHHpeople_key4", false);
            flashing4 = sharedPreferences4.getBoolean("SHHflashing_key4", false);
            flashingg4 = sharedPreferences4.getBoolean("SHHflashingg_key4", false);
            SHHisTimerRunning4 = sharedPreferences4.getBoolean("SHHisTimerRunning4", false);
            SHHcurrentHour4 = sharedPreferences4.getInt("SHHcurrentHour4", SHHcurrentHour4);
            SHHcurrentMinute4 = sharedPreferences4.getInt("SHHcurrentMinute4", SHHcurrentMinute4);



            // 恢复加時時間
            SHHblueThreshold4 = sharedPreferences4.getInt("SHHblueThreshold4", originalSHHblueThreshold2);
            SHHyellowThreshold4 = sharedPreferences4.getInt("SHHyellowThreshold4", originalSHHyellowThreshold2);
            SHHredThreshold4 = sharedPreferences4.getInt("SHHredThreshold4", originalSHHredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor4();
        }

        synchronized (editor5) {
            boolean timerStarted5 = sharedPreferences5.getBoolean(SHHSHHtimer_started_KEY5, false);
            if (timerStarted5) {
                startTime5 = sharedPreferences5.getLong(SHHSHHstart_time_KEY5, 0);
                timeInMilliseconds5 = sharedPreferences5.getLong(SHHSHHelapsed_time_KEY5, 0);
                sec5 = (int) (timeInMilliseconds5 / 1000);
                handler1.postDelayed(updateTimerThread5, 0);
            }
            people2_5 = sharedPreferences5.getBoolean("SHHpeople_key5", false);
            flashing5 = sharedPreferences5.getBoolean("SHHflashing_key5", false);
            flashingg5 = sharedPreferences5.getBoolean("SHHflashingg_key5", false);
            SHHisTimerRunning5 = sharedPreferences5.getBoolean("SHHisTimerRunning5", false);
            SHHcurrentHour5 = sharedPreferences5.getInt("SHHcurrentHour5", SHHcurrentHour5);
            SHHcurrentMinute5 = sharedPreferences5.getInt("SHHcurrentMinute5", SHHcurrentMinute5);




            // 恢复加時時間
            SHHblueThreshold5 = sharedPreferences5.getInt("SHHblueThreshold5", originalSHHblueThreshold2);
            SHHyellowThreshold5 = sharedPreferences5.getInt("SHHyellowThreshold5", originalSHHyellowThreshold2);
            SHHredThreshold5 = sharedPreferences5.getInt("SHHredThreshold5", originalSHHredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor5();
        }

        synchronized (editor7) {
            boolean timerStarted7 = sharedPreferences7.getBoolean(SHHSHHtimer_started_KEY7, false);
            if (timerStarted7) {
                startTime7 = sharedPreferences7.getLong(SHHSHHstart_time_KEY7, 0);
                timeInMilliseconds7 = sharedPreferences7.getLong(SHHSHHelapsed_time_KEY7, 0);
                sec7 = (int) (timeInMilliseconds7 / 1000);
                handler1.postDelayed(updateTimerThread7, 0);
            }
            people2_7 = sharedPreferences7.getBoolean("SHHpeople_key7", false);
            flashing7 = sharedPreferences7.getBoolean("SHHflashing_key7", false);
            flashingg7 = sharedPreferences7.getBoolean("SHHflashingg_key7", false);
            SHHisTimerRunning7 = sharedPreferences7.getBoolean("SHHisTimerRunning7", false);
            SHHcurrentHour7 = sharedPreferences7.getInt("SHHcurrentHour7", SHHcurrentHour7);
            SHHcurrentMinute7 = sharedPreferences7.getInt("SHHcurrentMinute7", SHHcurrentMinute7);




            // 恢复加時時間
            SHHblueThreshold7 = sharedPreferences7.getInt("SHHblueThreshold7", originalSHHblueThreshold2);
            SHHyellowThreshold7 = sharedPreferences7.getInt("SHHyellowThreshold7", originalSHHyellowThreshold2);
            SHHredThreshold7 = sharedPreferences7.getInt("SHHredThreshold7", originalSHHredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor7();
        }

        synchronized (editor66) {
            boolean timerStarted66 = sharedPreferences66.getBoolean(SHHSHHtimer_started_KEY66, false);
            if (timerStarted66) {
                startTime66 = sharedPreferences66.getLong(SHHSHHstart_time_KEY66, 0);
                timeInMilliseconds66 = sharedPreferences66.getLong(SHHSHHelapsed_time_KEY66, 0);
                sec66 = (int) (timeInMilliseconds66 / 1000);
                handler1.postDelayed(updateTimerThread66, 0);
            }
            people2_66 = sharedPreferences66.getBoolean("SHHpeople_key66", false);
            flashing66 = sharedPreferences66.getBoolean("SHHflashing_key66", false);
            flashingg66 = sharedPreferences66.getBoolean("SHHflashingg_key66", false);
            SHHisTimerRunning66 = sharedPreferences66.getBoolean("SHHisTimerRunning66", false);
            SHHcurrentHour66 = sharedPreferences66.getInt("SHHcurrentHour66", SHHcurrentHour66);
            SHHcurrentMinute66 = sharedPreferences66.getInt("SHHcurrentMinute66", SHHcurrentMinute66);




            // 恢复加時時間
            SHHblueThreshold66 = sharedPreferences66.getInt("SHHblueThreshold66", originalSHHblueThreshold2);
            SHHyellowThreshold66 = sharedPreferences66.getInt("SHHyellowThreshold66", originalSHHyellowThreshold2);
            SHHredThreshold66 = sharedPreferences66.getInt("SHHredThreshold66", originalSHHredThreshold2);

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
                SHHSHHisTimerRunningSH101 = false;
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
                SHHSHHisTimerRunningSH101 = true;
                startTimeSH101r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime101 = Calendar.getInstance();
                SHHSHHcurrentHourSH101 = currentTime101.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH101 = currentTime101.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_101 = false;
                SHHSHHisTimerRunningSH101 = true;
                startTimeSH101r();
                flashingSH101 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH101 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH101 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH102 = false;
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
                SHHSHHisTimerRunningSH102 = true;
                startTimeSH102r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime102 = Calendar.getInstance();
                SHHSHHcurrentHourSH102 = currentTime102.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH102 = currentTime102.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_102 = false;
                SHHSHHisTimerRunningSH102 = true;
                startTimeSH102r();
                flashingSH102 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH102 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH102 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH103 = false;
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
                SHHSHHisTimerRunningSH103 = true;
                startTimeSH103r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime103 = Calendar.getInstance();
                SHHSHHcurrentHourSH103 = currentTime103.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH103 = currentTime103.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_103 = false;
                SHHSHHisTimerRunningSH103 = true;
                startTimeSH103r();
                flashingSH103 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH103 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH103 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH104 = false;
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
                SHHSHHisTimerRunningSH104 = true;
                startTimeSH104r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime104 = Calendar.getInstance();
                SHHSHHcurrentHourSH104 = currentTime104.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH104 = currentTime104.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_104 = false;
                SHHSHHisTimerRunningSH104 = true;
                startTimeSH104r();
                flashingSH104 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH104 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH104 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH105 = false;
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
                SHHSHHisTimerRunningSH105 = true;
                startTimeSH105r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime105 = Calendar.getInstance();
                SHHSHHcurrentHourSH105 = currentTime105.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH105 = currentTime105.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_105 = false;
                SHHSHHisTimerRunningSH105 = true;
                startTimeSH105r();
                flashingSH105 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH105 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH105 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH106 = false;
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
                SHHSHHisTimerRunningSH106 = true;
                startTimeSH106r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime106 = Calendar.getInstance();
                SHHSHHcurrentHourSH106 = currentTime106.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH106 = currentTime106.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_106 = false;
                SHHSHHisTimerRunningSH106 = true;
                startTimeSH106r();
                flashingSH106 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH106 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH106 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH107 = false;
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
                SHHSHHisTimerRunningSH107 = true;
                startTimeSH107r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime107 = Calendar.getInstance();
                SHHSHHcurrentHourSH107 = currentTime107.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH107 = currentTime107.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_107 = false;
                SHHSHHisTimerRunningSH107 = true;
                startTimeSH107r();
                flashingSH107 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH107 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH107 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH8 = false;
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
                SHHSHHisTimerRunningSH8 = true;
                startTimeSH8r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime8 = Calendar.getInstance();
                SHHSHHcurrentHourSH8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_8 = false;
                SHHSHHisTimerRunningSH8 = true;
                startTimeSH8r();
                flashingSH8 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH8 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH8 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH9 = false;
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
                SHHSHHisTimerRunningSH9 = true;
                startTimeSH9r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime9 = Calendar.getInstance();
                SHHSHHcurrentHourSH9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_9 = false;
                SHHSHHisTimerRunningSH9 = true;
                startTimeSH9r();
                flashingSH9 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH9 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH9 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH10 = false;
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
                SHHSHHisTimerRunningSH10 = true;
                startTimeSH10r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime10 = Calendar.getInstance();
                SHHSHHcurrentHourSH10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_10 = false;
                SHHSHHisTimerRunningSH10 = true;
                startTimeSH10r();
                flashingSH10 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH10 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH10 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH11 = false;
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
                SHHSHHisTimerRunningSH11 = true;
                startTimeSH11r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime11 = Calendar.getInstance();
                SHHSHHcurrentHourSH11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_11 = false;
                SHHSHHisTimerRunningSH11 = true;
                startTimeSH11r();
                flashingSH11 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH11 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH11 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH12 = false;
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
                SHHSHHisTimerRunningSH12 = true;
                startTimeSH12r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime12 = Calendar.getInstance();
                SHHSHHcurrentHourSH12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_12 = false;
                SHHSHHisTimerRunningSH12 = true;
                startTimeSH12r();
                flashingSH12 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH12 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH12 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH13 = false;
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
                SHHSHHisTimerRunningSH13 = true;
                startTimeSH13r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime13 = Calendar.getInstance();
                SHHSHHcurrentHourSH13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_13 = false;
                SHHSHHisTimerRunningSH13 = true;
                startTimeSH13r();
                flashingSH13 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH13 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH13 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH14 = false;
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
                SHHSHHisTimerRunningSH14 = true;
                startTimeSH14r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime14 = Calendar.getInstance();
                SHHSHHcurrentHourSH14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_14 = false;
                SHHSHHisTimerRunningSH14 = true;
                startTimeSH14r();
                flashingSH14 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH14 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH14 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH15 = false;
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
                SHHSHHisTimerRunningSH15 = true;
                startTimeSH15r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime15 = Calendar.getInstance();
                SHHSHHcurrentHourSH15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_15 = false;
                SHHSHHisTimerRunningSH15 = true;
                startTimeSH15r();
                flashingSH15 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH15 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH15 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH16 = false;
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
                SHHSHHisTimerRunningSH16 = true;
                startTimeSH16r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime16 = Calendar.getInstance();
                SHHSHHcurrentHourSH16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_16 = false;
                SHHSHHisTimerRunningSH16 = true;
                startTimeSH16r();
                flashingSH16 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH16 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH16 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH17 = false;
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
                SHHSHHisTimerRunningSH17 = true;
                startTimeSH17r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime17 = Calendar.getInstance();
                SHHSHHcurrentHourSH17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_17 = false;
                SHHSHHisTimerRunningSH17 = true;
                startTimeSH17r();
                flashingSH17 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH17 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH17 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH18 = false;
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
                SHHSHHisTimerRunningSH18 = true;
                startTimeSH18r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime18 = Calendar.getInstance();
                SHHSHHcurrentHourSH18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_18 = false;
                SHHSHHisTimerRunningSH18 = true;
                startTimeSH18r();
                flashingSH18 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH18 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH18 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH19 = false;
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
                SHHSHHisTimerRunningSH19 = true;
                startTimeSH19r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime19 = Calendar.getInstance();
                SHHSHHcurrentHourSH19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_19 = false;
                SHHSHHisTimerRunningSH19 = true;
                startTimeSH19r();
                flashingSH19 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH19 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH19 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH20 = false;
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
                SHHSHHisTimerRunningSH20 = true;
                startTimeSH20r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime20 = Calendar.getInstance();
                SHHSHHcurrentHourSH20 = currentTime20.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_20 = false;
                SHHSHHisTimerRunningSH20 = true;
                startTimeSH20r();
                flashingSH20 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH20 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH20 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH21 = false;
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
                SHHSHHisTimerRunningSH21 = true;
                startTimeSH21r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime21 = Calendar.getInstance();
                SHHSHHcurrentHourSH21 = currentTime21.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_21 = false;
                SHHSHHisTimerRunningSH21 = true;
                startTimeSH21r();
                flashingSH21 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH21 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH21 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH22 = false;
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
                SHHSHHisTimerRunningSH22 = true;
                startTimeSH22r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime22 = Calendar.getInstance();
                SHHSHHcurrentHourSH22 = currentTime22.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_22 = false;
                SHHSHHisTimerRunningSH22 = true;
                startTimeSH22r();
                flashingSH22 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH22 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH22 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH23 = false;
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
                SHHSHHisTimerRunningSH23 = true;
                startTimeSH23r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime23 = Calendar.getInstance();
                SHHSHHcurrentHourSH23 = currentTime23.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_23 = false;
                SHHSHHisTimerRunningSH23 = true;
                startTimeSH23r();
                flashingSH23 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH23 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH23 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH24 = false;
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
                SHHSHHisTimerRunningSH24 = true;
                startTimeSH24r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime24 = Calendar.getInstance();
                SHHSHHcurrentHourSH24 = currentTime24.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_24 = false;
                SHHSHHisTimerRunningSH24 = true;
                startTimeSH24r();
                flashingSH24 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH24 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH24 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH25 = false;
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
                SHHSHHisTimerRunningSH25 = true;
                startTimeSH25r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime25 = Calendar.getInstance();
                SHHSHHcurrentHourSH25 = currentTime25.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_25 = false;
                SHHSHHisTimerRunningSH25 = true;
                startTimeSH25r();
                flashingSH25 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH25 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH25 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH26 = false;
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
                SHHSHHisTimerRunningSH26 = true;
                startTimeSH26r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime26 = Calendar.getInstance();
                SHHSHHcurrentHourSH26 = currentTime26.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH26 = currentTime26.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_26 = false;
                SHHSHHisTimerRunningSH26 = true;
                startTimeSH26r();
                flashingSH26 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH26 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH26 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH27 = false;
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
                SHHSHHisTimerRunningSH27 = true;
                startTimeSH27r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime27 = Calendar.getInstance();
                SHHSHHcurrentHourSH27 = currentTime27.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH27 = currentTime27.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_27 = false;
                SHHSHHisTimerRunningSH27 = true;
                startTimeSH27r();
                flashingSH27 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH27 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH27 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH28 = false;
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
                SHHSHHisTimerRunningSH28 = true;
                startTimeSH28r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime28 = Calendar.getInstance();
                SHHSHHcurrentHourSH28 = currentTime28.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH28 = currentTime28.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_28 = false;
                SHHSHHisTimerRunningSH28 = true;
                startTimeSH28r();
                flashingSH28 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH28 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH28 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH29 = false;
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
                SHHSHHisTimerRunningSH29 = true;
                startTimeSH29r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime29 = Calendar.getInstance();
                SHHSHHcurrentHourSH29 = currentTime29.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH29 = currentTime29.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_29 = false;
                SHHSHHisTimerRunningSH29 = true;
                startTimeSH29r();
                flashingSH29 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH29 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH29 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH30 = false;
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
                SHHSHHisTimerRunningSH30 = true;
                startTimeSH30r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime30 = Calendar.getInstance();
                SHHSHHcurrentHourSH30 = currentTime30.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH30 = currentTime30.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_30 = false;
                SHHSHHisTimerRunningSH30 = true;
                startTimeSH30r();
                flashingSH30 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH30 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH30 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH31 = false;
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
                SHHSHHisTimerRunningSH31 = true;
                startTimeSH31r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime31 = Calendar.getInstance();
                SHHSHHcurrentHourSH31 = currentTime31.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH31 = currentTime31.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_31 = false;
                SHHSHHisTimerRunningSH31 = true;
                startTimeSH31r();
                flashingSH31 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH31 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH31 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH32 = false;
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
                SHHSHHisTimerRunningSH32 = true;
                startTimeSH32r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime32 = Calendar.getInstance();
                SHHSHHcurrentHourSH32 = currentTime32.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH32 = currentTime32.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_32 = false;
                SHHSHHisTimerRunningSH32 = true;
                startTimeSH32r();
                flashingSH32 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH32 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH32 = currentTime.get(Calendar.MINUTE);

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
                SHHSHHisTimerRunningSH33 = false;
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
                SHHSHHisTimerRunningSH33 = true;
                startTimeSH33r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime33 = Calendar.getInstance();
                SHHSHHcurrentHourSH33 = currentTime33.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH33 = currentTime33.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleSH_33 = false;
                SHHSHHisTimerRunningSH33 = true;
                startTimeSH33r();
                flashingSH33 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHSHHcurrentHourSH33 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHSHHcurrentMinuteSH33 = currentTime.get(Calendar.MINUTE);

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
                SHHisTimerRunning1 = false;
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
                SHHisTimerRunning2 = false;


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
                SHHisTimerRunning3 = false;

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
                SHHisTimerRunning4 = false;

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
                SHHisTimerRunning5 = false;


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
                SHHisTimerRunning7 = false;


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
                SHHisTimerRunning66 = false;

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
                SHHisTimerRunning1 = true;
                startTime1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                SHHcurrentHour1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = false;
                SHHisTimerRunning1 = true;
                startTime1r();
                flashing1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHour1 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute1 = currentTime.get(Calendar.MINUTE);

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
                people2_2 = true;SHHisTimerRunning2 = true;
                startTime2r();
                dialog.dismiss();
                Calendar currentTime2 = Calendar.getInstance();
                SHHcurrentHour2 = currentTime2.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_2 = false;SHHisTimerRunning2 = true;
                startTime2r();
                dialog.dismiss();
                flashing2 = true;
                Calendar currentTime2 = Calendar.getInstance();
                SHHcurrentHour2 = currentTime2.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute2 = currentTime2.get(Calendar.MINUTE);
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
                people2_3 = true;SHHisTimerRunning3 = true;
                startTime3r();
                dialog.dismiss();
                Calendar currentTime3 = Calendar.getInstance();
                SHHcurrentHour3 = currentTime3.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_3 = false;SHHisTimerRunning3 = true;
                startTime3r();
                dialog.dismiss();
                flashing3 = true;
                Calendar currentTime3 = Calendar.getInstance();
                SHHcurrentHour3 = currentTime3.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute3 = currentTime3.get(Calendar.MINUTE);
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
                people2_4 = true;SHHisTimerRunning4 = true;
                startTime4r();
                dialog.dismiss();
                Calendar currentTime4 = Calendar.getInstance();
                SHHcurrentHour4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_4 = false;SHHisTimerRunning4 = true;
                startTime4r();
                dialog.dismiss();
                flashing4 = true;
                Calendar currentTime4 = Calendar.getInstance();
                SHHcurrentHour4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute4 = currentTime4.get(Calendar.MINUTE);
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
                people2_5 = true;SHHisTimerRunning5 = true;
                startTime5r();
                dialog.dismiss();
                Calendar currentTime5 = Calendar.getInstance();
                SHHcurrentHour5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_5 = false;SHHisTimerRunning5 = true;
                startTime5r();
                dialog.dismiss();
                flashing5 = true;
                Calendar currentTime5 = Calendar.getInstance();
                SHHcurrentHour5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute5 = currentTime5.get(Calendar.MINUTE);
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
                people2_7 = true;SHHisTimerRunning7 = true;
                startTime7r();
                dialog.dismiss();
                Calendar currentTime7 = Calendar.getInstance();
                SHHcurrentHour7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute7 = currentTime7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_7 = false;SHHisTimerRunning7 = true;
                startTime7r();
                dialog.dismiss();
                flashing7 = true;
                Calendar currentTime7 = Calendar.getInstance();
                SHHcurrentHour7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute7 = currentTime7.get(Calendar.MINUTE);

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
                people2_66 = true;SHHisTimerRunning66 = true;
                startTime66r();
                dialog.dismiss();

                Calendar currentTime66 = Calendar.getInstance();
                SHHcurrentHour66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_66 = false;SHHisTimerRunning66 = true;
                startTime66r();
                dialog.dismiss();
                flashing66 = true;

                Calendar currentTime66 = Calendar.getInstance();
                SHHcurrentHour66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinute66 = currentTime66.get(Calendar.MINUTE);
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
        SHHyellowThreshold101 = originalSHHyellowThresholdSH2;
        SHHredThreshold101 = originalSHHredThresholdSH2;
        SHHblueThreshold101 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal102() {
        SHHyellowThreshold102 = originalSHHyellowThresholdSH2;
        SHHredThreshold102 = originalSHHredThresholdSH2;
        SHHblueThreshold102 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal103() {
        SHHyellowThreshold103 = originalSHHyellowThresholdSH2;
        SHHredThreshold103 = originalSHHredThresholdSH2;
        SHHblueThreshold103 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal104() {
        SHHyellowThreshold104 = originalSHHyellowThresholdSH2;
        SHHredThreshold104 = originalSHHredThresholdSH2;
        SHHblueThreshold104 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal105() {
        SHHyellowThreshold105 = originalSHHyellowThresholdSH2;
        SHHredThreshold105 = originalSHHredThresholdSH2;
        SHHblueThreshold105 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal106() {
        SHHyellowThreshold106 = originalSHHyellowThresholdSH2;
        SHHredThreshold106 = originalSHHredThresholdSH2;
        SHHblueThreshold106 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal107() {
        SHHyellowThreshold107 = originalSHHyellowThresholdSH2;
        SHHredThreshold107 = originalSHHredThresholdSH2;
        SHHblueThreshold107 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal8() {
        SHHyellowThreshold8 = originalSHHyellowThresholdSH2;
        SHHredThreshold8 = originalSHHredThresholdSH2;
        SHHblueThreshold8 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal9() {
        SHHyellowThreshold9 = originalSHHyellowThresholdSH2;
        SHHredThreshold9 = originalSHHredThresholdSH2;
        SHHblueThreshold9 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal10() {
        SHHyellowThreshold10 = originalSHHyellowThresholdSH2;
        SHHredThreshold10 = originalSHHredThresholdSH2;
        SHHblueThreshold10 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal11() {
        SHHyellowThreshold11 = originalSHHyellowThresholdSH2;
        SHHredThreshold11 = originalSHHredThresholdSH2;
        SHHblueThreshold11 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal12() {
        SHHyellowThreshold12 = originalSHHyellowThresholdSH2;
        SHHredThreshold12 = originalSHHredThresholdSH2;
        SHHblueThreshold12 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal13() {
        SHHyellowThreshold13 = originalSHHyellowThresholdSH2;
        SHHredThreshold13 = originalSHHredThresholdSH2;
        SHHblueThreshold13 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal14() {
        SHHyellowThreshold14 = originalSHHyellowThresholdSH2;
        SHHredThreshold14 = originalSHHredThresholdSH2;
        SHHblueThreshold14 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal15() {
        SHHyellowThreshold15 = originalSHHyellowThresholdSH2;
        SHHredThreshold15 = originalSHHredThresholdSH2;
        SHHblueThreshold15 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal16() {
        SHHyellowThreshold16 = originalSHHyellowThresholdSH2;
        SHHredThreshold16 = originalSHHredThresholdSH2;
        SHHblueThreshold16 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal17() {
        SHHyellowThreshold17 = originalSHHyellowThresholdSH2;
        SHHredThreshold17 = originalSHHredThresholdSH2;
        SHHblueThreshold17 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal18() {
        SHHyellowThreshold18 = originalSHHyellowThresholdSH2;
        SHHredThreshold18 = originalSHHredThresholdSH2;
        SHHblueThreshold18 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal19() {
        SHHyellowThreshold19 = originalSHHyellowThresholdSH2;
        SHHredThreshold19 = originalSHHredThresholdSH2;
        SHHblueThreshold19 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal20() {
        SHHyellowThreshold20 = originalSHHyellowThresholdSH2;
        SHHredThreshold20 = originalSHHredThresholdSH2;
        SHHblueThreshold20 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal21() {
        SHHyellowThreshold21 = originalSHHyellowThresholdSH2;
        SHHredThreshold21 = originalSHHredThresholdSH2;
        SHHblueThreshold21 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal22() {
        SHHyellowThreshold22 = originalSHHyellowThresholdSH2;
        SHHredThreshold22 = originalSHHredThresholdSH2;
        SHHblueThreshold22 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal23() {
        SHHyellowThreshold23 = originalSHHyellowThresholdSH2;
        SHHredThreshold23 = originalSHHredThresholdSH2;
        SHHblueThreshold23 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal24() {
        SHHyellowThreshold24 = originalSHHyellowThresholdSH2;
        SHHredThreshold24 = originalSHHredThresholdSH2;
        SHHblueThreshold24 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal25() {
        SHHyellowThreshold25 = originalSHHyellowThresholdSH2;
        SHHredThreshold25 = originalSHHredThresholdSH2;
        SHHblueThreshold25 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal26() {
        SHHyellowThreshold26 = originalSHHyellowThresholdSH2;
        SHHredThreshold26 = originalSHHredThresholdSH2;
        SHHblueThreshold26 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal27() {
        SHHyellowThreshold27 = originalSHHyellowThresholdSH2;
        SHHredThreshold27 = originalSHHredThresholdSH2;
        SHHblueThreshold27 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal28() {
        SHHyellowThreshold28 = originalSHHyellowThresholdSH2;
        SHHredThreshold28 = originalSHHredThresholdSH2;
        SHHblueThreshold28 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal29() {
        SHHyellowThreshold29 = originalSHHyellowThresholdSH2;
        SHHredThreshold29 = originalSHHredThresholdSH2;
        SHHblueThreshold29 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal30() {
        SHHyellowThreshold30 = originalSHHyellowThresholdSH2;
        SHHredThreshold30 = originalSHHredThresholdSH2;
        SHHblueThreshold30 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal31() {
        SHHyellowThreshold31 = originalSHHyellowThresholdSH2;
        SHHredThreshold31 = originalSHHredThresholdSH2;
        SHHblueThreshold31 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal32() {
        SHHyellowThreshold32 = originalSHHyellowThresholdSH2;
        SHHredThreshold32 = originalSHHredThresholdSH2;
        SHHblueThreshold32 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal33() {
        SHHyellowThreshold33 = originalSHHyellowThresholdSH2;
        SHHredThreshold33 = originalSHHredThresholdSH2;
        SHHblueThreshold33 = originalSHHblueThresholdSH2;
    }

    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalSHHyellowThreshold2
        SHHyellowThreshold1 = originalSHHyellowThreshold2;
        SHHredThreshold1 = originalSHHredThreshold2;
        SHHblueThreshold1 = originalSHHblueThreshold2;
        //SHHyellowThreshold1 = originalSHHyellowThreshold2;
        //SHHredThreshold1 = originalSHHredThreshold2;
        //SHHblueThreshold1 = originalSHHblueThreshold2;
        //此為測試用
    }
    private void resetThresholdsToOriginal2() {
        SHHyellowThreshold2 = originalSHHyellowThreshold2;
        SHHredThreshold2 = originalSHHredThreshold2;
        SHHblueThreshold2 = originalSHHblueThreshold2;
    }

    private void resetThresholdsToOriginal3() {
        SHHyellowThreshold3 = originalSHHyellowThreshold2;
        SHHredThreshold3 = originalSHHredThreshold2;
        SHHblueThreshold3 = originalSHHblueThreshold2;
    }

    private void resetThresholdsToOriginal4() {
        SHHyellowThreshold4 = originalSHHyellowThreshold2;
        SHHredThreshold4 = originalSHHredThreshold2;
        SHHblueThreshold4 = originalSHHblueThreshold2;
    }

    private void resetThresholdsToOriginal5() {
        SHHyellowThreshold5 = originalSHHyellowThreshold2;
        SHHredThreshold5 = originalSHHredThreshold2;
        SHHblueThreshold5 = originalSHHblueThreshold2;
    }

    private void resetThresholdsToOriginal7() {
        SHHyellowThreshold7 = originalSHHyellowThreshold2;
        SHHredThreshold7 = originalSHHredThreshold2;
        SHHblueThreshold7 = originalSHHblueThreshold2;
    }
    private void resetThresholdsToOriginal66() {
        SHHyellowThreshold66 = originalSHHyellowThreshold2;
        SHHredThreshold66 = originalSHHredThreshold2;
        SHHblueThreshold66 = originalSHHblueThreshold2;
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

            // 计算当前时间加上 SHHredThreshold101 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH101 * ThreeThousandSix + SHHSHHcurrentMinuteSH101 * Sixty + SHHredThreshold101;
            // 计算小时和分钟
            futureHourSH101 = totalSeconds / ThreeThousandSix;
            futureMinuteSH101 = (totalSeconds % ThreeThousandSix) / Sixty;
            // 处理超过102104小时的进位
            if (futureHourSH101 >= TwentyFour) {
                futureHourSH101 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH101, SHHSHHcurrentMinuteSH101);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH102 * ThreeThousandSix + SHHSHHcurrentMinuteSH102 * Sixty + SHHredThreshold102;
            // 计算小时和分钟
            futureHourSH102 = totalSeconds / ThreeThousandSix;
            futureMinuteSH102 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH102 >= TwentyFour) {
                futureHourSH102 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH102, SHHSHHcurrentMinuteSH102);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH103 * ThreeThousandSix + SHHSHHcurrentMinuteSH103 * Sixty + SHHredThreshold103;
            // 计算小时和分钟
            futureHourSH103 = totalSeconds / ThreeThousandSix;
            futureMinuteSH103 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH103 >= TwentyFour) {
                futureHourSH103 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH103, SHHSHHcurrentMinuteSH103);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH104 * ThreeThousandSix + SHHSHHcurrentMinuteSH104 * Sixty + SHHredThreshold104;
            // 计算小时和分钟
            futureHourSH104 = totalSeconds / ThreeThousandSix;
            futureMinuteSH104 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH104 >= TwentyFour) {
                futureHourSH104 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH104, SHHSHHcurrentMinuteSH104);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH105 * ThreeThousandSix + SHHSHHcurrentMinuteSH105 * Sixty + SHHredThreshold105;
            // 计算小时和分钟
            futureHourSH105 = totalSeconds / ThreeThousandSix;
            futureMinuteSH105 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH105 >= TwentyFour) {
                futureHourSH105 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH105, SHHSHHcurrentMinuteSH105);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH106 * ThreeThousandSix + SHHSHHcurrentMinuteSH106 * Sixty + SHHredThreshold106;
            // 计算小时和分钟
            futureHourSH106 = totalSeconds / ThreeThousandSix;
            futureMinuteSH106 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH106 >= TwentyFour) {
                futureHourSH106 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH106, SHHSHHcurrentMinuteSH106);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH107 * ThreeThousandSix + SHHSHHcurrentMinuteSH107 * Sixty + SHHredThreshold107;
            // 计算小时和分钟
            futureHourSH107 = totalSeconds / ThreeThousandSix;
            futureMinuteSH107 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH107 >= TwentyFour) {
                futureHourSH107 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH107, SHHSHHcurrentMinuteSH107);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH8 * ThreeThousandSix + SHHSHHcurrentMinuteSH8 * Sixty + SHHredThreshold8;
            // 计算小时和分钟
            futureHourSH8 = totalSeconds / ThreeThousandSix;
            futureMinuteSH8 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH8 >= TwentyFour) {
                futureHourSH8 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH8, SHHSHHcurrentMinuteSH8);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH9 * ThreeThousandSix + SHHSHHcurrentMinuteSH9 * Sixty + SHHredThreshold9;
            // 计算小时和分钟
            futureHourSH9 = totalSeconds / ThreeThousandSix;
            futureMinuteSH9 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH9 >= TwentyFour) {
                futureHourSH9 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH9, SHHSHHcurrentMinuteSH9);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH10 * ThreeThousandSix + SHHSHHcurrentMinuteSH10 * Sixty + SHHredThreshold10;
            // 计算小时和分钟
            futureHourSH10 = totalSeconds / ThreeThousandSix;
            futureMinuteSH10 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH10 >= TwentyFour) {
                futureHourSH10 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH10, SHHSHHcurrentMinuteSH10);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH11 * ThreeThousandSix + SHHSHHcurrentMinuteSH11 * Sixty + SHHredThreshold11;
            // 计算小时和分钟
            futureHourSH11 = totalSeconds / ThreeThousandSix;
            futureMinuteSH11 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH11 >= TwentyFour) {
                futureHourSH11 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH11, SHHSHHcurrentMinuteSH11);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH12 * ThreeThousandSix + SHHSHHcurrentMinuteSH12 * Sixty + SHHredThreshold12;
            // 计算小时和分钟
            futureHourSH12 = totalSeconds / ThreeThousandSix;
            futureMinuteSH12 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH12 >= TwentyFour) {
                futureHourSH12 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH12, SHHSHHcurrentMinuteSH12);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH13 * ThreeThousandSix + SHHSHHcurrentMinuteSH13 * Sixty + SHHredThreshold13;
            // 计算小时和分钟
            futureHourSH13 = totalSeconds / ThreeThousandSix;
            futureMinuteSH13 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH13 >= TwentyFour) {
                futureHourSH13 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH13, SHHSHHcurrentMinuteSH13);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH14 * ThreeThousandSix + SHHSHHcurrentMinuteSH14 * Sixty + SHHredThreshold14;
            // 计算小时和分钟
            futureHourSH14 = totalSeconds / ThreeThousandSix;
            futureMinuteSH14 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH14 >= TwentyFour) {
                futureHourSH14 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH14, SHHSHHcurrentMinuteSH14);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH15 * ThreeThousandSix + SHHSHHcurrentMinuteSH15 * Sixty + SHHredThreshold15;
            // 计算小时和分钟
            futureHourSH15 = totalSeconds / ThreeThousandSix;
            futureMinuteSH15 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH15 >= TwentyFour) {
                futureHourSH15 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH15, SHHSHHcurrentMinuteSH15);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH16 * ThreeThousandSix + SHHSHHcurrentMinuteSH16 * Sixty + SHHredThreshold16;
            // 计算小时和分钟
            futureHourSH16 = totalSeconds / ThreeThousandSix;
            futureMinuteSH16 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH16 >= TwentyFour) {
                futureHourSH16 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH16, SHHSHHcurrentMinuteSH16);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH17 * ThreeThousandSix + SHHSHHcurrentMinuteSH17 * Sixty + SHHredThreshold17;
            // 计算小时和分钟
            futureHourSH17 = totalSeconds / ThreeThousandSix;
            futureMinuteSH17 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH17 >= TwentyFour) {
                futureHourSH17 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH17, SHHSHHcurrentMinuteSH17);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH18 * ThreeThousandSix + SHHSHHcurrentMinuteSH18 * Sixty + SHHredThreshold18;
            // 计算小时和分钟
            futureHourSH18 = totalSeconds / ThreeThousandSix;
            futureMinuteSH18 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH18 >= TwentyFour) {
                futureHourSH18 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH18, SHHSHHcurrentMinuteSH18);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH19 * ThreeThousandSix + SHHSHHcurrentMinuteSH19 * Sixty + SHHredThreshold19;
            // 计算小时和分钟
            futureHourSH19 = totalSeconds / ThreeThousandSix;
            futureMinuteSH19 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH19 >= TwentyFour) {
                futureHourSH19 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH19, SHHSHHcurrentMinuteSH19);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH20 * ThreeThousandSix + SHHSHHcurrentMinuteSH20 * Sixty + SHHredThreshold20;
            // 计算小时和分钟
            futureHourSH20 = totalSeconds / ThreeThousandSix;
            futureMinuteSH20 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH20 >= TwentyFour) {
                futureHourSH20 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH20, SHHSHHcurrentMinuteSH20);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH21 * ThreeThousandSix + SHHSHHcurrentMinuteSH21 * Sixty + SHHredThreshold21;
            // 计算小时和分钟
            futureHourSH21 = totalSeconds / ThreeThousandSix;
            futureMinuteSH21 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH21 >= TwentyFour) {
                futureHourSH21 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH21, SHHSHHcurrentMinuteSH21);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH22 * ThreeThousandSix + SHHSHHcurrentMinuteSH22 * Sixty + SHHredThreshold22;
            // 计算小时和分钟
            futureHourSH22 = totalSeconds / ThreeThousandSix;
            futureMinuteSH22 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH22 >= TwentyFour) {
                futureHourSH22 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH22, SHHSHHcurrentMinuteSH22);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH23 * ThreeThousandSix + SHHSHHcurrentMinuteSH23 * Sixty + SHHredThreshold23;
            // 计算小时和分钟
            futureHourSH23 = totalSeconds / ThreeThousandSix;
            futureMinuteSH23 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH23 >= TwentyFour) {
                futureHourSH23 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH23, SHHSHHcurrentMinuteSH23);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH24 * ThreeThousandSix + SHHSHHcurrentMinuteSH24 * Sixty + SHHredThreshold24;
            // 计算小时和分钟
            futureHourSH24 = totalSeconds / ThreeThousandSix;
            futureMinuteSH24 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH24 >= TwentyFour) {
                futureHourSH24 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH24, SHHSHHcurrentMinuteSH24);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH25 * ThreeThousandSix + SHHSHHcurrentMinuteSH25 * Sixty + SHHredThreshold25;
            // 计算小时和分钟
            futureHourSH25 = totalSeconds / ThreeThousandSix;
            futureMinuteSH25 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH25 >= TwentyFour) {
                futureHourSH25 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH25, SHHSHHcurrentMinuteSH25);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH26 * ThreeThousandSix + SHHSHHcurrentMinuteSH26 * Sixty + SHHredThreshold26;
            // 计算小时和分钟
            futureHourSH26 = totalSeconds / ThreeThousandSix;
            futureMinuteSH26 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH26 >= TwentyFour) {
                futureHourSH26 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH26, SHHSHHcurrentMinuteSH26);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH27 * ThreeThousandSix + SHHSHHcurrentMinuteSH27 * Sixty + SHHredThreshold27;
            // 计算小时和分钟
            futureHourSH27 = totalSeconds / ThreeThousandSix;
            futureMinuteSH27 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH27 >= TwentyFour) {
                futureHourSH27 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH27, SHHSHHcurrentMinuteSH27);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH28 * ThreeThousandSix + SHHSHHcurrentMinuteSH28 * Sixty + SHHredThreshold28;
            // 计算小时和分钟
            futureHourSH28 = totalSeconds / ThreeThousandSix;
            futureMinuteSH28 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH28 >= TwentyFour) {
                futureHourSH28 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH28, SHHSHHcurrentMinuteSH28);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH29 * ThreeThousandSix + SHHSHHcurrentMinuteSH29 * Sixty + SHHredThreshold29;
            // 计算小时和分钟
            futureHourSH29 = totalSeconds / ThreeThousandSix;
            futureMinuteSH29 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH29 >= TwentyFour) {
                futureHourSH29 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH29, SHHSHHcurrentMinuteSH29);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH30 * ThreeThousandSix + SHHSHHcurrentMinuteSH30 * Sixty + SHHredThreshold30;
            // 计算小时和分钟
            futureHourSH30 = totalSeconds / ThreeThousandSix;
            futureMinuteSH30 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH30 >= TwentyFour) {
                futureHourSH30 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH30, SHHSHHcurrentMinuteSH30);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH31 * ThreeThousandSix + SHHSHHcurrentMinuteSH31 * Sixty + SHHredThreshold31;
            // 计算小时和分钟
            futureHourSH31 = totalSeconds / ThreeThousandSix;
            futureMinuteSH31 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH31 >= TwentyFour) {
                futureHourSH31 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH31, SHHSHHcurrentMinuteSH31);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH32 * ThreeThousandSix + SHHSHHcurrentMinuteSH32 * Sixty + SHHredThreshold32;
            // 计算小时和分钟
            futureHourSH32 = totalSeconds / ThreeThousandSix;
            futureMinuteSH32 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH32 >= TwentyFour) {
                futureHourSH32 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH32, SHHSHHcurrentMinuteSH32);
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

            // 计算当前时间加上 SHHredThreshold 后的时间（秒数）
            int totalSeconds = SHHSHHcurrentHourSH33 * ThreeThousandSix + SHHSHHcurrentMinuteSH33 * Sixty + SHHredThreshold33;
            // 计算小时和分钟
            futureHourSH33 = totalSeconds / ThreeThousandSix;
            futureMinuteSH33 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (futureHourSH33 >= TwentyFour) {
                futureHourSH33 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHSHHcurrentHourSH33, SHHSHHcurrentMinuteSH33);
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

            // 计算当前时间加上 SHHredThreshold1 后的时间（秒数）
            int totalSeconds = SHHcurrentHour1 * 60 * 60 + SHHcurrentMinute1 * 60 + SHHredThreshold1;
            // 计算小时和分钟
            futureHour1 = totalSeconds / 3600;
            futureMinute1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour1 >= 24) {
                futureHour1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour1, SHHcurrentMinute1);
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

            // 计算当前时间加上 SHHredThreshold2 后的时间（秒数）
            int totalSeconds = SHHcurrentHour2 * 60 * 60 + SHHcurrentMinute2 * 60 + SHHredThreshold2;
            // 计算小时和分钟
            futureHour2 = totalSeconds / 3600;
            futureMinute2 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour2 >= 24) {
                futureHour2 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour2, SHHcurrentMinute2);
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

// 计算当前时间加上 SHHredThreshold3 后的时间（秒数）
            int totalSeconds = SHHcurrentHour3 * 60 * 60 + SHHcurrentMinute3 * 60 + SHHredThreshold3;
            // 计算小时和分钟
            futureHour3 = totalSeconds / 3600;
            futureMinute3 = (totalSeconds % 3600) / 60;
            // 处理超过34小时的进位
            if (futureHour3 >= 24) {
                futureHour3 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour3, SHHcurrentMinute3);
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


            // 计算当前时间加上 SHHredThreshold4 后的时间（秒数）
            int totalSeconds = SHHcurrentHour4 * 60 * 60 + SHHcurrentMinute4 * 60 + SHHredThreshold4;
            // 计算小时和分钟
            futureHour4 = totalSeconds / 3600;
            futureMinute4 = (totalSeconds % 3600) / 60;
            // 处理超过44小时的进位
            if (futureHour4 >= 24) {
                futureHour4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour4, SHHcurrentMinute4);
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



            // 计算当前时间加上 SHHredThreshold5 后的时间（秒数）
            int totalSeconds = SHHcurrentHour5 * 60 * 60 + SHHcurrentMinute5 * 60 + SHHredThreshold5;
            // 计算小时和分钟
            futureHour5 = totalSeconds / 3600;
            futureMinute5 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour5 >= 24) {
                futureHour5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour5, SHHcurrentMinute5);
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



            // 计算当前时间加上 SHHredThreshold6 后的时间（秒数）
            int totalSeconds = SHHcurrentHour7 * 60 * 60 + SHHcurrentMinute7 * 60 + SHHredThreshold7;
            // 计算小时和分钟
            futureHour7 = totalSeconds / 3600;
            futureMinute7 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour7 >= 24) {
                futureHour7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour7, SHHcurrentMinute7);
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


            // 计算当前时间加上 SHHredThreshold6 后的时间（秒数）
            int totalSeconds = SHHcurrentHour66 * 60 * 60 + SHHcurrentMinute66 * 60 + SHHredThreshold66;
            // 计算小时和分钟
            futureHour66 = totalSeconds / 3600;
            futureMinute66 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour66 >= 24) {
                futureHour66 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHour66, SHHcurrentMinute66);
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime101(Time1);

                    if(secSH101 >= SHHblueThreshold101){
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

                    if(secSH101 >= SHHblueThreshold101){
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
        SHHyellowThreshold101 += secondsToAdd;
        SHHredThreshold101 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime102(Time1);

                    if(secSH102 >= SHHblueThreshold102){
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

                    if(secSH102 >= SHHblueThreshold102){
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
        SHHyellowThreshold102 += secondsToAdd;
        SHHredThreshold102 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime103(Time1);

                    if(secSH103 >= SHHblueThreshold103){
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

                    if(secSH103 >= SHHblueThreshold103){
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
        SHHyellowThreshold103 += secondsToAdd;
        SHHredThreshold103 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime104(Time1);

                    if(secSH104 >= SHHblueThreshold104){
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

                    if(secSH104 >= SHHblueThreshold104){
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
        SHHyellowThreshold104 += secondsToAdd;
        SHHredThreshold104 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime105(Time1);

                    if(secSH105 >= SHHblueThreshold105){
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

                    if(secSH105 >= SHHblueThreshold105){
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
        SHHyellowThreshold105 += secondsToAdd;
        SHHredThreshold105 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime106(Time1);

                    if(secSH106 >= SHHblueThreshold106){
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

                    if(secSH106 >= SHHblueThreshold106){
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
        SHHyellowThreshold106 += secondsToAdd;
        SHHredThreshold106 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime107(Time1);

                    if(secSH107 >= SHHblueThreshold107){
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

                    if(secSH107 >= SHHblueThreshold107){
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
        SHHyellowThreshold107 += secondsToAdd;
        SHHredThreshold107 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime8(Time1);

                    if(secSH8 >= SHHblueThreshold8){
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

                    if(secSH8 >= SHHblueThreshold8){
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
        SHHyellowThreshold8 += secondsToAdd;
        SHHredThreshold8 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime9(Time1);

                    if(secSH9 >= SHHblueThreshold9){
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

                    if(secSH9 >= SHHblueThreshold9){
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
        SHHyellowThreshold9 += secondsToAdd;
        SHHredThreshold9 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime10(Time1);

                    if(secSH10 >= SHHblueThreshold10){
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

                    if(secSH10 >= SHHblueThreshold10){
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
        SHHyellowThreshold10 += secondsToAdd;
        SHHredThreshold10 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime11(Time1);

                    if(secSH11 >= SHHblueThreshold11){
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

                    if(secSH11 >= SHHblueThreshold11){
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
        SHHyellowThreshold11 += secondsToAdd;
        SHHredThreshold11 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime12(Time1);

                    if(secSH12 >= SHHblueThreshold12){
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

                    if(secSH12 >= SHHblueThreshold12){
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
        SHHyellowThreshold12 += secondsToAdd;
        SHHredThreshold12 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime13(Time1);

                    if(secSH13 >= SHHblueThreshold13){
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

                    if(secSH13 >= SHHblueThreshold13){
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
        SHHyellowThreshold13 += secondsToAdd;
        SHHredThreshold13 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime14(Time1);

                    if(secSH14 >= SHHblueThreshold14){
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

                    if(secSH14 >= SHHblueThreshold14){
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
        SHHyellowThreshold14 += secondsToAdd;
        SHHredThreshold14 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime15(Time1);

                    if(secSH15 >= SHHblueThreshold15){
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

                    if(secSH15 >= SHHblueThreshold15){
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
        SHHyellowThreshold15 += secondsToAdd;
        SHHredThreshold15 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime16(Time1);

                    if(secSH16 >= SHHblueThreshold16){
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

                    if(secSH16 >= SHHblueThreshold16){
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
        SHHyellowThreshold16 += secondsToAdd;
        SHHredThreshold16 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime17(Time1);

                    if(secSH17 >= SHHblueThreshold17){
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

                    if(secSH17 >= SHHblueThreshold17){
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
        SHHyellowThreshold17 += secondsToAdd;
        SHHredThreshold17 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime18(Time1);

                    if(secSH18 >= SHHblueThreshold18){
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

                    if(secSH18 >= SHHblueThreshold18){
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
        SHHyellowThreshold18 += secondsToAdd;
        SHHredThreshold18 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime19(Time1);

                    if(secSH19 >= SHHblueThreshold19){
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

                    if(secSH19 >= SHHblueThreshold19){
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
        SHHyellowThreshold19 += secondsToAdd;
        SHHredThreshold19 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime20(Time1);

                    if(secSH20 >= SHHblueThreshold20){
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

                    if(secSH20 >= SHHblueThreshold20){
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
        SHHyellowThreshold20 += secondsToAdd;
        SHHredThreshold20 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime21(Time1);

                    if(secSH21 >= SHHblueThreshold21){
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

                    if(secSH21 >= SHHblueThreshold21){
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
        SHHyellowThreshold21 += secondsToAdd;
        SHHredThreshold21 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime22(Time1);

                    if(secSH22 >= SHHblueThreshold22){
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

                    if(secSH22 >= SHHblueThreshold22){
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
        SHHyellowThreshold22 += secondsToAdd;
        SHHredThreshold22 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime23(Time1);

                    if(secSH23 >= SHHblueThreshold23){
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

                    if(secSH23 >= SHHblueThreshold23){
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
        SHHyellowThreshold23 += secondsToAdd;
        SHHredThreshold23 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime24(Time1);

                    if(secSH24 >= SHHblueThreshold24){
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

                    if(secSH24 >= SHHblueThreshold24){
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
        SHHyellowThreshold24 += secondsToAdd;
        SHHredThreshold24 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime25(Time1);

                    if(secSH25 >= SHHblueThreshold25){
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

                    if(secSH25 >= SHHblueThreshold25){
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
        SHHyellowThreshold25 += secondsToAdd;
        SHHredThreshold25 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime26(Time1);

                    if(secSH26 >= SHHblueThreshold26){
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

                    if(secSH26 >= SHHblueThreshold26){
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
        SHHyellowThreshold26 += secondsToAdd;
        SHHredThreshold26 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime27(Time1);

                    if(secSH27 >= SHHblueThreshold27){
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

                    if(secSH27 >= SHHblueThreshold27){
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
        SHHyellowThreshold27 += secondsToAdd;
        SHHredThreshold27 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime28(Time1);

                    if(secSH28 >= SHHblueThreshold28){
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

                    if(secSH28 >= SHHblueThreshold28){
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
        SHHyellowThreshold28 += secondsToAdd;
        SHHredThreshold28 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime29(Time1);

                    if(secSH29 >= SHHblueThreshold29){
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

                    if(secSH29 >= SHHblueThreshold29){
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
        SHHyellowThreshold29 += secondsToAdd;
        SHHredThreshold29 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime30(Time1);

                    if(secSH30 >= SHHblueThreshold30){
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

                    if(secSH30 >= SHHblueThreshold30){
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
        SHHyellowThreshold30 += secondsToAdd;
        SHHredThreshold30 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime31(Time1);

                    if(secSH31 >= SHHblueThreshold31){
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

                    if(secSH31 >= SHHblueThreshold31){
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
        SHHyellowThreshold31 += secondsToAdd;
        SHHredThreshold31 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime32(Time1);

                    if(secSH32 >= SHHblueThreshold32){
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

                    if(secSH32 >= SHHblueThreshold32){
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
        SHHyellowThreshold32 += secondsToAdd;
        SHHredThreshold32 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime33(Time1);

                    if(secSH33 >= SHHblueThreshold33){
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

                    if(secSH33 >= SHHblueThreshold33){
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
        SHHyellowThreshold33 += secondsToAdd;
        SHHredThreshold33 += secondsToAdd;
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime1(time1);//time1

                    if(sec1 >= SHHblueThreshold1){
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

                    if(sec1 >= SHHblueThreshold1){
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime2(time1);

                    if (sec2 >= SHHblueThreshold2) {
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
                    if (sec2 >= SHHblueThreshold2) {
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime3(time1); // Customize the time for button 3


                    if (sec3 >= SHHblueThreshold3) {
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

                    if (sec3 >= SHHblueThreshold3) {
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime4(time1); // Customize the time for button 4


                    if (sec4 >= SHHblueThreshold4) {
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


                    if (sec4 >= SHHblueThreshold4) {
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime5(time1); // Customize the time for button 5



                    if (sec5 >= SHHblueThreshold5) {
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

                    if (sec5 >= SHHblueThreshold5) {
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime7(time1); // Customize the time for button 7



                    if (sec7 >= SHHblueThreshold7) {
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

                    if (sec7 >= SHHblueThreshold7) {
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
        SPH.CustomArrayAdapter adapter = new SPH.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime66(time1); // Customize the time for button 66

                    if (sec66 >= SHHblueThreshold66) {
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

                    if (sec66 >= SHHblueThreshold66) {
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
        //SHHblueThreshold1 += secondsToAdd;
        SHHyellowThreshold1 += secondsToAdd;
        SHHredThreshold1 += secondsToAdd;
        updateButtonColor1();
    }
    private void addTime2(int secondsToAdd) {
        //SHHblueThreshold2 += secondsToAdd;
        SHHyellowThreshold2 += secondsToAdd;
        SHHredThreshold2 += secondsToAdd;

        updateButtonColor2();
    }

    private void addTime3(int secondsToAdd) {
        //SHHblueThreshold3 += secondsToAdd; // Customize for button 3
        SHHyellowThreshold3 += secondsToAdd; // Customize for button 3
        SHHredThreshold3 += secondsToAdd; // Customize for button 3

        updateButtonColor3();
    }

    private void addTime4(int secondsToAdd) {
        //SHHblueThreshold4 += secondsToAdd; // Customize for button 4
        SHHyellowThreshold4 += secondsToAdd; // Customize for button 4
        SHHredThreshold4 += secondsToAdd; // Customize for button 4

        updateButtonColor4();
    }
    private void addTime5(int secondsToAdd) {
        //SHHblueThreshold5 += secondsToAdd; // Customize for button 5
        SHHyellowThreshold5 += secondsToAdd; // Customize for button 5
        SHHredThreshold5 += secondsToAdd; // Customize for button 5

        updateButtonColor5();
    }

    private void addTime7(int secondsToAdd) {
        //SHHblueThreshold7 += secondsToAdd; // Customize for button 7
        SHHyellowThreshold7 += secondsToAdd; // Customize for button 7
        SHHredThreshold7 += secondsToAdd; // Customize for button 7

        updateButtonColor7();
    }


    private void addTime66(int secondsToAdd) {
        //SHHblueThreshold66 += secondsToAdd; // Customize for button 66
        SHHyellowThreshold66 += secondsToAdd; // Customize for button 66
        SHHredThreshold66 += secondsToAdd; // Customize for button 66


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor66();
    }



    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------

    final private double check = 0.01;
    private void updateButtonColor101() {
        if (secSH101 < check) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secSH101 < SHHblueThreshold101 && peopleSH_101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH101 < SHHblueThreshold101 && !peopleSH_101 ) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH101 < SHHyellowThreshold101 && peopleSH_101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH101 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH101.startAnimation(blinkAnimation);
            }else{
                btnTimerSH101.clearAnimation();
            }
        } else if (secSH101 < SHHyellowThreshold101 && !peopleSH_101) {
            btnTimerSH101.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH101 < SHHredThreshold101) {
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
        } else if (secSH102 < SHHblueThreshold102 && peopleSH_102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH102 < SHHblueThreshold102 && !peopleSH_102 ) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH102 < SHHyellowThreshold102 && peopleSH_102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH102 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH102.startAnimation(blinkAnimation);
            }else{
                btnTimerSH102.clearAnimation();
            }
        } else if (secSH102 < SHHyellowThreshold102 && !peopleSH_102) {
            btnTimerSH102.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH102 < SHHredThreshold102) {
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
        } else if (secSH103 < SHHblueThreshold103 && peopleSH_103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH103 < SHHblueThreshold103 && !peopleSH_103 ) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH103 < SHHyellowThreshold103 && peopleSH_103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH103 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH103.startAnimation(blinkAnimation);
            }else{
                btnTimerSH103.clearAnimation();
            }
        } else if (secSH103 < SHHyellowThreshold103 && !peopleSH_103) {
            btnTimerSH103.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH103 < SHHredThreshold103) {
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
        } else if (secSH104 < SHHblueThreshold104 && peopleSH_104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH104 < SHHblueThreshold104 && !peopleSH_104 ) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH104 < SHHyellowThreshold104 && peopleSH_104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH104 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH104.startAnimation(blinkAnimation);
            }else{
                btnTimerSH104.clearAnimation();
            }
        } else if (secSH104 < SHHyellowThreshold104 && !peopleSH_104) {
            btnTimerSH104.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH104 < SHHredThreshold104) {
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
        } else if (secSH105 < SHHblueThreshold105 && peopleSH_105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH105 < SHHblueThreshold105 && !peopleSH_105 ) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH105 < SHHyellowThreshold105 && peopleSH_105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH105 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH105.startAnimation(blinkAnimation);
            }else{
                btnTimerSH105.clearAnimation();
            }
        } else if (secSH105 < SHHyellowThreshold105 && !peopleSH_105) {
            btnTimerSH105.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH105 < SHHredThreshold105) {
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
        } else if (secSH106 < SHHblueThreshold106 && peopleSH_106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH106 < SHHblueThreshold106 && !peopleSH_106 ) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH106 < SHHyellowThreshold106 && peopleSH_106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH106 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH106.startAnimation(blinkAnimation);
            }else{
                btnTimerSH106.clearAnimation();
            }
        } else if (secSH106 < SHHyellowThreshold106 && !peopleSH_106) {
            btnTimerSH106.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH106 < SHHredThreshold106) {
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
        } else if (secSH107 < SHHblueThreshold107 && peopleSH_107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH107 < SHHblueThreshold107 && !peopleSH_107 ) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH107 < SHHyellowThreshold107 && peopleSH_107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH107 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH107.startAnimation(blinkAnimation);
            }else{
                btnTimerSH107.clearAnimation();
            }
        } else if (secSH107 < SHHyellowThreshold107 && !peopleSH_107) {
            btnTimerSH107.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH107 < SHHredThreshold107) {
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
        } else if (secSH8 < SHHblueThreshold8 && peopleSH_8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH8 < SHHblueThreshold8 && !peopleSH_8 ) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH8 < SHHyellowThreshold8 && peopleSH_8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH8.startAnimation(blinkAnimation);
            }else{
                btnTimerSH8.clearAnimation();
            }
        } else if (secSH8 < SHHyellowThreshold8 && !peopleSH_8) {
            btnTimerSH8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH8 < SHHredThreshold8) {
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
        } else if (secSH9 < SHHblueThreshold9 && peopleSH_9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH9 < SHHblueThreshold9 && !peopleSH_9 ) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH9 < SHHyellowThreshold9 && peopleSH_9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH9.startAnimation(blinkAnimation);
            }else{
                btnTimerSH9.clearAnimation();
            }
        } else if (secSH9 < SHHyellowThreshold9 && !peopleSH_9) {
            btnTimerSH9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH9 < SHHredThreshold9) {
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
        } else if (secSH10 < SHHblueThreshold10 && peopleSH_10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH10 < SHHblueThreshold10 && !peopleSH_10 ) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH10 < SHHyellowThreshold10 && peopleSH_10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH10.startAnimation(blinkAnimation);
            }else{
                btnTimerSH10.clearAnimation();
            }
        } else if (secSH10 < SHHyellowThreshold10 && !peopleSH_10) {
            btnTimerSH10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH10 < SHHredThreshold10) {
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
        } else if (secSH11 < SHHblueThreshold11 && peopleSH_11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH11 < SHHblueThreshold11 && !peopleSH_11 ) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH11 < SHHyellowThreshold11 && peopleSH_11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH11.startAnimation(blinkAnimation);
            }else{
                btnTimerSH11.clearAnimation();
            }
        } else if (secSH11 < SHHyellowThreshold11 && !peopleSH_11) {
            btnTimerSH11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH11 < SHHredThreshold11) {
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
        } else if (secSH12 < SHHblueThreshold12 && peopleSH_12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH12 < SHHblueThreshold12 && !peopleSH_12 ) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH12 < SHHyellowThreshold12 && peopleSH_12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH12 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH12.startAnimation(blinkAnimation);
            }else{
                btnTimerSH12.clearAnimation();
            }
        } else if (secSH12 < SHHyellowThreshold12 && !peopleSH_12) {
            btnTimerSH12.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH12 < SHHredThreshold12) {
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
        } else if (secSH13 < SHHblueThreshold13 && peopleSH_13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH13 < SHHblueThreshold13 && !peopleSH_13 ) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH13 < SHHyellowThreshold13 && peopleSH_13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH13 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH13.startAnimation(blinkAnimation);
            }else{
                btnTimerSH13.clearAnimation();
            }
        } else if (secSH13 < SHHyellowThreshold13 && !peopleSH_13) {
            btnTimerSH13.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH13 < SHHredThreshold13) {
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
        } else if (secSH14 < SHHblueThreshold14 && peopleSH_14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH14 < SHHblueThreshold14 && !peopleSH_14 ) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH14 < SHHyellowThreshold14 && peopleSH_14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH14 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH14.startAnimation(blinkAnimation);
            }else{
                btnTimerSH14.clearAnimation();
            }
        } else if (secSH14 < SHHyellowThreshold14 && !peopleSH_14) {
            btnTimerSH14.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH14 < SHHredThreshold14) {
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
        } else if (secSH15 < SHHblueThreshold15 && peopleSH_15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH15 < SHHblueThreshold15 && !peopleSH_15 ) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH15 < SHHyellowThreshold15 && peopleSH_15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH15 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH15.startAnimation(blinkAnimation);
            }else{
                btnTimerSH15.clearAnimation();
            }
        } else if (secSH15 < SHHyellowThreshold15 && !peopleSH_15) {
            btnTimerSH15.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH15 < SHHredThreshold15) {
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
        } else if (secSH16 < SHHblueThreshold16 && peopleSH_16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH16 < SHHblueThreshold16 && !peopleSH_16 ) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH16 < SHHyellowThreshold16 && peopleSH_16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH16.startAnimation(blinkAnimation);
            }else{
                btnTimerSH16.clearAnimation();
            }
        } else if (secSH16 < SHHyellowThreshold16 && !peopleSH_16) {
            btnTimerSH16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH16 < SHHredThreshold16) {
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
        } else if (secSH17 < SHHblueThreshold17 && peopleSH_17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH17 < SHHblueThreshold17 && !peopleSH_17 ) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH17 < SHHyellowThreshold17 && peopleSH_17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH17.startAnimation(blinkAnimation);
            }else{
                btnTimerSH17.clearAnimation();
            }
        } else if (secSH17 < SHHyellowThreshold17 && !peopleSH_17) {
            btnTimerSH17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH17 < SHHredThreshold17) {
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
        } else if (secSH18 < SHHblueThreshold18 && peopleSH_18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH18 < SHHblueThreshold18 && !peopleSH_18 ) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH18 < SHHyellowThreshold18 && peopleSH_18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH18.startAnimation(blinkAnimation);
            }else{
                btnTimerSH18.clearAnimation();
            }
        } else if (secSH18 < SHHyellowThreshold18 && !peopleSH_18) {
            btnTimerSH18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH18 < SHHredThreshold18) {
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
        } else if (secSH19 < SHHblueThreshold19 && peopleSH_19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH19 < SHHblueThreshold19 && !peopleSH_19 ) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH19 < SHHyellowThreshold19 && peopleSH_19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH19.startAnimation(blinkAnimation);
            }else{
                btnTimerSH19.clearAnimation();
            }
        } else if (secSH19 < SHHyellowThreshold19 && !peopleSH_19) {
            btnTimerSH19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH19 < SHHredThreshold19) {
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
        } else if (secSH20 < SHHblueThreshold20 && peopleSH_20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH20 < SHHblueThreshold20 && !peopleSH_20 ) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH20 < SHHyellowThreshold20 && peopleSH_20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH20.startAnimation(blinkAnimation);
            }else{
                btnTimerSH20.clearAnimation();
            }
        } else if (secSH20 < SHHyellowThreshold20 && !peopleSH_20) {
            btnTimerSH20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH20 < SHHredThreshold20) {
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
        } else if (secSH21 < SHHblueThreshold21 && peopleSH_21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH21 < SHHblueThreshold21 && !peopleSH_21 ) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH21 < SHHyellowThreshold21 && peopleSH_21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH21.startAnimation(blinkAnimation);
            }else{
                btnTimerSH21.clearAnimation();
            }
        } else if (secSH21 < SHHyellowThreshold21 && !peopleSH_21) {
            btnTimerSH21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH21 < SHHredThreshold21) {
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
        } else if (secSH22 < SHHblueThreshold22 && peopleSH_22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH22 < SHHblueThreshold22 && !peopleSH_22 ) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH22 < SHHyellowThreshold22 && peopleSH_22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH22.startAnimation(blinkAnimation);
            }else{
                btnTimerSH22.clearAnimation();
            }
        } else if (secSH22 < SHHyellowThreshold22 && !peopleSH_22) {
            btnTimerSH22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH22 < SHHredThreshold22) {
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
        } else if (secSH23 < SHHblueThreshold23 && peopleSH_23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH23 < SHHblueThreshold23 && !peopleSH_23 ) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH23 < SHHyellowThreshold23 && peopleSH_23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH23.startAnimation(blinkAnimation);
            }else{
                btnTimerSH23.clearAnimation();
            }
        } else if (secSH23 < SHHyellowThreshold23 && !peopleSH_23) {
            btnTimerSH23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH23 < SHHredThreshold23) {
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
        } else if (secSH24 < SHHblueThreshold24 && peopleSH_24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH24 < SHHblueThreshold24 && !peopleSH_24 ) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH24 < SHHyellowThreshold24 && peopleSH_24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH24.startAnimation(blinkAnimation);
            }else{
                btnTimerSH24.clearAnimation();
            }
        } else if (secSH24 < SHHyellowThreshold24 && !peopleSH_24) {
            btnTimerSH24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH24 < SHHredThreshold24) {
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
        } else if (secSH25 < SHHblueThreshold25 && peopleSH_25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH25 < SHHblueThreshold25 && !peopleSH_25 ) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH25 < SHHyellowThreshold25 && peopleSH_25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH25.startAnimation(blinkAnimation);
            }else{
                btnTimerSH25.clearAnimation();
            }
        } else if (secSH25 < SHHyellowThreshold25 && !peopleSH_25) {
            btnTimerSH25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH25 < SHHredThreshold25) {
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
        } else if (secSH26 < SHHblueThreshold26 && peopleSH_26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH26 < SHHblueThreshold26 && !peopleSH_26 ) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH26 < SHHyellowThreshold26 && peopleSH_26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH26.startAnimation(blinkAnimation);
            }else{
                btnTimerSH26.clearAnimation();
            }
        } else if (secSH26 < SHHyellowThreshold26 && !peopleSH_26) {
            btnTimerSH26.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH26 < SHHredThreshold26) {
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
        } else if (secSH27 < SHHblueThreshold27 && peopleSH_27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH27 < SHHblueThreshold27 && !peopleSH_27 ) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH27 < SHHyellowThreshold27 && peopleSH_27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH27.startAnimation(blinkAnimation);
            }else{
                btnTimerSH27.clearAnimation();
            }
        } else if (secSH27 < SHHyellowThreshold27 && !peopleSH_27) {
            btnTimerSH27.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH27 < SHHredThreshold27) {
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
        } else if (secSH28 < SHHblueThreshold28 && peopleSH_28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH28 < SHHblueThreshold28 && !peopleSH_28 ) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH28 < SHHyellowThreshold28 && peopleSH_28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH28.startAnimation(blinkAnimation);
            }else{
                btnTimerSH28.clearAnimation();
            }
        } else if (secSH28 < SHHyellowThreshold28 && !peopleSH_28) {
            btnTimerSH28.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH28 < SHHredThreshold28) {
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
        } else if (secSH29 < SHHblueThreshold29 && peopleSH_29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH29 < SHHblueThreshold29 && !peopleSH_29 ) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH29 < SHHyellowThreshold29 && peopleSH_29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH29 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH29.startAnimation(blinkAnimation);
            }else{
                btnTimerSH29.clearAnimation();
            }
        } else if (secSH29 < SHHyellowThreshold29 && !peopleSH_29) {
            btnTimerSH29.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH29 < SHHredThreshold29) {
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
        } else if (secSH30 < SHHblueThreshold30 && peopleSH_30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH30 < SHHblueThreshold30 && !peopleSH_30 ) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH30 < SHHyellowThreshold30 && peopleSH_30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH30 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH30.startAnimation(blinkAnimation);
            }else{
                btnTimerSH30.clearAnimation();
            }
        } else if (secSH30 < SHHyellowThreshold30 && !peopleSH_30) {
            btnTimerSH30.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH30 < SHHredThreshold30) {
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
        } else if (secSH31 < SHHblueThreshold31 && peopleSH_31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH31 < SHHblueThreshold31 && !peopleSH_31 ) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH31 < SHHyellowThreshold31 && peopleSH_31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH31 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH31.startAnimation(blinkAnimation);
            }else{
                btnTimerSH31.clearAnimation();
            }
        } else if (secSH31 < SHHyellowThreshold31 && !peopleSH_31) {
            btnTimerSH31.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH31 < SHHredThreshold31) {
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
        } else if (secSH32 < SHHblueThreshold32 && peopleSH_32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH32 < SHHblueThreshold32 && !peopleSH_32 ) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH32 < SHHyellowThreshold32 && peopleSH_32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH32 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH32.startAnimation(blinkAnimation);
            }else{
                btnTimerSH32.clearAnimation();
            }
        } else if (secSH32 < SHHyellowThreshold32 && !peopleSH_32) {
            btnTimerSH32.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH32 < SHHredThreshold32) {
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
        } else if (secSH33 < SHHblueThreshold33 && peopleSH_33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secSH33 < SHHblueThreshold33 && !peopleSH_33 ) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH33 < SHHyellowThreshold33 && peopleSH_33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingSH33 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerSH33.startAnimation(blinkAnimation);
            }else{
                btnTimerSH33.clearAnimation();
            }
        } else if (secSH33 < SHHyellowThreshold33 && !peopleSH_33) {
            btnTimerSH33.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secSH33 < SHHredThreshold33) {
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
        } else if (sec1 < SHHblueThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec1 < SHHblueThreshold1 && !people2_1 ) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < SHHyellowThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else if (sec1 < SHHyellowThreshold1 && !people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < SHHredThreshold1) {
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
        } else if (sec2 < SHHblueThreshold2 && people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec2 < SHHblueThreshold2 && !people2_2 ) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec2 < SHHyellowThreshold2 && people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer2.startAnimation(blinkAnimation);
            }else{
                btnTimer2.clearAnimation();
            }
        } else if (sec2 < SHHyellowThreshold2 && !people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec2 < SHHredThreshold2) {
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
        } else if (sec3 < SHHblueThreshold3 && people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec3 < SHHblueThreshold3 && !people2_3 ) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec3 < SHHyellowThreshold3 && people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer3.startAnimation(blinkAnimation);
            }else{
                btnTimer3.clearAnimation();
            }


        } else if (sec3 < SHHyellowThreshold3 && !people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec3 < SHHredThreshold3) {
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
        } else if (sec4 < SHHblueThreshold4 && people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec4 < SHHblueThreshold4 && !people2_4 ) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec4 < SHHyellowThreshold4 && people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer4.startAnimation(blinkAnimation);
            }else{
                btnTimer4.clearAnimation();
            }


        } else if (sec4 < SHHyellowThreshold4 && !people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec4 < SHHredThreshold4) {
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
        } else if (sec5 < SHHblueThreshold5 && people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec5 < SHHblueThreshold5 && !people2_5 ) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec5 < SHHyellowThreshold5 && people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer5.startAnimation(blinkAnimation);
            }else{
                btnTimer5.clearAnimation();
            }


        } else if (sec5 < SHHyellowThreshold5 && !people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec5 < SHHredThreshold5) {
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
        } else if (sec7 < SHHblueThreshold7 && people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec7 < SHHblueThreshold7 && !people2_7 ) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec7 < SHHyellowThreshold7 && people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer7.startAnimation(blinkAnimation);
            }else{
                btnTimer7.clearAnimation();
            }


        } else if (sec7 < SHHyellowThreshold7 && !people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec7 < SHHredThreshold7) {
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
        } else if (sec66 < SHHblueThreshold66 && people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec66 < SHHblueThreshold66 && !people2_66 ) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec66 < SHHyellowThreshold66 && people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer66.startAnimation(blinkAnimation);
            }else{
                btnTimer66.clearAnimation();
            }


        } else if (sec66 < SHHyellowThreshold66 && !people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec66 < SHHredThreshold66) {
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
