package p.e03;
import p.g03;
import p.c33;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.qz5;
import p.k03;
import android.content.Context;
import android.view.ViewGroup;
import p.uz5;
import java.lang.CharSequence;
import p.eo5;
import p.tu2;
import java.lang.String;
import p.au2;
import android.text.TextUtils;
import p.o85;
import p.xj0;
import p.wz5;
import p.tz5;
import p.vz5;

public class e03 extends g03	// class@0013f0 from classes.dex
{
    public final int f;

    public void e03(c33 p0,int p1){
       this.f = p1;
       super(p0);
    }
    public void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.f){
           case 1:
             this.h(p0, p1, p2);
             return;
           case 2:
             this.h(p0, p1, p2);
             return;
           default:
             super.e(p0, p1, p2, p3);
             return;
       }
    }
    public zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.f){
           case 1:
             return this.j(p0, p1);
           case 2:
             return this.j(p0, p1);
           default:
             return this.j(p0, p1);
       }
    }
    public void g(qz5 p0,ju2 p1){
       switch (this.f){
           case 0:
             this.i(p0, p1);
             return;
           case 1:
             p0.setText(eo5.m(p1));
             return;
           default:
             p0.setText(eo5.m(p1));
             return;
       }
    }
    public void i(uz5 p0,ju2 p1){
       switch (this.f){
           case 0:
             break;
           default:
             p0.setText(eo5.m(p1));
             return;
       }
       CharSequence uCharSequenc = eo5.m(p1);
       CharSequence uCharSequenc1 = eo5.y(p1.y().e(), p1.b().y("glue:descriptionAsHtml", false));
       if (!TextUtils.isEmpty(uCharSequenc)) {
          p0.setText(uCharSequenc);
       }else if(!TextUtils.isEmpty(uCharSequenc1)){
          p0.setText(uCharSequenc1);
       }
       return;
    }
    public qz5 j(Context p0,ViewGroup p1){
       switch (this.f){
           case 0:
             return this.k(p0, p1);
           case 1:
             return this.k(p0, p1);
           default:
             return this.k(p0, p1);
       }
    }
    public uz5 k(Context p0,ViewGroup p1){
       switch (this.f){
           case 0:
             tz5 otz5 = new tz5(xj0.x0(p0, p1, R.layout.glue_listtile_1));
             otz5.a(Integer.MAX_VALUE);
             eo5.P(otz5);
             return otz5;
           case 1:
             wz5 owz5 = new wz5(xj0.x0(p0, p1, R.layout.glue_listtile_1_small));
             eo5.P(owz5);
             return owz5;
           default:
             vz5 ovz5 = new vz5(xj0.x0(p0, p1, R.layout.glue_listtile_1_image));
             eo5.P(ovz5);
             return ovz5;
       }
    }
}
