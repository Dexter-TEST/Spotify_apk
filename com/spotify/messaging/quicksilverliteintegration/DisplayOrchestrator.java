package com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import p.dk3;
import p.ti3;
import java.lang.Object;
import p.jl1;
import java.util.HashSet;
import p.hb4;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.mg1;
import p.ir0;

public class DisplayOrchestrator implements dk3	// class@000a5c from classes.dex
{
    public final Observable a;
    public Disposable b;
    public final HashSet c;

    public void DisplayOrchestrator(ti3 p0){
       super();
       this.b = jl1.a;
       this.c = new HashSet();
       this.a = Observable.defer(new hb4(4, p0));
    }
    public void onMoveToBackground(){
       this.c.add("FOREGROUND_STATE_PAUSE_REASON");
       this.b.dispose();
    }
    public void onMoveToForeground(){
       this.c.remove("FOREGROUND_STATE_PAUSE_REASON");
       this.b = this.a.subscribe(new mg1(20, this));
    }
}
