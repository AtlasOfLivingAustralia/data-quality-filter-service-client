# CategoriesApi

All URIs are relative to *https://devt.ala.org.au/dataquality-filter*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categories**](CategoriesApi.md#categories) | **GET** api/v1/profiles/{profileId}/categories | List all quality categories
[**categoriesId**](CategoriesApi.md#categoriesId) | **GET** api/v1/profiles/{profileId}/categories/{id} | List all quality profiles



## categories

> List&lt;QualityCategory&gt; categories(profileId, max)

List all quality categories

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String profileId = "profileId_example"; // String | The id for the quality profile or default for the default profile
        Integer max = 56; // Integer | Maximum results to return
        try {
            List<QualityCategory> result = apiInstance.categories(profileId, max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#categories");
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
 **profileId** | **String**| The id for the quality profile or default for the default profile |
 **max** | **Integer**| Maximum results to return | [optional]

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


## categoriesId

> List&lt;QualityProfile&gt; categoriesId(profileId, id, max)

List all quality profiles

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String profileId = "profileId_example"; // String | The id for the quality profile or default for the default profile
        Integer id = 56; // Integer | The id for the quality category
        Integer max = 56; // Integer | Maximum results to return
        try {
            List<QualityProfile> result = apiInstance.categoriesId(profileId, id, max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#categoriesId");
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
 **profileId** | **String**| The id for the quality profile or default for the default profile |
 **id** | **Integer**| The id for the quality category |
 **max** | **Integer**| Maximum results to return | [optional]

### Return type

[**List&lt;QualityProfile&gt;**](QualityProfile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

