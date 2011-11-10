package eu.codebits.wetranslate.client.view.home;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import eu.codebits.wetranslate.client.view.WeTranslateView;

public interface HomeView extends WeTranslateView {

  public interface Presenter extends WeTranslatePresenter {}

  void setPresenter(Presenter presenter);

  AcceptsOneWidget getHeaderContainer();
  AcceptsOneWidget getSidebarContainer();
  AcceptsOneWidget getContentContainer();

}
