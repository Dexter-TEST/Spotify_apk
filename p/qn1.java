package p.qn1;
import p.ym1;
import p.w53;
import androidx.fragment.app.Fragment;
import p.an5;
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
import p.bo1;
import p.ej7;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.y05;
import p.vt2;
import p.tp3;
import p.g02;
import p.hl6;
import p.kn1;
import p.rt2;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import com.spotify.hubs.liteintegration.HubsView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.t63;
import androidx.constraintlayout.widget.ConstraintLayout;
import p.fj3;
import p.gj3;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.widget.ImageButton;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.sp6;
import android.content.res.ColorStateList;
import p.n6;
import p.uu2;
import p.fh5;
import p.q33;
import p.y46;
import p.p7;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.aq6;
import p.td7;
import io.reactivex.rxjava3.core.Observable;
import p.ab0;
import p.bi5;
import p.av2;
import p.sd5;
import p.yf2;
import p.pn1;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.z33;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.bn1;
import p.gg1;
import p.cc4;
import p.ln1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.wn3;
import p.kz6;
import p.k33;
import java.util.Objects;
import p.vc5;
import p.mn1;
import io.reactivex.rxjava3.core.Completable;
import p.nn1;
import p.b5;
import p.ok0;
import p.on1;
import p.sp;
import p.an1;
import p.yp6;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.p54;
import p.ox7;
import java.lang.StringBuilder;
import android.content.Intent;
import p.xj0;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.kn3;
import p.kf6;
import p.pe6;
import p.rk0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.oo3;
import java.lang.Runnable;
import p.jk0;
import java.lang.Integer;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import p.bh5;
import p.ah5;
import java.lang.Exception;
import p.lw0;
import androidx.fragment.app.f;
import androidx.fragment.app.o;

public class qn1 extends Fragment implements ym1, w53	// class@0023d7 from classes.dex
{
    public final an5 A;
    public fj3 B;
    public bo1 C;
    public j8 D;
    public final fn0 E;
    public zm1 F;
    public p7 G;
    public GlueToolbar H;
    public ImageButton I;
    public SpotifyIconView J;
    public SpotifyIconView K;
    public t63 L;
    public ko3 a;
    public g54 b;
    public gj3 c;
    public pm6 t;
    public w12 v;
    public an1 w;
    public m12 x;
    public pe6 y;
    public vn1 z;
    public static final int M;

