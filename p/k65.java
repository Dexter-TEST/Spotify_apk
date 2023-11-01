package p.k65;
import android.widget.AbsListView$OnScrollListener;
import p.mr5;
import p.t67;
import androidx.recyclerview.widget.RecyclerView;
import p.hr5;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import p.jl;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.j65;
import io.reactivex.rxjava3.core.Single;
import android.widget.AbsListView;

public final class k65 extends mr5 implements AbsListView$OnScrollListener	// class@001bb5 from classes.dex
{
    public int a;
    public boolean b;
    public final t67 c;

    public void k65(t67 p0){
       this.c = p0;
       super();
    }
    public final void b(RecyclerView p0,int p1,int p2){
       hr5 layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          p1 = layoutManage.a1();
          int i = ((p2 = layoutManage.I()) <= 0)? 0: p2 - 1;
          this.c((p1 + i), p2, layoutManage.O());
       }else {
          jl.d("LayoutManager is not compatible: "+layoutManage);
       }
       return;
    }
    public final void c(int p0,int p1,int p2){
       boolean b = false;
       if (p2 != this.a) {
          this.a = p2;
          this.b = b;
       }
       k65 tc = this.c;
       if ((TextUtils.isEmpty(tc.y) ^ 1)) {
          if (this.b == null && p1) {
             if (((p0 + 10)) >= (p2 - 1)) {
                b = true;
             }
             if (b) {
                if (!TextUtils.isEmpty(tc.y)) {
                   tc.c(tc.t.g(tc.y));
                }
                this.b = true;
             }
          }
       }else {
          this.b = b;
       }
       return;
    }
    public final void d(AbsListView p0,int p1,int p2,int p3){
       this.c(((p1 + p2) - 1), p2, p3);
    }
    public final void onScroll(AbsListView p0,int p1,int p2,int p3){
       this.d(p0, p1, p2, p3);
    }
    public final void onScrollStateChanged(AbsListView p0,int p1){
    }
}
