package p.gy5;
import androidx.fragment.app.Fragment;
import p.fn0;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.hy5;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.xl6;
import p.yf2;
import p.yq6;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import android.widget.TextView;
import android.widget.ProgressBar;
import p.ce7;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;

public class gy5 extends Fragment	// class@0017a4 from classes.dex
{
    public g54 a;
    public hy5 b;
    public final fn0 c;
    public ProgressBar t;
    public TextView v;
    public TextView w;
    public ce7 x;
    public final Handler y;
    public static final int z;

    public void gy5(){
       super();
       this.c = new fn0();
       this.y = new Handler(Looper.getMainLooper());
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.b = this.a.r(this, hy5.class);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_retry_bar, p1, false);
    }
    public final void onDestroyView(){
       this.t = null;
       this.v = null;
       this.w = null;
       this.x = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       this.c.c(this.b.t.h().map(new xl6(8)).startWithItem(new yq6()).observeOn(id.a()).distinctUntilChanged().subscribe(new vs3(18, this)));
    }
    public final void onStop(){
       this.c.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       this.v = p0.findViewById(R.id.title);
       this.w = p0.findViewById(R.id.action_title);
       ProgressBar progressBar = p0.findViewById(R.id.progress_bar);
       this.t = progressBar;
       this.x = new ce7(progressBar, null, null);
       mj5 omj5 = oj5.a(this.w);
       View[] viewArray = new View[]{this.w};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
    }
}
