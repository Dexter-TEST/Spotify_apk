package com.spotify.notifications.models.message.RichPushData;
import java.lang.String;
import com.spotify.notifications.models.message.RichPushFields;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class RichPushData	// class@000aa3 from classes.dex
{
    public final String a;
    public final String b;
    public final RichPushFields c;

    public void RichPushData(String p0,String p1,RichPushFields p2){
       co5.o(p0, "type");
       co5.o(p1, "version");
       co5.o(p2, "fields");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final RichPushData copy(String p0,String p1,RichPushFields p2){
       co5.o(p0, "type");
       co5.o(p1, "version");
       co5.o(p2, "fields");
       return new RichPushData(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof RichPushData) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + tp2.g(this.b, (this.a.hashCode() * 31), 31));
    }
    public final String toString(){
       return "RichPushData\(type="+this.a+", version="+this.b+", fields="+this.c+')';
    }
}
