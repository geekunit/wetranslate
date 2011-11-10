package eu.codebits.wetranslate.client.activity.manager;

import com.google.gwt.activity.shared.ActivityManager;
import eu.codebits.wetranslate.client.BrowserFactory;

public class WeTranslateActivityManager extends ActivityManager {

  public WeTranslateActivityManager(BrowserFactory browserFactory) {
    super(browserFactory.getWeTranslateActivityMapper(), browserFactory.getEventBus());
    setDisplay(browserFactory.getWeTranslateContainer());
  }

}
