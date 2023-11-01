package p.pf4;
import p.wf2;
import p.gi3;
import p.qf4;
import java.lang.Object;
import p.w26;
import android.content.Context;
import android.app.Application;
import p.v26;
import android.os.Bundle;
import p.fk3;
import p.uj3;
import p.qo5;
import p.nf4;
import p.ej7;
import p.aj7;
import p.of4;
import java.lang.Class;
import p.vi7;
import java.lang.IllegalStateException;
import java.lang.String;

public final class pf4 extends gi3 implements wf2	// class@00224f from classes.dex
{
    public final int a;
    public final qf4 b;

    public void pf4(qf4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       int i;
       pf4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             if (tb.A == null) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack \(i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state\).".toString());
             }
             i = (tb.y.c != uj3.a)? 1: 0;
             if (i) {
                return new qo5(tb, new nf4(tb)).g(of4.class).t;
             }else {
                throw new IllegalStateException("You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
             }
       }
       qf4 a = tb.a;
       Application uApplication = null;
       Context applicationC = (a != null)? a.getApplicationContext(): uApplication;
       if (applicationC instanceof Application) {
          uApplication = applicationC;
       }
       return new w26(uApplication, tb, tb.c);
    }
}
