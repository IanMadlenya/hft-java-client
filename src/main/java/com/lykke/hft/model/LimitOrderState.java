/*
 * HighFrequencyTrading API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.lykke.hft.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * LimitOrderState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-06T23:34:32.567+02:00")
public class LimitOrderState {
  @JsonProperty("Id")
  private UUID id = null;

  @JsonProperty("ClientId")
  private String clientId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    INORDERBOOK("InOrderBook"),
    
    PROCESSING("Processing"),
    
    MATCHED("Matched"),
    
    NOTENOUGHFUNDS("NotEnoughFunds"),
    
    NOLIQUIDITY("NoLiquidity"),
    
    UNKNOWNASSET("UnknownAsset"),
    
    CANCELLED("Cancelled"),
    
    LEADTONEGATIVESPREAD("LeadToNegativeSpread");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("AssetPairId")
  private String assetPairId = null;

  @JsonProperty("Volume")
  private Double volume = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("RemainingVolume")
  private Double remainingVolume = null;

  @JsonProperty("LastMatchTime")
  private DateTime lastMatchTime = null;

  @JsonProperty("CreatedAt")
  private DateTime createdAt = null;

  @JsonProperty("Registered")
  private DateTime registered = null;

  public LimitOrderState id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public LimitOrderState clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public LimitOrderState status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LimitOrderState assetPairId(String assetPairId) {
    this.assetPairId = assetPairId;
    return this;
  }

   /**
   * Get assetPairId
   * @return assetPairId
  **/
  @ApiModelProperty(value = "")
  public String getAssetPairId() {
    return assetPairId;
  }

  public void setAssetPairId(String assetPairId) {
    this.assetPairId = assetPairId;
  }

  public LimitOrderState volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public LimitOrderState price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public LimitOrderState remainingVolume(Double remainingVolume) {
    this.remainingVolume = remainingVolume;
    return this;
  }

   /**
   * Get remainingVolume
   * @return remainingVolume
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getRemainingVolume() {
    return remainingVolume;
  }

  public void setRemainingVolume(Double remainingVolume) {
    this.remainingVolume = remainingVolume;
  }

  public LimitOrderState lastMatchTime(DateTime lastMatchTime) {
    this.lastMatchTime = lastMatchTime;
    return this;
  }

   /**
   * Get lastMatchTime
   * @return lastMatchTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastMatchTime() {
    return lastMatchTime;
  }

  public void setLastMatchTime(DateTime lastMatchTime) {
    this.lastMatchTime = lastMatchTime;
  }

  public LimitOrderState createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LimitOrderState registered(DateTime registered) {
    this.registered = registered;
    return this;
  }

   /**
   * Get registered
   * @return registered
  **/
  @ApiModelProperty(required = true, value = "")
  public DateTime getRegistered() {
    return registered;
  }

  public void setRegistered(DateTime registered) {
    this.registered = registered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitOrderState limitOrderState = (LimitOrderState) o;
    return Objects.equals(this.id, limitOrderState.id) &&
        Objects.equals(this.clientId, limitOrderState.clientId) &&
        Objects.equals(this.status, limitOrderState.status) &&
        Objects.equals(this.assetPairId, limitOrderState.assetPairId) &&
        Objects.equals(this.volume, limitOrderState.volume) &&
        Objects.equals(this.price, limitOrderState.price) &&
        Objects.equals(this.remainingVolume, limitOrderState.remainingVolume) &&
        Objects.equals(this.lastMatchTime, limitOrderState.lastMatchTime) &&
        Objects.equals(this.createdAt, limitOrderState.createdAt) &&
        Objects.equals(this.registered, limitOrderState.registered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, status, assetPairId, volume, price, remainingVolume, lastMatchTime, createdAt, registered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitOrderState {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assetPairId: ").append(toIndentedString(assetPairId)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    remainingVolume: ").append(toIndentedString(remainingVolume)).append("\n");
    sb.append("    lastMatchTime: ").append(toIndentedString(lastMatchTime)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
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

