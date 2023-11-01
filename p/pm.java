package p.pm;
import p.ir0;
import p.sm;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import android.widget.EditText;
import p.xe7;
import p.aj1;
import com.spotify.lite.appmain.MainActivity;
import p.i77;
import p.rv;
import p.ym6;
import p.a66;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.x56;
import androidx.appcompat.widget.SearchView;
import p.lr;
import android.view.View;
import com.spotify.hubs.liteintegration.HubsView;
import p.b43;
import p.z23;
import java.lang.Integer;

public final class pm implements ir0	// class@002291 from classes.dex
{
    public final int a;
    public final sm b;

    public void pm(sm p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       lr b;
       String str = "EXTRA_PLAYLIST_URI";
       int i = 1;
       pm tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             if (p0.f != null) {
                tb.B.setVisibility(8);
                tb.C.c(R.string.assisted_curation_search_error_network);
             }else if((b = p0.b) != null){
                tb.B.setVisibility(8);
                tb.C.d(b);
             }else if(p0.d != null){
                tb.B.setVisibility(8);
                tb.C.e();
             }else if((b = p0.e) != null){
                tb.B.setVisibility(8);
                tb.C.d(b);
             }else {
                tb.A.setIconified((p0.a ^ i));
                tb.B.setVisibility(0);
                tb.C.d(z23.t);
             }
             return;
             break;
           case 1:
             tb.A.clearFocus();
             return;
           case 2:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
           case 3:
             tb.startActivity(xj0.s(tb.getContext(), "spotify:internal:assisted-curation-drill-down:"+p0.n).putExtra(str, p0.m));
             return;
           case 4:
             tb.startActivity(xj0.s(tb.getContext(), "spotify:internal:assisted-curation-see-more:"+p0.n).putExtra(str, p0.m));
             return;
           case 5:
             sm c = tb.c;
             int i1 = (p0.booleanValue())? 0x7f120055: 0x7f120056;
             c.c(rv.a(i1).l());
             return;
             break;
           case 6:
             p0 = tb.getActivity();
             if (p0 instanceof aj1 && !p0.H()) {
                p0.C();
             }
             return;
             break;
           case 7:
             tb.getClass();
             if (p0.booleanValue()) {
                et0.d(tb.getActivity());
             }else {
                xe7.a0(tb.A.A0);
             }
             return;
             break;
           default:
             tb.getClass();
             if (p0.intValue() == i) {
                tb.A.clearFocus();
             }
             return;
       }
    }
}
