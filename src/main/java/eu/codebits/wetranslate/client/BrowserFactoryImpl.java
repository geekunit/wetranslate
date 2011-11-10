package eu.codebits.wetranslate.client;

import com.google.gwt.core.client.GWT;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import eu.codebits.wetranslate.client.activity.manager.ContentActivityManager;
import eu.codebits.wetranslate.client.activity.manager.HeaderActivityManager;
import eu.codebits.wetranslate.client.activity.manager.WeTranslateActivityManager;
import eu.codebits.wetranslate.client.activity.manager.SidebarActivityManager;
import eu.codebits.wetranslate.client.activity.mapper.ContentActivityMapper;
import eu.codebits.wetranslate.client.activity.mapper.HeaderActivityMapper;
import eu.codebits.wetranslate.client.activity.mapper.WeTranslateActivityMapper;
import eu.codebits.wetranslate.client.activity.mapper.SidebarActivityMapper;
import eu.codebits.wetranslate.client.place.HomePlace;
import eu.codebits.wetranslate.client.place.WeTranslatePlaceHistoryMapper;
import eu.codebits.wetranslate.client.service.DataSwitch;
import eu.codebits.wetranslate.client.view.home.HomeView;
import eu.codebits.wetranslate.client.view.home.HomeViewImpl;
import eu.codebits.wetranslate.client.view.home.header.HeaderView;
import eu.codebits.wetranslate.client.view.home.header.HeaderViewImpl;

public class BrowserFactoryImpl implements BrowserFactory {

  private static final EventBus EVENT_BUS = new SimpleEventBus();
  private static final PlaceController PLACE_CONTROLLER = new PlaceController(EVENT_BUS);

  private static WeTranslateActivityMapper WE_TRANSLATE_ACTIVITY_MAPPER;
  private static WeTranslateActivityManager WE_TRANSLATE_ACTIVITY_MANAGER;

  private static HeaderActivityMapper HEADER_ACTIVITY_MAPPER;
  private static HeaderActivityManager HEADER_ACTIVITY_MANAGER;

  private static ContentActivityMapper CONTENT_ACTIVITY_MAPPER;
  private static ContentActivityManager CONTENT_ACTIVITY_MANAGER;

  private static SidebarActivityMapper SIDEBAR_ACTIVITY_MAPPER;
  private static SidebarActivityManager SIDEBAR_ACTIVITY_MANAGER;

  private static final WeTranslatePlaceHistoryMapper WE_TRANSLATE_PLACE_HISTORY_MAPPER = GWT.create(WeTranslatePlaceHistoryMapper.class);
  private static final PlaceHistoryHandler PLACE_HISTORY_HANDLER = new PlaceHistoryHandler(WE_TRANSLATE_PLACE_HISTORY_MAPPER);

  private static final Messages MESSAGES = GWT.create(Messages.class);
  private static final SimpleLayoutPanel WE_TRANSLATE_CONTAINER = new SimpleLayoutPanel();

  private static final DataSwitch DATA_SWITCH = GWT.create(DataSwitch.class);

  private static final HeaderView HEADER_VIEW = new HeaderViewImpl();
  private static final HomeView HOME_VIEW = new HomeViewImpl();

  private static BrowserFactory INSTANCE = new BrowserFactoryImpl();

  private BrowserFactoryImpl() {

    WE_TRANSLATE_ACTIVITY_MAPPER = new WeTranslateActivityMapper(this);
    HEADER_ACTIVITY_MAPPER = new HeaderActivityMapper(this);
    CONTENT_ACTIVITY_MAPPER = new ContentActivityMapper(this);
    SIDEBAR_ACTIVITY_MAPPER = new SidebarActivityMapper(this);

    WE_TRANSLATE_ACTIVITY_MANAGER = new WeTranslateActivityManager(this);
    HEADER_ACTIVITY_MANAGER = new HeaderActivityManager(this);
    CONTENT_ACTIVITY_MANAGER = new ContentActivityManager(this);
    SIDEBAR_ACTIVITY_MANAGER = new SidebarActivityManager(this);

    PLACE_HISTORY_HANDLER.register(PLACE_CONTROLLER, EVENT_BUS, new HomePlace());
  }

  public static BrowserFactory getInstance() {
    if(INSTANCE==null) {
      INSTANCE = new BrowserFactoryImpl();
    }
    return INSTANCE;
  }

  public PlaceController getPlaceController() {
    return PLACE_CONTROLLER;
  }

  public PlaceHistoryHandler getPlaceHistoryHandler() {
    return PLACE_HISTORY_HANDLER;
  }

  public Messages getMessages() {
    return MESSAGES;
  }

  public Widget getAppContainer() {
    return WE_TRANSLATE_CONTAINER;
  }

  public HomeView getHomeView() { return HOME_VIEW; }
  public HeaderView getHeaderView() { return HEADER_VIEW; }

  public DataSwitch getDataSwitch() {
    return DATA_SWITCH;
  }

  public WeTranslateActivityMapper getWeTranslateActivityMapper() {
    return WE_TRANSLATE_ACTIVITY_MAPPER;
  }

  public HeaderActivityMapper getHeaderActivityMapper() {
    return HEADER_ACTIVITY_MAPPER;
  }

  public ContentActivityMapper getContentActivityMapper() {
    return CONTENT_ACTIVITY_MAPPER;
  }

  public SidebarActivityMapper getSidebarActivityMapper() {
    return SIDEBAR_ACTIVITY_MAPPER;
  }

  public EventBus getEventBus() {
    return EVENT_BUS;
  }

  public AcceptsOneWidget getWeTranslateContainer() {
    return WE_TRANSLATE_CONTAINER;
  }
}
