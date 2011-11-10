package eu.codebits.wetranslate.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import eu.codebits.wetranslate.client.BrowserFactory;

public interface WeTranslateView extends IsWidget {

  interface WeTranslatePresenter {
    void goTo(Place place);
    BrowserFactory getBrowserFactory();
  }

  public void prepareView();

}
