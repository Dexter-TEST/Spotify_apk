package p.qg1;
import p.j65;
import p.rg1;
import p.nq5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Single;
import p.al5;
import io.reactivex.rxjava3.core.Observable;
import p.up0;
import io.reactivex.rxjava3.core.SingleSource;
import p.w00;
import java.lang.String;

public final class qg1 implements j65	// class@002395 from classes.dex
{
    public final j65 a;
    public final rg1 b;

    public void qg1(rg1 p0,nq5 p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final Single first(){
       return Single.zip(this.b.v.d.distinctUntilChanged().firstOrError(), this.a.first(), new up0(4, this));
    }
    public final Single g(String p0){
       return this.a.g(p0);
    }
}
