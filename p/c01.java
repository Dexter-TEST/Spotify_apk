package p.c01;
import p.vi7;
import p.m12;
import p.ah5;
import p.mp;
import p.bh5;
import com.spotify.playlist4.proto.Playlist4ApiProto$CreateListReply;
import java.lang.String;
import p.i80;
import p.pe0;
import java.nio.charset.Charset;
import io.reactivex.rxjava3.core.Single;
import p.vp;
import p.r45;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.mg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributes;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.ng5;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributesPartialState;
import p.xg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$UpdateListAttributes;
import p.pg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import p.rg5;
import p.sg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$OpList;
import p.c16;
import p.yf2;

public final class c01 extends vi7	// class@00116b from classes.dex
{
    public final m12 t;
    public final ah5 v;
    public final mp w;
    public final bh5 x;

    public void c01(m12 p0,ah5 p1,mp p2,bh5 p3){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
    }
    public static String e(Playlist4ApiProto$CreateListReply p0){
       return new String(p0.f().p(), pe0.b);
    }
    public final Single f(String p0){
       r45 or45 = this.w.a();
       if (!or45.c()) {
          return Single.error(new IllegalStateException("Missing required username when creating playlist"));
       }
       this.x.getClass();
       mg5 omg5 = Playlist4ApiProto$ListAttributes.g();
       omg5.c(p0);
       Playlist4ApiProto$ListAttributes listAttribut = omg5.build();
       ng5 ong5 = Playlist4ApiProto$ListAttributesPartialState.g();
       ong5.c(listAttribut);
       Playlist4ApiProto$ListAttributesPartialState listAttribut1 = ong5.build();
       xg5 oxg5 = Playlist4ApiProto$UpdateListAttributes.g();
       oxg5.c(listAttribut1);
       Playlist4ApiProto$UpdateListAttributes updateListAt = oxg5.build();
       pg5 opg5 = Playlist4ApiProto$Op.j();
       opg5.d(rg5.x);
       opg5.f(updateListAt);
       Playlist4ApiProto$Op op = opg5.build();
       sg5 osg5 = Playlist4ApiProto$OpList.g();
       osg5.c(op);
       Playlist4ApiProto$OpList opList = osg5.build();
       return this.v.b(opList).flatMap(new c16(this, 13, or45));
    }
}
