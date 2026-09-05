package org.carecode.lims.libraries;

/**
 *
 * @author Dr M H Buddhika Ariyaratne, Consultant in Health Informatics,
 * buddhika.ari@gmail.com
 *
 */
import java.util.ArrayList;
import java.util.List;

public class DataBundle {

    private PatientRecord patientRecord;
    private MiddlewareSettings middlewareSettings;
    private final List<ResultsRecord> resultsRecords;
    private final List<OrderRecord> orderRecords;
    private final List<QueryRecord> queryRecords;
    @Deprecated
    private AnalyzerDetails analyzerDetails;

    // Constructor
    public DataBundle() {
        this.resultsRecords = new ArrayList<>();
        this.orderRecords = new ArrayList<>();
        this.queryRecords = new ArrayList<>();
    }

    // Set and retrieve the single PatientRecord
    public void setPatientRecord(PatientRecord record) {
        this.patientRecord = record;
    }

    public PatientRecord getPatientRecord() {
        return patientRecord;
    }

    // Add and retrieve methods for ResultsRecord
    public void addResultsRecord(ResultsRecord record) {
        this.getResultsRecords().add(record);
    }

    public List<ResultsRecord> getResultsRecords() {
        return resultsRecords;
    }

    // Add and retrieve methods for OrderRecord
    public void addOrderRecord(OrderRecord record) {
        this.orderRecords.add(record);
    }

    public List<OrderRecord> getOrderRecords() {
        return orderRecords;
    }

    // Add and retrieve methods for QueryRecord
    public void addQueryRecord(QueryRecord record) {
        this.queryRecords.add(record);
    }

    public List<QueryRecord> getQueryRecords() {
        return queryRecords;
    }

    public AnalyzerDetails getAnalyzerDetails() {
        return analyzerDetails;
    }

    public void setAnalyzerDetails(AnalyzerDetails analyzerDetails) {
        this.analyzerDetails = analyzerDetails;
    }

    public MiddlewareSettings getMiddlewareSettings() {
        return middlewareSettings;
    }

    public void setMiddlewareSettings(MiddlewareSettings middlewareSettings) {
        this.middlewareSettings = middlewareSettings;
    }

}
