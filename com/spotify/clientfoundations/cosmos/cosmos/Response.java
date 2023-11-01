package com.spotify.clientfoundations.cosmos.cosmos.Response;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.nio.charset.Charset;
import com.spotify.clientfoundations.cosmos.cosmos.ResponseKt;
import java.lang.StringBuilder;

public class Response	// class@00056f from classes.dex
{
    private final byte[] body;
    private final Map headers;
    private final int status;
    private final String uri;

    public void Response(int p0,String p1,Map p2,byte[] p3){
       super();
       this.status = p0;
       this.uri = p1;
       this.headers = p2;
       this.body = p3;
    }
    public byte[] getBody(){
       return this.body;
    }
    public String getBodyString(){
       byte[] body;
       String str = ((body = this.getBody()) != null)? new String(body, ResponseKt.access$getDEFAULT_CHARSET$p()): "";
       return str;
    }
    public Map getHeaders(){
       return this.headers;
    }
    public int getStatus(){
       return this.status;
    }
    public String getUri(){
       return this.uri;
    }
    public String toString(){
       return "Response{mStatus="+this.getStatus()+", mUri=\'"+this.getUri()+"\', mHeaders="+this.getHeaders()+", mBody=\'"+this.getBodyString()+"\'}";
    }
}
