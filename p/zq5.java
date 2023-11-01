package p.zq5;
import android.database.Observable;
import java.util.ArrayList;
import java.lang.Object;
import p.ar5;

public final class zq5 extends Observable	// class@002f49 from classes.dex
{

    public void zq5(){
       super();
    }
    public final boolean a(){
       return (this.mObservers.isEmpty() ^ 0x01);
    }
    public final void b(){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).a();
       }
       return;
    }
    public final void c(int p0,int p1){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).d(p0, p1);
       }
       return;
    }
    public final void d(int p0,int p1,Object p2){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).b(p0, p1, p2);
       }
       return;
    }
    public final void e(int p0,int p1){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).c(p0, p1);
       }
       return;
    }
    public final void f(int p0,int p1){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).e(p0, p1);
       }
       return;
    }
    public final void g(){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).f();
       }
       return;
    }
}
