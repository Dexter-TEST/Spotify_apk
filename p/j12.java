package p.j12;
import p.ir0;
import p.l12;
import java.lang.Object;
import p.cu2;
import java.lang.Class;
import java.util.Map;
import p.ju2;
import p.tt2;
import p.au2;
import p.mn6;
import android.os.Bundle;
import p.k23;
import java.lang.String;
import android.os.Parcelable;
import p.a23;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.f;
import android.content.Context;
import android.content.Intent;
import p.xj0;

public final class j12 implements ir0	// class@001a45 from classes.dex
{
    public final int a;
    public final l12 b;

    public void j12(l12 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       tt2 ott2;
       j12 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
       }
       tb.getClass();
       if ((ott2 = p0.b.m().get(p0.a)) != null) {
          mn6 omn6 = new mn6();
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("model", k23.U(p0.b));
          uBundle.putParcelable("bundle", a23.W(ott2.b()));
          omn6.setArguments(uBundle);
          if (!omn6.isAdded()) {
             p0 = tb.getChildFragmentManager();
             if (p0.D("lite/entity/contextMenu") == null) {
                omn6.B(p0, "lite/entity/contextMenu");
             }
          }
       }
       return;
    }
}
