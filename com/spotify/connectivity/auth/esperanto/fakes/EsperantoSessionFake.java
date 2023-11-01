package com.spotify.connectivity.auth.esperanto.fakes.EsperantoSessionFake;
import com.spotify.connectivity.auth.esperanto.proto.SessionClient;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import java.lang.Object;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult$Builder;
import com.google.protobuf.c;
import com.google.protobuf.b;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;

public final class EsperantoSessionFake implements SessionClient	// class@000626 from classes.dex
{
    private EsSession$SendEndSongsResult sendEndSongsResult;

    public void EsperantoSessionFake(EsSession$SendEndSongsResult p0){
       this.sendEndSongsResult = p0;
    }
    public final EsSession$SendEndSongsResult getSendEndSongsResult(){
       return this.sendEndSongsResult;
    }
    public Single sendEndSongs(Empty p0){
       EsperantoSessionFake tsendEndSong;
       co5.o(p0, "request");
       if ((tsendEndSong = this.sendEndSongsResult) == null) {
          tsendEndSong = EsSession$SendEndSongsResult.newBuilder().build();
       }
       Single single = Single.just(tsendEndSong);
       co5.l(single, "just\(sendEndSongsResult …ult.newBuilder\(\).build\(\)\)");
       return single;
    }
    public final void setSendEndSongsResult(EsSession$SendEndSongsResult p0){
       this.sendEndSongsResult = p0;
    }
    public Observable willLogoutAndForgetCurrentUser(Empty p0){
       co5.o(p0, "request");
       Observable observable = Observable.empty();
       co5.l(observable, "empty<Empty>\(\)");
       return observable;
    }
    public Single writeProductStateToLegacyStorage(EsSession$ProductStateMap p0){
       co5.o(p0, "request");
       Single single = Single.just(Empty.f());
       co5.l(single, "just\(Empty.getDefaultInstance\(\)\)");
       return single;
    }
}
