package p.s44;
import android.media.MediaDescription$Builder;
import android.media.MediaDescription;
import java.lang.CharSequence;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.String;

public abstract class s44	// class@0025b8 from classes.dex
{

    public static MediaDescription a(MediaDescription$Builder p0){
       return p0.build();
    }
    public static MediaDescription$Builder b(){
       return new MediaDescription$Builder();
    }
    public static CharSequence c(MediaDescription p0){
       return p0.getDescription();
    }
    public static Bundle d(MediaDescription p0){
       return p0.getExtras();
    }
    public static Bitmap e(MediaDescription p0){
       return p0.getIconBitmap();
    }
    public static Uri f(MediaDescription p0){
       return p0.getIconUri();
    }
    public static String g(MediaDescription p0){
       return p0.getMediaId();
    }
    public static CharSequence h(MediaDescription p0){
       return p0.getSubtitle();
    }
    public static CharSequence i(MediaDescription p0){
       return p0.getTitle();
    }
    public static void j(MediaDescription$Builder p0,CharSequence p1){
       p0.setDescription(p1);
    }
    public static void k(MediaDescription$Builder p0,Bundle p1){
       p0.setExtras(p1);
    }
    public static void l(MediaDescription$Builder p0,Bitmap p1){
       p0.setIconBitmap(p1);
    }
    public static void m(MediaDescription$Builder p0,Uri p1){
       p0.setIconUri(p1);
    }
    public static void n(MediaDescription$Builder p0,String p1){
       p0.setMediaId(p1);
    }
    public static void o(MediaDescription$Builder p0,CharSequence p1){
       p0.setSubtitle(p1);
    }
    public static void p(MediaDescription$Builder p0,CharSequence p1){
       p0.setTitle(p1);
    }
}
