package p.ud1;
import p.ir0;
import p.yd1;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import p.xj0;
import p.jc7;
import androidx.fragment.app.k;
import p.et0;
import p.ec4;
import java.lang.Class;
import p.xd1;
import p.vh1;
import androidx.fragment.app.o;
import android.os.Bundle;
import android.os.BaseBundle;
import p.td1;
import androidx.fragment.app.f;

public final class ud1 implements ir0	// class@00288a from classes.dex
{
    public final int a;
    public final yd1 b;

    public void ud1(yd1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       ud1 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             p0.a(new xd1(tb, 0), new xd1(tb, 1));
             return;
           case 1:
             et0.d(tb.getActivity());
             return;
           case 2:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
           default:
             o childFragmen = tb.getChildFragmentManager();
             if (childFragmen.D("ctx") == null) {
                Bundle uBundle = new Bundle();
                uBundle.putString("episodeUri", p0.F);
                uBundle.putString("title", p0.G);
                uBundle.putString("subtitle", p0.H);
                uBundle.putString("showUri", p0.I);
                uBundle.putString("imageUri", p0.J);
                p0 = new td1();
                p0.setArguments(uBundle);
                p0.B(childFragmen, "ctx");
             }
             return;
       }
    }
}
