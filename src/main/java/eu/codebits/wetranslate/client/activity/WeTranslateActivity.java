package eu.codebits.wetranslate.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.place.shared.Place;
import com.google.gwt.storage.client.Storage;
import eu.codebits.wetranslate.client.BrowserFactory;
import eu.codebits.wetranslate.client.Messages;
import eu.codebits.wetranslate.client.WeTranslate;

public abstract class WeTranslateActivity<P extends Place> extends AbstractActivity {

  private final P place;
  private final BrowserFactory browserFactory;

  public WeTranslateActivity(P place, BrowserFactory browserFactory) {
    this.place = place;
    this.browserFactory = browserFactory;
  }

  public P getPlace() {
    return place;
  }

  public BrowserFactory getBrowserFactory() {
    return browserFactory;
  }

  public final void goTo(Place place) {
    browserFactory.getPlaceController().goTo(place);
  }

  public void handleException(Throwable throwable) {
    Messages messages = browserFactory.getMessages();
    try {
      throw throwable;
    } catch (Throwable e) {
      WeTranslate.showErrorMessage(messages.anUnknownErrorHasOccurred());
    }
  }

}