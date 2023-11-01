package p.ff;
import p.s26;
import androidx.appcompat.app.a;
import java.lang.Object;
import p.t26;
import java.lang.String;
import p.co5;
import java.util.LinkedHashSet;
import android.os.Bundle;
import p.rf;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;

public final class ff implements s26	// class@0015bc from classes.dex
{
    public final int a;
    public final Object b;

    public void ff(a p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public void ff(t26 p0){
       this.a = 1;
       co5.o(p0, "registry");
       super();
       this.b = new LinkedHashSet();
       p0.c("androidx.savedstate.Restarter", this);
    }
    public final Bundle a(){
       ff tb = this.b;
       switch (this.a){
           case 0:
           default:
             Bundle uBundle = new Bundle();
             uBundle.putStringArrayList("classes_to_restore", new ArrayList(tb));
             return uBundle;
       }
       tb.A().getClass();
       return new Bundle();
    }
}
