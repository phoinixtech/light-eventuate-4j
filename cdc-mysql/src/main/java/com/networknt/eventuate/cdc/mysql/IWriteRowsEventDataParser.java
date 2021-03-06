package com.networknt.eventuate.cdc.mysql;

import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;
import com.networknt.eventuate.cdc.common.BinLogEvent;

import java.io.IOException;


public interface IWriteRowsEventDataParser<M extends BinLogEvent> {
  M parseEventData(WriteRowsEventData eventData, String binlogFilename, long position) throws IOException;
}
