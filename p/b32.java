package p.b32;
import java.io.Closeable;
import java.lang.AutoCloseable;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.InterruptibleChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.FileChannel;
import p.ws6;
import java.lang.String;
import p.m42;
import java.lang.Object;
import p.co5;
import p.kf7;
import java.lang.Class;
import java.lang.System;
import java.lang.Long;
import p.ic;
import p.et0;
import p.vs6;
import p.ts6;
import java.util.Date;
import p.ss6;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.ByteBuffer;
import java.lang.Integer;

public final class b32 implements Closeable, AutoCloseable, ByteChannel, Channel, GatheringByteChannel, InterruptibleChannel, ReadableByteChannel, ScatteringByteChannel, WritableByteChannel	// class@001045 from classes.dex
{
    public final FileChannel a;
    public final ws6 b;
    public final String c;
    public final boolean t;
    public final m42 v;

    public void b32(FileChannel p0,ws6 p1,String p2,boolean p3,m42 p4){
       co5.o(p1, "eventSender");
       co5.o(p2, "path");
       co5.o(p4, "fileUtils");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final long b(b32 p0,long p1,long p2){
       int i;
       Long longx;
       int i1;
       b32 uob32 = this;
       b32 v = uob32.v;
       v.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          longx = Long.valueOf(uob32.a.transferFrom(p0, p1, p2));
          long l1 = i;
       }catch(java.lang.Exception e0){
          longx = i;
       }
       long l2 = et0.m(v.a, l);
       if (uob32.t != null) {
          b32 c = uob32.c;
          ts6 ots6 = v.a(c);
          if (e0) {
             i1 = 0;
          }else {
             co5.i(longx);
             i1 = (int)longx.longValue();
          }
          Date uDate = new Date();
          if (e0) {
             ss6 oss6 = new ss6("failed to write read at ".concat(c), 1);
          }
          vs6 l3 = new vs6(2, ots6, i1, uDate, l2, i);
          uob32.b.a(l);
       }
       if (!e0) {
          co5.i(longx);
          return longx.longValue();
       }else {
          throw e0;
       }
    }
    public final void close(){
       this.a.close();
    }
    public final boolean isOpen(){
       return this.a.isOpen();
    }
    public final int read(ByteBuffer p0){
       int i;
       Integer integer;
       int i2;
       co5.o(p0, "dst");
       b32 tv = this.v;
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
          b32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (!e15) {
             co5.i(integer);
             if (integer.intValue() != -1) {
                i2 = integer.intValue();
             label_0048 :
                Date uDate = new Date();
                if (e15) {
                   ss6 oss6 = new ss6("failed to read data at ".concat(tc), 2);
                }
                vs6 l2 = new vs6(1, ots6, i2, uDate, l1, i);
                this.b.a(l);
             }
          }
          i2 = 0;
          goto label_0048 ;
       }
       if (!e15) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e15;
       }
    }
    public final long read(ByteBuffer[] p0){
       int i;
       Long longx;
       int i1;
       co5.o(p0, "dsts");
       b32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          longx = Long.valueOf(this.a.read(p0));
          long l1 = i;
       }catch(java.lang.Exception e15){
          longx = i;
       }
       long l2 = et0.m(tv.a, l);
       if (this.t != null) {
          b32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (!e15) {
             co5.i(longx);
             if (longx.longValue() - -1) {
                i1 = (int)longx.longValue();
             label_004c :
                Date uDate = new Date();
                if (e15) {
                   ss6 oss6 = new ss6("failed to read data at ".concat(tc), 2);
                }
                vs6 l3 = new vs6(1, ots6, i1, uDate, l2, i);
                this.b.a(l);
             }
          }
          i1 = 0;
          goto label_004c ;
       }
       if (!e15) {
          co5.i(longx);
          return longx.longValue();
       }else {
          throw e15;
       }
    }
    public final long read(ByteBuffer[] p0,int p1,int p2){
       int i;
       Long longx;
       int i1;
       b32 uob32 = this;
       Object obj = p0;
       co5.o(obj, "dsts");
       b32 v = uob32.v;
       v.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          longx = Long.valueOf(uob32.a.read(obj, p1, p2));
          long l1 = i;
       }catch(java.lang.Exception e0){
          longx = i;
       }
       long l2 = et0.m(v.a, l);
       if (uob32.t != null) {
          b32 c = uob32.c;
          ts6 ots6 = v.a(c);
          if (!e0) {
             co5.i(longx);
             if (longx.longValue() - -1) {
                i1 = (int)longx.longValue();
             label_0054 :
                Date uDate = new Date();
                if (e0) {
                   ss6 oss6 = new ss6("failed to read data at ".concat(c), 2);
                }
                vs6 l3 = new vs6(1, ots6, i1, uDate, l2, i);
                uob32.b.a(l);
             }
          }
          i1 = 0;
          goto label_0054 ;
       }
       if (!e0) {
          co5.i(longx);
          return longx.longValue();
       }else {
          throw e0;
       }
    }
    public final int write(ByteBuffer p0){
       int i;
       Integer integer;
       int i2;
       co5.o(p0, "src");
       b32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          integer = Integer.valueOf(this.a.write(p0));
          int i1 = i;
       }catch(java.lang.Exception e15){
          integer = i;
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          b32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (e15) {
             i2 = 0;
          }else {
             co5.i(integer);
             i2 = integer.intValue();
          }
          Date uDate = new Date();
          if (e15) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tc), 1);
          }
          vs6 l2 = new vs6(2, ots6, i2, uDate, l1, i);
          this.b.a(l);
       }
       if (!e15) {
          co5.i(integer);
          return integer.intValue();
       }else {
          throw e15;
       }
    }
    public final long write(ByteBuffer[] p0){
       int i;
       Long longx;
       int i1;
       co5.o(p0, "srcs");
       b32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          longx = Long.valueOf(this.a.write(p0));
          long l1 = i;
       }catch(java.lang.Exception e15){
          longx = i;
       }
       long l2 = et0.m(tv.a, l);
       if (this.t != null) {
          b32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (e15) {
             i1 = 0;
          }else {
             co5.i(longx);
             i1 = (int)longx.longValue();
          }
          Date uDate = new Date();
          if (e15) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tc), 1);
          }
          vs6 l3 = new vs6(2, ots6, i1, uDate, l2, i);
          this.b.a(l);
       }
       if (!e15) {
          co5.i(longx);
          return longx.longValue();
       }else {
          throw e15;
       }
    }
    public final long write(ByteBuffer[] p0,int p1,int p2){
       int i;
       Long longx;
       int i1;
       vs6 this.t;
       co5.o(p0, "srcs");
       b32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          longx = Long.valueOf(this.a.write(p0, p1, p2));
          long l1 = i;
       }catch(java.lang.Exception e13){
          longx = i;
       }
       long l2 = et0.m(tv.a, l);
       if (this.t != null) {
          b32 tc = this.c;
          ts6 ots6 = tv.a(tc);
          if (e13) {
             i1 = 0;
          }else {
             co5.i(longx);
             i1 = (int)longx.longValue();
          }
          Date uDate = new Date();
          if (e13) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tc), 1);
          }
          this.t = new vs6(2, ots6, i1, uDate, l2, i);
          this.b.a(this.t);
       }
       if (!e13) {
          co5.i(longx);
          return longx.longValue();
       }else {
          throw e13;
       }
    }
}
