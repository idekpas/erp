package pl.pasekdawid.def.service.api.exception;

public interface ApiException {

    String getCustomizedMessage();
    String getLocalizedMessage();
    StackTraceElement[] getStackTrace();

}
