package p.sq3;
import p.xz4;
import p.mn;
import p.vf;
import java.lang.Object;
import java.lang.Class;
import java.lang.Void;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;

public final class sq3 implements xz4	// class@00267c from classes.dex
{
    public final vf a;
    public boolean b;

    public void sq3(mn p0,vf p1){
       super();
       this.b = false;
       this.a = p1;
    }
    public final void b(Object p0){
       sq3 ta = this.a;
       ta.getClass();
       p0 = ta.b;
       p0.setResult(p0.S, p0.T);
       ta.b.finish();
       this.b = true;
    }
    public final String toString(){
       return this.a.toString();
    }
}
