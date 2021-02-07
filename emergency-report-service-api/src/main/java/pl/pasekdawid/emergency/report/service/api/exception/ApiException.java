package pl.pasekdawid.emergency.report.service.api.exception;

public interface ApiException {

    String getCustomizedMessage();
    String getLocalizedMessage();
    StackTraceElement[] getStackTrace();

}
