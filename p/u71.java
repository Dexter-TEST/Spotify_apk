package p.u71;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.lang.String;
import java.util.Objects;
import p.cd1;
import p.ye7;

public abstract class u71 implements Observer	// class@002856 from classes.dex
{
    public Disposable a;

    public void u71(){
       super();
    }
    public final void onSubscribe(Disposable p0){
       u71 ta = this.a;
       Class class = this.getClass();
       Objects.requireNonNull(p0, "next is null");
       if (ta != null) {
          p0.dispose();
          if (ta != cd1.a) {
             ye7.Q(class);
          }
          ta = 0;
       }else {
          ta = 1;
       }
       if (ta) {
          this.a = p0;
       }
       return;
    }
}
