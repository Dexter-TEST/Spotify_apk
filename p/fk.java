package p.fk;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.Object;
import p.cd1;

public final class fk extends AtomicReferenceArray implements Disposable	// class@0015e8 from classes.dex
{

    public void fk(){
       super(2);
    }
    public final boolean a(int p0,Disposable p1){
       Disposable uDisposable;
       while (true) {
          if ((uDisposable = this.get(p0)) == cd1.a) {
             p1.dispose();
             return false;
          }else if(this.compareAndSet(p0, uDisposable, p1)){
             if (uDisposable != null) {
                uDisposable.dispose();
                break ;
             }
             break ;
          }
       }
       return true;
    }
    public void dispose(){
       Disposable andSet;
       int i = 0;
       cd1 a = cd1.a;
       if (this.get(i) != a) {
          int i1 = this.length();
          while (i < i1) {
             if (this.get(i) != a && ((andSet = this.getAndSet(i, a)) != a && andSet != null)) {
                andSet.dispose();
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean isDisposed(){
       int i = 0;
       if (this.get(i) == cd1.a) {
          i = true;
       }
       return i;
    }
}
