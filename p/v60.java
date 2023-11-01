package p.v60;
import p.xt2;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.u60;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.ry7;
import p.co5;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import p.b70;
import p.kp2;
import p.au2;
import android.content.Context;
import android.graphics.Color;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import p.xw5;
import p.e02;
import p.a70;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import p.vj2;
import android.graphics.drawable.Drawable;
import p.wh7;
import p.dh7;
import android.view.ViewGroup;
import p.dy1;
import p.c70;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;

public final class v60 implements xt2	// class@00298b from classes.dex
{
    public final int a;
    public final Object b;

    public void v60(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       b70 uob70;
       b70 a;
       Context context;
       int i;
       int i1;
       switch (this.a){
           case 0:
           default:
             try{
                uob70 = eo5.M(p0, b70.class);
                uob70.c.c.setText(p1.y().d());
                String str = p1.b().q("color");
                a = uob70.a;
                context = a.getContext();
                Resources$Theme theme = null;
                i = 0x7f0504bc;
                i1 = (str != null)? Color.parseColor(str): xw5.b(context.getResources(), i, theme);
             }catch(java.lang.IllegalArgumentException e0){
                i1 = xw5.b(context.getResources(), i, e0);
             }
             uob70 = uob70.b;
             uob70.getClass();
             int[] ointArray = new int[]{i1,0};
             Drawable[] uDrawableArr = new Drawable[]{new GradientDrawable(GradientDrawable$Orientation.TL_BR, ointArray),new e02(uob70.a)};
             dh7.q(a, new vj2(uDrawableArr));
             return;
       }
       u60 ou60 = eo5.M(p0, u60.class);
       ry7.d(ou60.b);
       ou60 = ou60.b;
       co5.e(ou60, p1, p2);
       ou60.setText(p1.y().d());
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       v60 tb = this.b;
       switch (this.a){
           case 0:
           default:
             c70 context = p0.getContext();
             tb.getClass();
             context.getClass();
             b70 uob70 = new b70(context, p0, tb.a);
             eo5.P(uob70);
             return uob70.a;
       }
       tb.getClass();
       u60 ou60 = new u60(p0);
       eo5.P(ou60);
       return ou60.a;
    }
    public final EnumSet d(){
       switch (this.a){
           case 0:
           default:
             return EnumSet.of(nk2.c);
       }
       return EnumSet.of(nk2.y);
    }
}
