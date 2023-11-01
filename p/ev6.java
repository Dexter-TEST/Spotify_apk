package p.ev6;
import android.view.SubMenu;
import p.e64;
import android.content.Context;
import p.l64;
import android.view.MenuItem;
import java.lang.String;
import p.tp2;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class ev6 extends e64 implements SubMenu	// class@001508 from classes.dex
{
    public final l64 A;
    public final e64 z;

    public void ev6(Context p0,e64 p1,l64 p2){
       super(p0);
       this.z = p1;
       this.A = p2;
    }
    public final boolean d(l64 p0){
       return this.z.d(p0);
    }
    public final boolean e(e64 p0,MenuItem p1){
       boolean b = (!super.e(p0, p1) && !this.z.e(p0, p1))? false: true;
       return b;
    }
    public final boolean f(l64 p0){
       return this.z.f(p0);
    }
    public final MenuItem getItem(){
       return this.A;
    }
    public final String j(){
       ev6 tA;
       l64 a = ((tA = this.A) != null)? tA.a: null;
       if (a == null) {
          return null;
       }else {
          return tp2.k("android:menu:actionviewstates:", a);
       }
    }
    public final e64 k(){
       return this.z.k();
    }
    public final boolean m(){
       return this.z.m();
    }
    public final boolean n(){
       return this.z.n();
    }
    public final boolean o(){
       return this.z.o();
    }
    public final void setGroupDividerEnabled(boolean p0){
       this.z.setGroupDividerEnabled(p0);
    }
    public final SubMenu setHeaderIcon(int p0){
       this.u(0, null, p0, null, null);
       return this;
    }
    public final SubMenu setHeaderIcon(Drawable p0){
       this.u(0, null, 0, p0, null);
       return this;
    }
    public final SubMenu setHeaderTitle(int p0){
       this.u(p0, null, 0, null, null);
       return this;
    }
    public final SubMenu setHeaderTitle(CharSequence p0){
       this.u(0, p0, 0, null, null);
       return this;
    }
    public final SubMenu setHeaderView(View p0){
       this.u(0, null, 0, null, p0);
       return this;
    }
    public final SubMenu setIcon(int p0){
       this.A.setIcon(p0);
       return this;
    }
    public final SubMenu setIcon(Drawable p0){
       this.A.setIcon(p0);
       return this;
    }
    public final void setQwertyMode(boolean p0){
       this.z.setQwertyMode(p0);
    }
}
