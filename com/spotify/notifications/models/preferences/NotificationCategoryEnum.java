package com.spotify.notifications.models.preferences.NotificationCategoryEnum;
import java.lang.Enum;
import java.lang.String;
import p.oj4;
import java.lang.Class;
import java.lang.Object;
import p.co5;

public final class NotificationCategoryEnum extends Enum	// class@000aa7 from classes.dex
{
    private final String id;
    private final String osId;
    private final String remoteId;
    private static final NotificationCategoryEnum[] $VALUES;
    public static final NotificationCategoryEnum ARTIST_UPDATES;
    public static final NotificationCategoryEnum CONCERT_NOTIFICATIONS;
    public static final oj4 Companion;
    public static final NotificationCategoryEnum DEFAULT;
    public static final NotificationCategoryEnum NEWS_AND_OFFERS;
    public static final NotificationCategoryEnum NEW_MUSIC;
    public static final NotificationCategoryEnum PLAYLIST_UPDATES;
    public static final NotificationCategoryEnum PRODUCT_NEWS;
    public static final NotificationCategoryEnum RECOMMENDED_MUSIC;

    private static final NotificationCategoryEnum[] $values(){
       NotificationCategoryEnum[] notification = new NotificationCategoryEnum[]{NotificationCategoryEnum.DEFAULT,NotificationCategoryEnum.RECOMMENDED_MUSIC,NotificationCategoryEnum.NEW_MUSIC,NotificationCategoryEnum.PLAYLIST_UPDATES,NotificationCategoryEnum.CONCERT_NOTIFICATIONS,NotificationCategoryEnum.ARTIST_UPDATES,NotificationCategoryEnum.PRODUCT_NEWS,NotificationCategoryEnum.NEWS_AND_OFFERS};
       return notification;
    }
    static {
       NotificationCategoryEnum v6 = new NotificationCategoryEnum("DEFAULT", 0, "DEFAULT", "default", "NOTIFICATION_CHANNEL_DEFAULT");
       NotificationCategoryEnum.DEFAULT = v6;
       v6 = new NotificationCategoryEnum("RECOMMENDED_MUSIC", 1, "RECOMMENDED_MUSIC", "notify-recommended-music", "NOTIFICATION_CHANNEL_RECOMMENDED_MUSIC");
       NotificationCategoryEnum.RECOMMENDED_MUSIC = v6;
       v6 = new NotificationCategoryEnum("NEW_MUSIC", 2, "NEW_MUSIC", "notify-new-music", "NOTIFICATION_CHANNEL_NEW_MUSIC");
       NotificationCategoryEnum.NEW_MUSIC = v6;
       v6 = new NotificationCategoryEnum("PLAYLIST_UPDATES", 3, "PLAYLIST_UPDATES", "notify-playlist-updates", "NOTIFICATION_CHANNEL_PLAYLIST_UPDATES");
       NotificationCategoryEnum.PLAYLIST_UPDATES = v6;
       v6 = new NotificationCategoryEnum("CONCERT_NOTIFICATIONS", 4, "CONCERT_NOTIFICATIONS", "notify-in-person-concerts-and-events", "NOTIFICATION_CHANNEL_CONCERT_NOTIFICATIONS");
       NotificationCategoryEnum.CONCERT_NOTIFICATIONS = v6;
       v6 = new NotificationCategoryEnum("ARTIST_UPDATES", 5, "ARTIST_UPDATES", "notify-artist-updates", "NOTIFICATION_CHANNEL_ARTIST_UPDATES");
       NotificationCategoryEnum.ARTIST_UPDATES = v6;
       v6 = new NotificationCategoryEnum("PRODUCT_NEWS", 6, "PRODUCT_NEWS", "notify-product-news", "NOTIFICATION_CHANNEL_PRODUCT_NEWS");
       NotificationCategoryEnum.PRODUCT_NEWS = v6;
       v6 = new NotificationCategoryEnum("NEWS_AND_OFFERS", 7, "NEWS_AND_OFFERS", "notify-news-and-offers", "NOTIFICATION_CHANNEL_NEWS_AND_OFFERS");
       NotificationCategoryEnum.NEWS_AND_OFFERS = v6;
       NotificationCategoryEnum.$VALUES = NotificationCategoryEnum.$values();
       NotificationCategoryEnum.Companion = new oj4();
    }
    private void NotificationCategoryEnum(String p0,int p1,String p2,String p3,String p4){
       super(p0, p1);
       this.id = p2;
       this.remoteId = p3;
       this.osId = p4;
    }
    public static final NotificationCategoryEnum fromOSId(String p0){
       NotificationCategoryEnum dEFAULT;
       NotificationCategoryEnum.Companion.getClass();
       co5.o(p0, "osId");
       switch (p0.hashCode()){
           case 0xb8aaffd6:
             if (!p0.equals("NOTIFICATION_CHANNEL_NEW_MUSIC")) {
             label_0066 :
                dEFAULT = NotificationCategoryEnum.DEFAULT;
             }else {
                dEFAULT = NotificationCategoryEnum.NEW_MUSIC;
             }
             break;
           case 0xe6a930f3:
             if (!p0.equals("NOTIFICATION_CHANNEL_PRODUCT_NEWS")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.PRODUCT_NEWS;
             }
             break;
           case 0xe7a9c41f:
             if (!p0.equals("NOTIFICATION_CHANNEL_CONCERT_NOTIFICATIONS")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.CONCERT_NOTIFICATIONS;
             }
             break;
           case 0xbe5d75b:
             if (!p0.equals("NOTIFICATION_CHANNEL_NEWS_AND_OFFERS")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.NEWS_AND_OFFERS;
             }
             break;
           case 0xd0a6862:
             if (!p0.equals("NOTIFICATION_CHANNEL_ARTIST_UPDATES")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.ARTIST_UPDATES;
             }
             break;
           case 0x43ffdfed:
             if (!p0.equals("NOTIFICATION_CHANNEL_PLAYLIST_UPDATES")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.PLAYLIST_UPDATES;
             }
             break;
           case 0x55163c51:
             if (!p0.equals("NOTIFICATION_CHANNEL_RECOMMENDED_MUSIC")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.RECOMMENDED_MUSIC;
             }
             break;
           default:
             goto label_0066 ;
       }
       return dEFAULT;
    }
    public static final NotificationCategoryEnum fromRemoteId(String p0){
       NotificationCategoryEnum dEFAULT;
       NotificationCategoryEnum.Companion.getClass();
       co5.o(p0, "remoteId");
       switch (p0.hashCode()){
           case 0xa818e6af:
             if (!p0.equals("notify-recommended-music")) {
             label_0066 :
                dEFAULT = NotificationCategoryEnum.DEFAULT;
             }else {
                dEFAULT = NotificationCategoryEnum.RECOMMENDED_MUSIC;
             }
             break;
           case 0xb16be748:
             if (!p0.equals("notify-artist-updates")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.ARTIST_UPDATES;
             }
             break;
           case 0xce9f8703:
             if (!p0.equals("notify-news-and-offers")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.NEWS_AND_OFFERS;
             }
             break;
           case 0xd3ab88bb:
             if (!p0.equals("notify-in-person-concerts-and-events")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.CONCERT_NOTIFICATIONS;
             }
             break;
           case 0xc1ba634:
             if (!p0.equals("notify-new-music")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.NEW_MUSIC;
             }
             break;
           case 0x4f631dd3:
             if (!p0.equals("notify-playlist-updates")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.PLAYLIST_UPDATES;
             }
             break;
           case 0x624208f5:
             if (!p0.equals("notify-product-news")) {
                goto label_0066 ;
             }else {
                dEFAULT = NotificationCategoryEnum.PRODUCT_NEWS;
             }
             break;
           default:
             goto label_0066 ;
       }
       return dEFAULT;
    }
    public static NotificationCategoryEnum valueOf(String p0){
       return Enum.valueOf(NotificationCategoryEnum.class, p0);
    }
    public static NotificationCategoryEnum[] values(){
       return NotificationCategoryEnum.$VALUES.clone();
    }
    public final String getId(){
       return this.id;
    }
    public final String getOsId(){
       return this.osId;
    }
    public final String getRemoteId(){
       return this.remoteId;
    }
}
