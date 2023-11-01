package p.zm3;
import p.yf2;
import p.an3;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import com.spotify.playerlimited.player.models.LoginRequest;
import p.tv0;
import java.lang.Class;
import java.lang.String;
import p.co5;
import com.spotify.playerlimited.player.models.LoginCredentials;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import p.xb6;
import p.wv0;
import p.uf;
import p.bi5;
import p.jk0;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.vs3;
import p.ir0;
import p.fl0;
import p.b5;
import p.ok0;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.rk0;

public final class zm3 implements yf2	// class@002f25 from classes.dex
{
    public final int a;
    public final an3 b;
    public final Completable c;

    public void zm3(an3 p0,Completable p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       int i = 1;
       zm3 tc = this.c;
       zm3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new rk0(Completable.i(tb.f), id.a(), i).c(tc);
       }
       an3 b = tb.b;
       b.getClass();
       co5.o(p0, "loginRequest");
       Object[] objArray = new Object[i];
       LoginRequest a = p0.a;
       co5.i(a);
       objArray[0] = a.b;
       Logger.e("login\(%s\)", objArray);
       int[] ointArray = new int[i];
       ointArray[0] = 409;
       Objects.requireNonNull(tc, "other is null");
       CompletableSource[] uCompletable = new CompletableSource[]{b.a.b(p0).ignoreElement().n(new uf(0, ointArray)),tc};
       return new jk0(uCompletable, 0, null).f(new vs3(21, tb)).c(Completable.i(tb.e));
    }
}
