package eu.codebits.wetranslate.client.view.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

public class HomeViewImpl extends Composite implements HomeView {

  interface HomeViewImplUiBinder extends UiBinder<Widget, HomeViewImpl> {}
  private static HomeViewImplUiBinder uiBinder = GWT.create(HomeViewImplUiBinder.class);

  private Presenter presenter;

  @UiField
  AcceptsOneWidget headerContainer;

  @UiField
  AcceptsOneWidget sidebarContainer;

  @UiField
  AcceptsOneWidget contentContainer;

  public HomeViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void prepareView() {}

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }

  public AcceptsOneWidget getHeaderContainer() {
   return headerContainer;
  }

  public AcceptsOneWidget getSidebarContainer() {
   return sidebarContainer;
  }

  public AcceptsOneWidget getContentContainer() {
    return contentContainer;
  }
}
