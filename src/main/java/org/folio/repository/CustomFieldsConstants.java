package org.folio.repository;

public class CustomFieldsConstants {

  public static final String CUSTOM_FIELDS_TABLE = "custom_fields";
  public static final String JSONB_COLUMN = "jsonb";
  public static final String ID_COLUMN = "id";

  public static final String REF_ID_REGEX = "(%s_[1-9]{1,})";
  static final String SELECT_REF_IDS = "SELECT unnest(regexp_matches(" + JSONB_COLUMN + " ->> 'refId', ?)) as values FROM %s";
}
