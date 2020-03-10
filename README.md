# Getting started


# Introduction

WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy.

We provide following data through our API:

  * Real-time weather

  * 10 day weather forecast

  * Astronomy

  * Time zone

  * Location data

  * Search or Autocomplete API

  * NEW: Historical weather

# Getting Started

You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!

If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).

# Authentication

API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.

Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .

  ##  key parameter
  key=YOUR_API_KEY


## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

* Browse to locate the folder containing the source code. Select the location of the WeatherAPI gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

## How to Use

The following section explains how to use the WeatherAPI library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':WeatherAPILib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':WeatherAPILib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Weather%20API&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > WeatherAPILib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| key | TODO: add a description |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String key = "key";

com.weatherapi.api.Configuration.initialize(appContext);
WeatherAPIClient client = new WeatherAPIClient(key);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIsController](#ap_is_controller)

## <a name="ap_is_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.weatherapi.api.controllers.APIsController") APIsController

### Get singleton instance

The singleton instance of the ``` APIsController ``` class can be accessed from the API Client.

```java
APIsController aPIs = client.getAPIs();
```

### <a name="get_realtime_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getRealtimeWeatherAsync") getRealtimeWeatherAsync

> Current weather or realtime weather API method allows a user to get up to date current weather information in json and xml. The data is returned as a Current Object.Current object contains current or realtime weather information for a given city.


```java
void getRealtimeWeatherAsync(
        final String q,
        final String lang,
        final APICallBack<CurrentJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| lang |  ``` Optional ```  | Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. |


#### Example Usage

```java
String q = "q";
String lang = "lang";
// Invoking the API call with sample inputs
aPIs.getRealtimeWeatherAsync(q, lang, new APICallBack<CurrentJsonResponse>() {
    public void onSuccess(HttpContext context, CurrentJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_forecast_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getForecastWeatherAsync") getForecastWeatherAsync

> Forecast weather API method returns upto next 10 day weather forecast and weather alert as json. The data is returned as a Forecast Object.<br />Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city.


```java
void getForecastWeatherAsync(
        final String q,
        final int days,
        final LocalDate dt,
        final Integer unixdt,
        final Integer hour,
        final String lang,
        final APICallBack<ForecastJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| days |  ``` Required ```  | Number of days of weather forecast. Value ranges from 1 to 10 |
| dt |  ``` Optional ```  | Date should be between today and next 10 day in yyyy-MM-dd format |
| unixdt |  ``` Optional ```  | Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be between today and next 10 day in Unix format |
| hour |  ``` Optional ```  | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6 |
| lang |  ``` Optional ```  | Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. |


#### Example Usage

```java
String q = "q";
int days = 139;
LocalDate dt = new Date();
Integer unixdt = 139;
Integer hour = 139;
String lang = "lang";
// Invoking the API call with sample inputs
aPIs.getForecastWeatherAsync(q, days, dt, unixdt, hour, lang, new APICallBack<ForecastJsonResponse>() {
    public void onSuccess(HttpContext context, ForecastJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_history_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getHistoryWeatherAsync") getHistoryWeatherAsync

> History weather API method returns historical weather for a date on or after 1st Jan, 2015 as json. The data is returned as a Forecast Object.


```java
void getHistoryWeatherAsync(
        final String q,
        final LocalDate dt,
        final Integer unixdt,
        final LocalDate endDt,
        final Integer unixendDt,
        final Integer hour,
        final String lang,
        final APICallBack<HistoryJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| dt |  ``` Required ```  | Date on or after 1st Jan, 2015 in yyyy-MM-dd format |
| unixdt |  ``` Optional ```  | Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be on or after 1st Jan, 2015 in Unix format |
| endDt |  ``` Optional ```  | Date on or after 1st Jan, 2015 in yyyy-MM-dd format'end_dt' should be greater than 'dt' parameter and difference should not be more than 30 days between the two dates. |
| unixendDt |  ``` Optional ```  | Date on or after 1st Jan, 2015 in Unix Timestamp format<br />unixend_dt has same restriction as 'end_dt' parameter. Please either pass 'end_dt' or 'unixend_dt' and not both in same request. e.g.: unixend_dt=1490227200 |
| hour |  ``` Optional ```  | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6 |
| lang |  ``` Optional ```  | Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. |


#### Example Usage

```java
String q = "q";
LocalDate dt = new Date();
Integer unixdt = 139;
LocalDate endDt = new Date();
Integer unixendDt = 139;
Integer hour = 139;
String lang = "lang";
// Invoking the API call with sample inputs
aPIs.getHistoryWeatherAsync(q, dt, unixdt, endDt, unixendDt, hour, lang, new APICallBack<HistoryJsonResponse>() {
    public void onSuccess(HttpContext context, HistoryJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="search_autocomplete_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.searchAutocompleteWeatherAsync") searchAutocompleteWeatherAsync

> WeatherAPI.com Search or Autocomplete API returns matching cities and towns as an array of Location object.


```java
void searchAutocompleteWeatherAsync(
        final String q,
        final APICallBack<List<SearchJsonResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
aPIs.searchAutocompleteWeatherAsync(q, new APICallBack<List<SearchJsonResponse>>() {
    public void onSuccess(HttpContext context, List<SearchJsonResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_ip_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getIpLookupAsync") getIpLookupAsync

> IP Lookup API method allows a user to get up to date information for an IP address.


```java
void getIpLookupAsync(
        final String q,
        final APICallBack<IpJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass IP address. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
aPIs.getIpLookupAsync(q, new APICallBack<IpJsonResponse>() {
    public void onSuccess(HttpContext context, IpJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_time_zone_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getTimeZoneAsync") getTimeZoneAsync

> Return Location Object


```java
void getTimeZoneAsync(
        final String q,
        final APICallBack<TimezoneJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
aPIs.getTimeZoneAsync(q, new APICallBack<TimezoneJsonResponse>() {
    public void onSuccess(HttpContext context, TimezoneJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_astronomy_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getAstronomyAsync") getAstronomyAsync

> Return Location and Astronomy Object


```java
void getAstronomyAsync(
        final String q,
        final LocalDate dt,
        final APICallBack<AstronomyJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| dt |  ``` Required ```  | Date on or after 1st Jan, 2015 in yyyy-MM-dd format |


#### Example Usage

```java
String q = "q";
LocalDate dt = new Date();
// Invoking the API call with sample inputs
aPIs.getAstronomyAsync(q, dt, new APICallBack<AstronomyJsonResponse>() {
    public void onSuccess(HttpContext context, AstronomyJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



[Back to List of Controllers](#list_of_controllers)



