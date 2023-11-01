package com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.Request$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import p.co5;
import java.util.LinkedHashMap;
import java.lang.IllegalArgumentException;
import p.kg4;

public class Request	// class@00056d from classes.dex
{
    private String action;
    private byte[] body;
    private Map headers;
    private String uri;
    public static final Request$Companion Companion;
    public static final String DELETE;
    public static final byte[] EMPTY_BODY;
    public static final String GET;
    public static final String POST;
    public static final String PUT;
    public static final String SUB;

    static {
       Request.Companion = new Request$Companion(null);
       byte[] uobyteArray = new byte[0];
       Request.EMPTY_BODY = uobyteArray;
    }
    public void Request(){
       super();
       this.setAction(null);
       this.setUri(null);
       this.setHeaders(null);
       this.setBody(null);
    }
    public void Request(String p0,String p1){
       co5.o(p0, "action");
       co5.o(p1, "uri");
       super(p0, p1, new LinkedHashMap(), Request.EMPTY_BODY);
    }
    public void Request(String p0,String p1,Map p2,byte[] p3){
       super();
       if (p1 == null) {
          throw new IllegalArgumentException("URI cannot be null");
       }
       if (!p1.length()) {
          throw new IllegalArgumentException("URI cannot be empty");
       }
       this.setAction(p0);
       this.setUri(p1);
       this.setHeaders(p2);
       this.setBody(p3);
       return;
    }
    public void Request(String p0,String p1,byte[] p2){
       co5.o(p0, "action");
       co5.o(p1, "uri");
       co5.o(p2, "body");
       super(p0, p1, new LinkedHashMap(), p2);
    }
    public String getAction(){
       return this.action;
    }
    public byte[] getBody(){
       return this.body;
    }
    public Map getHeaders(){
       return this.headers;
    }
    public String getUri(){
       return this.uri;
    }
    public void setAction(String p0){
       this.action = p0;
    }
    public void setBody(byte[] p0){
       this.body = p0;
    }
    public void setHeaders(Map p0){
       this.headers = p0;
    }
    public void setUri(String p0){
       this.uri = p0;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.getAction(),this.getUri()};
       return kg4.q(objArray, 2, "Request{mAction=\'%s\', mUri=\'%s\'}", "format\(format, *args\)");
    }
}
