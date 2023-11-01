package com.spotify.messages.EventSenderStats2NonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.xb3;
import p.ac3;
import p.cv1;
import com.google.protobuf.b;
import p.i80;
import p.f2;
import p.db3;
import p.jv3;
import p.h80;
import java.lang.Object;
import java.util.List;
import p.r75;
import java.util.TreeSet;
import java.lang.Iterable;
import com.google.protobuf.a;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class EventSenderStats2NonAuth extends c implements u74	// class@0009ff from classes.dex
{
    private ac3 dropListCountsTotal_;
    private ac3 dropListCountsUnreported_;
    private xb3 dropListEventNameIndex_;
    private xb3 dropListNumEntriesPerSequenceId_;
    private bc3 eventNames_;
    private xb3 lossStatsEventNameIndex_;
    private xb3 lossStatsNumEntriesPerSequenceId_;
    private ac3 lossStatsSequenceNumberMins_;
    private ac3 lossStatsSequenceNumberNexts_;
    private ac3 lossStatsStorageSizes_;
    private ac3 ratelimiterStatsDropCount_;
    private xb3 ratelimiterStatsEventNameIndex_;
    private bc3 sequenceIds_;
    private ac3 statesListDeletedCountsTotal_;
    private ac3 statesListDeliveredCountsTotal_;
    private ac3 statesListDroppedCountsTotal_;
    private ac3 statesListEnteredCountsTotal_;
    private xb3 statesListEventNameIndex_;
    private ac3 statesListPersistedCountsTotal_;
    private ac3 statesListRejectedBackendCountsTotal_;
    private ac3 statesListRejectedClientCountsTotal_;
    private static final EventSenderStats2NonAuth DEFAULT_INSTANCE;
    public static final int DROP_LIST_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int DROP_LIST_COUNTS_UNREPORTED_FIELD_NUMBER;
    public static final int DROP_LIST_EVENT_NAME_INDEX_FIELD_NUMBER;
    public static final int DROP_LIST_NUM_ENTRIES_PER_SEQUENCE_ID_FIELD_NUMBER;
    public static final int EVENT_NAMES_FIELD_NUMBER;
    public static final int LOSS_STATS_EVENT_NAME_INDEX_FIELD_NUMBER;
    public static final int LOSS_STATS_NUM_ENTRIES_PER_SEQUENCE_ID_FIELD_NUMBER;
    public static final int LOSS_STATS_SEQUENCE_NUMBER_MINS_FIELD_NUMBER;
    public static final int LOSS_STATS_SEQUENCE_NUMBER_NEXTS_FIELD_NUMBER;
    public static final int LOSS_STATS_STORAGE_SIZES_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RATELIMITER_STATS_DROP_COUNT_FIELD_NUMBER;
    public static final int RATELIMITER_STATS_EVENT_NAME_INDEX_FIELD_NUMBER;
    public static final int SEQUENCE_IDS_FIELD_NUMBER;
    public static final int STATES_LIST_DELETED_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int STATES_LIST_DELIVERED_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int STATES_LIST_DROPPED_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int STATES_LIST_ENTERED_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int STATES_LIST_EVENT_NAME_INDEX_FIELD_NUMBER;
    public static final int STATES_LIST_PERSISTED_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int STATES_LIST_REJECTED_BACKEND_COUNTS_TOTAL_FIELD_NUMBER;
    public static final int STATES_LIST_REJECTED_CLIENT_COUNTS_TOTAL_FIELD_NUMBER;

    static {
       EventSenderStats2NonAuth uEventSender = new EventSenderStats2NonAuth();
       EventSenderStats2NonAuth.DEFAULT_INSTANCE = uEventSender;
       c.registerDefaultInstance(EventSenderStats2NonAuth.class, uEventSender);
    }
    private void EventSenderStats2NonAuth(){
       super();
       this.sequenceIds_ = c.emptyProtobufList();
       this.eventNames_ = c.emptyProtobufList();
       this.lossStatsNumEntriesPerSequenceId_ = c.emptyIntList();
       this.lossStatsEventNameIndex_ = c.emptyIntList();
       this.lossStatsStorageSizes_ = c.emptyLongList();
       this.lossStatsSequenceNumberMins_ = c.emptyLongList();
       this.lossStatsSequenceNumberNexts_ = c.emptyLongList();
       this.ratelimiterStatsEventNameIndex_ = c.emptyIntList();
       this.ratelimiterStatsDropCount_ = c.emptyLongList();
       this.dropListNumEntriesPerSequenceId_ = c.emptyIntList();
       this.dropListEventNameIndex_ = c.emptyIntList();
       this.dropListCountsTotal_ = c.emptyLongList();
       this.dropListCountsUnreported_ = c.emptyLongList();
       this.statesListEventNameIndex_ = c.emptyIntList();
       this.statesListEnteredCountsTotal_ = c.emptyLongList();
       this.statesListRejectedClientCountsTotal_ = c.emptyLongList();
       this.statesListDroppedCountsTotal_ = c.emptyLongList();
       this.statesListPersistedCountsTotal_ = c.emptyLongList();
       this.statesListRejectedBackendCountsTotal_ = c.emptyLongList();
       this.statesListDeliveredCountsTotal_ = c.emptyLongList();
       this.statesListDeletedCountsTotal_ = c.emptyLongList();
    }
    public static cv1 R(){
       return EventSenderStats2NonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static EventSenderStats2NonAuth S(i80 p0){
       return c.parseFrom(EventSenderStats2NonAuth.DEFAULT_INSTANCE, p0);
    }
    public static EventSenderStats2NonAuth e(){
       return EventSenderStats2NonAuth.DEFAULT_INSTANCE;
    }
    public static void f(EventSenderStats2NonAuth p0,int p1){
       EventSenderStats2NonAuth lossStatsNum = p0.lossStatsNumEntriesPerSequenceId_;
       if (lossStatsNum.a == null) {
          p0.lossStatsNumEntriesPerSequenceId_ = c.mutableCopy(lossStatsNum);
       }
       p0.lossStatsNumEntriesPerSequenceId_.c(p1);
       return;
    }
    public static void g(EventSenderStats2NonAuth p0,int p1){
       EventSenderStats2NonAuth lossStatsEve = p0.lossStatsEventNameIndex_;
       if (lossStatsEve.a == null) {
          p0.lossStatsEventNameIndex_ = c.mutableCopy(lossStatsEve);
       }
       p0.lossStatsEventNameIndex_.c(p1);
       return;
    }
    public static void h(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth lossStatsSto = p0.lossStatsStorageSizes_;
       if (lossStatsSto.a == null) {
          p0.lossStatsStorageSizes_ = c.mutableCopy(lossStatsSto);
       }
       p0.lossStatsStorageSizes_.c(p1);
       return;
    }
    public static void i(EventSenderStats2NonAuth p0,h80 p1){
       p0.getClass();
       EventSenderStats2NonAuth sequenceIds_ = p0.sequenceIds_;
       if (sequenceIds_.a == null) {
          p0.sequenceIds_ = c.mutableCopy(sequenceIds_);
       }
       p0.sequenceIds_.add(p1);
       return;
    }
    public static void j(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth lossStatsSeq = p0.lossStatsSequenceNumberMins_;
       if (lossStatsSeq.a == null) {
          p0.lossStatsSequenceNumberMins_ = c.mutableCopy(lossStatsSeq);
       }
       p0.lossStatsSequenceNumberMins_.c(p1);
       return;
    }
    public static void k(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth lossStatsSeq = p0.lossStatsSequenceNumberNexts_;
       if (lossStatsSeq.a == null) {
          p0.lossStatsSequenceNumberNexts_ = c.mutableCopy(lossStatsSeq);
       }
       p0.lossStatsSequenceNumberNexts_.c(p1);
       return;
    }
    public static void l(EventSenderStats2NonAuth p0,int p1){
       EventSenderStats2NonAuth ratelimiterS = p0.ratelimiterStatsEventNameIndex_;
       if (ratelimiterS.a == null) {
          p0.ratelimiterStatsEventNameIndex_ = c.mutableCopy(ratelimiterS);
       }
       p0.ratelimiterStatsEventNameIndex_.c(p1);
       return;
    }
    public static void m(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth ratelimiterS = p0.ratelimiterStatsDropCount_;
       if (ratelimiterS.a == null) {
          p0.ratelimiterStatsDropCount_ = c.mutableCopy(ratelimiterS);
       }
       p0.ratelimiterStatsDropCount_.c(p1);
       return;
    }
    public static void n(EventSenderStats2NonAuth p0,int p1){
       EventSenderStats2NonAuth statesListEv = p0.statesListEventNameIndex_;
       if (statesListEv.a == null) {
          p0.statesListEventNameIndex_ = c.mutableCopy(statesListEv);
       }
       p0.statesListEventNameIndex_.c(p1);
       return;
    }
    public static void o(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListEn = p0.statesListEnteredCountsTotal_;
       if (statesListEn.a == null) {
          p0.statesListEnteredCountsTotal_ = c.mutableCopy(statesListEn);
       }
       p0.statesListEnteredCountsTotal_.c(p1);
       return;
    }
    public static void p(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListRe = p0.statesListRejectedClientCountsTotal_;
       if (statesListRe.a == null) {
          p0.statesListRejectedClientCountsTotal_ = c.mutableCopy(statesListRe);
       }
       p0.statesListRejectedClientCountsTotal_.c(p1);
       return;
    }
    public static r75 parser(){
       return EventSenderStats2NonAuth.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListDr = p0.statesListDroppedCountsTotal_;
       if (statesListDr.a == null) {
          p0.statesListDroppedCountsTotal_ = c.mutableCopy(statesListDr);
       }
       p0.statesListDroppedCountsTotal_.c(p1);
       return;
    }
    public static void r(EventSenderStats2NonAuth p0,TreeSet p1){
       EventSenderStats2NonAuth eventNames_ = p0.eventNames_;
       if (eventNames_.a == null) {
          p0.eventNames_ = c.mutableCopy(eventNames_);
       }
       a.addAll(p1, p0.eventNames_);
       return;
    }
    public static void s(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListPe = p0.statesListPersistedCountsTotal_;
       if (statesListPe.a == null) {
          p0.statesListPersistedCountsTotal_ = c.mutableCopy(statesListPe);
       }
       p0.statesListPersistedCountsTotal_.c(p1);
       return;
    }
    public static void t(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListRe = p0.statesListRejectedBackendCountsTotal_;
       if (statesListRe.a == null) {
          p0.statesListRejectedBackendCountsTotal_ = c.mutableCopy(statesListRe);
       }
       p0.statesListRejectedBackendCountsTotal_.c(p1);
       return;
    }
    public static void u(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListDe = p0.statesListDeliveredCountsTotal_;
       if (statesListDe.a == null) {
          p0.statesListDeliveredCountsTotal_ = c.mutableCopy(statesListDe);
       }
       p0.statesListDeliveredCountsTotal_.c(p1);
       return;
    }
    public static void v(EventSenderStats2NonAuth p0,long p1){
       EventSenderStats2NonAuth statesListDe = p0.statesListDeletedCountsTotal_;
       if (statesListDe.a == null) {
          p0.statesListDeletedCountsTotal_ = c.mutableCopy(statesListDe);
       }
       p0.statesListDeletedCountsTotal_.c(p1);
       return;
    }
    public final ac3 A(){
       return this.lossStatsSequenceNumberMins_;
    }
    public final ac3 B(){
       return this.lossStatsSequenceNumberNexts_;
    }
    public final ac3 C(){
       return this.lossStatsStorageSizes_;
    }
    public final int D(){
       return this.ratelimiterStatsDropCount_.c;
    }
    public final ac3 E(){
       return this.ratelimiterStatsDropCount_;
    }
    public final xb3 F(){
       return this.ratelimiterStatsEventNameIndex_;
    }
    public final int G(){
       return this.sequenceIds_.size();
    }
    public final bc3 H(){
       return this.sequenceIds_;
    }
    public final ac3 I(){
       return this.statesListDeletedCountsTotal_;
    }
    public final ac3 J(){
       return this.statesListDeliveredCountsTotal_;
    }
    public final ac3 K(){
       return this.statesListDroppedCountsTotal_;
    }
    public final ac3 L(){
       return this.statesListEnteredCountsTotal_;
    }
    public final int M(){
       return this.statesListEventNameIndex_.c;
    }
    public final xb3 N(){
       return this.statesListEventNameIndex_;
    }
    public final ac3 O(){
       return this.statesListPersistedCountsTotal_;
    }
    public final ac3 P(){
       return this.statesListRejectedBackendCountsTotal_;
    }
    public final ac3 Q(){
       return this.statesListRejectedClientCountsTotal_;
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
             Object[] objArray = new Object[21];
             objArray[0] = "sequenceIds_";
             objArray[b] = "eventNames_";
             objArray[2] = "lossStatsNumEntriesPerSequenceId_";
             objArray[3] = "lossStatsEventNameIndex_";
             objArray[4] = "lossStatsStorageSizes_";
             objArray[5] = "lossStatsSequenceNumberMins_";
             objArray[6] = "lossStatsSequenceNumberNexts_";
             objArray[7] = "ratelimiterStatsEventNameIndex_";
             objArray[8] = "ratelimiterStatsDropCount_";
             objArray[9] = "dropListNumEntriesPerSequenceId_";
             objArray[10] = "dropListEventNameIndex_";
             objArray[11] = "dropListCountsTotal_";
             objArray[12] = "dropListCountsUnreported_";
             objArray[13] = "statesListEventNameIndex_";
             objArray[14] = "statesListEnteredCountsTotal_";
             objArray[15] = "statesListRejectedClientCountsTotal_";
             objArray[16] = "statesListDroppedCountsTotal_";
             objArray[17] = "statesListPersistedCountsTotal_";
             objArray[18] = "statesListRejectedBackendCountsTotal_";
             objArray[19] = "statesListDeliveredCountsTotal_";
             objArray[20] = "statesListDeletedCountsTotal_";
             return c.newMessageInfo(EventSenderStats2NonAuth.DEFAULT_INSTANCE, "\x01\x15\xff\x02\xff\x02\xff\x02\xff\x02\x01\x16\x15\xff\x02\xff\x02\x15\xff\x02\xff\x02\x01\x1c\x02\x1a\x03\x16\x04\x16\x05\x14\x06\x14\x07\x14\b\x16\t\x14\n\x16\x0b\x16\f\x14\r\x14\x0f\x16\x10\x14\x11\x14\x12\x14\x13\x14\x14\x14\x15\x14\x16\x14", objArray);
           case 3:
             return new EventSenderStats2NonAuth();
           case 4:
             return new cv1();
           case 5:
             return EventSenderStats2NonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EventSenderStats2NonAuth.PARSER) == null) {
                _monitor_enter(EventSenderStats2NonAuth.class);
                if ((pARSER = EventSenderStats2NonAuth.PARSER) == null) {
                   pARSER = new ii2(EventSenderStats2NonAuth.DEFAULT_INSTANCE);
                   EventSenderStats2NonAuth.PARSER = pARSER;
                }
                _monitor_exit(EventSenderStats2NonAuth.class);
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
    public final bc3 w(){
       return this.eventNames_;
    }
    public final xb3 x(){
       return this.lossStatsEventNameIndex_;
    }
    public final int y(){
       return this.lossStatsNumEntriesPerSequenceId_.c;
    }
    public final xb3 z(){
       return this.lossStatsNumEntriesPerSequenceId_;
    }
}
