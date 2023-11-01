package com.spotify.playerlimited.player.models.LoginOptions;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LoginOptions	// class@000b6e from classes.dex
{
    public final boolean a;
    public final boolean b;

    public void LoginOptions(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void LoginOptions(boolean p0,boolean p1,int p2,DefaultConstructorMarker p3){
       if ((p2 & 0x02)) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
}
