package p.oe7;
import p.zb0;
import p.yx6;
import p.ly7;
import p.lo4;
import p.co;
import p.sj2;
import p.su0;
import p.hl2;
import java.lang.Object;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.lang.String;
import android.os.PowerManager;
import android.content.IntentFilter;
import p.t60;
import p.xe7;
import p.eo;
import p.bo;
import android.os.Handler;
import java.lang.Integer;
import p.ao;
import java.lang.Boolean;
import p.co5;
import p.ob2;
import android.media.AudioManager$OnAudioFocusChangeListener;
import p.xy5;
import p.m91;
import p.fx5;
import p.yx1;
import p.r75;
import p.g70;
import p.y70;
import p.ii2;
import java.lang.Class;
import java.io.InputStream;
import p.sh0;
import com.google.protobuf.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.ko;
import p.ho;
import android.media.AudioFocusRequest;
import p.lo;
import p.go;
import android.media.AudioManager;
import p.p3;
import p.md7;
import p.fw;
import p.u16;
import p.vx5;
import p.r16;
import java.lang.Iterable;
import p.b28;
import p.w08;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import p.ox7;
import p.tu6;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import java.lang.Math;
import p.mg3;
import p.ja7;
import p.he3;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.util.EnumSet;
import p.wf3;
import java.lang.StringBuilder;
import p.kw;
import p.rn1;
import android.util.Log;
import java.lang.IllegalArgumentException;
import p.h87;
import p.bl2;
import p.w51;
import p.se;
import p.il2;

public final class oe7 implements zb0, yx6, ly7, lo4, co, sj2, su0	// class@002107 from classes.dex
{
    public Object a;
    public Object b;

