package com.spotify.localfiles.mediastore.MediaStoreReader;
import android.content.Context;
import p.s54;
import p.f45;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.ContentResolver;
import android.database.Cursor;
import p.av6;
import java.lang.Integer;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import p.ye7;
import java.util.List;
import java.util.Collection;
import android.os.Build$VERSION;
import android.media.MediaMetadataRetriever;
import p.mn5;
import p.k11;
import com.spotify.localfiles.proto.a;
import com.spotify.localfiles.proto.LocalFile;
import com.spotify.localfiles.proto.b;
import com.spotify.localfiles.proto.LocalFile$Metadata;
import android.content.ContentUris;
import com.spotify.localfiles.proto.c;
import com.google.protobuf.b;
import com.google.protobuf.c;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import com.spotify.localfiles.proto.QueryResult;
import android.provider.MediaStore$Audio$Media;
import p.ll1;
import p.q54;
import p.r54;
import java.lang.Long;
import p.zf2;
import java.util.Iterator;
import java.lang.Iterable;
import android.database.ContentObserver;
import p.iz7;
import java.lang.Runnable;
import android.os.Handler;
import android.content.Intent;
import java.io.File;

public final class MediaStoreReader	// class@000983 from classes.dex
{
    private final ContentResolver contentResolver;
    private final Context context;
    private q54 observedQueries;
    private final f45 openedAudioFiles;
    private final s54 options;

