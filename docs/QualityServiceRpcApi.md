# QualityServiceRpcApi

All URIs are relative to *https://data-quality-service.ala.org.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activeProfile**](QualityServiceRpcApi.md#activeProfile) | **GET** api/v1/quality/activeProfile | Retrieve the data profile for a given profile&#39;s short name. If the profile doesn&#39;t exist or the short name is omitted then get the default profile of the specified user.                      If no profile found or no userId specified, return the default public profile
[**findAllEnabledCategories**](QualityServiceRpcApi.md#findAllEnabledCategories) | **GET** api/v1/quality/findAllEnabledCategories | Find All Enabled Categories
[**getAllInverseCategoryFiltersForProfile**](QualityServiceRpcApi.md#getAllInverseCategoryFiltersForProfile) | **GET** api/v1/quality/getAllInverseCategoryFiltersForProfile | Get all the inverse filter strings for a given data profile
[**getDefaultProfile**](QualityServiceRpcApi.md#getDefaultProfile) | **GET** api/v1/quality/getDefaultProfile | Retrieve the default data profile. If the userId is provided, return the default profile for the user. Otherwise return the default public profile
[**getEnabledFiltersByLabel**](QualityServiceRpcApi.md#getEnabledFiltersByLabel) | **GET** api/v1/quality/getEnabledFiltersByLabel | Get enabled filters, grouped by category label for a given profile name
[**getEnabledQualityFilters**](QualityServiceRpcApi.md#getEnabledQualityFilters) | **GET** api/v1/quality/getEnabledQualityFilters | Get Enabled Quality Filters
[**getGroupedEnabledFilters**](QualityServiceRpcApi.md#getGroupedEnabledFilters) | **GET** api/v1/quality/getGroupedEnabledFilters | Get Grouped Enabled Filters
[**getInverseCategoryFilter**](QualityServiceRpcApi.md#getInverseCategoryFilter) | **GET** api/v1/quality/getInverseCategoryFilter | Get the full inverse filter string for a given quality category
[**getJoinedQualityFilter**](QualityServiceRpcApi.md#getJoinedQualityFilter) | **GET** api/v1/quality/getJoinedQualityFilter | Get the full filter string for a given data profile



## activeProfile

> QualityProfile activeProfile(profileName, userId)

Retrieve the data profile for a given profile&#39;s short name. If the profile doesn&#39;t exist or the short name is omitted then get the default profile of the specified user.                      If no profile found or no userId specified, return the default public profile

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | The profile short name
        String userId = "userId_example"; // String | the userId used to get active profile in case profile name is not provided
        try {
            QualityProfile result = apiInstance.activeProfile(profileName, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#activeProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileName** | **String**| The profile short name | [optional]
 **userId** | **String**| the userId used to get active profile in case profile name is not provided | [optional]

### Return type

[**QualityProfile**](QualityProfile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## findAllEnabledCategories

> List&lt;QualityCategory&gt; findAllEnabledCategories(profileName)

Find All Enabled Categories

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | Profile name
        try {
            List<QualityCategory> result = apiInstance.findAllEnabledCategories(profileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#findAllEnabledCategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileName** | **String**| Profile name | [optional]

### Return type

[**List&lt;QualityCategory&gt;**](QualityCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAllInverseCategoryFiltersForProfile

> Map&lt;String, String&gt; getAllInverseCategoryFiltersForProfile(qualityProfileId)

Get all the inverse filter strings for a given data profile

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        Integer qualityProfileId = 56; // Integer | Quality Profile Id
        try {
            Map<String, String> result = apiInstance.getAllInverseCategoryFiltersForProfile(qualityProfileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getAllInverseCategoryFiltersForProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qualityProfileId** | **Integer**| Quality Profile Id | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getDefaultProfile

> QualityProfile getDefaultProfile(userId)

Retrieve the default data profile. If the userId is provided, return the default profile for the user. Otherwise return the default public profile

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String userId = "userId_example"; // String | The userId used to retrieve the default profile
        try {
            QualityProfile result = apiInstance.getDefaultProfile(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getDefaultProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId used to retrieve the default profile | [optional]

### Return type

[**QualityProfile**](QualityProfile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEnabledFiltersByLabel

> Map&lt;String, String&gt; getEnabledFiltersByLabel(profileName)

Get enabled filters, grouped by category label for a given profile name

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | Profile name
        try {
            Map<String, String> result = apiInstance.getEnabledFiltersByLabel(profileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getEnabledFiltersByLabel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileName** | **String**| Profile name | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEnabledQualityFilters

> List&lt;String&gt; getEnabledQualityFilters(profileName)

Get Enabled Quality Filters

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | Profile name
        try {
            List<String> result = apiInstance.getEnabledQualityFilters(profileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getEnabledQualityFilters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileName** | **String**| Profile name | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGroupedEnabledFilters

> Map&lt;String, List&lt;QualityFilter&gt;&gt; getGroupedEnabledFilters(profileName)

Get Grouped Enabled Filters

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | Profile name
        try {
            Map<String, List<QualityFilter>> result = apiInstance.getGroupedEnabledFilters(profileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getGroupedEnabledFilters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileName** | **String**| Profile name | [optional]

### Return type

[**Map&lt;String, List&lt;QualityFilter&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getInverseCategoryFilter

> String getInverseCategoryFilter(qualityCategoryId)

Get the full inverse filter string for a given quality category

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        Integer qualityCategoryId = 56; // Integer | Quality Category Id
        try {
            String result = apiInstance.getInverseCategoryFilter(qualityCategoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getInverseCategoryFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qualityCategoryId** | **Integer**| Quality Category Id | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getJoinedQualityFilter

> String getJoinedQualityFilter(profileName)

Get the full filter string for a given data profile

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.QualityServiceRpcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | Profile name
        try {
            String result = apiInstance.getJoinedQualityFilter(profileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QualityServiceRpcApi#getJoinedQualityFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileName** | **String**| Profile name | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

