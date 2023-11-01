package com.spotify.notifications.models.preferences.ShowOptInMetadata;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class ShowOptInMetadata	// class@000aac from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public void ShowOptInMetadata(String p0,String p1,String p2,String p3,boolean p4){
       co5.o(p0, "showUri");
       co5.o(p1, "title");
       co5.o(p2, "publisher");
       co5.o(p3, "showImageId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final ShowOptInMetadata copy(String p0,String p1,String p2,String p3,boolean p4){
       co5.o(p0, "showUri");
       co5.o(p1, "title");
       co5.o(p2, "publisher");
       co5.o(p3, "showImageId");
       ShowOptInMetadata v0 = new ShowOptInMetadata(p0, p1, p2, p3, p4);
       return v0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ShowOptInMetadata) {
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
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ShowOptInMetadata te;
       int i = tp2.g(this.d, tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31);
       if ((te = this.e) != null) {
          te = 1;
       }
       return (i + te);
    }
    public final String toString(){
       return kg4.p("ShowOptInMetadata\(showUri="+this.a+", title="+this.b+", publisher="+this.c+", showImageId="+this.d+", optedIn=", this.e, ')');
    }
}