    public void MediaStoreReader(Context p0,s54 p1,f45 p2){
       co5.o(p0, "context");
       co5.o(p1, "options");
       co5.o(p2, "openedAudioFiles");
       super();
       this.context = p0;
       this.contentResolver = p0.getContentResolver();
    }
    public static final void access$freeHandle(MediaStoreReader p0,long p1){
       p0.freeHandle(p1);
    }
    public static final void access$onChange(MediaStoreReader p0,long p1){
       p0.onChange(p1);
    }
    public static final void access$prepareForShutdown(MediaStoreReader p0,long p1){
       p0.prepareForShutdown(p1);
    }
    private final String displayName(Cursor p0,int p1){
       String str = ((str = p0.getString(p1)) != null)? av6.J0(str, '.'): null;
       return str;
    }
    private final Integer duration(Cursor p0,int p1){
       Integer integer = (p0.getType(p1) == 1)? Integer.valueOf((p0.getInt(p1) / 1000)): null;
       return integer;
    }
    private native final void freeHandle(long p0);
    private native final void onChange(long p0);
    private native final void prepareForShutdown(long p0);
    private final Cursor query(Uri p0,boolean p1){
       int sDK_INT;
       if (p1) {
          String documentId = (DocumentsContract.isDocumentUri(this.context, p0))? DocumentsContract.getDocumentId(p0): DocumentsContract.getTreeDocumentId(p0);
          DocumentsContract.buildChildDocumentsUriUsingTree(p0, documentId);
       }
       String[] stringArray = new String[]{"_id","_display_name","is_alarm","is_music","is_notification","is_podcast","is_ringtone","title","duration"};
       ArrayList uArrayList = ye7.M(stringArray);
       if (p1) {
          String[] stringArray1 = new String[]{"document_id","mime_type"};
          uArrayList.addAll(ye7.K(stringArray1));
       }
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          String[] stringArray2 = new String[]{"is_audiobook","is_pending"};
          uArrayList.addAll(ye7.K(stringArray2));
       }
       if (sDK_INT >= 30) {
          uArrayList.addAll(ye7.J("is_trashed"));
       }
       uArrayList = new ArrayList();
       throw null;
    }
    private final void queryUri(MediaMetadataRetriever p0,mn5 p1,Uri p2){
       Cursor uCursor;
       boolean b1;
       int i;
       String str2;
       Integer integer;
       MediaStoreReader mediaStoreRe = this;
       mn5 omn5 = p1;
       boolean b = k11.A(p2);
       Uri uri = p2;
       if ((uCursor = mediaStoreRe.query(uri, b)) == null) {
          return;
       }
       int columnIndex = uCursor.getColumnIndex("document_id");
       int columnIndex1 = uCursor.getColumnIndex("mime_type");
       int columnIndex2 = uCursor.getColumnIndex("_id");
       int columnIndex3 = uCursor.getColumnIndex("_display_name");
       int columnIndex4 = uCursor.getColumnIndex("title");
       int columnIndex5 = uCursor.getColumnIndex("duration");
       a uoa = LocalFile.h();
       b uob = LocalFile$Metadata.k();
       MediaMetadataRetriever mediaMetadat = p0;
       Uri uri1 = uri;
       while (uCursor.moveToNext()) {
          if (b) {
             b1 = b;
             uri = DocumentsContract.buildDocumentUriUsingTree(uri1, uCursor.getString(columnIndex));
             if (co5.c(uCursor.getString(columnIndex1), "vnd.android.document/directory")) {
                co5.l(uri, "documentUri");
                mediaStoreRe.queryUri(mediaMetadat, omn5, uri);
                i = columnIndex;
             label_0131 :
                b = b1;
                columnIndex = i;
             }else {
                uri1 = uri;
             }
          }else {
             b1 = b;
             if (!DocumentsContract.isDocumentUri(mediaStoreRe.context, uri1)) {
                str2 = (uCursor.getType(columnIndex2) == 1)? 1: 0;
                if (str2) {
                   uri1 = ContentUris.withAppendedId(uri1, uCursor.getLong(columnIndex2));
                }
             }
          }
          uoa.d(uri1.toString());
          mediaMetadat.setDataSource(mediaStoreRe.context, uri1);
          String str = mediaMetadat.extractMetadata(7);
          String str1 = mediaMetadat.extractMetadata(1);
          str2 = mediaMetadat.extractMetadata(2);
          i = columnIndex;
          String str3 = mediaMetadat.extractMetadata(9);
          co5.i(str3);
          columnIndex = Integer.parseInt(str3) / 1000;
          int i1 = (p0.getEmbeddedPicture() != null)? 1: 0;
          if (str == null && ((str = mediaStoreRe.title(uCursor, columnIndex4)) == null && (str = mediaStoreRe.displayName(uCursor, columnIndex3)) == null)) {
             str = uri1.getLastPathSegment();
          }
          uob.g(str);
          str = "";
          if (str1 == null) {
             str1 = str;
          }
          uob.c(str1);
          if (str2 == null) {
             str2 = str;
          }
          uob.d(str2);
          if ((integer = mediaStoreRe.duration(uCursor, columnIndex5)) != null) {
             columnIndex = integer.intValue();
          }
          uob.e(columnIndex);
          c b2 = (i1)? c.b: c.c;
          uob.f(b2);
          uoa.c(uob.build());
          omn5.c(uoa);
          mediaMetadat = p0;
          uri1 = p2;
          goto label_0131 ;
       }
       eb3.d(uCursor, null);
       return;
    }
    private final String title(Cursor p0,int p1){
       String str;
       if (p0.getType(p1) == 3) {
          str = p0.getString(p1);
          co5.l(str, "cursor.getString\(titleColumn\)");
          str = this.transformUnknown(str);
       }else {
          str = null;
       }
       return str;
    }
    private final String transformUnknown(String p0){
       if (co5.c(p0, "<unknown>")) {
          p0 = "";
       }
       return p0;
    }
    public final byte[] runQuery(){
       QueryResult.g();
       MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
       throw null;
    }
    public final void startListening(long p0){
       Cursor uCursor;
       try{
          Uri eXTERNAL_CON = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
          co5.l(eXTERNAL_CON, "EXTERNAL_CONTENT_URI");
          List list = ((uCursor = this.query(eXTERNAL_CON, false)) != null)? ye7.J(uCursor): ll1.a;
          this.observedQueries = new q54(list, p0, new r54(this, false));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void stopListening(){
       MediaStoreReader tobservedQue;
       if ((tobservedQue = this.observedQueries) != null) {
          new r54(this, 1).invoke(Long.valueOf(tobservedQue.b));
       }
       if ((tobservedQue = this.observedQueries) != null) {
          r54 or54 = new r54(this, 2);
          Iterator iterator = tobservedQue.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().unregisterContentObserver(tobservedQue);
          }
          tobservedQue.d.post(new iz7(or54, 12, tobservedQue));
       }
       this.observedQueries = null;
       return;
    }
    public final void triggerScan(String p0){
       co5.o(p0, "path");
       Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
       intent.setData(Uri.fromFile(new File(p0)));
       this.context.sendBroadcast(intent, null);
    }
}
