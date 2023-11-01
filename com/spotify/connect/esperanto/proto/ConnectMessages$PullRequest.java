package com.spotify.connect.esperanto.proto.ConnectMessages$PullRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.uo0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$PullRequest extends c implements u74	// class@00059c from classes.dex
{
    private CommonMessages$LoggingParams loggingParams_;
    private static final ConnectMessages$PullRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       ConnectMessages$PullRequest pullRequest = new ConnectMessages$PullRequest();
       ConnectMessages$PullRequest.DEFAULT_INSTANCE = pullRequest;
       c.registerDefaultInstance(ConnectMessages$PullRequest.class, pullRequest);
    }
    private void ConnectMessages$PullRequest(){
       super();
    }
    public static ConnectMessages$PullRequest e(){
       return ConnectMessages$PullRequest.DEFAULT_INSTANCE;
    }
    public static uo0 f(){
       return ConnectMessages$PullRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ConnectMessages$PullRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[b];
             objArray[0] = "loggingParams_";
             return c.newMessageInfo(ConnectMessages$PullRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t", objArray);
           case 3:
             return new ConnectMessages$PullRequest();
           case 4:
             return new uo0();
           case 5:
             return ConnectMessages$PullRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$PullRequest.PARSER) == null) {
                _monitor_enter(ConnectMessages$PullRequest.class);
                if ((pARSER = ConnectMessages$PullRequest.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$PullRequest.DEFAULT_INSTANCE);
                   ConnectMessages$PullRequest.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$PullRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
