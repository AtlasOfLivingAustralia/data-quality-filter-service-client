/*
 * Data Quality Services API
 * RESTful and RPC API for the Data Quality Filters service
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support@ala.org.au
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.org.ala.dataquality.model;

import java.util.Objects;
import java.util.Arrays;
import au.org.ala.dataquality.model.QualityFilter;
import au.org.ala.dataquality.model.QualityProfile;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * QualityCategory
 */

public class QualityCategory {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "displayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Long displayOrder;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_QUALITY_PROFILE = "qualityProfile";
  @SerializedName(SERIALIZED_NAME_QUALITY_PROFILE)
  private QualityProfile qualityProfile;

  public static final String SERIALIZED_NAME_QUALITY_FILTERS = "qualityFilters";
  @SerializedName(SERIALIZED_NAME_QUALITY_FILTERS)
  private List<QualityFilter> qualityFilters = null;

  public static final String SERIALIZED_NAME_QUALITY_PROFILE_ID = "qualityProfileId";
  @SerializedName(SERIALIZED_NAME_QUALITY_PROFILE_ID)
  private Object qualityProfileId;


  public QualityCategory id(Long id) {
    
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


  public QualityCategory enabled(Boolean enabled) {
    
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


  public QualityCategory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QualityCategory label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public QualityCategory description(String description) {
    
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


  public QualityCategory displayOrder(Long displayOrder) {
    
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


  public QualityCategory dateCreated(OffsetDateTime dateCreated) {
    
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


  public QualityCategory lastUpdated(OffsetDateTime lastUpdated) {
    
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


  public QualityCategory qualityProfile(QualityProfile qualityProfile) {
    
    this.qualityProfile = qualityProfile;
    return this;
  }

   /**
   * Get qualityProfile
   * @return qualityProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QualityProfile getQualityProfile() {
    return qualityProfile;
  }


  public void setQualityProfile(QualityProfile qualityProfile) {
    this.qualityProfile = qualityProfile;
  }


  public QualityCategory qualityFilters(List<QualityFilter> qualityFilters) {
    
    this.qualityFilters = qualityFilters;
    return this;
  }

  public QualityCategory addQualityFiltersItem(QualityFilter qualityFiltersItem) {
    if (this.qualityFilters == null) {
      this.qualityFilters = new ArrayList<>();
    }
    this.qualityFilters.add(qualityFiltersItem);
    return this;
  }

   /**
   * Get qualityFilters
   * @return qualityFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QualityFilter> getQualityFilters() {
    return qualityFilters;
  }


  public void setQualityFilters(List<QualityFilter> qualityFilters) {
    this.qualityFilters = qualityFilters;
  }


  public QualityCategory qualityProfileId(Object qualityProfileId) {
    
    this.qualityProfileId = qualityProfileId;
    return this;
  }

   /**
   * Get qualityProfileId
   * @return qualityProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getQualityProfileId() {
    return qualityProfileId;
  }


  public void setQualityProfileId(Object qualityProfileId) {
    this.qualityProfileId = qualityProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityCategory qualityCategory = (QualityCategory) o;
    return Objects.equals(this.id, qualityCategory.id) &&
        Objects.equals(this.enabled, qualityCategory.enabled) &&
        Objects.equals(this.name, qualityCategory.name) &&
        Objects.equals(this.label, qualityCategory.label) &&
        Objects.equals(this.description, qualityCategory.description) &&
        Objects.equals(this.displayOrder, qualityCategory.displayOrder) &&
        Objects.equals(this.dateCreated, qualityCategory.dateCreated) &&
        Objects.equals(this.lastUpdated, qualityCategory.lastUpdated) &&
        Objects.equals(this.qualityProfile, qualityCategory.qualityProfile) &&
        Objects.equals(this.qualityFilters, qualityCategory.qualityFilters) &&
        Objects.equals(this.qualityProfileId, qualityCategory.qualityProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, name, label, description, displayOrder, dateCreated, lastUpdated, qualityProfile, qualityFilters, qualityProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityCategory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    qualityProfile: ").append(toIndentedString(qualityProfile)).append("\n");
    sb.append("    qualityFilters: ").append(toIndentedString(qualityFilters)).append("\n");
    sb.append("    qualityProfileId: ").append(toIndentedString(qualityProfileId)).append("\n");
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

