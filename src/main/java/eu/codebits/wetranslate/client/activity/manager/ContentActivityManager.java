package eu.codebits.wetranslate.client.activity.manager;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import eu.codebits.wetranslate.client.BrowserFactory;

public class ContentActivityManager extends ActivityManager {

  public ContentActivityManager(BrowserFactory browserFactory) {
    super(browserFactory.getContentActivityMapper(), browserFactory.getEventBus());
    setDisplay(browserFactory.getHomeView().getContentContainer());
  }

  @Override
  public void onPlaceChange(PlaceChangeEvent event) {
    Place newPlace = event.getNewPlace();
    //TODO: Filter the places to the respective mapper
    super.onPlaceChange(event);
  }

}
