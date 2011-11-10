package eu.codebits.wetranslate.client.view.home.header;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.http.client.URL;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import eu.codebits.wetranslate.client.Messages;
import eu.codebits.wetranslate.client.place.SearchPlace;

public class HeaderViewImpl extends Composite implements HeaderView {

  interface HeaderViewImplUiBinder extends UiBinder<Widget, HeaderViewImpl> {}
  private static HeaderViewImplUiBinder uiBinder = GWT.create(HeaderViewImplUiBinder.class);

  private Presenter presenter;

  @UiField
  HasText applicationNameContainer;

  @UiField
  Button createProcessAction;

  @UiField
  Anchor settingsAction, logOutAction;

  @UiField TextBox searchTextContainer;

  public HeaderViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void prepareView() {
    Messages messages = presenter.getBrowserFactory().getMessages();
    setApplicationName(messages.applicationName());
    setSettingsActionText(messages.settings());
    setLogOutActionText(messages.logout());
    setSearchPlaceholderText(messages.search());
  }

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }

  public void setApplicationName(String applicationName) {
    applicationNameContainer.setText(applicationName);
  }
  
  @UiHandler("searchTextContainer")
  public void onSearchCriteriaDefinition(KeyDownEvent event) {
    if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
      if(!searchTextContainer.getText().equals("")) {
        presenter.onSearchAction();
      } else {
        searchTextContainer.setFocus(false);
      }
    }
  }

  public void setSettingsActionText(String settingsActionText) {
    settingsAction.setText(settingsActionText);
  }

  public void setLogOutActionText(String logOutActionText) {
    logOutAction.setText(logOutActionText);
  }

  public void setSearchPlaceholderText(String searchPlaceholderText) {
    searchTextContainer.getElement().setPropertyString("placeholder", searchPlaceholderText);
  }

  @UiHandler("settingsAction")
  public void onSettingsAction(ClickEvent event) {
    presenter.onSettingsAction();
  }

  @UiHandler("logOutAction")
  public void onLogOutAction(ClickEvent event) {
    presenter.onLogOutAction();
  }

}
