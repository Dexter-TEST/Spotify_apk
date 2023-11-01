package p.bh5;
import p.vg0;
import java.lang.Object;
import com.spotify.playlist4.proto.Playlist4ApiProto$ChangeInfo;
import p.ug5;
import com.spotify.playlist4.proto.Playlist4ApiProto$SourceInfo;
import p.nm3;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.fg5;
import java.lang.Integer;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import p.hg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Item;
import p.pg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import p.rg5;
import p.tg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Rem;
import java.lang.IllegalArgumentException;
import p.eg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Add;
import p.gg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Delta;
import p.og5;

public final class bh5	// class@0010c6 from classes.dex
{
    public final vg0 a;

    public void bh5(vg0 p0){
       super();
       this.a = p0;
    }
    public final Playlist4ApiProto$ChangeInfo a(){
       ug5 oug5 = Playlist4ApiProto$SourceInfo.i();
       oug5.c();
       oug5.d();
       oug5.e(this.a.a());
       fg5 uofg5 = Playlist4ApiProto$ChangeInfo.h();
       uofg5.c();
       uofg5.d(oug5.build());
       return uofg5.build();
    }
    public final Playlist4ApiProto$ListChanges b(String p0,Integer p1,String p2){
       hg5 ohg5 = Playlist4ApiProto$Item.g();
       ohg5.c(p0);
       Playlist4ApiProto$Item item = ohg5.build();
       pg5 opg5 = Playlist4ApiProto$Op.j();
       if (!p2.equals("add")) {
          if (p2.equals("rem")) {
             opg5.d(rg5.t);
             tg5 otg5 = Playlist4ApiProto$Rem.i();
             otg5.d(p1.intValue());
             otg5.c(item);
             otg5.e();
             opg5.e(otg5.build());
          }else {
             throw new IllegalArgumentException("Only add and remove kinds are allowed");
          }
       }else {
          opg5.d(rg5.c);
          eg5 uoeg5 = Playlist4ApiProto$Add.j();
          uoeg5.f(p1.intValue());
          uoeg5.d(item);
          opg5.c(uoeg5.build());
       }
       gg5 ogg5 = Playlist4ApiProto$Delta.h();
       ogg5.c(opg5.build());
       ogg5.d(this.a());
       og5 oog5 = Playlist4ApiProto$ListChanges.g();
       oog5.c(ogg5.build());
       return oog5.build();
    }
}
