package p.jw3;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Locale;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.util.AbstractMap;
import java.lang.Math;
import p.fx0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;

public class jw3	// class@001b59 from classes.dex
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public void jw3(int p0){
       int i = 0;
       this.a = i;
       super();
       if (p0 <= 0) {
          throw new IllegalArgumentException("maxSize <= 0");
       }
       this.c = p0;
       this.i = new LinkedHashMap(i, 0x3f400000, true);
       return;
    }
    public void jw3(int p0,int p1){
       this.a = 1;
       super();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.b = p0;
       byte[] uobyteArray = new byte[p0];
       this.i = uobyteArray;
    }
    private synchronized final String h(){
       jw3 tg = this.g;
       int i = this.h + tg;
       int i1 = 0;
       int i2 = (i)? (tg * 100) / i: 0;
       Object[] objArray = new Object[]{Integer.valueOf(this.c),Integer.valueOf(this.g),Integer.valueOf(this.h),Integer.valueOf(i2)};
       return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", objArray);
    }
    public void a(Object p0,Object p1,Object p2){
    }
    public final Object b(Object p0){
       if (p0 == null) {
          throw new NullPointerException("key == null");
       }
       _monitor_enter(this);
       if ((p0 = this.i.get(p0)) != null) {
          this.g = this.g + 1;
          _monitor_exit(this);
          return p0;
       }else {
          this.h = this.h + 1;
          _monitor_exit(this);
          return null;
       }
    }
    public final Object c(Object p0,Object p1){
       Object obj;
       if (p0 == null) {
          throw new NullPointerException("key == null || value == null");
       }
       _monitor_enter(this);
       this.d = this.d + 1;
       this.b = this.b + this.f(p0, p1);
       if ((obj = this.i.put(p0, p1)) != null) {
          this.b = this.b - this.f(p0, obj);
       }
       _monitor_exit(this);
       if (obj != null) {
          this.a(p0, obj, p1);
       }
       this.i(this.c);
       return obj;
    }
    public final void d(Object p0){
       Object obj;
       _monitor_enter(this);
       if ((obj = this.i.remove(p0)) != null) {
          this.b = this.b - this.f(p0, obj);
       }
       _monitor_exit(this);
       if (obj != null) {
          this.a(p0, obj, null);
       }
       return;
    }
    public final void e(int p0,int p1){
       if (p0 < 0 || p0 >= this.e) {
          throw new fx0();
       }
       int i = this.f - this.d;
       i = Math.min(i, p1);
       p1 = p1 - i;
       this.g = p1;
       this.h = p0;
       jw3 td = this.d;
       int i1 = td - p0;
       i1 = i1 - 1;
       if (p0 >= td) {
          i1 = i1 + this.b;
       }
       while (true) {
          jw3 ti = this.i;
          jw3 td1 = this.d;
          int i2 = td1 + 1;
          this.d = i2;
          int i3 = i1 + 1;
          td[td1] = ti[i1];
          i1 = (i3 == this.b)? 0: i3;
          if ((i = i - 1) <= 0) {
             if (this.e < i2) {
                this.e = i2;
                break ;
             }
             break ;
          }
       }
       return;
    }
    public final int f(Object p0,Object p1){
       int i;
       if ((i = this.g(p0, p1)) >= 0) {
          return i;
       }
       throw new IllegalStateException("Negative size: "+p0+"="+p1);
    }
    public int g(Object p0,Object p1){
       return 1;
    }
    public final void i(int p0){
       while (true) {
          _monitor_enter(this);
          if (this.b < null || (this.i.isEmpty() || this.b == null)) {
             throw new IllegalStateException(this.getClass().getName()+".sizeOf\(\) is reporting inconsistent results!");
          }
          if (this.b > p0 && !this.i.isEmpty()) {
             Map$Entry uEntry = this.i.entrySet().iterator().next();
             Object key = uEntry.getKey();
             Object value = uEntry.getValue();
             this.i.remove(key);
             int i = this.b - this.f(key, value);
             this.b = i;
             i = this.f + 1;
             this.f = i;
             _monitor_exit(this);
             this.a(key, value, null);
          }else {
             break ;
          }
       }
       _monitor_exit(this);
       return;
    }
    public synchronized final String toString(){
       switch (this.a){
           case 0:
           default:
             String str = super.toString();
             return str;
       }
       return this.h();
    }
}
