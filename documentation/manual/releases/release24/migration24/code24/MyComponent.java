/*
 * Copyright (C) 2009-2016 Typesafe Inc. <http://www.typesafe.com>
 */

//#components-decl
import javax.inject.Inject;
import play.inject.ApplicationLifecycle;
import play.libs.F;

public interface MyComponent {}

class MyComponentImpl implements MyComponent {
  @Inject
  public MyComponentImpl(ApplicationLifecycle lifecycle) {
    // previous contents of Plugin.onStart
    lifecycle.addStopHook( () -> {
      // previous contents of Plugin.onStop
      return F.Promise.pure(null);
    });
  }
}
//#components-decl