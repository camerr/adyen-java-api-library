/*
 * Adyen Wherever People Pay
 * This is the Adyen API Playground where you can test our API's. <br /><br />You can find out more about Adyen      at <a href=\"http://www.adyen.com\">http://www.adyen.com</a>.  <!--For this sample, you can use the api key \"special-key\" to test the authorization filters.-->
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.adyen.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ModificationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-14T08:41:23.938Z")
public class ModificationRequest {
  @SerializedName("reference")
  private String reference = null;

  @SerializedName("modificationAmount")
  private Amount modificationAmount = null;

  @SerializedName("authorisationCode")
  private String authorisationCode = null;

  @SerializedName("originalReference")
  private String originalReference = null;

  @SerializedName("merchantAccount")
  private String merchantAccount = null;

  @SerializedName("additionalData")
  private String additionalData = null;

  public ModificationRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * the reference assigned to this modification
   * @return reference
  **/
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public ModificationRequest modificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
    return this;
  }

   /**
   * the amount to capture/refund. Required for \"capture\"/\"refund\", not allowed for \"cancel\"
   * @return modificationAmount
  **/
  public Amount getModificationAmount() {
    return modificationAmount;
  }

  public void setModificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
  }

  public ModificationRequest authorisationCode(String authorisationCode) {
    this.authorisationCode = authorisationCode;
    return this;
  }

   /**
   * the authorisation code of the payment (only required for the \"authoriseReferral\" method)
   * @return authorisationCode
  **/
  public String getAuthorisationCode() {
    return authorisationCode;
  }

  public void setAuthorisationCode(String authorisationCode) {
    this.authorisationCode = authorisationCode;
  }

  public ModificationRequest originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

   /**
   * the pspreference of the payment to modify
   * @return originalReference
  **/
  public String getOriginalReference() {
    return originalReference;
  }

  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }

  public ModificationRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * the merchant account which will be used to process the payment
   * @return merchantAccount
  **/
  public String getMerchantAccount() {
    return merchantAccount;
  }

  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  public ModificationRequest additionalData(String additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * a map of name/value pairs for passing in additional / industry-specific data
   * @return additionalData
  **/
  public String getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationRequest modificationRequest = (ModificationRequest) o;
    return Objects.equals(this.reference, modificationRequest.reference) &&
        Objects.equals(this.modificationAmount, modificationRequest.modificationAmount) &&
        Objects.equals(this.authorisationCode, modificationRequest.authorisationCode) &&
        Objects.equals(this.originalReference, modificationRequest.originalReference) &&
        Objects.equals(this.merchantAccount, modificationRequest.merchantAccount) &&
        Objects.equals(this.additionalData, modificationRequest.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, modificationAmount, authorisationCode, originalReference, merchantAccount, additionalData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationRequest {\n");

    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    modificationAmount: ").append(toIndentedString(modificationAmount)).append("\n");
    sb.append("    authorisationCode: ").append(toIndentedString(authorisationCode)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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
  
}

