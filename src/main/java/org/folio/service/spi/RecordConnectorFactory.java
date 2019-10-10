package org.folio.service.spi;

import io.vertx.core.Vertx;

import org.folio.service.RecordConnectorService;

public interface RecordConnectorFactory {

  RecordConnectorService create(Vertx vertx);

}
