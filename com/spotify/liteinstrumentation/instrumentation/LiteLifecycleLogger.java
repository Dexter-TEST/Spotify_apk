package com.spotify.liteinstrumentation.instrumentation.LiteLifecycleLogger;
import p.zj3;
import p.ac;
import java.lang.Object;
import p.ek3;
import p.kj3;
import p.xo3;
import java.lang.Enum;
import p.ab3;
import java.lang.Class;
import p.om3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteAppForegroundNonAuth;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;

public class LiteLifecycleLogger implements zj3	// class@000929 from classes.dex
{
    public final ac a;

    public void LiteLifecycleLogger(ac p0){
       super();
       this.a = p0;
    }
    public final void a(ek3 p0,kj3 p1){
       om3 oom3;
       int i = xo3.a[p1.ordinal()];
       LiteLifecycleLogger ta = this.a;
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             ta.getClass();
             oom3 = LiteAppForegroundNonAuth.h();
             oom3.c(false);
             oom3.d();
             ta.a.a(oom3.build());
          }
       }else {
          ta.getClass();
          oom3 = LiteAppForegroundNonAuth.h();
          oom3.c(b);
          oom3.d();
          ta.a.a(oom3.build());
       }
       return;
    }
}
