package p.cz7;
import p.ly7;
import p.wx7;
import java.lang.Object;
import java.lang.String;
import p.b28;
import android.content.Context;
import p.hy7;
import p.jy7;
import p.bz7;
import p.ax7;
import p.iy7;
import p.mz7;
import p.lz7;
import java.io.File;
import p.xv7;
import p.jz7;
import p.dx7;
import p.xy7;

public final class cz7 implements ly7	// class@0012ac from classes.dex
{
    public final int a;
    public final ly7 b;
    public final ly7 c;
    public final ly7 t;
    public final ly7 v;
    public final ly7 w;
    public final ly7 x;
    public final ly7 y;

    public void cz7(ly7 p0,wx7 p1,ly7 p2,ly7 p3,ly7 p4,ly7 p5,ly7 p6,int p7){
       this.a = p7;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.x = p5;
       this.y = p6;
       super();
    }
    public final Object c(){
       cz7 ty = this.y;
       cz7 tx = this.x;
       cz7 tw = this.w;
       cz7 tv = this.v;
       cz7 tt = this.t;
       cz7 tc = this.c;
       cz7 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             jz7 tx2 = new jz7(tb.c(), jy7.a(tc), tt.c(), jy7.a(tv), tw.c(), tx.c(), ty.c());
             return tx;
       }
       String str = tb.c();
       tt.c();
       Context uContext = tv.a();
       hy7 ohy7 = jy7.a(tx);
       String obj = ty.c();
       Object obj1 = tc.c();
       Object obj2 = tw.c();
       obj = null;
       File uFile = (str != null)? new File(uContext.getExternalFilesDir(obj), str): uContext.getExternalFilesDir(obj);
       bz7 tx1 = new bz7(uFile, obj1, uContext, obj2, ohy7);
       return tx;
    }
}
