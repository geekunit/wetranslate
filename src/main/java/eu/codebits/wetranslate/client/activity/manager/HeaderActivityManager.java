package eu.codebits.wetranslate.client.activity.manager;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import eu.codebits.wetranslate.client.BrowserFactory;

public class HeaderActivityManager extends ActivityManager {

  public HeaderActivityManager(BrowserFactory browserFactory) {
    super(browserFactory.getHeaderActivityMapper(), browserFactory.getEventBus());
    setDisplay(browserFactory.getHomeView().getHeaderContainer());
  }

  @Override
  public void onPlaceChange(PlaceChangeEvent event) {
    Place newPlace = event.getNewPlace();
    //TODO: FILTER THE PLACES TO THE MAPPER
    super.onPlaceChange(event);
  }

}