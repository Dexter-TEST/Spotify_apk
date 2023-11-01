package p.lt2;
import p.ut2;
import android.view.ViewGroup;
import p.uu2;
import p.xj7;
import android.content.Context;
import android.view.View;
import p.uh4;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.hr5;
import android.content.res.Resources;
import p.dr5;
import p.ox7;
import p.kt2;
import p.er5;
import p.xs2;
import p.m02;
import java.lang.Object;
import p.mr5;
import java.lang.Class;
import p.ej5;
import p.ou2;
import p.vv7;
import p.ju2;
import p.bt2;
import java.util.List;
import android.os.Parcelable;
import p.yq5;

public final class lt2 extends ut2	// class@001dbb from classes.dex
{
    public final int b;
    public final LinearLayoutManager c;
    public final xs2 d;
    public ju2 e;
    public bt2 f;

    public void lt2(ViewGroup p0,uu2 p1,int p2){
       xj7 oxj7;
       LinearLayoutManager linearLayout;
       xs2 oxs2;
       this.b = p2;
       int i = -1;
       dr5 uodr5 = null;
       int i1 = 0x7f0601c3;
       int i2 = 1;
       if (p2 != i2) {
          oxj7 = new xj7(p0.getContext());
          super(oxj7);
          oxj7.setNestedScrollingEnabled(p0 instanceof uh4);
          p0.getContext();
          linearLayout = new LinearLayoutManager(i2);
          this.c = linearLayout;
          linearLayout.z = false;
          linearLayout.s1(false);
          oxj7.setLayoutManager(linearLayout);
          oxj7.setItemAnimator(uodr5);
          oxj7.h(new kt2(this, p0.getResources().getDimensionPixelSize(i1), ox7.y(p0)), i);
          oxs2 = new xs2(p1);
          this.d = oxs2;
          oxj7.o0(oxs2);
          oxj7.i(new m02(3, this));
          oxj7.setHasFixedSize(false);
          return;
       }else {
          oxj7 = new xj7(p0.getContext());
          super(oxj7);
          oxj7.setNestedScrollingEnabled(p0 instanceof uh4);
          p0.getContext();
          linearLayout = new LinearLayoutManager(i2);
          this.c = linearLayout;
          linearLayout.z = false;
          linearLayout.s1(false);
          oxj7.setLayoutManager(linearLayout);
          oxj7.setItemAnimator(uodr5);
          oxj7.h(new kt2(this, ox7.y(p0), p0.getResources().getDimensionPixelSize(i1)), i);
          p1.getClass();
          ej5 uoej5 = new ej5(8);
          uu2 a = p1.a;
          a.getClass();
          uoej5.b = a;
          a = p1.b;
          a.getClass();
          uoej5.c = a;
          ou2[] oou2Array = new ou2[i2];
          oou2Array[0] = p1.d;
          uoej5.a = vv7.B(oou2Array);
          a = p1.e;
          a.getClass();
          uoej5.e = a;
          a = p1.f;
          a.getClass();
          uoej5.f = a;
          a = p1.g;
          a.getClass();
          uoej5.d = a;
          a = p1.i;
          a.getClass();
          uoej5.g = a;
          p1 = p1.j;
          p1.getClass();
          uoej5.h = p1;
          oxs2 = new xs2(uoej5.e());
          this.d = oxs2;
          oxj7.o0(oxs2);
          oxj7.i(new m02(4, this));
          oxj7.setHasFixedSize(false);
          return;
       }
    }
    public final void a(ju2 p0,uu2 p1,bt2 p2){
       Parcelable parcelable;
       lt2 tc = this.c;
       lt2 td = this.d;
       ut2 ta = this.a;
       switch (this.b){
           case 0:
             ta.n0();
             this.e = p0;
             this.f = p2;
             td.w(p0.j());
             if ((parcelable = p2.a(p0)) != null) {
                tc.s0(parcelable);
             }else {
                tc.r1(0, 0);
             }
             break;
           default:
             ta.n0();
             this.e = p0;
             this.f = p2;
             td.w(p0.j());
             if ((parcelable = p2.a(p0)) != null) {
                tc.s0(parcelable);
             }else {
                tc.r1(0, 0);
             }
             td.g();
             return;
       }
       td.g();
       return;
    }
}
