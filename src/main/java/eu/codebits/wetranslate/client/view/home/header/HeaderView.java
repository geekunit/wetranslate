package eu.codebits.wetranslate.client.view.home.header;

import com.google.gwt.place.shared.Place;
import eu.codebits.wetranslate.client.view.WeTranslateView;

public interface HeaderView extends WeTranslateView {

  interface Presenter extends WeTranslatePresenter {
    void onSearchAction();
    void onSettingsAction();
    void onLogOutAction();
  }

  void setPresenter(Presenter presenter);

  void setApplicationName(String applicationName);
  
  void setSettingsActionText(String settingsActionText);
  void setLogOutActionText(String logOutActionText);
  void setSearchPlaceholderText(String searchPlaceholderText);

}
