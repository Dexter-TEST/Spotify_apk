package p.uj7;
import p.a27;
import androidx.viewpager2.widget.ViewPager2;
import p.u44;
import java.lang.Object;
import p.g54;
import p.yq5;
import p.ar5;
import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import p.wh7;
import android.view.View;
import p.dh7;
import p.oj7;
import android.view.accessibility.AccessibilityNodeInfo;
import p.x3;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.os.Bundle;
import java.lang.IllegalStateException;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.lang.CharSequence;
import p.hr5;
import p.w3;
import p.l4;

public final class uj7 extends a27	// class@0028c3 from classes.dex
{
    public final u44 c;
    public final g54 t;
    public oj7 v;
    public final ViewPager2 w;

    public void uj7(ViewPager2 p0){
       this.w = p0;
       super(p0);
       this.c = new u44(9, this);
       this.t = new g54(this);
    }
    public final void j(yq5 p0){
       this.p();
       if (p0 != null) {
          p0.u(this.v);
       }
       return;
    }
    public final void k(yq5 p0){
       if (p0 != null) {
          p0.a.unregisterObserver(this.v);
       }
       return;
    }
    public final void l(RecyclerView p0){
       dh7.s(p0, 2);
       this.v = new oj7(1, this);
       uj7 tw = this.w;
       if (!dh7.c(tw)) {
          dh7.s(tw, 1);
       }
       return;
    }
    public final void m(AccessibilityNodeInfo p0){
       int i1;
       int i2;
       yq5 adapter;
       uj7 tw = this.w;
       int i = 0;
       if (tw.getAdapter() != null) {
          if (tw.getOrientation() == 1) {
             i1 = tw.getAdapter().d();
          }else {
             i2 = tw.getAdapter().d();
             i1 = 0;
          label_0026 :
             p0.setCollectionInfo(x3.c(i1, i2, i).a);
             if ((adapter = tw.getAdapter()) != null && ((i1 = adapter.d()) && tw.I != null)) {
                if (tw.t > null) {
                   p0.addAction(8192);
                }
                if (tw.t < (i1 - 1)) {
                   p0.addAction(4096);
                }
                p0.setScrollable(1);
             }
             return;
          }
       }else {
          i1 = 0;
       }
       i2 = 0;
       goto label_0026 ;
    }
    public final void n(int p0,Bundle p1){
       int i1;
       int i = 8192;
       uj7 tw = (p0 != i && p0 != 4096)? 0: 1;
       if (i1) {
          tw = this.w;
          p0 = (p0 == i)? tw.getCurrentItem() - 1: tw.getCurrentItem() + 1;
          if (tw.I != null) {
             tw.c(p0, 1);
          }
          return;
       }else {
          throw new IllegalStateException();
       }
    }
    public final void o(AccessibilityEvent p0){
       p0.setSource(this.w);
       p0.setClassName("androidx.viewpager.widget.ViewPager");
    }
    public final void p(){
       int i4;
       uj7 tw = this.w;
       int i = 0x1020048;
       wh7.k(tw, i);
       int i1 = 0;
       wh7.g(tw, i1);
       wh7.k(tw, 0x1020049);
       wh7.g(tw, i1);
       int i2 = 0x1020046;
       wh7.k(tw, i2);
       wh7.g(tw, i1);
       int i3 = 0x1020047;
       wh7.k(tw, i3);
       wh7.g(tw, i1);
       if (tw.getAdapter() == null) {
          return;
       }
       if (!(i4 = tw.getAdapter().d())) {
          return;
       }
       if (tw.I == null) {
          return;
       }
       uj7 tc = this.c;
       uj7 tt = this.t;
       if (!tw.getOrientation()) {
          if (tw.x.P() == 1) {
             i1 = 1;
          }
          i2 = (i1)? 0x1020048: 0x1020049;
          if (i1) {
             i = 0x1020049;
          }
          if (tw.t < (i4 - 1)) {
             wh7.l(tw, new w3(i2), tc);
          }
          if (tw.t > null) {
             wh7.l(tw, new w3(i), tt);
          }
       }else if(tw.t < (i4 - 1)){
          wh7.l(tw, new w3(i3), tc);
       }
       if (tw.t > null) {
          wh7.l(tw, new w3(i2), tt);
       }
       return;
    }
}
