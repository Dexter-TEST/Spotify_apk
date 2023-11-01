package p.gb;
import p.wf2;
import p.gi3;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import java.lang.Object;
import com.spotify.allboarding.entrypoint.EntryPoint;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.do1;

public final class gb extends gi3 implements wf2	// class@0016dc from classes.dex
{
    public final int a;
    public final AllboardingActivity b;

    public void gb(AllboardingActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       AllboardingActivity q;
       gb tb = this.b;
       switch (this.a){
           case 0:
           default:
             if ((q = tb.Q) != null) {
                return q;
             }
             co5.N("allboardingVMFactory");
             throw null;
       }
       Intent intent = tb.getIntent();
       co5.l(intent, "intent");
       EntryPoint.Companion.getClass();
       return do1.a(intent);
    }
}
