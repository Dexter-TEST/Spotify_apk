package com.spotify.core.http.HttpRequest;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import p.co5;
import java.util.Arrays;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class HttpRequest	// class@000875 from classes.dex
{
    private final byte[] body;
    private final byte[] headers;
    private final String method;
    private final String url;

    public void HttpRequest(String p0,String p1,byte[] p2,byte[] p3){
       super();
       this.url = p0;
       this.method = p1;
       this.headers = p2;
       this.body = p3;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       HttpRequest httpRequest = HttpRequest.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(httpRequest, class)) {
          return false;
       }else if(p0 != null){
          if ((httpRequest = this.url) != null) {
             if (!httpRequest.equals(p0.url)) {
             label_002b :
                httpRequest = 1;
             label_002e :
                if (httpRequest) {
                   return false;
                }else if((httpRequest = this.method) != null){
                   if (!httpRequest.equals(p0.method)) {
                   label_0042 :
                      httpRequest = 1;
                   label_0045 :
                      if (httpRequest) {
                         return false;
                      }else if(!Arrays.equals(this.headers, p0.headers)){
                         return false;
                      }else if(!Arrays.equals(this.body, p0.body)){
                         return false;
                      }else {
                         return b;
                      }
                   }
                }else if(p0.method != null){
                   goto label_0042 ;
                }
                httpRequest = 0;
                goto label_0045 ;
             }
          }else if(p0.url != null){
             goto label_002b ;
          }
          httpRequest = 0;
          goto label_002e ;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type com.spotify.core.http.HttpRequest");
       }
    }
    public final byte[] getBody(){
       return this.body;
    }
    public final byte[] getHeaders(){
       return this.headers;
    }
    public final String getMethod(){
       return this.method;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       HttpRequest tmethod;
       HttpRequest turl = this.url;
       int i = 0;
       int i1 = (turl != null)? turl.hashCode(): 0;
       i1 = i1 * 31;
       if ((tmethod = this.method) != null) {
          i = tmethod.hashCode();
       }
       return (Arrays.hashCode(this.body) + ((Arrays.hashCode(this.headers) + ((i1 + i) * 31)) * 31));
    }
    public String toString(){
       String str = Arrays.toString(this.headers);
       co5.l(str, "toString\(this\)");
       StringBuilder str1 = "HttpRequest{url=\'"+this.url+"\', method=\'"+this.method+"\', mHeaders="+str;
       str = Arrays.toString(this.body);
       co5.l(str, "toString\(this\)");
       str1 = str1+", mBody="+str;
       return str1+'}';
    }
}
