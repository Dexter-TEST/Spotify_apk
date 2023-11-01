package com.spotify.messaging.inappmessaging.inappmessagingsdk.datasource.models.KodakImageResponse;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class KodakImageResponse	// class@000a26 from classes.dex
{
    public final String a;

    public void KodakImageResponse(String p0){
       co5.o(p0, "imageUrl");
       super();
       this.a = p0;
    }
    public final KodakImageResponse copy(String p0){
       co5.o(p0, "imageUrl");
       return new KodakImageResponse(p0);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof KodakImageResponse) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return hr7.a("KodakImageResponse\(imageUrl=", this.a, ')');
    }
}
