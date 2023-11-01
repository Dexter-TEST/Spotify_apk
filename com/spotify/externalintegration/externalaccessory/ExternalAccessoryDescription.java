package com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class ExternalAccessoryDescription	// class@0008ba from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public void ExternalAccessoryDescription(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10){
       co5.o(p0, "integrationType");
       co5.o(p1, "clientId");
       co5.o(p2, "name");
       co5.o(p3, "transportType");
       co5.o(p4, "connectionLabel");
       co5.o(p5, "category");
       co5.o(p6, "company");
       co5.o(p7, "model");
       co5.o(p8, "version");
       co5.o(p9, "protocol");
       co5.o(p10, "senderId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
    }
    public void ExternalAccessoryDescription(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,int p11,DefaultConstructorMarker p12){
       int i = p11;
       String str = "";
       String str1 = ((i & 0x01))? str: p0;
       String str2 = ((i & 0x02))? str: p1;
       String str3 = ((i & 0x04))? str: p2;
       String str4 = ((i & 0x08))? str: p3;
       String str5 = ((i & 0x10))? str: p4;
       String str6 = ((i & 0x20))? str: p5;
       String str7 = ((i & 0x40))? str: p6;
       String str8 = ((i & 0x0080))? str: p7;
       String str9 = ((i & 0x0100))? str: p8;
       String str10 = ((i & 0x0200))? str: p9;
       if (!((i & 0x0400))) {
          str = p10;
       }
       super(str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str);
       return;
    }
    public final ExternalAccessoryDescription copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10){
       co5.o(p0, "integrationType");
       co5.o(p1, "clientId");
       Object obj = p2;
       co5.o(obj, "name");
       Object obj1 = p3;
       co5.o(obj1, "transportType");
       Object obj2 = p4;
       co5.o(obj2, "connectionLabel");
       Object obj3 = p5;
       co5.o(obj3, "category");
       Object obj4 = p6;
       co5.o(obj4, "company");
       Object obj5 = p7;
       co5.o(obj5, "model");
       Object obj6 = p8;
       co5.o(obj6, "version");
       Object obj7 = p9;
       co5.o(obj7, "protocol");
       Object obj8 = p10;
       co5.o(obj8, "senderId");
       ExternalAccessoryDescription v0 = new ExternalAccessoryDescription(p0, p1, obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
       return v0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ExternalAccessoryDescription) {
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
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       if (!co5.c(this.g, p0.g)) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       if (!co5.c(this.i, p0.i)) {
          return false;
       }
       if (!co5.c(this.j, p0.j)) {
          return false;
       }
       if (!co5.c(this.k, p0.k)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.k.hashCode() + tp2.g(this.j, tp2.g(this.i, tp2.g(this.h, tp2.g(this.g, tp2.g(this.f, tp2.g(this.e, tp2.g(this.d, tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31), 31), 31), 31), 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("ExternalAccessoryDescription\(integrationType="+this.a+", clientId="+this.b+", name="+this.c+", transportType="+this.d+", connectionLabel="+this.e+", category="+this.f+", company="+this.g+", model="+this.h+", version="+this.i+", protocol="+this.j+", senderId=", this.k, ')');
    }
}
