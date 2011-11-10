package eu.codebits.wetranslate.client.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import eu.codebits.wetranslate.client.BrowserFactory;
import eu.codebits.wetranslate.client.view.home.header.HeaderView;

public class HeaderActivity extends WeTranslateActivity<Place> implements HeaderView.Presenter {

  public HeaderActivity(Place place, BrowserFactory browserFactory) {
    super(place, browserFactory);
  }

  public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
    HeaderView headerView = getBrowserFactory().getHeaderView();
    headerView.setPresenter(this);
    headerView.prepareView();
    containerWidget.setWidget(headerView.asWidget());
  }

  public void onSearchAction() {

  }
  
  public void onSettingsAction() {

  }

  public void onLogOutAction() {
    
  }
}
