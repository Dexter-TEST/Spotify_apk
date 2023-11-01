package com.spotify.playerlimited.player.models.SocialConnectSession;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.hr7;

public final class SocialConnectSession	// class@000b86 from classes.dex
{
    public boolean a;
    public String b;
    public String c;

    static {
       SocialConnectSession socialConnec = new SocialConnectSession();
    }
    public void SocialConnectSession(){
       super();
    }
    public static void getJoinSessionUri$annotations(){
    }
    public static void getSessionId$annotations(){
    }
    public static void isHost$annotations(){
    }
    public final String toString(){
       return hr7.a("{isHost="+this.a+", joinSessionUri="+this.b+", sessionId=", this.c, '}');
    }
}
