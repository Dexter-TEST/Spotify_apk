package p.uj4;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.lang.CharSequence;
import android.os.BaseBundle;
import p.vj4;
import p.sj4;

public abstract class uj4	// class@0028c0 from classes.dex
{
    public sj4 a;
    public CharSequence b;

    public void uj4(){
       super();
    }
    public void a(Bundle p0){
       uj4 tb;
       String str;
       if ((tb = this.b) != null) {
          p0.putCharSequence("android.title.big", tb);
       }
       if ((str = this.c()) != null) {
          p0.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str);
       }
       return;
    }
    public abstract void b(vj4 p0);
    public String c(){
       return null;
    }
    public void d(){
    }
    public void e(){
    }
    public final void f(sj4 p0){
       if (this.a != p0) {
          this.a = p0;
          if (p0 != null) {
             p0.g(this);
          }
       }
       return;
    }
}
