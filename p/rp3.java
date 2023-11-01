package p.rp3;
import p.ew5;
import p.tm5;
import java.lang.Object;
import java.lang.Boolean;
import p.t00;
import io.reactivex.rxjava3.core.Single;
import p.bm;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.mx6;
import p.yf2;

public final class rp3	// class@002531 from classes.dex
{
    public final ew5 a;
    public final tm5 b;
    public final t00 c;

    public void rp3(ew5 p0,tm5 p1){
       super();
       this.c = t00.b(Boolean.FALSE);
       this.a = p0;
       this.b = p1;
    }
    public final Single a(){
       return this.c.filter(new bm(12)).firstOrError().flatMap(new mx6(3, this));
    }
}
