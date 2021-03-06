package cn.psychology.entity;


import javax.persistence.*;

@Entity
@Table(name="testresult")
public class Score {

    /*
     * ------------------------------------------------------------------------------------------------------------------
     * 成绩表，存储在Mysql中。
     * 分别有，id（主键），userid，examid，score，summary，conslusion,testType
     * ------------------------------------------------------------------------------------------------------------------
     * */
    @Id
    @GeneratedValue
    private Integer scoreId;
    // 用户ID
    private String userId;
    // 题ID
    private String examinationId;
    // 此次得分
    private String examinationScore;
    //时间戳
    private String testTime;
    //总结
    private String  summary;

    private String examinationConclusionId;

    private String testType;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(String examinationId) {
        this.examinationId = examinationId;
    }

    public String getExaminationScore() {
        return examinationScore;
    }

    public void setExaminationScore(String examinationScore) {
        this.examinationScore = examinationScore;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getExaminationConclusionId() {
        return examinationConclusionId;
    }

    public void setExaminationConclusionId(String examinationConclusionId) {
        this.examinationConclusionId = examinationConclusionId;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
