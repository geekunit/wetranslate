package eu.codebits.wetranslate.server;

import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework;
import eu.codebits.wetranslate.server.domain.Processpedia;

public class Bootstrap {

  public static void init() {
    FenixFramework.initialize(new Config() {{
      domainModelPath = "/wetranslate.dml";
      dbAlias = "//localhost:3306/wetranslate";
      dbUsername = "root";
      dbPassword = "123";
      rootClass = WeTranslate.class;
    }});
  }
}
