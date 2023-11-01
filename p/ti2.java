package p.ti2;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import java.lang.Class;
import java.lang.Object;
import p.tk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import androidx.fragment.app.k;
import p.ui2;
import p.ej7;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.widget.ImageButton;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.kz6;
import p.ry7;
import p.si2;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.tp2;
import p.av2;
import p.rm;
import p.yf2;
import p.up0;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import com.spotify.hubs.liteintegration.HubsView;
import p.uu2;
import p.fh5;
import p.q33;
import p.y46;

public class ti2 extends Fragment implements w53	// class@002777 from classes.dex
{
    public ko3 a;
    public g54 b;
    public ui2 c;
    public j8 t;
    public final fn0 v;
    public GlueToolbar w;
    public ImageButton x;
    public HubsView y;
    public static final int z;

    public void ti2(){
       super();
       this.v = new fn0();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.URI");
       str.getClass();
       return new tk7(str);
    }
    public final v55 h(){
       return x55.K;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.b.r(this.requireActivity(), ui2.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       this.t = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = p0.inflate(R.layout.fragment_genre, p1, false);
       GlueToolbarLayout glueToolbarL = view.findViewById(R.id.toolbar_layout);
       this.w = GlueToolbars.createGlueToolbar(glueToolbarL);
       ImageButton imageButton = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       this.x = imageButton;
       this.w.addView(ToolbarSide.START, imageButton, R.id.action_close);
       return view;
    }
    public final void onDestroyView(){
       this.y = null;
       this.w = null;
       this.x = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       ti2 tv = this.v;
       tv.c(ry7.e(this.x).subscribe(new si2(this, 0)));
       tv.c(tp2.i(21, this.t.i()).startWithItem(new av2(0)).map(new rm(23)).switchMap(new up0(18, this)).observeOn(id.a()).subscribe(new si2(this, 1)));
       tv.c(tp2.i(22, this.t.i()).map(new rm(24)).map(new rm(25)).subscribe(new si2(this, 2)));
    }
    public final void onStop(){
       this.v.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       HubsView hubsView = p0.findViewById(R.id.hubs_view);
       this.y = hubsView;
       ti2 tt = this.t;
       hubsView.b(tt.b, tt.t);
       this.y.setHeaderScrollObserver(new q33(3, this));
    }
}
