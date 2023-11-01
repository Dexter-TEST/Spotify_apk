package p.mp0;
import androidx.fragment.app.Fragment;
import p.fn0;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.np0;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Runnable;
import p.wp3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.rm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.pg2;
import p.mx6;
import java.lang.Object;
import p.yf2;
import p.qr;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kp0;
import android.widget.TextView;
import p.mj5;
import p.oj5;
import android.os.Build$VERSION;
import p.lp0;
import android.view.View$OnClickListener;
import p.n6;

public class mp0 extends Fragment	// class@001eda from classes.dex
{
    public g54 a;
    public np0 b;
    public TextView c;
    public TextView t;
    public final fn0 v;
    public kp0 w;
    public static final int x;

    public void mp0(){
       super();
       this.v = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.b = this.a.r(this, np0.class);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_connection_state, p1, false);
    }
    public final void onDestroyView(){
       this.requireView().removeCallbacks(this.w);
       this.w = null;
       this.c = null;
       this.t = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       mp0 tb = this.b;
       np0 v = tb.v;
       this.v.c(Observable.combineLatest(v.g.r(v.a), v.h.r(v.a), tb.t.getInternetState(), new rm(2)).debounce(new mx6(23, tb)).startWithItem(new qr(true, false, false)).distinctUntilChanged().observeOn(id.a()).subscribe(new vs3(17, this)));
    }
    public final void onStop(){
       this.v.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       p0.setVisibility(8);
       this.w = new kp0(p0, 0);
       this.c = p0.findViewById(R.id.connection_state_text);
       TextView textView = p0.findViewById(R.id.connection_state_action);
       this.t = textView;
       oj5.a(textView).a();
       if (Build$VERSION.SDK_INT >= 29) {
          p0.setOnClickListener(new lp0(this, 0));
       }
       return;
    }
    public final void u(int p0,int p1){
       View view;
       if ((view = this.getView()) == null) {
          return;
       }
       this.c.setText(p0);
       view.setBackgroundColor(n6.b(view.getContext(), p1));
       view.removeCallbacks(this.w);
       this.t.setVisibility(8);
       return;
    }
}
