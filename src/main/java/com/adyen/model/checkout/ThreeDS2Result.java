/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * ThreeDS2Result
 */

public class ThreeDS2Result {
  public static final String SERIALIZED_NAME_AUTHENTICATION_VALUE = "authenticationValue";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_VALUE)
  private String authenticationValue;

  public static final String SERIALIZED_NAME_CAVV_ALGORITHM = "cavvAlgorithm";
  @SerializedName(SERIALIZED_NAME_CAVV_ALGORITHM)
  private String cavvAlgorithm;

  /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   */
  @JsonAdapter(ChallengeCancelEnum.Adapter.class)
  public enum ChallengeCancelEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07");

    private String value;

    ChallengeCancelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChallengeCancelEnum fromValue(String value) {
      for (ChallengeCancelEnum b : ChallengeCancelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChallengeCancelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChallengeCancelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChallengeCancelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChallengeCancelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHALLENGE_CANCEL = "challengeCancel";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_CANCEL)
  private ChallengeCancelEnum challengeCancel;

  /**
   * Specifies a preference for receiving a challenge from the issuer. Allowed values: * &#x60;noPreference&#x60; * &#x60;requestNoChallenge&#x60; * &#x60;requestChallenge&#x60; * &#x60;requestChallengeAsMandate&#x60; 
   */
  @JsonAdapter(ChallengeIndicatorEnum.Adapter.class)
  public enum ChallengeIndicatorEnum {
    NOPREFERENCE("noPreference"),
    
    REQUESTNOCHALLENGE("requestNoChallenge"),
    
    REQUESTCHALLENGE("requestChallenge"),
    
    REQUESTCHALLENGEASMANDATE("requestChallengeAsMandate");

    private String value;

    ChallengeIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChallengeIndicatorEnum fromValue(String value) {
      for (ChallengeIndicatorEnum b : ChallengeIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChallengeIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChallengeIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChallengeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChallengeIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHALLENGE_INDICATOR = "challengeIndicator";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_INDICATOR)
  private ChallengeIndicatorEnum challengeIndicator;

  public static final String SERIALIZED_NAME_DS_TRANS_I_D = "dsTransID";
  @SerializedName(SERIALIZED_NAME_DS_TRANS_I_D)
  private String dsTransID;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  /**
   * Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * &#x60;lowValue&#x60; * &#x60;secureCorporate&#x60; * &#x60;trustedBeneficiary&#x60; * &#x60;transactionRiskAnalysis&#x60; 
   */
  @JsonAdapter(ExemptionIndicatorEnum.Adapter.class)
  public enum ExemptionIndicatorEnum {
    LOWVALUE("lowValue"),
    
    SECURECORPORATE("secureCorporate"),
    
    TRUSTEDBENEFICIARY("trustedBeneficiary"),
    
    TRANSACTIONRISKANALYSIS("transactionRiskAnalysis");

    private String value;

    ExemptionIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExemptionIndicatorEnum fromValue(String value) {
      for (ExemptionIndicatorEnum b : ExemptionIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExemptionIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExemptionIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExemptionIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExemptionIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXEMPTION_INDICATOR = "exemptionIndicator";
  @SerializedName(SERIALIZED_NAME_EXEMPTION_INDICATOR)
  private ExemptionIndicatorEnum exemptionIndicator;

  public static final String SERIALIZED_NAME_MESSAGE_VERSION = "messageVersion";
  @SerializedName(SERIALIZED_NAME_MESSAGE_VERSION)
  private String messageVersion;

  public static final String SERIALIZED_NAME_RISK_SCORE = "riskScore";
  @SerializedName(SERIALIZED_NAME_RISK_SCORE)
  private String riskScore;

  public static final String SERIALIZED_NAME_THREE_D_S_SERVER_TRANS_I_D = "threeDSServerTransID";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_SERVER_TRANS_I_D)
  private String threeDSServerTransID;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TRANS_STATUS = "transStatus";
  @SerializedName(SERIALIZED_NAME_TRANS_STATUS)
  private String transStatus;

  public static final String SERIALIZED_NAME_TRANS_STATUS_REASON = "transStatusReason";
  @SerializedName(SERIALIZED_NAME_TRANS_STATUS_REASON)
  private String transStatusReason;

  public static final String SERIALIZED_NAME_WHITE_LIST_STATUS = "whiteListStatus";
  @SerializedName(SERIALIZED_NAME_WHITE_LIST_STATUS)
  private String whiteListStatus;

  public ThreeDS2Result() { 
  }

  public ThreeDS2Result authenticationValue(String authenticationValue) {
    
    this.authenticationValue = authenticationValue;
    return this;
  }

   /**
   * The &#x60;authenticationValue&#x60; value as defined in the 3D Secure 2 specification.
   * @return authenticationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `authenticationValue` value as defined in the 3D Secure 2 specification.")

  public String getAuthenticationValue() {
    return authenticationValue;
  }


  public void setAuthenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
  }


  public ThreeDS2Result cavvAlgorithm(String cavvAlgorithm) {
    
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * The algorithm used by the ACS to calculate the authentication value, only for Cartes Bancaires integrations.
   * @return cavvAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The algorithm used by the ACS to calculate the authentication value, only for Cartes Bancaires integrations.")

  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }


  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }


  public ThreeDS2Result challengeCancel(ChallengeCancelEnum challengeCancel) {
    
    this.challengeCancel = challengeCancel;
    return this;
  }

   /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   * @return challengeCancel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).")

  public ChallengeCancelEnum getChallengeCancel() {
    return challengeCancel;
  }


  public void setChallengeCancel(ChallengeCancelEnum challengeCancel) {
    this.challengeCancel = challengeCancel;
  }


  public ThreeDS2Result challengeIndicator(ChallengeIndicatorEnum challengeIndicator) {
    
    this.challengeIndicator = challengeIndicator;
    return this;
  }

   /**
   * Specifies a preference for receiving a challenge from the issuer. Allowed values: * &#x60;noPreference&#x60; * &#x60;requestNoChallenge&#x60; * &#x60;requestChallenge&#x60; * &#x60;requestChallengeAsMandate&#x60; 
   * @return challengeIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a preference for receiving a challenge from the issuer. Allowed values: * `noPreference` * `requestNoChallenge` * `requestChallenge` * `requestChallengeAsMandate` ")

  public ChallengeIndicatorEnum getChallengeIndicator() {
    return challengeIndicator;
  }


  public void setChallengeIndicator(ChallengeIndicatorEnum challengeIndicator) {
    this.challengeIndicator = challengeIndicator;
  }


  public ThreeDS2Result dsTransID(String dsTransID) {
    
    this.dsTransID = dsTransID;
    return this;
  }

   /**
   * The &#x60;dsTransID&#x60; value as defined in the 3D Secure 2 specification.
   * @return dsTransID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `dsTransID` value as defined in the 3D Secure 2 specification.")

  public String getDsTransID() {
    return dsTransID;
  }


  public void setDsTransID(String dsTransID) {
    this.dsTransID = dsTransID;
  }


  public ThreeDS2Result eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * The &#x60;eci&#x60; value as defined in the 3D Secure 2 specification.
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `eci` value as defined in the 3D Secure 2 specification.")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public ThreeDS2Result exemptionIndicator(ExemptionIndicatorEnum exemptionIndicator) {
    
    this.exemptionIndicator = exemptionIndicator;
    return this;
  }

   /**
   * Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * &#x60;lowValue&#x60; * &#x60;secureCorporate&#x60; * &#x60;trustedBeneficiary&#x60; * &#x60;transactionRiskAnalysis&#x60; 
   * @return exemptionIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * `lowValue` * `secureCorporate` * `trustedBeneficiary` * `transactionRiskAnalysis` ")

  public ExemptionIndicatorEnum getExemptionIndicator() {
    return exemptionIndicator;
  }


  public void setExemptionIndicator(ExemptionIndicatorEnum exemptionIndicator) {
    this.exemptionIndicator = exemptionIndicator;
  }


  public ThreeDS2Result messageVersion(String messageVersion) {
    
    this.messageVersion = messageVersion;
    return this;
  }

   /**
   * The &#x60;messageVersion&#x60; value as defined in the 3D Secure 2 specification.
   * @return messageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `messageVersion` value as defined in the 3D Secure 2 specification.")

  public String getMessageVersion() {
    return messageVersion;
  }


  public void setMessageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
  }


  public ThreeDS2Result riskScore(String riskScore) {
    
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Risk score calculated by Cartes Bancaires Directory Server (DS).
   * @return riskScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk score calculated by Cartes Bancaires Directory Server (DS).")

  public String getRiskScore() {
    return riskScore;
  }


  public void setRiskScore(String riskScore) {
    this.riskScore = riskScore;
  }


  public ThreeDS2Result threeDSServerTransID(String threeDSServerTransID) {
    
    this.threeDSServerTransID = threeDSServerTransID;
    return this;
  }

   /**
   * The &#x60;threeDSServerTransID&#x60; value as defined in the 3D Secure 2 specification.
   * @return threeDSServerTransID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `threeDSServerTransID` value as defined in the 3D Secure 2 specification.")

  public String getThreeDSServerTransID() {
    return threeDSServerTransID;
  }


  public void setThreeDSServerTransID(String threeDSServerTransID) {
    this.threeDSServerTransID = threeDSServerTransID;
  }


  public ThreeDS2Result timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The &#x60;timestamp&#x60; value of the 3D Secure 2 authentication.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `timestamp` value of the 3D Secure 2 authentication.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ThreeDS2Result transStatus(String transStatus) {
    
    this.transStatus = transStatus;
    return this;
  }

   /**
   * The &#x60;transStatus&#x60; value as defined in the 3D Secure 2 specification.
   * @return transStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `transStatus` value as defined in the 3D Secure 2 specification.")

  public String getTransStatus() {
    return transStatus;
  }


  public void setTransStatus(String transStatus) {
    this.transStatus = transStatus;
  }


  public ThreeDS2Result transStatusReason(String transStatusReason) {
    
    this.transStatusReason = transStatusReason;
    return this;
  }

   /**
   * Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).
   * @return transStatusReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provides information on why the `transStatus` field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).")

  public String getTransStatusReason() {
    return transStatusReason;
  }


  public void setTransStatusReason(String transStatusReason) {
    this.transStatusReason = transStatusReason;
  }


  public ThreeDS2Result whiteListStatus(String whiteListStatus) {
    
    this.whiteListStatus = whiteListStatus;
    return this;
  }

   /**
   * The &#x60;whiteListStatus&#x60; value as defined in the 3D Secure 2 specification.
   * @return whiteListStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `whiteListStatus` value as defined in the 3D Secure 2 specification.")

  public String getWhiteListStatus() {
    return whiteListStatus;
  }


  public void setWhiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS2Result threeDS2Result = (ThreeDS2Result) o;
    return Objects.equals(this.authenticationValue, threeDS2Result.authenticationValue) &&
        Objects.equals(this.cavvAlgorithm, threeDS2Result.cavvAlgorithm) &&
        Objects.equals(this.challengeCancel, threeDS2Result.challengeCancel) &&
        Objects.equals(this.challengeIndicator, threeDS2Result.challengeIndicator) &&
        Objects.equals(this.dsTransID, threeDS2Result.dsTransID) &&
        Objects.equals(this.eci, threeDS2Result.eci) &&
        Objects.equals(this.exemptionIndicator, threeDS2Result.exemptionIndicator) &&
        Objects.equals(this.messageVersion, threeDS2Result.messageVersion) &&
        Objects.equals(this.riskScore, threeDS2Result.riskScore) &&
        Objects.equals(this.threeDSServerTransID, threeDS2Result.threeDSServerTransID) &&
        Objects.equals(this.timestamp, threeDS2Result.timestamp) &&
        Objects.equals(this.transStatus, threeDS2Result.transStatus) &&
        Objects.equals(this.transStatusReason, threeDS2Result.transStatusReason) &&
        Objects.equals(this.whiteListStatus, threeDS2Result.whiteListStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationValue, cavvAlgorithm, challengeCancel, challengeIndicator, dsTransID, eci, exemptionIndicator, messageVersion, riskScore, threeDSServerTransID, timestamp, transStatus, transStatusReason, whiteListStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS2Result {\n");
    sb.append("    authenticationValue: ").append(toIndentedString(authenticationValue)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    challengeCancel: ").append(toIndentedString(challengeCancel)).append("\n");
    sb.append("    challengeIndicator: ").append(toIndentedString(challengeIndicator)).append("\n");
    sb.append("    dsTransID: ").append(toIndentedString(dsTransID)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    exemptionIndicator: ").append(toIndentedString(exemptionIndicator)).append("\n");
    sb.append("    messageVersion: ").append(toIndentedString(messageVersion)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    threeDSServerTransID: ").append(toIndentedString(threeDSServerTransID)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transStatus: ").append(toIndentedString(transStatus)).append("\n");
    sb.append("    transStatusReason: ").append(toIndentedString(transStatusReason)).append("\n");
    sb.append("    whiteListStatus: ").append(toIndentedString(whiteListStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("authenticationValue");
    openapiFields.add("cavvAlgorithm");
    openapiFields.add("challengeCancel");
    openapiFields.add("challengeIndicator");
    openapiFields.add("dsTransID");
    openapiFields.add("eci");
    openapiFields.add("exemptionIndicator");
    openapiFields.add("messageVersion");
    openapiFields.add("riskScore");
    openapiFields.add("threeDSServerTransID");
    openapiFields.add("timestamp");
    openapiFields.add("transStatus");
    openapiFields.add("transStatusReason");
    openapiFields.add("whiteListStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDS2Result
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDS2Result.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDS2Result is not found in the empty JSON string", ThreeDS2Result.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDS2Result.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDS2Result` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field authenticationValue
      if (jsonObj.get("authenticationValue") != null && !jsonObj.get("authenticationValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authenticationValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authenticationValue").toString()));
      }
      // validate the optional field cavvAlgorithm
      if (jsonObj.get("cavvAlgorithm") != null && !jsonObj.get("cavvAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavvAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavvAlgorithm").toString()));
      }
      // ensure the field challengeCancel can be parsed to an enum value
      if (jsonObj.get("challengeCancel") != null) {
        if(!jsonObj.get("challengeCancel").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `challengeCancel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challengeCancel").toString()));
        }
        ChallengeCancelEnum.fromValue(jsonObj.get("challengeCancel").getAsString());
      }
      // ensure the field challengeIndicator can be parsed to an enum value
      if (jsonObj.get("challengeIndicator") != null) {
        if(!jsonObj.get("challengeIndicator").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `challengeIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challengeIndicator").toString()));
        }
        ChallengeIndicatorEnum.fromValue(jsonObj.get("challengeIndicator").getAsString());
      }
      // validate the optional field dsTransID
      if (jsonObj.get("dsTransID") != null && !jsonObj.get("dsTransID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsTransID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsTransID").toString()));
      }
      // validate the optional field eci
      if (jsonObj.get("eci") != null && !jsonObj.get("eci").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eci` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eci").toString()));
      }
      // ensure the field exemptionIndicator can be parsed to an enum value
      if (jsonObj.get("exemptionIndicator") != null) {
        if(!jsonObj.get("exemptionIndicator").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `exemptionIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptionIndicator").toString()));
        }
        ExemptionIndicatorEnum.fromValue(jsonObj.get("exemptionIndicator").getAsString());
      }
      // validate the optional field messageVersion
      if (jsonObj.get("messageVersion") != null && !jsonObj.get("messageVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageVersion").toString()));
      }
      // validate the optional field riskScore
      if (jsonObj.get("riskScore") != null && !jsonObj.get("riskScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riskScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riskScore").toString()));
      }
      // validate the optional field threeDSServerTransID
      if (jsonObj.get("threeDSServerTransID") != null && !jsonObj.get("threeDSServerTransID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSServerTransID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSServerTransID").toString()));
      }
      // validate the optional field timestamp
      if (jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      // validate the optional field transStatus
      if (jsonObj.get("transStatus") != null && !jsonObj.get("transStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transStatus").toString()));
      }
      // validate the optional field transStatusReason
      if (jsonObj.get("transStatusReason") != null && !jsonObj.get("transStatusReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transStatusReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transStatusReason").toString()));
      }
      // validate the optional field whiteListStatus
      if (jsonObj.get("whiteListStatus") != null && !jsonObj.get("whiteListStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `whiteListStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("whiteListStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDS2Result.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDS2Result' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDS2Result> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDS2Result.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDS2Result>() {
           @Override
           public void write(JsonWriter out, ThreeDS2Result value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDS2Result read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDS2Result given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDS2Result
  * @throws IOException if the JSON string is invalid with respect to ThreeDS2Result
  */
  public static ThreeDS2Result fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDS2Result.class);
  }

 /**
  * Convert an instance of ThreeDS2Result to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
