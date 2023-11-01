package p.f67;
import p.do5;
import androidx.appcompat.widget.Toolbar;
import java.lang.CharSequence;
import p.dg;
import java.util.ArrayList;
import p.em0;
import java.lang.Object;
import p.vf;
import p.p67;
import java.lang.Class;
import p.c67;
import android.view.View;
import p.wh7;
import p.u44;
import android.view.Menu;
import p.e67;
import p.uv1;
import androidx.appcompat.widget.ActionMenuView;
import android.content.Context;
import java.lang.Runnable;
import p.dh7;
import android.view.KeyEvent;
import android.view.KeyCharacterMap;
import p.w5;
import androidx.appcompat.widget.e;
import p.l64;
import p.tp2;

public final class f67 extends do5	// class@00156d from classes.dex
{
    public final p67 F;
    public final Window$Callback G;
    public final u44 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final ArrayList L;
    public final em0 M;

    public void f67(Toolbar p0,CharSequence p1,dg p2){
       super();
       this.L = new ArrayList();
       this.M = new em0(1, this);
       vf ovf = new vf(1, this);
       p67 op67 = new p67(p0, false);
       this.F = op67;
       p2.getClass();
       this.G = p2;
       op67.k = p2;
       p0.setOnMenuItemClickListener(ovf);
       if (op67.g == null) {
          op67.h = p1;
          if ((op67.b & 0x08)) {
             p0.setTitle(p1);
             if (op67.g != null) {
                wh7.p(p0.getRootView(), p1);
             }
          }
       }
       this.H = new u44(2, this);
       return;
    }
    public final Menu D0(){
       Toolbar a1;
       f67 tF = this.F;
       if (this.J == null) {
          e67 uoe67 = new e67(this);
          uv1 ouv1 = new uv1(2, this);
          p67 a = tF.a;
          a.h0 = uoe67;
          a.i0 = ouv1;
          if ((a1 = a.a) != null) {
             a1.L = uoe67;
             a1.M = ouv1;
          }
          this.J = true;
       }
       return tF.a.getMenu();
    }
    public final Context F(){
       return this.F.a();
    }
    public final boolean H(){
       f67 tF = this.F;
       f67 tM = this.M;
       tF.a.removeCallbacks(tM);
       dh7.m(tF.a, tM);
       return true;
    }
    public final void Q(){
    }
    public final void R(){
       this.F.a.removeCallbacks(this.M);
    }
    public final boolean S(int p0,KeyEvent p1){
       Menu menu;
       if ((menu = this.D0()) == null) {
          return 0;
       }
       int deviceId = (p1 != null)? p1.getDeviceId(): -1;
       boolean b = true;
       if (KeyCharacterMap.load(deviceId).getKeyboardType() == b) {
          b = false;
       }
       menu.setQwertyMode(b);
       return menu.performShortcut(p0, p1, 0);
    }
    public final boolean T(KeyEvent p0){
       if (p0.getAction() == 1) {
          this.V();
       }
       return true;
    }
    public final boolean V(){
       Toolbar a = this.F.a.a;
       boolean b = false;
       if (a != null) {
          ActionMenuView k = ((k = a.K) != null && k.l())? 1: 0;
          if (k) {
             b = true;
          }
       }
       return b;
    }
    public final boolean i(){
       Toolbar a = this.F.a.a;
       boolean b = false;
       if (a != null) {
          ActionMenuView k = ((k = a.K) != null && k.c())? 1: 0;
          if (k) {
             b = true;
          }
       }
       return b;
    }
    public final boolean j(){
       Toolbar g0;
       int i = ((g0 = this.F.a.g0) != null && g0.b != null)? 1: 0;
       if (i) {
          l64 ol64 = (g0 == null)? null: g0.b;
          if (ol64 != null) {
             ol64.collapseActionView();
          }
          return true;
       }else {
          return false;
       }
    }
    public final void p(boolean p0){
       if (p0 == this.K) {
          return;
       }
       this.K = p0;
       f67 tL = this.L;
       if (tL.size() <= 0) {
          return;
       }
       tp2.v(tL.get(0));
       throw null;
    }
    public final void p0(boolean p0){
    }
    public final void q0(boolean p0){
    }
    public final void r0(CharSequence p0){
       f67 tF = this.F;
       if (tF.g == null) {
          tF.h = p0;
          if ((tF.b & 0x08)) {
             p67 a = tF.a;
             a.setTitle(p0);
             if (tF.g != null) {
                wh7.p(a.getRootView(), p0);
             }
          }
       }
       return;
    }
    public final int v(){
       return this.F.b;
    }
}
