package p.v32;
import p.u32;
import java.io.FileOutputStream;
import p.ws6;
import java.lang.String;
import p.m42;
import java.lang.Object;
import p.co5;
import java.io.OutputStream;
import p.kf7;
import java.lang.Class;
import java.lang.System;
import p.ic;
import p.et0;
import p.vs6;
import p.ts6;
import java.util.Date;
import p.ss6;

public final class v32 extends u32	// class@002972 from classes.dex
{
    public final FileOutputStream a;
    public final ws6 b;
    public final String c;
    public final boolean t;
    public final m42 v;

    public void v32(FileOutputStream p0,ws6 p1,String p2,boolean p3,m42 p4){
       co5.o(p1, "eventSender");
       co5.o(p4, "fileUtils");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void close(){
       this.a.close();
    }
    public final void flush(){
       this.a.flush();
    }
    public final void write(int p0){
       int i;
       v32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0);
          void ovoid = i;
       }catch(java.lang.Exception e14){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          v32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          int i1 = 1;
          int i2 = (!e14)? 1: 0;
          Date uDate = new Date();
          if (e14) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tc), i1);
          }
          vs6 l2 = new vs6(2, ots6, i2, uDate, l1, i);
          this.b.a(l);
       }
       if (!e14) {
          return;
       }else {
          throw e14;
       }
    }
    public final void write(byte[] p0){
       int i;
       co5.o(p0, "byteArray");
       v32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0);
          void ovoid = i;
       }catch(java.lang.Exception e4){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          v32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          int i1 = (!e4)? p0.length: 0;
          Date uDate = new Date();
          if (e4) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tc), 1);
          }
          vs6 l2 = new vs6(2, ots6, i1, uDate, l1, i);
          this.b.a(l);
       }
       if (!e4) {
          return;
       }else {
          throw e4;
       }
    }
    public final void write(byte[] p0,int p1,int p2){
       int i;
       vs6 this.t;
       co5.o(p0, "byteArray");
       v32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0, p1, p2);
          void ovoid = i;
       }catch(java.lang.Exception e14){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          v32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          int i1 = (!e14)? p0.length: 0;
          Date uDate = new Date();
          if (e14) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tc), 1);
          }
          this.t = new vs6(2, ots6, i1, uDate, l1, i);
          this.b.a(this.t);
       }
       if (!e14) {
          return;
       }else {
          throw e14;
       }
    }
}
