package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$OperationAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.b;
import java.lang.Object;
import p.if5;
import java.lang.String;
import p.co5;
import com.squareup.moshi.i;
import p.nx0;
import java.lang.Enum;

public final class CosmosTypeAdapterFactory$OperationAdapter extends JsonAdapter	// class@000b30 from classes.dex
{

    public void CosmosTypeAdapterFactory$OperationAdapter(){
       super();
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public if5 fromJson(b p0){
       co5.o(p0, "reader");
       String str = p0.o0();
       if5 a = if5.a;
       if (str != null) {
          int i = -1;
          switch (str.hashCode()){
              case 0xa0f98e08:
                if (str.equals("enqueue")) {
                   i = 0;
                }
                break;
              case 0x34af1a:
                if (str.equals("push")) {
                   i = 1;
                }
                break;
              case 0x413cb2b4:
                if (str.equals("replace")) {
                   i = 2;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                a = if5.b;
                break;
              case 1:
                a = if5.c;
                break;
              case 2:
              default:
          }
       }
       return a;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,if5 p1){
       co5.o(p0, "writer");
       int i = (p1 == null)? -1: nx0.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                p0.y0("replace");
             }
          }else {
             p0.y0("enqueue");
          }
       }else {
          p0.y0("push");
       }
       return;
    }
}
