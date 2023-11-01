package p.km7;
import androidx.fragment.app.k;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import android.content.Context;
import p.ej4;
import p.eo5;

public abstract class km7	// class@001c43 from classes.dex
{
    public Context a;
    public final String b;
    public mm7 c;
    public Bundle d;

    public void km7(k p0,String p1,Bundle p2,int p3){
       super();
       if (p1 == null) {
          p1 = ej4.F(p0);
       }
       eo5.C(p1, "applicationId");
       this.b = p1;
       this.a = p0;
       this.d = p2;
       return;
    }
}
