package eu.codebits.wetranslate.client.activity.manager;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.web.bindery.event.shared.EventBus;
import eu.codebits.wetranslate.client.BrowserFactory;
import eu.codebits.wetranslate.client.place.HomePlace;

public class SidebarActivityManager extends ActivityManager {

  public SidebarActivityManager(BrowserFactory browserFactory) {
    super(browserFactory.getSidebarActivityMapper(), browserFactory.getEventBus());
    setDisplay(browserFactory.getHomeView().getSidebarContainer());
  }

  @Override
  public void onPlaceChange(PlaceChangeEvent event) {
    Place newPlace = event.getNewPlace();
    if(newPlace instanceof HomePlace) {
      super.onPlaceChange(event);
    }
  }
}
