package com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport$call$mapFunc$1;
import p.zf2;
import p.gi3;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import java.lang.String;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import p.co5;
import java.nio.charset.Charset;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import p.hr7;

final class CosmosTransport$call$mapFunc$1 extends gi3 implements zf2	// class@00057e from classes.dex
{
    final String $uri;
    final CosmosTransport this$0;

    public void CosmosTransport$call$mapFunc$1(CosmosTransport p0,String p1){
       this.this$0 = p0;
       this.$uri = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final byte[] invoke(Response p0){
       byte[] body;
       String str;
       co5.o(p0, "response");
       if (p0.getStatus() == 200) {
          return p0.getBody();
       }
       if ((body = p0.getBody()) != null) {
          Charset uCharset = CosmosTransport.access$getCHARSET_UTF8$p(this.this$0);
          co5.l(uCharset, "CHARSET_UTF8");
          str = new String(body, uCharset);
       }else {
          str = "";
       }
       throw new RuntimeException(hr7.a("Response for ["+this.$uri+"] returned with status code "+p0.getStatus()+": \'", str, '''));
    }
}
