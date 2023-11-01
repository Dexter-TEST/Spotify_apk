package p.hn2;
import p.gn2;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p.yq5;
import java.lang.Object;
import p.co5;
import android.content.res.Resources;
import android.view.View;
import p.ri3;
import p.qi3;
import p.mk2;
import java.util.Set;
import java.lang.Class;
import p.nk2;

public final class hn2 extends gn2	// class@001885 from classes.dex
{
    public final int d;
    public final RecyclerView e;
    public final GridLayoutManager f;

    public void hn2(GridRecyclerView p0,GridLayoutManager p1){
       this.d = 0;
       this.e = p0;
       this.f = p1;
       super();
    }
    public void hn2(TraitsLayoutManager p0,RecyclerView p1){
       this.d = 1;
       this.f = p0;
       this.e = p1;
       super();
    }
    public final int c(int p0){
       GridLayoutManager x;
       yq5 adapter1;
       int i;
       hn2 tf = this.f;
       hn2 te = this.e;
       switch (this.d){
           case 0:
             yq5 adapter = te.getAdapter();
             co5.i(adapter);
             if ((p0 = adapter.f(p0)) == 0x7f0d002e) {
                x = tf.X;
             }else if(p0 == 0x7f0d002f){
                x = tf.X;
             }else if(p0 == 0x7f0d002d){
                p0 = tf.X / te.getResources().getInteger(R.integer.allboarding_row_number_of_items_2);
             }else {
                p0 = tf.X / te.getResources().getInteger(R.integer.allboarding_row_number_of_items_3);
             }
             break;
           default:
             GridLayoutManager x1 = tf.X;
             if ((adapter1 = te.getAdapter()) != null && tf.h0 != null) {
                i = 1;
                if (p0 < adapter1.d()) {
                   adapter1.d();
                   ri3 a = tf.g0.a;
                   Set set = a.a(p0, tf.h0);
                   a.b.getClass();
                   if (set.contains(nk2.t)) {
                      x1 = 1;
                   }else if(set.contains(nk2.B)){
                      x1 = 2;
                   }else if(set.contains(nk2.z)){
                      x1 = 3;
                   }
                   i = x1;
                }
             }else {
                i = tf.X;
             }
             return i;
       }
       return x;
    }
}
