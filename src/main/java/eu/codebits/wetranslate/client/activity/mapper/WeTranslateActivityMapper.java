package eu.codebits.wetranslate.client.activity.mapper;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import eu.codebits.wetranslate.client.BrowserFactory;
import eu.codebits.wetranslate.client.activity.HomeActivity;

public class WeTranslateActivityMapper implements ActivityMapper {

  private BrowserFactory browserFactory;

  public WeTranslateActivityMapper(BrowserFactory browserFactory) {
    this.browserFactory = browserFactory;
  }

  public Activity getActivity(Place place) {
    return new HomeActivity(place, browserFactory);
  }
}
