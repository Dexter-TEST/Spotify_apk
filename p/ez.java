package p.ez;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import p.vt;
import p.r45;
import p.au2;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab0;
import p.bi5;
import p.dz;
import p.yf2;
import p.a43;

public abstract class ez implements ObservableTransformer	// class@00152d from classes.dex
{

    public void ez(){
       super();
    }
    public abstract au2 a(vt p0,Object p1,r45 p2);
    public final ObservableSource apply(Observable p0){
       return p0.filter(new ab0(23)).flatMapSingle(new dz(this, 0)).map(new dz(this, 1));
    }
    public abstract a43 b(vt p0,Object p1,r45 p2,a43 p3);
}
