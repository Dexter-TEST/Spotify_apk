package p.up3;
import p.xt2;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import android.widget.LinearLayout;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import p.tu2;
import java.lang.CharSequence;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;

public final class up3 implements xt2	// class@0028f5 from classes.dex
{

    public void up3(){
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       co5.o(p0, "view");
       co5.o(p1, "data");
       co5.o(p2, "config");
       co5.o(p3, "state");
       p0.findViewById(R.id.subtitle).setText(p1.y().m());
       p0.findViewById(R.id.title).setText(p1.y().d());
    }
    public final View c(ViewGroup p0,uu2 p1){
       co5.o(p0, "parent");
       co5.o(p1, "config");
       View view = LayoutInflater.from(p0.getContext()).inflate(R.layout.lite_home_section_header_with_recommencdation, p0, false);
       co5.j(view, "null cannot be cast to non-null type android.widget.LinearLayout");
       return view;
    }
    public final EnumSet d(){
       EnumSet uEnumSet = EnumSet.of(nk2.c);
       co5.l(uEnumSet, "of\(GlueLayoutTraits.Trait.HEADER\)");
       return uEnumSet;
    }
}
