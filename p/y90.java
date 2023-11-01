package p.y90;
import io.reactivex.rxjava3.disposables.Disposable;
import p.s90;
import java.lang.Object;

public final class y90 implements Disposable	// class@0003d5 from classes2.dex
{
    public final s90 a;
    public boolean b;

    public void y90(s90 p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b = true;
       this.a.cancel();
    }
    public boolean isDisposed(){
       return this.b;
    }
}
