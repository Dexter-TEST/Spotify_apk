package p.jl3;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ad1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.lang.Throwable;
import p.co5;
import java.util.ArrayList;
import java.lang.RuntimeException;
import p.iw1;
import p.hn0;

public final class jl3 implements Disposable, ad1	// class@001afb from classes.dex
{
    public LinkedList a;
    public boolean b;

    public void jl3(){
       super();
    }
    public final boolean a(Disposable p0){
       if (!this.b(p0)) {
          return false;
       }
       p0.dispose();
       return true;
    }
    public final boolean b(Disposable p0){
       jl3 ta;
       Objects.requireNonNull(p0, "Disposable item is null");
       if (this.b != null) {
          return false;
       }
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          return false;
       }else if((ta = this.a) != null && ta.remove(p0)){
          _monitor_exit(this);
          return true;
       }else {
          _monitor_exit(this);
          return false;
       }
    }
    public final boolean c(Disposable p0){
       jl3 ta;
       if (this.b == null) {
          _monitor_enter(this);
          if (this.b == null) {
             if ((ta = this.a) == null) {
                ta = new LinkedList();
                this.a = ta;
             }
             ta.add(p0);
             _monitor_exit(this);
             return true;
          }else {
             _monitor_exit(this);
          }
       }
       p0.dispose();
       return false;
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
          boolean b = true;
          this.b = b;
          jl3 ta = this.a;
          this.a = null;
          _monitor_exit(this);
          if (ta != null) {
             Iterator iterator = ta.iterator();
             while (iterator.hasNext()) {
                iterator.next().dispose();
             }
             if (null != null) {
                if (null.size() == b) {
                   throw iw1.f(null.get(0));
                }else {
                   throw new hn0(null);
                }
             }
          }
          return;
       }
    }
    public boolean isDisposed(){
       return this.b;
    }
}
