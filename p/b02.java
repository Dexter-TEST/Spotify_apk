package p.b02;
import p.i87;
import java.lang.Object;
import p.h87;
import p.pk;
import p.j87;
import p.wh6;
import java.util.ArrayList;
import p.g87;
import android.view.View;
import p.al7;
import p.cl7;
import java.lang.Class;

public final class b02 extends i87	// class@001028 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void b02(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void a(h87 p0){
       b02 tb = this.b;
       switch (this.a){
           case 0:
             dl7 a = al7.a;
             a.h(tb, 0x3f800000);
             a.getClass();
             p0.w(this);
             return;
           case 1:
             tb.getOrDefault(this.c.b, null).remove(p0);
             p0.w(this);
             return;
           default:
             tb.B();
             p0.w(this);
             return;
       }
    }
}
