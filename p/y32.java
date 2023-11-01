package p.y32;
import p.x32;
import java.io.FileReader;
import java.lang.String;
import p.ws6;
import p.m42;
import java.lang.Object;
import p.co5;
import java.io.Reader;
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
import java.nio.CharBuffer;
import java.lang.Long;

public final class y32 extends x32	// class@002d3d from classes.dex
{
    public final FileReader a;
    public final String b;
    public final ws6 c;
    public final boolean t;
    public final m42 v;

    public void y32(FileReader p0,String p1,ws6 p2,boolean p3,m42 p4){
       co5.o(p2, "eventSender");
       co5.o(p4, "fileUtils");
       super(p1);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
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
       y32 tv = this.v;
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
          y32 tb = this.b;
          ts6 ots6 = tv.a(tb);
          if (e4) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e4) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tb), 2);
          }
          vs6 l2 = new vs6(1, ots6, i2, uDate, l1, i);
          this.c.a(l);
       }
       if (!e4) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e4;
       }
    }
    public final int read(CharBuffer p0){
       int i;
       Integer integer;
       int i2;
       co5.o(p0, "target");
       y32 tv = this.v;
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
          y32 tb = this.b;
          ts6 ots6 = tv.a(tb);
          if (e15) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e15) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tb), 2);
          }
          vs6 l2 = new vs6(1, ots6, i2, uDate, l1, i);
          this.c.a(l);
       }
       if (!e15) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e15;
       }
    }
    public final int read(char[] p0){
       int i;
       Integer integer;
       int i2;
       co5.o(p0, "cbuf");
       y32 tv = this.v;
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
          y32 tb = this.b;
          ts6 ots6 = tv.a(tb);
          if (e15) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e15) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tb), 2);
          }
          vs6 l2 = new vs6(1, ots6, i2, uDate, l1, i);
          this.c.a(l);
       }
       if (!e15) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e15;
       }
    }
    public final int read(char[] p0,int p1,int p2){
       int i;
       Integer integer;
       int i2;
       vs6 this.t;
       co5.o(p0, "cbuf");
       y32 tv = this.v;
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
          y32 tb = this.b;
          ts6 ots6 = tv.a(tb);
          if (e13) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e13) {
             ss6 oss6 = new ss6("failed to read data at ".concat(tb), 2);
          }
          this.t = new vs6(1, ots6, i2, uDate, l1, i);
          this.c.a(this.t);
       }
       if (!e13) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e13;
       }
    }
    public final boolean ready(){
       return this.a.ready();
    }
    public final void reset(){
       this.a.reset();
    }
    public final long skip(long p0){
       long l1;
       Long longx;
       y32 oy32 = this;
       y32 v = oy32.v;
       v.a.getClass();
       long l = System.currentTimeMillis();
       try{
          int i = 0;
          y32 a = oy32.a;
          l1 = p0;
          try{
             longx = Long.valueOf(a.skip(l1));
             long l4 = i;
          label_0023 :
             long l2 = et0.m(v.a, l);
             if (oy32.t != null) {
                y32 b = oy32.b;
                ts6 ots6 = v.a(b);
                if (!e0) {
                   co5.i(longx);
                   l1 = longx.longValue();
                }
                int i1 = (int)l1;
                Date uDate = new Date();
                if (e0) {
                   ss6 oss6 = new ss6("failed to read data at ".concat(b), 2);
                }
                vs6 l3 = new vs6(1, ots6, i1, uDate, l2, i);
                oy32.c.a(l);
             }
             if (!e0) {
                co5.i(longx);
                return longx.longValue();
             }else {
                throw e0;
             }
          }catch(java.lang.Exception e0){
          }
          longx = i;
          goto label_0023 ;
       }catch(java.lang.Exception e0){
          l1 = p0;
       }
    }
}
