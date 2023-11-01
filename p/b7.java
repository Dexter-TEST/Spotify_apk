package p.b7;
import p.xh;
import p.va7;
import p.yx6;
import p.r16;
import p.l4;
import p.m25;
import p.e25;
import p.bu0;
import p.lo4;
import p.p7;
import p.a56;
import p.g10;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashMap;
import android.content.Context;
import p.ld3;
import p.g54;
import android.os.Build$VERSION;
import p.d71;
import p.c71;
import java.lang.reflect.Field;
import java.lang.Class;
import p.ae2;
import p.ej0;
import p.en6;
import java.util.concurrent.CountDownLatch;
import p.wb4;
import p.xs2;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase;
import p.u16;
import android.database.sqlite.SQLiteStatement;
import p.wv1;
import p.od7;
import p.et;
import java.lang.Integer;
import java.lang.Exception;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p.wh7;
import p.eh7;
import p.u44;
import androidx.recyclerview.widget.RecyclerView;
import p.yb2;
import p.zk2;
import p.jk7;
import p.j07;
import java.lang.Throwable;
import android.util.Log;
import p.m07;
import java.util.TreeSet;
import p.h51;
import java.util.Map;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager;
import p.ob2;
import p.gg1;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import p.hs3;
import java.util.UUID;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class b7 implements xh, va7, yx6, r16, l4, m25, e25, bu0, lo4, p7, a56, g10	// class@00106f from classes.dex
{
    public final int a;
    public Object b;

    public void b7(int p0){
       this.a = p0;
       if (p0 != 7) {
          if (p0 != 21) {
             super();
             this.b = new ArrayDeque();
             return;
          }else {
             super();
             return;
          }
       }else {
          super();
          this.b = new HashMap();
          return;
       }
    }
    public void b7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b7(Context p0,ld3 p1){
       this.a = 4;
       super();
       this.b = new g54(p0, p1);
    }
    public void b7(Context p0,ld3 p1,int p2){
       this.a = 4;
       super(p0, p1);
    }
    public void b7(Object p0){
       this.a = 5;
       super();
       p0 = (Build$VERSION.SDK_INT >= 28)? new d71(): new c71();
       this.b = p0;
       return;
    }
    public void b7(Field p0){
       this.a = 18;
       super();
       p0.getClass();
       this.b = p0;
    }
    public void b7(ae2 p0){
       this.a = 27;
       super();
       this.b = p0;
    }
    public void b7(ej0 p0){
       this.a = 26;
       super();
       this.b = p0;
       p0.H = this;
    }
    public void b7(en6 p0){
       this.a = 14;
       super();
       this.b = new CountDownLatch(1);
    }
    public void b7(wb4 p0){
       this.a = 29;
       super();
       this.b = p0;
    }
    public void b7(xs2 p0){
       this.a = 24;
       super();
       p0.getClass();
       this.b = p0;
    }
    public void a(int p0){
    }
    public final Object apply(Object p0){
       p0.compileStatement(this.b).execute();
       p0.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
       return null;
    }
    public final Object b(){
       b7 tb = this.b;
       SQLiteDatabase sQLiteDataba = tb.b();
       sQLiteDataba.beginTransaction();
       String[] stringArray = new String[]{String.valueOf((tb.b.a() - tb.t.d))};
       sQLiteDataba.setTransactionSuccessful();
       sQLiteDataba.endTransaction();
       return Integer.valueOf(Integer.valueOf(sQLiteDataba.delete("events", "timestamp_ms < ?", stringArray)).intValue());
    }
    public final void c(Exception p0){
       this.b.countDown();
    }
    public final boolean d(View p0){
       SwipeDismissBehavior d;
       SwipeDismissBehavior b1;
       boolean b = false;
       if (!this.b.u(p0)) {
          return b;
       }
       int i = (eh7.d(p0) == 1)? 1: 0;
       if ((d = this.b.d) == null && (i || (d == true && !i))) {
          b = 1;
       }
       i = p0.getWidth();
       if (b) {
          i = - i;
       }
       wh7.h(p0, i);
       p0.setAlpha(0);
       if ((b1 = this.b.b) != null) {
          b1.B(p0);
       }
       return true;
    }
    public final boolean e(){
       return (this.b.isLayoutSuppressed() ^ 0x01);
    }
    public final int f(Object p0){
       return p0.b;
    }
    public final boolean g(Object p0){
       return p0.c;
    }
    public final Object h(RecyclerView p0){
       return this.b.h(p0).getView();
    }
    public void i(int p0){
    }
    public final Object j(j07 p0){
       switch (this.a){
           case 15:
             if (!p0.f()) {
                Log.e("FirebaseCrashlytics", "Error fetching settings.", p0.d());
             }
             break;
           default:
             if (p0.f()) {
                this.b.b(p0.e());
             }else {
                this.b.a(p0.d());
             }
             return null;
       }
       return null;
    }
    public final Object k(){
       return new TreeSet();
    }
    public final h51 l(){
       h51 oh51 = new h51(this.b);
       h51.b(oh51);
       return oh51;
    }
    public final void m(int p0){
       this.b.I(0, p0);
    }
    public final ob2 n(ProviderInfo p0,PackageManager p1){
       ProviderInfo authority = p0.authority;
       p0 = p0.packageName;
       Signature[] signatureArr = this.b.G(p1, p0);
       ArrayList uArrayList = new ArrayList();
       int len = signatureArr.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(signatureArr[i].toByteArray());
       }
       return new ob2(authority, Collections.singletonList(uArrayList), p0, "emojicompat-emoji-font");
    }
    public final String o(){
       String str;
       BufferedReader uBufferedRea;
       File uFile = new File("/proc/sys/kernel/random/boot_id");
       try{
          int i = 0;
          FileReader uFileReader = new FileReader(uFile);
          try{
             uBufferedRea = new BufferedReader(uFileReader);
             str = uBufferedRea.readLine();
             try{
                uBufferedRea.close();
             }catch(java.lang.Exception e2){
                this.b.c("Error closing BufferedReader.", e2);
             }
             return str;
          }catch(java.lang.Exception e0){
             BufferedReader uBufferedRea1 = uBufferedRea;
             str = UUID.randomUUID().toString();
             if (i) {
                try{
                   i.close();
                }catch(java.lang.Exception e2){
                   this.b.c(e0, e2);
                }
             }
             return str;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final void onSuccess(Object p0){
       this.b.countDown();
    }
    public final void p(HashMap p0){
       String key;
       Object value;
       Class class;
       b7 tb;
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Map$Entry uEntry = iterator.next();
          key = uEntry.getKey();
          if ((value = uEntry.getValue()) == null) {
             this.b.put(key, null);
          }else if((class = value.getClass()) != Boolean.class && (class != Byte.class && (class != Integer.class && (class != Long.class && (class != Float.class && (class != Double.class && (class != String.class && (class != Boolean[].class && (class != Byte[].class && (class != Integer[].class && (class != Long[].class && (class != Float[].class && (class != Double[].class && class != String[].class))))))))))))){
             int i = 0;
             if (class == boolean[].class) {
                tb = this.b;
                Boolean[] uBooleanArra = new Boolean[value.length];
                for (; i < value.length; i = i + 1) {
                   uBooleanArra[i] = Boolean.valueOf(value[i]);
                }
                tb.put(key, uBooleanArra);
             }else if(class == byte[].class){
                tb = this.b;
                Byte[] uByteArray = new Byte[value.length];
                for (; i < value.length; i = i + 1) {
                   uByteArray[i] = Byte.valueOf(value[i]);
                }
                tb.put(key, uByteArray);
             }else if(class == int[].class){
                tb = this.b;
                Integer[] integerArray = new Integer[value.length];
                for (; i < value.length; i = i + 1) {
                   integerArray[i] = Integer.valueOf(value[i]);
                }
                tb.put(key, integerArray);
             }else if(class == long[].class){
                tb = this.b;
                Long[] longArray = new Long[value.length];
                for (; i < value.length; i = i + 1) {
                   longArray[i] = Long.valueOf(value[i]);
                }
                tb.put(key, longArray);
             }else if(class == float[].class){
                tb = this.b;
                Float[] uFloatArray = new Float[value.length];
                for (; i < value.length; i = i + 1) {
                   uFloatArray[i] = Float.valueOf(value[i]);
                }
                tb.put(key, uFloatArray);
             }else if(class == double[].class){
                tb = this.b;
                Double[] uDoubleArray = new Double[value.length];
                for (; i < value.length; i = i + 1) {
                   uDoubleArray[i] = Double.valueOf(value[i]);
                }
                tb.put(key, uDoubleArray);
             }else {
                break ;
             }
          }else {
             this.b.put(key, value);
          }
       }
       throw new IllegalArgumentException("Key "+key+"has invalid type "+class);
    }
}
