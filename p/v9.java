package p.v9;
import p.i9;
import p.zk;
import com.spotify.allboarding.entrypointlite.AllboardingFollowManagerImpl;
import p.fj4;
import p.bb7;
import com.spotify.allboarding.entrypointlite.AllboardingDoneImpl;
import p.qb;
import p.cp3;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class v9 implements i9	// class@0029ae from classes.dex
{
    public final zk a;
    public final AllboardingFollowManagerImpl b;
    public final fj4 c;
    public final bb7 d;
    public final AllboardingDoneImpl e;
    public final pb f;
    public final cp3 g;
    public final Observable h;

    public void v9(zk p0,AllboardingFollowManagerImpl p1,fj4 p2,bb7 p3,AllboardingDoneImpl p4,qb p5,cp3 p6,Observable p7){
       co5.o(p1, "followManager");
       co5.o(p7, "username");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
}
