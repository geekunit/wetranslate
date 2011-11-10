package eu.codebits.wetranslate.client.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import eu.codebits.wetranslate.client.BrowserFactory;
import eu.codebits.wetranslate.client.view.home.HomeView;

public class HomeActivity extends WeTranslateActivity<Place> implements HomeView.Presenter {

  public HomeActivity(Place place, BrowserFactory browserFactory) {
    super(place, browserFactory);
  }

  public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
    HomeView homeView = getBrowserFactory().getHomeView();
    homeView.setPresenter(this);
    homeView.prepareView();
    containerWidget.setWidget(homeView.asWidget());
  }
}
