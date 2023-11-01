package com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AppLifecycleServicePendingIntent extends Enum	// class@000a9c from classes.dex
{
    private static final AppLifecycleServicePendingIntent[] $VALUES;
    public static final AppLifecycleServicePendingIntent ADD_TO_COLLECTION;
    public static final AppLifecycleServicePendingIntent ADD_TO_PLAYLIST;
    public static final AppLifecycleServicePendingIntent ADD_TO_QUEUE;
    public static final AppLifecycleServicePendingIntent ADD_TO_YOUR_EPISODE;
    public static final AppLifecycleServicePendingIntent BAN_FROM_COLLECTION;
    public static final AppLifecycleServicePendingIntent DISMISS;
    public static final AppLifecycleServicePendingIntent DOWNLOAD;
    public static final AppLifecycleServicePendingIntent EMAIL_VERIFY;
    public static final AppLifecycleServicePendingIntent NOTIFICATION_CHANGE_SEGMENT;
    public static final AppLifecycleServicePendingIntent OPEN_PUSH_SETTINGS;
    public static final AppLifecycleServicePendingIntent OPEN_URL;
    public static final AppLifecycleServicePendingIntent PLAYBACK_NOTIFICATION_CLOSE;
    public static final AppLifecycleServicePendingIntent PLAYER_PAUSE;
    public static final AppLifecycleServicePendingIntent PLAYER_RESUME;
    public static final AppLifecycleServicePendingIntent PLAYER_SEEK_BACK_15_SEC;
    public static final AppLifecycleServicePendingIntent PLAYER_SEEK_FORWARD_15_SEC;
    public static final AppLifecycleServicePendingIntent PLAYER_SKIP_NEXT;
    public static final AppLifecycleServicePendingIntent PLAYER_SKIP_PREV;
    public static final AppLifecycleServicePendingIntent PLAYER_TURN_OFF_SHUFFLE;
    public static final AppLifecycleServicePendingIntent PLAYER_TURN_ON_SHUFFLE;
    public static final AppLifecycleServicePendingIntent PLAY_AND_NAVIGATE;
    public static final AppLifecycleServicePendingIntent REMOVE_FROM_COLLECTION;
    public static final AppLifecycleServicePendingIntent SAVE_ENTITY;
    public static final AppLifecycleServicePendingIntent START_PLAYBACK;
    public static final AppLifecycleServicePendingIntent UNBAN_FROM_COLLECTION;

    private static final AppLifecycleServicePendingIntent[] $values(){
       AppLifecycleServicePendingIntent[] uAppLifecycl = new AppLifecycleServicePendingIntent[25];
       uAppLifecycl[0] = AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE;
       uAppLifecycl[1] = AppLifecycleServicePendingIntent.NOTIFICATION_CHANGE_SEGMENT;
       uAppLifecycl[2] = AppLifecycleServicePendingIntent.OPEN_URL;
       uAppLifecycl[3] = AppLifecycleServicePendingIntent.SAVE_ENTITY;
       uAppLifecycl[4] = AppLifecycleServicePendingIntent.PLAY_AND_NAVIGATE;
       uAppLifecycl[5] = AppLifecycleServicePendingIntent.OPEN_PUSH_SETTINGS;
       uAppLifecycl[6] = AppLifecycleServicePendingIntent.DISMISS;
       uAppLifecycl[7] = AppLifecycleServicePendingIntent.EMAIL_VERIFY;
       uAppLifecycl[8] = AppLifecycleServicePendingIntent.START_PLAYBACK;
       uAppLifecycl[9] = AppLifecycleServicePendingIntent.ADD_TO_PLAYLIST;
       uAppLifecycl[10] = AppLifecycleServicePendingIntent.ADD_TO_QUEUE;
       uAppLifecycl[11] = AppLifecycleServicePendingIntent.ADD_TO_YOUR_EPISODE;
       uAppLifecycl[12] = AppLifecycleServicePendingIntent.DOWNLOAD;
       uAppLifecycl[13] = AppLifecycleServicePendingIntent.ADD_TO_COLLECTION;
       uAppLifecycl[14] = AppLifecycleServicePendingIntent.REMOVE_FROM_COLLECTION;
       uAppLifecycl[15] = AppLifecycleServicePendingIntent.BAN_FROM_COLLECTION;
       uAppLifecycl[16] = AppLifecycleServicePendingIntent.UNBAN_FROM_COLLECTION;
       uAppLifecycl[17] = AppLifecycleServicePendingIntent.PLAYER_SKIP_PREV;
       uAppLifecycl[18] = AppLifecycleServicePendingIntent.PLAYER_PAUSE;
       uAppLifecycl[19] = AppLifecycleServicePendingIntent.PLAYER_RESUME;
       uAppLifecycl[20] = AppLifecycleServicePendingIntent.PLAYER_SEEK_BACK_15_SEC;
       uAppLifecycl[21] = AppLifecycleServicePendingIntent.PLAYER_SEEK_FORWARD_15_SEC;
       uAppLifecycl[22] = AppLifecycleServicePendingIntent.PLAYER_SKIP_NEXT;
       uAppLifecycl[23] = AppLifecycleServicePendingIntent.PLAYER_TURN_ON_SHUFFLE;
       uAppLifecycl[24] = AppLifecycleServicePendingIntent.PLAYER_TURN_OFF_SHUFFLE;
       return uAppLifecycl;
    }
    static {
       AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE = new AppLifecycleServicePendingIntent("PLAYBACK_NOTIFICATION_CLOSE", 0);
       AppLifecycleServicePendingIntent.NOTIFICATION_CHANGE_SEGMENT = new AppLifecycleServicePendingIntent("NOTIFICATION_CHANGE_SEGMENT", 1);
       AppLifecycleServicePendingIntent.OPEN_URL = new AppLifecycleServicePendingIntent("OPEN_URL", 2);
       AppLifecycleServicePendingIntent.SAVE_ENTITY = new AppLifecycleServicePendingIntent("SAVE_ENTITY", 3);
       AppLifecycleServicePendingIntent.PLAY_AND_NAVIGATE = new AppLifecycleServicePendingIntent("PLAY_AND_NAVIGATE", 4);
       AppLifecycleServicePendingIntent.OPEN_PUSH_SETTINGS = new AppLifecycleServicePendingIntent("OPEN_PUSH_SETTINGS", 5);
       AppLifecycleServicePendingIntent.DISMISS = new AppLifecycleServicePendingIntent("DISMISS", 6);
       AppLifecycleServicePendingIntent.EMAIL_VERIFY = new AppLifecycleServicePendingIntent("EMAIL_VERIFY", 7);
       AppLifecycleServicePendingIntent.START_PLAYBACK = new AppLifecycleServicePendingIntent("START_PLAYBACK", 8);
       AppLifecycleServicePendingIntent.ADD_TO_PLAYLIST = new AppLifecycleServicePendingIntent("ADD_TO_PLAYLIST", 9);
       AppLifecycleServicePendingIntent.ADD_TO_QUEUE = new AppLifecycleServicePendingIntent("ADD_TO_QUEUE", 10);
       AppLifecycleServicePendingIntent.ADD_TO_YOUR_EPISODE = new AppLifecycleServicePendingIntent("ADD_TO_YOUR_EPISODE", 11);
       AppLifecycleServicePendingIntent.DOWNLOAD = new AppLifecycleServicePendingIntent("DOWNLOAD", 12);
       AppLifecycleServicePendingIntent.ADD_TO_COLLECTION = new AppLifecycleServicePendingIntent("ADD_TO_COLLECTION", 13);
       AppLifecycleServicePendingIntent.REMOVE_FROM_COLLECTION = new AppLifecycleServicePendingIntent("REMOVE_FROM_COLLECTION", 14);
       AppLifecycleServicePendingIntent.BAN_FROM_COLLECTION = new AppLifecycleServicePendingIntent("BAN_FROM_COLLECTION", 15);
       AppLifecycleServicePendingIntent.UNBAN_FROM_COLLECTION = new AppLifecycleServicePendingIntent("UNBAN_FROM_COLLECTION", 16);
       AppLifecycleServicePendingIntent.PLAYER_SKIP_PREV = new AppLifecycleServicePendingIntent("PLAYER_SKIP_PREV", 17);
       AppLifecycleServicePendingIntent.PLAYER_PAUSE = new AppLifecycleServicePendingIntent("PLAYER_PAUSE", 18);
       AppLifecycleServicePendingIntent.PLAYER_RESUME = new AppLifecycleServicePendingIntent("PLAYER_RESUME", 19);
       AppLifecycleServicePendingIntent.PLAYER_SEEK_BACK_15_SEC = new AppLifecycleServicePendingIntent("PLAYER_SEEK_BACK_15_SEC", 20);
       AppLifecycleServicePendingIntent.PLAYER_SEEK_FORWARD_15_SEC = new AppLifecycleServicePendingIntent("PLAYER_SEEK_FORWARD_15_SEC", 21);
       AppLifecycleServicePendingIntent.PLAYER_SKIP_NEXT = new AppLifecycleServicePendingIntent("PLAYER_SKIP_NEXT", 22);
       AppLifecycleServicePendingIntent.PLAYER_TURN_ON_SHUFFLE = new AppLifecycleServicePendingIntent("PLAYER_TURN_ON_SHUFFLE", 23);
       AppLifecycleServicePendingIntent.PLAYER_TURN_OFF_SHUFFLE = new AppLifecycleServicePendingIntent("PLAYER_TURN_OFF_SHUFFLE", 24);
       AppLifecycleServicePendingIntent.$VALUES = AppLifecycleServicePendingIntent.$values();
    }
    private void AppLifecycleServicePendingIntent(String p0,int p1){
       super(p0, p1);
    }
    public static AppLifecycleServicePendingIntent valueOf(String p0){
       return Enum.valueOf(AppLifecycleServicePendingIntent.class, p0);
    }
    public static AppLifecycleServicePendingIntent[] values(){
       return AppLifecycleServicePendingIntent.$VALUES.clone();
    }
}
