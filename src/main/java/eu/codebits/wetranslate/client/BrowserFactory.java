package eu.codebits.wetranslate.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import eu.codebits.wetranslate.client.activity.mapper.ContentActivityMapper;
import eu.codebits.wetranslate.client.activity.mapper.HeaderActivityMapper;
import eu.codebits.wetranslate.client.activity.mapper.WeTranslateActivityMapper;
import eu.codebits.wetranslate.client.activity.mapper.SidebarActivityMapper;
import eu.codebits.wetranslate.client.service.DataSwitch;
import eu.codebits.wetranslate.client.view.home.HomeView;
import eu.codebits.wetranslate.client.view.home.header.HeaderView;

public interface BrowserFactory {

  PlaceHistoryHandler getPlaceHistoryHandler();
  Widget getAppContainer();
  PlaceController getPlaceController();
  Messages getMessages();

  HomeView getHomeView();

  HeaderView getHeaderView();

  DataSwitch getDataSwitch();

  WeTranslateActivityMapper getWeTranslateActivityMapper();
  HeaderActivityMapper getHeaderActivityMapper();
  ContentActivityMapper getContentActivityMapper();
  SidebarActivityMapper getSidebarActivityMapper();

  EventBus getEventBus();

  AcceptsOneWidget getWeTranslateContainer();

}
