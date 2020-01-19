package pers.ll.gacs.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuRankIsNull() {
            addCriterion("stu_rank is null");
            return (Criteria) this;
        }

        public Criteria andStuRankIsNotNull() {
            addCriterion("stu_rank is not null");
            return (Criteria) this;
        }

        public Criteria andStuRankEqualTo(Integer value) {
            addCriterion("stu_rank =", value, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankNotEqualTo(Integer value) {
            addCriterion("stu_rank <>", value, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankGreaterThan(Integer value) {
            addCriterion("stu_rank >", value, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_rank >=", value, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankLessThan(Integer value) {
            addCriterion("stu_rank <", value, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankLessThanOrEqualTo(Integer value) {
            addCriterion("stu_rank <=", value, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankIn(List<Integer> values) {
            addCriterion("stu_rank in", values, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankNotIn(List<Integer> values) {
            addCriterion("stu_rank not in", values, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankBetween(Integer value1, Integer value2) {
            addCriterion("stu_rank between", value1, value2, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuRankNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_rank not between", value1, value2, "stuRank");
            return (Criteria) this;
        }

        public Criteria andStuLevelIsNull() {
            addCriterion("stu_level is null");
            return (Criteria) this;
        }

        public Criteria andStuLevelIsNotNull() {
            addCriterion("stu_level is not null");
            return (Criteria) this;
        }

        public Criteria andStuLevelEqualTo(String value) {
            addCriterion("stu_level =", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotEqualTo(String value) {
            addCriterion("stu_level <>", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelGreaterThan(String value) {
            addCriterion("stu_level >", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelGreaterThanOrEqualTo(String value) {
            addCriterion("stu_level >=", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelLessThan(String value) {
            addCriterion("stu_level <", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelLessThanOrEqualTo(String value) {
            addCriterion("stu_level <=", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelLike(String value) {
            addCriterion("stu_level like", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotLike(String value) {
            addCriterion("stu_level not like", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelIn(List<String> values) {
            addCriterion("stu_level in", values, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotIn(List<String> values) {
            addCriterion("stu_level not in", values, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelBetween(String value1, String value2) {
            addCriterion("stu_level between", value1, value2, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotBetween(String value1, String value2) {
            addCriterion("stu_level not between", value1, value2, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuMaleIsNull() {
            addCriterion("stu_male is null");
            return (Criteria) this;
        }

        public Criteria andStuMaleIsNotNull() {
            addCriterion("stu_male is not null");
            return (Criteria) this;
        }

        public Criteria andStuMaleEqualTo(String value) {
            addCriterion("stu_male =", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleNotEqualTo(String value) {
            addCriterion("stu_male <>", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleGreaterThan(String value) {
            addCriterion("stu_male >", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleGreaterThanOrEqualTo(String value) {
            addCriterion("stu_male >=", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleLessThan(String value) {
            addCriterion("stu_male <", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleLessThanOrEqualTo(String value) {
            addCriterion("stu_male <=", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleLike(String value) {
            addCriterion("stu_male like", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleNotLike(String value) {
            addCriterion("stu_male not like", value, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleIn(List<String> values) {
            addCriterion("stu_male in", values, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleNotIn(List<String> values) {
            addCriterion("stu_male not in", values, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleBetween(String value1, String value2) {
            addCriterion("stu_male between", value1, value2, "stuMale");
            return (Criteria) this;
        }

        public Criteria andStuMaleNotBetween(String value1, String value2) {
            addCriterion("stu_male not between", value1, value2, "stuMale");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
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