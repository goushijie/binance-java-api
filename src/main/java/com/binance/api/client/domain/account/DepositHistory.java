package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * History of account deposits.
 *
 * @see Deposit
 */
public class DepositHistory {

  @JsonProperty("depositList")
  private List<Deposit> depositList;

  private boolean success;

  public List<Deposit> getDepositList() {
    return depositList;
  }

  public void setDepositList(List<Deposit> depositList) {
    this.depositList = depositList;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("depositList", depositList)
        .append("success", success)
        .toString();
  }
}
