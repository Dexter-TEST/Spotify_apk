package p.n61;
import p.m61;
import p.rn6;
import java.lang.String;
import p.b07;
import p.fk3;
import p.tn6;
import java.lang.Object;
import p.co5;
import java.util.concurrent.locks.ReentrantLock;
import com.spotify.deeplink.loggingimpl.DeeplinkSessionIdProviderImpl$1;
import p.dk3;
import p.t65;
import p.co6;
import java.lang.Class;
import android.content.SharedPreferences;
import p.l61;
import java.lang.IllegalArgumentException;
import p.tp2;

public final class n61 implements m61	// class@001f74 from classes.dex
{
    public final tn6 a;
    public final ReentrantLock b;
    public static final rn6 c;
    public static final rn6 d;

    static {
       b07 b = rn6.b;
       n61.c = b.a("deeplink.session.id");
       n61.d = b.a("deeplink.session.stage");
    }
    public void n61(fk3 p0,tn6 p1){
       co5.o(p0, "processLifecycle");
       super();
       this.a = p1;
       this.b = new ReentrantLock();
       p0.a(new DeeplinkSessionIdProviderImpl$1(this));
    }
    public final t65 a(){
       n61 ta = this.a;
       n61 on61 = ta;
       on61.getClass();
       rn6 c = n61.c;
       String str = "key";
       co5.o(c, str);
       l61 ol61 = null;
       String str1 = (on61.h().contains(c.a))? ta.a(c): ol61;
       n61 on611 = ta;
       on611.getClass();
       rn6 d = n61.d;
       co5.o(d, str);
       String str2 = (on611.h().contains(d.a))? ta.a(d): ol61;
       if (str2 != null) {
          if (co5.c(str2, "LOGGED_OUT")) {
             ol61 = l61.b;
          }else if(co5.c(str2, "LOGGED_IN")){
             ol61 = l61.c;
          }else if(co5.c(str2, "PLAYING")){
             ol61 = l61.t;
          }else {
             throw new IllegalArgumentException(tp2.m("Cannot convert \"", str2, "\" to session stage"));
          }
       }
       return new t65(str1, ol61);
    }
}
