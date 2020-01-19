package pers.ll.gacs.po;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNull() {
            addCriterion("course_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNotNull() {
            addCriterion("course_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditEqualTo(String value) {
            addCriterion("course_credit =", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotEqualTo(String value) {
            addCriterion("course_credit <>", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThan(String value) {
            addCriterion("course_credit >", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThanOrEqualTo(String value) {
            addCriterion("course_credit >=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThan(String value) {
            addCriterion("course_credit <", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThanOrEqualTo(String value) {
            addCriterion("course_credit <=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLike(String value) {
            addCriterion("course_credit like", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotLike(String value) {
            addCriterion("course_credit not like", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIn(List<String> values) {
            addCriterion("course_credit in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotIn(List<String> values) {
            addCriterion("course_credit not in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditBetween(String value1, String value2) {
            addCriterion("course_credit between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotBetween(String value1, String value2) {
            addCriterion("course_credit not between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseTermIsNull() {
            addCriterion("course_term is null");
            return (Criteria) this;
        }

        public Criteria andCourseTermIsNotNull() {
            addCriterion("course_term is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTermEqualTo(String value) {
            addCriterion("course_term =", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotEqualTo(String value) {
            addCriterion("course_term <>", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermGreaterThan(String value) {
            addCriterion("course_term >", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermGreaterThanOrEqualTo(String value) {
            addCriterion("course_term >=", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermLessThan(String value) {
            addCriterion("course_term <", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermLessThanOrEqualTo(String value) {
            addCriterion("course_term <=", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermLike(String value) {
            addCriterion("course_term like", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotLike(String value) {
            addCriterion("course_term not like", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermIn(List<String> values) {
            addCriterion("course_term in", values, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotIn(List<String> values) {
            addCriterion("course_term not in", values, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermBetween(String value1, String value2) {
            addCriterion("course_term between", value1, value2, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotBetween(String value1, String value2) {
            addCriterion("course_term not between", value1, value2, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseAverageIsNull() {
            addCriterion("course_average is null");
            return (Criteria) this;
        }

        public Criteria andCourseAverageIsNotNull() {
            addCriterion("course_average is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAverageEqualTo(Double value) {
            addCriterion("course_average =", value, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageNotEqualTo(Double value) {
            addCriterion("course_average <>", value, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageGreaterThan(Double value) {
            addCriterion("course_average >", value, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageGreaterThanOrEqualTo(Double value) {
            addCriterion("course_average >=", value, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageLessThan(Double value) {
            addCriterion("course_average <", value, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageLessThanOrEqualTo(Double value) {
            addCriterion("course_average <=", value, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageIn(List<Double> values) {
            addCriterion("course_average in", values, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageNotIn(List<Double> values) {
            addCriterion("course_average not in", values, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageBetween(Double value1, Double value2) {
            addCriterion("course_average between", value1, value2, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseAverageNotBetween(Double value1, Double value2) {
            addCriterion("course_average not between", value1, value2, "courseAverage");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeIsNull() {
            addCriterion("course_total_grade is null");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeIsNotNull() {
            addCriterion("course_total_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeEqualTo(String value) {
            addCriterion("course_total_grade =", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeNotEqualTo(String value) {
            addCriterion("course_total_grade <>", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeGreaterThan(String value) {
            addCriterion("course_total_grade >", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeGreaterThanOrEqualTo(String value) {
            addCriterion("course_total_grade >=", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeLessThan(String value) {
            addCriterion("course_total_grade <", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeLessThanOrEqualTo(String value) {
            addCriterion("course_total_grade <=", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeLike(String value) {
            addCriterion("course_total_grade like", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeNotLike(String value) {
            addCriterion("course_total_grade not like", value, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeIn(List<String> values) {
            addCriterion("course_total_grade in", values, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeNotIn(List<String> values) {
            addCriterion("course_total_grade not in", values, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeBetween(String value1, String value2) {
            addCriterion("course_total_grade between", value1, value2, "courseTotalGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTotalGradeNotBetween(String value1, String value2) {
            addCriterion("course_total_grade not between", value1, value2, "courseTotalGrade");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}