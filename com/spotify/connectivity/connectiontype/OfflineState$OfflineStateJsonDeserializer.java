package com.spotify.connectivity.connectiontype.OfflineState$OfflineStateJsonDeserializer;
import p.if3;
import p.eg3;
import p.u91;
import com.spotify.connectivity.connectiontype.OfflineState;
import p.ko4;
import p.zf3;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import java.lang.IllegalStateException;

public class OfflineState$OfflineStateJsonDeserializer extends if3	// class@0006a6 from classes.dex
{

    public void OfflineState$OfflineStateJsonDeserializer(){
       super();
    }
    public OfflineState deserialize(eg3 p0,u91 p1){
       ko4 oko4;
       OfflineState$State oFFLINE;
       if ((oko4 = p0.g0()) == null) {
          throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
       }
       String str = oko4.a(p0, zf3.class).b("connection").b("status").a();
       switch (str.hashCode()){
           case 0xa3b20de3:
             if (str.equals("offline")) {
                str = 3;
             }else {
             label_0050 :
                oFFLINE = -1;
             }
             break;
           case 0xc3aab653:
             if (str.equals("online")) {
                oFFLINE = 0;
             }else {
                goto label_0050 ;
             }
             break;
           case 0xe6b19e7d:
             if (str.equals("forced_offline")) {
                oFFLINE = 1;
             }else {
                goto label_0050 ;
             }
             break;
           case 0xfd1aa92b:
             if (str.equals("reconnecting")) {
                oFFLINE = 2;
             }else {
                goto label_0050 ;
             }
             break;
           default:
             goto label_0050 ;
       }
       if (str) {
          if (str != 1) {
             oFFLINE = (str != 2)? OfflineState$State.OFFLINE: OfflineState$State.RECONNECTING;
          }else {
             oFFLINE = OfflineState$State.FORCED_OFFLINE;
          }
       }else {
          oFFLINE = OfflineState$State.ONLINE;
       }
       return OfflineState.create(oFFLINE);
    }
    public Object deserialize(eg3 p0,u91 p1){
       return this.deserialize(p0, p1);
    }
}
