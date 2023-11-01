package p.p0;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public abstract class p0 extends Flowable	// class@0021cb from classes.dex
{
    public final Flowable b;

    public void p0(Flowable p0){
       super();
       Objects.requireNonNull(p0, "source is null");
       this.b = p0;
    }
}
