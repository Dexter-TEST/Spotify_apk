package com.spotify.hubs.liteintegration.util.PodcastUtil;
import p.tf1;
import java.lang.Object;
import p.zg0;
import p.uf1;
import android.content.res.Resources;
import java.lang.String;
import java.lang.StringBuilder;
import p.vf1;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Long;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import p.ic;
import java.lang.Class;
import java.util.Calendar;
import p.mi;
import p.xj0;

public final class PodcastUtil	// class@0008bf from classes.dex
{
    private static final int HOUR_IN_MILLIS = 3600000;
    private static final float MINUTE_IN_MILLIS = 0.000000;
    private static final int SECOND_IN_MILLISECONDS = 1000;
    private static final tf1 mDurationFormatter;

    static {
       PodcastUtil.mDurationFormatter = new tf1();
    }
    private void PodcastUtil(){
       super();
    }
    public static String formatDateAndListeningProgressStatus(zg0 p0,uf1 p1,Resources p2,int p3,long p4,boolean p5,int p6){
       String str1;
       StringBuilder str = new StringBuilder(32);
       if ((str1 = PodcastUtil.formatReleaseDate(p2, p0, p4)) != null) {
          str = str+str1;
          if (p3 > 0) {
             str = str+" • ";
          }
       }
       if (p5) {
          str = str+p2.getString(R.string.content_listening_status_played);
       }else if(p6 > 0){
          Object[] objArray = new Object[]{p1.a(((p3 - p6) / 1000), PodcastUtil.mDurationFormatter)};
          str = str+p2.getString(R.string.content_listening_status_time_left, objArray);
       }else {
          str = str+PodcastUtil.formatDuration(p2, p3);
       }
       return str;
    }
    public static String formatDuration(Resources p0,int p1){
       int i = p1 / 0x36ee80;
       p1 = (int)Math.ceil((double)((float)(p1 - (0x36ee80 * i)) / 60000.00f));
       StringBuilder str = new StringBuilder(12);
       if (i > 0) {
          Object[] objArray = new Object[]{Integer.valueOf(i)};
          str = str+p0.getString(R.string.time_format_hours, objArray);
       }
       if (i > 0 && p1 > 0) {
          str = str+' ';
       }
       if (p1 > 0) {
          Object[] objArray1 = new Object[]{Integer.valueOf(p1)};
          str = str+p0.getString(R.string.time_format_min, objArray1);
       }
       return str;
    }
    public static String formatListeningProgressStatus(uf1 p0,Resources p1,int p2,boolean p3,int p4){
       if (p3) {
          return p1.getString(R.string.content_listening_status_played);
       }
       if (p4 <= 0) {
          return PodcastUtil.formatDuration(p1, p2);
       }
       Object[] objArray = new Object[]{p0.a(((p2 - p4) / 1000), PodcastUtil.mDurationFormatter)};
       return p1.getString(R.string.content_listening_status_time_left, objArray);
    }
    public static Long formatReleaseDate(String p0){
       Date uDate;
       try{
          uDate = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(p0);
       }catch(java.text.ParseException e0){
          uDate = null;
       }
       long l = (uDate == null)? 0: uDate.getTime();
       return Long.valueOf(l);
    }
    public static String formatReleaseDate(Resources p0,zg0 p1,long p2){
       if (!(p2)) {
          return null;
       }
       p1.getClass();
       Calendar instance = Calendar.getInstance();
       Calendar instance1 = Calendar.getInstance();
       instance1.setTimeInMillis(p2);
       int i = mi.r(instance);
       int i1 = mi.r(instance1);
       if (i == i1) {
          return xj0.k(p0.getString(R.string.subtitle_today).toLowerCase(Locale.getDefault()), Locale.getDefault());
       }
       if (((i - i1)) == 1) {
          return xj0.k(p0.getString(R.string.subtitle_yesterday).toLowerCase(Locale.getDefault()), Locale.getDefault());
       }
       if (instance.get(1) == instance1.get(1)) {
          return new SimpleDateFormat("MMM dd", Locale.getDefault()).format(instance1.getTime());
       }
       return DateFormat.getDateInstance(2).format(instance1.getTime());
    }
    public static String formatReleaseDateAndDuration(Resources p0,zg0 p1,int p2,long p3){
       String str1;
       StringBuilder str = new StringBuilder(32);
       if ((str1 = PodcastUtil.formatReleaseDate(p0, p1, p3)) != null) {
          str = str+str1;
          if (p2 > 0) {
             str = str+" • ";
          }
       }
       return str+PodcastUtil.formatDuration(p0, p2);
    }
}
