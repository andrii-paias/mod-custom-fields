package org.folio.service;

import static io.vertx.core.Future.succeededFuture;

import java.util.Collections;

import io.vertx.core.Future;

import org.folio.rest.jaxrs.model.CustomField;
import org.folio.rest.jaxrs.model.CustomFieldStatisticCollection;

public final class NoOpRecordConnectorService implements RecordConnectorService {

  @Override
  public Future<CustomFieldStatisticCollection> retrieveStatistic(CustomField field, String tenantId) {
    return succeededFuture(
      new CustomFieldStatisticCollection()
        .withStats(Collections.emptyList())
        .withTotalRecords(0)
    );
  }

  @Override
  public Future<Void> deleteAllValues(CustomField field, String tenantId) {
    return succeededFuture();
  }

}
