package p.ip3;
import p.xt2;
import p.k73;
import p.m73;
import p.hp3;
import java.lang.Object;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import android.view.ViewGroup$LayoutParams;
import p.au2;
import java.lang.String;
import p.r45;
import p.rp;
import p.jg2;
import android.content.Context;
import p.og2;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;

public final class ip3 implements xt2	// class@0019db from classes.dex
{
    public static final m73 a;
    public static final EnumSet b;

    static {
       k73 ok73 = m73.a();
       ok73.d("small", hp3.b);
       ok73.d("medium", hp3.c);
       ok73.d("large", hp3.d);
       ok73.d("huge", hp3.e);
       ok73.d("toolbar", hp3.f);
       ip3.a = ok73.a();
       ip3.b = EnumSet.of(nk2.y);
    }
    public void ip3(){
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.height = View$MeasureSpec.makeMeasureSpec(r45.a(p1.b().q("height")).g(new rp(14)).e(hp3.b).a.apply(p0.getContext()).intValue(), 0x40000000);
       p0.setLayoutParams(layoutParams);
    }
    public final View c(ViewGroup p0,uu2 p1){
       View view = new View(p0.getContext());
       view.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentLayoutParams(p0.getContext(), p0));
       return view;
    }
    public final EnumSet d(){
       return ip3.b;
    }
}
