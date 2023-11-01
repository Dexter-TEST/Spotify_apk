package p.gf;
import p.u15;
import androidx.appcompat.app.a;
import java.lang.Object;
import p.rf;
import p.jg;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater$Factory2;
import androidx.activity.a;
import p.u26;
import java.lang.String;
import android.os.Bundle;
import p.t26;

public final class gf implements u15	// class@0016fd from classes.dex
{
    public final a a;

    public void gf(a p0){
       this.a = p0;
       super();
    }
    public final void a(){
       gf ta = this.a;
       rf orf = ta.A();
       rf orf1 = orf;
       LayoutInflater layoutInflat = LayoutInflater.from(orf1.B);
       if (layoutInflat.getFactory() == null) {
          layoutInflat.setFactory2(orf1);
       }else {
          v2 = layoutInflat.getFactory2() instanceof jg;
       }
       ta.v.b.a("androidx:appcompat");
       orf.d();
       return;
    }
}
