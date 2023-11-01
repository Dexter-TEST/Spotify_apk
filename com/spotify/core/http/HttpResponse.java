package com.spotify.core.http.HttpResponse;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class HttpResponse	// class@000876 from classes.dex
{
    private final String headers;
    private final int status;
    private final String url;

    public void HttpResponse(int p0,String p1,String p2){
       co5.o(p1, "url");
       co5.o(p2, "headers");
       super();
       this.status = p0;
       this.url = p1;
       this.headers = p2;
    }
    public boolean equals(Object p0){
       int i;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       HttpResponse httpResponse = HttpResponse.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(httpResponse, class)) {
          return false;
       }else if(p0 != null){
          if (this.status != p0.status) {
             return false;
          }else if((httpResponse = this.url) != null){
             if (!httpResponse.equals(p0.url)) {
             label_0032 :
                httpResponse = 1;
             label_0035 :
                if (httpResponse) {
                   return false;
                }else {
                   httpResponse = this.headers;
                   p0 = p0.headers;
                   if (httpResponse != null) {
                      if (!httpResponse.equals(p0)) {
                      label_0047 :
                         i = 1;
                      label_004a :
                         if (i) {
                            return false;
                         }else {
                            return b;
                         }
                      }
                   }else if(p0 != null){
                      goto label_0047 ;
                   }
                   i = 0;
                   goto label_004a ;
                }
             }
          }else if(p0.url != null){
             goto label_0032 ;
          }
          httpResponse = 0;
          goto label_0035 ;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type com.spotify.core.http.HttpResponse");
       }
    }
    public final String getHeaders(){
       return this.headers;
    }
    public final int getStatus(){
       return this.status;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       int i = this.status * 31;
       HttpResponse turl = this.url;
       int i1 = 0;
       int i2 = (turl != null)? turl.hashCode(): 0;
       i = (i + i2) * 31;
       if ((turl = this.headers) != null) {
          i1 = turl.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return en6.p("HttpResponse{status="+this.status+", url=\'"+this.url+"\', headers=\'", this.headers, "\'}");
    }
}
