package p.di7;
import p.la6;
import java.lang.Object;
import java.util.Iterator;
import p.ng2;
import java.lang.String;
import p.co5;
import p.ma6;
import p.au0;
import p.ye7;
import java.lang.Iterable;
import p.ko6;
import p.xe7;
import android.view.ViewGroup;

public final class di7 implements la6	// class@001355 from classes.dex
{
    public final int a;
    public final Object b;

    public void di7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Iterator iterator(){
       di7 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, "<this>");
             return new ko6(1, tb);
           case 1:
             return xe7.D(tb);
           case 2:
             return tb.iterator();
           case 3:
             co5.o(tb, "block");
             ma6 oma6 = new ma6();
             oma6.t = ye7.p(oma6, oma6, tb);
             return oma6;
           default:
             return tb;
       }
    }
}
