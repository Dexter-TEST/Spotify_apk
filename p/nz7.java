package p.nz7;
import p.ly7;
import p.b28;
import java.lang.Object;
import android.content.Context;
import p.mz7;
import p.s18;

public final class nz7 implements ly7	// class@00207e from classes.dex
{
    public final int a;
    public final ly7 b;

    public void nz7(b28 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object c(){
       nz7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new s18(tb.c());
       }
       return new mz7(tb.a());
    }
}
