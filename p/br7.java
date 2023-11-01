package p.br7;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.h07;
import p.ir2;
import java.lang.Thread;
import p.x07;
import java.lang.System;

public final class br7	// class@001121 from classes.dex
{
    public final AtomicReferenceArray a;
    private int blockingTasksInBuffer;
    private int consumerIndex;
    private Object lastScheduledTask;
    private int producerIndex;
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public static final AtomicIntegerFieldUpdater e;

    static {
       br7.b = AtomicReferenceFieldUpdater.newUpdater(br7.class, Object.class, "lastScheduledTask");
       br7.c = AtomicIntegerFieldUpdater.newUpdater(br7.class, "producerIndex");
       br7.d = AtomicIntegerFieldUpdater.newUpdater(br7.class, "consumerIndex");
       br7.e = AtomicIntegerFieldUpdater.newUpdater(br7.class, "blockingTasksInBuffer");
    }
    public void br7(){
       super();
       this.a = new AtomicReferenceArray(128);
       this.lastScheduledTask = null;
       this.producerIndex = 0;
       this.consumerIndex = 0;
       this.blockingTasksInBuffer = 0;
    }
    public final h07 a(h07 p0,boolean p1){
       if (p1) {
          return this.b(p0);
       }
       if ((p0 = br7.b.getAndSet(this, p0)) == null) {
          return null;
       }
       return this.b(p0);
    }
    public final h07 b(h07 p0){
       int i = 1;
       if (p0.b.a == i) {
       }else {
          i = 0;
       }
       if (i) {
          br7.e.incrementAndGet(this);
       }
       i = 127;
       if (((this.producerIndex - this.consumerIndex)) == i) {
          return p0;
       }else {
          int i1 = this.producerIndex & i;
          while (this.a.get(i1) != null) {
             Thread.yield();
          }
          this.a.lazySet(i1, p0);
          br7.c.incrementAndGet(this);
          return null;
       }
    }
    public final int c(){
       int i = (this.lastScheduledTask != null)? (this.producerIndex - this.consumerIndex) + 1: this.producerIndex - this.consumerIndex;
       return i;
    }
    public final h07 d(){
       h07 andSet;
       while (true) {
          br7 tconsumerInd = this.consumerIndex;
          int i = tconsumerInd - this.producerIndex;
          h07 oh07 = null;
          if (!i) {
             return oh07;
          }
          i = tconsumerInd & 0x7f;
          int i1 = tconsumerInd + 1;
          if (br7.d.compareAndSet(this, tconsumerInd, i1) && (andSet = this.a.getAndSet(i, oh07)) != null) {
             oh07 = 1;
             if (andSet.b.a != oh07) {
                oh07 = 0;
             }
             if (oh07) {
                br7.e.decrementAndGet(this);
                break ;
             }
             break ;
          }
       }
       return andSet;
    }
    public final long e(br7 p0){
       h07 oh07;
       br7 consumerInde = p0.consumerIndex;
       br7 producerInde = p0.producerIndex;
       br7 a = p0.a;
       while (true) {
          boolean b = true;
          if (consumerInde != producerInde) {
             int i = consumerInde & 0x7f;
             if (p0.blockingTasksInBuffer != null) {
                if ((oh07 = a.get(i)) != null) {
                   int i1 = (oh07.b.a == b)? 1: 0;
                   if (i1) {
                      while (true) {
                         if (!a.compareAndSet(i, oh07, null)) {
                            if (a.get(i) != oh07) {
                               b = 0;
                            }
                         }
                         if (b) {
                            br7.e.decrementAndGet(p0);
                            this.a(oh07, false);
                            return -1;
                         }
                      }
                      return this.f(p0, b);
                   }
                }
                consumerInde = consumerInde + 1;
             }else {
             }
          }else {
          }
       }
    }
    public final long f(br7 p0,boolean p1){
       br7 lastSchedule;
       while (true) {
          lastSchedule = p0.lastScheduledTask;
          long l = -2;
          if (lastSchedule == null) {
             return l;
          }
          int i = 1;
          if (p1) {
             int i1 = (lastSchedule.b.a == i)? 1: 0;
             if (!i1) {
                return l;
             }
          }
          x07.e.getClass();
          l = System.nanoTime() - lastSchedule.a;
          long a = x07.a;
          if ((l - a) < 0) {
             return (a - l);
          }else {
             AtomicReferenceFieldUpdater b = br7.b;
             while (!b.compareAndSet(p0, lastSchedule, null)) {
                if (b.get(p0) != lastSchedule) {
                   i = 0;
                   break ;
                }
             }
             if (i) {
             }
          }
       }
       this.a(lastSchedule, false);
       return -1;
    }
}
