package com.cx.teenhealth.bean;

public class TClass {
    private String id;

    private String className;

    private String teacherId;

    private String gradeId;

    private String classCodeId;

    private String schoolId;

    private String remarke;

    private Integer isend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public String getClassCodeId() {
        return classCodeId;
    }

    public void setClassCodeId(String classCodeId) {
        this.classCodeId = classCodeId == null ? null : classCodeId.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getRemarke() {
        return remarke;
    }

    public void setRemarke(String remarke) {
        this.remarke = remarke == null ? null : remarke.trim();
    }

    public Integer getIsend() {
        return isend;
    }

    public void setIsend(Integer isend) {
        this.isend = isend;
    }
}