package com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor$1;
import android.database.ContentObserver;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import android.os.Handler;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Boolean;
import java.lang.Object;

class MobileDataDisabledMonitor$1 extends ContentObserver	// class@00069e from classes.dex
{
    final MobileDataDisabledMonitor this$0;
    final ObservableEmitter val$emitter;

    public void MobileDataDisabledMonitor$1(MobileDataDisabledMonitor p0,Handler p1,ObservableEmitter p2){
       this.this$0 = p0;
       this.val$emitter = p2;
       super(p1);
    }
    public void onChange(boolean p0){
       this.val$emitter.onNext(Boolean.valueOf(this.this$0.getMobileDataDisabled()));
    }
}
