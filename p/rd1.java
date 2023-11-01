package p.rd1;
import p.h25;
import p.td1;
import java.lang.String;
import java.lang.Object;
import p.dt0;
import p.sd1;
import p.yd1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import p.xj0;
import java.lang.Class;
import p.th1;
import p.an5;
import p.lh1;
import p.ug1;

public final class rd1 implements h25	// class@0024c3 from classes.dex
{
    public final int a;
    public final td1 b;
    public final String c;

    public void rd1(td1 p0,String p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(dt0 p0){
       yd1 oyd1;
       rd1 tc = this.c;
       rd1 tb = this.b;
       switch (this.a){
           case 0:
             oyd1 = tb.C();
             oyd1.getClass();
             oyd1.x.onNext(new ug1(tc));
             return;
           case 1:
             oyd1 = tb.C();
             oyd1.getClass();
             oyd1.x.onNext(new lh1(tc));
             return;
           case 2:
             oyd1 = tb.C();
             oyd1.getClass();
             oyd1.x.onNext(new th1(tc));
             return;
           case 3:
             oyd1 = tb.C();
             oyd1.startActivity(xj0.s(oyd1.requireContext(), tc));
             return;
           default:
             oyd1 = tb.C();
             oyd1.startActivity(xj0.s(oyd1.requireContext(), tc));
             return;
       }
    }
}
