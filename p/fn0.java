package p.fn0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ad1;
import java.lang.Object;
import p.d45;
import java.lang.Throwable;
import p.co5;
import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;
import p.iw1;
import p.hn0;
import java.lang.String;
import java.util.Objects;

public final class fn0 implements Disposable, ad1	// class@0015fb from classes.dex
{
    public d45 a;
    public boolean b;

    public void fn0(){
       super();
    }
    public static void f(d45 p0){
       if (p0 == null) {
          return;
       }
       p0 = p0.d;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject instanceof Disposable) {
             oobject.dispose();
          }
          i = i + 1;
       }
       if (null == null) {
          return;
       }
       if (null.size() == 1) {
          throw iw1.f(null.get(0));
       }
       throw new hn0(null);
    }
    public final boolean a(Disposable p0){
       if (!this.b(p0)) {
          return false;
       }
       p0.dispose();
       return true;
    }
    public final boolean b(Disposable p0){
       fn0 ta;
       object oobject;
       int i1;
       Objects.requireNonNull(p0, "disposable is null");
       if (this.b != null) {
          return false;
       }
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          return false;
       }else if((ta = this.a) != null){
          d45 d = ta.d;
          d45 a = ta.a;
          int i = p0.hashCode() * -1640531527;
          i = (i ^ (i >> 16)) & a;
          if ((oobject = d[i]) != null) {
             if (oobject.equals(p0)) {
                ta.b(i, a, d);
             }else {
                while (true) {
                   i = i + true;
                   i = i & a;
                   if ((oobject = d[i]) != null) {
                      if (oobject.equals(p0)) {
                         ta.b(i, a, d);
                      }
                   }
                }
                if (i1) {
                   _monitor_exit(this);
                   return true;
                }
             }
             i1 = 1;
          }
          i1 = 0;
       }
       _monitor_exit(this);
       return false;
    }
    public final boolean c(Disposable p0){
       fn0 ta;
       Objects.requireNonNull(p0, "disposable is null");
       if (this.b == null) {
          _monitor_enter(this);
          if (this.b == null) {
             if ((ta = this.a) == null) {
                ta = new d45(16);
                this.a = ta;
             }
             ta.a(p0);
             _monitor_exit(this);
             return true;
          }else {
             _monitor_exit(this);
          }
       }
       p0.dispose();
       return false;
    }
    public final void d(Disposable[] p0){
       fn0 ta;
       Objects.requireNonNull(p0, "disposables is null");
       int i = 0;
       if (this.b == null) {
          _monitor_enter(this);
          if (this.b == null) {
             if ((ta = this.a) == null) {
                ta = new d45((p0.length + 1));
                this.a = ta;
             }
             int len = p0.length;
             for (; i < len; i = i + 1) {
                object oobject = p0[i];
                Objects.requireNonNull(oobject, "A Disposable in the disposables array is null");
                ta.a(oobject);
             }
             _monitor_exit(this);
             return;
          }else {
             _monitor_exit(this);
          }
       }
       int len1 = p0.length;
       for (; i < len1; i = i + 1) {
          p0[i].dispose();
       }
       return;
    }
    public void dispose(){
       if (this.b != null) {
          return;
       }
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          return;
       }else {
          this.b = true;
          fn0 ta = this.a;
          this.a = null;
          _monitor_exit(this);
          fn0.f(ta);
          return;
       }
    }
    public final void e(){
       if (this.b != null) {
          return;
       }
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          return;
       }else {
          fn0 ta = this.a;
          this.a = null;
          _monitor_exit(this);
          fn0.f(ta);
          return;
       }
    }
    public final int g(){
       fn0 ta;
       int i = 0;
       if (this.b != null) {
          return i;
       }
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          return i;
       }else if((ta = this.a) != null){
          i = ta.b;
       }
       _monitor_exit(this);
       return i;
    }
    public boolean isDisposed(){
       return this.b;
    }
}
