# QualityServiceRpcApi

All URIs are relative to *https://devt.ala.org.au/dataquality-filter*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activeProfile**](QualityServiceRpcApi.md#activeProfile) | **GET** api/v1/quality/activeProfile | Retrieve the filter qualityProfile for a given qualityProfile name
[**findAllEnabledCategories**](QualityServiceRpcApi.md#findAllEnabledCategories) | **GET** api/v1/quality/findAllEnabledCategories | Find All Enabled Categories
[**getEnabledFiltersByLabel**](QualityServiceRpcApi.md#getEnabledFiltersByLabel) | **GET** api/v1/quality/getEnabledFiltersByLabel | Get enabled filters, grouped by category label
[**getEnabledQualityFilters**](QualityServiceRpcApi.md#getEnabledQualityFilters) | **GET** api/v1/quality/getEnabledQualityFilters | Get Enabled Quality Filters
[**getGroupedEnabledFilters**](QualityServiceRpcApi.md#getGroupedEnabledFilters) | **GET** api/v1/quality/getGroupedEnabledFilters | Get Grouped Enabled Filters
[**getInverseCategoryFilter**](QualityServiceRpcApi.md#getInverseCategoryFilter) | **GET** api/v1/quality/getInverseCategoryFilter | Get the full inverse filter string for a given quality qualityProfile
[**getJoinedQualityFilter**](QualityServiceRpcApi.md#getJoinedQualityFilter) | **GET** api/v1/quality/getJoinedQualityFilter | Get the full filter string for a given quality qualityProfile



## activeProfile

> QualityProfile activeProfile(profileName)

Retrieve the filter qualityProfile for a given qualityProfile name

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

        QualityServiceRpcApi apiInstance = new QualityServiceRpcApi(defaultClient);
        String profileName = "profileName_example"; // String | Profile name
        try {
            QualityProfile result = apiInstance.activeProfile(profileName);
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
 **profileName** | **String**| Profile name | [optional]

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

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


## getEnabledFiltersByLabel

> Map&lt;String, String&gt; getEnabledFiltersByLabel(profileName)

Get enabled filters, grouped by category label

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

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

Get the full inverse filter string for a given quality qualityProfile

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

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

Get the full filter string for a given quality qualityProfile

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
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

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

