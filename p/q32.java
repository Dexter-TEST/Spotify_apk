package p.q32;
import p.p32;
import java.io.FileInputStream;
import p.ws6;
import java.lang.String;
import p.m42;
import java.lang.Object;
import p.co5;
import java.io.InputStream;
import p.kf7;
import java.lang.Class;
import java.lang.System;
import java.lang.Integer;
import p.ic;
import p.et0;
import p.vs6;
import p.ts6;
import java.util.Date;
import p.ss6;
import java.lang.Long;

public final class q32 extends p32	// class@002322 from classes.dex
{
    public final FileInputStream a;
    public final ws6 b;
    public final String c;
    public final boolean t;
    public final m42 v;

    public void q32(FileInputStream p0,ws6 p1,String p2,boolean p3,m42 p4){
       co5.o(p1, "eventSender");
       co5.o(p4, "fileUtils");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final int available(){
       return this.a.available();
    }
    public final void close(){
       this.a.close();
    }
    public final void mark(int p0){
       this.a.mark(p0);
    }
    public final boolean markSupported(){
       return this.a.markSupported();
    }
    public final int read(){
       int i;
       Integer integer;
       int i2;
       q32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          integer = Integer.valueOf(this.a.read());
          int i1 = i;
       }catch(java.lang.Exception e4){
          integer = i;
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          q32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (!e4) {
             co5.i(integer);
             if (integer.intValue() != -1) {
                i2 = 1;
             label_0040 :
                Date uDate = new Date();
                if (e4) {
                   ss6 oss6 = new ss6("failed to read data at ".concat(tc), 2);
                }
                vs6 l2 = new vs6(1, ots6, i2, uDate, l1, i);
                this.b.a(l);
             }
          }
          i2 = 0;
          goto label_0040 ;
       }
       if (!e4) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e4;
       }
    }
    public final int read(byte[] p0){
       int i;
       Integer integer;
       int i2;
       co5.o(p0, "b");
       q32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          integer = Integer.valueOf(this.a.read(p0));
          int i1 = i;
       }catch(java.lang.Exception e15){
          integer = i;
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          q32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (e15) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e15) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tc), 2);
          }
          vs6 l2 = new vs6(1, ots6, i2, uDate, l1, i);
          this.b.a(l);
       }
       if (!e15) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e15;
       }
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       Integer integer;
       int i2;
       vs6 this.t;
       co5.o(p0, "b");
       q32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          integer = Integer.valueOf(this.a.read(p0, p1, p2));
          int i1 = i;
       }catch(java.lang.Exception e13){
          integer = i;
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          q32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (e13) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e13) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tc), 2);
          }
          this.t = new vs6(1, ots6, i2, uDate, l1, i);
          this.b.a(this.t);
       }
       if (!e13) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e13;
       }
    }
    public final void reset(){
       this.a.reset();
    }
    public final long skip(long p0){
       int i;
       Long longx;
       int i1;
       q32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          longx = Long.valueOf(this.a.skip(p0));
          p0 = i;
       }catch(java.lang.Exception e14){
          longx = i;
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          q32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (e14) {
             i1 = 0;
          }else {
             co5.i(longx);
             i1 = (int)longx.longValue();
          }
          Date uDate = new Date();
          if (e14) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tc), 2);
          }
          vs6 l2 = new vs6(1, ots6, i1, uDate, l1, i);
          this.b.a(l);
       }
       if (!e14) {
          co5.i(longx);
          return longx.longValue();
       }else {
          throw e14;
       }
    }
}
