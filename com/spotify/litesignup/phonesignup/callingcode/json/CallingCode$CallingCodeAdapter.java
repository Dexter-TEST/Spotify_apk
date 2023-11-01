package com.spotify.litesignup.phonesignup.callingcode.json.CallingCode$CallingCodeAdapter;
import java.lang.Object;
import com.squareup.moshi.b;
import p.la0;
import java.lang.String;
import p.co5;
import java.lang.IllegalArgumentException;
import p.fv1;
import com.squareup.moshi.i;
import java.io.IOException;

public final class CallingCode$CallingCodeAdapter	// class@00096b from classes.dex
{

    public void CallingCode$CallingCodeAdapter(){
       super();
    }
    public final la0 read(b p0){
       co5.o(p0, "input");
       p0.f();
       String str = "";
       String str1 = str;
       while (true) {
          if (p0.T()) {
             String str2 = p0.l0();
             if (co5.c(str2, "countryCode")) {
                str = p0.o0();
                co5.l(str, "input.nextString\(\)");
             }else if(co5.c(str2, "callingCode")){
                str1 = p0.o0();
                co5.l(str1, "input.nextString\(\)");
             }else {
                break ;
             }
          }else {
             p0.y();
             return fv1.s(str, str1);
          }
       }
       throw new IllegalArgumentException("Unknown CallingCode field!");
    }
    public final void write(i p0,la0 p1){
       co5.o(p0, "out");
       throw new IOException();
    }
}
