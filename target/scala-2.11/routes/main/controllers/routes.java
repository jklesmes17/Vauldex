
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/vauldex-dtr/conf/routes
// @DATE:Tue Mar 01 09:02:58 PHT 2016

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
