$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/iPhone.feature");
formatter.feature({
  "name": "iPhone",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search iPhone by Model and Add to Cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://www.bestbuy.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select country as United State",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_select_country_as_United_State()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select search Menu and Enter item as \"iPhone13\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_select_search_Menu_enter_item_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found\n  (Session info: chrome\u003d115.0.5790.170)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RRR94S3\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 115.0.5790.170, chrome: {chromedriverVersion: 115.0.5790.170 (cc0d30c2ca5..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:65523}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: df5ac55183282cba5ad07ca4a687e209\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.click(Unknown Source)\r\n\tat pageObjects.iPhonePage.ClickonSearch(iPhonePage.java:70)\r\n\tat stepDefinitions.Steps.click_on_search_button(Steps.java:51)\r\n\tat ✽.Click on search button(file:Features/iPhone.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Find an item with a description as Apple - Pre-Owned iPhone 13 Pro 5G 128GB (Unlocked) - Graphite model - A2483-GRY price - $879.99",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Add to Cart",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that a popup appears with the text The item you added to cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on cart page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_cart_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be found on Cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_be_found_on_Cart_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that iphone14 is not present in the cart items",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});