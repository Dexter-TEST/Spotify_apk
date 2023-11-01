package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$rcsSnapshotIdProvider$1;
import com.spotify.connectivity.RCSSnapshotIdProvider;
import p.r45;
import java.lang.Object;
import java.lang.String;
import p.ew5;
import java.lang.Long;

public final class ConnectivitySessionService$rcsSnapshotIdProvider$1 implements RCSSnapshotIdProvider	// class@0006ee from classes.dex
{
    final r45 $snapshotIdResolver;

    public void ConnectivitySessionService$rcsSnapshotIdProvider$1(r45 p0){
       this.$snapshotIdResolver = p0;
       super();
    }
    public String getSnapshotId(){
       ConnectivitySessionService$rcsSnapshotIdProvider$1 t$snapshotId;
       ew5 uoew5;
       Long snapshotId;
       String str;
       if ((t$snapshotId = this.$snapshotIdResolver) == null || ((uoew5 = t$snapshotId.f()) == null || ((snapshotId = uoew5.getSnapshotId()) == null || (str = snapshotId.toString()) == null))) {
          str = "";
       }
       return str;
    }
}
