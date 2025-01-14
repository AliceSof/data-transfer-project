package org.datatransferproject.spi.transfer.types;

public enum FailureReasons {
  CREDS_TIMEOUT("CREDS_TIMEOUT"),
  DESTINATION_FULL("DESTINATION_FULL"),
  INVALID_TOKEN("INVALID_TOKEN"),
  PERMISSION_DENIED("PERMISSION_DENIED"),
  SESSION_INVALIDATED("SESSION_INVALIDATED"),
  UNCONFIRMED_USER("UNCONFIRMED_USER"),
  UPLOAD_ERROR("UPLOAD_ERROR"),
  USER_CHECKPOINTED("USER_CHECKPOINTED"),
  DESTINATION_NOT_FOUND("DESTINATION_NOT_FOUND");
  private final String string;

  FailureReasons(String string) {
    this.string = string;
  }

  @Override
  public String toString() {
    return string;
  }
}
