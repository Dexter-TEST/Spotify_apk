package p.mt0;
import android.content.ContextWrapper;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.res.AssetManager;
import android.os.Build$VERSION;
import p.lt0;
import java.lang.Object;
import android.view.LayoutInflater;

public final class mt0 extends ContextWrapper	// class@001efc from classes.dex
{
    public int a;
    public Resources$Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;
    public static Configuration f;

    public void mt0(Context p0,int p1){
       super(p0);
       this.a = p1;
    }
    public final void a(Configuration p0){
       if (this.e != null) {
          throw new IllegalStateException("getResources\(\) or getAssets\(\) has already been called");
       }
       if (this.d != null) {
          throw new IllegalStateException("Override configuration has already been set");
       }
       this.d = new Configuration(p0);
       return;
    }
    public final void attachBaseContext(Context p0){
       super.attachBaseContext(p0);
    }
    public final void b(){
       Resources$Theme theme;
       int i = (this.b == null)? 1: 0;
       if (i) {
          this.b = this.getResources().newTheme();
          if ((theme = this.getBaseContext().getTheme()) != null) {
             this.b.setTo(theme);
          }
       }
       this.b.applyStyle(this.a, true);
       return;
    }
    public final AssetManager getAssets(){
       return this.getResources().getAssets();
    }
    public final Resources getResources(){
       mt0 td;
       if (this.e == null) {
          if ((td = this.d) != null) {
             if (Build$VERSION.SDK_INT >= 26) {
                if (mt0.f == null) {
                   Configuration uConfigurati = new Configuration();
                   uConfigurati.fontScale = 0;
                   mt0.f = uConfigurati;
                }
                if (!td.equals(mt0.f)) {
                label_0025 :
                   this.e = lt0.a(this, this.d).getResources();
                }
             }else {
                goto label_0025 ;
             }
          }
          this.e = super.getResources();
       }
       return this.e;
    }
    public final Object getSystemService(String p0){
       if (!"layout_inflater".equals(p0)) {
          return this.getBaseContext().getSystemService(p0);
       }
       if (this.c == null) {
          this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
       }
       return this.c;
    }
    public final Resources$Theme getTheme(){
       mt0 tb;
       if ((tb = this.b) != null) {
          return tb;
       }
       if (this.a == null) {
          this.a = 0x7f1302b1;
       }
       this.b();
       return this.b;
    }
    public final void setTheme(int p0){
       if (this.a != p0) {
          this.a = p0;
          this.b();
       }
       return;
    }
}
