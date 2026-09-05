package org.carecode.lims.libraries;

/**
 * Represents a result record for laboratory information systems.
 *
 * @author buddh
 */
public class ResultsRecord {

    private int frameNumber;
    private String testCode;
    private double resultValue;
    private String resultValueString;
    
    private double minimumValue;
    private double maximumValue;
    private String flag;
    private String sampleType;
    private String resultUnits;
    private String resultDateTime;
    private String instrumentName;
    private String sampleId;
    private String status;
    private String comments;

    // Constructor
    public ResultsRecord(int frameNumber, String testCode, double resultValue, String resultUnits,
            String resultDateTime, String instrumentName, String sampleId) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValue = resultValue;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;  // Initialize the sample ID
    }

    public ResultsRecord(int frameNumber, String testCode, double resultValue, double minimumValue, double maximumValue, String flag, String sampleType, String resultUnits, String resultDateTime, String instrumentName, String sampleId) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValue = resultValue;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.flag = flag;
        this.sampleType = sampleType;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;  // Initialize the sample ID
    }

    public ResultsRecord(int frameNumber, String testCode, double resultValue, double minimumValue, double maximumValue, String flag, String sampleType, String resultUnits, String resultDateTime, String instrumentName, String sampleId, String status, String comments) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValue = resultValue;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.flag = flag;
        this.sampleType = sampleType;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;
        this.status = status;
        this.comments = comments;
    }

    // Constructor
    public ResultsRecord(int frameNumber, String testCode, String resultValueString, String resultUnits,
            String resultDateTime, String instrumentName, String sampleId) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValueString = resultValueString;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;  // Initialize the sample ID
    }

    public ResultsRecord(int frameNumber, String testCode, String resultValueString, double minimumValue, double maximumValue, String flag, String sampleType, String resultUnits, String resultDateTime, String instrumentName, String sampleId) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValueString = resultValueString;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.flag = flag;
        this.sampleType = sampleType;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;  // Initialize the sample ID
    }

    public ResultsRecord(int frameNumber, String testCode, String resultValueString, double minimumValue, double maximumValue, String flag, String sampleType, String resultUnits, String resultDateTime, String instrumentName, String sampleId, String status, String comments) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValueString = resultValueString;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.flag = flag;
        this.sampleType = sampleType;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;
        this.status = status;
        this.comments = comments;
    }
    
     // Constructor
    public ResultsRecord( String testCode, String resultValueString, String resultUnits,
            String resultDateTime, String instrumentName, String sampleId) {
        this.testCode = testCode;
        this.resultValueString = resultValueString;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;  // Initialize the sample ID
    }

    public ResultsRecord(String testCode, String resultValueString, double minimumValue, double maximumValue, String flag, String sampleType, String resultUnits, String resultDateTime, String instrumentName, String sampleId) {
        this.testCode = testCode;
        this.resultValueString = resultValueString;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.flag = flag;
        this.sampleType = sampleType;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;  // Initialize the sample ID
    }

    public ResultsRecord(String testCode, String resultValueString, double minimumValue, double maximumValue, String flag, String sampleType, String resultUnits, String resultDateTime, String instrumentName, String sampleId, String status, String comments) {
        this.testCode = testCode;
        this.resultValueString = resultValueString;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.flag = flag;
        this.sampleType = sampleType;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
        this.sampleId = sampleId;
        this.status = status;
        this.comments = comments;
    }
    
    // Getters and Setters
    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public double getResultValue() {
        return resultValue;
    }

    public void setResultValue(double resultValue) {
        this.resultValue = resultValue;
    }

    public String getResultUnits() {
        return resultUnits;
    }

    public void setResultUnits(String resultUnits) {
        this.resultUnits = resultUnits;
    }

    public String getResultDateTime() {
        return resultDateTime;
    }

    public void setResultDateTime(String resultDateTime) {
        this.resultDateTime = resultDateTime;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public double getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(double minimumValue) {
        this.minimumValue = minimumValue;
    }

    public double getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(double maximumValue) {
        this.maximumValue = maximumValue;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getResultValueString() {
        return resultValueString;
    }

    public void setResultValueString(String resultValueString) {
        this.resultValueString = resultValueString;
    }

 
    
    
}
