package p.l76;
import p.ir0;
import p.u76;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import android.widget.EditText;
import p.xe7;
import java.lang.String;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import androidx.appcompat.widget.SearchView;
import p.iv;
import android.view.View;
import com.spotify.hubs.liteintegration.HubsView;
import p.b43;
import p.z23;
import java.lang.Integer;

public final class l76 implements ir0	// class@001cfc from classes.dex
{
    public final int a;
    public final u76 b;

    public void l76(u76 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       iv b;
       l76 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             if (p0.e != null) {
                tb.A.setVisibility(8);
                tb.B.c(R.string.search_error_network);
             }else if((b = p0.b) != null){
                tb.A.setVisibility(8);
                tb.B.d(b);
             }else if(p0.c != null){
                tb.A.setVisibility(8);
                tb.B.e();
             }else if((b = p0.d) != null){
                tb.A.setVisibility(8);
                tb.B.d(b);
             }else {
                tb.z.setIconified((p0.a ^ 1));
                tb.A.setVisibility(0);
                tb.B.d(z23.t);
             }
             return;
             break;
           case 1:
             tb.z.clearFocus();
             return;
           case 2:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
           case 3:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
           case 4:
             tb.getClass();
             if (p0.booleanValue()) {
                et0.d(tb.getActivity());
             }else {
                xe7.a0(tb.z.A0);
             }
             return;
             break;
           default:
             tb.getClass();
             if (p0.intValue() == 1) {
                tb.z.clearFocus();
             }
             return;
       }
    }
}
