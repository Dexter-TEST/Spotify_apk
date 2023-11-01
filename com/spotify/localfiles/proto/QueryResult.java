package com.spotify.localfiles.proto.QueryResult;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.localfiles.proto.LocalFile;
import java.lang.Object;
import p.f2;
import java.util.List;
import com.google.protobuf.b;
import p.mn5;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class QueryResult extends c implements u74	// class@000986 from classes.dex
{
    private bc3 files_;
    private static final QueryResult DEFAULT_INSTANCE;
    public static final int FILES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       QueryResult queryResult = new QueryResult();
       QueryResult.DEFAULT_INSTANCE = queryResult;
       c.registerDefaultInstance(QueryResult.class, queryResult);
    }
    private void QueryResult(){
       super();
       this.files_ = c.emptyProtobufList();
    }
    public static QueryResult e(){
       return QueryResult.DEFAULT_INSTANCE;
    }
    public static void f(QueryResult p0,LocalFile p1){
       p0.getClass();
       p1.getClass();
       QueryResult files_ = p0.files_;
       if (files_.a == null) {
          p0.files_ = c.mutableCopy(files_);
       }
       p0.files_.add(p1);
       return;
    }
    public static void g(){
       QueryResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return QueryResult.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"files_",LocalFile.class};
             return c.newMessageInfo(QueryResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new QueryResult();
           case 4:
             return new mn5();
           case 5:
             return QueryResult.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = QueryResult.PARSER) == null) {
                _monitor_enter(QueryResult.class);
                if ((pARSER = QueryResult.PARSER) == null) {
                   pARSER = new ii2(QueryResult.DEFAULT_INSTANCE);
                   QueryResult.PARSER = pARSER;
                }
                _monitor_exit(QueryResult.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
