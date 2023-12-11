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

public class SoupHouseHoliday extends AppCompatActivity {

    private int ssss = 100;
    private int delay = 1000;
    private int Blue = 12 * ssss;
    private int Yellow = 24 * ssss;
    private int Red = 30 * ssss;
    private int Time1SHH = 18 * ssss;
    private int Time2SHH = 36 * ssss;
    //-------------------------------
    public boolean SHHpeopleSHH_101;
    private SharedPreferences SHHsharedPreferencesSHH101;
    private SharedPreferences.Editor SHHeditorSHH101;
    private static final String SHHTIMER_STARTED_KEY_SHH101 = "timer_startedSHH101";
    private static final String SHHSTART_TIME_KEY_SHH101 = "start_timeSHH101";
    private static final String SHHELAPSED_TIME_KEY_SHH101 = "elapsed_timeSHH101";

    public boolean SHHpeopleSHH_102;
    private SharedPreferences SHHsharedPreferencesSHH102;
    private SharedPreferences.Editor SHHeditorSHH102;
    private static final String SHHTIMER_STARTED_KEY_SHH102 = "timer_startedSHH102";
    private static final String SHHSTART_TIME_KEY_SHH102 = "start_timeSHH102";
    private static final String SHHELAPSED_TIME_KEY_SHH102 = "elapsed_timeSHH102";

    public boolean SHHpeopleSHH_103;
    private SharedPreferences SHHsharedPreferencesSHH103;
    private SharedPreferences.Editor SHHeditorSHH103;
    private static final String SHHTIMER_STARTED_KEY_SHH103 = "timer_startedSHH103";
    private static final String SHHSTART_TIME_KEY_SHH103 = "start_timeSHH103";
    private static final String SHHELAPSED_TIME_KEY_SHH103 = "elapsed_timeSHH103";

    public boolean SHHpeopleSHH_104;
    private SharedPreferences SHHsharedPreferencesSHH104;
    private SharedPreferences.Editor SHHeditorSHH104;
    private static final String SHHTIMER_STARTED_KEY_SHH104 = "timer_startedSHH104";
    private static final String SHHSTART_TIME_KEY_SHH104 = "start_timeSHH104";
    private static final String SHHELAPSED_TIME_KEY_SHH104 = "elapsed_timeSHH104";

    public boolean SHHpeopleSHH_105;
    private SharedPreferences SHHsharedPreferencesSHH105;
    private SharedPreferences.Editor SHHeditorSHH105;
    private static final String SHHTIMER_STARTED_KEY_SHH105 = "timer_startedSHH105";
    private static final String SHHSTART_TIME_KEY_SHH105 = "start_timeSHH105";
    private static final String SHHELAPSED_TIME_KEY_SHH105 = "elapsed_timeSHH105";

    public boolean SHHpeopleSHH_106;
    private SharedPreferences SHHsharedPreferencesSHH106;
    private SharedPreferences.Editor SHHeditorSHH106;
    private static final String SHHTIMER_STARTED_KEY_SHH106 = "timer_startedSHH106";
    private static final String SHHSTART_TIME_KEY_SHH106 = "start_timeSHH106";
    private static final String SHHELAPSED_TIME_KEY_SHH106 = "elapsed_timeSHH106";

    public boolean SHHpeopleSHH_107;
    private SharedPreferences SHHsharedPreferencesSHH107;
    private SharedPreferences.Editor SHHeditorSHH107;
    private static final String SHHTIMER_STARTED_KEY_SHH107 = "timer_startedSHH107";
    private static final String SHHSTART_TIME_KEY_SHH107 = "start_timeSHH107";
    private static final String SHHELAPSED_TIME_KEY_SHH107 = "elapsed_timeSHH107";

    public boolean SHHpeopleSHH_8;
    private SharedPreferences SHHsharedPreferencesSHH8;
    private SharedPreferences.Editor SHHeditorSHH8;
    private static final String SHHTIMER_STARTED_KEY_SHH8 = "timer_startedSHH8";
    private static final String SHHSTART_TIME_KEY_SHH8 = "start_timeSHH8";
    private static final String SHHELAPSED_TIME_KEY_SHH8 = "elapsed_timeSHH8";

    public boolean SHHpeopleSHH_9;
    private SharedPreferences SHHsharedPreferencesSHH9;
    private SharedPreferences.Editor SHHeditorSHH9;
    private static final String SHHTIMER_STARTED_KEY_SHH9 = "timer_startedSHH9";
    private static final String SHHSTART_TIME_KEY_SHH9 = "start_timeSHH9";
    private static final String SHHELAPSED_TIME_KEY_SHH9 = "elapsed_timeSHH9";

    public boolean SHHpeopleSHH_10;
    private SharedPreferences SHHsharedPreferencesSHH10;
    private SharedPreferences.Editor SHHeditorSHH10;
    private static final String SHHTIMER_STARTED_KEY_SHH10 = "timer_startedSHH10";
    private static final String SHHSTART_TIME_KEY_SHH10 = "start_timeSHH10";
    private static final String SHHELAPSED_TIME_KEY_SHH10 = "elapsed_timeSHH10";

    public boolean SHHpeopleSHH_11;
    private SharedPreferences SHHsharedPreferencesSHH11;
    private SharedPreferences.Editor SHHeditorSHH11;
    private static final String SHHTIMER_STARTED_KEY_SHH11 = "timer_startedSHH11";
    private static final String SHHSTART_TIME_KEY_SHH11 = "start_timeSHH11";
    private static final String SHHELAPSED_TIME_KEY_SHH11 = "elapsed_timeSHH11";

    public boolean SHHpeopleSHH_12;
    private SharedPreferences SHHsharedPreferencesSHH12;
    private SharedPreferences.Editor SHHeditorSHH12;
    private static final String SHHTIMER_STARTED_KEY_SHH12 = "timer_startedSHH12";
    private static final String SHHSTART_TIME_KEY_SHH12 = "start_timeSHH12";
    private static final String SHHELAPSED_TIME_KEY_SHH12 = "elapsed_timeSHH12";

    public boolean SHHpeopleSHH_13;
    private SharedPreferences SHHsharedPreferencesSHH13;
    private SharedPreferences.Editor SHHeditorSHH13;
    private static final String SHHTIMER_STARTED_KEY_SHH13 = "timer_startedSHH13";
    private static final String SHHSTART_TIME_KEY_SHH13 = "start_timeSHH13";
    private static final String SHHELAPSED_TIME_KEY_SHH13 = "elapsed_timeSHH13";

    public boolean SHHpeopleSHH_14;
    private SharedPreferences SHHsharedPreferencesSHH14;
    private SharedPreferences.Editor SHHeditorSHH14;
    private static final String SHHTIMER_STARTED_KEY_SHH14 = "timer_startedSHH14";
    private static final String SHHSTART_TIME_KEY_SHH14 = "start_timeSHH14";
    private static final String SHHELAPSED_TIME_KEY_SHH14 = "elapsed_timeSHH14";

    public boolean SHHpeopleSHH_15;
    private SharedPreferences SHHsharedPreferencesSHH15;
    private SharedPreferences.Editor SHHeditorSHH15;
    private static final String SHHTIMER_STARTED_KEY_SHH15 = "timer_startedSHH15";
    private static final String SHHSTART_TIME_KEY_SHH15 = "start_timeSHH15";
    private static final String SHHELAPSED_TIME_KEY_SHH15 = "elapsed_timeSHH15";

    public boolean SHHpeopleSHH_16;
    private SharedPreferences SHHsharedPreferencesSHH16;
    private SharedPreferences.Editor SHHeditorSHH16;
    private static final String SHHTIMER_STARTED_KEY_SHH16 = "timer_startedSHH16";
    private static final String SHHSTART_TIME_KEY_SHH16 = "start_timeSHH16";
    private static final String SHHELAPSED_TIME_KEY_SHH16 = "elapsed_timeSHH16";

    public boolean SHHpeopleSHH_17;
    private SharedPreferences SHHsharedPreferencesSHH17;
    private SharedPreferences.Editor SHHeditorSHH17;
    private static final String SHHTIMER_STARTED_KEY_SHH17 = "timer_startedSHH17";
    private static final String SHHSTART_TIME_KEY_SHH17 = "start_timeSHH17";
    private static final String SHHELAPSED_TIME_KEY_SHH17 = "elapsed_timeSHH17";

    public boolean SHHpeopleSHH_18;
    private SharedPreferences SHHsharedPreferencesSHH18;
    private SharedPreferences.Editor SHHeditorSHH18;
    private static final String SHHTIMER_STARTED_KEY_SHH18 = "timer_startedSHH18";
    private static final String SHHSTART_TIME_KEY_SHH18 = "start_timeSHH18";
    private static final String SHHELAPSED_TIME_KEY_SHH18 = "elapsed_timeSHH18";

    public boolean SHHpeopleSHH_19;
    private SharedPreferences SHHsharedPreferencesSHH19;
    private SharedPreferences.Editor SHHeditorSHH19;
    private static final String SHHTIMER_STARTED_KEY_SHH19 = "timer_startedSHH19";
    private static final String SHHSTART_TIME_KEY_SHH19 = "start_timeSHH19";
    private static final String SHHELAPSED_TIME_KEY_SHH19 = "elapsed_timeSHH19";

    public boolean SHHpeopleSHH_20;
    private SharedPreferences SHHsharedPreferencesSHH20;
    private SharedPreferences.Editor SHHeditorSHH20;
    private static final String SHHTIMER_STARTED_KEY_SHH20 = "timer_startedSHH20";
    private static final String SHHSTART_TIME_KEY_SHH20 = "start_timeSHH20";
    private static final String SHHELAPSED_TIME_KEY_SHH20 = "elapsed_timeSHH20";

    public boolean SHHpeopleSHH_21;
    private SharedPreferences SHHsharedPreferencesSHH21;
    private SharedPreferences.Editor SHHeditorSHH21;
    private static final String SHHTIMER_STARTED_KEY_SHH21 = "timer_startedSHH21";
    private static final String SHHSTART_TIME_KEY_SHH21 = "start_timeSHH21";
    private static final String SHHELAPSED_TIME_KEY_SHH21 = "elapsed_timeSHH21";

    public boolean SHHpeopleSHH_22;
    private SharedPreferences SHHsharedPreferencesSHH22;
    private SharedPreferences.Editor SHHeditorSHH22;
    private static final String SHHTIMER_STARTED_KEY_SHH22 = "timer_startedSHH22";
    private static final String SHHSTART_TIME_KEY_SHH22 = "start_timeSHH22";
    private static final String SHHELAPSED_TIME_KEY_SHH22 = "elapsed_timeSHH22";

    public boolean SHHpeopleSHH_23;
    private SharedPreferences SHHsharedPreferencesSHH23;
    private SharedPreferences.Editor SHHeditorSHH23;
    private static final String SHHTIMER_STARTED_KEY_SHH23 = "timer_startedSHH23";
    private static final String SHHSTART_TIME_KEY_SHH23 = "start_timeSHH23";
    private static final String SHHELAPSED_TIME_KEY_SHH23 = "elapsed_timeSHH23";

    public boolean SHHpeopleSHH_24;
    private SharedPreferences SHHsharedPreferencesSHH24;
    private SharedPreferences.Editor SHHeditorSHH24;
    private static final String SHHTIMER_STARTED_KEY_SHH24 = "timer_startedSHH24";
    private static final String SHHSTART_TIME_KEY_SHH24 = "start_timeSHH24";
    private static final String SHHELAPSED_TIME_KEY_SHH24 = "elapsed_timeSHH24";

    public boolean SHHpeopleSHH_25;
    private SharedPreferences SHHsharedPreferencesSHH25;
    private SharedPreferences.Editor SHHeditorSHH25;
    private static final String SHHTIMER_STARTED_KEY_SHH25 = "timer_startedSHH25";
    private static final String SHHSTART_TIME_KEY_SHH25 = "start_timeSHH25";
    private static final String SHHELAPSED_TIME_KEY_SHH25 = "elapsed_timeSHH25";

    public boolean SHHpeopleSHH_26;
    private SharedPreferences SHHsharedPreferencesSHH26;
    private SharedPreferences.Editor SHHeditorSHH26;
    private static final String SHHTIMER_STARTED_KEY_SHH26 = "timer_startedSHH26";
    private static final String SHHSTART_TIME_KEY_SHH26 = "start_timeSHH26";
    private static final String SHHELAPSED_TIME_KEY_SHH26 = "elapsed_timeSHH26";

    public boolean SHHpeopleSHH_27;
    private SharedPreferences SHHsharedPreferencesSHH27;
    private SharedPreferences.Editor SHHeditorSHH27;
    private static final String SHHTIMER_STARTED_KEY_SHH27 = "timer_startedSHH27";
    private static final String SHHSTART_TIME_KEY_SHH27 = "start_timeSHH27";
    private static final String SHHELAPSED_TIME_KEY_SHH27 = "elapsed_timeSHH27";

    public boolean SHHpeopleSHH_28;
    private SharedPreferences SHHsharedPreferencesSHH28;
    private SharedPreferences.Editor SHHeditorSHH28;
    private static final String SHHTIMER_STARTED_KEY_SHH28 = "timer_startedSHH28";
    private static final String SHHSTART_TIME_KEY_SHH28 = "start_timeSHH28";
    private static final String SHHELAPSED_TIME_KEY_SHH28 = "elapsed_timeSHH28";

    public boolean SHHpeopleSHH_29;
    private SharedPreferences SHHsharedPreferencesSHH29;
    private SharedPreferences.Editor SHHeditorSHH29;
    private static final String SHHTIMER_STARTED_KEY_SHH29 = "timer_startedSHH29";
    private static final String SHHSTART_TIME_KEY_SHH29 = "start_timeSHH29";
    private static final String SHHELAPSED_TIME_KEY_SHH29 = "elapsed_timeSHH29";

    public boolean SHHpeopleSHH_30;
    private SharedPreferences SHHsharedPreferencesSHH30;
    private SharedPreferences.Editor SHHeditorSHH30;
    private static final String SHHTIMER_STARTED_KEY_SHH30 = "timer_startedSHH30";
    private static final String SHHSTART_TIME_KEY_SHH30 = "start_timeSHH30";
    private static final String SHHELAPSED_TIME_KEY_SHH30 = "elapsed_timeSHH30";

    public boolean SHHpeopleSHH_31;
    private SharedPreferences SHHsharedPreferencesSHH31;
    private SharedPreferences.Editor SHHeditorSHH31;
    private static final String SHHTIMER_STARTED_KEY_SHH31 = "timer_startedSHH31";
    private static final String SHHSTART_TIME_KEY_SHH31 = "start_timeSHH31";
    private static final String SHHELAPSED_TIME_KEY_SHH31 = "elapsed_timeSHH31";

    public boolean SHHpeopleSHH_32;
    private SharedPreferences SHHsharedPreferencesSHH32;
    private SharedPreferences.Editor SHHeditorSHH32;
    private static final String SHHTIMER_STARTED_KEY_SHH32 = "timer_startedSHH32";
    private static final String SHHSTART_TIME_KEY_SHH32 = "start_timeSHH32";
    private static final String SHHELAPSED_TIME_KEY_SHH32 = "elapsed_timeSHH32";

    public boolean SHHpeopleSHH_33;
    private SharedPreferences SHHsharedPreferencesSHH33;
    private SharedPreferences.Editor SHHeditorSHH33;
    private static final String SHHTIMER_STARTED_KEY_SHH33 = "timer_startedSHH33";
    private static final String SHHSTART_TIME_KEY_SHH33 = "start_timeSHH33";
    private static final String SHHELAPSED_TIME_KEY_SHH33 = "elapsed_timeSHH33";

    //----------------------------------------------------------------------------
    private Handler SHHhandlerSHH = new Handler();
    private int originalSHHblueThresholdSHH2 = Blue;
    private int originalSHHyellowThresholdSHH2 = Yellow;
    private int originalSHHredThresholdSHH2 = Red;
    //----------------------------------------------------------------------------
    private long SHHstartTimeSHH101 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH101 = 0L;
    private long SHHupdatedTimeSHH101 = 0L;
    private int SHHsecondsSHH101 = 0;
    private int SHHsecSHH101 = 0;
    private int SHHminutesSHH101 = 0;
    private int SHHhoursSHH101 = 0;
    private Button SHHbtnTimerSHH101;
    private int SHHblueThresholdSHH101 = Blue;
    private int SHHyellowThresholdSHH101 = Yellow;
    private int SHHredThresholdSHH101 = Red;
    private boolean SHHisTimerRunningSHH101 = false;

    private long SHHstartTimeSHH102 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH102 = 0L;
    private long SHHupdatedTimeSHH102 = 0L;
    private int SHHsecondsSHH102 = 0;
    private int SHHsecSHH102 = 0;
    private int SHHminutesSHH102 = 0;
    private int SHHhoursSHH102 = 0;
    private Button SHHbtnTimerSHH102;
    private int SHHblueThresholdSHH102 = Blue;
    private int SHHyellowThresholdSHH102 = Yellow;
    private int SHHredThresholdSHH102 = Red;
    private boolean SHHisTimerRunningSHH102 = false;

    private long SHHstartTimeSHH103 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH103 = 0L;
    private long SHHupdatedTimeSHH103 = 0L;
    private int SHHsecondsSHH103 = 0;
    private int SHHsecSHH103 = 0;
    private int SHHminutesSHH103 = 0;
    private int SHHhoursSHH103 = 0;
    private Button SHHbtnTimerSHH103;
    private int SHHblueThresholdSHH103 = Blue;
    private int SHHyellowThresholdSHH103 = Yellow;
    private int SHHredThresholdSHH103 = Red;
    private boolean SHHisTimerRunningSHH103 = false;

    private long SHHstartTimeSHH104 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH104 = 0L;
    private long SHHupdatedTimeSHH104 = 0L;
    private int SHHsecondsSHH104 = 0;
    private int SHHsecSHH104 = 0;
    private int SHHminutesSHH104 = 0;
    private int SHHhoursSHH104 = 0;
    private Button SHHbtnTimerSHH104;
    private int SHHblueThresholdSHH104 = Blue;
    private int SHHyellowThresholdSHH104 = Yellow;
    private int SHHredThresholdSHH104 = Red;
    private boolean SHHisTimerRunningSHH104 = false;

    private long SHHstartTimeSHH105 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH105 = 0L;
    private long SHHupdatedTimeSHH105 = 0L;
    private int SHHsecondsSHH105 = 0;
    private int SHHsecSHH105 = 0;
    private int SHHminutesSHH105 = 0;
    private int SHHhoursSHH105 = 0;
    private Button SHHbtnTimerSHH105;
    private int SHHblueThresholdSHH105 = Blue;
    private int SHHyellowThresholdSHH105 = Yellow;
    private int SHHredThresholdSHH105 = Red;
    private boolean SHHisTimerRunningSHH105 = false;

    private long SHHstartTimeSHH106 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH106 = 0L;
    private long SHHupdatedTimeSHH106 = 0L;
    private int SHHsecondsSHH106 = 0;
    private int SHHsecSHH106 = 0;
    private int SHHminutesSHH106 = 0;
    private int SHHhoursSHH106 = 0;
    private Button SHHbtnTimerSHH106;
    private int SHHblueThresholdSHH106 = Blue;
    private int SHHyellowThresholdSHH106 = Yellow;
    private int SHHredThresholdSHH106 = Red;
    private boolean SHHisTimerRunningSHH106 = false;

    private long SHHstartTimeSHH107 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH107 = 0L;
    private long SHHupdatedTimeSHH107 = 0L;
    private int SHHsecondsSHH107 = 0;
    private int SHHsecSHH107 = 0;
    private int SHHminutesSHH107 = 0;
    private int SHHhoursSHH107 = 0;
    private Button SHHbtnTimerSHH107;
    private int SHHblueThresholdSHH107 = Blue;
    private int SHHyellowThresholdSHH107 = Yellow;
    private int SHHredThresholdSHH107 = Red;
    private boolean SHHisTimerRunningSHH107 = false;

    private long SHHstartTimeSHH8 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH8 = 0L;
    private long SHHupdatedTimeSHH8 = 0L;
    private int SHHsecondsSHH8 = 0;
    private int SHHsecSHH8 = 0;
    private int SHHminutesSHH8 = 0;
    private int SHHhoursSHH8 = 0;
    private Button SHHbtnTimerSHH8;
    private int SHHblueThresholdSHH8 = Blue;
    private int SHHyellowThresholdSHH8 = Yellow;
    private int SHHredThresholdSHH8 = Red;
    private boolean SHHisTimerRunningSHH8 = false;

    private long SHHstartTimeSHH9 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH9 = 0L;
    private long SHHupdatedTimeSHH9 = 0L;
    private int SHHsecondsSHH9 = 0;
    private int SHHsecSHH9 = 0;
    private int SHHminutesSHH9 = 0;
    private int SHHhoursSHH9 = 0;
    private Button SHHbtnTimerSHH9;
    private int SHHblueThresholdSHH9 = Blue;
    private int SHHyellowThresholdSHH9 = Yellow;
    private int SHHredThresholdSHH9 = Red;
    private boolean SHHisTimerRunningSHH9 = false;

    private long SHHstartTimeSHH10 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH10 = 0L;
    private long SHHupdatedTimeSHH10 = 0L;
    private int SHHsecondsSHH10 = 0;
    private int SHHsecSHH10 = 0;
    private int SHHminutesSHH10 = 0;
    private int SHHhoursSHH10 = 0;
    private Button SHHbtnTimerSHH10;
    private int SHHblueThresholdSHH10 = Blue;
    private int SHHyellowThresholdSHH10 = Yellow;
    private int SHHredThresholdSHH10 = Red;
    private boolean SHHisTimerRunningSHH10 = false;

    private long SHHstartTimeSHH11 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH11 = 0L;
    private long SHHupdatedTimeSHH11 = 0L;
    private int SHHsecondsSHH11 = 0;
    private int SHHsecSHH11 = 0;
    private int SHHminutesSHH11 = 0;
    private int SHHhoursSHH11 = 0;
    private Button SHHbtnTimerSHH11;
    private int SHHblueThresholdSHH11 = Blue;
    private int SHHyellowThresholdSHH11 = Yellow;
    private int SHHredThresholdSHH11 = Red;
    private boolean SHHisTimerRunningSHH11 = false;

    private long SHHstartTimeSHH12 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH12 = 0L;
    private long SHHupdatedTimeSHH12 = 0L;
    private int SHHsecondsSHH12 = 0;
    private int SHHsecSHH12 = 0;
    private int SHHminutesSHH12 = 0;
    private int SHHhoursSHH12 = 0;
    private Button SHHbtnTimerSHH12;
    private int SHHblueThresholdSHH12 = Blue;
    private int SHHyellowThresholdSHH12 = Yellow;
    private int SHHredThresholdSHH12 = Red;
    private boolean SHHisTimerRunningSHH12 = false;

    private long SHHstartTimeSHH13 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH13 = 0L;
    private long SHHupdatedTimeSHH13 = 0L;
    private int SHHsecondsSHH13 = 0;
    private int SHHsecSHH13 = 0;
    private int SHHminutesSHH13 = 0;
    private int SHHhoursSHH13 = 0;
    private Button SHHbtnTimerSHH13;
    private int SHHblueThresholdSHH13 = Blue;
    private int SHHyellowThresholdSHH13 = Yellow;
    private int SHHredThresholdSHH13 = Red;
    private boolean SHHisTimerRunningSHH13 = false;

    private long SHHstartTimeSHH14 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH14 = 0L;
    private long SHHupdatedTimeSHH14 = 0L;
    private int SHHsecondsSHH14 = 0;
    private int SHHsecSHH14 = 0;
    private int SHHminutesSHH14 = 0;
    private int SHHhoursSHH14 = 0;
    private Button SHHbtnTimerSHH14;
    private int SHHblueThresholdSHH14 = Blue;
    private int SHHyellowThresholdSHH14 = Yellow;
    private int SHHredThresholdSHH14 = Red;
    private boolean SHHisTimerRunningSHH14 = false;

    private long SHHstartTimeSHH15 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH15 = 0L;
    private long SHHupdatedTimeSHH15 = 0L;
    private int SHHsecondsSHH15 = 0;
    private int SHHsecSHH15 = 0;
    private int SHHminutesSHH15 = 0;
    private int SHHhoursSHH15 = 0;
    private Button SHHbtnTimerSHH15;
    private int SHHblueThresholdSHH15 = Blue;
    private int SHHyellowThresholdSHH15 = Yellow;
    private int SHHredThresholdSHH15 = Red;
    private boolean SHHisTimerRunningSHH15 = false;

    private long SHHstartTimeSHH16 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH16 = 0L;
    private long SHHupdatedTimeSHH16 = 0L;
    private int SHHsecondsSHH16 = 0;
    private int SHHsecSHH16 = 0;
    private int SHHminutesSHH16 = 0;
    private int SHHhoursSHH16 = 0;
    private Button SHHbtnTimerSHH16;
    private int SHHblueThresholdSHH16 = Blue;
    private int SHHyellowThresholdSHH16 = Yellow;
    private int SHHredThresholdSHH16 = Red;
    private boolean SHHisTimerRunningSHH16 = false;

    private long SHHstartTimeSHH17 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH17 = 0L;
    private long SHHupdatedTimeSHH17 = 0L;
    private int SHHsecondsSHH17 = 0;
    private int SHHsecSHH17 = 0;
    private int SHHminutesSHH17 = 0;
    private int SHHhoursSHH17 = 0;
    private Button SHHbtnTimerSHH17;
    private int SHHblueThresholdSHH17 = Blue;
    private int SHHyellowThresholdSHH17 = Yellow;
    private int SHHredThresholdSHH17 = Red;
    private boolean SHHisTimerRunningSHH17 = false;

    private long SHHstartTimeSHH18 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH18 = 0L;
    private long SHHupdatedTimeSHH18 = 0L;
    private int SHHsecondsSHH18 = 0;
    private int SHHsecSHH18 = 0;
    private int SHHminutesSHH18 = 0;
    private int SHHhoursSHH18 = 0;
    private Button SHHbtnTimerSHH18;
    private int SHHblueThresholdSHH18 = Blue;
    private int SHHyellowThresholdSHH18 = Yellow;
    private int SHHredThresholdSHH18 = Red;
    private boolean SHHisTimerRunningSHH18 = false;

    private long SHHstartTimeSHH19 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH19 = 0L;
    private long SHHupdatedTimeSHH19 = 0L;
    private int SHHsecondsSHH19 = 0;
    private int SHHsecSHH19 = 0;
    private int SHHminutesSHH19 = 0;
    private int SHHhoursSHH19 = 0;
    private Button SHHbtnTimerSHH19;
    private int SHHblueThresholdSHH19 = Blue;
    private int SHHyellowThresholdSHH19 = Yellow;
    private int SHHredThresholdSHH19 = Red;
    private boolean SHHisTimerRunningSHH19 = false;

    private long SHHstartTimeSHH20 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH20 = 0L;
    private long SHHupdatedTimeSHH20 = 0L;
    private int SHHsecondsSHH20 = 0;
    private int SHHsecSHH20 = 0;
    private int SHHminutesSHH20 = 0;
    private int SHHhoursSHH20 = 0;
    private Button SHHbtnTimerSHH20;
    private int SHHblueThresholdSHH20 = Blue;
    private int SHHyellowThresholdSHH20 = Yellow;
    private int SHHredThresholdSHH20 = Red;
    private boolean SHHisTimerRunningSHH20 = false;

    private long SHHstartTimeSHH21 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH21 = 0L;
    private long SHHupdatedTimeSHH21 = 0L;
    private int SHHsecondsSHH21 = 0;
    private int SHHsecSHH21 = 0;
    private int SHHminutesSHH21 = 0;
    private int SHHhoursSHH21 = 0;
    private Button SHHbtnTimerSHH21;
    private int SHHblueThresholdSHH21 = Blue;
    private int SHHyellowThresholdSHH21 = Yellow;
    private int SHHredThresholdSHH21 = Red;
    private boolean SHHisTimerRunningSHH21 = false;

    private long SHHstartTimeSHH22 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH22 = 0L;
    private long SHHupdatedTimeSHH22 = 0L;
    private int SHHsecondsSHH22 = 0;
    private int SHHsecSHH22 = 0;
    private int SHHminutesSHH22 = 0;
    private int SHHhoursSHH22 = 0;
    private Button SHHbtnTimerSHH22;
    private int SHHblueThresholdSHH22 = Blue;
    private int SHHyellowThresholdSHH22 = Yellow;
    private int SHHredThresholdSHH22 = Red;
    private boolean SHHisTimerRunningSHH22 = false;

    private long SHHstartTimeSHH23 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH23 = 0L;
    private long SHHupdatedTimeSHH23 = 0L;
    private int SHHsecondsSHH23 = 0;
    private int SHHsecSHH23 = 0;
    private int SHHminutesSHH23 = 0;
    private int SHHhoursSHH23 = 0;
    private Button SHHbtnTimerSHH23;
    private int SHHblueThresholdSHH23 = Blue;
    private int SHHyellowThresholdSHH23 = Yellow;
    private int SHHredThresholdSHH23 = Red;
    private boolean SHHisTimerRunningSHH23 = false;

    private long SHHstartTimeSHH24 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH24 = 0L;
    private long SHHupdatedTimeSHH24 = 0L;
    private int SHHsecondsSHH24 = 0;
    private int SHHsecSHH24 = 0;
    private int SHHminutesSHH24 = 0;
    private int SHHhoursSHH24 = 0;
    private Button SHHbtnTimerSHH24;
    private int SHHblueThresholdSHH24 = Blue;
    private int SHHyellowThresholdSHH24 = Yellow;
    private int SHHredThresholdSHH24 = Red;
    private boolean SHHisTimerRunningSHH24 = false;

    private long SHHstartTimeSHH25 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH25 = 0L;
    private long SHHupdatedTimeSHH25 = 0L;
    private int SHHsecondsSHH25 = 0;
    private int SHHsecSHH25 = 0;
    private int SHHminutesSHH25 = 0;
    private int SHHhoursSHH25 = 0;
    private Button SHHbtnTimerSHH25;
    private int SHHblueThresholdSHH25 = Blue;
    private int SHHyellowThresholdSHH25 = Yellow;
    private int SHHredThresholdSHH25 = Red;
    private boolean SHHisTimerRunningSHH25 = false;

    private long SHHstartTimeSHH26 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH26 = 0L;
    private long SHHupdatedTimeSHH26 = 0L;
    private int SHHsecondsSHH26 = 0;
    private int SHHsecSHH26 = 0;
    private int SHHminutesSHH26 = 0;
    private int SHHhoursSHH26 = 0;
    private Button SHHbtnTimerSHH26;
    private int SHHblueThresholdSHH26 = Blue;
    private int SHHyellowThresholdSHH26 = Yellow;
    private int SHHredThresholdSHH26 = Red;
    private boolean SHHisTimerRunningSHH26 = false;

    private long SHHstartTimeSHH27 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH27 = 0L;
    private long SHHupdatedTimeSHH27 = 0L;
    private int SHHsecondsSHH27 = 0;
    private int SHHsecSHH27 = 0;
    private int SHHminutesSHH27 = 0;
    private int SHHhoursSHH27 = 0;
    private Button SHHbtnTimerSHH27;
    private int SHHblueThresholdSHH27 = Blue;
    private int SHHyellowThresholdSHH27 = Yellow;
    private int SHHredThresholdSHH27 = Red;
    private boolean SHHisTimerRunningSHH27 = false;
    private long SHHstartTimeSHH28 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH28 = 0L;
    private long SHHupdatedTimeSHH28 = 0L;
    private int SHHsecondsSHH28 = 0;
    private int SHHsecSHH28 = 0;
    private int SHHminutesSHH28 = 0;
    private int SHHhoursSHH28 = 0;
    private Button SHHbtnTimerSHH28;
    private int SHHblueThresholdSHH28 = Blue;
    private int SHHyellowThresholdSHH28 = Yellow;
    private int SHHredThresholdSHH28 = Red;
    private boolean SHHisTimerRunningSHH28 = false;

    private long SHHstartTimeSHH29 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH29 = 0L;
    private long SHHupdatedTimeSHH29 = 0L;
    private int SHHsecondsSHH29 = 0;
    private int SHHsecSHH29 = 0;
    private int SHHminutesSHH29 = 0;
    private int SHHhoursSHH29 = 0;
    private Button SHHbtnTimerSHH29;
    private int SHHblueThresholdSHH29 = Blue;
    private int SHHyellowThresholdSHH29 = Yellow;
    private int SHHredThresholdSHH29 = Red;
    private boolean SHHisTimerRunningSHH29 = false;

    private long SHHstartTimeSHH30 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH30 = 0L;
    private long SHHupdatedTimeSHH30 = 0L;
    private int SHHsecondsSHH30 = 0;
    private int SHHsecSHH30 = 0;
    private int SHHminutesSHH30 = 0;
    private int SHHhoursSHH30 = 0;
    private Button SHHbtnTimerSHH30;
    private int SHHblueThresholdSHH30 = Blue;
    private int SHHyellowThresholdSHH30 = Yellow;
    private int SHHredThresholdSHH30 = Red;
    private boolean SHHisTimerRunningSHH30 = false;

    private long SHHstartTimeSHH31 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH31 = 0L;
    private long SHHupdatedTimeSHH31 = 0L;
    private int SHHsecondsSHH31 = 0;
    private int SHHsecSHH31 = 0;
    private int SHHminutesSHH31 = 0;
    private int SHHhoursSHH31 = 0;
    private Button SHHbtnTimerSHH31;
    private int SHHblueThresholdSHH31 = Blue;
    private int SHHyellowThresholdSHH31 = Yellow;
    private int SHHredThresholdSHH31 = Red;
    private boolean SHHisTimerRunningSHH31 = false;

    private long SHHstartTimeSHH32 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH32 = 0L;
    private long SHHupdatedTimeSHH32 = 0L;
    private int SHHsecondsSHH32 = 0;
    private int SHHsecSHH32 = 0;
    private int SHHminutesSHH32 = 0;
    private int SHHhoursSHH32 = 0;
    private Button SHHbtnTimerSHH32;
    private int SHHblueThresholdSHH32 = Blue;
    private int SHHyellowThresholdSHH32 = Yellow;
    private int SHHredThresholdSHH32 = Red;
    private boolean SHHisTimerRunningSHH32 = false;

    private long SHHstartTimeSHH33 = 0L;
    private long SHHtimeInMilliSHHsecondsSHH33 = 0L;
    private long SHHupdatedTimeSHH33 = 0L;
    private int SHHsecondsSHH33 = 0;
    private int SHHsecSHH33 = 0;
    private int SHHminutesSHH33 = 0;
    private int SHHhoursSHH33 = 0;
    private Button SHHbtnTimerSHH33;
    private int SHHblueThresholdSHH33 = Blue;
    private int SHHyellowThresholdSHH33 = Yellow;
    private int SHHredThresholdSHH33 = Red;
    private boolean SHHisTimerRunningSHH33 = false;

    //------------------------------------------------------------
    private boolean SHHflashingSHH101;
    private boolean SHHflashinggSHH101;

    private boolean SHHflashingSHH102;
    private boolean SHHflashinggSHH102;

    private boolean SHHflashingSHH103;
    private boolean SHHflashinggSHH103;

    private boolean SHHflashingSHH104;
    private boolean SHHflashinggSHH104;

    private boolean SHHflashingSHH105;
    private boolean SHHflashinggSHH105;

    private boolean SHHflashingSHH106;
    private boolean SHHflashinggSHH106;

    private boolean SHHflashingSHH107;
    private boolean SHHflashinggSHH107;

    private boolean SHHflashingSHH8;
    private boolean SHHflashinggSHH8;

    private boolean SHHflashingSHH9;
    private boolean SHHflashinggSHH9;

    private boolean SHHflashingSHH10;
    private boolean SHHflashinggSHH10;

    private boolean SHHflashingSHH11;
    private boolean SHHflashinggSHH11;

    private boolean SHHflashingSHH12;
    private boolean SHHflashinggSHH12;

    private boolean SHHflashingSHH13;
    private boolean SHHflashinggSHH13;

    private boolean SHHflashingSHH14;
    private boolean SHHflashinggSHH14;

    private boolean SHHflashingSHH15;
    private boolean SHHflashinggSHH15;

    private boolean SHHflashingSHH16;
    private boolean SHHflashinggSHH16;

    private boolean SHHflashingSHH17;
    private boolean SHHflashinggSHH17;

    private boolean SHHflashingSHH18;
    private boolean SHHflashinggSHH18;

    private boolean SHHflashingSHH19;
    private boolean SHHflashinggSHH19;

    private boolean SHHflashingSHH20;
    private boolean SHHflashinggSHH20;

    private boolean SHHflashingSHH21;
    private boolean SHHflashinggSHH21;

    private boolean SHHflashingSHH22;
    private boolean SHHflashinggSHH22;

    private boolean SHHflashingSHH23;
    private boolean SHHflashinggSHH23;

    private boolean SHHflashingSHH24;
    private boolean SHHflashinggSHH24;

    private boolean SHHflashingSHH25;
    private boolean SHHflashinggSHH25;

    private boolean SHHflashingSHH26;
    private boolean SHHflashinggSHH26;

    private boolean SHHflashingSHH27;
    private boolean SHHflashinggSHH27;

    private boolean SHHflashingSHH28;
    private boolean SHHflashinggSHH28;

    private boolean SHHflashingSHH29;
    private boolean SHHflashinggSHH29;

    private boolean SHHflashingSHH30;
    private boolean SHHflashinggSHH30;

    private boolean SHHflashingSHH31;
    private boolean SHHflashinggSHH31;

    private boolean SHHflashingSHH32;
    private boolean SHHflashinggSHH32;

    private boolean SHHflashingSHH33;
    private boolean SHHflashinggSHH33;
    //------------------------------------------
    int SHHcurrentHourSHH101;
    int SHHcurrentMinuteSHH101;
    int SHHfutureHourSHH101;
    int SHHfutureMinuteSHH101;

    int SHHcurrentHourSHH102;
    int SHHcurrentMinuteSHH102;
    int SHHfutureHourSHH102;
    int SHHfutureMinuteSHH102;

    int SHHcurrentHourSHH103;
    int SHHcurrentMinuteSHH103;
    int SHHfutureHourSHH103;
    int SHHfutureMinuteSHH103;

    int SHHcurrentHourSHH104;
    int SHHcurrentMinuteSHH104;
    int SHHfutureHourSHH104;
    int SHHfutureMinuteSHH104;

    int SHHcurrentHourSHH105;
    int SHHcurrentMinuteSHH105;
    int SHHfutureHourSHH105;
    int SHHfutureMinuteSHH105;

    int SHHcurrentHourSHH106;
    int SHHcurrentMinuteSHH106;
    int SHHfutureHourSHH106;
    int SHHfutureMinuteSHH106;

    int SHHcurrentHourSHH107;
    int SHHcurrentMinuteSHH107;
    int SHHfutureHourSHH107;
    int SHHfutureMinuteSHH107;

    int SHHcurrentHourSHH8;
    int SHHcurrentMinuteSHH8;
    int SHHfutureHourSHH8;
    int SHHfutureMinuteSHH8;

    int SHHcurrentHourSHH9;
    int SHHcurrentMinuteSHH9;
    int SHHfutureHourSHH9;
    int SHHfutureMinuteSHH9;

    int SHHcurrentHourSHH10;
    int SHHcurrentMinuteSHH10;
    int SHHfutureHourSHH10;
    int SHHfutureMinuteSHH10;

    int SHHcurrentHourSHH11;
    int SHHcurrentMinuteSHH11;
    int SHHfutureHourSHH11;
    int SHHfutureMinuteSHH11;

    int SHHcurrentHourSHH12;
    int SHHcurrentMinuteSHH12;
    int SHHfutureHourSHH12;
    int SHHfutureMinuteSHH12;

    int SHHcurrentHourSHH13;
    int SHHcurrentMinuteSHH13;
    int SHHfutureHourSHH13;
    int SHHfutureMinuteSHH13;

    int SHHcurrentHourSHH14;
    int SHHcurrentMinuteSHH14;
    int SHHfutureHourSHH14;
    int SHHfutureMinuteSHH14;

    int SHHcurrentHourSHH15;
    int SHHcurrentMinuteSHH15;
    int SHHfutureHourSHH15;
    int SHHfutureMinuteSHH15;

    int SHHcurrentHourSHH16;
    int SHHcurrentMinuteSHH16;
    int SHHfutureHourSHH16;
    int SHHfutureMinuteSHH16;

    int SHHcurrentHourSHH17;
    int SHHcurrentMinuteSHH17;
    int SHHfutureHourSHH17;
    int SHHfutureMinuteSHH17;

    int SHHcurrentHourSHH18;
    int SHHcurrentMinuteSHH18;
    int SHHfutureHourSHH18;
    int SHHfutureMinuteSHH18;

    int SHHcurrentHourSHH19;
    int SHHcurrentMinuteSHH19;
    int SHHfutureHourSHH19;
    int SHHfutureMinuteSHH19;

    int SHHcurrentHourSHH20;
    int SHHcurrentMinuteSHH20;
    int SHHfutureHourSHH20;
    int SHHfutureMinuteSHH20;

    int SHHcurrentHourSHH21;
    int SHHcurrentMinuteSHH21;
    int SHHfutureHourSHH21;
    int SHHfutureMinuteSHH21;

    int SHHcurrentHourSHH22;
    int SHHcurrentMinuteSHH22;
    int SHHfutureHourSHH22;
    int SHHfutureMinuteSHH22;

    int SHHcurrentHourSHH23;
    int SHHcurrentMinuteSHH23;
    int SHHfutureHourSHH23;
    int SHHfutureMinuteSHH23;

    int SHHcurrentHourSHH24;
    int SHHcurrentMinuteSHH24;
    int SHHfutureHourSHH24;
    int SHHfutureMinuteSHH24;

    int SHHcurrentHourSHH25;
    int SHHcurrentMinuteSHH25;
    int SHHfutureHourSHH25;
    int SHHfutureMinuteSHH25;

    int SHHcurrentHourSHH26;
    int SHHcurrentMinuteSHH26;
    int SHHfutureHourSHH26;
    int SHHfutureMinuteSHH26;

    int SHHcurrentHourSHH27;
    int SHHcurrentMinuteSHH27;
    int SHHfutureHourSHH27;
    int SHHfutureMinuteSHH27;

    int SHHcurrentHourSHH28;
    int SHHcurrentMinuteSHH28;
    int SHHfutureHourSHH28;
    int SHHfutureMinuteSHH28;

    int SHHcurrentHourSHH29;
    int SHHcurrentMinuteSHH29;
    int SHHfutureHourSHH29;
    int SHHfutureMinuteSHH29;

    int SHHcurrentHourSHH30;
    int SHHcurrentMinuteSHH30;
    int SHHfutureHourSHH30;
    int SHHfutureMinuteSHH30;

    int SHHcurrentHourSHH31;
    int SHHcurrentMinuteSHH31;
    int SHHfutureHourSHH31;
    int SHHfutureMinuteSHH31;

    int SHHcurrentHourSHH32;
    int SHHcurrentMinuteSHH32;
    int SHHfutureHourSHH32;
    int SHHfutureMinuteSHH32;

    int SHHcurrentHourSHH33;
    int SHHcurrentMinuteSHH33;
    int SHHfutureHourSHH33;
    int SHHfutureMinuteSHH33;
    //----------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup_house_holiday);

        Button PrivateRoom1 = findViewById(R.id.PrivateRoom1);
        PrivateRoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(SoupHouseHoliday.this, PrivateRoomHoliday.class);
                startActivity(intent);
            }
        }); //當按下包廂鍵就會跳轉到PrivateRoom畫面
        Button Home = findViewById(R.id.sHomeh);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(SoupHouseHoliday.this, MainActivity.class);
                startActivity(intent);
            }
        });

//-----------------------------------------------------------------------------------------------

        // 啟動計時器服務
        Intent SHHtimerServiceIntentSHH101 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH101);
        } else {
            startService(SHHtimerServiceIntentSHH101);
        }
/*
        Intent SHHtimerServiceIntentSHH102 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH102);
        } else {
            startService(SHHtimerServiceIntentSHH102);
        }

        Intent SHHtimerServiceIntentSHH103 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH103);
        } else {
            startService(SHHtimerServiceIntentSHH103);
        }

        Intent SHHtimerServiceIntentSHH104 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH104);
        } else {
            startService(SHHtimerServiceIntentSHH104);
        }

        Intent SHHtimerServiceIntentSHH105 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH105);
        } else {
            startService(SHHtimerServiceIntentSHH105);
        }

        Intent SHHtimerServiceIntentSHH106 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH106);
        } else {
            startService(SHHtimerServiceIntentSHH106);
        }

        Intent SHHtimerServiceIntentSHH107 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH107);
        } else {
            startService(SHHtimerServiceIntentSHH107);
        }

        Intent SHHtimerServiceIntentSHH8 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH8);
        } else {
            startService(SHHtimerServiceIntentSHH8);
        }

        Intent SHHtimerServiceIntentSHH9 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH9);
        } else {
            startService(SHHtimerServiceIntentSHH9);
        }

        Intent SHHtimerServiceIntentSHH10 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH10);
        } else {
            startService(SHHtimerServiceIntentSHH10);
        }

        Intent SHHtimerServiceIntentSHH11 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH11);
        } else {
            startService(SHHtimerServiceIntentSHH11);
        }

        Intent SHHtimerServiceIntentSHH12 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH12);
        } else {
            startService(SHHtimerServiceIntentSHH12);
        }

        Intent SHHtimerServiceIntentSHH13 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH13);
        } else {
            startService(SHHtimerServiceIntentSHH13);
        }

        Intent SHHtimerServiceIntentSHH14 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH14);
        } else {
            startService(SHHtimerServiceIntentSHH14);
        }

        Intent SHHtimerServiceIntentSHH15 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH15);
        } else {
            startService(SHHtimerServiceIntentSHH15);
        }

        Intent SHHtimerServiceIntentSHH16 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH16);
        } else {
            startService(SHHtimerServiceIntentSHH16);
        }

        Intent SHHtimerServiceIntentSHH17 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH17);
        } else {
            startService(SHHtimerServiceIntentSHH17);
        }

        Intent SHHtimerServiceIntentSHH18 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH18);
        } else {
            startService(SHHtimerServiceIntentSHH18);
        }

        Intent SHHtimerServiceIntentSHH19 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH19);
        } else {
            startService(SHHtimerServiceIntentSHH19);
        }

        Intent SHHtimerServiceIntentSHH20 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH20);
        } else {
            startService(SHHtimerServiceIntentSHH20);
        }

        Intent SHHtimerServiceIntentSHH21 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH21);
        } else {
            startService(SHHtimerServiceIntentSHH21);
        }

        Intent SHHtimerServiceIntentSHH22 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH22);
        } else {
            startService(SHHtimerServiceIntentSHH22);
        }

        Intent SHHtimerServiceIntentSHH23 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH23);
        } else {
            startService(SHHtimerServiceIntentSHH23);
        }

        Intent SHHtimerServiceIntentSHH24 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH24);
        } else {
            startService(SHHtimerServiceIntentSHH24);
        }

        Intent SHHtimerServiceIntentSHH25 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH25);
        } else {
            startService(SHHtimerServiceIntentSHH25);
        }

        Intent SHHtimerServiceIntentSHH26 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH26);
        } else {
            startService(SHHtimerServiceIntentSHH26);
        }

        Intent SHHtimerServiceIntentSHH27 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH27);
        } else {
            startService(SHHtimerServiceIntentSHH27);
        }

        Intent SHHtimerServiceIntentSHH28 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH28);
        } else {
            startService(SHHtimerServiceIntentSHH28);
        }

        Intent SHHtimerServiceIntentSHH29 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH29);
        } else {
            startService(SHHtimerServiceIntentSHH29);
        }

        Intent SHHtimerServiceIntentSHH30 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH30);
        } else {
            startService(SHHtimerServiceIntentSHH30);
        }

        Intent SHHtimerServiceIntentSHH31 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH31);
        } else {
            startService(SHHtimerServiceIntentSHH31);
        }

        Intent SHHtimerServiceIntentSHH32 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH32);
        } else {
            startService(SHHtimerServiceIntentSHH32);
        }

        Intent SHHtimerServiceIntentSHH33 = new Intent(this, TimerServiceS2H.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(SHHtimerServiceIntentSHH33);
        } else {
            startService(SHHtimerServiceIntentSHH33);
        }
*/
//-----------------------------------------------------------------------------------------------
// 初始化 SharedPreferences 和 SHHeditorSHH1
        SHHsharedPreferencesSHH101 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH101 = SHHsharedPreferencesSHH101.edit();

        SHHsharedPreferencesSHH102 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH102 = SHHsharedPreferencesSHH102.edit();

        SHHsharedPreferencesSHH103 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH103 = SHHsharedPreferencesSHH103.edit();

        SHHsharedPreferencesSHH104 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH104 = SHHsharedPreferencesSHH104.edit();

        SHHsharedPreferencesSHH105 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH105 = SHHsharedPreferencesSHH105.edit();

        SHHsharedPreferencesSHH106 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH106 = SHHsharedPreferencesSHH106.edit();

        SHHsharedPreferencesSHH107 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH107 = SHHsharedPreferencesSHH107.edit();

        SHHsharedPreferencesSHH8 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH8 = SHHsharedPreferencesSHH8.edit();

        SHHsharedPreferencesSHH9 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH9 = SHHsharedPreferencesSHH9.edit();

        SHHsharedPreferencesSHH10 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH10 = SHHsharedPreferencesSHH10.edit();

        SHHsharedPreferencesSHH11 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH11 = SHHsharedPreferencesSHH11.edit();

        SHHsharedPreferencesSHH12 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH12 = SHHsharedPreferencesSHH12.edit();

        SHHsharedPreferencesSHH13 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH13 = SHHsharedPreferencesSHH13.edit();

        SHHsharedPreferencesSHH14 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH14 = SHHsharedPreferencesSHH14.edit();

        SHHsharedPreferencesSHH15 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH15 = SHHsharedPreferencesSHH15.edit();

        SHHsharedPreferencesSHH16 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH16 = SHHsharedPreferencesSHH16.edit();

        SHHsharedPreferencesSHH17 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH17 = SHHsharedPreferencesSHH17.edit();

        SHHsharedPreferencesSHH18 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH18 = SHHsharedPreferencesSHH18.edit();

        SHHsharedPreferencesSHH19 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH19 = SHHsharedPreferencesSHH19.edit();

        SHHsharedPreferencesSHH20 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH20 = SHHsharedPreferencesSHH20.edit();

        SHHsharedPreferencesSHH21 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH21 = SHHsharedPreferencesSHH21.edit();

        SHHsharedPreferencesSHH22 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH22 = SHHsharedPreferencesSHH22.edit();

        SHHsharedPreferencesSHH23 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH23 = SHHsharedPreferencesSHH23.edit();

        SHHsharedPreferencesSHH24 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH24 = SHHsharedPreferencesSHH24.edit();

        SHHsharedPreferencesSHH25 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH25 = SHHsharedPreferencesSHH25.edit();

        SHHsharedPreferencesSHH26 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH26 = SHHsharedPreferencesSHH26.edit();

        SHHsharedPreferencesSHH27 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH27 = SHHsharedPreferencesSHH27.edit();

        SHHsharedPreferencesSHH28 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH28 = SHHsharedPreferencesSHH28.edit();

        SHHsharedPreferencesSHH29 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH29 = SHHsharedPreferencesSHH29.edit();

        SHHsharedPreferencesSHH30 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH30 = SHHsharedPreferencesSHH30.edit();

        SHHsharedPreferencesSHH31 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH31 = SHHsharedPreferencesSHH31.edit();

        SHHsharedPreferencesSHH32 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH32 = SHHsharedPreferencesSHH32.edit();

        SHHsharedPreferencesSHH33 = PreferenceManager.getDefaultSharedPreferences(this);
        SHHeditorSHH33 = SHHsharedPreferencesSHH33.edit();

//-----------------------------------------------------------------------------------------------

        SHHbtnTimerSHH101 = findViewById(R.id.SHHbuttonSHH101);
        SHHbtnTimerSHH101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH101) {
                    showConfirmationDialogForButton101();
                    SHHupdateButtonColorSHH101(); // 更新颜色
                } else if (SHHisTimerRunningSHH101) {
                    if (SHHsecSHH101 < SHHblueThresholdSHH101) {
                        SHHupdateButtonColorSHH101();
                        SHHshowConfirmationDialogYNForButtonSHH101();
                    } else if (SHHblueThresholdSHH101 <= SHHsecSHH101 && SHHsecSHH101 < SHHyellowThresholdSHH101) {
                        if (!SHHflashingSHH101) {
                            SHHflashingSHH101 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH101();
                        } else if (SHHflashingSHH101) {
                            SHHupdateButtonColorSHH101();
                            SHHshowConfirmationDialogYNForButtonSHH101();
                        }

                    } else if (SHHyellowThresholdSHH101 <= SHHsecSHH101 && SHHsecSHH101 < SHHredThresholdSHH101) {
                        if (!SHHflashinggSHH101) {
                            SHHflashinggSHH101 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH101();
                        } else if (SHHflashinggSHH101) {
                            SHHupdateButtonColorSHH101();
                            SHHshowConfirmationDialogYNForButtonSHH101();
                        }

                    } else if (SHHsecSHH101 >= SHHredThresholdSHH101) {
                        SHHupdateButtonColorSHH101();
                        SHHshowConfirmationDialogYNForButtonSHH101();
                    }
                }
            }
        });

        SHHbtnTimerSHH101.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH101();
                return true;
            }
        });

        SHHbtnTimerSHH102 = findViewById(R.id.SHHbuttonSHH102);
        SHHbtnTimerSHH102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH102) {
                    showConfirmationDialogForButton102();
                    SHHupdateButtonColorSHH102(); // 更新颜色
                } else if (SHHisTimerRunningSHH102) {
                    if (SHHsecSHH102 < SHHblueThresholdSHH102) {
                        SHHupdateButtonColorSHH102();
                        SHHshowConfirmationDialogYNForButtonSHH102();
                    } else if (SHHblueThresholdSHH102 <= SHHsecSHH102 && SHHsecSHH102 < SHHyellowThresholdSHH102) {
                        if (!SHHflashingSHH102) {
                            SHHflashingSHH102 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH102();
                        } else if (SHHflashingSHH102) {
                            SHHupdateButtonColorSHH102();
                            SHHshowConfirmationDialogYNForButtonSHH102();
                        }

                    } else if (SHHyellowThresholdSHH102 <= SHHsecSHH102 && SHHsecSHH102 < SHHredThresholdSHH102) {
                        if (!SHHflashinggSHH102) {
                            SHHflashinggSHH102 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH102();
                        } else if (SHHflashinggSHH102) {
                            SHHupdateButtonColorSHH102();
                            SHHshowConfirmationDialogYNForButtonSHH102();
                        }

                    } else if (SHHsecSHH102 >= SHHredThresholdSHH102) {
                        SHHupdateButtonColorSHH102();
                        SHHshowConfirmationDialogYNForButtonSHH102();
                    }
                }
            }
        });

        SHHbtnTimerSHH102.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH102();
                return true;
            }
        });
        SHHbtnTimerSHH103 = findViewById(R.id.SHHbuttonSHH103);
        SHHbtnTimerSHH103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH103) {
                    showConfirmationDialogForButton103();
                    SHHupdateButtonColorSHH103(); // 更新颜色
                } else if (SHHisTimerRunningSHH103) {
                    if (SHHsecSHH103 < SHHblueThresholdSHH103) {
                        SHHupdateButtonColorSHH103();
                        SHHshowConfirmationDialogYNForButtonSHH103();
                    } else if (SHHblueThresholdSHH103 <= SHHsecSHH103 && SHHsecSHH103 < SHHyellowThresholdSHH103) {
                        if (!SHHflashingSHH103) {
                            SHHflashingSHH103 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH103();
                        } else if (SHHflashingSHH103) {
                            SHHupdateButtonColorSHH103();
                            SHHshowConfirmationDialogYNForButtonSHH103();
                        }

                    } else if (SHHyellowThresholdSHH103 <= SHHsecSHH103 && SHHsecSHH103 < SHHredThresholdSHH103) {
                        if (!SHHflashinggSHH103) {
                            SHHflashinggSHH103 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH103();
                        } else if (SHHflashinggSHH103) {
                            SHHupdateButtonColorSHH103();
                            SHHshowConfirmationDialogYNForButtonSHH103();
                        }

                    } else if (SHHsecSHH103 >= SHHredThresholdSHH103) {
                        SHHupdateButtonColorSHH103();
                        SHHshowConfirmationDialogYNForButtonSHH103();
                    }
                }
            }
        });

        SHHbtnTimerSHH103.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH103();
                return true;
            }
        });
        SHHbtnTimerSHH104 = findViewById(R.id.SHHbuttonSHH104);
        SHHbtnTimerSHH104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH104) {
                    showConfirmationDialogForButton104();
                    SHHupdateButtonColorSHH104(); // 更新颜色
                } else if (SHHisTimerRunningSHH104) {
                    if (SHHsecSHH104 < SHHblueThresholdSHH104) {
                        SHHupdateButtonColorSHH104();
                        SHHshowConfirmationDialogYNForButtonSHH104();
                    } else if (SHHblueThresholdSHH104 <= SHHsecSHH104 && SHHsecSHH104 < SHHyellowThresholdSHH104) {
                        if (!SHHflashingSHH104) {
                            SHHflashingSHH104 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH104();
                        } else if (SHHflashingSHH104) {
                            SHHupdateButtonColorSHH104();
                            SHHshowConfirmationDialogYNForButtonSHH104();
                        }

                    } else if (SHHyellowThresholdSHH104 <= SHHsecSHH104 && SHHsecSHH104 < SHHredThresholdSHH104) {
                        if (!SHHflashinggSHH104) {
                            SHHflashinggSHH104 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH104();
                        } else if (SHHflashinggSHH104) {
                            SHHupdateButtonColorSHH104();
                            SHHshowConfirmationDialogYNForButtonSHH104();
                        }

                    } else if (SHHsecSHH104 >= SHHredThresholdSHH104) {
                        SHHupdateButtonColorSHH104();
                        SHHshowConfirmationDialogYNForButtonSHH104();
                    }
                }
            }
        });

        SHHbtnTimerSHH104.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH104();
                return true;
            }
        });
        SHHbtnTimerSHH105 = findViewById(R.id.SHHbuttonSHH105);
        SHHbtnTimerSHH105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH105) {
                    showConfirmationDialogForButton105();
                    SHHupdateButtonColorSHH105(); // 更新颜色
                } else if (SHHisTimerRunningSHH105) {
                    if (SHHsecSHH105 < SHHblueThresholdSHH105) {
                        SHHupdateButtonColorSHH105();
                        SHHshowConfirmationDialogYNForButtonSHH105();
                    } else if (SHHblueThresholdSHH105 <= SHHsecSHH105 && SHHsecSHH105 < SHHyellowThresholdSHH105) {
                        if (!SHHflashingSHH105) {
                            SHHflashingSHH105 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH105();
                        } else if (SHHflashingSHH105) {
                            SHHupdateButtonColorSHH105();
                            SHHshowConfirmationDialogYNForButtonSHH105();
                        }

                    } else if (SHHyellowThresholdSHH105 <= SHHsecSHH105 && SHHsecSHH105 < SHHredThresholdSHH105) {
                        if (!SHHflashinggSHH105) {
                            SHHflashinggSHH105 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH105();
                        } else if (SHHflashinggSHH105) {
                            SHHupdateButtonColorSHH105();
                            SHHshowConfirmationDialogYNForButtonSHH105();
                        }

                    } else if (SHHsecSHH105 >= SHHredThresholdSHH105) {
                        SHHupdateButtonColorSHH105();
                        SHHshowConfirmationDialogYNForButtonSHH105();
                    }
                }
            }
        });

        SHHbtnTimerSHH105.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH105();
                return true;
            }
        });
        SHHbtnTimerSHH106 = findViewById(R.id.SHHbuttonSHH106);
        SHHbtnTimerSHH106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH106) {
                    showConfirmationDialogForButton106();
                    SHHupdateButtonColorSHH106(); // 更新颜色
                } else if (SHHisTimerRunningSHH106) {
                    if (SHHsecSHH106 < SHHblueThresholdSHH106) {
                        SHHupdateButtonColorSHH106();
                        SHHshowConfirmationDialogYNForButtonSHH106();
                    } else if (SHHblueThresholdSHH106 <= SHHsecSHH106 && SHHsecSHH106 < SHHyellowThresholdSHH106) {
                        if (!SHHflashingSHH106) {
                            SHHflashingSHH106 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH106();
                        } else if (SHHflashingSHH106) {
                            SHHupdateButtonColorSHH106();
                            SHHshowConfirmationDialogYNForButtonSHH106();
                        }

                    } else if (SHHyellowThresholdSHH106 <= SHHsecSHH106 && SHHsecSHH106 < SHHredThresholdSHH106) {
                        if (!SHHflashinggSHH106) {
                            SHHflashinggSHH106 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH106();
                        } else if (SHHflashinggSHH106) {
                            SHHupdateButtonColorSHH106();
                            SHHshowConfirmationDialogYNForButtonSHH106();
                        }

                    } else if (SHHsecSHH106 >= SHHredThresholdSHH106) {
                        SHHupdateButtonColorSHH106();
                        SHHshowConfirmationDialogYNForButtonSHH106();
                    }
                }
            }
        });

        SHHbtnTimerSHH106.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH106();
                return true;
            }
        });
        SHHbtnTimerSHH107 = findViewById(R.id.SHHbuttonSHH107);
        SHHbtnTimerSHH107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH107) {
                    showConfirmationDialogForButton107();
                    SHHupdateButtonColorSHH107(); // 更新颜色
                } else if (SHHisTimerRunningSHH107) {
                    if (SHHsecSHH107 < SHHblueThresholdSHH107) {
                        SHHupdateButtonColorSHH107();
                        SHHshowConfirmationDialogYNForButtonSHH107();
                    } else if (SHHblueThresholdSHH107 <= SHHsecSHH107 && SHHsecSHH107 < SHHyellowThresholdSHH107) {
                        if (!SHHflashingSHH107) {
                            SHHflashingSHH107 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH107();
                        } else if (SHHflashingSHH107) {
                            SHHupdateButtonColorSHH107();
                            SHHshowConfirmationDialogYNForButtonSHH107();
                        }

                    } else if (SHHyellowThresholdSHH107 <= SHHsecSHH107 && SHHsecSHH107 < SHHredThresholdSHH107) {
                        if (!SHHflashinggSHH107) {
                            SHHflashinggSHH107 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH107();
                        } else if (SHHflashinggSHH107) {
                            SHHupdateButtonColorSHH107();
                            SHHshowConfirmationDialogYNForButtonSHH107();
                        }

                    } else if (SHHsecSHH107 >= SHHredThresholdSHH107) {
                        SHHupdateButtonColorSHH107();
                        SHHshowConfirmationDialogYNForButtonSHH107();
                    }
                }
            }
        });

        SHHbtnTimerSHH107.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH107();
                return true;
            }
        });

        SHHbtnTimerSHH8 = findViewById(R.id.SHHbuttonSHH8);
        SHHbtnTimerSHH8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH8) {
                    showConfirmationDialogForButton8();
                    SHHupdateButtonColorSHH8(); // 更新颜色
                } else if (SHHisTimerRunningSHH8) {
                    if (SHHsecSHH8 < SHHblueThresholdSHH8) {
                        SHHupdateButtonColorSHH8();
                        SHHshowConfirmationDialogYNForButtonSHH8();
                    } else if (SHHblueThresholdSHH8 <= SHHsecSHH8 && SHHsecSHH8 < SHHyellowThresholdSHH8) {
                        if (!SHHflashingSHH8) {
                            SHHflashingSHH8 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH8();
                        } else if (SHHflashingSHH8) {
                            SHHupdateButtonColorSHH8();
                            SHHshowConfirmationDialogYNForButtonSHH8();
                        }

                    } else if (SHHyellowThresholdSHH8 <= SHHsecSHH8 && SHHsecSHH8 < SHHredThresholdSHH8) {
                        if (!SHHflashinggSHH8) {
                            SHHflashinggSHH8 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH8();
                        } else if (SHHflashinggSHH8) {
                            SHHupdateButtonColorSHH8();
                            SHHshowConfirmationDialogYNForButtonSHH8();
                        }

                    } else if (SHHsecSHH8 >= SHHredThresholdSHH8) {
                        SHHupdateButtonColorSHH8();
                        SHHshowConfirmationDialogYNForButtonSHH8();
                    }
                }
            }
        });

        SHHbtnTimerSHH8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH8();
                return true;
            }
        });
        SHHbtnTimerSHH9 = findViewById(R.id.SHHbuttonSHH9);
        SHHbtnTimerSHH9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH9) {
                    showConfirmationDialogForButton9();
                    SHHupdateButtonColorSHH9(); // 更新颜色
                } else if (SHHisTimerRunningSHH9) {
                    if (SHHsecSHH9 < SHHblueThresholdSHH9) {
                        SHHupdateButtonColorSHH9();
                        SHHshowConfirmationDialogYNForButtonSHH9();
                    } else if (SHHblueThresholdSHH9 <= SHHsecSHH9 && SHHsecSHH9 < SHHyellowThresholdSHH9) {
                        if (!SHHflashingSHH9) {
                            SHHflashingSHH9 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH9();
                        } else if (SHHflashingSHH9) {
                            SHHupdateButtonColorSHH9();
                            SHHshowConfirmationDialogYNForButtonSHH9();
                        }

                    } else if (SHHyellowThresholdSHH9 <= SHHsecSHH9 && SHHsecSHH9 < SHHredThresholdSHH9) {
                        if (!SHHflashinggSHH9) {
                            SHHflashinggSHH9 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH9();
                        } else if (SHHflashinggSHH9) {
                            SHHupdateButtonColorSHH9();
                            SHHshowConfirmationDialogYNForButtonSHH9();
                        }

                    } else if (SHHsecSHH9 >= SHHredThresholdSHH9) {
                        SHHupdateButtonColorSHH9();
                        SHHshowConfirmationDialogYNForButtonSHH9();
                    }
                }
            }
        });

        SHHbtnTimerSHH9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH9();
                return true;
            }
        });
        SHHbtnTimerSHH10 = findViewById(R.id.SHHbuttonSHH10);
        SHHbtnTimerSHH10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH10) {
                    showConfirmationDialogForButton10();
                    SHHupdateButtonColorSHH10(); // 更新颜色
                } else if (SHHisTimerRunningSHH10) {
                    if (SHHsecSHH10 < SHHblueThresholdSHH10) {
                        SHHupdateButtonColorSHH10();
                        SHHshowConfirmationDialogYNForButtonSHH10();
                    } else if (SHHblueThresholdSHH10 <= SHHsecSHH10 && SHHsecSHH10 < SHHyellowThresholdSHH10) {
                        if (!SHHflashingSHH10) {
                            SHHflashingSHH10 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH10();
                        } else if (SHHflashingSHH10) {
                            SHHupdateButtonColorSHH10();
                            SHHshowConfirmationDialogYNForButtonSHH10();
                        }

                    } else if (SHHyellowThresholdSHH10 <= SHHsecSHH10 && SHHsecSHH10 < SHHredThresholdSHH10) {
                        if (!SHHflashinggSHH10) {
                            SHHflashinggSHH10 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH10();
                        } else if (SHHflashinggSHH10) {
                            SHHupdateButtonColorSHH10();
                            SHHshowConfirmationDialogYNForButtonSHH10();
                        }

                    } else if (SHHsecSHH10 >= SHHredThresholdSHH10) {
                        SHHupdateButtonColorSHH10();
                        SHHshowConfirmationDialogYNForButtonSHH10();
                    }
                }
            }
        });

        SHHbtnTimerSHH10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH10();
                return true;
            }
        });
        SHHbtnTimerSHH11 = findViewById(R.id.SHHbuttonSHH11);
        SHHbtnTimerSHH11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH11) {
                    showConfirmationDialogForButton11();
                    SHHupdateButtonColorSHH11(); // 更新颜色
                } else if (SHHisTimerRunningSHH11) {
                    if (SHHsecSHH11 < SHHblueThresholdSHH11) {
                        SHHupdateButtonColorSHH11();
                        SHHshowConfirmationDialogYNForButtonSHH11();
                    } else if (SHHblueThresholdSHH11 <= SHHsecSHH11 && SHHsecSHH11 < SHHyellowThresholdSHH11) {
                        if (!SHHflashingSHH11) {
                            SHHflashingSHH11 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH11();
                        } else if (SHHflashingSHH11) {
                            SHHupdateButtonColorSHH11();
                            SHHshowConfirmationDialogYNForButtonSHH11();
                        }

                    } else if (SHHyellowThresholdSHH11 <= SHHsecSHH11 && SHHsecSHH11 < SHHredThresholdSHH11) {
                        if (!SHHflashinggSHH11) {
                            SHHflashinggSHH11 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH11();
                        } else if (SHHflashinggSHH11) {
                            SHHupdateButtonColorSHH11();
                            SHHshowConfirmationDialogYNForButtonSHH11();
                        }

                    } else if (SHHsecSHH11 >= SHHredThresholdSHH11) {
                        SHHupdateButtonColorSHH11();
                        SHHshowConfirmationDialogYNForButtonSHH11();
                    }
                }
            }
        });

        SHHbtnTimerSHH11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH11();
                return true;
            }
        });
        SHHbtnTimerSHH12 = findViewById(R.id.SHHbuttonSHH12);
        SHHbtnTimerSHH12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH12) {
                    showConfirmationDialogForButton12();
                    SHHupdateButtonColorSHH12(); // 更新颜色
                } else if (SHHisTimerRunningSHH12) {
                    if (SHHsecSHH12 < SHHblueThresholdSHH12) {
                        SHHupdateButtonColorSHH12();
                        SHHshowConfirmationDialogYNForButtonSHH12();
                    } else if (SHHblueThresholdSHH12 <= SHHsecSHH12 && SHHsecSHH12 < SHHyellowThresholdSHH12) {
                        if (!SHHflashingSHH12) {
                            SHHflashingSHH12 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH12();
                        } else if (SHHflashingSHH12) {
                            SHHupdateButtonColorSHH12();
                            SHHshowConfirmationDialogYNForButtonSHH12();
                        }

                    } else if (SHHyellowThresholdSHH12 <= SHHsecSHH12 && SHHsecSHH12 < SHHredThresholdSHH12) {
                        if (!SHHflashinggSHH12) {
                            SHHflashinggSHH12 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH12();
                        } else if (SHHflashinggSHH12) {
                            SHHupdateButtonColorSHH12();
                            SHHshowConfirmationDialogYNForButtonSHH12();
                        }

                    } else if (SHHsecSHH12 >= SHHredThresholdSHH12) {
                        SHHupdateButtonColorSHH12();
                        SHHshowConfirmationDialogYNForButtonSHH12();
                    }
                }
            }
        });

        SHHbtnTimerSHH12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH12();
                return true;
            }
        });

        SHHbtnTimerSHH13 = findViewById(R.id.SHHbuttonSHH13);
        SHHbtnTimerSHH13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH13) {
                    showConfirmationDialogForButton13();
                    SHHupdateButtonColorSHH13(); // 更新颜色
                } else if (SHHisTimerRunningSHH13) {
                    if (SHHsecSHH13 < SHHblueThresholdSHH13) {
                        SHHupdateButtonColorSHH13();
                        SHHshowConfirmationDialogYNForButtonSHH13();
                    } else if (SHHblueThresholdSHH13 <= SHHsecSHH13 && SHHsecSHH13 < SHHyellowThresholdSHH13) {
                        if (!SHHflashingSHH13) {
                            SHHflashingSHH13 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH13();
                        } else if (SHHflashingSHH13) {
                            SHHupdateButtonColorSHH13();
                            SHHshowConfirmationDialogYNForButtonSHH13();
                        }

                    } else if (SHHyellowThresholdSHH13 <= SHHsecSHH13 && SHHsecSHH13 < SHHredThresholdSHH13) {
                        if (!SHHflashinggSHH13) {
                            SHHflashinggSHH13 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH13();
                        } else if (SHHflashinggSHH13) {
                            SHHupdateButtonColorSHH13();
                            SHHshowConfirmationDialogYNForButtonSHH13();
                        }

                    } else if (SHHsecSHH13 >= SHHredThresholdSHH13) {
                        SHHupdateButtonColorSHH13();
                        SHHshowConfirmationDialogYNForButtonSHH13();
                    }
                }
            }
        });

        SHHbtnTimerSHH13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH13();
                return true;
            }
        });
        SHHbtnTimerSHH14 = findViewById(R.id.SHHbuttonSHH14);
        SHHbtnTimerSHH14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH14) {
                    showConfirmationDialogForButton14();
                    SHHupdateButtonColorSHH14(); // 更新颜色
                } else if (SHHisTimerRunningSHH14) {
                    if (SHHsecSHH14 < SHHblueThresholdSHH14) {
                        SHHupdateButtonColorSHH14();
                        SHHshowConfirmationDialogYNForButtonSHH14();
                    } else if (SHHblueThresholdSHH14 <= SHHsecSHH14 && SHHsecSHH14 < SHHyellowThresholdSHH14) {
                        if (!SHHflashingSHH14) {
                            SHHflashingSHH14 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH14();
                        } else if (SHHflashingSHH14) {
                            SHHupdateButtonColorSHH14();
                            SHHshowConfirmationDialogYNForButtonSHH14();
                        }

                    } else if (SHHyellowThresholdSHH14 <= SHHsecSHH14 && SHHsecSHH14 < SHHredThresholdSHH14) {
                        if (!SHHflashinggSHH14) {
                            SHHflashinggSHH14 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH14();
                        } else if (SHHflashinggSHH14) {
                            SHHupdateButtonColorSHH14();
                            SHHshowConfirmationDialogYNForButtonSHH14();
                        }

                    } else if (SHHsecSHH14 >= SHHredThresholdSHH14) {
                        SHHupdateButtonColorSHH14();
                        SHHshowConfirmationDialogYNForButtonSHH14();
                    }
                }
            }
        });

        SHHbtnTimerSHH14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH14();
                return true;
            }
        });
        SHHbtnTimerSHH15 = findViewById(R.id.SHHbuttonSHH15);
        SHHbtnTimerSHH15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH15) {
                    showConfirmationDialogForButton15();
                    SHHupdateButtonColorSHH15(); // 更新颜色
                } else if (SHHisTimerRunningSHH15) {
                    if (SHHsecSHH15 < SHHblueThresholdSHH15) {
                        SHHupdateButtonColorSHH15();
                        SHHshowConfirmationDialogYNForButtonSHH15();
                    } else if (SHHblueThresholdSHH15 <= SHHsecSHH15 && SHHsecSHH15 < SHHyellowThresholdSHH15) {
                        if (!SHHflashingSHH15) {
                            SHHflashingSHH15 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH15();
                        } else if (SHHflashingSHH15) {
                            SHHupdateButtonColorSHH15();
                            SHHshowConfirmationDialogYNForButtonSHH15();
                        }

                    } else if (SHHyellowThresholdSHH15 <= SHHsecSHH15 && SHHsecSHH15 < SHHredThresholdSHH15) {
                        if (!SHHflashinggSHH15) {
                            SHHflashinggSHH15 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH15();
                        } else if (SHHflashinggSHH15) {
                            SHHupdateButtonColorSHH15();
                            SHHshowConfirmationDialogYNForButtonSHH15();
                        }

                    } else if (SHHsecSHH15 >= SHHredThresholdSHH15) {
                        SHHupdateButtonColorSHH15();
                        SHHshowConfirmationDialogYNForButtonSHH15();
                    }
                }
            }
        });

        SHHbtnTimerSHH15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH15();
                return true;
            }
        });
        SHHbtnTimerSHH16 = findViewById(R.id.SHHbuttonSHH16);
        SHHbtnTimerSHH16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH16) {
                    showConfirmationDialogForButton16();
                    SHHupdateButtonColorSHH16(); // 更新颜色
                } else if (SHHisTimerRunningSHH16) {
                    if (SHHsecSHH16 < SHHblueThresholdSHH16) {
                        SHHupdateButtonColorSHH16();
                        SHHshowConfirmationDialogYNForButtonSHH16();
                    } else if (SHHblueThresholdSHH16 <= SHHsecSHH16 && SHHsecSHH16 < SHHyellowThresholdSHH16) {
                        if (!SHHflashingSHH16) {
                            SHHflashingSHH16 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH16();
                        } else if (SHHflashingSHH16) {
                            SHHupdateButtonColorSHH16();
                            SHHshowConfirmationDialogYNForButtonSHH16();
                        }

                    } else if (SHHyellowThresholdSHH16 <= SHHsecSHH16 && SHHsecSHH16 < SHHredThresholdSHH16) {
                        if (!SHHflashinggSHH16) {
                            SHHflashinggSHH16 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH16();
                        } else if (SHHflashinggSHH16) {
                            SHHupdateButtonColorSHH16();
                            SHHshowConfirmationDialogYNForButtonSHH16();
                        }

                    } else if (SHHsecSHH16 >= SHHredThresholdSHH16) {
                        SHHupdateButtonColorSHH16();
                        SHHshowConfirmationDialogYNForButtonSHH16();
                    }
                }
            }
        });

        SHHbtnTimerSHH16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH16();
                return true;
            }
        });
        SHHbtnTimerSHH17 = findViewById(R.id.SHHbuttonSHH17);
        SHHbtnTimerSHH17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH17) {
                    showConfirmationDialogForButton17();
                    SHHupdateButtonColorSHH17(); // 更新颜色
                } else if (SHHisTimerRunningSHH17) {
                    if (SHHsecSHH17 < SHHblueThresholdSHH17) {
                        SHHupdateButtonColorSHH17();
                        SHHshowConfirmationDialogYNForButtonSHH17();
                    } else if (SHHblueThresholdSHH17 <= SHHsecSHH17 && SHHsecSHH17 < SHHyellowThresholdSHH17) {
                        if (!SHHflashingSHH17) {
                            SHHflashingSHH17 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH17();
                        } else if (SHHflashingSHH17) {
                            SHHupdateButtonColorSHH17();
                            SHHshowConfirmationDialogYNForButtonSHH17();
                        }

                    } else if (SHHyellowThresholdSHH17 <= SHHsecSHH17 && SHHsecSHH17 < SHHredThresholdSHH17) {
                        if (!SHHflashinggSHH17) {
                            SHHflashinggSHH17 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH17();
                        } else if (SHHflashinggSHH17) {
                            SHHupdateButtonColorSHH17();
                            SHHshowConfirmationDialogYNForButtonSHH17();
                        }

                    } else if (SHHsecSHH17 >= SHHredThresholdSHH17) {
                        SHHupdateButtonColorSHH17();
                        SHHshowConfirmationDialogYNForButtonSHH17();
                    }
                }
            }
        });

        SHHbtnTimerSHH17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH17();
                return true;
            }
        });

        SHHbtnTimerSHH18 = findViewById(R.id.SHHbuttonSHH18);
        SHHbtnTimerSHH18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH18) {
                    showConfirmationDialogForButton18();
                    SHHupdateButtonColorSHH18(); // 更新颜色
                } else if (SHHisTimerRunningSHH18) {
                    if (SHHsecSHH18 < SHHblueThresholdSHH18) {
                        SHHupdateButtonColorSHH18();
                        SHHshowConfirmationDialogYNForButtonSHH18();
                    } else if (SHHblueThresholdSHH18 <= SHHsecSHH18 && SHHsecSHH18 < SHHyellowThresholdSHH18) {
                        if (!SHHflashingSHH18) {
                            SHHflashingSHH18 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH18();
                        } else if (SHHflashingSHH18) {
                            SHHupdateButtonColorSHH18();
                            SHHshowConfirmationDialogYNForButtonSHH18();
                        }

                    } else if (SHHyellowThresholdSHH18 <= SHHsecSHH18 && SHHsecSHH18 < SHHredThresholdSHH18) {
                        if (!SHHflashinggSHH18) {
                            SHHflashinggSHH18 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH18();
                        } else if (SHHflashinggSHH18) {
                            SHHupdateButtonColorSHH18();
                            SHHshowConfirmationDialogYNForButtonSHH18();
                        }

                    } else if (SHHsecSHH18 >= SHHredThresholdSHH18) {
                        SHHupdateButtonColorSHH18();
                        SHHshowConfirmationDialogYNForButtonSHH18();
                    }
                }
            }
        });

        SHHbtnTimerSHH18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH18();
                return true;
            }
        });
        SHHbtnTimerSHH19 = findViewById(R.id.SHHbuttonSHH19);
        SHHbtnTimerSHH19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH19) {
                    showConfirmationDialogForButton19();
                    SHHupdateButtonColorSHH19(); // 更新颜色
                } else if (SHHisTimerRunningSHH19) {
                    if (SHHsecSHH19 < SHHblueThresholdSHH19) {
                        SHHupdateButtonColorSHH19();
                        SHHshowConfirmationDialogYNForButtonSHH19();
                    } else if (SHHblueThresholdSHH19 <= SHHsecSHH19 && SHHsecSHH19 < SHHyellowThresholdSHH19) {
                        if (!SHHflashingSHH19) {
                            SHHflashingSHH19 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH19();
                        } else if (SHHflashingSHH19) {
                            SHHupdateButtonColorSHH19();
                            SHHshowConfirmationDialogYNForButtonSHH19();
                        }

                    } else if (SHHyellowThresholdSHH19 <= SHHsecSHH19 && SHHsecSHH19 < SHHredThresholdSHH19) {
                        if (!SHHflashinggSHH19) {
                            SHHflashinggSHH19 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH19();
                        } else if (SHHflashinggSHH19) {
                            SHHupdateButtonColorSHH19();
                            SHHshowConfirmationDialogYNForButtonSHH19();
                        }

                    } else if (SHHsecSHH19 >= SHHredThresholdSHH19) {
                        SHHupdateButtonColorSHH19();
                        SHHshowConfirmationDialogYNForButtonSHH19();
                    }
                }
            }
        });

        SHHbtnTimerSHH19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH19();
                return true;
            }
        });
        SHHbtnTimerSHH20 = findViewById(R.id.SHHbuttonSHH20);
        SHHbtnTimerSHH20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH20) {
                    showConfirmationDialogForButton20();
                    SHHupdateButtonColorSHH20(); // 更新颜色
                } else if (SHHisTimerRunningSHH20) {
                    if (SHHsecSHH20 < SHHblueThresholdSHH20) {
                        SHHupdateButtonColorSHH20();
                        SHHshowConfirmationDialogYNForButtonSHH20();
                    } else if (SHHblueThresholdSHH20 <= SHHsecSHH20 && SHHsecSHH20 < SHHyellowThresholdSHH20) {
                        if (!SHHflashingSHH20) {
                            SHHflashingSHH20 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH20();
                        } else if (SHHflashingSHH20) {
                            SHHupdateButtonColorSHH20();
                            SHHshowConfirmationDialogYNForButtonSHH20();
                        }

                    } else if (SHHyellowThresholdSHH20 <= SHHsecSHH20 && SHHsecSHH20 < SHHredThresholdSHH20) {
                        if (!SHHflashinggSHH20) {
                            SHHflashinggSHH20 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH20();
                        } else if (SHHflashinggSHH20) {
                            SHHupdateButtonColorSHH20();
                            SHHshowConfirmationDialogYNForButtonSHH20();
                        }

                    } else if (SHHsecSHH20 >= SHHredThresholdSHH20) {
                        SHHupdateButtonColorSHH20();
                        SHHshowConfirmationDialogYNForButtonSHH20();
                    }
                }
            }
        });

        SHHbtnTimerSHH20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH20();
                return true;
            }
        });
        SHHbtnTimerSHH21 = findViewById(R.id.SHHbuttonSHH21);
        SHHbtnTimerSHH21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH21) {
                    showConfirmationDialogForButton21();
                    SHHupdateButtonColorSHH21(); // 更新颜色
                } else if (SHHisTimerRunningSHH21) {
                    if (SHHsecSHH21 < SHHblueThresholdSHH21) {
                        SHHupdateButtonColorSHH21();
                        SHHshowConfirmationDialogYNForButtonSHH21();
                    } else if (SHHblueThresholdSHH21 <= SHHsecSHH21 && SHHsecSHH21 < SHHyellowThresholdSHH21) {
                        if (!SHHflashingSHH21) {
                            SHHflashingSHH21 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH21();
                        } else if (SHHflashingSHH21) {
                            SHHupdateButtonColorSHH21();
                            SHHshowConfirmationDialogYNForButtonSHH21();
                        }

                    } else if (SHHyellowThresholdSHH21 <= SHHsecSHH21 && SHHsecSHH21 < SHHredThresholdSHH21) {
                        if (!SHHflashinggSHH21) {
                            SHHflashinggSHH21 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH21();
                        } else if (SHHflashinggSHH21) {
                            SHHupdateButtonColorSHH21();
                            SHHshowConfirmationDialogYNForButtonSHH21();
                        }

                    } else if (SHHsecSHH21 >= SHHredThresholdSHH21) {
                        SHHupdateButtonColorSHH21();
                        SHHshowConfirmationDialogYNForButtonSHH21();
                    }
                }
            }
        });

        SHHbtnTimerSHH21.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH21();
                return true;
            }
        });
        SHHbtnTimerSHH22 = findViewById(R.id.SHHbuttonSHH22);
        SHHbtnTimerSHH22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH22) {
                    showConfirmationDialogForButton22();
                    SHHupdateButtonColorSHH22(); // 更新颜色
                } else if (SHHisTimerRunningSHH22) {
                    if (SHHsecSHH22 < SHHblueThresholdSHH22) {
                        SHHupdateButtonColorSHH22();
                        SHHshowConfirmationDialogYNForButtonSHH22();
                    } else if (SHHblueThresholdSHH22 <= SHHsecSHH22 && SHHsecSHH22 < SHHyellowThresholdSHH22) {
                        if (!SHHflashingSHH22) {
                            SHHflashingSHH22 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH22();
                        } else if (SHHflashingSHH22) {
                            SHHupdateButtonColorSHH22();
                            SHHshowConfirmationDialogYNForButtonSHH22();
                        }

                    } else if (SHHyellowThresholdSHH22 <= SHHsecSHH22 && SHHsecSHH22 < SHHredThresholdSHH22) {
                        if (!SHHflashinggSHH22) {
                            SHHflashinggSHH22 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH22();
                        } else if (SHHflashinggSHH22) {
                            SHHupdateButtonColorSHH22();
                            SHHshowConfirmationDialogYNForButtonSHH22();
                        }

                    } else if (SHHsecSHH22 >= SHHredThresholdSHH22) {
                        SHHupdateButtonColorSHH22();
                        SHHshowConfirmationDialogYNForButtonSHH22();
                    }
                }
            }
        });

        SHHbtnTimerSHH22.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH22();
                return true;
            }
        });

        SHHbtnTimerSHH23 = findViewById(R.id.SHHbuttonSHH23);
        SHHbtnTimerSHH23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH23) {
                    showConfirmationDialogForButton23();
                    SHHupdateButtonColorSHH23(); // 更新颜色
                } else if (SHHisTimerRunningSHH23) {
                    if (SHHsecSHH23 < SHHblueThresholdSHH23) {
                        SHHupdateButtonColorSHH23();
                        SHHshowConfirmationDialogYNForButtonSHH23();
                    } else if (SHHblueThresholdSHH23 <= SHHsecSHH23 && SHHsecSHH23 < SHHyellowThresholdSHH23) {
                        if (!SHHflashingSHH23) {
                            SHHflashingSHH23 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH23();
                        } else if (SHHflashingSHH23) {
                            SHHupdateButtonColorSHH23();
                            SHHshowConfirmationDialogYNForButtonSHH23();
                        }

                    } else if (SHHyellowThresholdSHH23 <= SHHsecSHH23 && SHHsecSHH23 < SHHredThresholdSHH23) {
                        if (!SHHflashinggSHH23) {
                            SHHflashinggSHH23 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH23();
                        } else if (SHHflashinggSHH23) {
                            SHHupdateButtonColorSHH23();
                            SHHshowConfirmationDialogYNForButtonSHH23();
                        }

                    } else if (SHHsecSHH23 >= SHHredThresholdSHH23) {
                        SHHupdateButtonColorSHH23();
                        SHHshowConfirmationDialogYNForButtonSHH23();
                    }
                }
            }
        });

        SHHbtnTimerSHH23.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH23();
                return true;
            }
        });
        SHHbtnTimerSHH24 = findViewById(R.id.SHHbuttonSHH24);
        SHHbtnTimerSHH24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH24) {
                    showConfirmationDialogForButton24();
                    SHHupdateButtonColorSHH24(); // 更新颜色
                } else if (SHHisTimerRunningSHH24) {
                    if (SHHsecSHH24 < SHHblueThresholdSHH24) {
                        SHHupdateButtonColorSHH24();
                        SHHshowConfirmationDialogYNForButtonSHH24();
                    } else if (SHHblueThresholdSHH24 <= SHHsecSHH24 && SHHsecSHH24 < SHHyellowThresholdSHH24) {
                        if (!SHHflashingSHH24) {
                            SHHflashingSHH24 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH24();
                        } else if (SHHflashingSHH24) {
                            SHHupdateButtonColorSHH24();
                            SHHshowConfirmationDialogYNForButtonSHH24();
                        }

                    } else if (SHHyellowThresholdSHH24 <= SHHsecSHH24 && SHHsecSHH24 < SHHredThresholdSHH24) {
                        if (!SHHflashinggSHH24) {
                            SHHflashinggSHH24 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH24();
                        } else if (SHHflashinggSHH24) {
                            SHHupdateButtonColorSHH24();
                            SHHshowConfirmationDialogYNForButtonSHH24();
                        }

                    } else if (SHHsecSHH24 >= SHHredThresholdSHH24) {
                        SHHupdateButtonColorSHH24();
                        SHHshowConfirmationDialogYNForButtonSHH24();
                    }
                }
            }
        });

        SHHbtnTimerSHH24.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH24();
                return true;
            }
        });
        SHHbtnTimerSHH25 = findViewById(R.id.SHHbuttonSHH25);
        SHHbtnTimerSHH25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH25) {
                    showConfirmationDialogForButton25();
                    SHHupdateButtonColorSHH25(); // 更新颜色
                } else if (SHHisTimerRunningSHH25) {
                    if (SHHsecSHH25 < SHHblueThresholdSHH25) {
                        SHHupdateButtonColorSHH25();
                        SHHshowConfirmationDialogYNForButtonSHH25();
                    } else if (SHHblueThresholdSHH25 <= SHHsecSHH25 && SHHsecSHH25 < SHHyellowThresholdSHH25) {
                        if (!SHHflashingSHH25) {
                            SHHflashingSHH25 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH25();
                        } else if (SHHflashingSHH25) {
                            SHHupdateButtonColorSHH25();
                            SHHshowConfirmationDialogYNForButtonSHH25();
                        }

                    } else if (SHHyellowThresholdSHH25 <= SHHsecSHH25 && SHHsecSHH25 < SHHredThresholdSHH25) {
                        if (!SHHflashinggSHH25) {
                            SHHflashinggSHH25 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH25();
                        } else if (SHHflashinggSHH25) {
                            SHHupdateButtonColorSHH25();
                            SHHshowConfirmationDialogYNForButtonSHH25();
                        }

                    } else if (SHHsecSHH25 >= SHHredThresholdSHH25) {
                        SHHupdateButtonColorSHH25();
                        SHHshowConfirmationDialogYNForButtonSHH25();
                    }
                }
            }
        });

        SHHbtnTimerSHH25.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH25();
                return true;
            }
        });
        SHHbtnTimerSHH26 = findViewById(R.id.SHHbuttonSHH26);
        SHHbtnTimerSHH26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH26) {
                    showConfirmationDialogForButton26();
                    SHHupdateButtonColorSHH26(); // 更新颜色
                } else if (SHHisTimerRunningSHH26) {
                    if (SHHsecSHH26 < SHHblueThresholdSHH26) {
                        SHHupdateButtonColorSHH26();
                        SHHshowConfirmationDialogYNForButtonSHH26();
                    } else if (SHHblueThresholdSHH26 <= SHHsecSHH26 && SHHsecSHH26 < SHHyellowThresholdSHH26) {
                        if (!SHHflashingSHH26) {
                            SHHflashingSHH26 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH26();
                        } else if (SHHflashingSHH26) {
                            SHHupdateButtonColorSHH26();
                            SHHshowConfirmationDialogYNForButtonSHH26();
                        }

                    } else if (SHHyellowThresholdSHH26 <= SHHsecSHH26 && SHHsecSHH26 < SHHredThresholdSHH26) {
                        if (!SHHflashinggSHH26) {
                            SHHflashinggSHH26 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH26();
                        } else if (SHHflashinggSHH26) {
                            SHHupdateButtonColorSHH26();
                            SHHshowConfirmationDialogYNForButtonSHH26();
                        }

                    } else if (SHHsecSHH26 >= SHHredThresholdSHH26) {
                        SHHupdateButtonColorSHH26();
                        SHHshowConfirmationDialogYNForButtonSHH26();
                    }
                }
            }
        });

        SHHbtnTimerSHH26.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH26();
                return true;
            }
        });
        SHHbtnTimerSHH27 = findViewById(R.id.SHHbuttonSHH27);
        SHHbtnTimerSHH27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH27) {
                    showConfirmationDialogForButton27();
                    SHHupdateButtonColorSHH27(); // 更新颜色
                } else if (SHHisTimerRunningSHH27) {
                    if (SHHsecSHH27 < SHHblueThresholdSHH27) {
                        SHHupdateButtonColorSHH27();
                        SHHshowConfirmationDialogYNForButtonSHH27();
                    } else if (SHHblueThresholdSHH27 <= SHHsecSHH27 && SHHsecSHH27 < SHHyellowThresholdSHH27) {
                        if (!SHHflashingSHH27) {
                            SHHflashingSHH27 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH27();
                        } else if (SHHflashingSHH27) {
                            SHHupdateButtonColorSHH27();
                            SHHshowConfirmationDialogYNForButtonSHH27();
                        }

                    } else if (SHHyellowThresholdSHH27 <= SHHsecSHH27 && SHHsecSHH27 < SHHredThresholdSHH27) {
                        if (!SHHflashinggSHH27) {
                            SHHflashinggSHH27 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH27();
                        } else if (SHHflashinggSHH27) {
                            SHHupdateButtonColorSHH27();
                            SHHshowConfirmationDialogYNForButtonSHH27();
                        }

                    } else if (SHHsecSHH27 >= SHHredThresholdSHH27) {
                        SHHupdateButtonColorSHH27();
                        SHHshowConfirmationDialogYNForButtonSHH27();
                    }
                }
            }
        });

        SHHbtnTimerSHH27.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH27();
                return true;
            }
        });

        SHHbtnTimerSHH28 = findViewById(R.id.SHHbuttonSHH28);
        SHHbtnTimerSHH28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH28) {
                    showConfirmationDialogForButton28();
                    SHHupdateButtonColorSHH28(); // 更新颜色
                } else if (SHHisTimerRunningSHH28) {
                    if (SHHsecSHH28 < SHHblueThresholdSHH28) {
                        SHHupdateButtonColorSHH28();
                        SHHshowConfirmationDialogYNForButtonSHH28();
                    } else if (SHHblueThresholdSHH28 <= SHHsecSHH28 && SHHsecSHH28 < SHHyellowThresholdSHH28) {
                        if (!SHHflashingSHH28) {
                            SHHflashingSHH28 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH28();
                        } else if (SHHflashingSHH28) {
                            SHHupdateButtonColorSHH28();
                            SHHshowConfirmationDialogYNForButtonSHH28();
                        }

                    } else if (SHHyellowThresholdSHH28 <= SHHsecSHH28 && SHHsecSHH28 < SHHredThresholdSHH28) {
                        if (!SHHflashinggSHH28) {
                            SHHflashinggSHH28 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH28();
                        } else if (SHHflashinggSHH28) {
                            SHHupdateButtonColorSHH28();
                            SHHshowConfirmationDialogYNForButtonSHH28();
                        }

                    } else if (SHHsecSHH28 >= SHHredThresholdSHH28) {
                        SHHupdateButtonColorSHH28();
                        SHHshowConfirmationDialogYNForButtonSHH28();
                    }
                }
            }
        });

        SHHbtnTimerSHH28.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH28();
                return true;
            }
        });
        SHHbtnTimerSHH29 = findViewById(R.id.SHHbuttonSHH29);
        SHHbtnTimerSHH29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH29) {
                    showConfirmationDialogForButton29();
                    SHHupdateButtonColorSHH29(); // 更新颜色
                } else if (SHHisTimerRunningSHH29) {
                    if (SHHsecSHH29 < SHHblueThresholdSHH29) {
                        SHHupdateButtonColorSHH29();
                        SHHshowConfirmationDialogYNForButtonSHH29();
                    } else if (SHHblueThresholdSHH29 <= SHHsecSHH29 && SHHsecSHH29 < SHHyellowThresholdSHH29) {
                        if (!SHHflashingSHH29) {
                            SHHflashingSHH29 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH29();
                        } else if (SHHflashingSHH29) {
                            SHHupdateButtonColorSHH29();
                            SHHshowConfirmationDialogYNForButtonSHH29();
                        }

                    } else if (SHHyellowThresholdSHH29 <= SHHsecSHH29 && SHHsecSHH29 < SHHredThresholdSHH29) {
                        if (!SHHflashinggSHH29) {
                            SHHflashinggSHH29 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH29();
                        } else if (SHHflashinggSHH29) {
                            SHHupdateButtonColorSHH29();
                            SHHshowConfirmationDialogYNForButtonSHH29();
                        }

                    } else if (SHHsecSHH29 >= SHHredThresholdSHH29) {
                        SHHupdateButtonColorSHH29();
                        SHHshowConfirmationDialogYNForButtonSHH29();
                    }
                }
            }
        });

        SHHbtnTimerSHH29.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH29();
                return true;
            }
        });
        SHHbtnTimerSHH30 = findViewById(R.id.SHHbuttonSHH30);
        SHHbtnTimerSHH30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH30) {
                    showConfirmationDialogForButton30();
                    SHHupdateButtonColorSHH30(); // 更新颜色
                } else if (SHHisTimerRunningSHH30) {
                    if (SHHsecSHH30 < SHHblueThresholdSHH30) {
                        SHHupdateButtonColorSHH30();
                        SHHshowConfirmationDialogYNForButtonSHH30();
                    } else if (SHHblueThresholdSHH30 <= SHHsecSHH30 && SHHsecSHH30 < SHHyellowThresholdSHH30) {
                        if (!SHHflashingSHH30) {
                            SHHflashingSHH30 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH30();
                        } else if (SHHflashingSHH30) {
                            SHHupdateButtonColorSHH30();
                            SHHshowConfirmationDialogYNForButtonSHH30();
                        }

                    } else if (SHHyellowThresholdSHH30 <= SHHsecSHH30 && SHHsecSHH30 < SHHredThresholdSHH30) {
                        if (!SHHflashinggSHH30) {
                            SHHflashinggSHH30 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH30();
                        } else if (SHHflashinggSHH30) {
                            SHHupdateButtonColorSHH30();
                            SHHshowConfirmationDialogYNForButtonSHH30();
                        }

                    } else if (SHHsecSHH30 >= SHHredThresholdSHH30) {
                        SHHupdateButtonColorSHH30();
                        SHHshowConfirmationDialogYNForButtonSHH30();
                    }
                }
            }
        });

        SHHbtnTimerSHH30.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH30();
                return true;
            }
        });
        SHHbtnTimerSHH31 = findViewById(R.id.SHHbuttonSHH31);
        SHHbtnTimerSHH31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH31) {
                    showConfirmationDialogForButton31();
                    SHHupdateButtonColorSHH31(); // 更新颜色
                } else if (SHHisTimerRunningSHH31) {
                    if (SHHsecSHH31 < SHHblueThresholdSHH31) {
                        SHHupdateButtonColorSHH31();
                        SHHshowConfirmationDialogYNForButtonSHH31();
                    } else if (SHHblueThresholdSHH31 <= SHHsecSHH31 && SHHsecSHH31 < SHHyellowThresholdSHH31) {
                        if (!SHHflashingSHH31) {
                            SHHflashingSHH31 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH31();
                        } else if (SHHflashingSHH31) {
                            SHHupdateButtonColorSHH31();
                            SHHshowConfirmationDialogYNForButtonSHH31();
                        }

                    } else if (SHHyellowThresholdSHH31 <= SHHsecSHH31 && SHHsecSHH31 < SHHredThresholdSHH31) {
                        if (!SHHflashinggSHH31) {
                            SHHflashinggSHH31 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH31();
                        } else if (SHHflashinggSHH31) {
                            SHHupdateButtonColorSHH31();
                            SHHshowConfirmationDialogYNForButtonSHH31();
                        }

                    } else if (SHHsecSHH31 >= SHHredThresholdSHH31) {
                        SHHupdateButtonColorSHH31();
                        SHHshowConfirmationDialogYNForButtonSHH31();
                    }
                }
            }
        });

        SHHbtnTimerSHH31.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH31();
                return true;
            }
        });
        SHHbtnTimerSHH32 = findViewById(R.id.SHHbuttonSHH32);
        SHHbtnTimerSHH32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH32) {
                    showConfirmationDialogForButton32();
                    SHHupdateButtonColorSHH32(); // 更新颜色
                } else if (SHHisTimerRunningSHH32) {
                    if (SHHsecSHH32 < SHHblueThresholdSHH32) {
                        SHHupdateButtonColorSHH32();
                        SHHshowConfirmationDialogYNForButtonSHH32();
                    } else if (SHHblueThresholdSHH32 <= SHHsecSHH32 && SHHsecSHH32 < SHHyellowThresholdSHH32) {
                        if (!SHHflashingSHH32) {
                            SHHflashingSHH32 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH32();
                        } else if (SHHflashingSHH32) {
                            SHHupdateButtonColorSHH32();
                            SHHshowConfirmationDialogYNForButtonSHH32();
                        }

                    } else if (SHHyellowThresholdSHH32 <= SHHsecSHH32 && SHHsecSHH32 < SHHredThresholdSHH32) {
                        if (!SHHflashinggSHH32) {
                            SHHflashinggSHH32 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH32();
                        } else if (SHHflashinggSHH32) {
                            SHHupdateButtonColorSHH32();
                            SHHshowConfirmationDialogYNForButtonSHH32();
                        }

                    } else if (SHHsecSHH32 >= SHHredThresholdSHH32) {
                        SHHupdateButtonColorSHH32();
                        SHHshowConfirmationDialogYNForButtonSHH32();
                    }
                }
            }
        });

        SHHbtnTimerSHH32.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH32();
                return true;
            }
        });

        SHHbtnTimerSHH33 = findViewById(R.id.SHHbuttonSHH33);
        SHHbtnTimerSHH33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!SHHisTimerRunningSHH33) {
                    showConfirmationDialogForButton33();
                    SHHupdateButtonColorSHH33(); // 更新颜色
                } else if (SHHisTimerRunningSHH33) {
                    if (SHHsecSHH33 < SHHblueThresholdSHH33) {
                        SHHupdateButtonColorSHH33();
                        SHHshowConfirmationDialogYNForButtonSHH33();
                    } else if (SHHblueThresholdSHH33 <= SHHsecSHH33 && SHHsecSHH33 < SHHyellowThresholdSHH33) {
                        if (!SHHflashingSHH33) {
                            SHHflashingSHH33 = true; // 停止蓝色闪烁
                            SHHupdateButtonColorSHH33();
                        } else if (SHHflashingSHH33) {
                            SHHupdateButtonColorSHH33();
                            SHHshowConfirmationDialogYNForButtonSHH33();
                        }

                    } else if (SHHyellowThresholdSHH33 <= SHHsecSHH33 && SHHsecSHH33 < SHHredThresholdSHH33) {
                        if (!SHHflashinggSHH33) {
                            SHHflashinggSHH33 = true; // 停止黄色闪烁
                            SHHupdateButtonColorSHH33();
                        } else if (SHHflashinggSHH33) {
                            SHHupdateButtonColorSHH33();
                            SHHshowConfirmationDialogYNForButtonSHH33();
                        }

                    } else if (SHHsecSHH33 >= SHHredThresholdSHH33) {
                        SHHupdateButtonColorSHH33();
                        SHHshowConfirmationDialogYNForButtonSHH33();
                    }
                }
            }
        });

        SHHbtnTimerSHH33.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                SHHshowTimeDialogForButtonSHH33();
                return true;
            }
        });

    }
//-----------------------------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        //-----------------------------------------------------------------------------------------------
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH107);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH102);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH103);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH104);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH105);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH106);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH107);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH8);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH9);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH10);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH11);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH12);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH13);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH14);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH15);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH16);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH17);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH18);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH19);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH20);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH21);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH22);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH23);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH24);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH25);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH26);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH27);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH28);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH29);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH30);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH31);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH32);
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH33);

        //-----------------------------------------------------------------------------------------------
        // 停止計時器服務
        Intent SHHtimerServiceIntentSHH1 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH1);

        Intent SHHtimerServiceIntentSHH2 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH2);

        Intent SHHtimerServiceIntentSHH3 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH3);

        Intent SHHtimerServiceIntentSHH4 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH4);

        Intent SHHtimerServiceIntentSHH5 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH5);

        Intent SHHtimerServiceIntentSHH6 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH6);

        Intent SHHtimerServiceIntentSHH7 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH7);

        Intent SHHtimerServiceIntentSHH8 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH8);

        Intent SHHtimerServiceIntentSHH9 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH9);

        Intent SHHtimerServiceIntentSHH10 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH10);

        Intent SHHtimerServiceIntentSHH11 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH11);

        Intent SHHtimerServiceIntentSHH12 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH12);

        Intent SHHtimerServiceIntentSHH13 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH13);

        Intent SHHtimerServiceIntentSHH14 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH14);

        Intent SHHtimerServiceIntentSHH15 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH15);

        Intent SHHtimerServiceIntentSHH16 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH16);

        Intent SHHtimerServiceIntentSHH17 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH17);

        Intent SHHtimerServiceIntentSHH18 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH18);

        Intent SHHtimerServiceIntentSHH19 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH19);

        Intent SHHtimerServiceIntentSHH20 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH20);

        Intent SHHtimerServiceIntentSHH21 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH21);

        Intent SHHtimerServiceIntentSHH22 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH22);

        Intent SHHtimerServiceIntentSHH23 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH23);

        Intent SHHtimerServiceIntentSHH24 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH24);

        Intent SHHtimerServiceIntentSHH25 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH25);

        Intent SHHtimerServiceIntentSHH26 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH26);

        Intent SHHtimerServiceIntentSHH27 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH27);

        Intent SHHtimerServiceIntentSHH28 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH28);

        Intent SHHtimerServiceIntentSHH29 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH29);

        Intent SHHtimerServiceIntentSHH30 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH30);

        Intent SHHtimerServiceIntentSHH31 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH31);

        Intent SHHtimerServiceIntentSHH32 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH32);

        Intent SHHtimerServiceIntentSHH33 = new Intent(this, TimerServiceS2H.class);
        stopService(SHHtimerServiceIntentSHH33);

        //------------------------------------------------------------------------------------------
    }


    @Override
    public void onPause() {
        super.onPause();


        // 在保存計時器1狀態時，使用SHHeditorSHH1對象進行同步
        synchronized (SHHeditorSHH101) {
            SHHeditorSHH101.putBoolean(SHHTIMER_STARTED_KEY_SHH101, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH101));
            SHHeditorSHH101.putLong(SHHSTART_TIME_KEY_SHH101, SHHstartTimeSHH101);
            SHHeditorSHH101.putLong(SHHELAPSED_TIME_KEY_SHH101, SHHtimeInMilliSHHsecondsSHH101);
            SHHeditorSHH101.putBoolean("SHHpeople_keySHH101", SHHpeopleSHH_101);
            SHHeditorSHH101.putBoolean("SHHflashing_keySHH101", SHHflashingSHH101);
            SHHeditorSHH101.putBoolean("SHHflashingg_keySHH101", SHHflashinggSHH101);
            SHHeditorSHH101.putBoolean("SHHisTimerRunningSHH101", SHHisTimerRunningSHH101);
            SHHeditorSHH101.putInt("SHHcurrentHourSHH101", SHHcurrentHourSHH101);
            SHHeditorSHH101.putInt("SHHcurrentMinuteSHH101", SHHcurrentMinuteSHH101);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH101.putInt("SHHblueThresholdSHH101", SHHblueThresholdSHH101);
            SHHeditorSHH101.putInt("SHHyellowThresholdSHH101", SHHyellowThresholdSHH101);
            SHHeditorSHH101.putInt("SHHredThresholdSHH101", SHHredThresholdSHH101);
            SHHeditorSHH101.apply();
        }
        synchronized (SHHeditorSHH102) {
            SHHeditorSHH102.putBoolean(SHHTIMER_STARTED_KEY_SHH102, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH102));
            SHHeditorSHH102.putLong(SHHSTART_TIME_KEY_SHH102, SHHstartTimeSHH102);
            SHHeditorSHH102.putLong(SHHELAPSED_TIME_KEY_SHH102, SHHtimeInMilliSHHsecondsSHH102);
            SHHeditorSHH102.putBoolean("SHHpeople_keySHH102", SHHpeopleSHH_102);
            SHHeditorSHH102.putBoolean("SHHflashing_keySHH102", SHHflashingSHH102);
            SHHeditorSHH102.putBoolean("SHHflashingg_keySHH102", SHHflashinggSHH102);
            SHHeditorSHH102.putBoolean("SHHisTimerRunningSHH102", SHHisTimerRunningSHH102);
            SHHeditorSHH102.putInt("SHHcurrentHourSHH102", SHHcurrentHourSHH102);
            SHHeditorSHH102.putInt("SHHcurrentMinuteSHH102", SHHcurrentMinuteSHH102);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH102.putInt("SHHblueThresholdSHH102", SHHblueThresholdSHH102);
            SHHeditorSHH102.putInt("SHHyellowThresholdSHH102", SHHyellowThresholdSHH102);
            SHHeditorSHH102.putInt("SHHredThresholdSHH102", SHHredThresholdSHH102);
            SHHeditorSHH102.apply();
        }
        synchronized (SHHeditorSHH103) {
            SHHeditorSHH103.putBoolean(SHHTIMER_STARTED_KEY_SHH103, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH103));
            SHHeditorSHH103.putLong(SHHSTART_TIME_KEY_SHH103, SHHstartTimeSHH103);
            SHHeditorSHH103.putLong(SHHELAPSED_TIME_KEY_SHH103, SHHtimeInMilliSHHsecondsSHH103);
            SHHeditorSHH103.putBoolean("SHHpeople_keySHH103", SHHpeopleSHH_103);
            SHHeditorSHH103.putBoolean("SHHflashing_keySHH103", SHHflashingSHH103);
            SHHeditorSHH103.putBoolean("SHHflashingg_keySHH103", SHHflashinggSHH103);
            SHHeditorSHH103.putBoolean("SHHisTimerRunningSHH103", SHHisTimerRunningSHH103);
            SHHeditorSHH103.putInt("SHHcurrentHourSHH103", SHHcurrentHourSHH103);
            SHHeditorSHH103.putInt("SHHcurrentMinuteSHH103", SHHcurrentMinuteSHH103);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH103.putInt("SHHblueThresholdSHH103", SHHblueThresholdSHH103);
            SHHeditorSHH103.putInt("SHHyellowThresholdSHH103", SHHyellowThresholdSHH103);
            SHHeditorSHH103.putInt("SHHredThresholdSHH103", SHHredThresholdSHH103);
            SHHeditorSHH103.apply();
        }

        synchronized (SHHeditorSHH104) {
            SHHeditorSHH104.putBoolean(SHHTIMER_STARTED_KEY_SHH104, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH104));
            SHHeditorSHH104.putLong(SHHSTART_TIME_KEY_SHH104, SHHstartTimeSHH104);
            SHHeditorSHH104.putLong(SHHELAPSED_TIME_KEY_SHH104, SHHtimeInMilliSHHsecondsSHH104);
            SHHeditorSHH104.putBoolean("SHHpeople_keySHH104", SHHpeopleSHH_104);
            SHHeditorSHH104.putBoolean("SHHflashing_keySHH104", SHHflashingSHH104);
            SHHeditorSHH104.putBoolean("SHHflashingg_keySHH104", SHHflashinggSHH104);
            SHHeditorSHH104.putBoolean("SHHisTimerRunningSHH104", SHHisTimerRunningSHH104);
            SHHeditorSHH104.putInt("SHHcurrentHourSHH104", SHHcurrentHourSHH104);
            SHHeditorSHH104.putInt("SHHcurrentMinuteSHH104", SHHcurrentMinuteSHH104);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH104.putInt("SHHblueThresholdSHH104", SHHblueThresholdSHH104);
            SHHeditorSHH104.putInt("SHHyellowThresholdSHH104", SHHyellowThresholdSHH104);
            SHHeditorSHH104.putInt("SHHredThresholdSHH104", SHHredThresholdSHH104);
            SHHeditorSHH104.apply();
        }
        synchronized (SHHeditorSHH105) {
            SHHeditorSHH105.putBoolean(SHHTIMER_STARTED_KEY_SHH105, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH105));
            SHHeditorSHH105.putLong(SHHSTART_TIME_KEY_SHH105, SHHstartTimeSHH105);
            SHHeditorSHH105.putLong(SHHELAPSED_TIME_KEY_SHH105, SHHtimeInMilliSHHsecondsSHH105);
            SHHeditorSHH105.putBoolean("SHHpeople_keySHH105", SHHpeopleSHH_105);
            SHHeditorSHH105.putBoolean("SHHflashing_keySHH105", SHHflashingSHH105);
            SHHeditorSHH105.putBoolean("SHHflashingg_keySHH105", SHHflashinggSHH105);
            SHHeditorSHH105.putBoolean("SHHisTimerRunningSHH105", SHHisTimerRunningSHH105);
            SHHeditorSHH105.putInt("SHHcurrentHourSHH105", SHHcurrentHourSHH105);
            SHHeditorSHH105.putInt("SHHcurrentMinuteSHH105", SHHcurrentMinuteSHH105);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH105.putInt("SHHblueThresholdSHH105", SHHblueThresholdSHH105);
            SHHeditorSHH105.putInt("SHHyellowThresholdSHH105", SHHyellowThresholdSHH105);
            SHHeditorSHH105.putInt("SHHredThresholdSHH105", SHHredThresholdSHH105);
            SHHeditorSHH105.apply();
        }
        synchronized (SHHeditorSHH106) {
            SHHeditorSHH106.putBoolean(SHHTIMER_STARTED_KEY_SHH106, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH106));
            SHHeditorSHH106.putLong(SHHSTART_TIME_KEY_SHH106, SHHstartTimeSHH106);
            SHHeditorSHH106.putLong(SHHELAPSED_TIME_KEY_SHH106, SHHtimeInMilliSHHsecondsSHH106);
            SHHeditorSHH106.putBoolean("SHHpeople_keySHH106", SHHpeopleSHH_106);
            SHHeditorSHH106.putBoolean("SHHflashing_keySHH106", SHHflashingSHH106);
            SHHeditorSHH106.putBoolean("SHHflashingg_keySHH106", SHHflashinggSHH106);
            SHHeditorSHH106.putBoolean("SHHisTimerRunningSHH106", SHHisTimerRunningSHH106);
            SHHeditorSHH106.putInt("SHHcurrentHourSHH106", SHHcurrentHourSHH106);
            SHHeditorSHH106.putInt("SHHcurrentMinuteSHH106", SHHcurrentMinuteSHH106);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH106.putInt("SHHblueThresholdSHH106", SHHblueThresholdSHH106);
            SHHeditorSHH106.putInt("SHHyellowThresholdSHH106", SHHyellowThresholdSHH106);
            SHHeditorSHH106.putInt("SHHredThresholdSHH106", SHHredThresholdSHH106);
            SHHeditorSHH106.apply();
        }
        synchronized (SHHeditorSHH107) {
            SHHeditorSHH107.putBoolean(SHHTIMER_STARTED_KEY_SHH107, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH107));
            SHHeditorSHH107.putLong(SHHSTART_TIME_KEY_SHH107, SHHstartTimeSHH107);
            SHHeditorSHH107.putLong(SHHELAPSED_TIME_KEY_SHH107, SHHtimeInMilliSHHsecondsSHH107);
            SHHeditorSHH107.putBoolean("SHHpeople_keySHH107", SHHpeopleSHH_107);
            SHHeditorSHH107.putBoolean("SHHflashing_keySHH107", SHHflashingSHH107);
            SHHeditorSHH107.putBoolean("SHHflashingg_keySHH107", SHHflashinggSHH107);
            SHHeditorSHH107.putBoolean("SHHisTimerRunningSHH107", SHHisTimerRunningSHH107);
            SHHeditorSHH107.putInt("SHHcurrentHourSHH107", SHHcurrentHourSHH107);
            SHHeditorSHH107.putInt("SHHcurrentMinuteSHH107", SHHcurrentMinuteSHH107);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH107.putInt("SHHblueThresholdSHH107", SHHblueThresholdSHH107);
            SHHeditorSHH107.putInt("SHHyellowThresholdSHH107", SHHyellowThresholdSHH107);
            SHHeditorSHH107.putInt("SHHredThresholdSHH107", SHHredThresholdSHH107);
            SHHeditorSHH107.apply();
        }
        synchronized (SHHeditorSHH8) {
            SHHeditorSHH8.putBoolean(SHHTIMER_STARTED_KEY_SHH8, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH8));
            SHHeditorSHH8.putLong(SHHSTART_TIME_KEY_SHH8, SHHstartTimeSHH8);
            SHHeditorSHH8.putLong(SHHELAPSED_TIME_KEY_SHH8, SHHtimeInMilliSHHsecondsSHH8);
            SHHeditorSHH8.putBoolean("SHHpeople_keySHH8", SHHpeopleSHH_8);
            SHHeditorSHH8.putBoolean("SHHflashing_keySHH8", SHHflashingSHH8);
            SHHeditorSHH8.putBoolean("SHHflashingg_keySHH8", SHHflashinggSHH8);
            SHHeditorSHH8.putBoolean("SHHisTimerRunningSHH8", SHHisTimerRunningSHH8);
            SHHeditorSHH8.putInt("SHHcurrentHourSHH8", SHHcurrentHourSHH8);
            SHHeditorSHH8.putInt("SHHcurrentMinuteSHH8", SHHcurrentMinuteSHH8);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH8.putInt("SHHblueThresholdSHH8", SHHblueThresholdSHH8);
            SHHeditorSHH8.putInt("SHHyellowThresholdSHH8", SHHyellowThresholdSHH8);
            SHHeditorSHH8.putInt("SHHredThresholdSHH8", SHHredThresholdSHH8);
            SHHeditorSHH8.apply();
        }
        synchronized (SHHeditorSHH9) {
            SHHeditorSHH9.putBoolean(SHHTIMER_STARTED_KEY_SHH9, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH9));
            SHHeditorSHH9.putLong(SHHSTART_TIME_KEY_SHH9, SHHstartTimeSHH9);
            SHHeditorSHH9.putLong(SHHELAPSED_TIME_KEY_SHH9, SHHtimeInMilliSHHsecondsSHH9);
            SHHeditorSHH9.putBoolean("SHHpeople_keySHH9", SHHpeopleSHH_9);
            SHHeditorSHH9.putBoolean("SHHflashing_keySHH9", SHHflashingSHH9);
            SHHeditorSHH9.putBoolean("SHHflashingg_keySHH9", SHHflashinggSHH9);
            SHHeditorSHH9.putBoolean("SHHisTimerRunningSHH9", SHHisTimerRunningSHH9);
            SHHeditorSHH9.putInt("SHHcurrentHourSHH9", SHHcurrentHourSHH9);
            SHHeditorSHH9.putInt("SHHcurrentMinuteSHH9", SHHcurrentMinuteSHH9);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH9.putInt("SHHblueThresholdSHH9", SHHblueThresholdSHH9);
            SHHeditorSHH9.putInt("SHHyellowThresholdSHH9", SHHyellowThresholdSHH9);
            SHHeditorSHH9.putInt("SHHredThresholdSHH9", SHHredThresholdSHH9);
            SHHeditorSHH9.apply();
        }
        synchronized (SHHeditorSHH10) {
            SHHeditorSHH10.putBoolean(SHHTIMER_STARTED_KEY_SHH10, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH10));
            SHHeditorSHH10.putLong(SHHSTART_TIME_KEY_SHH10, SHHstartTimeSHH10);
            SHHeditorSHH10.putLong(SHHELAPSED_TIME_KEY_SHH10, SHHtimeInMilliSHHsecondsSHH10);
            SHHeditorSHH10.putBoolean("SHHpeople_keySHH10", SHHpeopleSHH_10);
            SHHeditorSHH10.putBoolean("SHHflashing_keySHH10", SHHflashingSHH10);
            SHHeditorSHH10.putBoolean("SHHflashingg_keySHH10", SHHflashinggSHH10);
            SHHeditorSHH10.putBoolean("SHHisTimerRunningSHH10", SHHisTimerRunningSHH10);
            SHHeditorSHH10.putInt("SHHcurrentHourSHH10", SHHcurrentHourSHH10);
            SHHeditorSHH10.putInt("SHHcurrentMinuteSHH10", SHHcurrentMinuteSHH10);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH10.putInt("SHHblueThresholdSHH10", SHHblueThresholdSHH10);
            SHHeditorSHH10.putInt("SHHyellowThresholdSHH10", SHHyellowThresholdSHH10);
            SHHeditorSHH10.putInt("SHHredThresholdSHH10", SHHredThresholdSHH10);
            SHHeditorSHH10.apply();
        }
        synchronized (SHHeditorSHH11) {
            SHHeditorSHH11.putBoolean(SHHTIMER_STARTED_KEY_SHH11, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH11));
            SHHeditorSHH11.putLong(SHHSTART_TIME_KEY_SHH11, SHHstartTimeSHH11);
            SHHeditorSHH11.putLong(SHHELAPSED_TIME_KEY_SHH11, SHHtimeInMilliSHHsecondsSHH11);
            SHHeditorSHH11.putBoolean("SHHpeople_keySHH11", SHHpeopleSHH_11);
            SHHeditorSHH11.putBoolean("SHHflashing_keySHH11", SHHflashingSHH11);
            SHHeditorSHH11.putBoolean("SHHflashingg_keySHH11", SHHflashinggSHH11);
            SHHeditorSHH11.putBoolean("SHHisTimerRunningSHH11", SHHisTimerRunningSHH11);
            SHHeditorSHH11.putInt("SHHcurrentHourSHH11", SHHcurrentHourSHH11);
            SHHeditorSHH11.putInt("SHHcurrentMinuteSHH11", SHHcurrentMinuteSHH11);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH11.putInt("SHHblueThresholdSHH11", SHHblueThresholdSHH11);
            SHHeditorSHH11.putInt("SHHyellowThresholdSHH11", SHHyellowThresholdSHH11);
            SHHeditorSHH11.putInt("SHHredThresholdSHH11", SHHredThresholdSHH11);
            SHHeditorSHH11.apply();
        }
        synchronized (SHHeditorSHH12) {
            SHHeditorSHH12.putBoolean(SHHTIMER_STARTED_KEY_SHH12, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH12));
            SHHeditorSHH12.putLong(SHHSTART_TIME_KEY_SHH12, SHHstartTimeSHH12);
            SHHeditorSHH12.putLong(SHHELAPSED_TIME_KEY_SHH12, SHHtimeInMilliSHHsecondsSHH12);
            SHHeditorSHH12.putBoolean("SHHpeople_keySHH12", SHHpeopleSHH_12);
            SHHeditorSHH12.putBoolean("SHHflashing_keySHH12", SHHflashingSHH12);
            SHHeditorSHH12.putBoolean("SHHflashingg_keySHH12", SHHflashinggSHH12);
            SHHeditorSHH12.putBoolean("SHHisTimerRunningSHH12", SHHisTimerRunningSHH12);
            SHHeditorSHH12.putInt("SHHcurrentHourSHH12", SHHcurrentHourSHH12);
            SHHeditorSHH12.putInt("SHHcurrentMinuteSHH12", SHHcurrentMinuteSHH12);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH12.putInt("SHHblueThresholdSHH12", SHHblueThresholdSHH12);
            SHHeditorSHH12.putInt("SHHyellowThresholdSHH12", SHHyellowThresholdSHH12);
            SHHeditorSHH12.putInt("SHHredThresholdSHH12", SHHredThresholdSHH12);
            SHHeditorSHH12.apply();
        }
        synchronized (SHHeditorSHH13) {
            SHHeditorSHH13.putBoolean(SHHTIMER_STARTED_KEY_SHH13, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH13));
            SHHeditorSHH13.putLong(SHHSTART_TIME_KEY_SHH13, SHHstartTimeSHH13);
            SHHeditorSHH13.putLong(SHHELAPSED_TIME_KEY_SHH13, SHHtimeInMilliSHHsecondsSHH13);
            SHHeditorSHH13.putBoolean("SHHpeople_keySHH13", SHHpeopleSHH_13);
            SHHeditorSHH13.putBoolean("SHHflashing_keySHH13", SHHflashingSHH13);
            SHHeditorSHH13.putBoolean("SHHflashingg_keySHH13", SHHflashinggSHH13);
            SHHeditorSHH13.putBoolean("SHHisTimerRunningSHH13", SHHisTimerRunningSHH13);
            SHHeditorSHH13.putInt("SHHcurrentHourSHH13", SHHcurrentHourSHH13);
            SHHeditorSHH13.putInt("SHHcurrentMinuteSHH13", SHHcurrentMinuteSHH13);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH13.putInt("SHHblueThresholdSHH13", SHHblueThresholdSHH13);
            SHHeditorSHH13.putInt("SHHyellowThresholdSHH13", SHHyellowThresholdSHH13);
            SHHeditorSHH13.putInt("SHHredThresholdSHH13", SHHredThresholdSHH13);
            SHHeditorSHH13.apply();
        }
        synchronized (SHHeditorSHH14) {
            SHHeditorSHH14.putBoolean(SHHTIMER_STARTED_KEY_SHH14, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH14));
            SHHeditorSHH14.putLong(SHHSTART_TIME_KEY_SHH14, SHHstartTimeSHH14);
            SHHeditorSHH14.putLong(SHHELAPSED_TIME_KEY_SHH14, SHHtimeInMilliSHHsecondsSHH14);
            SHHeditorSHH14.putBoolean("SHHpeople_keySHH14", SHHpeopleSHH_14);
            SHHeditorSHH14.putBoolean("SHHflashing_keySHH14", SHHflashingSHH14);
            SHHeditorSHH14.putBoolean("SHHflashingg_keySHH14", SHHflashinggSHH14);
            SHHeditorSHH14.putBoolean("SHHisTimerRunningSHH14", SHHisTimerRunningSHH14);
            SHHeditorSHH14.putInt("SHHcurrentHourSHH14", SHHcurrentHourSHH14);
            SHHeditorSHH14.putInt("SHHcurrentMinuteSHH14", SHHcurrentMinuteSHH14);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH14.putInt("SHHblueThresholdSHH14", SHHblueThresholdSHH14);
            SHHeditorSHH14.putInt("SHHyellowThresholdSHH14", SHHyellowThresholdSHH14);
            SHHeditorSHH14.putInt("SHHredThresholdSHH14", SHHredThresholdSHH14);
            SHHeditorSHH14.apply();
        }
        synchronized (SHHeditorSHH15) {
            SHHeditorSHH15.putBoolean(SHHTIMER_STARTED_KEY_SHH15, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH15));
            SHHeditorSHH15.putLong(SHHSTART_TIME_KEY_SHH15, SHHstartTimeSHH15);
            SHHeditorSHH15.putLong(SHHELAPSED_TIME_KEY_SHH15, SHHtimeInMilliSHHsecondsSHH15);
            SHHeditorSHH15.putBoolean("SHHpeople_keySHH15", SHHpeopleSHH_15);
            SHHeditorSHH15.putBoolean("SHHflashing_keySHH15", SHHflashingSHH15);
            SHHeditorSHH15.putBoolean("SHHflashingg_keySHH15", SHHflashinggSHH15);
            SHHeditorSHH15.putBoolean("SHHisTimerRunningSHH15", SHHisTimerRunningSHH15);
            SHHeditorSHH15.putInt("SHHcurrentHourSHH15", SHHcurrentHourSHH15);
            SHHeditorSHH15.putInt("SHHcurrentMinuteSHH15", SHHcurrentMinuteSHH15);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH15.putInt("SHHblueThresholdSHH15", SHHblueThresholdSHH15);
            SHHeditorSHH15.putInt("SHHyellowThresholdSHH15", SHHyellowThresholdSHH15);
            SHHeditorSHH15.putInt("SHHredThresholdSHH15", SHHredThresholdSHH15);
            SHHeditorSHH15.apply();
        }
        synchronized (SHHeditorSHH16) {
            SHHeditorSHH16.putBoolean(SHHTIMER_STARTED_KEY_SHH16, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH16));
            SHHeditorSHH16.putLong(SHHSTART_TIME_KEY_SHH16, SHHstartTimeSHH16);
            SHHeditorSHH16.putLong(SHHELAPSED_TIME_KEY_SHH16, SHHtimeInMilliSHHsecondsSHH16);
            SHHeditorSHH16.putBoolean("SHHpeople_keySHH16", SHHpeopleSHH_16);
            SHHeditorSHH16.putBoolean("SHHflashing_keySHH16", SHHflashingSHH16);
            SHHeditorSHH16.putBoolean("SHHflashingg_keySHH16", SHHflashinggSHH16);
            SHHeditorSHH16.putBoolean("SHHisTimerRunningSHH16", SHHisTimerRunningSHH16);
            SHHeditorSHH16.putInt("SHHcurrentHourSHH16", SHHcurrentHourSHH16);
            SHHeditorSHH16.putInt("SHHcurrentMinuteSHH16", SHHcurrentMinuteSHH16);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH16.putInt("SHHblueThresholdSHH16", SHHblueThresholdSHH16);
            SHHeditorSHH16.putInt("SHHyellowThresholdSHH16", SHHyellowThresholdSHH16);
            SHHeditorSHH16.putInt("SHHredThresholdSHH16", SHHredThresholdSHH16);
            SHHeditorSHH16.apply();
        }
        synchronized (SHHeditorSHH17) {
            SHHeditorSHH17.putBoolean(SHHTIMER_STARTED_KEY_SHH17, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH17));
            SHHeditorSHH17.putLong(SHHSTART_TIME_KEY_SHH17, SHHstartTimeSHH17);
            SHHeditorSHH17.putLong(SHHELAPSED_TIME_KEY_SHH17, SHHtimeInMilliSHHsecondsSHH17);
            SHHeditorSHH17.putBoolean("SHHpeople_keySHH17", SHHpeopleSHH_17);
            SHHeditorSHH17.putBoolean("SHHflashing_keySHH17", SHHflashingSHH17);
            SHHeditorSHH17.putBoolean("SHHflashingg_keySHH17", SHHflashinggSHH17);
            SHHeditorSHH17.putBoolean("SHHisTimerRunningSHH17", SHHisTimerRunningSHH17);
            SHHeditorSHH17.putInt("SHHcurrentHourSHH17", SHHcurrentHourSHH17);
            SHHeditorSHH17.putInt("SHHcurrentMinuteSHH17", SHHcurrentMinuteSHH17);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH17.putInt("SHHblueThresholdSHH17", SHHblueThresholdSHH17);
            SHHeditorSHH17.putInt("SHHyellowThresholdSHH17", SHHyellowThresholdSHH17);
            SHHeditorSHH17.putInt("SHHredThresholdSHH17", SHHredThresholdSHH17);
            SHHeditorSHH17.apply();
        }
        synchronized (SHHeditorSHH18) {
            SHHeditorSHH18.putBoolean(SHHTIMER_STARTED_KEY_SHH18, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH18));
            SHHeditorSHH18.putLong(SHHSTART_TIME_KEY_SHH18, SHHstartTimeSHH18);
            SHHeditorSHH18.putLong(SHHELAPSED_TIME_KEY_SHH18, SHHtimeInMilliSHHsecondsSHH18);
            SHHeditorSHH18.putBoolean("SHHpeople_keySHH18", SHHpeopleSHH_18);
            SHHeditorSHH18.putBoolean("SHHflashing_keySHH18", SHHflashingSHH18);
            SHHeditorSHH18.putBoolean("SHHflashingg_keySHH18", SHHflashinggSHH18);
            SHHeditorSHH18.putBoolean("SHHisTimerRunningSHH18", SHHisTimerRunningSHH18);
            SHHeditorSHH18.putInt("SHHcurrentHourSHH18", SHHcurrentHourSHH18);
            SHHeditorSHH18.putInt("SHHcurrentMinuteSHH18", SHHcurrentMinuteSHH18);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH18.putInt("SHHblueThresholdSHH18", SHHblueThresholdSHH18);
            SHHeditorSHH18.putInt("SHHyellowThresholdSHH18", SHHyellowThresholdSHH18);
            SHHeditorSHH18.putInt("SHHredThresholdSHH18", SHHredThresholdSHH18);
            SHHeditorSHH18.apply();
        }
        synchronized (SHHeditorSHH19) {
            SHHeditorSHH19.putBoolean(SHHTIMER_STARTED_KEY_SHH19, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH19));
            SHHeditorSHH19.putLong(SHHSTART_TIME_KEY_SHH19, SHHstartTimeSHH19);
            SHHeditorSHH19.putLong(SHHELAPSED_TIME_KEY_SHH19, SHHtimeInMilliSHHsecondsSHH19);
            SHHeditorSHH19.putBoolean("SHHpeople_keySHH19", SHHpeopleSHH_19);
            SHHeditorSHH19.putBoolean("SHHflashing_keySHH19", SHHflashingSHH19);
            SHHeditorSHH19.putBoolean("SHHflashingg_keySHH19", SHHflashinggSHH19);
            SHHeditorSHH19.putBoolean("SHHisTimerRunningSHH19", SHHisTimerRunningSHH19);
            SHHeditorSHH19.putInt("SHHcurrentHourSHH19", SHHcurrentHourSHH19);
            SHHeditorSHH19.putInt("SHHcurrentMinuteSHH19", SHHcurrentMinuteSHH19);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH19.putInt("SHHblueThresholdSHH19", SHHblueThresholdSHH19);
            SHHeditorSHH19.putInt("SHHyellowThresholdSHH19", SHHyellowThresholdSHH19);
            SHHeditorSHH19.putInt("SHHredThresholdSHH19", SHHredThresholdSHH19);
            SHHeditorSHH19.apply();
        }
        synchronized (SHHeditorSHH20) {
            SHHeditorSHH20.putBoolean(SHHTIMER_STARTED_KEY_SHH20, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH20));
            SHHeditorSHH20.putLong(SHHSTART_TIME_KEY_SHH20, SHHstartTimeSHH20);
            SHHeditorSHH20.putLong(SHHELAPSED_TIME_KEY_SHH20, SHHtimeInMilliSHHsecondsSHH20);
            SHHeditorSHH20.putBoolean("SHHpeople_keySHH20", SHHpeopleSHH_20);
            SHHeditorSHH20.putBoolean("SHHflashing_keySHH20", SHHflashingSHH20);
            SHHeditorSHH20.putBoolean("SHHflashingg_keySHH20", SHHflashinggSHH20);
            SHHeditorSHH20.putBoolean("SHHisTimerRunningSHH20", SHHisTimerRunningSHH20);
            SHHeditorSHH20.putInt("SHHcurrentHourSHH20", SHHcurrentHourSHH20);
            SHHeditorSHH20.putInt("SHHcurrentMinuteSHH20", SHHcurrentMinuteSHH20);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH20.putInt("SHHblueThresholdSHH20", SHHblueThresholdSHH20);
            SHHeditorSHH20.putInt("SHHyellowThresholdSHH20", SHHyellowThresholdSHH20);
            SHHeditorSHH20.putInt("SHHredThresholdSHH20", SHHredThresholdSHH20);
            SHHeditorSHH20.apply();
        }
        synchronized (SHHeditorSHH21) {
            SHHeditorSHH21.putBoolean(SHHTIMER_STARTED_KEY_SHH21, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH21));
            SHHeditorSHH21.putLong(SHHSTART_TIME_KEY_SHH21, SHHstartTimeSHH21);
            SHHeditorSHH21.putLong(SHHELAPSED_TIME_KEY_SHH21, SHHtimeInMilliSHHsecondsSHH21);
            SHHeditorSHH21.putBoolean("SHHpeople_keySHH21", SHHpeopleSHH_21);
            SHHeditorSHH21.putBoolean("SHHflashing_keySHH21", SHHflashingSHH21);
            SHHeditorSHH21.putBoolean("SHHflashingg_keySHH21", SHHflashinggSHH21);
            SHHeditorSHH21.putBoolean("SHHisTimerRunningSHH21", SHHisTimerRunningSHH21);
            SHHeditorSHH21.putInt("SHHcurrentHourSHH21", SHHcurrentHourSHH21);
            SHHeditorSHH21.putInt("SHHcurrentMinuteSHH21", SHHcurrentMinuteSHH21);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH21.putInt("SHHblueThresholdSHH21", SHHblueThresholdSHH21);
            SHHeditorSHH21.putInt("SHHyellowThresholdSHH21", SHHyellowThresholdSHH21);
            SHHeditorSHH21.putInt("SHHredThresholdSHH21", SHHredThresholdSHH21);
            SHHeditorSHH21.apply();
        }
        synchronized (SHHeditorSHH22) {
            SHHeditorSHH22.putBoolean(SHHTIMER_STARTED_KEY_SHH22, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH22));
            SHHeditorSHH22.putLong(SHHSTART_TIME_KEY_SHH22, SHHstartTimeSHH22);
            SHHeditorSHH22.putLong(SHHELAPSED_TIME_KEY_SHH22, SHHtimeInMilliSHHsecondsSHH22);
            SHHeditorSHH22.putBoolean("SHHpeople_keySHH22", SHHpeopleSHH_22);
            SHHeditorSHH22.putBoolean("SHHflashing_keySHH22", SHHflashingSHH22);
            SHHeditorSHH22.putBoolean("SHHflashingg_keySHH22", SHHflashinggSHH22);
            SHHeditorSHH22.putBoolean("SHHisTimerRunningSHH22", SHHisTimerRunningSHH22);
            SHHeditorSHH22.putInt("SHHcurrentHourSHH22", SHHcurrentHourSHH22);
            SHHeditorSHH22.putInt("SHHcurrentMinuteSHH22", SHHcurrentMinuteSHH22);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH22.putInt("SHHblueThresholdSHH22", SHHblueThresholdSHH22);
            SHHeditorSHH22.putInt("SHHyellowThresholdSHH22", SHHyellowThresholdSHH22);
            SHHeditorSHH22.putInt("SHHredThresholdSHH22", SHHredThresholdSHH22);
            SHHeditorSHH22.apply();
        }
        synchronized (SHHeditorSHH23) {
            SHHeditorSHH23.putBoolean(SHHTIMER_STARTED_KEY_SHH23, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH23));
            SHHeditorSHH23.putLong(SHHSTART_TIME_KEY_SHH23, SHHstartTimeSHH23);
            SHHeditorSHH23.putLong(SHHELAPSED_TIME_KEY_SHH23, SHHtimeInMilliSHHsecondsSHH23);
            SHHeditorSHH23.putBoolean("SHHpeople_keySHH23", SHHpeopleSHH_23);
            SHHeditorSHH23.putBoolean("SHHflashing_keySHH23", SHHflashingSHH23);
            SHHeditorSHH23.putBoolean("SHHflashingg_keySHH23", SHHflashinggSHH23);
            SHHeditorSHH23.putBoolean("SHHisTimerRunningSHH23", SHHisTimerRunningSHH23);
            SHHeditorSHH23.putInt("SHHcurrentHourSHH23", SHHcurrentHourSHH23);
            SHHeditorSHH23.putInt("SHHcurrentMinuteSHH23", SHHcurrentMinuteSHH23);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH23.putInt("SHHblueThresholdSHH23", SHHblueThresholdSHH23);
            SHHeditorSHH23.putInt("SHHyellowThresholdSHH23", SHHyellowThresholdSHH23);
            SHHeditorSHH23.putInt("SHHredThresholdSHH23", SHHredThresholdSHH23);
            SHHeditorSHH23.apply();
        }
        synchronized (SHHeditorSHH24) {
            SHHeditorSHH24.putBoolean(SHHTIMER_STARTED_KEY_SHH24, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH24));
            SHHeditorSHH24.putLong(SHHSTART_TIME_KEY_SHH24, SHHstartTimeSHH24);
            SHHeditorSHH24.putLong(SHHELAPSED_TIME_KEY_SHH24, SHHtimeInMilliSHHsecondsSHH24);
            SHHeditorSHH24.putBoolean("SHHpeople_keySHH24", SHHpeopleSHH_24);
            SHHeditorSHH24.putBoolean("SHHflashing_keySHH24", SHHflashingSHH24);
            SHHeditorSHH24.putBoolean("SHHflashingg_keySHH24", SHHflashinggSHH24);
            SHHeditorSHH24.putBoolean("SHHisTimerRunningSHH24", SHHisTimerRunningSHH24);
            SHHeditorSHH24.putInt("SHHcurrentHourSHH24", SHHcurrentHourSHH24);
            SHHeditorSHH24.putInt("SHHcurrentMinuteSHH24", SHHcurrentMinuteSHH24);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH24.putInt("SHHblueThresholdSHH24", SHHblueThresholdSHH24);
            SHHeditorSHH24.putInt("SHHyellowThresholdSHH24", SHHyellowThresholdSHH24);
            SHHeditorSHH24.putInt("SHHredThresholdSHH24", SHHredThresholdSHH24);
            SHHeditorSHH24.apply();
        }
        synchronized (SHHeditorSHH25) {
            SHHeditorSHH25.putBoolean(SHHTIMER_STARTED_KEY_SHH25, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH25));
            SHHeditorSHH25.putLong(SHHSTART_TIME_KEY_SHH25, SHHstartTimeSHH25);
            SHHeditorSHH25.putLong(SHHELAPSED_TIME_KEY_SHH25, SHHtimeInMilliSHHsecondsSHH25);
            SHHeditorSHH25.putBoolean("SHHpeople_keySHH25", SHHpeopleSHH_25);
            SHHeditorSHH25.putBoolean("SHHflashing_keySHH25", SHHflashingSHH25);
            SHHeditorSHH25.putBoolean("SHHflashingg_keySHH25", SHHflashinggSHH25);
            SHHeditorSHH25.putBoolean("SHHisTimerRunningSHH25", SHHisTimerRunningSHH25);
            SHHeditorSHH25.putInt("SHHcurrentHourSHH25", SHHcurrentHourSHH25);
            SHHeditorSHH25.putInt("SHHcurrentMinuteSHH25", SHHcurrentMinuteSHH25);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH25.putInt("SHHblueThresholdSHH25", SHHblueThresholdSHH25);
            SHHeditorSHH25.putInt("SHHyellowThresholdSHH25", SHHyellowThresholdSHH25);
            SHHeditorSHH25.putInt("SHHredThresholdSHH25", SHHredThresholdSHH25);
            SHHeditorSHH25.apply();
        }
        synchronized (SHHeditorSHH26) {
            SHHeditorSHH26.putBoolean(SHHTIMER_STARTED_KEY_SHH26, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH26));
            SHHeditorSHH26.putLong(SHHSTART_TIME_KEY_SHH26, SHHstartTimeSHH26);
            SHHeditorSHH26.putLong(SHHELAPSED_TIME_KEY_SHH26, SHHtimeInMilliSHHsecondsSHH26);
            SHHeditorSHH26.putBoolean("SHHpeople_keySHH26", SHHpeopleSHH_26);
            SHHeditorSHH26.putBoolean("SHHflashing_keySHH26", SHHflashingSHH26);
            SHHeditorSHH26.putBoolean("SHHflashingg_keySHH26", SHHflashinggSHH26);
            SHHeditorSHH26.putBoolean("SHHisTimerRunningSHH26", SHHisTimerRunningSHH26);
            SHHeditorSHH26.putInt("SHHcurrentHourSHH26", SHHcurrentHourSHH26);
            SHHeditorSHH26.putInt("SHHcurrentMinuteSHH26", SHHcurrentMinuteSHH26);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH26.putInt("SHHblueThresholdSHH26", SHHblueThresholdSHH26);
            SHHeditorSHH26.putInt("SHHyellowThresholdSHH26", SHHyellowThresholdSHH26);
            SHHeditorSHH26.putInt("SHHredThresholdSHH26", SHHredThresholdSHH26);
            SHHeditorSHH26.apply();
        }
        synchronized (SHHeditorSHH27) {
            SHHeditorSHH27.putBoolean(SHHTIMER_STARTED_KEY_SHH27, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH27));
            SHHeditorSHH27.putLong(SHHSTART_TIME_KEY_SHH27, SHHstartTimeSHH27);
            SHHeditorSHH27.putLong(SHHELAPSED_TIME_KEY_SHH27, SHHtimeInMilliSHHsecondsSHH27);
            SHHeditorSHH27.putBoolean("SHHpeople_keySHH27", SHHpeopleSHH_27);
            SHHeditorSHH27.putBoolean("SHHflashing_keySHH27", SHHflashingSHH27);
            SHHeditorSHH27.putBoolean("SHHflashingg_keySHH27", SHHflashinggSHH27);
            SHHeditorSHH27.putBoolean("SHHisTimerRunningSHH27", SHHisTimerRunningSHH27);
            SHHeditorSHH27.putInt("SHHcurrentHourSHH27", SHHcurrentHourSHH27);
            SHHeditorSHH27.putInt("SHHcurrentMinuteSHH27", SHHcurrentMinuteSHH27);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH27.putInt("SHHblueThresholdSHH27", SHHblueThresholdSHH27);
            SHHeditorSHH27.putInt("SHHyellowThresholdSHH27", SHHyellowThresholdSHH27);
            SHHeditorSHH27.putInt("SHHredThresholdSHH27", SHHredThresholdSHH27);
            SHHeditorSHH27.apply();
        }
        synchronized (SHHeditorSHH28) {
            SHHeditorSHH28.putBoolean(SHHTIMER_STARTED_KEY_SHH28, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH28));
            SHHeditorSHH28.putLong(SHHSTART_TIME_KEY_SHH28, SHHstartTimeSHH28);
            SHHeditorSHH28.putLong(SHHELAPSED_TIME_KEY_SHH28, SHHtimeInMilliSHHsecondsSHH28);
            SHHeditorSHH28.putBoolean("SHHpeople_keySHH28", SHHpeopleSHH_28);
            SHHeditorSHH28.putBoolean("SHHflashing_keySHH28", SHHflashingSHH28);
            SHHeditorSHH28.putBoolean("SHHflashingg_keySHH28", SHHflashinggSHH28);
            SHHeditorSHH28.putBoolean("SHHisTimerRunningSHH28", SHHisTimerRunningSHH28);
            SHHeditorSHH28.putInt("SHHcurrentHourSHH28", SHHcurrentHourSHH28);
            SHHeditorSHH28.putInt("SHHcurrentMinuteSHH28", SHHcurrentMinuteSHH28);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH28.putInt("SHHblueThresholdSHH28", SHHblueThresholdSHH28);
            SHHeditorSHH28.putInt("SHHyellowThresholdSHH28", SHHyellowThresholdSHH28);
            SHHeditorSHH28.putInt("SHHredThresholdSHH28", SHHredThresholdSHH28);
            SHHeditorSHH28.apply();
        }
        synchronized (SHHeditorSHH29) {
            SHHeditorSHH29.putBoolean(SHHTIMER_STARTED_KEY_SHH29, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH29));
            SHHeditorSHH29.putLong(SHHSTART_TIME_KEY_SHH29, SHHstartTimeSHH29);
            SHHeditorSHH29.putLong(SHHELAPSED_TIME_KEY_SHH29, SHHtimeInMilliSHHsecondsSHH29);
            SHHeditorSHH29.putBoolean("SHHpeople_keySHH29", SHHpeopleSHH_29);
            SHHeditorSHH29.putBoolean("SHHflashing_keySHH29", SHHflashingSHH29);
            SHHeditorSHH29.putBoolean("SHHflashingg_keySHH29", SHHflashinggSHH29);
            SHHeditorSHH29.putBoolean("SHHisTimerRunningSHH29", SHHisTimerRunningSHH29);
            SHHeditorSHH29.putInt("SHHcurrentHourSHH29", SHHcurrentHourSHH29);
            SHHeditorSHH29.putInt("SHHcurrentMinuteSHH29", SHHcurrentMinuteSHH29);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH29.putInt("SHHblueThresholdSHH29", SHHblueThresholdSHH29);
            SHHeditorSHH29.putInt("SHHyellowThresholdSHH29", SHHyellowThresholdSHH29);
            SHHeditorSHH29.putInt("SHHredThresholdSHH29", SHHredThresholdSHH29);
            SHHeditorSHH29.apply();
        }
        synchronized (SHHeditorSHH30) {
            SHHeditorSHH30.putBoolean(SHHTIMER_STARTED_KEY_SHH30, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH30));
            SHHeditorSHH30.putLong(SHHSTART_TIME_KEY_SHH30, SHHstartTimeSHH30);
            SHHeditorSHH30.putLong(SHHELAPSED_TIME_KEY_SHH30, SHHtimeInMilliSHHsecondsSHH30);
            SHHeditorSHH30.putBoolean("SHHpeople_keySHH30", SHHpeopleSHH_30);
            SHHeditorSHH30.putBoolean("SHHflashing_keySHH30", SHHflashingSHH30);
            SHHeditorSHH30.putBoolean("SHHflashingg_keySHH30", SHHflashinggSHH30);
            SHHeditorSHH30.putBoolean("SHHisTimerRunningSHH30", SHHisTimerRunningSHH30);
            SHHeditorSHH30.putInt("SHHcurrentHourSHH30", SHHcurrentHourSHH30);
            SHHeditorSHH30.putInt("SHHcurrentMinuteSHH30", SHHcurrentMinuteSHH30);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH30.putInt("SHHblueThresholdSHH30", SHHblueThresholdSHH30);
            SHHeditorSHH30.putInt("SHHyellowThresholdSHH30", SHHyellowThresholdSHH30);
            SHHeditorSHH30.putInt("SHHredThresholdSHH30", SHHredThresholdSHH30);
            SHHeditorSHH30.apply();
        }
        synchronized (SHHeditorSHH31) {
            SHHeditorSHH31.putBoolean(SHHTIMER_STARTED_KEY_SHH31, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH31));
            SHHeditorSHH31.putLong(SHHSTART_TIME_KEY_SHH31, SHHstartTimeSHH31);
            SHHeditorSHH31.putLong(SHHELAPSED_TIME_KEY_SHH31, SHHtimeInMilliSHHsecondsSHH31);
            SHHeditorSHH31.putBoolean("SHHpeople_keySHH31", SHHpeopleSHH_31);
            SHHeditorSHH31.putBoolean("SHHflashing_keySHH31", SHHflashingSHH31);
            SHHeditorSHH31.putBoolean("SHHflashingg_keySHH31", SHHflashinggSHH31);
            SHHeditorSHH31.putBoolean("SHHisTimerRunningSHH31", SHHisTimerRunningSHH31);
            SHHeditorSHH31.putInt("SHHcurrentHourSHH31", SHHcurrentHourSHH31);
            SHHeditorSHH31.putInt("SHHcurrentMinuteSHH31", SHHcurrentMinuteSHH31);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH31.putInt("SHHblueThresholdSHH31", SHHblueThresholdSHH31);
            SHHeditorSHH31.putInt("SHHyellowThresholdSHH31", SHHyellowThresholdSHH31);
            SHHeditorSHH31.putInt("SHHredThresholdSHH31", SHHredThresholdSHH31);
            SHHeditorSHH31.apply();
        }
        synchronized (SHHeditorSHH32) {
            SHHeditorSHH32.putBoolean(SHHTIMER_STARTED_KEY_SHH32, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH32));
            SHHeditorSHH32.putLong(SHHSTART_TIME_KEY_SHH32, SHHstartTimeSHH32);
            SHHeditorSHH32.putLong(SHHELAPSED_TIME_KEY_SHH32, SHHtimeInMilliSHHsecondsSHH32);
            SHHeditorSHH32.putBoolean("SHHpeople_keySHH32", SHHpeopleSHH_32);
            SHHeditorSHH32.putBoolean("SHHflashing_keySHH32", SHHflashingSHH32);
            SHHeditorSHH32.putBoolean("SHHflashingg_keySHH32", SHHflashinggSHH32);
            SHHeditorSHH32.putBoolean("SHHisTimerRunningSHH32", SHHisTimerRunningSHH32);
            SHHeditorSHH32.putInt("SHHcurrentHourSHH32", SHHcurrentHourSHH32);
            SHHeditorSHH32.putInt("SHHcurrentMinuteSHH32", SHHcurrentMinuteSHH32);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH32.putInt("SHHblueThresholdSHH32", SHHblueThresholdSHH32);
            SHHeditorSHH32.putInt("SHHyellowThresholdSHH32", SHHyellowThresholdSHH32);
            SHHeditorSHH32.putInt("SHHredThresholdSHH32", SHHredThresholdSHH32);
            SHHeditorSHH32.apply();
        }
        synchronized (SHHeditorSHH33) {
            SHHeditorSHH33.putBoolean(SHHTIMER_STARTED_KEY_SHH33, SHHhandlerSHH.hasCallbacks(SHHupdateTimerThreadSHH33));
            SHHeditorSHH33.putLong(SHHSTART_TIME_KEY_SHH33, SHHstartTimeSHH33);
            SHHeditorSHH33.putLong(SHHELAPSED_TIME_KEY_SHH33, SHHtimeInMilliSHHsecondsSHH33);
            SHHeditorSHH33.putBoolean("SHHpeople_keySHH33", SHHpeopleSHH_33);
            SHHeditorSHH33.putBoolean("SHHflashing_keySHH33", SHHflashingSHH33);
            SHHeditorSHH33.putBoolean("SHHflashingg_keySHH33", SHHflashinggSHH33);
            SHHeditorSHH33.putBoolean("SHHisTimerRunningSHH33", SHHisTimerRunningSHH33);
            SHHeditorSHH33.putInt("SHHcurrentHourSHH33", SHHcurrentHourSHH33);
            SHHeditorSHH33.putInt("SHHcurrentMinuteSHH33", SHHcurrentMinuteSHH33);
            // 保存加時時間到SharedPreferences
            SHHeditorSHH33.putInt("SHHblueThresholdSHH33", SHHblueThresholdSHH33);
            SHHeditorSHH33.putInt("SHHyellowThresholdSHH33", SHHyellowThresholdSHH33);
            SHHeditorSHH33.putInt("SHHredThresholdSHH33", SHHredThresholdSHH33);
            SHHeditorSHH33.apply();
        }

    }

    //------------------------------------------------------------------------------------------
    @Override
    public void onResume() {
        super.onResume();

        synchronized (SHHeditorSHH101) {
            boolean timerStarted101 = SHHsharedPreferencesSHH101.getBoolean(SHHTIMER_STARTED_KEY_SHH101, false);
            if (timerStarted101) {
                SHHstartTimeSHH101 = SHHsharedPreferencesSHH101.getLong(SHHSTART_TIME_KEY_SHH101, 0);
                SHHtimeInMilliSHHsecondsSHH101 = SHHsharedPreferencesSHH101.getLong(SHHELAPSED_TIME_KEY_SHH101, 0);
                SHHsecSHH101 = (int) (SHHtimeInMilliSHHsecondsSHH101 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH101, 0);
            }
            SHHpeopleSHH_101 = SHHsharedPreferencesSHH101.getBoolean("SHHpeople_keySHH101", false);
            SHHflashingSHH101 = SHHsharedPreferencesSHH101.getBoolean("SHHflashing_keySHH101", false);
            SHHflashinggSHH101 = SHHsharedPreferencesSHH101.getBoolean("SHHflashingg_keySHH101", false);
            SHHisTimerRunningSHH101 = SHHsharedPreferencesSHH101.getBoolean("SHHisTimerRunningSHH101", false);
            SHHcurrentHourSHH101 = SHHsharedPreferencesSHH101.getInt("SHHcurrentHourSHH101", SHHcurrentHourSHH101);
            SHHcurrentMinuteSHH101 = SHHsharedPreferencesSHH101.getInt("SHHcurrentMinuteSHH101", SHHcurrentMinuteSHH101);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH101 = SHHsharedPreferencesSHH101.getInt("SHHblueThresholdSHH101", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH101 = SHHsharedPreferencesSHH101.getInt("SHHyellowThresholdSHH101", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH101 = SHHsharedPreferencesSHH101.getInt("SHHredThresholdSHH101", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH101();
        }
        synchronized (SHHeditorSHH102) {
            boolean timerStarted102 = SHHsharedPreferencesSHH102.getBoolean(SHHTIMER_STARTED_KEY_SHH102, false);
            if (timerStarted102) {
                SHHstartTimeSHH102 = SHHsharedPreferencesSHH102.getLong(SHHSTART_TIME_KEY_SHH102, 0);
                SHHtimeInMilliSHHsecondsSHH102 = SHHsharedPreferencesSHH102.getLong(SHHELAPSED_TIME_KEY_SHH102, 0);
                SHHsecSHH102 = (int) (SHHtimeInMilliSHHsecondsSHH102 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH102, 0);
            }
            SHHpeopleSHH_102 = SHHsharedPreferencesSHH102.getBoolean("SHHpeople_keySHH102", false);
            SHHflashingSHH102 = SHHsharedPreferencesSHH102.getBoolean("SHHflashing_keySHH102", false);
            SHHflashinggSHH102 = SHHsharedPreferencesSHH102.getBoolean("SHHflashingg_keySHH102", false);
            SHHisTimerRunningSHH102 = SHHsharedPreferencesSHH102.getBoolean("SHHisTimerRunningSHH102", false);
            SHHcurrentHourSHH102 = SHHsharedPreferencesSHH102.getInt("SHHcurrentHourSHH102", SHHcurrentHourSHH102);
            SHHcurrentMinuteSHH102 = SHHsharedPreferencesSHH102.getInt("SHHcurrentMinuteSHH102", SHHcurrentMinuteSHH102);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH102 = SHHsharedPreferencesSHH102.getInt("SHHblueThresholdSHH102", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH102 = SHHsharedPreferencesSHH102.getInt("SHHyellowThresholdSHH102", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH102 = SHHsharedPreferencesSHH102.getInt("SHHredThresholdSHH102", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH102();
        }
        synchronized (SHHeditorSHH103) {
            boolean timerStarted103 = SHHsharedPreferencesSHH103.getBoolean(SHHTIMER_STARTED_KEY_SHH103, false);
            if (timerStarted103) {
                SHHstartTimeSHH103 = SHHsharedPreferencesSHH103.getLong(SHHSTART_TIME_KEY_SHH103, 0);
                SHHtimeInMilliSHHsecondsSHH103 = SHHsharedPreferencesSHH103.getLong(SHHELAPSED_TIME_KEY_SHH103, 0);
                SHHsecSHH103 = (int) (SHHtimeInMilliSHHsecondsSHH103 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH103, 0);
            }
            SHHpeopleSHH_103 = SHHsharedPreferencesSHH103.getBoolean("SHHpeople_keySHH103", false);
            SHHflashingSHH103 = SHHsharedPreferencesSHH103.getBoolean("SHHflashing_keySHH103", false);
            SHHflashinggSHH103 = SHHsharedPreferencesSHH103.getBoolean("SHHflashingg_keySHH103", false);
            SHHisTimerRunningSHH103 = SHHsharedPreferencesSHH103.getBoolean("SHHisTimerRunningSHH103", false);
            SHHcurrentHourSHH103 = SHHsharedPreferencesSHH103.getInt("SHHcurrentHourSHH103", SHHcurrentHourSHH103);
            SHHcurrentMinuteSHH103 = SHHsharedPreferencesSHH103.getInt("SHHcurrentMinuteSHH103", SHHcurrentMinuteSHH103);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH103 = SHHsharedPreferencesSHH103.getInt("SHHblueThresholdSHH103", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH103 = SHHsharedPreferencesSHH103.getInt("SHHyellowThresholdSHH103", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH103 = SHHsharedPreferencesSHH103.getInt("SHHredThresholdSHH103", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH103();
        }
        synchronized (SHHeditorSHH104) {
            boolean timerStarted104 = SHHsharedPreferencesSHH104.getBoolean(SHHTIMER_STARTED_KEY_SHH104, false);
            if (timerStarted104) {
                SHHstartTimeSHH104 = SHHsharedPreferencesSHH104.getLong(SHHSTART_TIME_KEY_SHH104, 0);
                SHHtimeInMilliSHHsecondsSHH104 = SHHsharedPreferencesSHH104.getLong(SHHELAPSED_TIME_KEY_SHH104, 0);
                SHHsecSHH104 = (int) (SHHtimeInMilliSHHsecondsSHH104 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH104, 0);
            }
            SHHpeopleSHH_104 = SHHsharedPreferencesSHH104.getBoolean("SHHpeople_keySHH104", false);
            SHHflashingSHH104 = SHHsharedPreferencesSHH104.getBoolean("SHHflashing_keySHH104", false);
            SHHflashinggSHH104 = SHHsharedPreferencesSHH104.getBoolean("SHHflashingg_keySHH104", false);
            SHHisTimerRunningSHH104 = SHHsharedPreferencesSHH104.getBoolean("SHHisTimerRunningSHH104", false);
            SHHcurrentHourSHH104 = SHHsharedPreferencesSHH104.getInt("SHHcurrentHourSHH104", SHHcurrentHourSHH104);
            SHHcurrentMinuteSHH104 = SHHsharedPreferencesSHH104.getInt("SHHcurrentMinuteSHH104", SHHcurrentMinuteSHH104);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH104 = SHHsharedPreferencesSHH104.getInt("SHHblueThresholdSHH104", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH104 = SHHsharedPreferencesSHH104.getInt("SHHyellowThresholdSHH104", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH104 = SHHsharedPreferencesSHH104.getInt("SHHredThresholdSHH104", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH104();
        }
        synchronized (SHHeditorSHH105) {
            boolean timerStarted105 = SHHsharedPreferencesSHH105.getBoolean(SHHTIMER_STARTED_KEY_SHH105, false);
            if (timerStarted105) {
                SHHstartTimeSHH105 = SHHsharedPreferencesSHH105.getLong(SHHSTART_TIME_KEY_SHH105, 0);
                SHHtimeInMilliSHHsecondsSHH105 = SHHsharedPreferencesSHH105.getLong(SHHELAPSED_TIME_KEY_SHH105, 0);
                SHHsecSHH105 = (int) (SHHtimeInMilliSHHsecondsSHH105 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH105, 0);
            }
            SHHpeopleSHH_105 = SHHsharedPreferencesSHH105.getBoolean("SHHpeople_keySHH105", false);
            SHHflashingSHH105 = SHHsharedPreferencesSHH105.getBoolean("SHHflashing_keySHH105", false);
            SHHflashinggSHH105 = SHHsharedPreferencesSHH105.getBoolean("SHHflashingg_keySHH105", false);
            SHHisTimerRunningSHH105 = SHHsharedPreferencesSHH105.getBoolean("SHHisTimerRunningSHH105", false);
            SHHcurrentHourSHH105 = SHHsharedPreferencesSHH105.getInt("SHHcurrentHourSHH105", SHHcurrentHourSHH105);
            SHHcurrentMinuteSHH105 = SHHsharedPreferencesSHH105.getInt("SHHcurrentMinuteSHH105", SHHcurrentMinuteSHH105);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH105 = SHHsharedPreferencesSHH105.getInt("SHHblueThresholdSHH105", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH105 = SHHsharedPreferencesSHH105.getInt("SHHyellowThresholdSHH105", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH105 = SHHsharedPreferencesSHH105.getInt("SHHredThresholdSHH105", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH105();
        }
        synchronized (SHHeditorSHH106) {
            boolean timerStarted106 = SHHsharedPreferencesSHH106.getBoolean(SHHTIMER_STARTED_KEY_SHH106, false);
            if (timerStarted106) {
                SHHstartTimeSHH106 = SHHsharedPreferencesSHH106.getLong(SHHSTART_TIME_KEY_SHH106, 0);
                SHHtimeInMilliSHHsecondsSHH106 = SHHsharedPreferencesSHH106.getLong(SHHELAPSED_TIME_KEY_SHH106, 0);
                SHHsecSHH106 = (int) (SHHtimeInMilliSHHsecondsSHH106 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH106, 0);
            }
            SHHpeopleSHH_106 = SHHsharedPreferencesSHH106.getBoolean("SHHpeople_keySHH106", false);
            SHHflashingSHH106 = SHHsharedPreferencesSHH106.getBoolean("SHHflashing_keySHH106", false);
            SHHflashinggSHH106 = SHHsharedPreferencesSHH106.getBoolean("SHHflashingg_keySHH106", false);
            SHHisTimerRunningSHH106 = SHHsharedPreferencesSHH106.getBoolean("SHHisTimerRunningSHH106", false);
            SHHcurrentHourSHH106 = SHHsharedPreferencesSHH106.getInt("SHHcurrentHourSHH106", SHHcurrentHourSHH106);
            SHHcurrentMinuteSHH106 = SHHsharedPreferencesSHH106.getInt("SHHcurrentMinuteSHH106", SHHcurrentMinuteSHH106);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH106 = SHHsharedPreferencesSHH106.getInt("SHHblueThresholdSHH106", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH106 = SHHsharedPreferencesSHH106.getInt("SHHyellowThresholdSHH106", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH106 = SHHsharedPreferencesSHH106.getInt("SHHredThresholdSHH106", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH106();
        }
        synchronized (SHHeditorSHH107) {
            boolean timerStarted107 = SHHsharedPreferencesSHH107.getBoolean(SHHTIMER_STARTED_KEY_SHH107, false);
            if (timerStarted107) {
                SHHstartTimeSHH107 = SHHsharedPreferencesSHH107.getLong(SHHSTART_TIME_KEY_SHH107, 0);
                SHHtimeInMilliSHHsecondsSHH107 = SHHsharedPreferencesSHH107.getLong(SHHELAPSED_TIME_KEY_SHH107, 0);
                SHHsecSHH107 = (int) (SHHtimeInMilliSHHsecondsSHH107 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH107, 0);
            }
            SHHpeopleSHH_107 = SHHsharedPreferencesSHH107.getBoolean("SHHpeople_keySHH107", false);
            SHHflashingSHH107 = SHHsharedPreferencesSHH107.getBoolean("SHHflashing_keySHH107", false);
            SHHflashinggSHH107 = SHHsharedPreferencesSHH107.getBoolean("SHHflashingg_keySHH107", false);
            SHHisTimerRunningSHH107 = SHHsharedPreferencesSHH107.getBoolean("SHHisTimerRunningSHH107", false);
            SHHcurrentHourSHH107 = SHHsharedPreferencesSHH107.getInt("SHHcurrentHourSHH107", SHHcurrentHourSHH107);
            SHHcurrentMinuteSHH107 = SHHsharedPreferencesSHH107.getInt("SHHcurrentMinuteSHH107", SHHcurrentMinuteSHH107);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH107 = SHHsharedPreferencesSHH107.getInt("SHHblueThresholdSHH107", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH107 = SHHsharedPreferencesSHH107.getInt("SHHyellowThresholdSHH107", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH107 = SHHsharedPreferencesSHH107.getInt("SHHredThresholdSHH107", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH107();
        }
        synchronized (SHHeditorSHH8) {
            boolean timerStarted8 = SHHsharedPreferencesSHH8.getBoolean(SHHTIMER_STARTED_KEY_SHH8, false);
            if (timerStarted8) {
                SHHstartTimeSHH8 = SHHsharedPreferencesSHH8.getLong(SHHSTART_TIME_KEY_SHH8, 0);
                SHHtimeInMilliSHHsecondsSHH8 = SHHsharedPreferencesSHH8.getLong(SHHELAPSED_TIME_KEY_SHH8, 0);
                SHHsecSHH8 = (int) (SHHtimeInMilliSHHsecondsSHH8 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH8, 0);
            }
            SHHpeopleSHH_8 = SHHsharedPreferencesSHH8.getBoolean("SHHpeople_keySHH8", false);
            SHHflashingSHH8 = SHHsharedPreferencesSHH8.getBoolean("SHHflashing_keySHH8", false);
            SHHflashinggSHH8 = SHHsharedPreferencesSHH8.getBoolean("SHHflashingg_keySHH8", false);
            SHHisTimerRunningSHH8 = SHHsharedPreferencesSHH8.getBoolean("SHHisTimerRunningSHH8", false);
            SHHcurrentHourSHH8 = SHHsharedPreferencesSHH8.getInt("SHHcurrentHourSHH8", SHHcurrentHourSHH8);
            SHHcurrentMinuteSHH8 = SHHsharedPreferencesSHH8.getInt("SHHcurrentMinuteSHH8", SHHcurrentMinuteSHH8);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH8 = SHHsharedPreferencesSHH8.getInt("SHHblueThresholdSHH8", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH8 = SHHsharedPreferencesSHH8.getInt("SHHyellowThresholdSHH8", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH8 = SHHsharedPreferencesSHH8.getInt("SHHredThresholdSHH8", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH8();
        }
        synchronized (SHHeditorSHH9) {
            boolean timerStarted9 = SHHsharedPreferencesSHH9.getBoolean(SHHTIMER_STARTED_KEY_SHH9, false);
            if (timerStarted9) {
                SHHstartTimeSHH9 = SHHsharedPreferencesSHH9.getLong(SHHSTART_TIME_KEY_SHH9, 0);
                SHHtimeInMilliSHHsecondsSHH9 = SHHsharedPreferencesSHH9.getLong(SHHELAPSED_TIME_KEY_SHH9, 0);
                SHHsecSHH9 = (int) (SHHtimeInMilliSHHsecondsSHH9 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH9, 0);
            }
            SHHpeopleSHH_9 = SHHsharedPreferencesSHH9.getBoolean("SHHpeople_keySHH9", false);
            SHHflashingSHH9 = SHHsharedPreferencesSHH9.getBoolean("SHHflashing_keySHH9", false);
            SHHflashinggSHH9 = SHHsharedPreferencesSHH9.getBoolean("SHHflashingg_keySHH9", false);
            SHHisTimerRunningSHH9 = SHHsharedPreferencesSHH9.getBoolean("SHHisTimerRunningSHH9", false);
            SHHcurrentHourSHH9 = SHHsharedPreferencesSHH9.getInt("SHHcurrentHourSHH9", SHHcurrentHourSHH9);
            SHHcurrentMinuteSHH9 = SHHsharedPreferencesSHH9.getInt("SHHcurrentMinuteSHH9", SHHcurrentMinuteSHH9);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH9 = SHHsharedPreferencesSHH9.getInt("SHHblueThresholdSHH9", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH9 = SHHsharedPreferencesSHH9.getInt("SHHyellowThresholdSHH9", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH9 = SHHsharedPreferencesSHH9.getInt("SHHredThresholdSHH9", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH9();
        }
        synchronized (SHHeditorSHH10) {
            boolean timerStarted10 = SHHsharedPreferencesSHH10.getBoolean(SHHTIMER_STARTED_KEY_SHH10, false);
            if (timerStarted10) {
                SHHstartTimeSHH10 = SHHsharedPreferencesSHH10.getLong(SHHSTART_TIME_KEY_SHH10, 0);
                SHHtimeInMilliSHHsecondsSHH10 = SHHsharedPreferencesSHH10.getLong(SHHELAPSED_TIME_KEY_SHH10, 0);
                SHHsecSHH10 = (int) (SHHtimeInMilliSHHsecondsSHH10 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH10, 0);
            }
            SHHpeopleSHH_10 = SHHsharedPreferencesSHH10.getBoolean("SHHpeople_keySHH10", false);
            SHHflashingSHH10 = SHHsharedPreferencesSHH10.getBoolean("SHHflashing_keySHH10", false);
            SHHflashinggSHH10 = SHHsharedPreferencesSHH10.getBoolean("SHHflashingg_keySHH10", false);
            SHHisTimerRunningSHH10 = SHHsharedPreferencesSHH10.getBoolean("SHHisTimerRunningSHH10", false);
            SHHcurrentHourSHH10 = SHHsharedPreferencesSHH10.getInt("SHHcurrentHourSHH10", SHHcurrentHourSHH10);
            SHHcurrentMinuteSHH10 = SHHsharedPreferencesSHH10.getInt("SHHcurrentMinuteSHH10", SHHcurrentMinuteSHH10);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH10 = SHHsharedPreferencesSHH10.getInt("SHHblueThresholdSHH10", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH10 = SHHsharedPreferencesSHH10.getInt("SHHyellowThresholdSHH10", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH10 = SHHsharedPreferencesSHH10.getInt("SHHredThresholdSHH10", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH10();
        }
        synchronized (SHHeditorSHH11) {
            boolean timerStarted11 = SHHsharedPreferencesSHH11.getBoolean(SHHTIMER_STARTED_KEY_SHH11, false);
            if (timerStarted11) {
                SHHstartTimeSHH11 = SHHsharedPreferencesSHH11.getLong(SHHSTART_TIME_KEY_SHH11, 0);
                SHHtimeInMilliSHHsecondsSHH11 = SHHsharedPreferencesSHH11.getLong(SHHELAPSED_TIME_KEY_SHH11, 0);
                SHHsecSHH11 = (int) (SHHtimeInMilliSHHsecondsSHH11 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH11, 0);
            }
            SHHpeopleSHH_11 = SHHsharedPreferencesSHH11.getBoolean("SHHpeople_keySHH11", false);
            SHHflashingSHH11 = SHHsharedPreferencesSHH11.getBoolean("SHHflashing_keySHH11", false);
            SHHflashinggSHH11 = SHHsharedPreferencesSHH11.getBoolean("SHHflashingg_keySHH11", false);
            SHHisTimerRunningSHH11 = SHHsharedPreferencesSHH11.getBoolean("SHHisTimerRunningSHH11", false);
            SHHcurrentHourSHH11 = SHHsharedPreferencesSHH11.getInt("SHHcurrentHourSHH11", SHHcurrentHourSHH11);
            SHHcurrentMinuteSHH11 = SHHsharedPreferencesSHH11.getInt("SHHcurrentMinuteSHH11", SHHcurrentMinuteSHH11);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH11 = SHHsharedPreferencesSHH11.getInt("SHHblueThresholdSHH11", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH11 = SHHsharedPreferencesSHH11.getInt("SHHyellowThresholdSHH11", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH11 = SHHsharedPreferencesSHH11.getInt("SHHredThresholdSHH11", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH11();
        }
        synchronized (SHHeditorSHH12) {
            boolean timerStarted12 = SHHsharedPreferencesSHH12.getBoolean(SHHTIMER_STARTED_KEY_SHH12, false);
            if (timerStarted12) {
                SHHstartTimeSHH12 = SHHsharedPreferencesSHH12.getLong(SHHSTART_TIME_KEY_SHH12, 0);
                SHHtimeInMilliSHHsecondsSHH12 = SHHsharedPreferencesSHH12.getLong(SHHELAPSED_TIME_KEY_SHH12, 0);
                SHHsecSHH12 = (int) (SHHtimeInMilliSHHsecondsSHH12 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH12, 0);
            }
            SHHpeopleSHH_12 = SHHsharedPreferencesSHH12.getBoolean("SHHpeople_keySHH12", false);
            SHHflashingSHH12 = SHHsharedPreferencesSHH12.getBoolean("SHHflashing_keySHH12", false);
            SHHflashinggSHH12 = SHHsharedPreferencesSHH12.getBoolean("SHHflashingg_keySHH12", false);
            SHHisTimerRunningSHH12 = SHHsharedPreferencesSHH12.getBoolean("SHHisTimerRunningSHH12", false);
            SHHcurrentHourSHH12 = SHHsharedPreferencesSHH12.getInt("SHHcurrentHourSHH12", SHHcurrentHourSHH12);
            SHHcurrentMinuteSHH12 = SHHsharedPreferencesSHH12.getInt("SHHcurrentMinuteSHH12", SHHcurrentMinuteSHH12);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH12 = SHHsharedPreferencesSHH12.getInt("SHHblueThresholdSHH12", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH12 = SHHsharedPreferencesSHH12.getInt("SHHyellowThresholdSHH12", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH12 = SHHsharedPreferencesSHH12.getInt("SHHredThresholdSHH12", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH12();
        }
        synchronized (SHHeditorSHH13) {
            boolean timerStarted13 = SHHsharedPreferencesSHH13.getBoolean(SHHTIMER_STARTED_KEY_SHH13, false);
            if (timerStarted13) {
                SHHstartTimeSHH13 = SHHsharedPreferencesSHH13.getLong(SHHSTART_TIME_KEY_SHH13, 0);
                SHHtimeInMilliSHHsecondsSHH13 = SHHsharedPreferencesSHH13.getLong(SHHELAPSED_TIME_KEY_SHH13, 0);
                SHHsecSHH13 = (int) (SHHtimeInMilliSHHsecondsSHH13 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH13, 0);
            }
            SHHpeopleSHH_13 = SHHsharedPreferencesSHH13.getBoolean("SHHpeople_keySHH13", false);
            SHHflashingSHH13 = SHHsharedPreferencesSHH13.getBoolean("SHHflashing_keySHH13", false);
            SHHflashinggSHH13 = SHHsharedPreferencesSHH13.getBoolean("SHHflashingg_keySHH13", false);
            SHHisTimerRunningSHH13 = SHHsharedPreferencesSHH13.getBoolean("SHHisTimerRunningSHH13", false);
            SHHcurrentHourSHH13 = SHHsharedPreferencesSHH13.getInt("SHHcurrentHourSHH13", SHHcurrentHourSHH13);
            SHHcurrentMinuteSHH13 = SHHsharedPreferencesSHH13.getInt("SHHcurrentMinuteSHH13", SHHcurrentMinuteSHH13);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH13 = SHHsharedPreferencesSHH13.getInt("SHHblueThresholdSHH13", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH13 = SHHsharedPreferencesSHH13.getInt("SHHyellowThresholdSHH13", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH13 = SHHsharedPreferencesSHH13.getInt("SHHredThresholdSHH13", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH13();
        }
        synchronized (SHHeditorSHH14) {
            boolean timerStarted14 = SHHsharedPreferencesSHH14.getBoolean(SHHTIMER_STARTED_KEY_SHH14, false);
            if (timerStarted14) {
                SHHstartTimeSHH14 = SHHsharedPreferencesSHH14.getLong(SHHSTART_TIME_KEY_SHH14, 0);
                SHHtimeInMilliSHHsecondsSHH14 = SHHsharedPreferencesSHH14.getLong(SHHELAPSED_TIME_KEY_SHH14, 0);
                SHHsecSHH14 = (int) (SHHtimeInMilliSHHsecondsSHH14 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH14, 0);
            }
            SHHpeopleSHH_14 = SHHsharedPreferencesSHH14.getBoolean("SHHpeople_keySHH14", false);
            SHHflashingSHH14 = SHHsharedPreferencesSHH14.getBoolean("SHHflashing_keySHH14", false);
            SHHflashinggSHH14 = SHHsharedPreferencesSHH14.getBoolean("SHHflashingg_keySHH14", false);
            SHHisTimerRunningSHH14 = SHHsharedPreferencesSHH14.getBoolean("SHHisTimerRunningSHH14", false);
            SHHcurrentHourSHH14 = SHHsharedPreferencesSHH14.getInt("SHHcurrentHourSHH14", SHHcurrentHourSHH14);
            SHHcurrentMinuteSHH14 = SHHsharedPreferencesSHH14.getInt("SHHcurrentMinuteSHH14", SHHcurrentMinuteSHH14);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH14 = SHHsharedPreferencesSHH14.getInt("SHHblueThresholdSHH14", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH14 = SHHsharedPreferencesSHH14.getInt("SHHyellowThresholdSHH14", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH14 = SHHsharedPreferencesSHH14.getInt("SHHredThresholdSHH14", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH14();
        }
        synchronized (SHHeditorSHH15) {
            boolean timerStarted15 = SHHsharedPreferencesSHH15.getBoolean(SHHTIMER_STARTED_KEY_SHH15, false);
            if (timerStarted15) {
                SHHstartTimeSHH15 = SHHsharedPreferencesSHH15.getLong(SHHSTART_TIME_KEY_SHH15, 0);
                SHHtimeInMilliSHHsecondsSHH15 = SHHsharedPreferencesSHH15.getLong(SHHELAPSED_TIME_KEY_SHH15, 0);
                SHHsecSHH15 = (int) (SHHtimeInMilliSHHsecondsSHH15 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH15, 0);
            }
            SHHpeopleSHH_15 = SHHsharedPreferencesSHH15.getBoolean("SHHpeople_keySHH15", false);
            SHHflashingSHH15 = SHHsharedPreferencesSHH15.getBoolean("SHHflashing_keySHH15", false);
            SHHflashinggSHH15 = SHHsharedPreferencesSHH15.getBoolean("SHHflashingg_keySHH15", false);
            SHHisTimerRunningSHH15 = SHHsharedPreferencesSHH15.getBoolean("SHHisTimerRunningSHH15", false);
            SHHcurrentHourSHH15 = SHHsharedPreferencesSHH15.getInt("SHHcurrentHourSHH15", SHHcurrentHourSHH15);
            SHHcurrentMinuteSHH15 = SHHsharedPreferencesSHH15.getInt("SHHcurrentMinuteSHH15", SHHcurrentMinuteSHH15);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH15 = SHHsharedPreferencesSHH15.getInt("SHHblueThresholdSHH15", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH15 = SHHsharedPreferencesSHH15.getInt("SHHyellowThresholdSHH15", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH15 = SHHsharedPreferencesSHH15.getInt("SHHredThresholdSHH15", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH15();
        }
        synchronized (SHHeditorSHH16) {
            boolean timerStarted16 = SHHsharedPreferencesSHH16.getBoolean(SHHTIMER_STARTED_KEY_SHH16, false);
            if (timerStarted16) {
                SHHstartTimeSHH16 = SHHsharedPreferencesSHH16.getLong(SHHSTART_TIME_KEY_SHH16, 0);
                SHHtimeInMilliSHHsecondsSHH16 = SHHsharedPreferencesSHH16.getLong(SHHELAPSED_TIME_KEY_SHH16, 0);
                SHHsecSHH16 = (int) (SHHtimeInMilliSHHsecondsSHH16 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH16, 0);
            }
            SHHpeopleSHH_16 = SHHsharedPreferencesSHH16.getBoolean("SHHpeople_keySHH16", false);
            SHHflashingSHH16 = SHHsharedPreferencesSHH16.getBoolean("SHHflashing_keySHH16", false);
            SHHflashinggSHH16 = SHHsharedPreferencesSHH16.getBoolean("SHHflashingg_keySHH16", false);
            SHHisTimerRunningSHH16 = SHHsharedPreferencesSHH16.getBoolean("SHHisTimerRunningSHH16", false);
            SHHcurrentHourSHH16 = SHHsharedPreferencesSHH16.getInt("SHHcurrentHourSHH16", SHHcurrentHourSHH16);
            SHHcurrentMinuteSHH16 = SHHsharedPreferencesSHH16.getInt("SHHcurrentMinuteSHH16", SHHcurrentMinuteSHH16);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH16 = SHHsharedPreferencesSHH16.getInt("SHHblueThresholdSHH16", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH16 = SHHsharedPreferencesSHH16.getInt("SHHyellowThresholdSHH16", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH16 = SHHsharedPreferencesSHH16.getInt("SHHredThresholdSHH16", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH16();
        }
        synchronized (SHHeditorSHH17) {
            boolean timerStarted17 = SHHsharedPreferencesSHH17.getBoolean(SHHTIMER_STARTED_KEY_SHH17, false);
            if (timerStarted17) {
                SHHstartTimeSHH17 = SHHsharedPreferencesSHH17.getLong(SHHSTART_TIME_KEY_SHH17, 0);
                SHHtimeInMilliSHHsecondsSHH17 = SHHsharedPreferencesSHH17.getLong(SHHELAPSED_TIME_KEY_SHH17, 0);
                SHHsecSHH17 = (int) (SHHtimeInMilliSHHsecondsSHH17 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH17, 0);
            }
            SHHpeopleSHH_17 = SHHsharedPreferencesSHH17.getBoolean("SHHpeople_keySHH17", false);
            SHHflashingSHH17 = SHHsharedPreferencesSHH17.getBoolean("SHHflashing_keySHH17", false);
            SHHflashinggSHH17 = SHHsharedPreferencesSHH17.getBoolean("SHHflashingg_keySHH17", false);
            SHHisTimerRunningSHH17 = SHHsharedPreferencesSHH17.getBoolean("SHHisTimerRunningSHH17", false);
            SHHcurrentHourSHH17 = SHHsharedPreferencesSHH17.getInt("SHHcurrentHourSHH17", SHHcurrentHourSHH17);
            SHHcurrentMinuteSHH17 = SHHsharedPreferencesSHH17.getInt("SHHcurrentMinuteSHH17", SHHcurrentMinuteSHH17);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH17 = SHHsharedPreferencesSHH17.getInt("SHHblueThresholdSHH17", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH17 = SHHsharedPreferencesSHH17.getInt("SHHyellowThresholdSHH17", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH17 = SHHsharedPreferencesSHH17.getInt("SHHredThresholdSHH17", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH17();
        }
        synchronized (SHHeditorSHH18) {
            boolean timerStarted18 = SHHsharedPreferencesSHH18.getBoolean(SHHTIMER_STARTED_KEY_SHH18, false);
            if (timerStarted18) {
                SHHstartTimeSHH18 = SHHsharedPreferencesSHH18.getLong(SHHSTART_TIME_KEY_SHH18, 0);
                SHHtimeInMilliSHHsecondsSHH18 = SHHsharedPreferencesSHH18.getLong(SHHELAPSED_TIME_KEY_SHH18, 0);
                SHHsecSHH18 = (int) (SHHtimeInMilliSHHsecondsSHH18 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH18, 0);
            }
            SHHpeopleSHH_18 = SHHsharedPreferencesSHH18.getBoolean("SHHpeople_keySHH18", false);
            SHHflashingSHH18 = SHHsharedPreferencesSHH18.getBoolean("SHHflashing_keySHH18", false);
            SHHflashinggSHH18 = SHHsharedPreferencesSHH18.getBoolean("SHHflashingg_keySHH18", false);
            SHHisTimerRunningSHH18 = SHHsharedPreferencesSHH18.getBoolean("SHHisTimerRunningSHH18", false);
            SHHcurrentHourSHH18 = SHHsharedPreferencesSHH18.getInt("SHHcurrentHourSHH18", SHHcurrentHourSHH18);
            SHHcurrentMinuteSHH18 = SHHsharedPreferencesSHH18.getInt("SHHcurrentMinuteSHH18", SHHcurrentMinuteSHH18);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH18 = SHHsharedPreferencesSHH18.getInt("SHHblueThresholdSHH18", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH18 = SHHsharedPreferencesSHH18.getInt("SHHyellowThresholdSHH18", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH18 = SHHsharedPreferencesSHH18.getInt("SHHredThresholdSHH18", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH18();
        }
        synchronized (SHHeditorSHH19) {
            boolean timerStarted19 = SHHsharedPreferencesSHH19.getBoolean(SHHTIMER_STARTED_KEY_SHH19, false);
            if (timerStarted19) {
                SHHstartTimeSHH19 = SHHsharedPreferencesSHH19.getLong(SHHSTART_TIME_KEY_SHH19, 0);
                SHHtimeInMilliSHHsecondsSHH19 = SHHsharedPreferencesSHH19.getLong(SHHELAPSED_TIME_KEY_SHH19, 0);
                SHHsecSHH19 = (int) (SHHtimeInMilliSHHsecondsSHH19 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH19, 0);
            }
            SHHpeopleSHH_19 = SHHsharedPreferencesSHH19.getBoolean("SHHpeople_keySHH19", false);
            SHHflashingSHH19 = SHHsharedPreferencesSHH19.getBoolean("SHHflashing_keySHH19", false);
            SHHflashinggSHH19 = SHHsharedPreferencesSHH19.getBoolean("SHHflashingg_keySHH19", false);
            SHHisTimerRunningSHH19 = SHHsharedPreferencesSHH19.getBoolean("SHHisTimerRunningSHH19", false);
            SHHcurrentHourSHH19 = SHHsharedPreferencesSHH19.getInt("SHHcurrentHourSHH19", SHHcurrentHourSHH19);
            SHHcurrentMinuteSHH19 = SHHsharedPreferencesSHH19.getInt("SHHcurrentMinuteSHH19", SHHcurrentMinuteSHH19);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH19 = SHHsharedPreferencesSHH19.getInt("SHHblueThresholdSHH19", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH19 = SHHsharedPreferencesSHH19.getInt("SHHyellowThresholdSHH19", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH19 = SHHsharedPreferencesSHH19.getInt("SHHredThresholdSHH19", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH19();
        }
        synchronized (SHHeditorSHH20) {
            boolean timerStarted20 = SHHsharedPreferencesSHH20.getBoolean(SHHTIMER_STARTED_KEY_SHH20, false);
            if (timerStarted20) {
                SHHstartTimeSHH20 = SHHsharedPreferencesSHH20.getLong(SHHSTART_TIME_KEY_SHH20, 0);
                SHHtimeInMilliSHHsecondsSHH20 = SHHsharedPreferencesSHH20.getLong(SHHELAPSED_TIME_KEY_SHH20, 0);
                SHHsecSHH20 = (int) (SHHtimeInMilliSHHsecondsSHH20 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH20, 0);
            }
            SHHpeopleSHH_20 = SHHsharedPreferencesSHH20.getBoolean("SHHpeople_keySHH20", false);
            SHHflashingSHH20 = SHHsharedPreferencesSHH20.getBoolean("SHHflashing_keySHH20", false);
            SHHflashinggSHH20 = SHHsharedPreferencesSHH20.getBoolean("SHHflashingg_keySHH20", false);
            SHHisTimerRunningSHH20 = SHHsharedPreferencesSHH20.getBoolean("SHHisTimerRunningSHH20", false);
            SHHcurrentHourSHH20 = SHHsharedPreferencesSHH20.getInt("SHHcurrentHourSHH20", SHHcurrentHourSHH20);
            SHHcurrentMinuteSHH20 = SHHsharedPreferencesSHH20.getInt("SHHcurrentMinuteSHH20", SHHcurrentMinuteSHH20);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH20 = SHHsharedPreferencesSHH20.getInt("SHHblueThresholdSHH20", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH20 = SHHsharedPreferencesSHH20.getInt("SHHyellowThresholdSHH20", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH20 = SHHsharedPreferencesSHH20.getInt("SHHredThresholdSHH20", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH20();
        }
        synchronized (SHHeditorSHH21) {
            boolean timerStarted21 = SHHsharedPreferencesSHH21.getBoolean(SHHTIMER_STARTED_KEY_SHH21, false);
            if (timerStarted21) {
                SHHstartTimeSHH21 = SHHsharedPreferencesSHH21.getLong(SHHSTART_TIME_KEY_SHH21, 0);
                SHHtimeInMilliSHHsecondsSHH21 = SHHsharedPreferencesSHH21.getLong(SHHELAPSED_TIME_KEY_SHH21, 0);
                SHHsecSHH21 = (int) (SHHtimeInMilliSHHsecondsSHH21 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH21, 0);
            }
            SHHpeopleSHH_21 = SHHsharedPreferencesSHH21.getBoolean("SHHpeople_keySHH21", false);
            SHHflashingSHH21 = SHHsharedPreferencesSHH21.getBoolean("SHHflashing_keySHH21", false);
            SHHflashinggSHH21 = SHHsharedPreferencesSHH21.getBoolean("SHHflashingg_keySHH21", false);
            SHHisTimerRunningSHH21 = SHHsharedPreferencesSHH21.getBoolean("SHHisTimerRunningSHH21", false);
            SHHcurrentHourSHH21 = SHHsharedPreferencesSHH21.getInt("SHHcurrentHourSHH21", SHHcurrentHourSHH21);
            SHHcurrentMinuteSHH21 = SHHsharedPreferencesSHH21.getInt("SHHcurrentMinuteSHH21", SHHcurrentMinuteSHH21);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH21 = SHHsharedPreferencesSHH21.getInt("SHHblueThresholdSHH21", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH21 = SHHsharedPreferencesSHH21.getInt("SHHyellowThresholdSHH21", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH21 = SHHsharedPreferencesSHH21.getInt("SHHredThresholdSHH21", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH21();
        }
        synchronized (SHHeditorSHH22) {
            boolean timerStarted22 = SHHsharedPreferencesSHH22.getBoolean(SHHTIMER_STARTED_KEY_SHH22, false);
            if (timerStarted22) {
                SHHstartTimeSHH22 = SHHsharedPreferencesSHH22.getLong(SHHSTART_TIME_KEY_SHH22, 0);
                SHHtimeInMilliSHHsecondsSHH22 = SHHsharedPreferencesSHH22.getLong(SHHELAPSED_TIME_KEY_SHH22, 0);
                SHHsecSHH22 = (int) (SHHtimeInMilliSHHsecondsSHH22 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH22, 0);
            }
            SHHpeopleSHH_22 = SHHsharedPreferencesSHH22.getBoolean("SHHpeople_keySHH22", false);
            SHHflashingSHH22 = SHHsharedPreferencesSHH22.getBoolean("SHHflashing_keySHH22", false);
            SHHflashinggSHH22 = SHHsharedPreferencesSHH22.getBoolean("SHHflashingg_keySHH22", false);
            SHHisTimerRunningSHH22 = SHHsharedPreferencesSHH22.getBoolean("SHHisTimerRunningSHH22", false);
            SHHcurrentHourSHH22 = SHHsharedPreferencesSHH22.getInt("SHHcurrentHourSHH22", SHHcurrentHourSHH22);
            SHHcurrentMinuteSHH22 = SHHsharedPreferencesSHH22.getInt("SHHcurrentMinuteSHH22", SHHcurrentMinuteSHH22);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH22 = SHHsharedPreferencesSHH22.getInt("SHHblueThresholdSHH22", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH22 = SHHsharedPreferencesSHH22.getInt("SHHyellowThresholdSHH22", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH22 = SHHsharedPreferencesSHH22.getInt("SHHredThresholdSHH22", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH22();
        }
        synchronized (SHHeditorSHH23) {
            boolean timerStarted23 = SHHsharedPreferencesSHH23.getBoolean(SHHTIMER_STARTED_KEY_SHH23, false);
            if (timerStarted23) {
                SHHstartTimeSHH23 = SHHsharedPreferencesSHH23.getLong(SHHSTART_TIME_KEY_SHH23, 0);
                SHHtimeInMilliSHHsecondsSHH23 = SHHsharedPreferencesSHH23.getLong(SHHELAPSED_TIME_KEY_SHH23, 0);
                SHHsecSHH23 = (int) (SHHtimeInMilliSHHsecondsSHH23 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH23, 0);
            }
            SHHpeopleSHH_23 = SHHsharedPreferencesSHH23.getBoolean("SHHpeople_keySHH23", false);
            SHHflashingSHH23 = SHHsharedPreferencesSHH23.getBoolean("SHHflashing_keySHH23", false);
            SHHflashinggSHH23 = SHHsharedPreferencesSHH23.getBoolean("SHHflashingg_keySHH23", false);
            SHHisTimerRunningSHH23 = SHHsharedPreferencesSHH23.getBoolean("SHHisTimerRunningSHH23", false);
            SHHcurrentHourSHH23 = SHHsharedPreferencesSHH23.getInt("SHHcurrentHourSHH23", SHHcurrentHourSHH23);
            SHHcurrentMinuteSHH23 = SHHsharedPreferencesSHH23.getInt("SHHcurrentMinuteSHH23", SHHcurrentMinuteSHH23);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH23 = SHHsharedPreferencesSHH23.getInt("SHHblueThresholdSHH23", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH23 = SHHsharedPreferencesSHH23.getInt("SHHyellowThresholdSHH23", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH23 = SHHsharedPreferencesSHH23.getInt("SHHredThresholdSHH23", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH23();
        }
        synchronized (SHHeditorSHH24) {
            boolean timerStarted24 = SHHsharedPreferencesSHH24.getBoolean(SHHTIMER_STARTED_KEY_SHH24, false);
            if (timerStarted24) {
                SHHstartTimeSHH24 = SHHsharedPreferencesSHH24.getLong(SHHSTART_TIME_KEY_SHH24, 0);
                SHHtimeInMilliSHHsecondsSHH24 = SHHsharedPreferencesSHH24.getLong(SHHELAPSED_TIME_KEY_SHH24, 0);
                SHHsecSHH24 = (int) (SHHtimeInMilliSHHsecondsSHH24 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH24, 0);
            }
            SHHpeopleSHH_24 = SHHsharedPreferencesSHH24.getBoolean("SHHpeople_keySHH24", false);
            SHHflashingSHH24 = SHHsharedPreferencesSHH24.getBoolean("SHHflashing_keySHH24", false);
            SHHflashinggSHH24 = SHHsharedPreferencesSHH24.getBoolean("SHHflashingg_keySHH24", false);
            SHHisTimerRunningSHH24 = SHHsharedPreferencesSHH24.getBoolean("SHHisTimerRunningSHH24", false);
            SHHcurrentHourSHH24 = SHHsharedPreferencesSHH24.getInt("SHHcurrentHourSHH24", SHHcurrentHourSHH24);
            SHHcurrentMinuteSHH24 = SHHsharedPreferencesSHH24.getInt("SHHcurrentMinuteSHH24", SHHcurrentMinuteSHH24);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH24 = SHHsharedPreferencesSHH24.getInt("SHHblueThresholdSHH24", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH24 = SHHsharedPreferencesSHH24.getInt("SHHyellowThresholdSHH24", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH24 = SHHsharedPreferencesSHH24.getInt("SHHredThresholdSHH24", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH24();
        }
        synchronized (SHHeditorSHH25) {
            boolean timerStarted25 = SHHsharedPreferencesSHH25.getBoolean(SHHTIMER_STARTED_KEY_SHH25, false);
            if (timerStarted25) {
                SHHstartTimeSHH25 = SHHsharedPreferencesSHH25.getLong(SHHSTART_TIME_KEY_SHH25, 0);
                SHHtimeInMilliSHHsecondsSHH25 = SHHsharedPreferencesSHH25.getLong(SHHELAPSED_TIME_KEY_SHH25, 0);
                SHHsecSHH25 = (int) (SHHtimeInMilliSHHsecondsSHH25 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH25, 0);
            }
            SHHpeopleSHH_25 = SHHsharedPreferencesSHH25.getBoolean("SHHpeople_keySHH25", false);
            SHHflashingSHH25 = SHHsharedPreferencesSHH25.getBoolean("SHHflashing_keySHH25", false);
            SHHflashinggSHH25 = SHHsharedPreferencesSHH25.getBoolean("SHHflashingg_keySHH25", false);
            SHHisTimerRunningSHH25 = SHHsharedPreferencesSHH25.getBoolean("SHHisTimerRunningSHH25", false);
            SHHcurrentHourSHH25 = SHHsharedPreferencesSHH25.getInt("SHHcurrentHourSHH25", SHHcurrentHourSHH25);
            SHHcurrentMinuteSHH25 = SHHsharedPreferencesSHH25.getInt("SHHcurrentMinuteSHH25", SHHcurrentMinuteSHH25);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH25 = SHHsharedPreferencesSHH25.getInt("SHHblueThresholdSHH25", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH25 = SHHsharedPreferencesSHH25.getInt("SHHyellowThresholdSHH25", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH25 = SHHsharedPreferencesSHH25.getInt("SHHredThresholdSHH25", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH25();
        }
        synchronized (SHHeditorSHH26) {
            boolean timerStarted26 = SHHsharedPreferencesSHH26.getBoolean(SHHTIMER_STARTED_KEY_SHH26, false);
            if (timerStarted26) {
                SHHstartTimeSHH26 = SHHsharedPreferencesSHH26.getLong(SHHSTART_TIME_KEY_SHH26, 0);
                SHHtimeInMilliSHHsecondsSHH26 = SHHsharedPreferencesSHH26.getLong(SHHELAPSED_TIME_KEY_SHH26, 0);
                SHHsecSHH26 = (int) (SHHtimeInMilliSHHsecondsSHH26 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH26, 0);
            }
            SHHpeopleSHH_26 = SHHsharedPreferencesSHH26.getBoolean("SHHpeople_keySHH26", false);
            SHHflashingSHH26 = SHHsharedPreferencesSHH26.getBoolean("SHHflashing_keySHH26", false);
            SHHflashinggSHH26 = SHHsharedPreferencesSHH26.getBoolean("SHHflashingg_keySHH26", false);
            SHHisTimerRunningSHH26 = SHHsharedPreferencesSHH26.getBoolean("SHHisTimerRunningSHH26", false);
            SHHcurrentHourSHH26 = SHHsharedPreferencesSHH26.getInt("SHHcurrentHourSHH26", SHHcurrentHourSHH26);
            SHHcurrentMinuteSHH26 = SHHsharedPreferencesSHH26.getInt("SHHcurrentMinuteSHH26", SHHcurrentMinuteSHH26);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH26 = SHHsharedPreferencesSHH26.getInt("SHHblueThresholdSHH26", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH26 = SHHsharedPreferencesSHH26.getInt("SHHyellowThresholdSHH26", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH26 = SHHsharedPreferencesSHH26.getInt("SHHredThresholdSHH26", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH26();
        }
        synchronized (SHHeditorSHH27) {
            boolean timerStarted27 = SHHsharedPreferencesSHH27.getBoolean(SHHTIMER_STARTED_KEY_SHH27, false);
            if (timerStarted27) {
                SHHstartTimeSHH27 = SHHsharedPreferencesSHH27.getLong(SHHSTART_TIME_KEY_SHH27, 0);
                SHHtimeInMilliSHHsecondsSHH27 = SHHsharedPreferencesSHH27.getLong(SHHELAPSED_TIME_KEY_SHH27, 0);
                SHHsecSHH27 = (int) (SHHtimeInMilliSHHsecondsSHH27 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH27, 0);
            }
            SHHpeopleSHH_27 = SHHsharedPreferencesSHH27.getBoolean("SHHpeople_keySHH27", false);
            SHHflashingSHH27 = SHHsharedPreferencesSHH27.getBoolean("SHHflashing_keySHH27", false);
            SHHflashinggSHH27 = SHHsharedPreferencesSHH27.getBoolean("SHHflashingg_keySHH27", false);
            SHHisTimerRunningSHH27 = SHHsharedPreferencesSHH27.getBoolean("SHHisTimerRunningSHH27", false);
            SHHcurrentHourSHH27 = SHHsharedPreferencesSHH27.getInt("SHHcurrentHourSHH27", SHHcurrentHourSHH27);
            SHHcurrentMinuteSHH27 = SHHsharedPreferencesSHH27.getInt("SHHcurrentMinuteSHH27", SHHcurrentMinuteSHH27);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH27 = SHHsharedPreferencesSHH27.getInt("SHHblueThresholdSHH27", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH27 = SHHsharedPreferencesSHH27.getInt("SHHyellowThresholdSHH27", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH27 = SHHsharedPreferencesSHH27.getInt("SHHredThresholdSHH27", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH27();
        }
        synchronized (SHHeditorSHH28) {
            boolean timerStarted28 = SHHsharedPreferencesSHH28.getBoolean(SHHTIMER_STARTED_KEY_SHH28, false);
            if (timerStarted28) {
                SHHstartTimeSHH28 = SHHsharedPreferencesSHH28.getLong(SHHSTART_TIME_KEY_SHH28, 0);
                SHHtimeInMilliSHHsecondsSHH28 = SHHsharedPreferencesSHH28.getLong(SHHELAPSED_TIME_KEY_SHH28, 0);
                SHHsecSHH28 = (int) (SHHtimeInMilliSHHsecondsSHH28 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH28, 0);
            }
            SHHpeopleSHH_28 = SHHsharedPreferencesSHH28.getBoolean("SHHpeople_keySHH28", false);
            SHHflashingSHH28 = SHHsharedPreferencesSHH28.getBoolean("SHHflashing_keySHH28", false);
            SHHflashinggSHH28 = SHHsharedPreferencesSHH28.getBoolean("SHHflashingg_keySHH28", false);
            SHHisTimerRunningSHH28 = SHHsharedPreferencesSHH28.getBoolean("SHHisTimerRunningSHH28", false);
            SHHcurrentHourSHH28 = SHHsharedPreferencesSHH28.getInt("SHHcurrentHourSHH28", SHHcurrentHourSHH28);
            SHHcurrentMinuteSHH28 = SHHsharedPreferencesSHH28.getInt("SHHcurrentMinuteSHH28", SHHcurrentMinuteSHH28);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH28 = SHHsharedPreferencesSHH28.getInt("SHHblueThresholdSHH28", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH28 = SHHsharedPreferencesSHH28.getInt("SHHyellowThresholdSHH28", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH28 = SHHsharedPreferencesSHH28.getInt("SHHredThresholdSHH28", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH28();
        }
        synchronized (SHHeditorSHH29) {
            boolean timerStarted29 = SHHsharedPreferencesSHH29.getBoolean(SHHTIMER_STARTED_KEY_SHH29, false);
            if (timerStarted29) {
                SHHstartTimeSHH29 = SHHsharedPreferencesSHH29.getLong(SHHSTART_TIME_KEY_SHH29, 0);
                SHHtimeInMilliSHHsecondsSHH29 = SHHsharedPreferencesSHH29.getLong(SHHELAPSED_TIME_KEY_SHH29, 0);
                SHHsecSHH29 = (int) (SHHtimeInMilliSHHsecondsSHH29 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH29, 0);
            }
            SHHpeopleSHH_29 = SHHsharedPreferencesSHH29.getBoolean("SHHpeople_keySHH29", false);
            SHHflashingSHH29 = SHHsharedPreferencesSHH29.getBoolean("SHHflashing_keySHH29", false);
            SHHflashinggSHH29 = SHHsharedPreferencesSHH29.getBoolean("SHHflashingg_keySHH29", false);
            SHHisTimerRunningSHH29 = SHHsharedPreferencesSHH29.getBoolean("SHHisTimerRunningSHH29", false);
            SHHcurrentHourSHH29 = SHHsharedPreferencesSHH29.getInt("SHHcurrentHourSHH29", SHHcurrentHourSHH29);
            SHHcurrentMinuteSHH29 = SHHsharedPreferencesSHH29.getInt("SHHcurrentMinuteSHH29", SHHcurrentMinuteSHH29);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH29 = SHHsharedPreferencesSHH29.getInt("SHHblueThresholdSHH29", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH29 = SHHsharedPreferencesSHH29.getInt("SHHyellowThresholdSHH29", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH29 = SHHsharedPreferencesSHH29.getInt("SHHredThresholdSHH29", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH29();
        }
        synchronized (SHHeditorSHH30) {
            boolean timerStarted30 = SHHsharedPreferencesSHH30.getBoolean(SHHTIMER_STARTED_KEY_SHH30, false);
            if (timerStarted30) {
                SHHstartTimeSHH30 = SHHsharedPreferencesSHH30.getLong(SHHSTART_TIME_KEY_SHH30, 0);
                SHHtimeInMilliSHHsecondsSHH30 = SHHsharedPreferencesSHH30.getLong(SHHELAPSED_TIME_KEY_SHH30, 0);
                SHHsecSHH30 = (int) (SHHtimeInMilliSHHsecondsSHH30 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH30, 0);
            }
            SHHpeopleSHH_30 = SHHsharedPreferencesSHH30.getBoolean("SHHpeople_keySHH30", false);
            SHHflashingSHH30 = SHHsharedPreferencesSHH30.getBoolean("SHHflashing_keySHH30", false);
            SHHflashinggSHH30 = SHHsharedPreferencesSHH30.getBoolean("SHHflashingg_keySHH30", false);
            SHHisTimerRunningSHH30 = SHHsharedPreferencesSHH30.getBoolean("SHHisTimerRunningSHH30", false);
            SHHcurrentHourSHH30 = SHHsharedPreferencesSHH30.getInt("SHHcurrentHourSHH30", SHHcurrentHourSHH30);
            SHHcurrentMinuteSHH30 = SHHsharedPreferencesSHH30.getInt("SHHcurrentMinuteSHH30", SHHcurrentMinuteSHH30);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH30 = SHHsharedPreferencesSHH30.getInt("SHHblueThresholdSHH30", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH30 = SHHsharedPreferencesSHH30.getInt("SHHyellowThresholdSHH30", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH30 = SHHsharedPreferencesSHH30.getInt("SHHredThresholdSHH30", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH30();
        }
        synchronized (SHHeditorSHH31) {
            boolean timerStarted31 = SHHsharedPreferencesSHH31.getBoolean(SHHTIMER_STARTED_KEY_SHH31, false);
            if (timerStarted31) {
                SHHstartTimeSHH31 = SHHsharedPreferencesSHH31.getLong(SHHSTART_TIME_KEY_SHH31, 0);
                SHHtimeInMilliSHHsecondsSHH31 = SHHsharedPreferencesSHH31.getLong(SHHELAPSED_TIME_KEY_SHH31, 0);
                SHHsecSHH31 = (int) (SHHtimeInMilliSHHsecondsSHH31 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH31, 0);
            }
            SHHpeopleSHH_31 = SHHsharedPreferencesSHH31.getBoolean("SHHpeople_keySHH31", false);
            SHHflashingSHH31 = SHHsharedPreferencesSHH31.getBoolean("SHHflashing_keySHH31", false);
            SHHflashinggSHH31 = SHHsharedPreferencesSHH31.getBoolean("SHHflashingg_keySHH31", false);
            SHHisTimerRunningSHH31 = SHHsharedPreferencesSHH31.getBoolean("SHHisTimerRunningSHH31", false);
            SHHcurrentHourSHH31 = SHHsharedPreferencesSHH31.getInt("SHHcurrentHourSHH31", SHHcurrentHourSHH31);
            SHHcurrentMinuteSHH31 = SHHsharedPreferencesSHH31.getInt("SHHcurrentMinuteSHH31", SHHcurrentMinuteSHH31);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH31 = SHHsharedPreferencesSHH31.getInt("SHHblueThresholdSHH31", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH31 = SHHsharedPreferencesSHH31.getInt("SHHyellowThresholdSHH31", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH31 = SHHsharedPreferencesSHH31.getInt("SHHredThresholdSHH31", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH31();
        }
        synchronized (SHHeditorSHH32) {
            boolean timerStarted32 = SHHsharedPreferencesSHH32.getBoolean(SHHTIMER_STARTED_KEY_SHH32, false);
            if (timerStarted32) {
                SHHstartTimeSHH32 = SHHsharedPreferencesSHH32.getLong(SHHSTART_TIME_KEY_SHH32, 0);
                SHHtimeInMilliSHHsecondsSHH32 = SHHsharedPreferencesSHH32.getLong(SHHELAPSED_TIME_KEY_SHH32, 0);
                SHHsecSHH32 = (int) (SHHtimeInMilliSHHsecondsSHH32 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH32, 0);
            }
            SHHpeopleSHH_32 = SHHsharedPreferencesSHH32.getBoolean("SHHpeople_keySHH32", false);
            SHHflashingSHH32 = SHHsharedPreferencesSHH32.getBoolean("SHHflashing_keySHH32", false);
            SHHflashinggSHH32 = SHHsharedPreferencesSHH32.getBoolean("SHHflashingg_keySHH32", false);
            SHHisTimerRunningSHH32 = SHHsharedPreferencesSHH32.getBoolean("SHHisTimerRunningSHH32", false);
            SHHcurrentHourSHH32 = SHHsharedPreferencesSHH32.getInt("SHHcurrentHourSHH32", SHHcurrentHourSHH32);
            SHHcurrentMinuteSHH32 = SHHsharedPreferencesSHH32.getInt("SHHcurrentMinuteSHH32", SHHcurrentMinuteSHH32);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH32 = SHHsharedPreferencesSHH32.getInt("SHHblueThresholdSHH32", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH32 = SHHsharedPreferencesSHH32.getInt("SHHyellowThresholdSHH32", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH32 = SHHsharedPreferencesSHH32.getInt("SHHredThresholdSHH32", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH32();
        }
        synchronized (SHHeditorSHH33) {
            boolean timerStarted33 = SHHsharedPreferencesSHH33.getBoolean(SHHTIMER_STARTED_KEY_SHH33, false);
            if (timerStarted33) {
                SHHstartTimeSHH33 = SHHsharedPreferencesSHH33.getLong(SHHSTART_TIME_KEY_SHH33, 0);
                SHHtimeInMilliSHHsecondsSHH33 = SHHsharedPreferencesSHH33.getLong(SHHELAPSED_TIME_KEY_SHH33, 0);
                SHHsecSHH33 = (int) (SHHtimeInMilliSHHsecondsSHH33 / 1000);
                SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH33, 0);
            }
            SHHpeopleSHH_33 = SHHsharedPreferencesSHH33.getBoolean("SHHpeople_keySHH33", false);
            SHHflashingSHH33 = SHHsharedPreferencesSHH33.getBoolean("SHHflashing_keySHH33", false);
            SHHflashinggSHH33 = SHHsharedPreferencesSHH33.getBoolean("SHHflashingg_keySHH33", false);
            SHHisTimerRunningSHH33 = SHHsharedPreferencesSHH33.getBoolean("SHHisTimerRunningSHH33", false);
            SHHcurrentHourSHH33 = SHHsharedPreferencesSHH33.getInt("SHHcurrentHourSHH33", SHHcurrentHourSHH33);
            SHHcurrentMinuteSHH33 = SHHsharedPreferencesSHH33.getInt("SHHcurrentMinuteSHH33", SHHcurrentMinuteSHH33);

            // 恢复加時時間  測試用
            SHHblueThresholdSHH33 = SHHsharedPreferencesSHH33.getInt("SHHblueThresholdSHH33", originalSHHblueThresholdSHH2);
            SHHyellowThresholdSHH33 = SHHsharedPreferencesSHH33.getInt("SHHyellowThresholdSHH33", originalSHHyellowThresholdSHH2);
            SHHredThresholdSHH33 = SHHsharedPreferencesSHH33.getInt("SHHredThresholdSHH33", originalSHHredThresholdSHH2);

            // 更新按鈕的背景顏色
            SHHupdateButtonColorSHH33();
        }

    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer101() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH101);
    }

    private void stopTimer102() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH102);
    }

    private void stopTimer103() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH103);
    }

    private void stopTimer104() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH104);
    }

    private void stopTimer105() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH105);
    }

    private void stopTimer106() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH106);
    }

    private void stopTimer107() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH107);
    }

    private void stopTimer8() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH8);
    }

    private void stopTimer9() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH9);
    }

    private void stopTimer10() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH10);
    }

    private void stopTimer11() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH11);
    }

    private void stopTimer12() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH12);
    }

    private void stopTimer13() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH13);
    }

    private void stopTimer14() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH14);
    }

    private void stopTimer15() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH15);
    }

    private void stopTimer16() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH16);
    }

    private void stopTimer17() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH17);
    }

    private void stopTimer18() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH18);
    }

    private void stopTimer19() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH19);
    }

    private void stopTimer20() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH20);
    }

    private void stopTimer21() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH21);
    }

    private void stopTimer22() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH22);
    }

    private void stopTimer23() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH23);
    }

    private void stopTimer24() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH24);
    }

    private void stopTimer25() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH25);
    }

    private void stopTimer26() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH26);
    }

    private void stopTimer27() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH27);
    }

    private void stopTimer28() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH28);
    }

    private void stopTimer29() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH29);
    }

    private void stopTimer30() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH30);
    }

    private void stopTimer31() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH31);
    }

    private void stopTimer32() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH32);
    }

    private void stopTimer33() {
        SHHhandlerSHH.removeCallbacks(SHHupdateTimerThreadSHH33);
    }



    private void resetSHHsecondsSHH101() {
        SHHsecondsSHH101 = 0;
        SHHsecSHH101 = 0;
        SHHminutesSHH101 = 0;
        SHHhoursSHH101 = 0;
        SHHbtnTimerSHH101.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString101 = String.format("%02d:%02d", SHHhoursSHH101, SHHminutesSHH101);
        SHHbtnTimerSHH101.setText(timeString101);
    }

    private void resetSHHsecondsSHH102() {
        SHHsecondsSHH102 = 0;
        SHHsecSHH102 = 0;
        SHHminutesSHH102 = 0;
        SHHhoursSHH102 = 0;
        SHHbtnTimerSHH102.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString102 = String.format("%02d:%02d", SHHhoursSHH102, SHHminutesSHH102);
        SHHbtnTimerSHH102.setText(timeString102);
    }

    private void resetSHHsecondsSHH103() {
        SHHsecondsSHH103 = 0;
        SHHsecSHH103 = 0;
        SHHminutesSHH103 = 0;
        SHHhoursSHH103 = 0;
        SHHbtnTimerSHH103.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString103 = String.format("%02d:%02d", SHHhoursSHH103, SHHminutesSHH103);
        SHHbtnTimerSHH103.setText(timeString103);
    }

    private void resetSHHsecondsSHH104() {
        SHHsecondsSHH104 = 0;
        SHHsecSHH104 = 0;
        SHHminutesSHH104 = 0;
        SHHhoursSHH104 = 0;
        SHHbtnTimerSHH104.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString104 = String.format("%02d:%02d", SHHhoursSHH104, SHHminutesSHH104);
        SHHbtnTimerSHH104.setText(timeString104);
    }

    private void resetSHHsecondsSHH105() {
        SHHsecondsSHH105 = 0;
        SHHsecSHH105 = 0;
        SHHminutesSHH105 = 0;
        SHHhoursSHH105 = 0;
        SHHbtnTimerSHH105.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString105 = String.format("%02d:%02d", SHHhoursSHH105, SHHminutesSHH105);
        SHHbtnTimerSHH105.setText(timeString105);
    }

    private void resetSHHsecondsSHH106() {
        SHHsecondsSHH106 = 0;
        SHHsecSHH106 = 0;
        SHHminutesSHH106 = 0;
        SHHhoursSHH106 = 0;
        SHHbtnTimerSHH106.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString106 = String.format("%02d:%02d", SHHhoursSHH106, SHHminutesSHH106);
        SHHbtnTimerSHH106.setText(timeString106);
    }

    private void resetSHHsecondsSHH107() {
        SHHsecondsSHH107 = 0;
        SHHsecSHH107 = 0;
        SHHminutesSHH107 = 0;
        SHHhoursSHH107 = 0;
        SHHbtnTimerSHH107.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString107 = String.format("%02d:%02d", SHHhoursSHH107, SHHminutesSHH107);
        SHHbtnTimerSHH107.setText(timeString107);
    }

    private void resetSHHsecondsSHH8() {
        SHHsecondsSHH8 = 0;
        SHHsecSHH8 = 0;
        SHHminutesSHH8 = 0;
        SHHhoursSHH8 = 0;
        SHHbtnTimerSHH8.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString8 = String.format("%02d:%02d", SHHhoursSHH8, SHHminutesSHH8);
        SHHbtnTimerSHH8.setText(timeString8);
    }

    private void resetSHHsecondsSHH9() {
        SHHsecondsSHH9 = 0;
        SHHsecSHH9 = 0;
        SHHminutesSHH9 = 0;
        SHHhoursSHH9 = 0;
        SHHbtnTimerSHH9.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString9 = String.format("%02d:%02d", SHHhoursSHH9, SHHminutesSHH9);
        SHHbtnTimerSHH9.setText(timeString9);
    }

    private void resetSHHsecondsSHH10() {
        SHHsecondsSHH10 = 0;
        SHHsecSHH10 = 0;
        SHHminutesSHH10 = 0;
        SHHhoursSHH10 = 0;
        SHHbtnTimerSHH10.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString10 = String.format("%02d:%02d", SHHhoursSHH10, SHHminutesSHH10);
        SHHbtnTimerSHH10.setText(timeString10);
    }
    private void resetSHHsecondsSHH11() {
        SHHsecondsSHH11 = 0;
        SHHsecSHH11 = 0;
        SHHminutesSHH11 = 0;
        SHHhoursSHH11 = 0;
        SHHbtnTimerSHH11.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString11 = String.format("%02d:%02d", SHHhoursSHH11, SHHminutesSHH11);
        SHHbtnTimerSHH11.setText(timeString11);
    }

    private void resetSHHsecondsSHH12() {
        SHHsecondsSHH12 = 0;
        SHHsecSHH12 = 0;
        SHHminutesSHH12 = 0;
        SHHhoursSHH12 = 0;
        SHHbtnTimerSHH12.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString12 = String.format("%02d:%02d", SHHhoursSHH12, SHHminutesSHH12);
        SHHbtnTimerSHH12.setText(timeString12);
    }

    private void resetSHHsecondsSHH13() {
        SHHsecondsSHH13 = 0;
        SHHsecSHH13 = 0;
        SHHminutesSHH13 = 0;
        SHHhoursSHH13 = 0;
        SHHbtnTimerSHH13.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString13 = String.format("%02d:%02d", SHHhoursSHH13, SHHminutesSHH13);
        SHHbtnTimerSHH13.setText(timeString13);
    }

    private void resetSHHsecondsSHH14() {
        SHHsecondsSHH14 = 0;
        SHHsecSHH14 = 0;
        SHHminutesSHH14 = 0;
        SHHhoursSHH14 = 0;
        SHHbtnTimerSHH14.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString14 = String.format("%02d:%02d", SHHhoursSHH14, SHHminutesSHH14);
        SHHbtnTimerSHH14.setText(timeString14);
    }

    private void resetSHHsecondsSHH15() {
        SHHsecondsSHH15 = 0;
        SHHsecSHH15 = 0;
        SHHminutesSHH15 = 0;
        SHHhoursSHH15 = 0;
        SHHbtnTimerSHH15.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString15 = String.format("%02d:%02d", SHHhoursSHH15, SHHminutesSHH15);
        SHHbtnTimerSHH15.setText(timeString15);
    }

    private void resetSHHsecondsSHH16() {
        SHHsecondsSHH16 = 0;
        SHHsecSHH16 = 0;
        SHHminutesSHH16 = 0;
        SHHhoursSHH16 = 0;
        SHHbtnTimerSHH16.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString16 = String.format("%02d:%02d", SHHhoursSHH16, SHHminutesSHH16);
        SHHbtnTimerSHH16.setText(timeString16);
    }

    private void resetSHHsecondsSHH17() {
        SHHsecondsSHH17 = 0;
        SHHsecSHH17 = 0;
        SHHminutesSHH17 = 0;
        SHHhoursSHH17 = 0;
        SHHbtnTimerSHH17.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString17 = String.format("%02d:%02d", SHHhoursSHH17, SHHminutesSHH17);
        SHHbtnTimerSHH17.setText(timeString17);
    }

    private void resetSHHsecondsSHH18() {
        SHHsecondsSHH18 = 0;
        SHHsecSHH18 = 0;
        SHHminutesSHH18 = 0;
        SHHhoursSHH18 = 0;
        SHHbtnTimerSHH18.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString18 = String.format("%02d:%02d", SHHhoursSHH18, SHHminutesSHH18);
        SHHbtnTimerSHH18.setText(timeString18);
    }

    private void resetSHHsecondsSHH19() {
        SHHsecondsSHH19 = 0;
        SHHsecSHH19 = 0;
        SHHminutesSHH19 = 0;
        SHHhoursSHH19 = 0;
        SHHbtnTimerSHH19.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString19 = String.format("%02d:%02d", SHHhoursSHH19, SHHminutesSHH19);
        SHHbtnTimerSHH19.setText(timeString19);
    }

    private void resetSHHsecondsSHH20() {
        SHHsecondsSHH20 = 0;
        SHHsecSHH20 = 0;
        SHHminutesSHH20 = 0;
        SHHhoursSHH20 = 0;
        SHHbtnTimerSHH20.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString20 = String.format("%02d:%02d", SHHhoursSHH20, SHHminutesSHH20);
        SHHbtnTimerSHH20.setText(timeString20);

    }
    private void resetSHHsecondsSHH21() {
        SHHsecondsSHH21 = 0;
        SHHsecSHH21 = 0;
        SHHminutesSHH21 = 0;
        SHHhoursSHH21 = 0;
        SHHbtnTimerSHH21.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString21 = String.format("%02d:%02d", SHHhoursSHH21, SHHminutesSHH21);
        SHHbtnTimerSHH21.setText(timeString21);
    }

    private void resetSHHsecondsSHH22() {
        SHHsecondsSHH22 = 0;
        SHHsecSHH22 = 0;
        SHHminutesSHH22 = 0;
        SHHhoursSHH22 = 0;
        SHHbtnTimerSHH22.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString22 = String.format("%02d:%02d", SHHhoursSHH22, SHHminutesSHH22);
        SHHbtnTimerSHH22.setText(timeString22);
    }

    private void resetSHHsecondsSHH23() {
        SHHsecondsSHH23 = 0;
        SHHsecSHH23 = 0;
        SHHminutesSHH23 = 0;
        SHHhoursSHH23 = 0;
        SHHbtnTimerSHH23.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString23 = String.format("%02d:%02d", SHHhoursSHH23, SHHminutesSHH23);
        SHHbtnTimerSHH23.setText(timeString23);
    }

    private void resetSHHsecondsSHH24() {
        SHHsecondsSHH24 = 0;
        SHHsecSHH24 = 0;
        SHHminutesSHH24 = 0;
        SHHhoursSHH24 = 0;
        SHHbtnTimerSHH24.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString24 = String.format("%02d:%02d", SHHhoursSHH24, SHHminutesSHH24);
        SHHbtnTimerSHH24.setText(timeString24);
    }

    private void resetSHHsecondsSHH25() {
        SHHsecondsSHH25 = 0;
        SHHsecSHH25 = 0;
        SHHminutesSHH25 = 0;
        SHHhoursSHH25 = 0;
        SHHbtnTimerSHH25.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString25 = String.format("%02d:%02d", SHHhoursSHH25, SHHminutesSHH25);
        SHHbtnTimerSHH25.setText(timeString25);
    }

    private void resetSHHsecondsSHH26() {
        SHHsecondsSHH26 = 0;
        SHHsecSHH26 = 0;
        SHHminutesSHH26 = 0;
        SHHhoursSHH26 = 0;
        SHHbtnTimerSHH26.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString26 = String.format("%02d:%02d", SHHhoursSHH26, SHHminutesSHH26);
        SHHbtnTimerSHH26.setText(timeString26);
    }

    private void resetSHHsecondsSHH27() {
        SHHsecondsSHH27 = 0;
        SHHsecSHH27 = 0;
        SHHminutesSHH27 = 0;
        SHHhoursSHH27 = 0;
        SHHbtnTimerSHH27.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString27 = String.format("%02d:%02d", SHHhoursSHH27, SHHminutesSHH27);
        SHHbtnTimerSHH27.setText(timeString27);
    }

    private void resetSHHsecondsSHH28() {
        SHHsecondsSHH28 = 0;
        SHHsecSHH28 = 0;
        SHHminutesSHH28 = 0;
        SHHhoursSHH28 = 0;
        SHHbtnTimerSHH28.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString28 = String.format("%02d:%02d", SHHhoursSHH28, SHHminutesSHH28);
        SHHbtnTimerSHH28.setText(timeString28);
    }

    private void resetSHHsecondsSHH29() {
        SHHsecondsSHH29 = 0;
        SHHsecSHH29 = 0;
        SHHminutesSHH29 = 0;
        SHHhoursSHH29 = 0;
        SHHbtnTimerSHH29.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString29 = String.format("%02d:%02d", SHHhoursSHH29, SHHminutesSHH29);
        SHHbtnTimerSHH29.setText(timeString29);
    }

    private void resetSHHsecondsSHH30() {
        SHHsecondsSHH30 = 0;
        SHHsecSHH30 = 0;
        SHHminutesSHH30 = 0;
        SHHhoursSHH30 = 0;
        SHHbtnTimerSHH30.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString30 = String.format("%02d:%02d", SHHhoursSHH30, SHHminutesSHH30);
        SHHbtnTimerSHH30.setText(timeString30);
    }
    private void resetSHHsecondsSHH31() {
        SHHsecondsSHH31 = 0;
        SHHsecSHH31 = 0;
        SHHminutesSHH31 = 0;
        SHHhoursSHH31 = 0;
        SHHbtnTimerSHH31.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString31 = String.format("%02d:%02d", SHHhoursSHH31, SHHminutesSHH31);
        SHHbtnTimerSHH31.setText(timeString31);
    }

    private void resetSHHsecondsSHH32() {
        SHHsecondsSHH32 = 0;
        SHHsecSHH32 = 0;
        SHHminutesSHH32 = 0;
        SHHhoursSHH32 = 0;
        SHHbtnTimerSHH32.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString32 = String.format("%02d:%02d", SHHhoursSHH32, SHHminutesSHH32);
        SHHbtnTimerSHH32.setText(timeString32);
    }

    private void resetSHHsecondsSHH33() {
        SHHsecondsSHH33 = 0;
        SHHsecSHH33 = 0;
        SHHminutesSHH33 = 0;
        SHHhoursSHH33 = 0;

        SHHbtnTimerSHH33 .setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        String timeString33 = String.format("%02d:%02d", SHHhoursSHH33, SHHminutesSHH33);
        SHHbtnTimerSHH33.setText(timeString33);
    }





    private void resetButtonColor101() {
        SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor102() {
        SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor103() {
        SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor104() {
        SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor105() {
        SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor106() {
        SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor107() {
        SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor8() {
        SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor9() {
        SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor10() {
        SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor11() {
        SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor12() {
        SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor13() {
        SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor14() {
        SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor15() {
        SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor16() {
        SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor17() {
        SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor18() {
        SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor19() {
        SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor20() {
        SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor21() {
        SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor22() {
        SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor23() {
        SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor24() {
        SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor25() {
        SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor26() {
        SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor27() {
        SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor28() {
        SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor29() {
        SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor30() {
        SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor31() {
        SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor32() {
        SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor33() {
        SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.white));
    }






    private void SHHshowConfirmationDialogYNForButtonSHH101() {
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
                resetSHHsecondsSHH101();
                resetButtonColor101();
                SHHbtnTimerSHH101.clearAnimation();
                SHHflashingSHH101 = false;
                SHHflashinggSHH101 = false;
                SHHisTimerRunningSHH101 = false;
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
                SHHpeopleSHH_101 = true;
                SHHisTimerRunningSHH101 = true;
                SHHstartTimeSHH101r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH01 = Calendar.getInstance();
                SHHcurrentHourSHH101 = currentTime1SHH01.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH101 = currentTime1SHH01.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_101 = false;
                SHHisTimerRunningSHH101 = true;
                SHHstartTimeSHH101r();
                SHHflashingSHH101 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH101 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH101 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH102() {
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
                resetSHHsecondsSHH102();
                resetButtonColor102();
                SHHbtnTimerSHH102.clearAnimation();
                SHHflashingSHH102 = false;
                SHHflashinggSHH102 = false;
                SHHisTimerRunningSHH102 = false;
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
                SHHpeopleSHH_102 = true;
                SHHisTimerRunningSHH102 = true;
                SHHstartTimeSHH102r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH02 = Calendar.getInstance();
                SHHcurrentHourSHH102 = currentTime1SHH02.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH102 = currentTime1SHH02.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_102 = false;
                SHHisTimerRunningSHH102 = true;
                SHHstartTimeSHH102r();
                SHHflashingSHH102 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH102 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH102 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH103() {
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
                resetSHHsecondsSHH103();
                resetButtonColor103();
                SHHbtnTimerSHH103.clearAnimation();
                SHHflashingSHH103 = false;
                SHHflashinggSHH103 = false;
                SHHisTimerRunningSHH103 = false;
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
                SHHpeopleSHH_103 = true;
                SHHisTimerRunningSHH103 = true;
                SHHstartTimeSHH103r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH03 = Calendar.getInstance();
                SHHcurrentHourSHH103 = currentTime1SHH03.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH103 = currentTime1SHH03.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_103 = false;
                SHHisTimerRunningSHH103 = true;
                SHHstartTimeSHH103r();
                SHHflashingSHH103 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH103 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH103 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH104() {
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
                resetSHHsecondsSHH104();
                resetButtonColor104();
                SHHbtnTimerSHH104.clearAnimation();
                SHHflashingSHH104 = false;
                SHHflashinggSHH104 = false;
                SHHisTimerRunningSHH104 = false;
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
                SHHpeopleSHH_104 = true;
                SHHisTimerRunningSHH104 = true;
                SHHstartTimeSHH104r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH04 = Calendar.getInstance();
                SHHcurrentHourSHH104 = currentTime1SHH04.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH104 = currentTime1SHH04.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_104 = false;
                SHHisTimerRunningSHH104 = true;
                SHHstartTimeSHH104r();
                SHHflashingSHH104 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH104 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH104 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH105() {
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
                resetSHHsecondsSHH105();
                resetButtonColor105();
                SHHbtnTimerSHH105.clearAnimation();
                SHHflashingSHH105 = false;
                SHHflashinggSHH105 = false;
                SHHisTimerRunningSHH105 = false;
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
                SHHpeopleSHH_105 = true;
                SHHisTimerRunningSHH105 = true;
                SHHstartTimeSHH105r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH05 = Calendar.getInstance();
                SHHcurrentHourSHH105 = currentTime1SHH05.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH105 = currentTime1SHH05.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_105 = false;
                SHHisTimerRunningSHH105 = true;
                SHHstartTimeSHH105r();
                SHHflashingSHH105 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH105 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH105 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH106() {
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
                resetSHHsecondsSHH106();
                resetButtonColor106();
                SHHbtnTimerSHH106.clearAnimation();
                SHHflashingSHH106 = false;
                SHHflashinggSHH106 = false;
                SHHisTimerRunningSHH106 = false;
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
                SHHpeopleSHH_106 = true;
                SHHisTimerRunningSHH106 = true;
                SHHstartTimeSHH106r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH06 = Calendar.getInstance();
                SHHcurrentHourSHH106 = currentTime1SHH06.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH106 = currentTime1SHH06.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_106 = false;
                SHHisTimerRunningSHH106 = true;
                SHHstartTimeSHH106r();
                SHHflashingSHH106 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH106 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH106 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH107() {
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
                resetSHHsecondsSHH107();
                resetButtonColor107();
                SHHbtnTimerSHH107.clearAnimation();
                SHHflashingSHH107 = false;
                SHHflashinggSHH107 = false;
                SHHisTimerRunningSHH107 = false;
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
                SHHpeopleSHH_107 = true;
                SHHisTimerRunningSHH107 = true;
                SHHstartTimeSHH107r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH07 = Calendar.getInstance();
                SHHcurrentHourSHH107 = currentTime1SHH07.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH107 = currentTime1SHH07.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_107 = false;
                SHHisTimerRunningSHH107 = true;
                SHHstartTimeSHH107r();
                SHHflashingSHH107 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH107 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH107 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH8() {
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
                resetSHHsecondsSHH8();
                resetButtonColor8();
                SHHbtnTimerSHH8.clearAnimation();
                SHHflashingSHH8 = false;
                SHHflashinggSHH8 = false;
                SHHisTimerRunningSHH8 = false;
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
                SHHpeopleSHH_8 = true;
                SHHisTimerRunningSHH8 = true;
                SHHstartTimeSHH8r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime8 = Calendar.getInstance();
                SHHcurrentHourSHH8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_8 = false;
                SHHisTimerRunningSHH8 = true;
                SHHstartTimeSHH8r();
                SHHflashingSHH8 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH8 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH8 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH9() {
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
                resetSHHsecondsSHH9();
                resetButtonColor9();
                SHHbtnTimerSHH9.clearAnimation();
                SHHflashingSHH9 = false;
                SHHflashinggSHH9 = false;
                SHHisTimerRunningSHH9 = false;
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
                SHHpeopleSHH_9 = true;
                SHHisTimerRunningSHH9 = true;
                SHHstartTimeSHH9r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime9 = Calendar.getInstance();
                SHHcurrentHourSHH9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_9 = false;
                SHHisTimerRunningSHH9 = true;
                SHHstartTimeSHH9r();
                SHHflashingSHH9 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH9 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH9 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH10() {
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
                resetSHHsecondsSHH10();
                resetButtonColor10();
                SHHbtnTimerSHH10.clearAnimation();
                SHHflashingSHH10 = false;
                SHHflashinggSHH10 = false;
                SHHisTimerRunningSHH10 = false;
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
                SHHpeopleSHH_10 = true;
                SHHisTimerRunningSHH10 = true;
                SHHstartTimeSHH10r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH0 = Calendar.getInstance();
                SHHcurrentHourSHH10 = currentTime1SHH0.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH10 = currentTime1SHH0.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_10 = false;
                SHHisTimerRunningSHH10 = true;
                SHHstartTimeSHH10r();
                SHHflashingSHH10 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH10 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH10 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH11() {
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
                resetSHHsecondsSHH11();
                resetButtonColor11();
                SHHbtnTimerSHH11.clearAnimation();
                SHHflashingSHH11 = false;
                SHHflashinggSHH11 = false;
                SHHisTimerRunningSHH11 = false;
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
                SHHpeopleSHH_11 = true;
                SHHisTimerRunningSHH11 = true;
                SHHstartTimeSHH11r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH1 = Calendar.getInstance();
                SHHcurrentHourSHH11 = currentTime1SHH1.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH11 = currentTime1SHH1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_11 = false;
                SHHisTimerRunningSHH11 = true;
                SHHstartTimeSHH11r();
                SHHflashingSHH11 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH11 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH11 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH12() {
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
                resetSHHsecondsSHH12();
                resetButtonColor12();
                SHHbtnTimerSHH12.clearAnimation();
                SHHflashingSHH12 = false;
                SHHflashinggSHH12 = false;
                SHHisTimerRunningSHH12 = false;
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
                SHHpeopleSHH_12 = true;
                SHHisTimerRunningSHH12 = true;
                SHHstartTimeSHH12r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH2 = Calendar.getInstance();
                SHHcurrentHourSHH12 = currentTime1SHH2.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH12 = currentTime1SHH2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_12 = false;
                SHHisTimerRunningSHH12 = true;
                SHHstartTimeSHH12r();
                SHHflashingSHH12 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH12 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH12 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH13() {
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
                resetSHHsecondsSHH13();
                resetButtonColor13();
                SHHbtnTimerSHH13.clearAnimation();
                SHHflashingSHH13 = false;
                SHHflashinggSHH13 = false;
                SHHisTimerRunningSHH13 = false;
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
                SHHpeopleSHH_13 = true;
                SHHisTimerRunningSHH13 = true;
                SHHstartTimeSHH13r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH3 = Calendar.getInstance();
                SHHcurrentHourSHH13 = currentTime1SHH3.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH13 = currentTime1SHH3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_13 = false;
                SHHisTimerRunningSHH13 = true;
                SHHstartTimeSHH13r();
                SHHflashingSHH13 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH13 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH13 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH14() {
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
                resetSHHsecondsSHH14();
                resetButtonColor14();
                SHHbtnTimerSHH14.clearAnimation();
                SHHflashingSHH14 = false;
                SHHflashinggSHH14 = false;
                SHHisTimerRunningSHH14 = false;
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
                SHHpeopleSHH_14 = true;
                SHHisTimerRunningSHH14 = true;
                SHHstartTimeSHH14r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH4 = Calendar.getInstance();
                SHHcurrentHourSHH14 = currentTime1SHH4.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH14 = currentTime1SHH4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_14 = false;
                SHHisTimerRunningSHH14 = true;
                SHHstartTimeSHH14r();
                SHHflashingSHH14 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH14 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH14 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH15() {
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
                resetSHHsecondsSHH15();
                resetButtonColor15();
                SHHbtnTimerSHH15.clearAnimation();
                SHHflashingSHH15 = false;
                SHHflashinggSHH15 = false;
                SHHisTimerRunningSHH15 = false;
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
                SHHpeopleSHH_15 = true;
                SHHisTimerRunningSHH15 = true;
                SHHstartTimeSHH15r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH5 = Calendar.getInstance();
                SHHcurrentHourSHH15 = currentTime1SHH5.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH15 = currentTime1SHH5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_15 = false;
                SHHisTimerRunningSHH15 = true;
                SHHstartTimeSHH15r();
                SHHflashingSHH15 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH15 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH15 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH16() {
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
                resetSHHsecondsSHH16();
                resetButtonColor16();
                SHHbtnTimerSHH16.clearAnimation();
                SHHflashingSHH16 = false;
                SHHflashinggSHH16 = false;
                SHHisTimerRunningSHH16 = false;
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
                SHHpeopleSHH_16 = true;
                SHHisTimerRunningSHH16 = true;
                SHHstartTimeSHH16r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH6 = Calendar.getInstance();
                SHHcurrentHourSHH16 = currentTime1SHH6.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH16 = currentTime1SHH6.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_16 = false;
                SHHisTimerRunningSHH16 = true;
                SHHstartTimeSHH16r();
                SHHflashingSHH16 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH16 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH16 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH17() {
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
                resetSHHsecondsSHH17();
                resetButtonColor17();
                SHHbtnTimerSHH17.clearAnimation();
                SHHflashingSHH17 = false;
                SHHflashinggSHH17 = false;
                SHHisTimerRunningSHH17 = false;
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
                SHHpeopleSHH_17 = true;
                SHHisTimerRunningSHH17 = true;
                SHHstartTimeSHH17r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH7 = Calendar.getInstance();
                SHHcurrentHourSHH17 = currentTime1SHH7.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH17 = currentTime1SHH7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_17 = false;
                SHHisTimerRunningSHH17 = true;
                SHHstartTimeSHH17r();
                SHHflashingSHH17 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH17 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH17 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH18() {
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
                resetSHHsecondsSHH18();
                resetButtonColor18();
                SHHbtnTimerSHH18.clearAnimation();
                SHHflashingSHH18 = false;
                SHHflashinggSHH18 = false;
                SHHisTimerRunningSHH18 = false;
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
                SHHpeopleSHH_18 = true;
                SHHisTimerRunningSHH18 = true;
                SHHstartTimeSHH18r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH8 = Calendar.getInstance();
                SHHcurrentHourSHH18 = currentTime1SHH8.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH18 = currentTime1SHH8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_18 = false;
                SHHisTimerRunningSHH18 = true;
                SHHstartTimeSHH18r();
                SHHflashingSHH18 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH18 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH18 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH19() {
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
                resetSHHsecondsSHH19();
                resetButtonColor19();
                SHHbtnTimerSHH19.clearAnimation();
                SHHflashingSHH19 = false;
                SHHflashinggSHH19 = false;
                SHHisTimerRunningSHH19 = false;
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
                SHHpeopleSHH_19 = true;
                SHHisTimerRunningSHH19 = true;
                SHHstartTimeSHH19r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1SHH9 = Calendar.getInstance();
                SHHcurrentHourSHH19 = currentTime1SHH9.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH19 = currentTime1SHH9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_19 = false;
                SHHisTimerRunningSHH19 = true;
                SHHstartTimeSHH19r();
                SHHflashingSHH19 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH19 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH19 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH20() {
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
                resetSHHsecondsSHH20();
                resetButtonColor20();
                SHHbtnTimerSHH20.clearAnimation();
                SHHflashingSHH20 = false;
                SHHflashinggSHH20 = false;
                SHHisTimerRunningSHH20 = false;
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
                SHHpeopleSHH_20 = true;
                SHHisTimerRunningSHH20 = true;
                SHHstartTimeSHH20r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH0 = Calendar.getInstance();
                SHHcurrentHourSHH20 = currentTime2SHH0.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH20 = currentTime2SHH0.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_20 = false;
                SHHisTimerRunningSHH20 = true;
                SHHstartTimeSHH20r();
                SHHflashingSHH20 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH20 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH20 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH21() {
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
                resetSHHsecondsSHH21();
                resetButtonColor21();
                SHHbtnTimerSHH21.clearAnimation();
                SHHflashingSHH21 = false;
                SHHflashinggSHH21 = false;
                SHHisTimerRunningSHH21 = false;
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
                SHHpeopleSHH_21 = true;
                SHHisTimerRunningSHH21 = true;
                SHHstartTimeSHH21r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH1 = Calendar.getInstance();
                SHHcurrentHourSHH21 = currentTime2SHH1.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH21 = currentTime2SHH1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_21 = false;
                SHHisTimerRunningSHH21 = true;
                SHHstartTimeSHH21r();
                SHHflashingSHH21 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH21 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH21 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH22() {
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
                resetSHHsecondsSHH22();
                resetButtonColor22();
                SHHbtnTimerSHH22.clearAnimation();
                SHHflashingSHH22 = false;
                SHHflashinggSHH22 = false;
                SHHisTimerRunningSHH22 = false;
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
                SHHpeopleSHH_22 = true;
                SHHisTimerRunningSHH22 = true;
                SHHstartTimeSHH22r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH2 = Calendar.getInstance();
                SHHcurrentHourSHH22 = currentTime2SHH2.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH22 = currentTime2SHH2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_22 = false;
                SHHisTimerRunningSHH22 = true;
                SHHstartTimeSHH22r();
                SHHflashingSHH22 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH22 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH22 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH23() {
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
                resetSHHsecondsSHH23();
                resetButtonColor23();
                SHHbtnTimerSHH23.clearAnimation();
                SHHflashingSHH23 = false;
                SHHflashinggSHH23 = false;
                SHHisTimerRunningSHH23 = false;
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
                SHHpeopleSHH_23 = true;
                SHHisTimerRunningSHH23 = true;
                SHHstartTimeSHH23r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH3 = Calendar.getInstance();
                SHHcurrentHourSHH23 = currentTime2SHH3.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH23 = currentTime2SHH3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_23 = false;
                SHHisTimerRunningSHH23 = true;
                SHHstartTimeSHH23r();
                SHHflashingSHH23 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH23 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH23 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH24() {
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
                resetSHHsecondsSHH24();
                resetButtonColor24();
                SHHbtnTimerSHH24.clearAnimation();
                SHHflashingSHH24 = false;
                SHHflashinggSHH24 = false;
                SHHisTimerRunningSHH24 = false;
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
                SHHpeopleSHH_24 = true;
                SHHisTimerRunningSHH24 = true;
                SHHstartTimeSHH24r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH4 = Calendar.getInstance();
                SHHcurrentHourSHH24 = currentTime2SHH4.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH24 = currentTime2SHH4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_24 = false;
                SHHisTimerRunningSHH24 = true;
                SHHstartTimeSHH24r();
                SHHflashingSHH24 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH24 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH24 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH25() {
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
                resetSHHsecondsSHH25();
                resetButtonColor25();
                SHHbtnTimerSHH25.clearAnimation();
                SHHflashingSHH25 = false;
                SHHflashinggSHH25 = false;
                SHHisTimerRunningSHH25 = false;
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
                SHHpeopleSHH_25 = true;
                SHHisTimerRunningSHH25 = true;
                SHHstartTimeSHH25r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH5 = Calendar.getInstance();
                SHHcurrentHourSHH25 = currentTime2SHH5.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH25 = currentTime2SHH5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_25 = false;
                SHHisTimerRunningSHH25 = true;
                SHHstartTimeSHH25r();
                SHHflashingSHH25 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH25 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH25 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH26() {
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
                resetSHHsecondsSHH26();
                resetButtonColor26();
                SHHbtnTimerSHH26.clearAnimation();
                SHHflashingSHH26 = false;
                SHHflashinggSHH26 = false;
                SHHisTimerRunningSHH26 = false;
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
                SHHpeopleSHH_26 = true;
                SHHisTimerRunningSHH26 = true;
                SHHstartTimeSHH26r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH6 = Calendar.getInstance();
                SHHcurrentHourSHH26 = currentTime2SHH6.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH26 = currentTime2SHH6.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_26 = false;
                SHHisTimerRunningSHH26 = true;
                SHHstartTimeSHH26r();
                SHHflashingSHH26 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH26 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH26 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH27() {
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
                resetSHHsecondsSHH27();
                resetButtonColor27();
                SHHbtnTimerSHH27.clearAnimation();
                SHHflashingSHH27 = false;
                SHHflashinggSHH27 = false;
                SHHisTimerRunningSHH27 = false;
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
                SHHpeopleSHH_27 = true;
                SHHisTimerRunningSHH27 = true;
                SHHstartTimeSHH27r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH7 = Calendar.getInstance();
                SHHcurrentHourSHH27 = currentTime2SHH7.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH27 = currentTime2SHH7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_27 = false;
                SHHisTimerRunningSHH27 = true;
                SHHstartTimeSHH27r();
                SHHflashingSHH27 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH27 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH27 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH28() {
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
                resetSHHsecondsSHH28();
                resetButtonColor28();
                SHHbtnTimerSHH28.clearAnimation();
                SHHflashingSHH28 = false;
                SHHflashinggSHH28 = false;
                SHHisTimerRunningSHH28 = false;
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
                SHHpeopleSHH_28 = true;
                SHHisTimerRunningSHH28 = true;
                SHHstartTimeSHH28r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH8 = Calendar.getInstance();
                SHHcurrentHourSHH28 = currentTime2SHH8.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH28 = currentTime2SHH8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_28 = false;
                SHHisTimerRunningSHH28 = true;
                SHHstartTimeSHH28r();
                SHHflashingSHH28 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH28 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH28 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH29() {
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
                resetSHHsecondsSHH29();
                resetButtonColor29();
                SHHbtnTimerSHH29.clearAnimation();
                SHHflashingSHH29 = false;
                SHHflashinggSHH29 = false;
                SHHisTimerRunningSHH29 = false;
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
                SHHpeopleSHH_29 = true;
                SHHisTimerRunningSHH29 = true;
                SHHstartTimeSHH29r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime2SHH9 = Calendar.getInstance();
                SHHcurrentHourSHH29 = currentTime2SHH9.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH29 = currentTime2SHH9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_29 = false;
                SHHisTimerRunningSHH29 = true;
                SHHstartTimeSHH29r();
                SHHflashingSHH29 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH29 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH29 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH30() {
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
                resetSHHsecondsSHH30();
                resetButtonColor30();
                SHHbtnTimerSHH30.clearAnimation();
                SHHflashingSHH30 = false;
                SHHflashinggSHH30 = false;
                SHHisTimerRunningSHH30 = false;
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
                SHHpeopleSHH_30 = true;
                SHHisTimerRunningSHH30 = true;
                SHHstartTimeSHH30r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime30 = Calendar.getInstance();
                SHHcurrentHourSHH30 = currentTime30.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH30 = currentTime30.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_30 = false;
                SHHisTimerRunningSHH30 = true;
                SHHstartTimeSHH30r();
                SHHflashingSHH30 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH30 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH30 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH31() {
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
                resetSHHsecondsSHH31();
                resetButtonColor31();
                SHHbtnTimerSHH31.clearAnimation();
                SHHflashingSHH31 = false;
                SHHflashinggSHH31 = false;
                SHHisTimerRunningSHH31 = false;
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
                SHHpeopleSHH_31 = true;
                SHHisTimerRunningSHH31 = true;
                SHHstartTimeSHH31r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime31 = Calendar.getInstance();
                SHHcurrentHourSHH31 = currentTime31.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH31 = currentTime31.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_31 = false;
                SHHisTimerRunningSHH31 = true;
                SHHstartTimeSHH31r();
                SHHflashingSHH31 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH31 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH31 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH32() {
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
                resetSHHsecondsSHH32();
                resetButtonColor32();
                SHHbtnTimerSHH32.clearAnimation();
                SHHflashingSHH32 = false;
                SHHflashinggSHH32 = false;
                SHHisTimerRunningSHH32 = false;
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
                SHHpeopleSHH_32 = true;
                SHHisTimerRunningSHH32 = true;
                SHHstartTimeSHH32r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime32 = Calendar.getInstance();
                SHHcurrentHourSHH32 = currentTime32.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH32 = currentTime32.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_32 = false;
                SHHisTimerRunningSHH32 = true;
                SHHstartTimeSHH32r();
                SHHflashingSHH32 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH32 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH32 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void SHHshowConfirmationDialogYNForButtonSHH33() {
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
                resetSHHsecondsSHH33();
                resetButtonColor33();
                SHHbtnTimerSHH33.clearAnimation();
                SHHflashingSHH33 = false;
                SHHflashinggSHH33 = false;
                SHHisTimerRunningSHH33 = false;
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
                SHHpeopleSHH_33 = true;
                SHHisTimerRunningSHH33 = true;
                SHHstartTimeSHH33r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime33 = Calendar.getInstance();
                SHHcurrentHourSHH33 = currentTime33.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH33 = currentTime33.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHHpeopleSHH_33 = false;
                SHHisTimerRunningSHH33 = true;
                SHHstartTimeSHH33r();
                SHHflashingSHH33 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                SHHcurrentHourSHH33 = currentTime.get(Calendar.HOUR_OF_DAY);
                SHHcurrentMinuteSHH33 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }






    private void SHHstartTimeSHH101r() {
        SHHstartTimeSHH101 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH101, 0);
    }

    private void SHHstartTimeSHH102r() {
        SHHstartTimeSHH102 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH102, 0);
    }

    private void SHHstartTimeSHH103r() {
        SHHstartTimeSHH103 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH103, 0);
    }

    private void SHHstartTimeSHH104r() {
        SHHstartTimeSHH104 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH104, 0);
    }

    private void SHHstartTimeSHH105r() {
        SHHstartTimeSHH105 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH105, 0);
    }

    private void SHHstartTimeSHH106r() {
        SHHstartTimeSHH106 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH106, 0);
    }

    private void SHHstartTimeSHH107r() {
        SHHstartTimeSHH107 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH107, 0);
    }

    private void SHHstartTimeSHH8r() {
        SHHstartTimeSHH8 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH8, 0);
    }

    private void SHHstartTimeSHH9r() {
        SHHstartTimeSHH9 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH9, 0);
    }

    private void SHHstartTimeSHH10r() {
        SHHstartTimeSHH10 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH10, 0);
    }

    private void SHHstartTimeSHH11r() {
        SHHstartTimeSHH11 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH11, 0);
    }

    private void SHHstartTimeSHH12r() {
        SHHstartTimeSHH12 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH12, 0);
    }

    private void SHHstartTimeSHH13r() {
        SHHstartTimeSHH13 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH13, 0);
    }

    private void SHHstartTimeSHH14r() {
        SHHstartTimeSHH14 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH14, 0);
    }

    private void SHHstartTimeSHH15r() {
        SHHstartTimeSHH15 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH15, 0);
    }

    private void SHHstartTimeSHH16r() {
        SHHstartTimeSHH16 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH16, 0);
    }

    private void SHHstartTimeSHH17r() {
        SHHstartTimeSHH17 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH17, 0);
    }

    private void SHHstartTimeSHH18r() {
        SHHstartTimeSHH18 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH18, 0);
    }

    private void SHHstartTimeSHH19r() {
        SHHstartTimeSHH19 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH19, 0);
    }

    private void SHHstartTimeSHH20r() {
        SHHstartTimeSHH20 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH20, 0);
    }
    private void SHHstartTimeSHH21r() {
        SHHstartTimeSHH21 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH21, 0);
    }

    private void SHHstartTimeSHH22r() {
        SHHstartTimeSHH22 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH22, 0);
    }

    private void SHHstartTimeSHH23r() {
        SHHstartTimeSHH23 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH23, 0);
    }

    private void SHHstartTimeSHH24r() {
        SHHstartTimeSHH24 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH24, 0);
    }

    private void SHHstartTimeSHH25r() {
        SHHstartTimeSHH25 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH25, 0);
    }

    private void SHHstartTimeSHH26r() {
        SHHstartTimeSHH26 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH26, 0);
    }

    private void SHHstartTimeSHH27r() {
        SHHstartTimeSHH27 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH27, 0);
    }

    private void SHHstartTimeSHH28r() {
        SHHstartTimeSHH28 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH28, 0);
    }

    private void SHHstartTimeSHH29r() {
        SHHstartTimeSHH29 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH29, 0);
    }

    private void SHHstartTimeSHH30r() {
        SHHstartTimeSHH30 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH30, 0);
    }

    private void SHHstartTimeSHH31r() {
        SHHstartTimeSHH31 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH31, 0);
    }

    private void SHHstartTimeSHH32r() {
        SHHstartTimeSHH32 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH32, 0);
    }

    private void SHHstartTimeSHH33r() {
        SHHstartTimeSHH33 = SystemClock.uptimeMillis();
        SHHhandlerSHH.postDelayed(SHHupdateTimerThreadSHH33, 0);
    }







    private void resetThresholdsToOriginal101() {
        SHHyellowThresholdSHH101 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH101 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH101 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal102() {
        SHHyellowThresholdSHH102 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH102 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH102 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal103() {
        SHHyellowThresholdSHH103 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH103 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH103 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal104() {
        SHHyellowThresholdSHH104 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH104 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH104 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal105() {
        SHHyellowThresholdSHH105 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH105 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH105 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal106() {
        SHHyellowThresholdSHH106 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH106 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH106 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal107() {
        SHHyellowThresholdSHH107 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH107 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH107 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal8() {
        SHHyellowThresholdSHH8 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH8 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH8 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal9() {
        SHHyellowThresholdSHH9 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH9 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH9 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal10() {
        SHHyellowThresholdSHH10 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH10 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH10 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal11() {
        SHHyellowThresholdSHH11 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH11 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH11 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal12() {
        SHHyellowThresholdSHH12 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH12 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH12 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal13() {
        SHHyellowThresholdSHH13 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH13 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH13 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal14() {
        SHHyellowThresholdSHH14 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH14 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH14 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal15() {
        SHHyellowThresholdSHH15 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH15 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH15 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal16() {
        SHHyellowThresholdSHH16 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH16 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH16 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal17() {
        SHHyellowThresholdSHH17 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH17 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH17 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal18() {
        SHHyellowThresholdSHH18 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH18 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH18 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal19() {
        SHHyellowThresholdSHH19 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH19 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH19 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal20() {
        SHHyellowThresholdSHH20 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH20 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH20 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal21() {
        SHHyellowThresholdSHH21 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH21 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH21 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal22() {
        SHHyellowThresholdSHH22 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH22 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH22 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal23() {
        SHHyellowThresholdSHH23 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH23 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH23 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal24() {
        SHHyellowThresholdSHH24 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH24 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH24 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal25() {
        SHHyellowThresholdSHH25 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH25 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH25 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal26() {
        SHHyellowThresholdSHH26 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH26 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH26 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal27() {
        SHHyellowThresholdSHH27 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH27 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH27 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal28() {
        SHHyellowThresholdSHH28 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH28 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH28 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal29() {
        SHHyellowThresholdSHH29 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH29 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH29 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal30() {
        SHHyellowThresholdSHH30 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH30 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH30 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal31() {
        SHHyellowThresholdSHH31 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH31 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH31 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal32() {
        SHHyellowThresholdSHH32 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH32 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH32 = originalSHHblueThresholdSHH2;
    }

    private void resetThresholdsToOriginal33() {
        SHHyellowThresholdSHH33 = originalSHHyellowThresholdSHH2;
        SHHredThresholdSHH33 = originalSHHredThresholdSHH2;
        SHHblueThresholdSHH33 = originalSHHblueThresholdSHH2;
    }





    private int Thousand = 1000;
    private int Thirty = 30;
    private int Sixty = 60;
    private int ThreeThousandSix = 3600;
    private int TwentyFour = 24;
    private int Eleven = 11;
    private int Five = 5;
    private int Twenty = 16;
    private Runnable SHHupdateTimerThreadSHH101 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH101 = SystemClock.uptimeMillis() - SHHstartTimeSHH101;
            SHHupdatedTimeSHH101 = SHHtimeInMilliSHHsecondsSHH101;
            SHHsecondsSHH101 = (int) (SHHupdatedTimeSHH101 / Thousand);
            SHHminutesSHH101 = SHHsecondsSHH101 / Sixty;
            SHHhoursSHH101 = SHHminutesSHH101 / Sixty;
            SHHsecondsSHH101 = SHHsecondsSHH101 % Sixty;
            SHHminutesSHH101 = SHHminutesSHH101 % Sixty;
            SHHsecSHH101 = SHHhoursSHH101 * ThreeThousandSix + SHHminutesSHH101 * Sixty + SHHsecondsSHH101;

            // 计算当前时间加上 SHHredThresholdSHH101 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH101 * ThreeThousandSix + SHHcurrentMinuteSHH101 * Sixty + SHHredThresholdSHH101;
            // 计算小时和分钟
            SHHfutureHourSHH101 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH101 = (totalSeconds % ThreeThousandSix) / Sixty;
            // 处理超过102104小时的进位
            if (SHHfutureHourSHH101 >= TwentyFour) {
                SHHfutureHourSHH101 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH101, SHHcurrentMinuteSHH101);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH101, SHHfutureMinuteSHH101);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共有101101個字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH101.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH101.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH101.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH101();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH102 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH102 = SystemClock.uptimeMillis() - SHHstartTimeSHH102;
            SHHupdatedTimeSHH102 = SHHtimeInMilliSHHsecondsSHH102;
            SHHsecondsSHH102 = (int) (SHHupdatedTimeSHH102 / Thousand);
            SHHminutesSHH102 = SHHsecondsSHH102 / Sixty;
            SHHhoursSHH102 = SHHminutesSHH102 / Sixty;
            SHHsecondsSHH102 = SHHsecondsSHH102 % Sixty;
            SHHminutesSHH102 = SHHminutesSHH102 % Sixty;
            SHHsecSHH102 = SHHhoursSHH102 * ThreeThousandSix + SHHminutesSHH102 * Sixty + SHHsecondsSHH102;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH102 * ThreeThousandSix + SHHcurrentMinuteSHH102 * Sixty + SHHredThresholdSHH102;
            // 计算小时和分钟
            SHHfutureHourSHH102 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH102 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH102 >= TwentyFour) {
                SHHfutureHourSHH102 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH102, SHHcurrentMinuteSHH102);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH102, SHHfutureMinuteSHH102);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH102.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH102.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH102.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH102();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH103 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH103 = SystemClock.uptimeMillis() - SHHstartTimeSHH103;
            SHHupdatedTimeSHH103 = SHHtimeInMilliSHHsecondsSHH103;
            SHHsecondsSHH103 = (int) (SHHupdatedTimeSHH103 / Thousand);
            SHHminutesSHH103 = SHHsecondsSHH103 / Sixty;
            SHHhoursSHH103 = SHHminutesSHH103 / Sixty;
            SHHsecondsSHH103 = SHHsecondsSHH103 % Sixty;
            SHHminutesSHH103 = SHHminutesSHH103 % Sixty;
            SHHsecSHH103 = SHHhoursSHH103 * ThreeThousandSix + SHHminutesSHH103 * Sixty + SHHsecondsSHH103;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH103 * ThreeThousandSix + SHHcurrentMinuteSHH103 * Sixty + SHHredThresholdSHH103;
            // 计算小时和分钟
            SHHfutureHourSHH103 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH103 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH103 >= TwentyFour) {
                SHHfutureHourSHH103 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH103, SHHcurrentMinuteSHH103);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH103, SHHfutureMinuteSHH103);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH103.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH103.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH103.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH103();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH104 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH104 = SystemClock.uptimeMillis() - SHHstartTimeSHH104;
            SHHupdatedTimeSHH104 = SHHtimeInMilliSHHsecondsSHH104;
            SHHsecondsSHH104 = (int) (SHHupdatedTimeSHH104 / Thousand);
            SHHminutesSHH104 = SHHsecondsSHH104 / Sixty;
            SHHhoursSHH104 = SHHminutesSHH104 / Sixty;
            SHHsecondsSHH104 = SHHsecondsSHH104 % Sixty;
            SHHminutesSHH104 = SHHminutesSHH104 % Sixty;
            SHHsecSHH104 = SHHhoursSHH104 * ThreeThousandSix + SHHminutesSHH104 * Sixty + SHHsecondsSHH104;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH104 * ThreeThousandSix + SHHcurrentMinuteSHH104 * Sixty + SHHredThresholdSHH104;
            // 计算小时和分钟
            SHHfutureHourSHH104 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH104 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH104 >= TwentyFour) {
                SHHfutureHourSHH104 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH104, SHHcurrentMinuteSHH104);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH104, SHHfutureMinuteSHH104);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH104.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH104.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH104.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH104();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH105 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH105 = SystemClock.uptimeMillis() - SHHstartTimeSHH105;
            SHHupdatedTimeSHH105 = SHHtimeInMilliSHHsecondsSHH105;
            SHHsecondsSHH105 = (int) (SHHupdatedTimeSHH105 / Thousand);
            SHHminutesSHH105 = SHHsecondsSHH105 / Sixty;
            SHHhoursSHH105 = SHHminutesSHH105 / Sixty;
            SHHsecondsSHH105 = SHHsecondsSHH105 % Sixty;
            SHHminutesSHH105 = SHHminutesSHH105 % Sixty;
            SHHsecSHH105 = SHHhoursSHH105 * ThreeThousandSix + SHHminutesSHH105 * Sixty + SHHsecondsSHH105;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH105 * ThreeThousandSix + SHHcurrentMinuteSHH105 * Sixty + SHHredThresholdSHH105;
            // 计算小时和分钟
            SHHfutureHourSHH105 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH105 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH105 >= TwentyFour) {
                SHHfutureHourSHH105 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH105, SHHcurrentMinuteSHH105);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH105, SHHfutureMinuteSHH105);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH105.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH105.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH105.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH105();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH106 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH106 = SystemClock.uptimeMillis() - SHHstartTimeSHH106;
            SHHupdatedTimeSHH106 = SHHtimeInMilliSHHsecondsSHH106;
            SHHsecondsSHH106 = (int) (SHHupdatedTimeSHH106 / Thousand);
            SHHminutesSHH106 = SHHsecondsSHH106 / Sixty;
            SHHhoursSHH106 = SHHminutesSHH106 / Sixty;
            SHHsecondsSHH106 = SHHsecondsSHH106 % Sixty;
            SHHminutesSHH106 = SHHminutesSHH106 % Sixty;
            SHHsecSHH106 = SHHhoursSHH106 * ThreeThousandSix + SHHminutesSHH106 * Sixty + SHHsecondsSHH106;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH106 * ThreeThousandSix + SHHcurrentMinuteSHH106 * Sixty + SHHredThresholdSHH106;
            // 计算小时和分钟
            SHHfutureHourSHH106 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH106 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH106 >= TwentyFour) {
                SHHfutureHourSHH106 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH106, SHHcurrentMinuteSHH106);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH106, SHHfutureMinuteSHH106);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH106.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH106.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH106.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH106();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH107 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH107 = SystemClock.uptimeMillis() - SHHstartTimeSHH107;
            SHHupdatedTimeSHH107 = SHHtimeInMilliSHHsecondsSHH107;
            SHHsecondsSHH107 = (int) (SHHupdatedTimeSHH107 / Thousand);
            SHHminutesSHH107 = SHHsecondsSHH107 / Sixty;
            SHHhoursSHH107 = SHHminutesSHH107 / Sixty;
            SHHsecondsSHH107 = SHHsecondsSHH107 % Sixty;
            SHHminutesSHH107 = SHHminutesSHH107 % Sixty;
            SHHsecSHH107 = SHHhoursSHH107 * ThreeThousandSix + SHHminutesSHH107 * Sixty + SHHsecondsSHH107;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH107 * ThreeThousandSix + SHHcurrentMinuteSHH107 * Sixty + SHHredThresholdSHH107;
            // 计算小时和分钟
            SHHfutureHourSHH107 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH107 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH107 >= TwentyFour) {
                SHHfutureHourSHH107 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH107, SHHcurrentMinuteSHH107);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH107, SHHfutureMinuteSHH107);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH107.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH107.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH107.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH107();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH8 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH8 = SystemClock.uptimeMillis() - SHHstartTimeSHH8;
            SHHupdatedTimeSHH8 = SHHtimeInMilliSHHsecondsSHH8;
            SHHsecondsSHH8 = (int) (SHHupdatedTimeSHH8 / Thousand);
            SHHminutesSHH8 = SHHsecondsSHH8 / Sixty;
            SHHhoursSHH8 = SHHminutesSHH8 / Sixty;
            SHHsecondsSHH8 = SHHsecondsSHH8 % Sixty;
            SHHminutesSHH8 = SHHminutesSHH8 % Sixty;
            SHHsecSHH8 = SHHhoursSHH8 * ThreeThousandSix + SHHminutesSHH8 * Sixty + SHHsecondsSHH8;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH8 * ThreeThousandSix + SHHcurrentMinuteSHH8 * Sixty + SHHredThresholdSHH8;
            // 计算小时和分钟
            SHHfutureHourSHH8 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH8 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH8 >= TwentyFour) {
                SHHfutureHourSHH8 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH8, SHHcurrentMinuteSHH8);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH8, SHHfutureMinuteSHH8);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH8.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH8.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH8();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH9 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH9 = SystemClock.uptimeMillis() - SHHstartTimeSHH9;
            SHHupdatedTimeSHH9 = SHHtimeInMilliSHHsecondsSHH9;
            SHHsecondsSHH9 = (int) (SHHupdatedTimeSHH9 / Thousand);
            SHHminutesSHH9 = SHHsecondsSHH9 / Sixty;
            SHHhoursSHH9 = SHHminutesSHH9 / Sixty;
            SHHsecondsSHH9 = SHHsecondsSHH9 % Sixty;
            SHHminutesSHH9 = SHHminutesSHH9 % Sixty;
            SHHsecSHH9 = SHHhoursSHH9 * ThreeThousandSix + SHHminutesSHH9 * Sixty + SHHsecondsSHH9;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH9 * ThreeThousandSix + SHHcurrentMinuteSHH9 * Sixty + SHHredThresholdSHH9;
            // 计算小时和分钟
            SHHfutureHourSHH9 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH9 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH9 >= TwentyFour) {
                SHHfutureHourSHH9 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH9, SHHcurrentMinuteSHH9);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH9, SHHfutureMinuteSHH9);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH9.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH9.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH9.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH9();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH10 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH10 = SystemClock.uptimeMillis() - SHHstartTimeSHH10;
            SHHupdatedTimeSHH10 = SHHtimeInMilliSHHsecondsSHH10;
            SHHsecondsSHH10 = (int) (SHHupdatedTimeSHH10 / Thousand);
            SHHminutesSHH10 = SHHsecondsSHH10 / Sixty;
            SHHhoursSHH10 = SHHminutesSHH10 / Sixty;
            SHHsecondsSHH10 = SHHsecondsSHH10 % Sixty;
            SHHminutesSHH10 = SHHminutesSHH10 % Sixty;
            SHHsecSHH10 = SHHhoursSHH10 * ThreeThousandSix + SHHminutesSHH10 * Sixty + SHHsecondsSHH10;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH10 * ThreeThousandSix + SHHcurrentMinuteSHH10 * Sixty + SHHredThresholdSHH10;
            // 计算小时和分钟
            SHHfutureHourSHH10 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH10 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH10 >= TwentyFour) {
                SHHfutureHourSHH10 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH10, SHHcurrentMinuteSHH10);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH10, SHHfutureMinuteSHH10);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH10.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH10.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH10.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH10();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH11 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH11 = SystemClock.uptimeMillis() - SHHstartTimeSHH11;
            SHHupdatedTimeSHH11 = SHHtimeInMilliSHHsecondsSHH11;
            SHHsecondsSHH11 = (int) (SHHupdatedTimeSHH11 / Thousand);
            SHHminutesSHH11 = SHHsecondsSHH11 / Sixty;
            SHHhoursSHH11 = SHHminutesSHH11 / Sixty;
            SHHsecondsSHH11 = SHHsecondsSHH11 % Sixty;
            SHHminutesSHH11 = SHHminutesSHH11 % Sixty;
            SHHsecSHH11 = SHHhoursSHH11 * ThreeThousandSix + SHHminutesSHH11 * Sixty + SHHsecondsSHH11;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH11 * ThreeThousandSix + SHHcurrentMinuteSHH11 * Sixty + SHHredThresholdSHH11;
            // 计算小时和分钟
            SHHfutureHourSHH11 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH11 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH11 >= TwentyFour) {
                SHHfutureHourSHH11 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH11, SHHcurrentMinuteSHH11);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH11, SHHfutureMinuteSHH11);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH11.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH11.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH11.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH11();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH12 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH12 = SystemClock.uptimeMillis() - SHHstartTimeSHH12;
            SHHupdatedTimeSHH12 = SHHtimeInMilliSHHsecondsSHH12;
            SHHsecondsSHH12 = (int) (SHHupdatedTimeSHH12 / Thousand);
            SHHminutesSHH12 = SHHsecondsSHH12 / Sixty;
            SHHhoursSHH12 = SHHminutesSHH12 / Sixty;
            SHHsecondsSHH12 = SHHsecondsSHH12 % Sixty;
            SHHminutesSHH12 = SHHminutesSHH12 % Sixty;
            SHHsecSHH12 = SHHhoursSHH12 * ThreeThousandSix + SHHminutesSHH12 * Sixty + SHHsecondsSHH12;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH12 * ThreeThousandSix + SHHcurrentMinuteSHH12 * Sixty + SHHredThresholdSHH12;
            // 计算小时和分钟
            SHHfutureHourSHH12 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH12 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH12 >= TwentyFour) {
                SHHfutureHourSHH12 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH12, SHHcurrentMinuteSHH12);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH12, SHHfutureMinuteSHH12);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH12.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH12.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH12.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH12();
            SHHhandlerSHH.postDelayed(this,delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH13 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH13 = SystemClock.uptimeMillis() - SHHstartTimeSHH13;
            SHHupdatedTimeSHH13 = SHHtimeInMilliSHHsecondsSHH13;
            SHHsecondsSHH13 = (int) (SHHupdatedTimeSHH13 / Thousand);
            SHHminutesSHH13 = SHHsecondsSHH13 / Sixty;
            SHHhoursSHH13 = SHHminutesSHH13 / Sixty;
            SHHsecondsSHH13 = SHHsecondsSHH13 % Sixty;
            SHHminutesSHH13 = SHHminutesSHH13 % Sixty;
            SHHsecSHH13 = SHHhoursSHH13 * ThreeThousandSix + SHHminutesSHH13 * Sixty + SHHsecondsSHH13;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH13 * ThreeThousandSix + SHHcurrentMinuteSHH13 * Sixty + SHHredThresholdSHH13;
            // 计算小时和分钟
            SHHfutureHourSHH13 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH13 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH13 >= TwentyFour) {
                SHHfutureHourSHH13 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH13, SHHcurrentMinuteSHH13);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH13, SHHfutureMinuteSHH13);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH13.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH13.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH13.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH13();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH14 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH14 = SystemClock.uptimeMillis() - SHHstartTimeSHH14;
            SHHupdatedTimeSHH14 = SHHtimeInMilliSHHsecondsSHH14;
            SHHsecondsSHH14 = (int) (SHHupdatedTimeSHH14 / Thousand);
            SHHminutesSHH14 = SHHsecondsSHH14 / Sixty;
            SHHhoursSHH14 = SHHminutesSHH14 / Sixty;
            SHHsecondsSHH14 = SHHsecondsSHH14 % Sixty;
            SHHminutesSHH14 = SHHminutesSHH14 % Sixty;
            SHHsecSHH14 = SHHhoursSHH14 * ThreeThousandSix + SHHminutesSHH14 * Sixty + SHHsecondsSHH14;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH14 * ThreeThousandSix + SHHcurrentMinuteSHH14 * Sixty + SHHredThresholdSHH14;
            // 计算小时和分钟
            SHHfutureHourSHH14 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH14 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH14 >= TwentyFour) {
                SHHfutureHourSHH14 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH14, SHHcurrentMinuteSHH14);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH14, SHHfutureMinuteSHH14);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH14.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH14.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH14.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH14();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH15 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH15 = SystemClock.uptimeMillis() - SHHstartTimeSHH15;
            SHHupdatedTimeSHH15 = SHHtimeInMilliSHHsecondsSHH15;
            SHHsecondsSHH15 = (int) (SHHupdatedTimeSHH15 / Thousand);
            SHHminutesSHH15 = SHHsecondsSHH15 / Sixty;
            SHHhoursSHH15 = SHHminutesSHH15 / Sixty;
            SHHsecondsSHH15 = SHHsecondsSHH15 % Sixty;
            SHHminutesSHH15 = SHHminutesSHH15 % Sixty;
            SHHsecSHH15 = SHHhoursSHH15 * ThreeThousandSix + SHHminutesSHH15 * Sixty + SHHsecondsSHH15;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH15 * ThreeThousandSix + SHHcurrentMinuteSHH15 * Sixty + SHHredThresholdSHH15;
            // 计算小时和分钟
            SHHfutureHourSHH15 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH15 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH15 >= TwentyFour) {
                SHHfutureHourSHH15 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH15, SHHcurrentMinuteSHH15);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH15, SHHfutureMinuteSHH15);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH15.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH15.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH15.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH15();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH16 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH16 = SystemClock.uptimeMillis() - SHHstartTimeSHH16;
            SHHupdatedTimeSHH16 = SHHtimeInMilliSHHsecondsSHH16;
            SHHsecondsSHH16 = (int) (SHHupdatedTimeSHH16 / Thousand);
            SHHminutesSHH16 = SHHsecondsSHH16 / Sixty;
            SHHhoursSHH16 = SHHminutesSHH16 / Sixty;
            SHHsecondsSHH16 = SHHsecondsSHH16 % Sixty;
            SHHminutesSHH16 = SHHminutesSHH16 % Sixty;
            SHHsecSHH16 = SHHhoursSHH16 * ThreeThousandSix + SHHminutesSHH16 * Sixty + SHHsecondsSHH16;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH16 * ThreeThousandSix + SHHcurrentMinuteSHH16 * Sixty + SHHredThresholdSHH16;
            // 计算小时和分钟
            SHHfutureHourSHH16 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH16 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH16 >= TwentyFour) {
                SHHfutureHourSHH16 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH16, SHHcurrentMinuteSHH16);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH16, SHHfutureMinuteSHH16);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH16.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH16.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH16.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH16();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH17 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH17 = SystemClock.uptimeMillis() - SHHstartTimeSHH17;
            SHHupdatedTimeSHH17 = SHHtimeInMilliSHHsecondsSHH17;
            SHHsecondsSHH17 = (int) (SHHupdatedTimeSHH17 / Thousand);
            SHHminutesSHH17 = SHHsecondsSHH17 / Sixty;
            SHHhoursSHH17 = SHHminutesSHH17 / Sixty;
            SHHsecondsSHH17 = SHHsecondsSHH17 % Sixty;
            SHHminutesSHH17 = SHHminutesSHH17 % Sixty;
            SHHsecSHH17 = SHHhoursSHH17 * ThreeThousandSix + SHHminutesSHH17 * Sixty + SHHsecondsSHH17;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH17 * ThreeThousandSix + SHHcurrentMinuteSHH17 * Sixty + SHHredThresholdSHH17;
            // 计算小时和分钟
            SHHfutureHourSHH17 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH17 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH17 >= TwentyFour) {
                SHHfutureHourSHH17 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH17, SHHcurrentMinuteSHH17);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH17, SHHfutureMinuteSHH17);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH17.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH17.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH17.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH17();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH18 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH18 = SystemClock.uptimeMillis() - SHHstartTimeSHH18;
            SHHupdatedTimeSHH18 = SHHtimeInMilliSHHsecondsSHH18;
            SHHsecondsSHH18 = (int) (SHHupdatedTimeSHH18 / Thousand);
            SHHminutesSHH18 = SHHsecondsSHH18 / Sixty;
            SHHhoursSHH18 = SHHminutesSHH18 / Sixty;
            SHHsecondsSHH18 = SHHsecondsSHH18 % Sixty;
            SHHminutesSHH18 = SHHminutesSHH18 % Sixty;
            SHHsecSHH18 = SHHhoursSHH18 * ThreeThousandSix + SHHminutesSHH18 * Sixty + SHHsecondsSHH18;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH18 * ThreeThousandSix + SHHcurrentMinuteSHH18 * Sixty + SHHredThresholdSHH18;
            // 计算小时和分钟
            SHHfutureHourSHH18 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH18 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH18 >= TwentyFour) {
                SHHfutureHourSHH18 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH18, SHHcurrentMinuteSHH18);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH18, SHHfutureMinuteSHH18);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH18.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH18.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH18.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH18();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH19 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH19 = SystemClock.uptimeMillis() - SHHstartTimeSHH19;
            SHHupdatedTimeSHH19 = SHHtimeInMilliSHHsecondsSHH19;
            SHHsecondsSHH19 = (int) (SHHupdatedTimeSHH19 / Thousand);
            SHHminutesSHH19 = SHHsecondsSHH19 / Sixty;
            SHHhoursSHH19 = SHHminutesSHH19 / Sixty;
            SHHsecondsSHH19 = SHHsecondsSHH19 % Sixty;
            SHHminutesSHH19 = SHHminutesSHH19 % Sixty;
            SHHsecSHH19 = SHHhoursSHH19 * ThreeThousandSix + SHHminutesSHH19 * Sixty + SHHsecondsSHH19;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH19 * ThreeThousandSix + SHHcurrentMinuteSHH19 * Sixty + SHHredThresholdSHH19;
            // 计算小时和分钟
            SHHfutureHourSHH19 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH19 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH19 >= TwentyFour) {
                SHHfutureHourSHH19 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH19, SHHcurrentMinuteSHH19);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH19, SHHfutureMinuteSHH19);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH19.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH19.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH19.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH19();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH20 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH20 = SystemClock.uptimeMillis() - SHHstartTimeSHH20;
            SHHupdatedTimeSHH20 = SHHtimeInMilliSHHsecondsSHH20;
            SHHsecondsSHH20 = (int) (SHHupdatedTimeSHH20 / Thousand);
            SHHminutesSHH20 = SHHsecondsSHH20 / Sixty;
            SHHhoursSHH20 = SHHminutesSHH20 / Sixty;
            SHHsecondsSHH20 = SHHsecondsSHH20 % Sixty;
            SHHminutesSHH20 = SHHminutesSHH20 % Sixty;
            SHHsecSHH20 = SHHhoursSHH20 * ThreeThousandSix + SHHminutesSHH20 * Sixty + SHHsecondsSHH20;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH20 * ThreeThousandSix + SHHcurrentMinuteSHH20 * Sixty + SHHredThresholdSHH20;
            // 计算小时和分钟
            SHHfutureHourSHH20 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH20 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH20 >= TwentyFour) {
                SHHfutureHourSHH20 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH20, SHHcurrentMinuteSHH20);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH20, SHHfutureMinuteSHH20);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH20.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH20.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH20.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH20();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH21 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH21 = SystemClock.uptimeMillis() - SHHstartTimeSHH21;
            SHHupdatedTimeSHH21 = SHHtimeInMilliSHHsecondsSHH21;
            SHHsecondsSHH21 = (int) (SHHupdatedTimeSHH21 / Thousand);
            SHHminutesSHH21 = SHHsecondsSHH21 / Sixty;
            SHHhoursSHH21 = SHHminutesSHH21 / Sixty;
            SHHsecondsSHH21 = SHHsecondsSHH21 % Sixty;
            SHHminutesSHH21 = SHHminutesSHH21 % Sixty;
            SHHsecSHH21 = SHHhoursSHH21 * ThreeThousandSix + SHHminutesSHH21 * Sixty + SHHsecondsSHH21;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH21 * ThreeThousandSix + SHHcurrentMinuteSHH21 * Sixty + SHHredThresholdSHH21;
            // 计算小时和分钟
            SHHfutureHourSHH21 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH21 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH21 >= TwentyFour) {
                SHHfutureHourSHH21 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH21, SHHcurrentMinuteSHH21);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH21, SHHfutureMinuteSHH21);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH21.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH21.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH21.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH21();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH22 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH22 = SystemClock.uptimeMillis() - SHHstartTimeSHH22;
            SHHupdatedTimeSHH22 = SHHtimeInMilliSHHsecondsSHH22;
            SHHsecondsSHH22 = (int) (SHHupdatedTimeSHH22 / Thousand);
            SHHminutesSHH22 = SHHsecondsSHH22 / Sixty;
            SHHhoursSHH22 = SHHminutesSHH22 / Sixty;
            SHHsecondsSHH22 = SHHsecondsSHH22 % Sixty;
            SHHminutesSHH22 = SHHminutesSHH22 % Sixty;
            SHHsecSHH22 = SHHhoursSHH22 * ThreeThousandSix + SHHminutesSHH22 * Sixty + SHHsecondsSHH22;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH22 * ThreeThousandSix + SHHcurrentMinuteSHH22 * Sixty + SHHredThresholdSHH22;
            // 计算小时和分钟
            SHHfutureHourSHH22 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH22 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH22 >= TwentyFour) {
                SHHfutureHourSHH22 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH22, SHHcurrentMinuteSHH22);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH22, SHHfutureMinuteSHH22);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH22.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH22.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH22.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH22();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH23 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH23 = SystemClock.uptimeMillis() - SHHstartTimeSHH23;
            SHHupdatedTimeSHH23 = SHHtimeInMilliSHHsecondsSHH23;
            SHHsecondsSHH23 = (int) (SHHupdatedTimeSHH23 / Thousand);
            SHHminutesSHH23 = SHHsecondsSHH23 / Sixty;
            SHHhoursSHH23 = SHHminutesSHH23 / Sixty;
            SHHsecondsSHH23 = SHHsecondsSHH23 % Sixty;
            SHHminutesSHH23 = SHHminutesSHH23 % Sixty;
            SHHsecSHH23 = SHHhoursSHH23 * ThreeThousandSix + SHHminutesSHH23 * Sixty + SHHsecondsSHH23;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH23 * ThreeThousandSix + SHHcurrentMinuteSHH23 * Sixty + SHHredThresholdSHH23;
            // 计算小时和分钟
            SHHfutureHourSHH23 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH23 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH23 >= TwentyFour) {
                SHHfutureHourSHH23 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH23, SHHcurrentMinuteSHH23);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH23, SHHfutureMinuteSHH23);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH23.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH23.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH23.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH23();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH24 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH24 = SystemClock.uptimeMillis() - SHHstartTimeSHH24;
            SHHupdatedTimeSHH24 = SHHtimeInMilliSHHsecondsSHH24;
            SHHsecondsSHH24 = (int) (SHHupdatedTimeSHH24 / Thousand);
            SHHminutesSHH24 = SHHsecondsSHH24 / Sixty;
            SHHhoursSHH24 = SHHminutesSHH24 / Sixty;
            SHHsecondsSHH24 = SHHsecondsSHH24 % Sixty;
            SHHminutesSHH24 = SHHminutesSHH24 % Sixty;
            SHHsecSHH24 = SHHhoursSHH24 * ThreeThousandSix + SHHminutesSHH24 * Sixty + SHHsecondsSHH24;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH24 * ThreeThousandSix + SHHcurrentMinuteSHH24 * Sixty + SHHredThresholdSHH24;
            // 计算小时和分钟
            SHHfutureHourSHH24 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH24 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH24 >= TwentyFour) {
                SHHfutureHourSHH24 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH24, SHHcurrentMinuteSHH24);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH24, SHHfutureMinuteSHH24);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH24.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH24.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH24.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH24();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH25 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH25 = SystemClock.uptimeMillis() - SHHstartTimeSHH25;
            SHHupdatedTimeSHH25 = SHHtimeInMilliSHHsecondsSHH25;
            SHHsecondsSHH25 = (int) (SHHupdatedTimeSHH25 / Thousand);
            SHHminutesSHH25 = SHHsecondsSHH25 / Sixty;
            SHHhoursSHH25 = SHHminutesSHH25 / Sixty;
            SHHsecondsSHH25 = SHHsecondsSHH25 % Sixty;
            SHHminutesSHH25 = SHHminutesSHH25 % Sixty;
            SHHsecSHH25 = SHHhoursSHH25 * ThreeThousandSix + SHHminutesSHH25 * Sixty + SHHsecondsSHH25;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH25 * ThreeThousandSix + SHHcurrentMinuteSHH25 * Sixty + SHHredThresholdSHH25;
            // 计算小时和分钟
            SHHfutureHourSHH25 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH25 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH25 >= TwentyFour) {
                SHHfutureHourSHH25 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH25, SHHcurrentMinuteSHH25);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH25, SHHfutureMinuteSHH25);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH25.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH25.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH25.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH25();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH26 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH26 = SystemClock.uptimeMillis() - SHHstartTimeSHH26;
            SHHupdatedTimeSHH26 = SHHtimeInMilliSHHsecondsSHH26;
            SHHsecondsSHH26 = (int) (SHHupdatedTimeSHH26 / Thousand);
            SHHminutesSHH26 = SHHsecondsSHH26 / Sixty;
            SHHhoursSHH26 = SHHminutesSHH26 / Sixty;
            SHHsecondsSHH26 = SHHsecondsSHH26 % Sixty;
            SHHminutesSHH26 = SHHminutesSHH26 % Sixty;
            SHHsecSHH26 = SHHhoursSHH26 * ThreeThousandSix + SHHminutesSHH26 * Sixty + SHHsecondsSHH26;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH26 * ThreeThousandSix + SHHcurrentMinuteSHH26 * Sixty + SHHredThresholdSHH26;
            // 计算小时和分钟
            SHHfutureHourSHH26 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH26 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH26 >= TwentyFour) {
                SHHfutureHourSHH26 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH26, SHHcurrentMinuteSHH26);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH26, SHHfutureMinuteSHH26);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH26.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH26.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH26.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH26();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH27 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH27 = SystemClock.uptimeMillis() - SHHstartTimeSHH27;
            SHHupdatedTimeSHH27 = SHHtimeInMilliSHHsecondsSHH27;
            SHHsecondsSHH27 = (int) (SHHupdatedTimeSHH27 / Thousand);
            SHHminutesSHH27 = SHHsecondsSHH27 / Sixty;
            SHHhoursSHH27 = SHHminutesSHH27 / Sixty;
            SHHsecondsSHH27 = SHHsecondsSHH27 % Sixty;
            SHHminutesSHH27 = SHHminutesSHH27 % Sixty;
            SHHsecSHH27 = SHHhoursSHH27 * ThreeThousandSix + SHHminutesSHH27 * Sixty + SHHsecondsSHH27;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH27 * ThreeThousandSix + SHHcurrentMinuteSHH27 * Sixty + SHHredThresholdSHH27;
            // 计算小时和分钟
            SHHfutureHourSHH27 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH27 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH27 >= TwentyFour) {
                SHHfutureHourSHH27 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH27, SHHcurrentMinuteSHH27);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH27, SHHfutureMinuteSHH27);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH27.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH27.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH27.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH27();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH28 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH28 = SystemClock.uptimeMillis() - SHHstartTimeSHH28;
            SHHupdatedTimeSHH28 = SHHtimeInMilliSHHsecondsSHH28;
            SHHsecondsSHH28 = (int) (SHHupdatedTimeSHH28 / Thousand);
            SHHminutesSHH28 = SHHsecondsSHH28 / Sixty;
            SHHhoursSHH28 = SHHminutesSHH28 / Sixty;
            SHHsecondsSHH28 = SHHsecondsSHH28 % Sixty;
            SHHminutesSHH28 = SHHminutesSHH28 % Sixty;
            SHHsecSHH28 = SHHhoursSHH28 * ThreeThousandSix + SHHminutesSHH28 * Sixty + SHHsecondsSHH28;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH28 * ThreeThousandSix + SHHcurrentMinuteSHH28 * Sixty + SHHredThresholdSHH28;
            // 计算小时和分钟
            SHHfutureHourSHH28 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH28 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH28 >= TwentyFour) {
                SHHfutureHourSHH28 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH28, SHHcurrentMinuteSHH28);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH28, SHHfutureMinuteSHH28);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH28.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH28.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH28.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH28();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH29 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH29 = SystemClock.uptimeMillis() - SHHstartTimeSHH29;
            SHHupdatedTimeSHH29 = SHHtimeInMilliSHHsecondsSHH29;
            SHHsecondsSHH29 = (int) (SHHupdatedTimeSHH29 / Thousand);
            SHHminutesSHH29 = SHHsecondsSHH29 / Sixty;
            SHHhoursSHH29 = SHHminutesSHH29 / Sixty;
            SHHsecondsSHH29 = SHHsecondsSHH29 % Sixty;
            SHHminutesSHH29 = SHHminutesSHH29 % Sixty;
            SHHsecSHH29 = SHHhoursSHH29 * ThreeThousandSix + SHHminutesSHH29 * Sixty + SHHsecondsSHH29;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH29 * ThreeThousandSix + SHHcurrentMinuteSHH29 * Sixty + SHHredThresholdSHH29;
            // 计算小时和分钟
            SHHfutureHourSHH29 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH29 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH29 >= TwentyFour) {
                SHHfutureHourSHH29 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH29, SHHcurrentMinuteSHH29);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH29, SHHfutureMinuteSHH29);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH29.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH29.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH29.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH29();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH30 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH30 = SystemClock.uptimeMillis() - SHHstartTimeSHH30;
            SHHupdatedTimeSHH30 = SHHtimeInMilliSHHsecondsSHH30;
            SHHsecondsSHH30 = (int) (SHHupdatedTimeSHH30 / Thousand);
            SHHminutesSHH30 = SHHsecondsSHH30 / Sixty;
            SHHhoursSHH30 = SHHminutesSHH30 / Sixty;
            SHHsecondsSHH30 = SHHsecondsSHH30 % Sixty;
            SHHminutesSHH30 = SHHminutesSHH30 % Sixty;
            SHHsecSHH30 = SHHhoursSHH30 * ThreeThousandSix + SHHminutesSHH30 * Sixty + SHHsecondsSHH30;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH30 * ThreeThousandSix + SHHcurrentMinuteSHH30 * Sixty + SHHredThresholdSHH30;
            // 计算小时和分钟
            SHHfutureHourSHH30 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH30 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH30 >= TwentyFour) {
                SHHfutureHourSHH30 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH30, SHHcurrentMinuteSHH30);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH30, SHHfutureMinuteSHH30);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH30.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH30.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH30.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH30();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH31 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH31 = SystemClock.uptimeMillis() - SHHstartTimeSHH31;
            SHHupdatedTimeSHH31 = SHHtimeInMilliSHHsecondsSHH31;
            SHHsecondsSHH31 = (int) (SHHupdatedTimeSHH31 / Thousand);
            SHHminutesSHH31 = SHHsecondsSHH31 / Sixty;
            SHHhoursSHH31 = SHHminutesSHH31 / Sixty;
            SHHsecondsSHH31 = SHHsecondsSHH31 % Sixty;
            SHHminutesSHH31 = SHHminutesSHH31 % Sixty;
            SHHsecSHH31 = SHHhoursSHH31 * ThreeThousandSix + SHHminutesSHH31 * Sixty + SHHsecondsSHH31;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH31 * ThreeThousandSix + SHHcurrentMinuteSHH31 * Sixty + SHHredThresholdSHH31;
            // 计算小时和分钟
            SHHfutureHourSHH31 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH31 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH31 >= TwentyFour) {
                SHHfutureHourSHH31 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH31, SHHcurrentMinuteSHH31);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH31, SHHfutureMinuteSHH31);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH31.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH31.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH31.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH31();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH32 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH32 = SystemClock.uptimeMillis() - SHHstartTimeSHH32;
            SHHupdatedTimeSHH32 = SHHtimeInMilliSHHsecondsSHH32;
            SHHsecondsSHH32 = (int) (SHHupdatedTimeSHH32 / Thousand);
            SHHminutesSHH32 = SHHsecondsSHH32 / Sixty;
            SHHhoursSHH32 = SHHminutesSHH32 / Sixty;
            SHHsecondsSHH32 = SHHsecondsSHH32 % Sixty;
            SHHminutesSHH32 = SHHminutesSHH32 % Sixty;
            SHHsecSHH32 = SHHhoursSHH32 * ThreeThousandSix + SHHminutesSHH32 * Sixty + SHHsecondsSHH32;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH32 * ThreeThousandSix + SHHcurrentMinuteSHH32 * Sixty + SHHredThresholdSHH32;
            // 计算小时和分钟
            SHHfutureHourSHH32 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH32 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH32 >= TwentyFour) {
                SHHfutureHourSHH32 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH32, SHHcurrentMinuteSHH32);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH32, SHHfutureMinuteSHH32);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH32.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH32.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH32.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH32();
            SHHhandlerSHH.postDelayed(this, delay);
        }
    };
    private Runnable SHHupdateTimerThreadSHH33 = new Runnable() {
        public void run() {
            SHHtimeInMilliSHHsecondsSHH33 = SystemClock.uptimeMillis() - SHHstartTimeSHH33;
            SHHupdatedTimeSHH33 = SHHtimeInMilliSHHsecondsSHH33;
            SHHsecondsSHH33 = (int) (SHHupdatedTimeSHH33 / Thousand);
            SHHminutesSHH33 = SHHsecondsSHH33 / Sixty;
            SHHhoursSHH33 = SHHminutesSHH33 / Sixty;
            SHHsecondsSHH33 = SHHsecondsSHH33 % Sixty;
            SHHminutesSHH33 = SHHminutesSHH33 % Sixty;
            SHHsecSHH33 = SHHhoursSHH33 * ThreeThousandSix + SHHminutesSHH33 * Sixty + SHHsecondsSHH33;

            // 计算当前时间加上 SHHredThresholdSHH 后的时间（秒数）
            int totalSeconds = SHHcurrentHourSHH33 * ThreeThousandSix + SHHcurrentMinuteSHH33 * Sixty + SHHredThresholdSHH33;
            // 计算小时和分钟
            SHHfutureHourSHH33 = totalSeconds / ThreeThousandSix;
            SHHfutureMinuteSHH33 = (totalSeconds % ThreeThousandSix) / Sixty;

            if (SHHfutureHourSHH33 >= TwentyFour) {
                SHHfutureHourSHH33 %= TwentyFour;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", SHHcurrentHourSHH33, SHHcurrentMinuteSHH33);
            String futureTimeString = String.format("%02d:%02d", SHHfutureHourSHH33, SHHfutureMinuteSHH33);

// 計算所需的空格數以實現對齊
            int totalWidth = Eleven; // 假設總共字符的寬度
            int currentTimeWidth = Five; // currentTimeString的寬度
            int futureTimeWidth = Five; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"----------" + space + futureTimeString;
            SHHbtnTimerSHH33.setTextSize(TypedValue.COMPLEX_UNIT_SP, Twenty);


            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                SHHbtnTimerSHH33.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                SHHbtnTimerSHH33.setText(Html.fromHtml(displayText));
            }

            SHHupdateButtonColorSHH33();
            SHHhandlerSHH.postDelayed(this, delay);
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



    private void SHHshowTimeDialogForButtonSHH101() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH01(Time1SHH);

                    if(SHHsecSHH101 >= SHHblueThresholdSHH101){
                        SHHflashingSHH101 = true;
                        SHHupdateButtonColorSHH101();
                    }
                    if(SHHflashinggSHH101){
                        SHHflashinggSHH101 = false;
                        SHHupdateButtonColorSHH101();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH01(Time2SHH);

                    if(SHHsecSHH101 >= SHHblueThresholdSHH101){
                        SHHflashingSHH101 = true;
                        SHHupdateButtonColorSHH101();
                    }
                    if(SHHflashinggSHH101){
                        SHHflashinggSHH101 = false;
                        SHHupdateButtonColorSHH101();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH01(int secondsToAdd) {
        SHHyellowThresholdSHH101 += secondsToAdd;
        SHHredThresholdSHH101 += secondsToAdd;
        SHHupdateButtonColorSHH101();
    }


    private void SHHshowTimeDialogForButtonSHH102() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("13號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH02(Time1SHH);

                    if(SHHsecSHH102 >= SHHblueThresholdSHH102){
                        SHHflashingSHH102 = true;
                        SHHupdateButtonColorSHH102();
                    }
                    if(SHHflashinggSHH102){
                        SHHflashinggSHH102 = false;
                        SHHupdateButtonColorSHH102();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH02(Time2SHH);

                    if(SHHsecSHH102 >= SHHblueThresholdSHH102){
                        SHHflashingSHH102 = true;
                        SHHupdateButtonColorSHH102();
                    }
                    if(SHHflashinggSHH102){
                        SHHflashinggSHH102 = false;
                        SHHupdateButtonColorSHH102();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH02(int secondsToAdd) {
        SHHyellowThresholdSHH102 += secondsToAdd;
        SHHredThresholdSHH102 += secondsToAdd;
        SHHupdateButtonColorSHH102();
    }

    private void SHHshowTimeDialogForButtonSHH103() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("14號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH03(Time1SHH);

                    if(SHHsecSHH103 >= SHHblueThresholdSHH103){
                        SHHflashingSHH103 = true;
                        SHHupdateButtonColorSHH103();
                    }
                    if(SHHflashinggSHH103){
                        SHHflashinggSHH103 = false;
                        SHHupdateButtonColorSHH103();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH03(Time2SHH);

                    if(SHHsecSHH103 >= SHHblueThresholdSHH103){
                        SHHflashingSHH103 = true;
                        SHHupdateButtonColorSHH103();
                    }
                    if(SHHflashinggSHH103){
                        SHHflashinggSHH103 = false;
                        SHHupdateButtonColorSHH103();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH03(int secondsToAdd) {
        SHHyellowThresholdSHH103 += secondsToAdd;
        SHHredThresholdSHH103 += secondsToAdd;
        SHHupdateButtonColorSHH103();
    }

    private void SHHshowTimeDialogForButtonSHH104() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("15號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH04(Time1SHH);

                    if(SHHsecSHH104 >= SHHblueThresholdSHH104){
                        SHHflashingSHH104 = true;
                        SHHupdateButtonColorSHH104();
                    }
                    if(SHHflashinggSHH104){
                        SHHflashinggSHH104 = false;
                        SHHupdateButtonColorSHH104();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH04(Time2SHH);

                    if(SHHsecSHH104 >= SHHblueThresholdSHH104){
                        SHHflashingSHH104 = true;
                        SHHupdateButtonColorSHH104();
                    }
                    if(SHHflashinggSHH104){
                        SHHflashinggSHH104 = false;
                        SHHupdateButtonColorSHH104();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH04(int secondsToAdd) {
        SHHyellowThresholdSHH104 += secondsToAdd;
        SHHredThresholdSHH104 += secondsToAdd;
        SHHupdateButtonColorSHH104();
    }


    private void SHHshowTimeDialogForButtonSHH105() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("17號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH05(Time1SHH);

                    if(SHHsecSHH105 >= SHHblueThresholdSHH105){
                        SHHflashingSHH105 = true;
                        SHHupdateButtonColorSHH105();
                    }
                    if(SHHflashinggSHH105){
                        SHHflashinggSHH105 = false;
                        SHHupdateButtonColorSHH105();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH05(Time2SHH);

                    if(SHHsecSHH105 >= SHHblueThresholdSHH105){
                        SHHflashingSHH105 = true;
                        SHHupdateButtonColorSHH105();
                    }
                    if(SHHflashinggSHH105){
                        SHHflashinggSHH105 = false;
                        SHHupdateButtonColorSHH105();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH05(int secondsToAdd) {
        SHHyellowThresholdSHH105 += secondsToAdd;
        SHHredThresholdSHH105 += secondsToAdd;
        SHHupdateButtonColorSHH105();
    }


    private void SHHshowTimeDialogForButtonSHH106() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("18號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH06(Time1SHH);

                    if(SHHsecSHH106 >= SHHblueThresholdSHH106){
                        SHHflashingSHH106 = true;
                        SHHupdateButtonColorSHH106();
                    }
                    if(SHHflashinggSHH106){
                        SHHflashinggSHH106 = false;
                        SHHupdateButtonColorSHH106();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH06(Time2SHH);

                    if(SHHsecSHH106 >= SHHblueThresholdSHH106){
                        SHHflashingSHH106 = true;
                        SHHupdateButtonColorSHH106();
                    }
                    if(SHHflashinggSHH106){
                        SHHflashinggSHH106 = false;
                        SHHupdateButtonColorSHH106();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH06(int secondsToAdd) {
        SHHyellowThresholdSHH106 += secondsToAdd;
        SHHredThresholdSHH106 += secondsToAdd;
        SHHupdateButtonColorSHH106();
    }


    private void SHHshowTimeDialogForButtonSHH107() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("19號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH07(Time1SHH);

                    if(SHHsecSHH107 >= SHHblueThresholdSHH107){
                        SHHflashingSHH107 = true;
                        SHHupdateButtonColorSHH107();
                    }
                    if(SHHflashinggSHH107){
                        SHHflashinggSHH107 = false;
                        SHHupdateButtonColorSHH107();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH07(Time2SHH);

                    if(SHHsecSHH107 >= SHHblueThresholdSHH107){
                        SHHflashingSHH107 = true;
                        SHHupdateButtonColorSHH107();
                    }
                    if(SHHflashinggSHH107){
                        SHHflashinggSHH107 = false;
                        SHHupdateButtonColorSHH107();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH07(int secondsToAdd) {
        SHHyellowThresholdSHH107 += secondsToAdd;
        SHHredThresholdSHH107 += secondsToAdd;
        SHHupdateButtonColorSHH107();
    }


    private void SHHshowTimeDialogForButtonSHH8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("20號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime8(Time1SHH);

                    if(SHHsecSHH8 >= SHHblueThresholdSHH8){
                        SHHflashingSHH8 = true;
                        SHHupdateButtonColorSHH8();
                    }
                    if(SHHflashinggSHH8){
                        SHHflashinggSHH8 = false;
                        SHHupdateButtonColorSHH8();
                    }

                    break;
                case "60分鐘" :
                    addTime8(Time2SHH);

                    if(SHHsecSHH8 >= SHHblueThresholdSHH8){
                        SHHflashingSHH8 = true;
                        SHHupdateButtonColorSHH8();
                    }
                    if(SHHflashinggSHH8){
                        SHHflashinggSHH8 = false;
                        SHHupdateButtonColorSHH8();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime8(int secondsToAdd) {
        SHHyellowThresholdSHH8 += secondsToAdd;
        SHHredThresholdSHH8 += secondsToAdd;
        SHHupdateButtonColorSHH8();
    }


    private void SHHshowTimeDialogForButtonSHH9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("21號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime9(Time1SHH);

                    if(SHHsecSHH9 >= SHHblueThresholdSHH9){
                        SHHflashingSHH9 = true;
                        SHHupdateButtonColorSHH9();
                    }
                    if(SHHflashinggSHH9){
                        SHHflashinggSHH9 = false;
                        SHHupdateButtonColorSHH9();
                    }

                    break;
                case "60分鐘" :
                    addTime9(Time2SHH);

                    if(SHHsecSHH9 >= SHHblueThresholdSHH9){
                        SHHflashingSHH9 = true;
                        SHHupdateButtonColorSHH9();
                    }
                    if(SHHflashinggSHH9){
                        SHHflashinggSHH9 = false;
                        SHHupdateButtonColorSHH9();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime9(int secondsToAdd) {
        SHHyellowThresholdSHH9 += secondsToAdd;
        SHHredThresholdSHH9 += secondsToAdd;
        SHHupdateButtonColorSHH9();
    }


    private void SHHshowTimeDialogForButtonSHH10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("33號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH0(Time1SHH);

                    if(SHHsecSHH10 >= SHHblueThresholdSHH10){
                        SHHflashingSHH10 = true;
                        SHHupdateButtonColorSHH10();
                    }
                    if(SHHflashinggSHH10){
                        SHHflashinggSHH10 = false;
                        SHHupdateButtonColorSHH10();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH0(Time2SHH);

                    if(SHHsecSHH10 >= SHHblueThresholdSHH10){
                        SHHflashingSHH10 = true;
                        SHHupdateButtonColorSHH10();
                    }
                    if(SHHflashinggSHH10){
                        SHHflashinggSHH10 = false;
                        SHHupdateButtonColorSHH10();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH0(int secondsToAdd) {
        SHHyellowThresholdSHH10 += secondsToAdd;
        SHHredThresholdSHH10 += secondsToAdd;
        SHHupdateButtonColorSHH10();
    }


    private void SHHshowTimeDialogForButtonSHH11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("35號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH1(Time1SHH);

                    if(SHHsecSHH11 >= SHHblueThresholdSHH11){
                        SHHflashingSHH11 = true;
                        SHHupdateButtonColorSHH11();
                    }
                    if(SHHflashinggSHH11){
                        SHHflashinggSHH11 = false;
                        SHHupdateButtonColorSHH11();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH1(Time2SHH);

                    if(SHHsecSHH11 >= SHHblueThresholdSHH11){
                        SHHflashingSHH11 = true;
                        SHHupdateButtonColorSHH11();
                    }
                    if(SHHflashinggSHH11){
                        SHHflashinggSHH11 = false;
                        SHHupdateButtonColorSHH11();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH1(int secondsToAdd) {
        SHHyellowThresholdSHH11 += secondsToAdd;
        SHHredThresholdSHH11 += secondsToAdd;
        SHHupdateButtonColorSHH11();
    }


    private void SHHshowTimeDialogForButtonSHH12() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("36號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH2(Time1SHH);

                    if(SHHsecSHH12 >= SHHblueThresholdSHH12){
                        SHHflashingSHH12 = true;
                        SHHupdateButtonColorSHH12();
                    }
                    if(SHHflashinggSHH12){
                        SHHflashinggSHH12 = false;
                        SHHupdateButtonColorSHH12();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH2(Time2SHH);

                    if(SHHsecSHH12 >= SHHblueThresholdSHH12){
                        SHHflashingSHH12 = true;
                        SHHupdateButtonColorSHH12();
                    }
                    if(SHHflashinggSHH12){
                        SHHflashinggSHH12 = false;
                        SHHupdateButtonColorSHH12();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH2(int secondsToAdd) {
        SHHyellowThresholdSHH12 += secondsToAdd;
        SHHredThresholdSHH12 += secondsToAdd;
        SHHupdateButtonColorSHH12();
    }


    private void SHHshowTimeDialogForButtonSHH13() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("37號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH3(Time1SHH);

                    if(SHHsecSHH13 >= SHHblueThresholdSHH13){
                        SHHflashingSHH13 = true;
                        SHHupdateButtonColorSHH13();
                    }
                    if(SHHflashinggSHH13){
                        SHHflashinggSHH13 = false;
                        SHHupdateButtonColorSHH13();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH3(Time2SHH);

                    if(SHHsecSHH13 >= SHHblueThresholdSHH13){
                        SHHflashingSHH13 = true;
                        SHHupdateButtonColorSHH13();
                    }
                    if(SHHflashinggSHH13){
                        SHHflashinggSHH13 = false;
                        SHHupdateButtonColorSHH13();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH3(int secondsToAdd) {
        SHHyellowThresholdSHH13 += secondsToAdd;
        SHHredThresholdSHH13 += secondsToAdd;
        SHHupdateButtonColorSHH13();
    }


    private void SHHshowTimeDialogForButtonSHH14() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("38加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH4(Time1SHH);

                    if(SHHsecSHH14 >= SHHblueThresholdSHH14){
                        SHHflashingSHH14 = true;
                        SHHupdateButtonColorSHH14();
                    }
                    if(SHHflashinggSHH14){
                        SHHflashinggSHH14 = false;
                        SHHupdateButtonColorSHH14();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH4(Time2SHH);

                    if(SHHsecSHH14 >= SHHblueThresholdSHH14){
                        SHHflashingSHH14 = true;
                        SHHupdateButtonColorSHH14();
                    }
                    if(SHHflashinggSHH14){
                        SHHflashinggSHH14 = false;
                        SHHupdateButtonColorSHH14();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH4(int secondsToAdd) {
        SHHyellowThresholdSHH14 += secondsToAdd;
        SHHredThresholdSHH14 += secondsToAdd;
        SHHupdateButtonColorSHH14();
    }


    private void SHHshowTimeDialogForButtonSHH15() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("40號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH5(Time1SHH);

                    if(SHHsecSHH15 >= SHHblueThresholdSHH15){
                        SHHflashingSHH15 = true;
                        SHHupdateButtonColorSHH15();
                    }
                    if(SHHflashinggSHH15){
                        SHHflashinggSHH15 = false;
                        SHHupdateButtonColorSHH15();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH5(Time2SHH);

                    if(SHHsecSHH15 >= SHHblueThresholdSHH15){
                        SHHflashingSHH15 = true;
                        SHHupdateButtonColorSHH15();
                    }
                    if(SHHflashinggSHH15){
                        SHHflashinggSHH15 = false;
                        SHHupdateButtonColorSHH15();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH5(int secondsToAdd) {
        SHHyellowThresholdSHH15 += secondsToAdd;
        SHHredThresholdSHH15 += secondsToAdd;
        SHHupdateButtonColorSHH15();
    }


    private void SHHshowTimeDialogForButtonSHH16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("42號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH6(Time1SHH);

                    if(SHHsecSHH16 >= SHHblueThresholdSHH16){
                        SHHflashingSHH16 = true;
                        SHHupdateButtonColorSHH16();
                    }
                    if(SHHflashinggSHH16){
                        SHHflashinggSHH16 = false;
                        SHHupdateButtonColorSHH16();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH6(Time2SHH);

                    if(SHHsecSHH16 >= SHHblueThresholdSHH16){
                        SHHflashingSHH16 = true;
                        SHHupdateButtonColorSHH16();
                    }
                    if(SHHflashinggSHH16){
                        SHHflashinggSHH16 = false;
                        SHHupdateButtonColorSHH16();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH6(int secondsToAdd) {
        SHHyellowThresholdSHH16 += secondsToAdd;
        SHHredThresholdSHH16 += secondsToAdd;
        SHHupdateButtonColorSHH16();
    }


    private void SHHshowTimeDialogForButtonSHH17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("43號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH7(Time1SHH);

                    if(SHHsecSHH17 >= SHHblueThresholdSHH17){
                        SHHflashingSHH17 = true;
                        SHHupdateButtonColorSHH17();
                    }
                    if(SHHflashinggSHH17){
                        SHHflashinggSHH17 = false;
                        SHHupdateButtonColorSHH17();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH7(Time2SHH);

                    if(SHHsecSHH17 >= SHHblueThresholdSHH17){
                        SHHflashingSHH17 = true;
                        SHHupdateButtonColorSHH17();
                    }
                    if(SHHflashinggSHH17){
                        SHHflashinggSHH17 = false;
                        SHHupdateButtonColorSHH17();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH7(int secondsToAdd) {
        SHHyellowThresholdSHH17 += secondsToAdd;
        SHHredThresholdSHH17 += secondsToAdd;
        SHHupdateButtonColorSHH17();
    }


    private void SHHshowTimeDialogForButtonSHH18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("1號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH8(Time1SHH);

                    if(SHHsecSHH18 >= SHHblueThresholdSHH18){
                        SHHflashingSHH18 = true;
                        SHHupdateButtonColorSHH18();
                    }
                    if(SHHflashinggSHH18){
                        SHHflashinggSHH18 = false;
                        SHHupdateButtonColorSHH18();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH8(Time2SHH);

                    if(SHHsecSHH18 >= SHHblueThresholdSHH18){
                        SHHflashingSHH18 = true;
                        SHHupdateButtonColorSHH18();
                    }
                    if(SHHflashinggSHH18){
                        SHHflashinggSHH18 = false;
                        SHHupdateButtonColorSHH18();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH8(int secondsToAdd) {
        SHHyellowThresholdSHH18 += secondsToAdd;
        SHHredThresholdSHH18 += secondsToAdd;
        SHHupdateButtonColorSHH18();
    }


    private void SHHshowTimeDialogForButtonSHH19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("8號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime1SHH9(Time1SHH);

                    if(SHHsecSHH19 >= SHHblueThresholdSHH19){
                        SHHflashingSHH19 = true;
                        SHHupdateButtonColorSHH19();
                    }
                    if(SHHflashinggSHH19){
                        SHHflashinggSHH19 = false;
                        SHHupdateButtonColorSHH19();
                    }

                    break;
                case "60分鐘" :
                    addTime1SHH9(Time2SHH);

                    if(SHHsecSHH19 >= SHHblueThresholdSHH19){
                        SHHflashingSHH19 = true;
                        SHHupdateButtonColorSHH19();
                    }
                    if(SHHflashinggSHH19){
                        SHHflashinggSHH19 = false;
                        SHHupdateButtonColorSHH19();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime1SHH9(int secondsToAdd) {
        SHHyellowThresholdSHH19 += secondsToAdd;
        SHHredThresholdSHH19 += secondsToAdd;
        SHHupdateButtonColorSHH19();
    }


    private void SHHshowTimeDialogForButtonSHH20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("9號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH0(Time1SHH);

                    if(SHHsecSHH20 >= SHHblueThresholdSHH20){
                        SHHflashingSHH20 = true;
                        SHHupdateButtonColorSHH20();
                    }
                    if(SHHflashinggSHH20){
                        SHHflashinggSHH20 = false;
                        SHHupdateButtonColorSHH20();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH0(Time2SHH);

                    if(SHHsecSHH20 >= SHHblueThresholdSHH20){
                        SHHflashingSHH20 = true;
                        SHHupdateButtonColorSHH20();
                    }
                    if(SHHflashinggSHH20){
                        SHHflashinggSHH20 = false;
                        SHHupdateButtonColorSHH20();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH0(int secondsToAdd) {
        SHHyellowThresholdSHH20 += secondsToAdd;
        SHHredThresholdSHH20 += secondsToAdd;
        SHHupdateButtonColorSHH20();
    }


    private void SHHshowTimeDialogForButtonSHH21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("10號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH1(Time1SHH);

                    if(SHHsecSHH21 >= SHHblueThresholdSHH21){
                        SHHflashingSHH21 = true;
                        SHHupdateButtonColorSHH21();
                    }
                    if(SHHflashinggSHH21){
                        SHHflashinggSHH21 = false;
                        SHHupdateButtonColorSHH21();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH1(Time2SHH);

                    if(SHHsecSHH21 >= SHHblueThresholdSHH21){
                        SHHflashingSHH21 = true;
                        SHHupdateButtonColorSHH21();
                    }
                    if(SHHflashinggSHH21){
                        SHHflashinggSHH21 = false;
                        SHHupdateButtonColorSHH21();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH1(int secondsToAdd) {
        SHHyellowThresholdSHH21 += secondsToAdd;
        SHHredThresholdSHH21 += secondsToAdd;
        SHHupdateButtonColorSHH21();
    }


    private void SHHshowTimeDialogForButtonSHH22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("11號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH2(Time1SHH);

                    if(SHHsecSHH22 >= SHHblueThresholdSHH22){
                        SHHflashingSHH22 = true;
                        SHHupdateButtonColorSHH22();
                    }
                    if(SHHflashinggSHH22){
                        SHHflashinggSHH22 = false;
                        SHHupdateButtonColorSHH22();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH2(Time2SHH);

                    if(SHHsecSHH22 >= SHHblueThresholdSHH22){
                        SHHflashingSHH22 = true;
                        SHHupdateButtonColorSHH22();
                    }
                    if(SHHflashinggSHH22){
                        SHHflashinggSHH22 = false;
                        SHHupdateButtonColorSHH22();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH2(int secondsToAdd) {
        SHHyellowThresholdSHH22 += secondsToAdd;
        SHHredThresholdSHH22 += secondsToAdd;
        SHHupdateButtonColorSHH22();
    }


    private void SHHshowTimeDialogForButtonSHH23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("16號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH3(Time1SHH);

                    if(SHHsecSHH23 >= SHHblueThresholdSHH23){
                        SHHflashingSHH23 = true;
                        SHHupdateButtonColorSHH23();
                    }
                    if(SHHflashinggSHH23){
                        SHHflashinggSHH23 = false;
                        SHHupdateButtonColorSHH23();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH3(Time2SHH);

                    if(SHHsecSHH23 >= SHHblueThresholdSHH23){
                        SHHflashingSHH23 = true;
                        SHHupdateButtonColorSHH23();
                    }
                    if(SHHflashinggSHH23){
                        SHHflashinggSHH23 = false;
                        SHHupdateButtonColorSHH23();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH3(int secondsToAdd) {
        SHHyellowThresholdSHH23 += secondsToAdd;
        SHHredThresholdSHH23 += secondsToAdd;
        SHHupdateButtonColorSHH23();
    }


    private void SHHshowTimeDialogForButtonSHH24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("39號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH4(Time1SHH);

                    if(SHHsecSHH24 >= SHHblueThresholdSHH24){
                        SHHflashingSHH24 = true;
                        SHHupdateButtonColorSHH24();
                    }
                    if(SHHflashinggSHH24){
                        SHHflashinggSHH24 = false;
                        SHHupdateButtonColorSHH24();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH4(Time2SHH);

                    if(SHHsecSHH24 >= SHHblueThresholdSHH24){
                        SHHflashingSHH24 = true;
                        SHHupdateButtonColorSHH24();
                    }
                    if(SHHflashinggSHH24){
                        SHHflashinggSHH24 = false;
                        SHHupdateButtonColorSHH24();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH4(int secondsToAdd) {
        SHHyellowThresholdSHH24 += secondsToAdd;
        SHHredThresholdSHH24 += secondsToAdd;
        SHHupdateButtonColorSHH24();
    }


    private void SHHshowTimeDialogForButtonSHH25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("3號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH5(Time1SHH);

                    if(SHHsecSHH25 >= SHHblueThresholdSHH25){
                        SHHflashingSHH25 = true;
                        SHHupdateButtonColorSHH25();
                    }
                    if(SHHflashinggSHH25){
                        SHHflashinggSHH25 = false;
                        SHHupdateButtonColorSHH25();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH5(Time2SHH);

                    if(SHHsecSHH25 >= SHHblueThresholdSHH25){
                        SHHflashingSHH25 = true;
                        SHHupdateButtonColorSHH25();
                    }
                    if(SHHflashinggSHH25){
                        SHHflashinggSHH25 = false;
                        SHHupdateButtonColorSHH25();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH5(int secondsToAdd) {
        SHHyellowThresholdSHH25 += secondsToAdd;
        SHHredThresholdSHH25 += secondsToAdd;
        SHHupdateButtonColorSHH25();
    }


    private void SHHshowTimeDialogForButtonSHH26() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("12號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH6(Time1SHH);

                    if(SHHsecSHH26 >= SHHblueThresholdSHH26){
                        SHHflashingSHH26 = true;
                        SHHupdateButtonColorSHH26();
                    }
                    if(SHHflashinggSHH26){
                        SHHflashinggSHH26 = false;
                        SHHupdateButtonColorSHH26();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH6(Time2SHH);

                    if(SHHsecSHH26 >= SHHblueThresholdSHH26){
                        SHHflashingSHH26 = true;
                        SHHupdateButtonColorSHH26();
                    }
                    if(SHHflashinggSHH26){
                        SHHflashinggSHH26 = false;
                        SHHupdateButtonColorSHH26();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH6(int secondsToAdd) {
        SHHyellowThresholdSHH26 += secondsToAdd;
        SHHredThresholdSHH26 += secondsToAdd;
        SHHupdateButtonColorSHH26();
    }


    private void SHHshowTimeDialogForButtonSHH27() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("28號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH7(Time1SHH);

                    if(SHHsecSHH27 >= SHHblueThresholdSHH27){
                        SHHflashingSHH27 = true;
                        SHHupdateButtonColorSHH27();
                    }
                    if(SHHflashinggSHH27){
                        SHHflashinggSHH27 = false;
                        SHHupdateButtonColorSHH27();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH7(Time2SHH);

                    if(SHHsecSHH27 >= SHHblueThresholdSHH27){
                        SHHflashingSHH27 = true;
                        SHHupdateButtonColorSHH27();
                    }
                    if(SHHflashinggSHH27){
                        SHHflashinggSHH27 = false;
                        SHHupdateButtonColorSHH27();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH7(int secondsToAdd) {
        SHHyellowThresholdSHH27 += secondsToAdd;
        SHHredThresholdSHH27 += secondsToAdd;
        SHHupdateButtonColorSHH27();
    }


    private void SHHshowTimeDialogForButtonSHH28() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("29號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH8(Time1SHH);

                    if(SHHsecSHH28 >= SHHblueThresholdSHH28){
                        SHHflashingSHH28 = true;
                        SHHupdateButtonColorSHH28();
                    }
                    if(SHHflashinggSHH28){
                        SHHflashinggSHH28 = false;
                        SHHupdateButtonColorSHH28();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH8(Time2SHH);

                    if(SHHsecSHH28 >= SHHblueThresholdSHH28){
                        SHHflashingSHH28 = true;
                        SHHupdateButtonColorSHH28();
                    }
                    if(SHHflashinggSHH28){
                        SHHflashinggSHH28 = false;
                        SHHupdateButtonColorSHH28();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH8(int secondsToAdd) {
        SHHyellowThresholdSHH28 += secondsToAdd;
        SHHredThresholdSHH28 += secondsToAdd;
        SHHupdateButtonColorSHH28();
    }


    private void SHHshowTimeDialogForButtonSHH29() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("41號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime2SHH9(Time1SHH);

                    if(SHHsecSHH29 >= SHHblueThresholdSHH29){
                        SHHflashingSHH29 = true;
                        SHHupdateButtonColorSHH29();
                    }
                    if(SHHflashinggSHH29){
                        SHHflashinggSHH29 = false;
                        SHHupdateButtonColorSHH29();
                    }

                    break;
                case "60分鐘" :
                    addTime2SHH9(Time2SHH);

                    if(SHHsecSHH29 >= SHHblueThresholdSHH29){
                        SHHflashingSHH29 = true;
                        SHHupdateButtonColorSHH29();
                    }
                    if(SHHflashinggSHH29){
                        SHHflashinggSHH29 = false;
                        SHHupdateButtonColorSHH29();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime2SHH9(int secondsToAdd) {
        SHHyellowThresholdSHH29 += secondsToAdd;
        SHHredThresholdSHH29 += secondsToAdd;
        SHHupdateButtonColorSHH29();
    }


    private void SHHshowTimeDialogForButtonSHH30() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("45號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime30(Time1SHH);

                    if(SHHsecSHH30 >= SHHblueThresholdSHH30){
                        SHHflashingSHH30 = true;
                        SHHupdateButtonColorSHH30();
                    }
                    if(SHHflashinggSHH30){
                        SHHflashinggSHH30 = false;
                        SHHupdateButtonColorSHH30();
                    }

                    break;
                case "60分鐘" :
                    addTime30(Time2SHH);

                    if(SHHsecSHH30 >= SHHblueThresholdSHH30){
                        SHHflashingSHH30 = true;
                        SHHupdateButtonColorSHH30();
                    }
                    if(SHHflashinggSHH30){
                        SHHflashinggSHH30 = false;
                        SHHupdateButtonColorSHH30();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime30(int secondsToAdd) {
        SHHyellowThresholdSHH30 += secondsToAdd;
        SHHredThresholdSHH30 += secondsToAdd;
        SHHupdateButtonColorSHH30();
    }


    private void SHHshowTimeDialogForButtonSHH31() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("46號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime31(Time1SHH);

                    if(SHHsecSHH31 >= SHHblueThresholdSHH31){
                        SHHflashingSHH31 = true;
                        SHHupdateButtonColorSHH31();
                    }
                    if(SHHflashinggSHH31){
                        SHHflashinggSHH31 = false;
                        SHHupdateButtonColorSHH31();
                    }

                    break;
                case "60分鐘" :
                    addTime31(Time2SHH);

                    if(SHHsecSHH31 >= SHHblueThresholdSHH31){
                        SHHflashingSHH31 = true;
                        SHHupdateButtonColorSHH31();
                    }
                    if(SHHflashinggSHH31){
                        SHHflashinggSHH31 = false;
                        SHHupdateButtonColorSHH31();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime31(int secondsToAdd) {
        SHHyellowThresholdSHH31 += secondsToAdd;
        SHHredThresholdSHH31 += secondsToAdd;
        SHHupdateButtonColorSHH31();
    }


    private void SHHshowTimeDialogForButtonSHH32() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("47號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime32(Time1SHH);

                    if(SHHsecSHH32 >= SHHblueThresholdSHH32){
                        SHHflashingSHH32 = true;
                        SHHupdateButtonColorSHH32();
                    }
                    if(SHHflashinggSHH32){
                        SHHflashinggSHH32 = false;
                        SHHupdateButtonColorSHH32();
                    }

                    break;
                case "60分鐘" :
                    addTime32(Time2SHH);

                    if(SHHsecSHH32 >= SHHblueThresholdSHH32){
                        SHHflashingSHH32 = true;
                        SHHupdateButtonColorSHH32();
                    }
                    if(SHHflashinggSHH32){
                        SHHflashinggSHH32 = false;
                        SHHupdateButtonColorSHH32();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime32(int secondsToAdd) {
        SHHyellowThresholdSHH32 += secondsToAdd;
        SHHredThresholdSHH32 += secondsToAdd;
        SHHupdateButtonColorSHH32();
    }


    private void SHHshowTimeDialogForButtonSHH33() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("48號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        SoupHouseHoliday.CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘" :
                    addTime33(Time1SHH);

                    if(SHHsecSHH33 >= SHHblueThresholdSHH33){
                        SHHflashingSHH33 = true;
                        SHHupdateButtonColorSHH33();
                    }
                    if(SHHflashinggSHH33){
                        SHHflashinggSHH33 = false;
                        SHHupdateButtonColorSHH33();
                    }

                    break;
                case "60分鐘" :
                    addTime33(Time2SHH);

                    if(SHHsecSHH33 >= SHHblueThresholdSHH33){
                        SHHflashingSHH33 = true;
                        SHHupdateButtonColorSHH33();
                    }
                    if(SHHflashinggSHH33){
                        SHHflashinggSHH33 = false;
                        SHHupdateButtonColorSHH33();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void addTime33(int secondsToAdd) {
        SHHyellowThresholdSHH33 += secondsToAdd;
        SHHredThresholdSHH33 += secondsToAdd;
        SHHupdateButtonColorSHH33();
    }


    //----------------------------------

    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------

    final private double check = 0.01;
    private void SHHupdateButtonColorSHH101() {
        if (SHHsecSHH101 < check) {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH101 < SHHblueThresholdSHH101 && SHHpeopleSHH_101) {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH101 < SHHblueThresholdSHH101 && !SHHpeopleSHH_101 ) {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH101 < SHHyellowThresholdSHH101 && SHHpeopleSHH_101) {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH101 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation2);
                SHHbtnTimerSHH101.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH101.clearAnimation();
            }
        } else if (SHHsecSHH101 < SHHyellowThresholdSHH101 && !SHHpeopleSHH_101) {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH101 < SHHredThresholdSHH101) {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH101 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation2);
                SHHbtnTimerSHH101.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH101.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH101.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH101.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH102() {
        if (SHHsecSHH102 < check) {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH102 < SHHblueThresholdSHH102 && SHHpeopleSHH_102) {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH102 < SHHblueThresholdSHH102 && !SHHpeopleSHH_102 ) {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH102 < SHHyellowThresholdSHH102 && SHHpeopleSHH_102) {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH102 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH102.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH102.clearAnimation();
            }
        } else if (SHHsecSHH102 < SHHyellowThresholdSHH102 && !SHHpeopleSHH_102) {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH102 < SHHredThresholdSHH102) {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH102 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH102.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH102.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH102.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH102.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH103() {
        if (SHHsecSHH103 < check) {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH103 < SHHblueThresholdSHH103 && SHHpeopleSHH_103) {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH103 < SHHblueThresholdSHH103 && !SHHpeopleSHH_103 ) {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH103 < SHHyellowThresholdSHH103 && SHHpeopleSHH_103) {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH103 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH103.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH103.clearAnimation();
            }
        } else if (SHHsecSHH103 < SHHyellowThresholdSHH103 && !SHHpeopleSHH_103) {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH103 < SHHredThresholdSHH103) {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH103 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH103.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH103.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH103.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH103.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH104() {
        if (SHHsecSHH104 < check) {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH104 < SHHblueThresholdSHH104 && SHHpeopleSHH_104) {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH104 < SHHblueThresholdSHH104 && !SHHpeopleSHH_104 ) {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH104 < SHHyellowThresholdSHH104 && SHHpeopleSHH_104) {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH104 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH104.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH104.clearAnimation();
            }
        } else if (SHHsecSHH104 < SHHyellowThresholdSHH104 && !SHHpeopleSHH_104) {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH104 < SHHredThresholdSHH104) {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH104 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH104.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH104.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH104.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH104.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH105() {
        if (SHHsecSHH105 < check) {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH105 < SHHblueThresholdSHH105 && SHHpeopleSHH_105) {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH105 < SHHblueThresholdSHH105 && !SHHpeopleSHH_105 ) {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH105 < SHHyellowThresholdSHH105 && SHHpeopleSHH_105) {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH105 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH105.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH105.clearAnimation();
            }
        } else if (SHHsecSHH105 < SHHyellowThresholdSHH105 && !SHHpeopleSHH_105) {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH105 < SHHredThresholdSHH105) {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH105 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH105.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH105.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH105.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH105.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH106() {
        if (SHHsecSHH106 < check) {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH106 < SHHblueThresholdSHH106 && SHHpeopleSHH_106) {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH106 < SHHblueThresholdSHH106 && !SHHpeopleSHH_106 ) {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH106 < SHHyellowThresholdSHH106 && SHHpeopleSHH_106) {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH106 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH106.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH106.clearAnimation();
            }
        } else if (SHHsecSHH106 < SHHyellowThresholdSHH106 && !SHHpeopleSHH_106) {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH106 < SHHredThresholdSHH106) {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH106 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH106.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH106.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH106.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH106.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH107() {
        if (SHHsecSHH107 < check) {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH107 < SHHblueThresholdSHH107 && SHHpeopleSHH_107) {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH107 < SHHblueThresholdSHH107 && !SHHpeopleSHH_107 ) {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH107 < SHHyellowThresholdSHH107 && SHHpeopleSHH_107) {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH107 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH107.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH107.clearAnimation();
            }
        } else if (SHHsecSHH107 < SHHyellowThresholdSHH107 && !SHHpeopleSHH_107) {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH107 < SHHredThresholdSHH107) {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH107 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH107.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH107.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH107.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH107.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH8() {
        if (SHHsecSHH8 < check) {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH8 < SHHblueThresholdSHH8 && SHHpeopleSHH_8) {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH8 < SHHblueThresholdSHH8 && !SHHpeopleSHH_8 ) {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH8 < SHHyellowThresholdSHH8 && SHHpeopleSHH_8) {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH8.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH8.clearAnimation();
            }
        } else if (SHHsecSHH8 < SHHyellowThresholdSHH8 && !SHHpeopleSHH_8) {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH8 < SHHredThresholdSHH8) {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH8.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH8.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH8.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH8.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH9() {
        if (SHHsecSHH9 < check) {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH9 < SHHblueThresholdSHH9 && SHHpeopleSHH_9) {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH9 < SHHblueThresholdSHH9 && !SHHpeopleSHH_9 ) {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH9 < SHHyellowThresholdSHH9 && SHHpeopleSHH_9) {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH9.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH9.clearAnimation();
            }
        } else if (SHHsecSHH9 < SHHyellowThresholdSHH9 && !SHHpeopleSHH_9) {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH9 < SHHredThresholdSHH9) {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH9.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH9.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH9.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH9.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH10() {
        if (SHHsecSHH10 < check) {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH10 < SHHblueThresholdSHH10 && SHHpeopleSHH_10) {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH10 < SHHblueThresholdSHH10 && !SHHpeopleSHH_10 ) {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH10 < SHHyellowThresholdSHH10 && SHHpeopleSHH_10) {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH10.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH10.clearAnimation();
            }
        } else if (SHHsecSHH10 < SHHyellowThresholdSHH10 && !SHHpeopleSHH_10) {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH10 < SHHredThresholdSHH10) {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH10.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH10.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH10.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH10.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH11() {
        if (SHHsecSHH11 < check) {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH11 < SHHblueThresholdSHH11 && SHHpeopleSHH_11) {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH11 < SHHblueThresholdSHH11 && !SHHpeopleSHH_11 ) {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH11 < SHHyellowThresholdSHH11 && SHHpeopleSHH_11) {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH11.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH11.clearAnimation();
            }
        } else if (SHHsecSHH11 < SHHyellowThresholdSHH11 && !SHHpeopleSHH_11) {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH11 < SHHredThresholdSHH11) {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH11.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH11.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH11.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH11.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH12() {
        if (SHHsecSHH12 < check) {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH12 < SHHblueThresholdSHH12 && SHHpeopleSHH_12) {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH12 < SHHblueThresholdSHH12 && !SHHpeopleSHH_12 ) {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH12 < SHHyellowThresholdSHH12 && SHHpeopleSHH_12) {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH12 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH12.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH12.clearAnimation();
            }
        } else if (SHHsecSHH12 < SHHyellowThresholdSHH12 && !SHHpeopleSHH_12) {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH12 < SHHredThresholdSHH12) {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH12 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH12.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH12.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH12.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH12.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH13() {
        if (SHHsecSHH13 < check) {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH13 < SHHblueThresholdSHH13 && SHHpeopleSHH_13) {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH13 < SHHblueThresholdSHH13 && !SHHpeopleSHH_13 ) {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH13 < SHHyellowThresholdSHH13 && SHHpeopleSHH_13) {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH13 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH13.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH13.clearAnimation();
            }
        } else if (SHHsecSHH13 < SHHyellowThresholdSHH13 && !SHHpeopleSHH_13) {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH13 < SHHredThresholdSHH13) {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH13 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH13.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH13.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH13.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH13.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH14() {
        if (SHHsecSHH14 < check) {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH14 < SHHblueThresholdSHH14 && SHHpeopleSHH_14) {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH14 < SHHblueThresholdSHH14 && !SHHpeopleSHH_14 ) {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH14 < SHHyellowThresholdSHH14 && SHHpeopleSHH_14) {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH14 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH14.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH14.clearAnimation();
            }
        } else if (SHHsecSHH14 < SHHyellowThresholdSHH14 && !SHHpeopleSHH_14) {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH14 < SHHredThresholdSHH14) {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH14 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH14.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH14.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH14.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH14.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH15() {
        if (SHHsecSHH15 < check) {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH15 < SHHblueThresholdSHH15 && SHHpeopleSHH_15) {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH15 < SHHblueThresholdSHH15 && !SHHpeopleSHH_15 ) {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH15 < SHHyellowThresholdSHH15 && SHHpeopleSHH_15) {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH15 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH15.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH15.clearAnimation();
            }
        } else if (SHHsecSHH15 < SHHyellowThresholdSHH15 && !SHHpeopleSHH_15) {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH15 < SHHredThresholdSHH15) {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH15 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH15.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH15.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH15.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH15.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH16() {
        if (SHHsecSHH16 < check) {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH16 < SHHblueThresholdSHH16 && SHHpeopleSHH_16) {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH16 < SHHblueThresholdSHH16 && !SHHpeopleSHH_16 ) {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH16 < SHHyellowThresholdSHH16 && SHHpeopleSHH_16) {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH16.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH16.clearAnimation();
            }
        } else if (SHHsecSHH16 < SHHyellowThresholdSHH16 && !SHHpeopleSHH_16) {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH16 < SHHredThresholdSHH16) {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH16.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH16.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH16.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH16.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH17() {
        if (SHHsecSHH17 < check) {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH17 < SHHblueThresholdSHH17 && SHHpeopleSHH_17) {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH17 < SHHblueThresholdSHH17 && !SHHpeopleSHH_17 ) {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH17 < SHHyellowThresholdSHH17 && SHHpeopleSHH_17) {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH17.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH17.clearAnimation();
            }
        } else if (SHHsecSHH17 < SHHyellowThresholdSHH17 && !SHHpeopleSHH_17) {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH17 < SHHredThresholdSHH17) {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH17.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH17.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH17.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH17.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH18() {
        if (SHHsecSHH18 < check) {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH18 < SHHblueThresholdSHH18 && SHHpeopleSHH_18) {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH18 < SHHblueThresholdSHH18 && !SHHpeopleSHH_18 ) {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH18 < SHHyellowThresholdSHH18 && SHHpeopleSHH_18) {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH18.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH18.clearAnimation();
            }
        } else if (SHHsecSHH18 < SHHyellowThresholdSHH18 && !SHHpeopleSHH_18) {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH18 < SHHredThresholdSHH18) {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH18.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH18.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH18.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH18.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH19() {
        if (SHHsecSHH19 < check) {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH19 < SHHblueThresholdSHH19 && SHHpeopleSHH_19) {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH19 < SHHblueThresholdSHH19 && !SHHpeopleSHH_19 ) {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH19 < SHHyellowThresholdSHH19 && SHHpeopleSHH_19) {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH19.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH19.clearAnimation();
            }
        } else if (SHHsecSHH19 < SHHyellowThresholdSHH19 && !SHHpeopleSHH_19) {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH19 < SHHredThresholdSHH19) {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH19.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH19.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH19.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH19.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH20() {
        if (SHHsecSHH20 < check) {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH20 < SHHblueThresholdSHH20 && SHHpeopleSHH_20) {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH20 < SHHblueThresholdSHH20 && !SHHpeopleSHH_20 ) {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH20 < SHHyellowThresholdSHH20 && SHHpeopleSHH_20) {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH20.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH20.clearAnimation();
            }
        } else if (SHHsecSHH20 < SHHyellowThresholdSHH20 && !SHHpeopleSHH_20) {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH20 < SHHredThresholdSHH20) {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH20.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH20.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH20.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH20.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH21() {
        if (SHHsecSHH21 < check) {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH21 < SHHblueThresholdSHH21 && SHHpeopleSHH_21) {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH21 < SHHblueThresholdSHH21 && !SHHpeopleSHH_21 ) {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH21 < SHHyellowThresholdSHH21 && SHHpeopleSHH_21) {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH21.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH21.clearAnimation();
            }
        } else if (SHHsecSHH21 < SHHyellowThresholdSHH21 && !SHHpeopleSHH_21) {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH21 < SHHredThresholdSHH21) {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH21.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH21.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH21.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH21.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH22() {
        if (SHHsecSHH22 < check) {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH22 < SHHblueThresholdSHH22 && SHHpeopleSHH_22) {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH22 < SHHblueThresholdSHH22 && !SHHpeopleSHH_22 ) {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH22 < SHHyellowThresholdSHH22 && SHHpeopleSHH_22) {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH22.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH22.clearAnimation();
            }
        } else if (SHHsecSHH22 < SHHyellowThresholdSHH22 && !SHHpeopleSHH_22) {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH22 < SHHredThresholdSHH22) {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH22.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH22.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH22.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH22.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH23() {
        if (SHHsecSHH23 < check) {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH23 < SHHblueThresholdSHH23 && SHHpeopleSHH_23) {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH23 < SHHblueThresholdSHH23 && !SHHpeopleSHH_23 ) {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH23 < SHHyellowThresholdSHH23 && SHHpeopleSHH_23) {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH23.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH23.clearAnimation();
            }
        } else if (SHHsecSHH23 < SHHyellowThresholdSHH23 && !SHHpeopleSHH_23) {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH23 < SHHredThresholdSHH23) {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH23.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH23.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH23.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH23.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH24() {
        if (SHHsecSHH24 < check) {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH24 < SHHblueThresholdSHH24 && SHHpeopleSHH_24) {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH24 < SHHblueThresholdSHH24 && !SHHpeopleSHH_24 ) {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH24 < SHHyellowThresholdSHH24 && SHHpeopleSHH_24) {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH24.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH24.clearAnimation();
            }
        } else if (SHHsecSHH24 < SHHyellowThresholdSHH24 && !SHHpeopleSHH_24) {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH24 < SHHredThresholdSHH24) {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH24.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH24.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH24.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH24.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH25() {
        if (SHHsecSHH25 < check) {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH25 < SHHblueThresholdSHH25 && SHHpeopleSHH_25) {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH25 < SHHblueThresholdSHH25 && !SHHpeopleSHH_25 ) {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH25 < SHHyellowThresholdSHH25 && SHHpeopleSHH_25) {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH25.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH25.clearAnimation();
            }
        } else if (SHHsecSHH25 < SHHyellowThresholdSHH25 && !SHHpeopleSHH_25) {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH25 < SHHredThresholdSHH25) {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH25.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH25.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH25.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH25.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH26() {
        if (SHHsecSHH26 < check) {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH26 < SHHblueThresholdSHH26 && SHHpeopleSHH_26) {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH26 < SHHblueThresholdSHH26 && !SHHpeopleSHH_26 ) {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH26 < SHHyellowThresholdSHH26 && SHHpeopleSHH_26) {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH26.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH26.clearAnimation();
            }
        } else if (SHHsecSHH26 < SHHyellowThresholdSHH26 && !SHHpeopleSHH_26) {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH26 < SHHredThresholdSHH26) {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH26.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH26.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH26.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH26.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH27() {
        if (SHHsecSHH27 < check) {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH27 < SHHblueThresholdSHH27 && SHHpeopleSHH_27) {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH27 < SHHblueThresholdSHH27 && !SHHpeopleSHH_27 ) {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH27 < SHHyellowThresholdSHH27 && SHHpeopleSHH_27) {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH27.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH27.clearAnimation();
            }
        } else if (SHHsecSHH27 < SHHyellowThresholdSHH27 && !SHHpeopleSHH_27) {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH27 < SHHredThresholdSHH27) {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH27.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH27.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH27.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH27.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH28() {
        if (SHHsecSHH28 < check) {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH28 < SHHblueThresholdSHH28 && SHHpeopleSHH_28) {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH28 < SHHblueThresholdSHH28 && !SHHpeopleSHH_28 ) {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH28 < SHHyellowThresholdSHH28 && SHHpeopleSHH_28) {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH28.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH28.clearAnimation();
            }
        } else if (SHHsecSHH28 < SHHyellowThresholdSHH28 && !SHHpeopleSHH_28) {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH28 < SHHredThresholdSHH28) {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH28.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH28.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH28.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH28.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH29() {
        if (SHHsecSHH29 < check) {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH29 < SHHblueThresholdSHH29 && SHHpeopleSHH_29) {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH29 < SHHblueThresholdSHH29 && !SHHpeopleSHH_29 ) {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH29 < SHHyellowThresholdSHH29 && SHHpeopleSHH_29) {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH29 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH29.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH29.clearAnimation();
            }
        } else if (SHHsecSHH29 < SHHyellowThresholdSHH29 && !SHHpeopleSHH_29) {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH29 < SHHredThresholdSHH29) {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH29 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH29.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH29.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH29.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH29.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH30() {
        if (SHHsecSHH30 < check) {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH30 < SHHblueThresholdSHH30 && SHHpeopleSHH_30) {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH30 < SHHblueThresholdSHH30 && !SHHpeopleSHH_30 ) {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH30 < SHHyellowThresholdSHH30 && SHHpeopleSHH_30) {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH30 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH30.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH30.clearAnimation();
            }
        } else if (SHHsecSHH30 < SHHyellowThresholdSHH30 && !SHHpeopleSHH_30) {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH30 < SHHredThresholdSHH30) {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH30 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH30.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH30.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH30.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH30.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH31() {
        if (SHHsecSHH31 < check) {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH31 < SHHblueThresholdSHH31 && SHHpeopleSHH_31) {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH31 < SHHblueThresholdSHH31 && !SHHpeopleSHH_31 ) {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH31 < SHHyellowThresholdSHH31 && SHHpeopleSHH_31) {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH31 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH31.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH31.clearAnimation();
            }
        } else if (SHHsecSHH31 < SHHyellowThresholdSHH31 && !SHHpeopleSHH_31) {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH31 < SHHredThresholdSHH31) {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH31 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH31.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH31.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH31.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH31.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH32() {
        if (SHHsecSHH32 < check) {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH32 < SHHblueThresholdSHH32 && SHHpeopleSHH_32) {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH32 < SHHblueThresholdSHH32 && !SHHpeopleSHH_32 ) {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH32 < SHHyellowThresholdSHH32 && SHHpeopleSHH_32) {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH32 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH32.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH32.clearAnimation();
            }
        } else if (SHHsecSHH32 < SHHyellowThresholdSHH32 && !SHHpeopleSHH_32) {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH32 < SHHredThresholdSHH32) {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH32 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH32.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH32.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH32.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH32.clearAnimation();
        }
    }


    private void SHHupdateButtonColorSHH33() {
        if (SHHsecSHH33 < check) {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (SHHsecSHH33 < SHHblueThresholdSHH33 && SHHpeopleSHH_33) {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (SHHsecSHH33 < SHHblueThresholdSHH33 && !SHHpeopleSHH_33 ) {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH33 < SHHyellowThresholdSHH33 && SHHpeopleSHH_33) {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!SHHflashingSHH33 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH33.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH33.clearAnimation();
            }
        } else if (SHHsecSHH33 < SHHyellowThresholdSHH33 && !SHHpeopleSHH_33) {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (SHHsecSHH33 < SHHredThresholdSHH33) {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!SHHflashinggSHH33 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                SHHbtnTimerSHH33.startAnimation(blinkAnimation);
            }else{
                SHHbtnTimerSHH33.clearAnimation();
            }
        } else {
            SHHbtnTimerSHH33.setBackgroundColor(getResources().getColor(R.color.red));
            SHHbtnTimerSHH33.clearAnimation();
        }
    }

}
