package com.spotify.musicappplatform.state.processor.AppLifecycleServiceCaller;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AppLifecycleServiceCaller extends Enum	// class@000a9b from classes.dex
{
    private static final AppLifecycleServiceCaller[] $VALUES;
    public static final AppLifecycleServiceCaller ACTION_URL_OPEN;
    public static final AppLifecycleServiceCaller CLIENT_WANTS_SERVICE_TO_DIE;
    public static final AppLifecycleServiceCaller IDLE_SHUTDOWN_TIME;
    public static final AppLifecycleServiceCaller MEDIA_BUTTON_BACKGROUND;
    public static final AppLifecycleServiceCaller MEDIA_BUTTON_FOREGROUND;
    public static final AppLifecycleServiceCaller NOTIFICATION_CLOSE;
    public static final AppLifecycleServiceCaller PLAYER_REQUEST_AUDIO_SESSION;
    public static final AppLifecycleServiceCaller PREPARE_ALARM;
    public static final AppLifecycleServiceCaller REQUEST_WIDGET_UPDATE;
    public static final AppLifecycleServiceCaller SESSION_LOGOUT;
    public static final AppLifecycleServiceCaller START_SERVICE;
    public static final AppLifecycleServiceCaller STOP_SERVICE;
    public static final AppLifecycleServiceCaller WEAK_SHUTDOWN_TIME;
    public static final AppLifecycleServiceCaller WIDGET_PLAYER_PAUSE;
    public static final AppLifecycleServiceCaller WIDGET_PLAYER_RESUME;
    public static final AppLifecycleServiceCaller WIDGET_PLAYER_SKIP_NEXT;
    public static final AppLifecycleServiceCaller WIDGET_PLAYER_SKIP_PREV;

    private static final AppLifecycleServiceCaller[] $values(){
       AppLifecycleServiceCaller[] uAppLifecycl = new AppLifecycleServiceCaller[17];
       uAppLifecycl[0] = AppLifecycleServiceCaller.IDLE_SHUTDOWN_TIME;
       uAppLifecycl[1] = AppLifecycleServiceCaller.WEAK_SHUTDOWN_TIME;
       uAppLifecycl[2] = AppLifecycleServiceCaller.ACTION_URL_OPEN;
       uAppLifecycl[3] = AppLifecycleServiceCaller.MEDIA_BUTTON_FOREGROUND;
       uAppLifecycl[4] = AppLifecycleServiceCaller.MEDIA_BUTTON_BACKGROUND;
       uAppLifecycl[5] = AppLifecycleServiceCaller.NOTIFICATION_CLOSE;
       uAppLifecycl[6] = AppLifecycleServiceCaller.PREPARE_ALARM;
       uAppLifecycl[7] = AppLifecycleServiceCaller.SESSION_LOGOUT;
       uAppLifecycl[8] = AppLifecycleServiceCaller.PLAYER_REQUEST_AUDIO_SESSION;
       uAppLifecycl[9] = AppLifecycleServiceCaller.CLIENT_WANTS_SERVICE_TO_DIE;
       uAppLifecycl[10] = AppLifecycleServiceCaller.REQUEST_WIDGET_UPDATE;
       uAppLifecycl[11] = AppLifecycleServiceCaller.WIDGET_PLAYER_SKIP_PREV;
       uAppLifecycl[12] = AppLifecycleServiceCaller.WIDGET_PLAYER_PAUSE;
       uAppLifecycl[13] = AppLifecycleServiceCaller.WIDGET_PLAYER_RESUME;
       uAppLifecycl[14] = AppLifecycleServiceCaller.WIDGET_PLAYER_SKIP_NEXT;
       uAppLifecycl[15] = AppLifecycleServiceCaller.START_SERVICE;
       uAppLifecycl[16] = AppLifecycleServiceCaller.STOP_SERVICE;
       return uAppLifecycl;
    }
    static {
       AppLifecycleServiceCaller.IDLE_SHUTDOWN_TIME = new AppLifecycleServiceCaller("IDLE_SHUTDOWN_TIME", 0);
       AppLifecycleServiceCaller.WEAK_SHUTDOWN_TIME = new AppLifecycleServiceCaller("WEAK_SHUTDOWN_TIME", 1);
       AppLifecycleServiceCaller.ACTION_URL_OPEN = new AppLifecycleServiceCaller("ACTION_URL_OPEN", 2);
       AppLifecycleServiceCaller.MEDIA_BUTTON_FOREGROUND = new AppLifecycleServiceCaller("MEDIA_BUTTON_FOREGROUND", 3);
       AppLifecycleServiceCaller.MEDIA_BUTTON_BACKGROUND = new AppLifecycleServiceCaller("MEDIA_BUTTON_BACKGROUND", 4);
       AppLifecycleServiceCaller.NOTIFICATION_CLOSE = new AppLifecycleServiceCaller("NOTIFICATION_CLOSE", 5);
       AppLifecycleServiceCaller.PREPARE_ALARM = new AppLifecycleServiceCaller("PREPARE_ALARM", 6);
       AppLifecycleServiceCaller.SESSION_LOGOUT = new AppLifecycleServiceCaller("SESSION_LOGOUT", 7);
       AppLifecycleServiceCaller.PLAYER_REQUEST_AUDIO_SESSION = new AppLifecycleServiceCaller("PLAYER_REQUEST_AUDIO_SESSION", 8);
       AppLifecycleServiceCaller.CLIENT_WANTS_SERVICE_TO_DIE = new AppLifecycleServiceCaller("CLIENT_WANTS_SERVICE_TO_DIE", 9);
       AppLifecycleServiceCaller.REQUEST_WIDGET_UPDATE = new AppLifecycleServiceCaller("REQUEST_WIDGET_UPDATE", 10);
       AppLifecycleServiceCaller.WIDGET_PLAYER_SKIP_PREV = new AppLifecycleServiceCaller("WIDGET_PLAYER_SKIP_PREV", 11);
       AppLifecycleServiceCaller.WIDGET_PLAYER_PAUSE = new AppLifecycleServiceCaller("WIDGET_PLAYER_PAUSE", 12);
       AppLifecycleServiceCaller.WIDGET_PLAYER_RESUME = new AppLifecycleServiceCaller("WIDGET_PLAYER_RESUME", 13);
       AppLifecycleServiceCaller.WIDGET_PLAYER_SKIP_NEXT = new AppLifecycleServiceCaller("WIDGET_PLAYER_SKIP_NEXT", 14);
       AppLifecycleServiceCaller.START_SERVICE = new AppLifecycleServiceCaller("START_SERVICE", 15);
       AppLifecycleServiceCaller.STOP_SERVICE = new AppLifecycleServiceCaller("STOP_SERVICE", 16);
       AppLifecycleServiceCaller.$VALUES = AppLifecycleServiceCaller.$values();
    }
    private void AppLifecycleServiceCaller(String p0,int p1){
       super(p0, p1);
    }
    public static AppLifecycleServiceCaller valueOf(String p0){
       return Enum.valueOf(AppLifecycleServiceCaller.class, p0);
    }
    public static AppLifecycleServiceCaller[] values(){
       return AppLifecycleServiceCaller.$VALUES.clone();
    }
}
