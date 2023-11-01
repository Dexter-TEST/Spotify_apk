package p.rf;
import p.jj;
import p.kj;
import java.util.concurrent.Executor;
import p.sk;
import java.lang.Object;
import android.content.Context;
import p.hj;
import android.os.Build$VERSION;
import p.gj;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import java.lang.Class;
import android.content.pm.ServiceInfo;
import java.lang.String;
import android.os.Bundle;
import java.lang.Boolean;
import p.lk;
import p.b93;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;

public abstract class rf	// class@0024dc from classes.dex
{
    public static final jj a;
    public static final int b;
    public static br3 c;
    public static br3 t;
    public static Boolean v;
    public static boolean w;
    public static final sk x;
    public static final Object y;
    public static final Object z;

    static {
       rf.a = new jj(new kj(0), 0);
       rf.b = -100;
       rf.c = null;
       rf.t = null;
       rf.v = null;
       rf.w = false;
       rf.x = new sk(0);
       rf.y = new Object();
       rf.z = new Object();
    }
    public void rf(){
       super();
    }
    public static boolean c(Context p0){
       ServiceInfo metaData;
       if (rf.v == null) {
          try{
             int i = (Build$VERSION.SDK_INT >= 24)? gj.a() | 0x0080: 640;
             if ((metaData = p0.getPackageManager().getServiceInfo(new ComponentName(p0, hj.class), i).metaData) != null) {
                rf.v = Boolean.valueOf(metaData.getBoolean("autoStoreLocales"));
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             rf.v = Boolean.FALSE;
          }
       }
       return rf.v.booleanValue();
    }
    public static void f(rf p0){
       rf orf;
       Object y = rf.y;
       _monitor_enter(y);
       sk x = rf.x;
       x.getClass();
       lk olk = new lk(x);
       while (olk.hasNext()) {
          if ((orf = olk.next().get()) != p0 && orf != null) {
             continue ;
          }else {
             olk.remove();
          }
       }
       _monitor_exit(y);
       return;
    }
    public abstract void a(View p0,ViewGroup$LayoutParams p1);
    public abstract void b();
    public abstract void d();
    public abstract void e();
    public abstract boolean g(int p0);
    public abstract void h(int p0);
    public abstract void i(View p0);
    public abstract void j(View p0,ViewGroup$LayoutParams p1);
    public abstract void m(CharSequence p0);
}
