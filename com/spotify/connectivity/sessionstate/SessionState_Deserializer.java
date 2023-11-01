package com.spotify.connectivity.sessionstate.SessionState_Deserializer;
import com.fasterxml.jackson.databind.deser.std.m;
import com.spotify.connectivity.sessionstate.SessionState;
import java.lang.Class;
import p.eg3;
import p.u91;
import java.lang.Boolean;
import java.lang.String;
import p.zn4;
import java.lang.Object;
import p.if3;
import java.lang.Integer;
import java.lang.Throwable;
import p.yf3;
import java.io.Closeable;
import p.qg3;
import java.lang.Enum;

public final class SessionState_Deserializer extends m	// class@000834 from classes.dex
{
    private static final long serialVersionUID = 0x1;

    public void SessionState_Deserializer(){
       super(SessionState.class);
    }
    public boolean _deserializeboolean(eg3 p0,u91 p1){
       return zn4.a(Boolean.TYPE, "boolean").deserialize(p0, p1).booleanValue();
    }
    public int _deserializeint(eg3 p0,u91 p1){
       return zn4.a(Integer.TYPE, "int").deserialize(p0, p1).intValue();
    }
    public SessionState deserialize(eg3 p0,u91 p1){
       try{
          return this.deserializeSessionState(p0, p1);
       }catch(java.lang.RuntimeException e3){
       label_0006 :
          if (e3.getCause() == null) {
             throw new yf3(p1.c, e3.getMessage(), e3);
          }
          Throwable cause = e3.getCause();
          goto label_0006 ;
       }
    }
    public Object deserialize(eg3 p0,u91 p1){
       return this.deserialize(p0, p1);
    }
    public SessionState deserializeSessionState(eg3 p0,u91 p1){
       SessionState sessionState = null;
       if (p0.j0() == qg3.H) {
          return sessionState;
       }
       SessionState sessionState1 = sessionState;
       SessionState sessionState2 = sessionState1;
       SessionState sessionState3 = sessionState2;
       SessionState sessionState4 = sessionState3;
       boolean b = false;
       boolean b1 = false;
       boolean b2 = false;
       int i = 0;
       boolean b3 = false;
       boolean b4 = false;
       while (p0.C0() != qg3.y) {
          int i1 = 5;
          if (p0.j0().ordinal() != i1) {
             continue ;
          }else {
             String str = p0.i0();
             str.getClass();
             switch (str.hashCode()){
                 case 0x95a47502:
                   if (str.equals("logged_in")) {
                      i1 = 0;
                   }else {
                   }
                   break;
                 case 0xa370e26e:
                   if (str.equals("logging_out")) {
                      i1 = 1;
                   }else {
                   }
                   break;
                 case 0xb55b62cf:
                   if (str.equals("can_stream")) {
                      i1 = 2;
                   }else {
                   }
                   break;
                 case 0xbe112b12:
                   if (str.equals("current_account_type")) {
                      i1 = 3;
                   }else {
                   }
                   break;
                 case 0xdd79f309:
                   if (str.equals("connected")) {
                      i1 = 4;
                   }else {
                   }
                   break;
                 case 0x264df605:
                   if (str.equals("logging_in")) {
                   }else {
                   }
                   break;
                 case 0x3c79388a:
                   if (str.equals("product_type")) {
                      i1 = 6;
                   }else {
                   }
                   break;
                 case 0x578e6ad1:
                   if (str.equals("current_user")) {
                      i1 = 7;
                   }else {
                   }
                   break;
                 case 0x58475cf6:
                   if (str.equals("country_code")) {
                      i1 = 8;
                   }else {
                   }
                   break;
                 case 0x69bb3d18:
                   if (str.equals("payment_state")) {
                      i1 = 9;
                   }else {
                   }
                   break;
                 default:
                   i1 = -1;
             }
             switch (i1){
                 case 0:
                   p0.D0();
                   b = this._deserializeboolean(p0, p1);
                   break;
                 case 1:
                   p0.D0();
                   b2 = this._deserializeboolean(p0, p1);
                   break;
                 case 2:
                   p0.D0();
                   b4 = this._deserializeboolean(p0, p1);
                   break;
                 case 3:
                   p0.D0();
                   i = this._deserializeint(p0, p1);
                   break;
                 case 4:
                   p0.D0();
                   b3 = this._deserializeboolean(p0, p1);
                   break;
                 case 5:
                   p0.D0();
                   b1 = this._deserializeboolean(p0, p1);
                   break;
                 case 6:
                   p0.D0();
                   sessionState4 = this.deserializeString(p0, p1);
                   break;
                 case 7:
                   p0.D0();
                   sessionState1 = this.deserializeString(p0, p1);
                   break;
                 case 8:
                   p0.D0();
                   sessionState2 = this.deserializeString(p0, p1);
                   break;
                 case 9:
                   p0.D0();
                   sessionState3 = this.deserializeString(p0, p1);
                   break;
                 default:
                   p0.D0();
                   p0.E0();
             }
          }
       }
       return SessionState.create(sessionState1, b, b1, b2, i, sessionState2, b3, b4, sessionState3, sessionState4);
    }
    public String deserializeString(eg3 p0,u91 p1){
       if (p0.j0() == qg3.H) {
          return null;
       }
       return this._parseString(p0, p1);
    }
    public boolean isCachable(){
       return true;
    }
}
