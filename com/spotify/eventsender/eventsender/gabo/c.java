package com.spotify.eventsender.eventsender.gabo.c;
import p.tm5;
import p.uu1;
import java.lang.Object;
import p.r90;
import p.ds7;
import java.lang.String;
import p.nm5;
import p.qu0;
import p.cy5;
import com.spotify.eventsender.eventsender.gabo.b;
import java.lang.Class;

public final class c implements tm5	// class@0008b0 from classes.dex
{
    public final tm5 a;
    public final String b;

    public void c(uu1 p0){
       super();
       this.a = p0;
       this.b = "https://spclient.wg.spotify.com/";
    }
    public final Object get(){
       r90 or90;
       b uob;
       if ((or90 = this.a.get()) == null) {
          uob = null;
       }else {
          ds7 uods7 = new ds7();
          uods7.d = or90;
          uods7.c(this.b);
          uods7.b(new nm5());
          cy5 uocy5 = uods7.e();
          uob = uocy5.b(b.class);
       }
       return uob;
    }
}
