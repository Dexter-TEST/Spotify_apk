package p.xc3;
import p.mb0;
import p.zf2;
import java.lang.Throwable;
import java.lang.Object;
import p.jc7;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import p.w51;

public final class xc3 extends mb0	// class@002c4c from classes.dex
{
    public final zf2 a;

    public void xc3(zf2 p0){
       super();
       this.a = p0;
    }
    public final void a(Throwable p0){
       this.a.invoke(p0);
    }
    public final Object invoke(Object p0){
       this.a(p0);
       return jc7.a;
    }
    public final String toString(){
       return "InvokeOnCancel["+this.a.getClass().getSimpleName()+'@'+w51.x(this)+']';
    }
}
