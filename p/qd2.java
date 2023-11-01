package p.qd2;
import p.jr0;
import androidx.fragment.app.o;
import java.lang.Object;
import p.ee4;
import java.lang.Class;
import java.lang.Integer;
import android.content.res.Configuration;
import p.ke5;

public final class qd2 implements jr0	// class@00237b from classes.dex
{
    public final int a;
    public final o b;

    public void qd2(o p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       qd2 tb = this.b;
       switch (this.a){
           case 0:
             tb.h(p0);
             return;
           case 1:
             tb.getClass();
             if (p0.intValue() == 80) {
                tb.l();
             }
             return;
             break;
           case 2:
             tb.getClass();
             tb.m(p0.a);
             return;
           default:
             tb.getClass();
             tb.r(p0.a);
             return;
       }
    }
}
