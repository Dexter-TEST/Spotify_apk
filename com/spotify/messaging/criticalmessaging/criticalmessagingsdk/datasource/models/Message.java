package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.Message;
import java.lang.String;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.Creative;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class Message	// class@000a11 from classes.dex
{
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final Creative e;
    public final boolean f;
    public final boolean g;

    public void Message(String p0,long p1,long p2,String p3,Creative p4,boolean p5,boolean p6){
       co5.o(p0, "uuid");
       co5.o(p3, "impressionUrl");
       co5.o(p4, "creative");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final Message copy(String p0,long p1,long p2,String p3,Creative p4,boolean p5,boolean p6){
       co5.o(p0, "uuid");
       Object obj = p3;
       co5.o(obj, "impressionUrl");
       Object obj1 = p4;
       co5.o(obj1, "creative");
       Message v0 = new Message(p0, p1, p2, obj, obj1, p5, p6);
       return v0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Message) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       Message tf;
       Message tb = this.b;
       tb = this.c;
       int i = (this.e.hashCode() + tp2.g(this.d, (((((this.a.hashCode() * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32))) * 31), 31)) * 31;
       int i1 = 1;
       if ((tf = this.f) != null) {
          tf = 1;
       }
       i = (i + tf) * 31;
       if ((tf = this.g) == null) {
          i1 = tf;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("Message\(uuid="+this.a+", id="+this.b+", endTimestamp="+this.c+", impressionUrl="+this.d+", creative="+this.e+", transactional="+this.f+", control=", this.g, ')');
    }
}
