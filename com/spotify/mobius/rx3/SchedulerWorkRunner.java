package com.spotify.mobius.rx3.SchedulerWorkRunner;
import p.er7;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Class;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;

public class SchedulerWorkRunner implements er7	// class@000a8d from classes.dex
{
    public final Scheduler$Worker a;
    public final ReentrantLock b;

    public void SchedulerWorkRunner(Scheduler p0){
       super();
       this.b = new ReentrantLock();
       p0.getClass();
       this.a = p0.b();
    }
    public final void dispose(){
       SchedulerWorkRunner tb = this.b;
       tb.lock();
       this.a.dispose();
       tb.unlock();
    }
    public final void post(Runnable p0){
       SchedulerWorkRunner tb = this.b;
       tb.lock();
       this.a.a(p0);
       tb.unlock();
    }
}
