package p.ah5;
import java.lang.String;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.playlist4.proto.Playlist4ApiProto$OpList;
import io.reactivex.rxjava3.core.Single;

public interface abstract ah5	// class@000f83 from classes.dex
{

    Completable a(String p0,Playlist4ApiProto$ListChanges p1);
    Single b(Playlist4ApiProto$OpList p0);
    Completable c(String p0,Playlist4ApiProto$ListChanges p1);
}
