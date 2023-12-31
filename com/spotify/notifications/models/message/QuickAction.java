package com.spotify.notifications.models.message.QuickAction;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class QuickAction	// class@000a9f from classes.dex
{
    public final String a;
    public final String b;
    public final String c;

    public void QuickAction(String p0,String p1,String p2){
       co5.o(p0, "actionIdentifier");
       co5.o(p1, "actionTitle");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final QuickAction copy(String p0,String p1,String p2){
       co5.o(p0, "actionIdentifier");
       co5.o(p1, "actionTitle");
       return new QuickAction(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof QuickAction) {
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
       QuickAction tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("QuickAction\(actionIdentifier="+this.a+", actionTitle="+this.b+", actionData=", this.c, ')');
    }
}
