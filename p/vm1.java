package p.vm1;
import p.zv6;
import p.rf5;
import java.lang.Object;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.sd5;
import p.yf2;

public final class vm1 implements zv6	// class@002a20 from classes.dex
{
    public final int a;
    public final rf5 b;

    public void vm1(rf5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       vm1 tb = this.b;
       switch (this.a){
           case 0:
             return tb.e().map(new sd5(8)).distinctUntilChanged();
           case 1:
             return tb.e().map(new sd5(7)).distinctUntilChanged();
           default:
             return tb.f().map(new sd5(6)).distinctUntilChanged();
       }
    }
}