    public void qn1(){
       super();
       this.A = new an5();
       this.E = new fn0();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.URI");
       str.getClass();
       return new tk7(str);
    }
    public final v55 h(){
       return x55.I;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.z.getClass();
       this.C = this.b.r(this, bo1.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       ojo3.c(R.id.hubs_component_offlined_track_row, "entity:trackRow", new y05(this.requireContext()));
       ojo3.c(R.id.offlined_download_toggle, "lite:downloadToggle", new tp3(2));
       ojo3.c(R.id.podcast_description_component, "podcast:description", new g02(3));
       ojo3.c(R.id.podcast_episode_metadata_component, "podcast:metadataEpisode", new g02(4));
       ojo3.c(R.id.track_cloud_skeleton_component, "skeleton:trackCloud", new hl6(2));
       ojo3.c(R.id.track_row_skeleton_component, "skeleton:trackRow", new hl6(3));
       ojo3.c(R.id.primary_button_skeleton_component, "skeleton:primaryButton", new hl6(1));
       ojo3.c(R.id.episode_row_skeleton_component, "skeleton:", new hl6(0));
       ojo3.c(R.id.shuffled_track_component, "lite:shuffledTrack", new tp3(3));
       ojo3.b("download", new kn1(this, 0));
       ojo3.b("notifyChange", new kn1(this, 1));
       ojo3.b("playPreview", new kn1(this, 2));
       this.D = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       HubsView hubsView;
       GlueToolbarLayout glueToolbarL;
       View view = p0.inflate(R.layout.entity_fragment, p1, false);
       int i = 0x7f0a0275;
       if ((hubsView = ry7.q(view, i)) != null) {
          i = 0x7f0a0638;
          if ((glueToolbarL = ry7.q(view, i)) != null) {
             t63 i1 = new t63(view, hubsView, glueToolbarL, 12);
             this.L = i1;
             fj3 uofj3 = this.c.a(i1.l(), this.b().a, p2);
             this.B = uofj3;
             _monitor_enter(uofj3);
             uofj3.f = "lite/entity";
             _monitor_exit(uofj3);
             this.H = GlueToolbars.createGlueToolbar(this.L.t);
             ImageButton imageButton = this.getLayoutInflater().inflate(R.layout.up_button, this.L.t, false);
             this.I = imageButton;
             this.H.addView(ToolbarSide.START, imageButton, R.id.action_close);
             SpotifyIconView spotifyIconV = p0.inflate(R.layout.menu_item, this.L.t, false);
             this.J = spotifyIconV;
             spotifyIconV.setIcon(sp6.P);
             this.J.setColorStateList(n6.c(this.requireContext(), R.color.action_green));
             SpotifyIconView spotifyIconV1 = p0.inflate(R.layout.menu_item, this.L.t, false);
             this.K = spotifyIconV1;
             spotifyIconV1.setIcon(sp6.U);
             qn1 tD = this.D;
             this.L.c.b(tD.b, tD.t);
             this.L.c.setHeaderScrollObserver(new q33(4, this));
             this.G = this.L.c.getBodyNotifier();
             return this.L.l();
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       this.B.a();
       this.L = null;
       this.H = null;
       this.I = null;
       this.J = null;
       this.K = null;
       this.G = null;
       super.onDestroyView();
    }
    public final void onSaveInstanceState(Bundle p0){
       qn1 tB;
       if ((tB = this.B) != null) {
          tB.h(p0);
       }
       return;
    }
    public final void onStart(){
       super.onStart();
       aq6 uoaq6 = td7.d(this.b().a);
       qn1 tE = this.E;
       int i = 8;
       int i1 = 13;
       int i2 = 9;
       int i3 = 1;
       if (uoaq6 != null) {
          int i4 = 7;
          this.z.getClass();
          tE.c(this.D.i().filter(new ab0(i4)).startWithItem(new av2(false)).map(new sd5(i1)).switchMap(new pn1(this, uoaq6, false)).observeOn(id.a()).compose(new z33(false, this.B)).compose(new bn1(this.requireContext(), Observable.never().startWithItem(new cc4()))).subscribe(new ln1(this, 6)));
          tE.c(this.C.v.b(uoaq6).observeOn(id.a()).subscribe(new ln1(this, i4)));
          tE.c(ry7.e(this.J).doOnNext(new ln1(this, i)).flatMap(new pn1(this, uoaq6, i3)).subscribe());
          tE.c(ry7.e(this.K).subscribe(new ln1(this, i2)));
       }else {
          qn1 tB = this.B;
          _monitor_enter(tB);
          tB.b();
          _monitor_exit(tB);
       }
       tE.c(ry7.e(this.I).subscribe(new ln1(this, 10)));
       tE.c(this.D.i().filter(new ab0(17)).map(new sd5(i2)).map(new sd5(10)).subscribe(new ln1(this, false)));
       qn1 tC = this.C;
       Objects.requireNonNull(tC);
       tE.c(this.D.i().filter(k33.a).flatMapSingle(new vc5(4, tC)).observeOn(id.a()).subscribe(new ln1(this, i3)));
       tE.c(this.D.i().filter(new ab0(i)).observeOn(id.a()).subscribe(new ln1(this, 2)));
       tE.c(this.D.i().filter(new ab0(i2)).map(new sd5(11)).map(new sd5(12)).observeOn(id.a()).subscribe(new ln1(this, 3)));
       qn1 tA = this.A;
       tE.c(tA.filter(new ab0(10)).map(new sd5(14)).flatMapCompletable(new mn1(this, false)).subscribe());
       tE.c(tA.filter(new ab0(11)).map(new sd5(15)).flatMapCompletable(new mn1(this, i3)).subscribe());
       tE.c(tA.filter(new ab0(12)).observeOn(id.a()).flatMapCompletable(new on1(this, Completable.i(new nn1(this, false)), false)).subscribe());
       tE.c(tA.filter(new ab0(i1)).observeOn(id.a()).subscribe(new ln1(this, 4)));
       tE.c(tA.filter(new ab0(14)).observeOn(id.a()).subscribe(new ln1(this, 5)));
       tE.c(tA.filter(new ab0(15)).observeOn(id.a()).flatMapCompletable(new sp(Completable.i(new nn1(this, i3)), 5)).subscribe());
       tE.c(tA.filter(new ab0(16)).observeOn(id.a()).flatMapCompletable(new sp(Completable.i(new nn1(this, 2)), 6)).subscribe());
       return;
    }
    public final void onStop(){
       this.E.e();
       super.onStop();
    }
    public final void u(int p0,String p1){
       aq6 uoaq6;
       aq6 uoaq61;
       aq6 b1;
       qn1 tD;
       vk7 ovk7 = this.b();
       tk7 otk7 = new tk7(p1);
       int i = 12;
       int i1 = 0x7f0a004d;
       boolean b = true;
       qn1 tE = this.E;
       if (p0 != i1 && p0 != 0x7f0a005f) {
          if (p0 == 0x7f0a0057) {
             if ((uoaq61 = td7.d(p1)) != null) {
                this.w.a(ovk7, otk7, 24);
                qn1 tC1 = this.C;
                tC1.getClass();
                Observable observable = ((b1 = uoaq61.b) != yp6.w && b1 != yp6.m0)? Observable.error(new IllegalArgumentException("Only tracks & episodes can be queued")): ox7.B(tC1.t.k(uoaq61.toString()));
                tE.c(observable.observeOn(id.a()).subscribe(new ln1(this, 11)));
             }
          }else if(p0 != 0x7f0a0061 && (p0 != 0x7f0a0060 && (p0 != 0x7f0a0064 && (p0 != 0x7f0a0063 && p0 != 0x7f0a0062)))){
             if (p0 == 0x7f0a003a) {
                this.w.a(ovk7, otk7, b);
                this.startActivity(xj0.s(this.getContext(), "spotify:internal:add-to-playlist:"+p1));
             }else if(p0 == 0x7f0a004c){
                this.w.a(ovk7, otk7, 10);
                this.startActivity(xj0.s(this.getContext(), "spotify:internal:edit-playlist:"+p1));
             }else if(p0 == 0x7f0a0059){
                this.w.a(ovk7, otk7, 27);
                this.startActivity(xj0.s(this.getContext(), "spotify:internal:rename-playlist:"+p1));
             }else if(p0 == 0x7f0a0048){
                uoaq61 = td7.d(p1);
                Context context = this.getContext();
                if (uoaq61 != null && context != null) {
                   this.w.a(ovk7, otk7, 7);
                   Object[] objArray = new Object[b];
                   objArray[0] = this.H.getTitle();
                   tj2 otj2 = xe7.k0(context, this.getString(R.string.entity_dialog_confirm_delete_title), this.getString(R.string.entity_dialog_confirm_delete_body, objArray));
                   otj2.a = this.getText(R.string.entity_dialog_confirm_delete_positive_button);
                   otj2.c = new kn3(this, 2, uoaq61);
                   otj2.b = this.getText(R.string.entity_dialog_confirm_delete_negative_button);
                   otj2.d = null;
                   otj2.a().l();
                }
             }else if(p0 == 0x7f0a005b){
                if (td7.d(p1) != null) {
                   this.w.a(ovk7, otk7, 35);
                   tE.c(this.y.a(this.getContext(), p1, "lite/entity", this.b().a).subscribe());
                }
             }else if(p0 == 0x7f0a0049){
                if ((uoaq61 = td7.d(p1)) != null) {
                   this.w.a(ovk7, otk7, i);
                   Completable uCompletable = this.C.v.c(uoaq61, 0);
                   uCompletable.getClass();
                   rk0 ork0 = new rk0(uCompletable, id.a(), b);
                   tD = this.D;
                   tD.getClass();
                   tE.c(ork0.c(Completable.j(new oo3(0, tD, 0))).subscribe());
                }
             }else if(p0 == 0x7f0a0058){
                this.w.a(this.b(), otk7, 26);
                tD = this.C;
                aq6 uoaq62 = td7.d(this.b().a);
                tD.getClass();
                ok0 ook0 = (uoaq62 != null && p1 != null)? tD.E.c(uoaq62.t, tD.F.b(p1, Integer.valueOf(0), "rem")): Completable.h(new IllegalArgumentException());
                ook0.getClass();
                tD = this.D;
                tD.getClass();
                tE.c(new rk0(ook0, id.a(), b).c(Completable.j(new oo3(0, tD, b))).subscribe(new lw0(b), new ln1(this, i)));
             }
          }else {
             this.w.a(ovk7, otk7, 19);
             this.startActivity(xj0.s(this.getContext(), p1));
          }
       }else if((uoaq6 = td7.d(p1)) != null){
          this.w.a(ovk7, otk7, i);
          qn1 tC = this.C;
          if (p0 != i1) {
             b = false;
          }
          tE.c(ox7.B(tC.v.c(uoaq6, b)).observeOn(id.a()).subscribe());
       }
       return;
    }
    public final void v(f p0,String p1){
       if (p0 != null && !p0.isAdded()) {
          o childFragmen = this.getChildFragmentManager();
          if (childFragmen.D(p1) == null) {
             p0.B(childFragmen, p1);
          }
       }
       return;
    }
}
