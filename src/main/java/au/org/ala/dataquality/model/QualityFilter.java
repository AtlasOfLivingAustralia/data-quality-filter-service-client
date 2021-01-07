/*
 * Data Quality Services API
 * RESTful and RPC API for the Data Quality Filters service
 *
 * The version of the OpenAPI document: 1.2.0-SNAPSHOT
 * Contact: support@ala.org.au
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.org.ala.dataquality.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * QualityFilter
 */

public class QualityFilter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "displayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Long displayOrder;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_QUALITY_CATEGORY = "qualityCategory";
  @SerializedName(SERIALIZED_NAME_QUALITY_CATEGORY)
  private QualityCategory qualityCategory;

  public static final String SERIALIZED_NAME_QUALITY_CATEGORY_ID = "qualityCategoryId";
  @SerializedName(SERIALIZED_NAME_QUALITY_CATEGORY_ID)
  private Object qualityCategoryId;


  public QualityFilter id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QualityFilter enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public QualityFilter description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QualityFilter filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public QualityFilter displayOrder(Long displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
  }


  public QualityFilter dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public QualityFilter lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public QualityFilter qualityCategory(QualityCategory qualityCategory) {
    
    this.qualityCategory = qualityCategory;
    return this;
  }

   /**
   * Get qualityCategory
   * @return qualityCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QualityCategory getQualityCategory() {
    return qualityCategory;
  }


  public void setQualityCategory(QualityCategory qualityCategory) {
    this.qualityCategory = qualityCategory;
  }


  public QualityFilter qualityCategoryId(Object qualityCategoryId) {
    
    this.qualityCategoryId = qualityCategoryId;
    return this;
  }

   /**
   * Get qualityCategoryId
   * @return qualityCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getQualityCategoryId() {
    return qualityCategoryId;
  }


  public void setQualityCategoryId(Object qualityCategoryId) {
    this.qualityCategoryId = qualityCategoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityFilter qualityFilter = (QualityFilter) o;
    return Objects.equals(this.id, qualityFilter.id) &&
        Objects.equals(this.enabled, qualityFilter.enabled) &&
        Objects.equals(this.description, qualityFilter.description) &&
        Objects.equals(this.filter, qualityFilter.filter) &&
        Objects.equals(this.displayOrder, qualityFilter.displayOrder) &&
        Objects.equals(this.dateCreated, qualityFilter.dateCreated) &&
        Objects.equals(this.lastUpdated, qualityFilter.lastUpdated) &&
        Objects.equals(this.qualityCategory, qualityFilter.qualityCategory) &&
        Objects.equals(this.qualityCategoryId, qualityFilter.qualityCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, description, filter, displayOrder, dateCreated, lastUpdated, qualityCategory, qualityCategoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityFilter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    qualityCategory: ").append(toIndentedString(qualityCategory)).append("\n");
    sb.append("    qualityCategoryId: ").append(toIndentedString(qualityCategoryId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

