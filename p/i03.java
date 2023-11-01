package p.i03;
import p.j03;
import p.c33;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.qz5;
import p.k03;
import android.content.Context;
import android.view.ViewGroup;
import p.xz5;
import p.c06;
import p.au2;
import java.lang.String;
import java.util.Locale;
import java.lang.Object;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import p.o85;
import p.xj0;
import p.zz5;
import p.eo5;

public class i03 extends j03	// class@0018f9 from classes.dex
{
    public final int g;

    public void i03(c33 p0,boolean p1,int p2){
       this.g = p2;
       super(p0, p1);
    }
    public void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.g){
           case 0:
           default:
             this.h(p0, p1, p2);
             return;
       }
       this.h(p0, p1, p2);
       return;
    }
    public zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.g){
           case 0:
           default:
             return this.j(p0, p1);
       }
       return this.j(p0, p1);
    }
    public void g(qz5 p0,ju2 p1){
       switch (this.g){
           case 0:
           default:
             this.i(p0, p1);
             return;
       }
       super.i(p0, p1);
       return;
    }
    public void i(xz5 p0,ju2 p1){
       switch (this.g){
           case 1:
           default:
             super.i(p0, p1);
             return;
       }
       super.i(p0, p1);
       Object[] objArray = new Object[]{Integer.valueOf(p1.b().c("row_number", 0))};
       p0.v.setText(String.format(Locale.getDefault(), "%d", objArray));
       return;
    }
    public qz5 j(Context p0,ViewGroup p1){
       switch (this.g){
           case 0:
           default:
             return this.k(p0, p1);
       }
       return this.k(p0, p1);
    }
    public xz5 k(Context p0,ViewGroup p1){
       int i;
       j03 tf = this.f;
       switch (this.g){
           case 0:
             i = (tf != null)? 0x7f0d00bc: 0x7f0d00bb;
             break;
           default:
             i = (tf != null)? 0x7f0d00c0: 0x7f0d00bf;
             c06 uoc06 = new c06(xj0.x0(p0, p1, i));
             eo5.P(uoc06);
             return uoc06;
       }
       zz5 ozz5 = new zz5(xj0.x0(p0, p1, i));
       eo5.P(ozz5);
       return ozz5;
    }
}
