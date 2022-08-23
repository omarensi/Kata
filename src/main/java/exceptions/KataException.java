package exceptions;

public class KataException extends RuntimeException {

  private int code;
  private String message;
  private String description;

  public KataException() {
  }

  public KataException(int code, String message, String description) {
    this.code = code;
    this.message = message;
    this.description = description;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "KataException{" +
        "code=" + code +
        ", message='" + message + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