    public void oe7(){
       super();
       this.a = new SparseIntArray();
       this.b = hl2.c;
    }
    public void oe7(int p0){
       if (p0 != 6) {
          if (p0 != 10) {
             super();
             this.a = new HashMap(64);
             this.b = new AtomicReference();
             return;
          }else {
             super();
             return;
          }
       }else {
          super();
          this.a = null;
          this.b = new ConcurrentHashMap();
          return;
       }
    }
    public void oe7(Context p0,int p1){
       if (p1 != 11) {
          super();
          this.a = p0;
          return;
       }else {
          super();
          this.a = p0.getSystemService("power");
          IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_PRESENT");
          intentFilter.addAction("android.intent.action.SCREEN_ON");
          intentFilter.addAction("android.intent.action.SCREEN_OFF");
          this.b = xe7.v(p0, intentFilter);
          return;
       }
    }
    public void oe7(Object p0,Object p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void oe7(Object p0,Object p1,int p2){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void oe7(eo p0,bo p1,Handler p2){
       ob2 "listener";
       super();
       this.b = p0;
       Boolean fALSE = Boolean.FALSE;
       co5.o(p1, "listener");
       "listener" = new ob2(1, fALSE, new ao(Integer.valueOf(2), Integer.valueOf(1)), p1, p2, fALSE, 0);
       this.a = "listener";
    }
    public void oe7(xy5 p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 18);
    }
    public static String m(String p0){
       if (p0 != null) {
          p0 = p0.trim();
          if (p0.length() > 1024) {
             p0 = p0.substring(0, 1024);
          }
       }
       return p0;
    }
    public final Object a(Object p0){
       oe7 ta;
       sh0 osh0;
       c uoc;
       try{
          if (this.b == null) {
             ta = this.a;
             ta.getClass();
             osh0 = sh0.g(p0.y().e0());
             uoc = c.parsePartialFrom(ta.a, osh0, ii2.b);
             try{
                osh0.a(0);
                ii2.a(uoc);
             }catch(p.rc3 e0){
                throw e0;
             }
          }else {
             ta = this.a;
             ta.getClass();
             osh0 = sh0.g(p0.y().e0());
             uoc = c.parsePartialFrom(ta.a, osh0, this.b);
             try{
                osh0.a(0);
                ii2.a(uoc);
             }catch(p.rc3 e0){
                throw e0;
             }
          }
          p0.close();
          return uoc;
       }catch(p.rc3 e0){
          throw new RuntimeException(e0);
       }
    }
    public final void abandonAudioFocus(){
       AudioManager$OnAudioFocusChangeListener onAudioFocus;
       oe7 tb = this.b;
       oe7 ta = this.a;
       tb.getClass();
       co5.o(ta, "audioFocusRequest");
       if ((onAudioFocus = tb.c.remove(new ho(ta.v))) == null) {
       }else {
          tb.b.a();
          p3.b(tb.a, lo.a(ta, onAudioFocus));
       }
       return;
    }
    public final Object b(){
       md7 c = this.a.c;
       c.getClass();
       return c.x(new vx5(c, 3, this.b));
    }
    public final Object c(){
       Object obj = this.a.c();
       w08 ow08 = this.b.a();
       ox7.S(ow08.getPackageManager(), new ComponentName(ow08.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
       PackageManager packageManag = ow08.getPackageManager();
       ox7.S(packageManag, new ComponentName(ow08.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
       tu6.E(obj);
       return obj;
    }
    public final void d(LayoutInflater p0,ScrollView p1){
       TextView textView = p0.inflate(R.layout.glue_dialog_content_text, p1, true).findViewById(R.id.body);
       this.a = textView;
       textView.setText(this.b);
    }
    public final void e(){
       this.b.b(this.a);
    }
    public final void f(){
    }
    public final int g(){
       return (int)Math.ceil((double)Math.abs(this.a.getPaint().getFontMetrics().descent));
    }
    public final void h(Class p0,mg3 p1){
       _monitor_enter(this);
       if (this.a.put(new ja7(p0, true), p1) == null) {
          this.b.set(null);
       }
       _monitor_exit(this);
       return;
    }
    public final void i(he3 p0,mg3 p1){
       _monitor_enter(this);
       if (this.a.put(new ja7(p0, true), p1) == null) {
          this.b.set(null);
       }
       _monitor_exit(this);
       return;
    }
    public final String j(){
       oe7 tb = this.b;
       if (tb != null) {
          return tb;
       }
       String str = Settings$Secure.getString(this.a.getContentResolver(), "android_id");
       this.b = str;
       return str;
    }
    public final Object k(){
       oe7 ta = this.a;
       String str = "Invalid EnumSet type: ";
       if (!ta instanceof ParameterizedType) {
          throw new wf3(str+this.a.toString());
       }
       object oobject = ta.getActualTypeArguments()[0];
       if (oobject instanceof Class) {
          return EnumSet.noneOf(oobject);
       }
       throw new wf3(str+this.a.toString());
    }
    public final void l(kw p0){
       this.a.b();
       this.a.c();
       this.b.h(p0);
       this.a.r();
       this.a.m();
    }
    public final void n(String p0,String p1){
       if (p0 == null) {
          throw new IllegalArgumentException("Custom attribute key must not be null.");
       }
       p0 = oe7.m(p0);
       if (this.b.size() >= 64 && !this.b.containsKey(p0)) {
          Log.isLoggable("FirebaseCrashlytics", 3);
          return;
       }else if(p1 == null){
          p1 = "";
       }else {
          p1 = oe7.m(p1);
       }
       this.b.put(p0, p1);
       return;
    }
    public final mg3 o(Class p0){
       _monitor_enter(this);
       _monitor_exit(this);
       return this.a.get(new ja7(p0, false));
    }
    public final void onCancel(){
       this.a.cancel();
    }
    public final mg3 p(he3 p0){
       _monitor_enter(this);
       _monitor_exit(this);
       return this.a.get(new ja7(p0, false));
    }
    public final int q(Context p0,bl2 p1){
       int i1;
       int i3;
       w51.k(p0);
       w51.k(p1);
       int i = p1.a();
       if ((i1 = this.a.get(i, -1)) != -1) {
          return i1;
       }
       int i2 = 0;
       while (i2 < this.a.size()) {
          if ((i3 = this.a.keyAt(i2)) > i && !this.a.get(i3)) {
             i1 = 0;
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       if (i1 == -1) {
          i1 = this.b.b(p0, i);
       }
       this.a.put(i, i1);
       return i1;
    }
}
