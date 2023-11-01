package p.r7;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.w7;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import java.lang.String;
import android.os.BaseBundle;
import p.et0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.t67;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.q7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.StringBuilder;
import android.content.Intent;
import p.xj0;

public class r7 extends Fragment implements w53	// class@002493 from classes.dex
{
    public g54 a;
    public final fn0 b;
    public w7 c;
    public View t;
    public String v;
    public boolean w;
    public static final int x;

    public void r7(){
       super();
       this.b = new fn0();
    }
    public final vk7 b(){
       return wk7.b;
    }
    public final v55 h(){
       return x55.b;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.a.r(this.requireActivity(), w7.class);
       boolean b = (p0 == null)? true: false;
       this.w = b;
       b = this.getArguments();
       String str = null;
       if (b != null) {
          str = b.getString("spotify.fragment.argument.URI", str);
       }
       this.v = str;
       if (str == null) {
          et0.d(this.getActivity());
       }
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_add_to_or_create_playlist, p1, false);
    }
    public final void onDestroyView(){
       this.t = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       if (this.w != null) {
          this.b.c(this.c.e().f().observeOn(id.a()).subscribe(new q7(this, 0), new q7(this, 1)));
       }
       return;
    }
    public final void onStop(){
       this.b.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       this.t = p0.findViewById(R.id.progress_bar);
    }
    public final void u(){
       this.startActivity(xj0.s(this.requireContext(), "spotify:internal:select-add-to-playlist:"+this.v));
       et0.d(this.getActivity());
    }
}
