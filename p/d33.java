package p.d33;
import p.xt2;
import p.ct2;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import android.widget.TextView;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import p.b2;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;

public final class d33 extends ct2 implements xt2	// class@0012cd from classes.dex
{
    public final int b;

    public void d33(int p0){
       this.b = p0;
       if (p0 != 1) {
          super(0x7f0d00d9);
          return;
       }else {
          super(0x7f0d0079);
          return;
       }
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.b){
           case 0:
           default:
             p0.setText(p1.y().d());
             p0.setOnClickListener(new b2(p1, p2, 1));
             return;
       }
       p0.findViewById(R.id.text).setText(p1.y().e());
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       ct2 ta = this.a;
       boolean b = false;
       switch (this.b){
           case 1:
           default:
             return LayoutInflater.from(p0.getContext()).inflate(ta, p0, b);
       }
       TextView textView = LayoutInflater.from(p0.getContext()).inflate(ta, p0, b);
       textView.setPaintFlags((textView.getPaintFlags() | 0x08));
       mj5 omj5 = oj5.c(textView);
       View[] viewArray = new View[]{textView};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
       return textView;
    }
    public final EnumSet d(){
       switch (this.b){
           case 0:
           default:
             return EnumSet.of(nk2.w);
       }
       return EnumSet.of(nk2.x);
    }
}
