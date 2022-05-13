package hello.advanced.trace;

public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMS;
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeMS, String message) {
        this.traceId = traceId;
        this.startTimeMS = startTimeMS;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMS;
    }

    public String getMessage() {
        return message;
    }
}
