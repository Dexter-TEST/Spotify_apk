package p.s02;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.sd5;
import p.yf2;
import p.ab0;
import p.ox7;
import p.mk4;
import p.jw0;
import p.l94;

public final class s02 implements ObservableTransformer	// class@002591 from classes.dex
{
    public final int a;

    public void s02(int p0){
       this.a = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       switch (this.a){
           case 0:
             return ox7.K(p0);
           case 1:
             return ox7.K(p0);
           case 2:
             return ox7.K(p0);
           case 3:
             return p0.debounce(new jw0(16));
           case 4:
             return p0.debounce(new mk4(14));
           case 5:
             return ox7.C(p0);
           case 6:
             return ox7.C(p0);
           case 7:
             return ox7.K(p0);
           case 8:
             return ox7.K(p0);
           case 9:
             return ox7.K(p0);
           case 10:
             return ox7.K(p0);
           case 11:
             return ox7.K(p0);
           case 12:
             return ox7.K(p0);
           case 13:
             return ox7.K(p0);
           case 14:
             return p0.switchMap(new ab0(4));
           case 15:
             return p0.switchMap(new sd5(22));
           case 16:
             return p0.switchMap(new sd5(23));
           default:
             return p0.flatMap(new l94(3));
       }
    }
}
