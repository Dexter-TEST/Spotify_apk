package p.ha1;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import android.content.Context;
import p.uh2;
import java.lang.ref.Reference;
import android.os.Process;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import p.c60;
import p.x45;
import java.lang.Boolean;
import java.lang.Thread;
import java.util.Objects;
import android.webkit.WebView;
import android.webkit.WebSettings;
import p.t50;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class ha1 implements Runnable	// class@00180f from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void ha1(Object p0,int p1,CountDownLatch p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void run(){
       Context uContext1;
       Class[] uClassArray;
       Object[] objArray;
       c60 obj;
       c60 uoc60;
       c60 a;
       Class[] uClassArray1;
       Object[] obj1;
       String str = "getId";
       String str1 = "isLimitAdTrackingEnabled";
       Context uContext = Context.class;
       String str2 = "getAdvertisingIdInfo";
       int i = 1;
       ha1 tc = this.c;
       ha1 tb = this.b;
       switch (this.a){
           case 0:
             try{
                Objects.toString(Thread.currentThread());
                WebView webView = new WebView(tb);
                t50.w = webView.getSettings().getUserAgentString();
                webView.destroy();
             }catch(java.lang.Exception e0){
                e0.getMessage();
             }
             return;
             break;
           case 1:
             try{
                if ((uContext1 = tc.b.get()) != null) {
                   int i1 = -19;
                   try{
                      Process.setThreadPriority(i1);
                      uClassArray = new Class[i];
                      uClassArray[0] = uContext;
                      objArray = new Object[i];
                      objArray[0] = uContext1;
                      obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod(str2, uClassArray).invoke(null, objArray);
                   }catch(java.lang.Exception e0){
                      obj = null;
                   }
                   if ((uoc60 = c60.c()) == null) {
                      uoc60 = new c60(e0, i);
                   }
                   if ((a = uoc60.a) != null) {
                      try{
                         uClassArray1 = new Class[0];
                         objArray = new Object[0];
                         obj1 = obj.getClass().getMethod(str1, uClassArray1).invoke(obj, objArray);
                         if (obj1 instanceof Boolean) {
                            a.a = obj1.booleanValue();
                         }
                      }catch(java.lang.Exception e0){
                      }
                      if (e0.a == i) {
                         e0.b = null;
                      }else {
                         Class[] uClassArray2 = new Class[0];
                         obj1 = new Object[0];
                         e0.b = obj.getClass().getMethod(str, uClassArray2).invoke(obj, obj1);
                      }
                   }
                }
             }catch(java.lang.Exception e0){
             }
             break;
           default:
             if ((uContext1 = tc.b.get()) != null) {
                try{
                   uClassArray = new Class[i];
                   uClassArray[0] = uContext;
                   objArray = new Object[i];
                   objArray[0] = uContext1;
                   obj = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod(str2, uClassArray).invoke(null, objArray);
                   uClassArray1 = new Class[0];
                   objArray = new Object[0];
                   str = obj.getClass().getDeclaredMethod(str, uClassArray1).invoke(obj, objArray).toString();
                   uClassArray1 = new Class[0];
                   objArray = new Object[0];
                   Boolean uBoolean = obj.getClass().getDeclaredMethod(str1, uClassArray1).invoke(obj, objArray);
                   if ((obj = c60.c()) == null) {
                      obj = new c60(uContext1, i);
                   }
                   a = obj.a;
                   a.b = str;
                   if (!uBoolean.booleanValue()) {
                      i = 0;
                   }
                   a.a = i;
                   if (TextUtils.isEmpty(str) || (str.equals("00000000-0000-0000-0000-000000000000") || uBoolean.booleanValue())) {
                      a.b = null;
                   }
                }catch(java.lang.Exception e0){
                   e0.toString();
                }
             }
             tb.countDown();
             return;
       }
       tb.countDown();
       return;
    }
}
