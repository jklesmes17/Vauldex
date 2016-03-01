
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fixerinit2/Projects/Vauldex/conf/routes
// @DATE:Tue Mar 01 10:01:46 PHT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMain Main = new controllers.ReverseMain(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMain Main = new controllers.javascript.ReverseMain(RoutesPrefix.byNamePrefix());
  }

}
