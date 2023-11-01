package p.us2;
import p.ut2;
import android.view.ViewGroup;
import p.uu2;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import p.a33;
import p.ou2;
import p.mk2;
import p.ri3;
import p.rs2;
import p.hr5;
import p.xs2;
import p.yq5;
import p.or5;
import p.ss2;
import p.mc0;
import java.lang.Object;
import android.view.View$OnAttachStateChangeListener;
import p.ju2;
import p.bt2;
import java.util.List;
import android.os.Parcelable;
import p.ts2;
import java.util.Map;
import p.ys2;
import androidx.recyclerview.widget.LinearLayoutManager;

public class us2 extends ut2	// class@00290e from classes.dex
{
    public final rs2 b;
    public final xs2 c;
    public final ss2 d;
    public ju2 e;
    public bt2 f;

    public void us2(ViewGroup p0,uu2 p1){
       RecyclerView recyclerView = new RecyclerView(p0.getContext(), null);
       recyclerView.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentLayoutParams(p0.getContext(), p0));
       super(recyclerView);
       recyclerView.setNestedScrollingEnabled(false);
       Context context = recyclerView.getContext();
       rs2 ors2 = new rs2(context, new ri3(new a33(p1.d), new mk2(context)));
       this.b = ors2;
       recyclerView.setLayoutManager(ors2);
       xs2 oxs2 = new xs2(p1);
       this.c = oxs2;
       recyclerView.setHasFixedSize(false);
       if (p0 instanceof RecyclerView && p0.getAdapter() instanceof xs2) {
          recyclerView.setRecycledViewPool(p0.getRecycledViewPool());
       }
       recyclerView.o0(oxs2);
       this.d = new ss2(this, false);
       recyclerView.addOnAttachStateChangeListener(new mc0(2, this));
       return;
    }
    public void a(ju2 p0,uu2 p1,bt2 p2){
       this.e = p0;
       this.f = p2;
       us2 tc = this.c;
       tc.w(p0.j());
       ts2 ots2 = p2.a(p0);
       xs2 w = tc.w;
       us2 tb = this.b;
       if (ots2 != null) {
          w.c(ots2.a, w.a);
          tb.s0(ots2.b);
       }else {
          w.c(null, w.a);
          tb.r1(0, 0);
       }
       tc.g();
       return;
    }
}
