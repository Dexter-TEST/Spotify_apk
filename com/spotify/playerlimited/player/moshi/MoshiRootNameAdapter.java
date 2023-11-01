package com.spotify.playerlimited.player.moshi.MoshiRootNameAdapter;
import com.squareup.moshi.JsonAdapter;
import java.lang.String;
import java.lang.Object;
import p.co5;
import com.squareup.moshi.b;
import p.g70;
import com.squareup.moshi.i;

public final class MoshiRootNameAdapter extends JsonAdapter	// class@000b8d from classes.dex
{
    private final JsonAdapter delegate;
    private final String name;

    public void MoshiRootNameAdapter(JsonAdapter p0,String p1){
       co5.o(p0, "delegate");
       co5.o(p1, "name");
       super();
       this.delegate = p0;
       this.name = p1;
    }
    public Object fromJson(b p0){
       co5.o(p0, "reader");
       b uob = p0.r0();
       uob.f();
       if (uob.T() && co5.c(uob.l0(), this.name)) {
          uob.A0();
          if (!uob.T()) {
             p0.f();
             p0.z0();
             p0.y();
             return this.delegate.fromJson(p0.n0());
          }
       }
       return this.delegate.fromJson(p0);
    }
    public void toJson(i p0,Object p1){
       co5.o(p0, "writer");
       p0.x().l0(this.name);
       this.delegate.toJson(p0, p1);
       p0.g0();
    }
}
