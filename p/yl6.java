package p.yl6;
import p.rf5;
import java.lang.Object;
import p.fn0;
import io.reactivex.rxjava3.core.Observable;
import p.p54;
import p.rp;
import p.bi5;
import p.xl6;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class yl6	// class@002de1 from classes.dex
{
    public final rf5 a;
    public final fn0 b;

    public void yl6(rf5 p0){
       super();
       this.b = new fn0();
       this.a = p0;
    }
    public final Observable a(){
       return this.a.j.hide().filter(new rp(7)).map(new xl6(2)).map(new xl6(3)).observeOn(id.a()).distinctUntilChanged();
    }
    public final void b(int p0){
       yl6 tb = this.b;
       tb.e();
       if (p0 == 1) {
          tb.c(this.a.i().subscribe());
       }else if(p0 == 2){
          tb.e();
       }
       return;
    }
}
