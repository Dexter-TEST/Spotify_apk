package p.mt4;
import p.on5;
import io.reactivex.rxjava3.core.Observer;
import java.util.Iterator;
import java.lang.AutoCloseable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.UnsupportedOperationException;

public final class mt4 implements on5	// class@001f00 from classes.dex
{
    public final Observer a;
    public Iterator b;
    public AutoCloseable c;
    public boolean t;
    public boolean v;
    public boolean w;

    public void mt4(Observer p0,Iterator p1,AutoCloseable p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(){
       if (this.w != null) {
          return;
       }
       mt4 tb = this.b;
       mt4 ta = this.a;
       while (this.t == null) {
          boolean b = true;
          Object obj = tb.next();
          Objects.requireNonNull(obj, "The Stream\'s Iterator.next returned a null value");
          if (this.t != null) {
             continue ;
          }else {
             ta.onNext(obj);
             if (this.t != null || tb.hasNext()) {
                continue ;
             }else {
                ta.onComplete();
                this.t = b;
             }
          }
       }
       this.clear();
       return;
    }
    public final int b(int p0){
       if (!((p0 & 1))) {
          return 0;
       }
       this.w = true;
       return 1;
    }
    public final void clear(){
       this.b = null;
       mt4 tc = this.c;
       this.c = null;
       if (tc != null) {
          tc.close();
       }
       return;
    }
    public void dispose(){
       this.t = true;
       this.a();
    }
    public boolean isDisposed(){
       return this.t;
    }
    public final boolean isEmpty(){
       mt4 tb;
       if ((tb = this.b) != null) {
          if (this.v != null && !tb.hasNext()) {
             this.clear();
          }else {
             return false;
          }
       }
       return true;
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException();
    }
    public final Object poll(){
       mt4 tb = this.b;
       Object obj = null;
       if (tb == null) {
          return obj;
       }
       if (this.v == null) {
          this.v = true;
       }else if(!tb.hasNext()){
          this.clear();
          return obj;
       }
       Object obj1 = this.b.next();
       Objects.requireNonNull(obj1, "The Stream\'s Iterator.next\(\) returned a null value");
       return obj1;
    }
}
