package p.z45;
import p.vl2;
import p.a70;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import p.kf6;
import p.y45;
import android.content.Context;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;

public final class z45	// class@002e87 from classes.dex
{
    public final vl2 a;
    public final a70 b;

    public void z45(vl2 p0,a70 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final kf6 a(String p0,String p1,String p2,Runnable p3){
       tj2 otj2 = xe7.k0(this.a.a, p0, p1);
       otj2.a = p2;
       otj2.c = new y45(p3);
       otj2.e = false;
       kf6 okf6 = otj2.a();
       okf6.l();
       return okf6;
    }
}
