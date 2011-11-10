package eu.codebits.wetranslate.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class WeTranslate implements EntryPoint {

  public void onModuleLoad() {
    BrowserFactory browserFactory = BrowserFactoryImpl.getInstance();
    RootLayoutPanel.get().add(browserFactory.getAppContainer());
    browserFactory.getPlaceHistoryHandler().handleCurrentHistory();
  }

  public static void showErrorMessage(String errorMsg) {
    Window.alert(errorMsg);
  }

  public static void showNotification(String notificationMsg) {
    Window.alert(notificationMsg);
  }

}
