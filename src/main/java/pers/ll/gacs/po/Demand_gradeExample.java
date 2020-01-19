package pers.ll.gacs.po;

import java.util.ArrayList;
import java.util.List;

public class Demand_gradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Demand_gradeExample() {
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

        public Criteria andDemandGradeIdIsNull() {
            addCriterion("demand_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdIsNotNull() {
            addCriterion("demand_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdEqualTo(String value) {
            addCriterion("demand_grade_id =", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdNotEqualTo(String value) {
            addCriterion("demand_grade_id <>", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdGreaterThan(String value) {
            addCriterion("demand_grade_id >", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("demand_grade_id >=", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdLessThan(String value) {
            addCriterion("demand_grade_id <", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdLessThanOrEqualTo(String value) {
            addCriterion("demand_grade_id <=", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdLike(String value) {
            addCriterion("demand_grade_id like", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdNotLike(String value) {
            addCriterion("demand_grade_id not like", value, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdIn(List<String> values) {
            addCriterion("demand_grade_id in", values, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdNotIn(List<String> values) {
            addCriterion("demand_grade_id not in", values, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdBetween(String value1, String value2) {
            addCriterion("demand_grade_id between", value1, value2, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIdNotBetween(String value1, String value2) {
            addCriterion("demand_grade_id not between", value1, value2, "demandGradeId");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIsNull() {
            addCriterion("demand_grade is null");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIsNotNull() {
            addCriterion("demand_grade is not null");
            return (Criteria) this;
        }

        public Criteria andDemandGradeEqualTo(Double value) {
            addCriterion("demand_grade =", value, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeNotEqualTo(Double value) {
            addCriterion("demand_grade <>", value, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeGreaterThan(Double value) {
            addCriterion("demand_grade >", value, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("demand_grade >=", value, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeLessThan(Double value) {
            addCriterion("demand_grade <", value, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeLessThanOrEqualTo(Double value) {
            addCriterion("demand_grade <=", value, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeIn(List<Double> values) {
            addCriterion("demand_grade in", values, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeNotIn(List<Double> values) {
            addCriterion("demand_grade not in", values, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeBetween(Double value1, Double value2) {
            addCriterion("demand_grade between", value1, value2, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandGradeNotBetween(Double value1, Double value2) {
            addCriterion("demand_grade not between", value1, value2, "demandGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeIsNull() {
            addCriterion("demand_total_grade is null");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeIsNotNull() {
            addCriterion("demand_total_grade is not null");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeEqualTo(Double value) {
            addCriterion("demand_total_grade =", value, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeNotEqualTo(Double value) {
            addCriterion("demand_total_grade <>", value, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeGreaterThan(Double value) {
            addCriterion("demand_total_grade >", value, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("demand_total_grade >=", value, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeLessThan(Double value) {
            addCriterion("demand_total_grade <", value, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeLessThanOrEqualTo(Double value) {
            addCriterion("demand_total_grade <=", value, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeIn(List<Double> values) {
            addCriterion("demand_total_grade in", values, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeNotIn(List<Double> values) {
            addCriterion("demand_total_grade not in", values, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeBetween(Double value1, Double value2) {
            addCriterion("demand_total_grade between", value1, value2, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandTotalGradeNotBetween(Double value1, Double value2) {
            addCriterion("demand_total_grade not between", value1, value2, "demandTotalGrade");
            return (Criteria) this;
        }

        public Criteria andDemandId2IsNull() {
            addCriterion("demand_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andDemandId2IsNotNull() {
            addCriterion("demand_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDemandId2EqualTo(String value) {
            addCriterion("demand_id_2 =", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2NotEqualTo(String value) {
            addCriterion("demand_id_2 <>", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2GreaterThan(String value) {
            addCriterion("demand_id_2 >", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2GreaterThanOrEqualTo(String value) {
            addCriterion("demand_id_2 >=", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2LessThan(String value) {
            addCriterion("demand_id_2 <", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2LessThanOrEqualTo(String value) {
            addCriterion("demand_id_2 <=", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2Like(String value) {
            addCriterion("demand_id_2 like", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2NotLike(String value) {
            addCriterion("demand_id_2 not like", value, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2In(List<String> values) {
            addCriterion("demand_id_2 in", values, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2NotIn(List<String> values) {
            addCriterion("demand_id_2 not in", values, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2Between(String value1, String value2) {
            addCriterion("demand_id_2 between", value1, value2, "demandId2");
            return (Criteria) this;
        }

        public Criteria andDemandId2NotBetween(String value1, String value2) {
            addCriterion("demand_id_2 not between", value1, value2, "demandId2");
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