package p.a50;
import p.ap5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.ref.Reference;
import java.lang.System;
import p.b17;
import java.lang.Math;
import java.lang.Class;

public final class a50 extends ap5	// class@000f14 from classes.dex
{
    public final BottomSheetBehavior G;

    public void a50(BottomSheetBehavior p0){
       this.G = p0;
       super();
    }
    public final boolean D(View p0,int p1){
       BottomSheetBehavior p;
       a50 tG = this.G;
       BottomSheetBehavior g = tG.G;
       boolean b = false;
       if (g == 1) {
          return b;
       }
       if (tG.U != null) {
          return b;
       }
       if (g == 3 && tG.S == p1) {
          View view = ((p = tG.P) != null)? p.get(): null;
          if (view != null && view.canScrollVertically(-1)) {
             return b;
          }
       }
       System.currentTimeMillis();
       if ((p = tG.O) != null && p.get() == p0) {
          b = true;
       }
       return b;
    }
    public final int k(View p0,int p1){
       return p0.getLeft();
    }
    public final int l(View p0,int p1){
       a50 tG = this.G;
       int i = tG.B();
       BottomSheetBehavior n = (tG.D != null)? tG.N: tG.B;
       return b17.f(p1, i, n);
    }
    public final int r(){
       a50 tG = this.G;
       if (tG.D != null) {
          return tG.N;
       }
       return tG.B;
    }
    public final void x(int p0){
       if (p0 == 1) {
          a50 tG = this.G;
          if (tG.F != null) {
             tG.F(1);
          }
       }
       return;
    }
    public final void y(View p0,int p1,int p2){
       this.G.x(p2);
    }
    public final void z(View p0,float p1,float p2){
       BottomSheetBehavior y;
       BottomSheetBehavior uBottomSheet;
       int top;
       int i = 6;
       a50 tG = this.G;
       int i1 = 0;
       if ((p2 - i1) < 0) {
          if (tG.b != null) {
             y = tG.y;
          label_00ea :
             i = 3;
             uBottomSheet = y;
          }else {
             System.currentTimeMillis();
             uBottomSheet = tG.z;
             if (p0.getTop() <= uBottomSheet) {
                y = tG.B();
                goto label_00ea ;
             }
          }
       }else if(tG.D != null && tG.I(p0, p2)){
          if ((Math.abs(p1) - Math.abs(p2)) >= 0 || (0x43fa0000 - p2) <= 0) {
             y = (p0.getTop() > ((tG.B() + tG.N) / 2))? 1: 0;
             if (!y) {
                if (tG.b != null) {
                   y = tG.y;
                   goto label_00ea ;
                }else if(Math.abs((p0.getTop() - tG.B())) < Math.abs((p0.getTop() - tG.z))){
                   y = tG.B();
                   goto label_00ea ;
                }else {
                   uBottomSheet = tG.z;
                }
             }
          }
          uBottomSheet = tG.N;
          i = 5;
       }else if((i1 - p2) && (Math.abs(p2) - Math.abs(p1)) <= 0){
          if (tG.b != null) {
             y = tG.B;
          }else {
             top = p0.getTop();
             if (Math.abs((top - tG.z)) < Math.abs((top - tG.B))) {
                uBottomSheet = tG.z;
             }else {
                y = tG.B;
             }
          }
       }else {
          top = p0.getTop();
          if (tG.b != null) {
             if (Math.abs((top - tG.y)) < Math.abs((top - tG.B))) {
                y = tG.y;
                goto label_00ea ;
             }else {
                y = tG.B;
             }
          }else {
             uBottomSheet = tG.z;
             if (top < uBottomSheet) {
                if (top < Math.abs((top - tG.B))) {
                   top = tG.B();
                   goto label_00ea ;
                }else {
                   uBottomSheet = tG.z;
                }
             }else if(Math.abs((top - uBottomSheet)) < Math.abs((top - tG.B))){
                uBottomSheet = tG.z;
             }else {
                y = tG.B;
             }
          }
       }
       uBottomSheet = y;
       i = 4;
       tG.getClass();
       tG.J(p0, i, uBottomSheet, true);
       return;
    }
}
