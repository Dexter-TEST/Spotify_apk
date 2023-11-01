package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.ClickAction;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class ClickAction	// class@000a0d from classes.dex
{
    public final String a;
    public final String b;
    public final Map c;

    public void ClickAction(String p0,String p1,Map p2){
       co5.o(p0, "id");
       co5.o(p1, "type");
       co5.o(p2, "metadata");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final ClickAction copy(String p0,String p1,Map p2){
       co5.o(p0, "id");
       co5.o(p1, "type");
       co5.o(p2, "metadata");
       return new ClickAction(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ClickAction) {
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
       return "ClickAction\(id="+this.a+", type="+this.b+", metadata="+this.c+')';
    }
}
