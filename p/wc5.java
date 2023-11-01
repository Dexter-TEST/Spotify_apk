package p.wc5;
import p.qg2;
import p.xj0;
import p.zg0;
import java.lang.Object;
import p.eb5;
import p.na5;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;
import p.id5;
import p.mc5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.db5;

public final class wc5 implements qg2	// class@002b0d from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void wc5(xj0 p0,int p1,zg0 p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final Object apply(Object p0){
       wc5 tb = this.b;
       wc5 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return id5.b(tc.I, tc.J, tc.K, p0, tb).concatWith(Observable.just(new mc5()));
       }
       return id5.b(tc.H, tc.I, tc.J, p0, tb);
    }
}
