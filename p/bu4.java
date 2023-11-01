package p.bu4;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.zo0;

public final class bu4 implements zv6	// class@001139 from classes.dex
{
    public final Observable a;
    public final int b;
    public final boolean c;

    public void bu4(Observable p0,int p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object get(){
       return this.a.replay(this.b, this.c);
    }
}
