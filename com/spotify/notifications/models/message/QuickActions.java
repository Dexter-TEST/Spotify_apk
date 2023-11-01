package com.spotify.notifications.models.message.QuickActions;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class QuickActions	// class@000aa1 from classes.dex
{
    public final String a;
    public final List b;

    public void QuickActions(String p0,List p1){
       co5.o(p0, "category");
       co5.o(p1, "actions");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final QuickActions copy(String p0,List p1){
       co5.o(p0, "category");
       co5.o(p1, "actions");
       return new QuickActions(p0, p1);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof QuickActions) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return kg4.o("QuickActions\(category="+this.a+", actions=", this.b, ')');
    }
}
