package p.jx1;
import android.widget.TextView;
import android.graphics.Paint;
import java.lang.String;
import android.widget.PopupWindow;
import android.transition.Transition;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.telephony.TelephonyManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Icon;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcelable;
import android.media.MediaDescription$Builder;
import android.media.MediaMetadataRetriever;
import android.media.MediaDataSource;
import android.text.StaticLayout$Builder;
import android.text.Layout$Alignment;
import android.text.TextUtils$TruncateAt;

public abstract class jx1	// class@001b60 from classes.dex
{

    public static void A(TextView p0,int p1){
       p0.setTextAppearance(p1);
    }
    public static boolean B(Paint p0,String p1){
       return p0.hasGlyph(p1);
    }
    public static boolean C(PopupWindow p0){
       return p0.getOverlapAnchor();
    }
    public static void D(PopupWindow p0,Transition p1){
       p0.setEnterTransition(p1);
    }
    public static int a(Resources p0,int p1,Resources$Theme p2){
       return p0.getColor(p1, p2);
    }
    public static int b(TelephonyManager p0){
       return p0.getPhoneCount();
    }
    public static int c(PopupWindow p0){
       return p0.getWindowLayoutType();
    }
    public static ColorStateList d(Resources p0,int p1,Resources$Theme p2){
       return p0.getColorStateList(p1, p2);
    }
    public static PorterDuff$Mode e(TextView p0){
       return p0.getCompoundDrawableTintMode();
    }
    public static Drawable f(Icon p0,Context p1){
       return p0.loadDrawable(p1);
    }
    public static Icon g(int p0,String p1){
       return Icon.createWithResource(p1, p0);
    }
    public static Icon h(Bitmap p0){
       return Icon.createWithBitmap(p0);
    }
    public static Icon i(String p0){
       return Icon.createWithContentUri(p0);
    }
    public static Icon j(byte[] p0,int p1,int p2){
       return Icon.createWithData(p0, p1, p2);
    }
    public static Network k(ConnectivityManager p0){
       return p0.getActiveNetwork();
    }
    public static Uri l(MediaDescription p0){
       return p0.getMediaUri();
    }
    public static Object m(Parcel p0,Parcelable$Creator p1){
       return p0.readTypedObject(p1);
    }
    public static void n(int p0,Parcel p1,Parcelable p2){
       p1.writeTypedObject(p2, p0);
    }
    public static void o(Icon p0,ColorStateList p1){
       p0.setTintList(p1);
    }
    public static void p(Icon p0,PorterDuff$Mode p1){
       p0.setTintMode(p1);
    }
    public static void q(MediaDescription$Builder p0,Uri p1){
       p0.setMediaUri(p1);
    }
    public static void r(MediaMetadataRetriever p0,MediaDataSource p1){
       p0.setDataSource(p1);
    }
    public static void s(StaticLayout$Builder p0,float p1,float p2){
       p0.setLineSpacing(p1, p2);
    }
    public static void t(StaticLayout$Builder p0,int p1){
       p0.setHyphenationFrequency(p1);
    }
    public static void u(StaticLayout$Builder p0,Layout$Alignment p1){
       p0.setAlignment(p1);
    }
    public static void v(StaticLayout$Builder p0,TextUtils$TruncateAt p1){
       p0.setEllipsize(p1);
    }
    public static void w(StaticLayout$Builder p0,boolean p1){
       p0.setIncludePad(p1);
    }
    public static void x(PopupWindow p0,int p1){
       p0.setWindowLayoutType(p1);
    }
    public static void y(PopupWindow p0,Transition p1){
       p0.setExitTransition(p1);
    }
    public static void z(PopupWindow p0,boolean p1){
       p0.setOverlapAnchor(p1);
    }
}
