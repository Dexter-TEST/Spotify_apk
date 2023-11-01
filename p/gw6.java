package p.gw6;
import android.view.ActionMode;
import android.content.Context;
import p.b6;
import android.view.View;
import android.view.Menu;
import p.g74;
import p.e64;
import p.iw6;
import android.view.MenuInflater;
import java.lang.CharSequence;
import java.lang.Object;

public final class gw6 extends ActionMode	// class@001793 from classes.dex
{
    public final Context a;
    public final b6 b;

    public void gw6(Context p0,b6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void finish(){
       this.b.a();
    }
    public final View getCustomView(){
       return this.b.b();
    }
    public final Menu getMenu(){
       return new g74(this.a, this.b.c());
    }
    public final MenuInflater getMenuInflater(){
       return this.b.d();
    }
    public final CharSequence getSubtitle(){
       return this.b.e();
    }
    public final Object getTag(){
       return this.b.a;
    }
    public final CharSequence getTitle(){
       return this.b.f();
    }
    public final boolean getTitleOptionalHint(){
       return this.b.b;
    }
    public final void invalidate(){
       this.b.g();
    }
    public final boolean isTitleOptional(){
       return this.b.h();
    }
    public final void setCustomView(View p0){
       this.b.i(p0);
    }
    public final void setSubtitle(int p0){
       this.b.j(p0);
    }
    public final void setSubtitle(CharSequence p0){
       this.b.m(p0);
    }
    public final void setTag(Object p0){
       this.b.a = p0;
    }
    public final void setTitle(int p0){
       this.b.n(p0);
    }
    public final void setTitle(CharSequence p0){
       this.b.o(p0);
    }
    public final void setTitleOptionalHint(boolean p0){
       this.b.p(p0);
    }
}
