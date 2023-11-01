package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.Creative;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.display.models.CreativeType;
import java.util.Map;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class Creative	// class@000a0f from classes.dex
{
    public final CreativeType a;
    public final Map b;
    public final List c;

    public void Creative(CreativeType p0,Map p1,List p2){
       co5.o(p0, "type");
       co5.o(p1, "metadata");
       co5.o(p2, "clickActions");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Creative copy(CreativeType p0,Map p1,List p2){
       co5.o(p0, "type");
       co5.o(p1, "metadata");
       co5.o(p2, "clickActions");
       return new Creative(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Creative) {
          return false;
       }
       if (this.a != p0.a) {
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
       return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }
    public final String toString(){
       return kg4.o("Creative\(type="+this.a+", metadata="+this.b+", clickActions=", this.c, ')');
    }
}
