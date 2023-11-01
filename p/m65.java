package p.m65;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.an5;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.tk7;
import java.lang.IllegalStateException;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p.hr5;
import java.lang.Class;
import java.lang.Object;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import p.t67;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.l65;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.rm;
import p.yf2;
import p.kz6;
import p.ry7;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.j77;
import p.er5;
import p.k65;
import p.mr5;
import p.q65;
import p.yq5;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.gk2;
import p.kb3;
import p.fp2;
import android.content.Context;
import java.util.Objects;
import p.q33;
import p.y46;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import android.view.ViewStub;
import p.mn3;
import p.zk2;
import p.eo5;
import p.aq6;
import p.td7;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.sp6;
import p.sx1;
import p.lp6;
import android.content.res.Resources;
import p.xj0;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;

public abstract class m65 extends Fragment implements w53	// class@001e35 from classes.dex
{
    public mn3 A;
    public Parcelable B;
    public int C;
    public final fn0 a;
    public final an5 b;
    public GlueHeaderLayout c;
    public gk2 t;
    public GlueToolbar v;
    public t67 w;
    public RecyclerView x;
    public View y;
    public View z;
    public static final int D;

    public void m65(){
       super();
       this.a = new fn0();
       this.b = new an5();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.URI");
       if (str != null) {
          return new tk7(str);
       }else {
          throw new IllegalStateException("Missing spotify.fragment.argument.URI");
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_paging_list, p1, false);
    }
    public final void onDestroyView(){
       RecyclerView a0;
       super.onDestroyView();
       if ((a0 = this.x.A0) != null) {
          a0.clear();
       }
       this.x = null;
       this.y = null;
       this.v = null;
       this.z = null;
       this.c = null;
       this.t = null;
       return;
    }
    public final void onSaveInstanceState(Bundle p0){
       m65 tx;
       if ((tx = this.x) != null) {
          hr5 layoutManage = tx.getLayoutManager();
          layoutManage.getClass();
          p0.putParcelable("state_body", layoutManage.t0());
       }
       return;
    }
    public void onStart(){
       super.onStart();
       m65 ta = this.a;
       ta.c(this.w.f().observeOn(id.a()).subscribe(new l65(this, 0), new l65(this, 1)));
       ta.c(this.x().distinctUntilChanged().debounce(new rm(12)).observeOn(id.a()).subscribe(new l65(this, 2)));
       ta.c(ry7.e(this.z).observeOn(id.a()).subscribe(new l65(this, 3)));
    }
    public void onStop(){
       this.a.e();
       super.onStop();
    }
    public void onViewCreated(View p0,Bundle p1){
       this.w = this.v();
       this.x = p0.findViewById(R.id.body);
       this.y = p0.findViewById(R.id.loading_view);
       GlueToolbarLayout glueToolbarL = p0.findViewById(R.id.toolbar_layout);
       this.v = GlueToolbars.createGlueToolbar(glueToolbarL);
       View view = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       this.z = view;
       this.v.addView(ToolbarSide.START, view, R.id.action_close);
       this.x.setHasFixedSize(true);
       this.x.h(new j77(true, this), false);
       m65 tw = this.w;
       tw.getClass();
       this.x.i(new k65(tw));
       this.x.setAdapter(this.u());
       this.c = p0.findViewById(R.id.glue_header_layout);
       m65 tv = this.v;
       kb3 tw1 = new kb3();
       tw1.a = 0x7f0302a9;
       tw1.c = fp2.c;
       gk2 ogk2 = tw1.c(this.requireContext());
       ogk2.setId(R.id.header_container);
       ogk2.setGlueToolbar(null);
       ogk2.setExternalToolbarHeight(ry7.F(this.requireContext()));
       Objects.requireNonNull(tv);
       ogk2.setScrollObserver(new q33(2, tv));
       this.t = ogk2;
       this.y(this.c, ogk2, this.v);
       this.c.F(this.t, new GlueHeaderBehavior(), false);
       ViewStub viewStub = p0.findViewById(R.id.empty_state);
       viewStub.setLayoutResource(R.layout.lite_empty_state);
       ViewGroup viewGroup = viewStub.inflate();
       mn3 omn3 = new mn3(viewGroup);
       eo5.P(omn3);
       this.A = omn3;
       viewGroup.setVisibility(8);
    }
    public final void onViewStateRestored(Bundle p0){
       super.onViewStateRestored(p0);
       if (p0 != null) {
          this.B = p0.getParcelable("state_body");
       }
       return;
    }
    public abstract q65 u();
    public abstract t67 v();
    public final aq6 w(){
       aq6 uoaq6;
       if ((uoaq6 = td7.d(this.b().a)) != null) {
          return uoaq6;
       }
       throw new IllegalStateException("Could not parse URI");
    }
    public Observable x(){
       return this.b;
    }
    public abstract void y(GlueHeaderLayout p0,gk2 p1,GlueToolbar p2);
    public final void z(Throwable p0){
       int i1;
       int i2;
       Object[] objArray = new Object[0];
       Logger.c(p0, "Error subscribing to list items", objArray);
       int i = 8;
       this.c.setVisibility(i);
       this.y.setVisibility(i);
       sp6 w = sp6.W;
       if (p0 instanceof sx1) {
          w = sp6.V;
          i1 = 0x7f12028b;
          i2 = 0x7f12028a;
       }else {
          i1 = 0x7f120289;
          i2 = 0x7f120288;
       }
       this.A.b.setImageDrawable(new lp6(this.requireContext(), w, (float)xj0.e0(64.00f, this.requireContext().getResources())));
       String str = this.getString(i1);
       mn3 c = this.A.c;
       c.setText(str);
       i1 = (str != null)? 0: 8;
       c.setVisibility(i1);
       String str1 = this.getString(i2);
       mn3 t = this.A.t;
       t.setText(str1);
       if (str1 != null) {
          i = 0;
       }
       t.setVisibility(i);
       this.A.a.setVisibility(0);
       return;
    }
}
