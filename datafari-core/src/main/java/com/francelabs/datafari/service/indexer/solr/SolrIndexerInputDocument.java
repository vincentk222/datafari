package com.francelabs.datafari.service.indexer.solr;

import org.apache.solr.common.SolrInputDocument;

import com.francelabs.datafari.service.indexer.IndexerInputDocument;

/**
 * Input document that is meant to be pushed to the indexer server
 * 
 * @author francelabs
 *
 */
public class SolrIndexerInputDocument implements IndexerInputDocument {

  private final SolrInputDocument inputDocument;

  public SolrIndexerInputDocument() {
    inputDocument = new SolrInputDocument();
  }

  @Override
  public void addField(final String fieldName, final Object value) {
    inputDocument.addField(fieldName, value);
  }

  protected SolrInputDocument getSolrInputDocument() {
    return inputDocument;
  }

  @Override
  public Object getFieldValue(final String fieldName) {
    return inputDocument.getFieldValue(fieldName);
  }

}
