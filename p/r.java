package p.r;
import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import p.p3;
import java.util.ArrayList;
import p.mp2;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.io.Closeable;
import android.webkit.MimeTypeMap;
import java.lang.CharSequence;
import p.av6;
import android.view.View;
import p.qk7;
import android.view.View$OnAttachStateChangeListener;
import p.oi;
import p.ib1;
import p.cd2;

public abstract class r	// class@0024a6 from classes.dex
{
    public static final Bitmap$Config[] a;
    public static final Bitmap$Config b;
    public static final mp2 c;

    static {
       Bitmap$Config[] uConfigArray;
       Object[] objArray;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 1;
       int i1 = 0;
       if (sDK_INT >= 26) {
          uConfigArray = new Bitmap$Config[]{Bitmap$Config.ARGB_8888,p3.h()};
       }else {
          uConfigArray = new Bitmap$Config[i];
          uConfigArray[i1] = Bitmap$Config.ARGB_8888;
       }
       r.a = uConfigArray;
       Bitmap$Config uConfig = (sDK_INT >= 26)? p3.D(): Bitmap$Config.ARGB_8888;
       r.b = uConfig;
       String[] stringArray = new String[i1];
       if ((objArray = new ArrayList(20).toArray(stringArray)) != null) {
          r.c = new mp2(objArray);
       }else {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       }
    }
    public static final void a(Closeable p0){
       try{
          p0.close();
          return;
       }catch(java.lang.RuntimeException e0){
          throw e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static final String b(MimeTypeMap p0,String p1){
       int i = (p1 != null && !av6.p0(p1))? 0: 1;
       if (i) {
          return null;
       }else {
          return p0.getMimeTypeFromExtension(av6.H0('.', av6.H0('/', av6.J0(av6.J0(p1, '#'), '?'), av6.J0(av6.J0(p1, '#'), '?')), ""));
       }
    }
    public static final qk7 c(View p0){
       Object tag = p0.getTag(R.id.coil_request_manager);
       int i = 0;
       if (tag instanceof qk7) {
       }else {
          tag = i;
       }
       if (tag == null) {
          _monitor_enter(p0);
          tag = p0.getTag(R.id.coil_request_manager);
          if (tag instanceof qk7) {
             i = tag;
          }
          if (i != null) {
             tag = i;
          }else {
             tag = new qk7(p0);
             p0.addOnAttachStateChangeListener(tag);
             p0.setTag(R.id.coil_request_manager, tag);
          }
          _monitor_exit(p0);
       }
       return tag;
    }
    public static final int d(oi p0,int p1){
       ib1 h;
       if (p0 instanceof ib1) {
          h = p0.H;
       }else if(p1){
          if (p1--) {
             if (p1 == 1) {
                h = Integer.MAX_VALUE;
             }else {
                throw new cd2(10);
             }
          }else {
             h = Integer.MIN_VALUE;
          }
       }else {
          throw 0;
       }
       return h;
    }
}
