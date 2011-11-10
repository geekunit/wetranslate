package eu.codebits.wetranslate.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class DataSwitchWithoutCacheImpl implements DataSwitch {

  private WeTranslateServiceAsync realService = (WeTranslateServiceAsync)GWT.create(WeTranslateService.class);
  
  
  
}
