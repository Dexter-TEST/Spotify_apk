package p.tl2;
import java.lang.Object;
import java.util.HashSet;
import java.util.HashMap;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p.w51;
import java.util.Collection;
import java.util.ArrayList;
import android.accounts.Account;
import java.lang.String;
import java.util.Map;

public final class tl2	// class@002792 from classes.dex
{
    public final HashSet a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final Account f;
    public final String g;
    public final HashMap h;
    public String i;

    public void tl2(){
       super();
       this.a = new HashSet();
       this.h = new HashMap();
    }
    public void tl2(GoogleSignInOptions p0){
       super();
       this.a = new HashSet();
       this.h = new HashMap();
       w51.k(p0);
       this.a = new HashSet(p0.b);
       this.b = p0.v;
       this.c = p0.w;
       this.d = p0.t;
       this.e = p0.x;
       this.f = p0.c;
       this.g = p0.y;
       this.h = GoogleSignInOptions.c(p0.z);
       this.i = p0.A;
    }
    public final GoogleSignInOptions a(){
       Scope c;
       tl2 ta = this.a;
       if (ta.contains(GoogleSignInOptions.D)) {
          c = GoogleSignInOptions.C;
          if (ta.contains(c)) {
             ta.remove(c);
          }
       }
       if (this.d != null && (this.f == null && ta.isEmpty())) {
          ta.add(GoogleSignInOptions.B);
       }
       GoogleSignInOptions c1 = new GoogleSignInOptions(3, new ArrayList(ta), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
       return c;
    }
}
