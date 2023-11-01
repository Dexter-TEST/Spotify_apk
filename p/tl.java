package p.tl;
import androidx.viewpager2.adapter.a;
import p.mb2;
import java.util.Comparator;
import java.util.Collections;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.util.ArrayList;
import android.content.Context;
import java.lang.String;
import android.os.BaseBundle;
import java.util.Collection;
import java.lang.Math;
import java.lang.Object;
import p.sl;

public final class tl extends a	// class@002798 from classes.dex
{
    public final Context C;
    public int D;
    public final ArrayList E;
    public static final Comparator F;

    static {
       tl.F = Collections.reverseOrder(new mb2(4));
    }
    public void tl(Fragment p0,Bundle p1){
       ArrayList parcelableAr;
       super(p0);
       ArrayList uArrayList = new ArrayList(10);
       this.E = uArrayList;
       this.C = p0.requireContext();
       if (p1 != null) {
          this.D = p1.getInt("adapter.counter");
          if ((parcelableAr = p1.getParcelableArrayList("adapter.cards")) != null) {
             uArrayList.addAll(parcelableAr);
          }
       }
       return;
    }
    public final int d(){
       return Math.min(this.E.size(), 6);
    }
    public final Fragment y(int p0){
       sl osl = this.E.get(p0);
       sl v = osl.v;
       osl.v = null;
       if (v == null) {
          v = Fragment.instantiate(this.C, osl.c, osl.t);
       }
       return v;
    }
}
